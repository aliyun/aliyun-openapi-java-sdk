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
package com.aliyuncs.cms.model.v20151020;

import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20151020.QueryMetricResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class QueryMetricResponse extends AcsResponse {

	private String code;

	private String message;

	private String success;

	private String traceId;

	private List<JSONObject> datapoints;
	private String nextToken;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public List<JSONObject> getDatapoints() {
		return this.datapoints;
	}

	public void setDatapoints(List<JSONObject> datapoints) {
		this.datapoints = datapoints;
	}

	@Override
	public QueryMetricResponse getInstance(UnmarshallerContext context) {
		return	QueryMetricResponseUnmarshaller.unmarshall(this, context);
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getNextToken() {
		return nextToken;
	}
}
