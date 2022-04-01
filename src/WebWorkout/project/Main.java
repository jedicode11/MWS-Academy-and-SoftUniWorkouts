package WebWorkout.project;

import WebWorkout.project.dao.WorkoutRepository;
import WebWorkout.project.dao.impl.WorkoutRepositoryMemoryImpl;
import WebWorkout.project.exception.NoneexistingEntityException;
import WebWorkout.project.model.MockWorkouts;
import WebWorkout.project.model.Workout;
import WebWorkout.project.service.WorkoutService;
import WebWorkout.project.service.WorkoutServiceImpl;

public class Main {
    public static void main(String[] args) throws NoneexistingEntityException {
        WorkoutRepository workoutRepository = new WorkoutRepositoryMemoryImpl();
        WorkoutService workoutService = new WorkoutServiceImpl(workoutRepository);
        for(Workout workout : MockWorkouts.MOCK_WORKOUTS){
            workoutRepository.create(workout);
        }

//        Player p1 = new Player();
//        p1.setAge(25);
//        p1.setUsername("Michael J.J.");
//
//        Player p2 = new Player();
//        p2.setAge(35);
//        p2.setUsername("Jane Smith");
//        System.out.println(p1.toString());
//        System.out.println(p2);
//
//        Player p3 = new Player();
//        p3.setAge(26);
//        p3.setUsername("John Smith");
//        System.out.println(p3);
//        System.out.println(p1.equals(p3));
//        System.out.println("p1.hash:" + p1.hashCode());
//        System.out.println("p3.hash:" + p3.hashCode());
//        System.out.println(p1 == p3);


        workoutRepository.deleteById(1L);
        workoutRepository.deleteById(2L);

        for(Workout workout : workoutRepository.findAll()) {
            System.out.println(workout);
        }
        System.out.println();

        Workout firstWorkout = workoutRepository.findById(3L);
        System.out.println(firstWorkout);

        System.out.println(workoutRepository.findById(4L));

        System.out.println();
        firstWorkout.setTitle("Workout One");
        firstWorkout.setWorkoutRatings(42);
        workoutRepository.update(firstWorkout);
        System.out.println(workoutRepository.findById(5L));


//        // create the object
//        Workout myWorkout = new Workout();
//        myWorkout.dailyWorkout();

        //use the object
        System.out.println("Track run: 2x100m / Push-Ups after");

    }
}
