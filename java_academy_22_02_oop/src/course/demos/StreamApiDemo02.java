package course.demos;

import course.demos.streams.util.StreamUtil;
import course.demos.streams.util.Tuple2;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiDemo02 {
    public static <T> Stream<T> createStream(Collection<T> values) {
        return values == null? Stream.empty() : values.stream();
    }

    public static void main(String[] args) {
        var empty = Stream.empty();
        empty.forEach(System.out::println);
        var streamOfVals = Stream.of("hello", "functional", "java", "stream", "api");
//        streamOfVals.forEach(System.out::println);
//        var streamOfVals2 = createStream(List.of("hello", "functional", "java", "stream", "api"));
//        streamOfVals2.forEach(LSOutput);
        var streamOfArrayVals = Arrays.stream(new String[]{"hello", "functional", "java", "api"});
//        streamOfArrayVals.forEach(System.out::println);
        var streamBuilder = Stream.builder().add("hello").add("functional").add("functional")
                .add("java").add("stream").add("api")
                .build();
//        streamBuilder.forEach(System.out::println);
        var streamGenerated = Stream.generate(()->Math.random()).limit(1000).parallel();
//        streamGenerated.forEach(System.out::println);
        var counter = new AtomicInteger();
        var countedRandoms = Stream.generate(
                ()->new Tuple2(counter.incrementAndGet(), Math.random())).limit(1000);
//        countedRandoms.forEach(tuple2 -> System.out.printf("%s -> %s%n", tuple2.getV1(), tuple2.getV2()));
        var counterStream = IntStream.iterate(1, i -> i + 1).mapToObj(i -> Integer.valueOf(i));
//        counterStream.forEach((System.out::println));
        var countedRandomsZip =
                StreamUtil.zip(counterStream, streamGenerated, (count, random) -> new Tuple2<>(count, random));
//        countedRandomsZip.forEach(tuple2 -> System.out.printf("%s -> %s%n", tuple2.getV1(), tuple2.getV2()));

        var charStream = streamOfVals.flatMapToInt(str -> str.chars());
        charStream.forEach(ch -> System.out.print((char)ch + ", "));
    }
}
