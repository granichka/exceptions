package local.nix.exceptions;

public class Retry {

    private int sleep = 1;

    public void repeatBlock(int i, Block block) throws Exception{

        Thread.sleep(100 * sleep++);

        if(1 == i) {
            try {
                block.run();
            } catch (Exception e1) {
                throw e1;
            }
        } else {

            try {
                block.run();
            } catch (Exception e) {
                repeatBlock(i-1, block);
            }
        }



    }

}