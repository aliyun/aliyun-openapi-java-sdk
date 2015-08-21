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
package com.aliyuncs.ossadmin.model.v20140326;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ossadmin.transform.v20140326.restartOssResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class restartOssResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private Long aliUid;

	private String instanceId;

	private String instacneStatus;

	private String instanceName;

	private String startTime;

	private String endTime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Long getaliUid() {
		return this.aliUid;
	}

	public void setaliUid(Long aliUid) {
		this.aliUid = aliUid;
	}

	public String getinstanceId() {
		return this.instanceId;
	}

	public void setinstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getinstacneStatus() {
		return this.instacneStatus;
	}

	public void setinstacneStatus(String instacneStatus) {
		this.instacneStatus = instacneStatus;
	}

	public String getinstanceName() {
		return this.instanceName;
	}

	public void setinstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	public String getstartTime() {
		return this.startTime;
	}

	public void setstartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getendTime() {
		return this.endTime;
	}

	public void setendTime(String endTime) {
		this.endTime = endTime;
	}

	@Override
	public restartOssResponse getInstance(UnmarshallerContext context) {
		return	restartOssResponseUnmarshaller.unmarshall(this, context);
	}
}
