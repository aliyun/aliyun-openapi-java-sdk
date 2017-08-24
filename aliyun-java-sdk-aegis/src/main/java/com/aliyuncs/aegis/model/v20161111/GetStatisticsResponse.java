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
package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.GetStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetStatisticsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private Boolean success;

	private String message;

	private Data data;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer account;

		private Integer health;

		private Integer patch;

		private Integer trojan;

		public Integer getAccount() {
			return this.account;
		}

		public void setAccount(Integer account) {
			this.account = account;
		}

		public Integer getHealth() {
			return this.health;
		}

		public void setHealth(Integer health) {
			this.health = health;
		}

		public Integer getPatch() {
			return this.patch;
		}

		public void setPatch(Integer patch) {
			this.patch = patch;
		}

		public Integer getTrojan() {
			return this.trojan;
		}

		public void setTrojan(Integer trojan) {
			this.trojan = trojan;
		}
	}

	@Override
	public GetStatisticsResponse getInstance(UnmarshallerContext context) {
		return	GetStatisticsResponseUnmarshaller.unmarshall(this, context);
	}
}
