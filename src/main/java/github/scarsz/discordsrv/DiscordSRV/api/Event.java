package github.scarsz.discordsrv.DiscordSRV.api;

import java.util.Arrays;

/**
 * Made by Scarsz
 *
 * @in /dev/hell
 * @on 11/22/2016
 * @at 3:18 PM
 */
public abstract class Event extends Cancelable {

    public void perform() {
        System.out.println("Stack @ event perform: " + Arrays.toString(Thread.currentThread().getStackTrace()));
    }

}
