package WebWorkout.project;

import WebWorkout.project.controller.WorkoutController;
import WebWorkout.project.dao.*;
import WebWorkout.project.dao.impl.DaoFactoryMemoryImpl;
import WebWorkout.project.dao.impl.PlayerRepositoryMemoryImpl;
import WebWorkout.project.dao.impl.WorkoutRepositoryMemoryImpl;
import WebWorkout.project.exception.InvalidEntityDataException;
import WebWorkout.project.exception.NoneexistingEntityException;
import WebWorkout.project.model.MockWorkouts;
import WebWorkout.project.model.Player;
import WebWorkout.project.model.Workout;
import WebWorkout.project.service.PlayerService;
import WebWorkout.project.service.PlayerServiceImpl;
import WebWorkout.project.service.WorkoutService;
import WebWorkout.project.service.WorkoutServiceImpl;

public class Main {
    public static void main(String[] args) throws NoneexistingEntityException, InvalidEntityDataException {
        WorkoutRepository workoutRepository = new WorkoutRepositoryMemoryImpl();
        WorkoutService workoutService = new WorkoutServiceImpl(workoutRepository);
        for(Workout workout : MockWorkouts.MOCK_WORKOUTS){
            workoutService.addWorkout(workout);
        }
        WorkoutController controller = new WorkoutController(workoutService);
        controller.init();




        PlayerRepository playerRepository = new PlayerRepositoryMemoryImpl();
        PlayerService playerService = new PlayerServiceImpl(playerRepository);

        Player p1 = new Player(1L, "Bill", "Morison", "Hans", "Giligan321", "billG@gmail.com", "Snowboarding", 32, true);
        playerService.addPlayer(p1);
        p1.setAge(35);
        p1.setUsername("BJMson");
        System.out.println(p1);

//        Player p2 = new Player(2L, "Micheal", "James", 28);
//        p2.setAge(28);
//        p2.setUsername("JamesSmith");
//        System.out.println(p1);
//        System.out.println(p2);
//
//        Player p3 = new Player(3L, "Torstein", "Horgmo", 27);
//        p3.setAge(27);
//        p3.setUsername("Horseman");
//        System.out.println(p3);
//        System.out.println(p1.equals(p3));
//        System.out.println("p1.hash:" + p1.hashCode());
//        System.out.println("p3.hash:" + p3.hashCode());
//        System.out.println(p1 == p3);
//
//        Player p4 = new Player(4L, "Jaden", "Dreams", 31);
//        p3.setAge(31);
//        p3.setUsername("JD");
//        System.out.println(p4);

        workoutRepository.deleteById(1L);
        workoutRepository.deleteById(2L);
        workoutRepository.deleteById(3L);
        workoutRepository.deleteById(4L);

        for(Workout workout : workoutRepository.findAll()) {
            System.out.println(workout);
        }
        System.out.println();

        Workout firstWorkout = workoutRepository.findById(3L);
        System.out.println(firstWorkout);

        System.out.println(workoutRepository.findById(4L));

        System.out.println();
        firstWorkout.setTitle("Workout One");
        firstWorkout.setWorkoutRatings(200);
        workoutRepository.update(firstWorkout);
        System.out.println(workoutRepository.findById(3L));


//        // create the object
        Workout myWorkout = new Workout();
        myWorkout.dailyWorkout();

        //use the object
        System.out.println("Track run: 2x100m / Push-Ups after");

        }
    }
