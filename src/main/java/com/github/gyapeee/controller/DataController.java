package com.github.gyapeee.controller;

import com.github.gyapeee.NetTrafficStatApp;
import org.pcap4j.core.PcapNativeException;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.core.Pcaps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class DataController {

    @GetMapping("")
    public String getUsers(Model model) {
        model.addAttribute("users", Arrays.asList("Dean", "Polly", "Eszter"));
        return "index.html";
    }

    @GetMapping("/devices")
    public String getDevices(Model model) throws PcapNativeException {
        // The list contains all the devices
        List<PcapNetworkInterface> devices = null;

        // Print out all about the devices
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("These are the devices:\n");
        Pcaps.findAllDevs().forEach((device) -> {
            stringBuilder.append(device.getDescription());
        });

        return "index.html";
    }
}
