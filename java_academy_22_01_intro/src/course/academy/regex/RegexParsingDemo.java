package course.academy.regex;

import course.academy.model.Book;

import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static course.academy.model.MockBooks.MOCK_BOOKS;

public class RegexParsingDemo {
    public static void main(String[] args) {
        var dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        StringBuilder sb = new StringBuilder();
        for(Book book : MOCK_BOOKS) {
            var dateStr = book.getPublishingDate().format(dtf);
            Pattern pattern = Pattern.compile("^(?<day>\\d{2}).(?<month>\\d{2}).(?<year>\\d{4}$)");
            Matcher matcher = pattern.matcher(dateStr);
            if(matcher.matches()) {
                sb.append(String.format("| %-50.50s | %2s | %2s | %4s |%n",
                        book.getTitle(), matcher.group("day"),
                        matcher.group("month"), matcher.group("year")));
            }
        }
        System.out.println(sb.toString());
    }
}
