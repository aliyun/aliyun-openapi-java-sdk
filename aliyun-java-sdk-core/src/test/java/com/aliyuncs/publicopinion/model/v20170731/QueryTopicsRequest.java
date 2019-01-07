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

/**
 * @author auto create
 */
public class QueryTopicsRequest extends RpcAcsRequest<QueryTopicsResponse> {

    private Integer pageSize;
    private Integer toPage;
    private String name;

    public QueryTopicsRequest() {
        super("publicopinion", "2017-07-31", "QueryTopics");
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        if (pageSize != null) {
            putQueryParameter("pageSize", pageSize.toString());
        }
    }

    public Integer getToPage() {
        return this.toPage;
    }

    public void setToPage(Integer toPage) {
        this.toPage = toPage;
        if (toPage != null) {
            putQueryParameter("toPage", toPage.toString());
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        if (name != null) {
            putQueryParameter("name", name);
        }
    }

    @Override
    public Class<QueryTopicsResponse> getResponseClass() {
        return QueryTopicsResponse.class;
    }

}
