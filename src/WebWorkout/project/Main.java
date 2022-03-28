package WebWorkout.project;

import WebWorkout.project.dao.WorkoutRepository;
import WebWorkout.project.dao.impl.WorkoutRepositoryMemoryImpl;
import WebWorkout.project.exception.NoneexistingEntityException;
import WebWorkout.project.model.MockWorkouts;
import WebWorkout.project.model.Workout;

public class Main {
    public static void main(String[] args) throws NoneexistingEntityException {
        WorkoutRepository workoutRepository = (WorkoutRepository) new WorkoutRepositoryMemoryImpl();
        for(Workout workout : MockWorkouts.MOCK_WORKOUTS){
            workoutRepository.create(workout);
        }


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

        // create the object
        Workout myWorkout = new Workout();
        myWorkout.dailyWorkout();

        //use the object
        System.out.println("Track run: 2x100m / Push-Ups after");
    }
}
