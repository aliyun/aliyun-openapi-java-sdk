package com.aliyuncs.utils;

import com.google.gson.Gson;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ProfilingHelper {
    private long startRequest;
    private long endRequest;
    private long totalRequest;

    private long startEndpoint;
    private long endEndpoint;
    private long totalEndpoint;

    private long startNetwork;
    private long endNetwork;
    private long totalNetwork;

    private long totalAll;
    private static final String DEFAULT_FORMAT =
            "\n{\"start(call request)\":\"%s\"," +
                    "\"end(call request)\":\"%s\"," +
                    "\"Total time(call request)\":\"%s\"," +
                    "\"start(resolve endpoint)\":\"%s\"," +
                    "\"end(resolve endpoint)\":\"%s\"," +
                    "\"Total time(resolve endpoint)\":\"%s\"," +
                    "\"start(network call)\":\"%s\"," +
                    "\"end(network call)\":\"%s\"," +
                    "\"Total time(network call)\":\"%s\"," +
                    "\"Total time(All)\":\"%s\"}\n";

    public String getStartRequest() {
        return ProfilingHelper.getStringDate(new Date(startRequest));
    }

    public void setStartRequest(long startRequest) {
        this.startRequest = startRequest;
    }

    public String getEndRequest() {
        return ProfilingHelper.getStringDate(new Date(endRequest));
    }

    public void setEndRequest(long endRequest) {
        this.setTotalRequest(endRequest - this.startRequest);
        this.endRequest = endRequest;
    }

    public String getTotalRequest() {
        return totalRequest + "ms";
    }

    public void setTotalRequest(long totalRequest) {
        this.totalRequest = totalRequest;
    }

    public String getStartEndpoint() {
        return ProfilingHelper.getStringDate(new Date(startEndpoint));
    }

    public void setStartEndpoint(long startEndpoint) {
        this.startEndpoint = startEndpoint;
    }

    public String getEndEndpoint() {
        return ProfilingHelper.getStringDate(new Date(endEndpoint));
    }

    public void setEndEndpoint(long endEndpoint) {
        this.setTotalEndpoint(endEndpoint - this.startEndpoint);
        this.endEndpoint = endEndpoint;
    }

    public String getTotalEndpoint() {
        return totalEndpoint + "ms";
    }

    public void setTotalEndpoint(long totalEndpoint) {
        this.totalEndpoint = totalEndpoint;
    }

    public String getStartNetwork() {
        return ProfilingHelper.getStringDate(new Date(startNetwork));
    }

    public void setStartNetwork(long startNetwork) {
        this.startNetwork = startNetwork;
    }

    public String getEndNetwork() {
        return ProfilingHelper.getStringDate(new Date(endNetwork));
    }

    public void setEndNetwork(long endNetwork) {
        this.setTotalNetwork(endNetwork - this.startNetwork);
        this.endNetwork = endNetwork;
    }

    public String getTotalNetwork() {
        return totalNetwork + "ms";
    }

    public void setTotalNetwork(long totalNetwork) {
        this.totalNetwork = totalNetwork;
    }

    public void addTotalAll() {
        this.totalAll = this.totalEndpoint + this.totalRequest;
    }

    public String getTotalAll() {
        this.addTotalAll();
        return this.totalAll + "ms";
    }

    @Override
    public String toString() {
        return String.format(DEFAULT_FORMAT, this.getStartRequest(), this.getEndRequest(), this.getTotalRequest(),
                this.getStartEndpoint(), this.getEndEndpoint(), this.getTotalEndpoint(),
                this.getStartNetwork(), this.getEndNetwork(), this.getTotalNetwork(), this.getTotalAll());
    }

    public static String getStringDate(Date date) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        df.setTimeZone(new SimpleTimeZone(0, ParameterHelper.TIME_ZONE));
        return df.format(date);
    }

    public static long getlongDate(String date) throws ParseException {
        if (StringUtils.isEmpty(date)) {
            return -1;
        }
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        df.setTimeZone(new SimpleTimeZone(0, ParameterHelper.TIME_ZONE));
        return df.parse(date).getTime();
    }

    /**
     * @param filePath log file path
     * @param startTime  Greenwich Mean Time. The Format is "yyyy-MM-dd HH:mm:ss SSS"
     * @param endTime Greenwich Mean Time. The Format is "yyyy-MM-dd HH:mm:ss SSS"
     * @return data list for waterfall plot
     * @throws IOException
     * @throws ParseException
     */
    public static List getDatas(String filePath, String startTime, String endTime) throws IOException, ParseException {
        List<Map<String, String>> arrayList = new ArrayList<Map<String, String>>();
        if (filePath == null) {
            return arrayList;
        }
        File file = new File(filePath);
        if (!file.isFile()) {
            return arrayList;
        }
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader bufferedReader = new BufferedReader(isr);
        String line;
        Gson gson = new Gson();
        while ((line = bufferedReader.readLine()) != null) {
            if (line.startsWith("{") && line.endsWith("}")) {
                arrayList.add(gson.fromJson(line, Map.class));
            }
        }
        long startLong = ProfilingHelper.getlongDate(startTime);
        long endLong = StringUtils.isEmpty(endTime) ? System.currentTimeMillis() : ProfilingHelper.getlongDate(endTime);
        long time;
        List<Map<String, String>> result = new ArrayList<Map<String, String>>();
        for (Map<String, String> map : arrayList) {
            time = ProfilingHelper.getlongDate(map.get("start(call request)"));
            if (startLong <= time && time <= endLong) {
                result.add(map);
            }
        }
        return result;
    }


}
