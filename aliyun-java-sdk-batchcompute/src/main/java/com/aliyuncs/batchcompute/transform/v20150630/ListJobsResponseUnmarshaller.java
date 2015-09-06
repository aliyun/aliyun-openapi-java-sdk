/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.batchcompute.transform.v20150630;

import com.aliyuncs.batchcompute.model.v20150630.ListJobsResponse;
import com.aliyuncs.batchcompute.pojo.v20150630.Job;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;


public class ListJobsResponseUnmarshaller {

    public static ListJobsResponse unmarshall(ListJobsResponse listJobsResponse, UnmarshallerContext context) throws ServerException {

        HttpResponse httpResponse = context.getHttpResponse();
        listJobsResponse.setHttpResponse(httpResponse);

        try {
            String body = new String(httpResponse.getContent(), httpResponse.getEncoding());
            setContent(body, listJobsResponse);
        } catch (UnsupportedEncodingException e) {
            throw new ServerException("API.EncodeError", "encode response body error",listJobsResponse.getRequestId());
        } catch (IOException e) {
            throw new ServerException("API.EncodeError", "encode response body error",listJobsResponse.getRequestId());
        }
        return listJobsResponse;
    }

    public static void setContent(String body, ListJobsResponse listJobsResponse) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        Map<String, Job> jobMap = mapper.readValue(body,
                new TypeReference<Map<String, Job>>() {
                });

        List<Job> jobList = new ArrayList();

        Iterator<String> keyIt = jobMap.keySet().iterator();

        while (keyIt.hasNext()) {
            String key = keyIt.next();
            Job job = jobMap.get(key);
            job.setJobId(key);

            jobList.add(job);
        }
        sortList(jobList);

        listJobsResponse.setJobList(jobList);
    }

    public static void sortList(List<Job> jobList) {
        Collections.sort(jobList, new Comparator<Job>() {
            public int compare(Job a, Job b) {
                int x = a.getJobId().compareTo(b.getJobId());
                if (x == 0) return 0;
                else return x < 0 ? -1 : 1;
            }
        });
    }
}