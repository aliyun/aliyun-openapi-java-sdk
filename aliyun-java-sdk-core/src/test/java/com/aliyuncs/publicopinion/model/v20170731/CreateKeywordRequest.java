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

import java.util.List;

/**
 * @author auto create
 */
public class CreateKeywordRequest extends RpcAcsRequest<CreateKeywordResponse> {

    private Long topicId;
    private List<Keyword> keywords;
    private String name;
    private List<Long> siteTypeIds;

    public CreateKeywordRequest() {
        super("publicopinion", "2017-07-31", "CreateKeyword");
        setMethod(MethodType.POST);
    }

    public Long getTopicId() {
        return this.topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
        if (topicId != null) {
            putBodyParameter("topicId", topicId.toString());
        }
    }

    public List<Keyword> getKeywords() {
        return this.keywords;
    }

    public void setKeywords(List<Keyword> keywords) {
        this.keywords = keywords;
        for (int depth1 = 0; depth1 < keywords.size(); depth1++) {
            for (int i = 0; i < keywords.get(depth1).getWords().size(); i++) {
                putBodyParameter("keyword." + (depth1 + 1) + ".word." + (i + 1), keywords.get(depth1).getWords().get(i));
            }
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        if (name != null) {
            putBodyParameter("name", name);
        }
    }

    public List<Long> getSiteTypeIds() {
        return this.siteTypeIds;
    }

    public void setSiteTypeIds(List<Long> siteTypeIds) {
        this.siteTypeIds = siteTypeIds;
        for (int i = 0; i < siteTypeIds.size(); i++) {
            putBodyParameter("siteTypeId." + (i + 1), siteTypeIds.get(i));
        }
    }

    @Override
    public Class<CreateKeywordResponse> getResponseClass() {
        return CreateKeywordResponse.class;
    }

    public static class Keyword {

        private List<String> words;

        public List<String> getWords() {
            return this.words;
        }

        public void setWords(List<String> words) {
            this.words = words;
        }
    }

}
