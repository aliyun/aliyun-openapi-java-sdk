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
package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListBriefConfigByActionRequest extends RpcAcsRequest<ListBriefConfigByActionResponse> {
	
	public ListBriefConfigByActionRequest() {
		super("cloudwf", "2017-03-28", "ListBriefConfigByAction");
	}

	private Long ancestorApgroupId;

	private Integer limit;

	private String fuzzySearch;

	public Long getAncestorApgroupId() {
		return this.ancestorApgroupId;
	}

	public void setAncestorApgroupId(Long ancestorApgroupId) {
		this.ancestorApgroupId = ancestorApgroupId;
		if(ancestorApgroupId != null){
			putQueryParameter("AncestorApgroupId", ancestorApgroupId.toString());
		}
	}

	public Integer getLimit() {
		return this.limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
		if(limit != null){
			putQueryParameter("Limit", limit.toString());
		}
	}

	public String getFuzzySearch() {
		return this.fuzzySearch;
	}

	public void setFuzzySearch(String fuzzySearch) {
		this.fuzzySearch = fuzzySearch;
		if(fuzzySearch != null){
			putQueryParameter("FuzzySearch", fuzzySearch);
		}
	}

	@Override
	public Class<ListBriefConfigByActionResponse> getResponseClass() {
		return ListBriefConfigByActionResponse.class;
	}

}
