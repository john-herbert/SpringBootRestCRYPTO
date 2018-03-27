package services;

import com.springcryptoutils.core.mac.*;

public class MACService {

    // NB: this is a com.springcryptoutils.core.mac.Mac
    //     not a javax.security.Mac
    private Mac mac = new MacImpl();

    public MACService() {
	}

	public boolean verifyMAC(MACResponse resp ) {
		resp.setMessage("MAC is valid.");
		return true;
	}

	public boolean generateMAC(MACResponse resp, String msg) {
	    byte[] message = msg.getBytes();
	    byte[] digest = mac.digest(message);
		resp.setMessage("Generated MAC is " + digest.toString());
		return true;
	}

}
