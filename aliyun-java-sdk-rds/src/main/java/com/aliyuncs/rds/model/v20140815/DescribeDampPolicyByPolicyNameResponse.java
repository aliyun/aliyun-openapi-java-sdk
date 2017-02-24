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
package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeDampPolicyByPolicyNameResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDampPolicyByPolicyNameResponse extends AcsResponse {

	private String requestId;

	private String policy;

	private String timeRules;

	private String actionRules;

	private String sourceRules;

	private String handler;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPolicy() {
		return this.policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public String getTimeRules() {
		return this.timeRules;
	}

	public void setTimeRules(String timeRules) {
		this.timeRules = timeRules;
	}

	public String getActionRules() {
		return this.actionRules;
	}

	public void setActionRules(String actionRules) {
		this.actionRules = actionRules;
	}

	public String getSourceRules() {
		return this.sourceRules;
	}

	public void setSourceRules(String sourceRules) {
		this.sourceRules = sourceRules;
	}

	public String getHandler() {
		return this.handler;
	}

	public void setHandler(String handler) {
		this.handler = handler;
	}

	@Override
	public DescribeDampPolicyByPolicyNameResponse getInstance(UnmarshallerContext context) {
		return	DescribeDampPolicyByPolicyNameResponseUnmarshaller.unmarshall(this, context);
	}
}
