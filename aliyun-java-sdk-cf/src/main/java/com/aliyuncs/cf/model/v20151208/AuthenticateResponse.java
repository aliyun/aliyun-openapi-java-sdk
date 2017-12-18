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
package com.aliyuncs.cf.model.v20151208;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cf.transform.v20151208.AuthenticateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AuthenticateResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String msg;

	private Integer code;

	private SigAuthenticateResult sigAuthenticateResult;

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

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public SigAuthenticateResult getSigAuthenticateResult() {
		return this.sigAuthenticateResult;
	}

	public void setSigAuthenticateResult(SigAuthenticateResult sigAuthenticateResult) {
		this.sigAuthenticateResult = sigAuthenticateResult;
	}

	public static class SigAuthenticateResult {

		private Long timestamp;

		private Integer code;

		private String msg;

		private String risklevel;

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}

		public Integer getCode() {
			return this.code;
		}

		public void setCode(Integer code) {
			this.code = code;
		}

		public String getMsg() {
			return this.msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public String getRisklevel() {
			return this.risklevel;
		}

		public void setRisklevel(String risklevel) {
			this.risklevel = risklevel;
		}
	}

	@Override
	public AuthenticateResponse getInstance(UnmarshallerContext context) {
		return	AuthenticateResponseUnmarshaller.unmarshall(this, context);
	}
}
