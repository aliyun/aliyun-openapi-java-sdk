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
package com.aliyuncs.push.model.v20150827;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryMessageCountRequest extends RpcAcsRequest<QueryMessageCountResponse> {
	
	public QueryMessageCountRequest() {
		super("Push", "2015-08-27", "QueryMessageCount");
	}

	private Long appKey;

	private String start;

	private String end;

	private Integer level;

	public Long getAppKey() {
		return this.appKey;
	}

	public void setAppKey(Long appKey) {
		this.appKey = appKey;
		putQueryParameter("AppKey", appKey);
	}

	public String getstart() {
		return this.start;
	}

	public void setstart(String start) {
		this.start = start;
		putQueryParameter("start", start);
	}

	public String getend() {
		return this.end;
	}

	public void setend(String end) {
		this.end = end;
		putQueryParameter("end", end);
	}

	public Integer getlevel() {
		return this.level;
	}

	public void setlevel(Integer level) {
		this.level = level;
		putQueryParameter("level", level);
	}

	@Override
	public Class<QueryMessageCountResponse> getResponseClass() {
		return QueryMessageCountResponse.class;
	}

}
