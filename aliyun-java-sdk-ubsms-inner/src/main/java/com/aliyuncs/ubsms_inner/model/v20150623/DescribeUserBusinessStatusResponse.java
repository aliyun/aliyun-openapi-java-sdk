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
package com.aliyuncs.ubsms_inner.model.v20150623;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ubsms_inner.transform.v20150623.DescribeUserBusinessStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserBusinessStatusResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String uid;

	private String serviceCode;

	private List<Status> statuses;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public List<Status> getStatuses() {
		return this.statuses;
	}

	public void setStatuses(List<Status> statuses) {
		this.statuses = statuses;
	}

	public static class Status {

		private String statusKey;

		private String statusValue;

		public String getStatusKey() {
			return this.statusKey;
		}

		public void setStatusKey(String statusKey) {
			this.statusKey = statusKey;
		}

		public String getStatusValue() {
			return this.statusValue;
		}

		public void setStatusValue(String statusValue) {
			this.statusValue = statusValue;
		}
	}

	@Override
	public DescribeUserBusinessStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserBusinessStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
