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
public class QueryKeywordsRequest extends RpcAcsRequest<QueryKeywordsResponse> {

    private Integer pageSize;
    private String topicId;
    private Integer toPage;

    public QueryKeywordsRequest() {
        super("publicopinion", "2017-07-31", "QueryKeywords");
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

    public String getTopicId() {
        return this.topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
        if (topicId != null) {
            putQueryParameter("topicId", topicId);
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

    @Override
    public Class<QueryKeywordsResponse> getResponseClass() {
        return QueryKeywordsResponse.class;
    }

}
