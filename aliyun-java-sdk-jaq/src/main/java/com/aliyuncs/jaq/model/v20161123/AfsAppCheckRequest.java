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
package com.aliyuncs.jaq.model.v20161123;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class AfsAppCheckRequest extends RpcAcsRequest<AfsAppCheckResponse> {
	
	public AfsAppCheckRequest() {
		super("jaq", "2016-11-23", "AfsAppCheck");
	}

	private String callerName;

	private String session;

	public String getCallerName() {
		return this.callerName;
	}

	public void setCallerName(String callerName) {
		this.callerName = callerName;
		putQueryParameter("CallerName", callerName);
	}

	public String getSession() {
		return this.session;
	}

	public void setSession(String session) {
		this.session = session;
		putQueryParameter("Session", session);
	}

	@Override
	public Class<AfsAppCheckResponse> getResponseClass() {
		return AfsAppCheckResponse.class;
	}

}
