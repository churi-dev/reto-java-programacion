package Collections_26;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class interaceComparator {

    public static void main(String[] args) {

        List<Message> messages = new ArrayList<>();

        messages.add(new Message("Hello"));
        messages.add(new Message("humans!"));
        messages.add(new Message("We"));
        messages.add(new Message("came"));
        messages.add(new Message("in"));
        messages.add(new Message("peace!"));

        // comparar y ordenar
        messages.sort(new MessageContentComparator());
        System.out.println(messages);
    }
    static class MessageContentComparator implements Comparator<Message> {
        @Override
        public int compare(Message m1, Message m2) {
            /*
            if (m1.getContent().equals(m2.getContent())) {
                return 0;
            } else if (m1.getContent().length() < m2.getContent().length()) {
                return -1;
            } else {
                return 1;
            }
             */
            int firstLength = m1.getContent().length();
            int secondLength = m2.getContent().length();

            // reversa
            // return secondLength - firstLength;
            return Integer.compare(firstLength, secondLength);
        }
    }
    static class Message {
        private final String content;

        public Message(String content) {
            this.content = content;
        }
        public String getContent() {
            return content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
