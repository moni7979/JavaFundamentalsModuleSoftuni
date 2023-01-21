package objectsAndClasses.ex;

import java.util.Scanner;

public class Articles {

    static class ArticleClass {
        String title;
        String content;
        String author;

        public ArticleClass(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String edit(String newContent) {
            content = newContent;
            return content;
        }
        public String changeAuthor(String newAuthor) {
            author = newAuthor;
            return author;
        }
        public String rename(String newTitle) {
            title = newTitle;
            return title;
        }
        @Override
        public String toString() {
            return title + " - " + content + ": " + author;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String article = scanner.nextLine();
        String[]articleArr = article.split(", ");
        String titleInput = articleArr[0];
        String contentInput = articleArr[1];
        String authorInput = articleArr[2];

        ArticleClass currentArticle = new ArticleClass(titleInput, contentInput, authorInput);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();
            String[] commandArr = command.split(": ");

            if (commandArr[0].equals("Edit")) {
                String whatToEdit = commandArr[1];
                currentArticle.edit(whatToEdit);
            } else if (commandArr[0].equals("ChangeAuthor")) {
                String newAuthor = commandArr[1];
                currentArticle.changeAuthor(newAuthor);
            } else if (commandArr[0].equals("Rename")) {
                String newName = commandArr[1];
                currentArticle.rename(newName);
            }
        }

        System.out.println(currentArticle.toString());

    }
}
