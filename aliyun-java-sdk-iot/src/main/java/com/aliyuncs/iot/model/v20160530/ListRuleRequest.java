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
package com.aliyuncs.iot.model.v20160530;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListRuleRequest extends RpcAcsRequest<ListRuleResponse> {
	
	public ListRuleRequest() {
		super("Iot", "2016-05-30", "ListRule");
	}

	private Integer currenPage;

	private Integer pageSize;

	public Integer getCurrenPage() {
		return this.currenPage;
	}

	public void setCurrenPage(Integer currenPage) {
		this.currenPage = currenPage;
		putQueryParameter("CurrenPage", currenPage);
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		putQueryParameter("PageSize", pageSize);
	}

	@Override
	public Class<ListRuleResponse> getResponseClass() {
		return ListRuleResponse.class;
	}

}
