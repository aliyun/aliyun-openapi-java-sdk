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
package com.aliyuncs.cms.model.v20170301;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class PutMetricDataRequest extends RpcAcsRequest<PutMetricDataResponse> {
	
	public PutMetricDataRequest() {
		super("Cms", "2017-03-01", "PutMetricData", "cms");
	}

	private String callby_cms_owner;

	private String body;

	public String getCallby_cms_owner() {
		return this.callby_cms_owner;
	}

	public void setCallby_cms_owner(String callby_cms_owner) {
		this.callby_cms_owner = callby_cms_owner;
		if(callby_cms_owner != null){
			putQueryParameter("callby_cms_owner", callby_cms_owner);
		}
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		if(body != null){
			putQueryParameter("Body", body);
		}
	}

	@Override
	public Class<PutMetricDataResponse> getResponseClass() {
		return PutMetricDataResponse.class;
	}

}
