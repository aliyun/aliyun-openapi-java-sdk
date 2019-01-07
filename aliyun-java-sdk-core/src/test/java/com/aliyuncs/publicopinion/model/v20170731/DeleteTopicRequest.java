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
package com.aliyuncs.publicopinion.model.v20170731;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 */
public class DeleteTopicRequest extends RpcAcsRequest<DeleteTopicResponse> {

    private Long id;

    public DeleteTopicRequest() {
        super("publicopinion", "2017-07-31", "DeleteTopic");
        setMethod(MethodType.POST);
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
        if (id != null) {
            putBodyParameter("id", id.toString());
        }
    }

    @Override
    public Class<DeleteTopicResponse> getResponseClass() {
        return DeleteTopicResponse.class;
    }

}
