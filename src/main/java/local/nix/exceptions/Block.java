package local.nix.exceptions;

@FunctionalInterface
public interface Block {

    void run() throws Exception;

}