package WebWorkout.project;

import WebWorkout.project.dao.*;
import WebWorkout.project.dao.impl.DaoFactoryMemoryImpl;
import WebWorkout.project.dao.impl.WorkoutRepositoryMemoryImpl;
import WebWorkout.project.exception.InvalidEntityDataException;
import WebWorkout.project.exception.NoneexistingEntityException;
import WebWorkout.project.model.MockWorkouts;
import WebWorkout.project.model.Person;
import WebWorkout.project.model.Workout;
import WebWorkout.project.service.WorkoutService;
import WebWorkout.project.service.WorkoutServiceImpl;

public class Main {
    public static void main(String[] args) throws NoneexistingEntityException {
        DaoFactory daoFactory = new DaoFactoryMemoryImpl();
        WorkoutRepository workoutRepository = new WorkoutRepositoryMemoryImpl();
        WorkoutService workoutService = new WorkoutServiceImpl(workoutRepository);
        for(Workout workout : MockWorkouts.MOCK_WORKOUTS){
            workoutRepository.create(workout);
        }

        Person p1 = new Person(1L, "Bill", "Morison", 35);
        p1.setAge(35);
        p1.setUsername("BJMson");

        Person p2 = new Person(2L, "Micheal", "James", 28);
        p2.setAge(28);
        p2.setUsername("JamesSmith");
        System.out.println(p1.toString());
        System.out.println(p2);

        Person p3 = new Person(3L, "Torstein", "Horgmo", 27);
        p3.setAge(27);
        p3.setUsername("Horseman");
        System.out.println(p3);
        System.out.println(p1.equals(p3));
        System.out.println("p1.hash:" + p1.hashCode());
        System.out.println("p3.hash:" + p3.hashCode());
        System.out.println(p1 == p3);

        Person p4 = new Person(4L, "Jaden", "Dreams", 31);
        p3.setAge(31);
        p3.setUsername("JD");
        System.out.println(p4);

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
//        Workout myWorkout = new Workout();
//        myWorkout.dailyWorkout();

        //use the object
        System.out.println("Track run: 2x100m / Push-Ups after");

    }
}
