package local.nix.exceptions;

public class Main {

    public static void main(String[] args) {

        Block block = new Block() {

            private int counter = 0;

            @Override
            public void run() throws Exception {
                System.out.println(1/(counter++));

            }

        };

        try {
            new Retry().repeatBlock(5, block);
        } catch (Exception e) {
            System.out.println("From Main");
            e.printStackTrace();
        }


    }

}

