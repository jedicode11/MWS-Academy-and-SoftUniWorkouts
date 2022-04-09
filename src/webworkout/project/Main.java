package webworkout.project;

import webworkout.project.controller.WorkoutController;
import webworkout.project.dao.*;
import webworkout.project.dao.impl.PlayerRepositoryMemoryImpl;
import webworkout.project.dao.impl.WorkoutRepositoryMemoryImpl;
import webworkout.project.exception.InvalidEntityDataException;
import webworkout.project.exception.NoneexistingEntityException;
import webworkout.project.model.MockWorkouts;
import webworkout.project.model.Player;
import webworkout.project.model.Workout;
import webworkout.project.service.PlayerService;
import webworkout.project.service.PlayerServiceImpl;
import webworkout.project.service.WorkoutService;
import webworkout.project.service.WorkoutServiceImpl;

public class Main {
    public static void main(String[] args) throws NoneexistingEntityException, InvalidEntityDataException {
        WorkoutRepository workoutRepository = new WorkoutRepositoryMemoryImpl();
        WorkoutService workoutService = new WorkoutServiceImpl(workoutRepository);
        for(Workout workout : MockWorkouts.MOCK_WORKOUTS){
            workoutService.addWorkout(workout);
            workoutService.updateWorkout(workout);
            workoutService.deleteWorkoutById(workout.getId());
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
