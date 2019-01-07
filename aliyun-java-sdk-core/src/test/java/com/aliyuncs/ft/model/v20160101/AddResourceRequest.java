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
package com.aliyuncs.ft.model.v20160101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 */
public class AddResourceRequest extends RpcAcsRequest<AddResourceResponse> {

    private String content;
    private String name;
    private String resourceType;
    private Long bid;

    public AddResourceRequest() {
        super("Txapi", "2017-09-20", "AddResource");
        this.setMethod(MethodType.POST);
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
        if (content != null) {
            putBodyParameter("Content", content);
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        if (name != null) {
            putBodyParameter("Name", name);
        }
    }

    public String getResourceType() {
        return this.resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
        if (resourceType != null) {
            putBodyParameter("ResourceType", resourceType);
        }
    }

    public Long getBid() {
        return this.bid;
    }

    public void setBid(Long bid) {
        this.bid = bid;
        if (bid != null) {
            putBodyParameter("Bid", bid.toString());
        }
    }

    @Override
    public Class<AddResourceResponse> getResponseClass() {
        return AddResourceResponse.class;
    }

}
