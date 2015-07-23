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

import com.aliyuncs.batchcompute.model.v20150630.ListJobStatusResponse;
import com.aliyuncs.batchcompute.pojo.v20150630.JobStatus;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;


public class ListJobStatusResponseUnmarshaller {

    public static ListJobStatusResponse unmarshall(ListJobStatusResponse listJobsResponse, UnmarshallerContext context) throws ServerException {

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

    public static void setContent(String body, ListJobStatusResponse listJobsResponse) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        Map<String, JobStatus> jobStatusMap = mapper.readValue(body,
                new TypeReference<Map<String, JobStatus>>() {
                });

        List<JobStatus> jobStatusList = new ArrayList();

        Iterator<String> keyIt = jobStatusMap.keySet().iterator();

        while (keyIt.hasNext()) {
            String key = keyIt.next();
            JobStatus jobStatus = jobStatusMap.get(key);
            jobStatus.setJobId(key);

            jobStatusList.add(jobStatus);
        }
        sortList(jobStatusList);

        listJobsResponse.setJobStatusList(jobStatusList);
    }

    public static void sortList(List<JobStatus> jobStatusList) {
        Collections.sort(jobStatusList, new Comparator<JobStatus>() {
            public int compare(JobStatus a, JobStatus b) {
                int x = a.getJobId().compareTo(b.getJobId());
                if (x == 0) return 0;
                else return x < 0 ? -1 : 1;
            }
        });
    }
}