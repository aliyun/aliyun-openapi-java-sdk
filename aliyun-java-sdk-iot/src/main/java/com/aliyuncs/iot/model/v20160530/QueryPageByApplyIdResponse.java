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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20160530.QueryPageByApplyIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPageByApplyIdResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private Integer pageSize;

	private Integer page;

	private Integer pageCount;

	private Integer total;

	private List<ApplyDeviceInfo> applyDeviceList;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<ApplyDeviceInfo> getApplyDeviceList() {
		return this.applyDeviceList;
	}

	public void setApplyDeviceList(List<ApplyDeviceInfo> applyDeviceList) {
		this.applyDeviceList = applyDeviceList;
	}

	public static class ApplyDeviceInfo {

		private String deviceId;

		private String deviceName;

		private String deviceSecret;

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		public String getDeviceSecret() {
			return this.deviceSecret;
		}

		public void setDeviceSecret(String deviceSecret) {
			this.deviceSecret = deviceSecret;
		}
	}

	@Override
	public QueryPageByApplyIdResponse getInstance(UnmarshallerContext context) {
		return	QueryPageByApplyIdResponseUnmarshaller.unmarshall(this, context);
	}
}
