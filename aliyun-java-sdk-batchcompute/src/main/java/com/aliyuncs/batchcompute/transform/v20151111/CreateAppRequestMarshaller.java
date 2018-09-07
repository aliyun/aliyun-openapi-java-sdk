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

import com.aliyuncs.batchcompute.model.v20151111.CreateAppRequest;
import com.aliyuncs.batchcompute.model.v20151111.CreateImageRequest;
import com.aliyuncs.exceptions.ClientException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.IOException;


public class CreateAppRequestMarshaller {

    public static CreateAppRequest marshall(CreateAppRequest req) throws ClientException {

        ObjectMapper mapper = new ObjectMapper();

        //默认值不序列化
        mapper.setSerializationInclusion(JsonInclude.Include.NON_DEFAULT);

        String contentString = null;
        try {
            contentString = mapper.writeValueAsString(req.getAppDescription());
        } catch (IOException e) {
            throw new ClientException("API.EncodeError", "encode request body error");
        }

        req.setHttpContent(contentString.getBytes(), req.getEncoding(), req.getAcceptFormat());

        return req;
    }
}
