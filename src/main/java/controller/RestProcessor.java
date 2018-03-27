package controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import services.MACService;
import services.MACResponse;


@RestController
public class RestProcessor {
	private MACService macSer;

	@RequestMapping(value="/verifymac", method=RequestMethod.GET, produces="application/json")
    public @ResponseBody MACResponse verifyMAC(@RequestParam("message") String message, @RequestParam("mac") String mac) {
		MACResponse resp = new MACResponse();
		return resp;
    }

	@RequestMapping(value="/generatemac", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody MACResponse generateMAC(@RequestParam("message") String message) {
		MACResponse resp = new MACResponse();
		macSer.generateMAC(resp, message);
		return resp;
    }

	@Autowired
	public void setMacSer(MACService ser){
		this.macSer = ser;
	}
}