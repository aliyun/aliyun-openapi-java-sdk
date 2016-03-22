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
package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.GetMainDomainNameResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMainDomainNameResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	private String rR;

	private Long domainLevel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getRR() {
		return this.rR;
	}

	public void setRR(String rR) {
		this.rR = rR;
	}

	public Long getDomainLevel() {
		return this.domainLevel;
	}

	public void setDomainLevel(Long domainLevel) {
		this.domainLevel = domainLevel;
	}

	@Override
	public GetMainDomainNameResponse getInstance(UnmarshallerContext context) {
		return	GetMainDomainNameResponseUnmarshaller.unmarshall(this, context);
	}
}
