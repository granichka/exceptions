package local.nix.exceptions;

public class Retry {

    private int sleep = 1;

    public void repeatBlock(int i, Block block) throws Exception{


        if(1 == i) {
            try {
                Thread.sleep(100 * sleep);
                block.run();
            } catch (Exception e1) {
                throw e1;
            }
        }

        try {
            Thread.sleep(100 * sleep++);
            block.run();
        } catch (Exception e) {
            repeatBlock(i-1, block);
        }


    }

}