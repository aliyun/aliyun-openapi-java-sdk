package com.aliyuncs.reader;

import com.aliyuncs.exceptions.ClientException;

import java.util.Map;

@Deprecated
public interface Reader {

    public Map<String, String> read(String response, String endpoint) throws ClientException;

    public Map<String, String> readForHideArrayItem(String response, String endpoint) throws ClientException;
}
