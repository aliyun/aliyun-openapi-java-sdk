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
package com.aliyuncs.batchcompute.transform.v20151111;

import com.aliyuncs.batchcompute.model.v20151111.ListJobsResponse;
import com.aliyuncs.batchcompute.pojo.v20151111.Job;
import com.aliyuncs.batchcompute.pojo.v20151111.MarkableResult;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;


public class ListJobsResponseUnmarshaller {

    public static ListJobsResponse unmarshall(ListJobsResponse listJobsResponse, UnmarshallerContext context) throws ServerException {

        HttpResponse httpResponse = context.getHttpResponse();
        listJobsResponse.setHttpResponse(httpResponse);

        try {
            String body = new String(httpResponse.getContent(), httpResponse.getEncoding());
            setContent(body, listJobsResponse);
        } catch (IOException e) {
            throw new ServerException("API.EncodeError", "encode response body error", listJobsResponse.getRequestId());
        }

        return listJobsResponse;
    }


    private static void setContent(String body, ListJobsResponse listJobsResponse) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        MarkableResult<Job> result = mapper.readValue(body,
                new TypeReference<MarkableResult<Job>>() {
                });

        listJobsResponse.setItems(result.getItems());
        listJobsResponse.setNextMarker(result.getNextMarker());
    }
}