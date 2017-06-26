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
package com.aliyuncs.iot.model.v20170420;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryPageByApplyIdRequest extends RpcAcsRequest<QueryPageByApplyIdResponse> {
	
	public QueryPageByApplyIdRequest() {
		super("Iot", "2017-04-20", "QueryPageByApplyId");
	}

	private Integer pageSize;

	private Integer currentPage;

	private Long applyId;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		putQueryParameter("PageSize", pageSize);
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		putQueryParameter("CurrentPage", currentPage);
	}

	public Long getApplyId() {
		return this.applyId;
	}

	public void setApplyId(Long applyId) {
		this.applyId = applyId;
		putQueryParameter("ApplyId", applyId);
	}

	@Override
	public Class<QueryPageByApplyIdResponse> getResponseClass() {
		return QueryPageByApplyIdResponse.class;
	}

}
