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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.jaq.transform.v20161123.OtherPreventionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OtherPreventionResponse extends AcsResponse {

	private Integer errorCode;

	private String errorMsg;

	private Data data;

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer fnalDecision;

		private String eventId;

		private String userId;

		private Integer finalScore;

		private String finalDesc;

		private String detail;

		private String captchaCheckData;

		public Integer getFnalDecision() {
			return this.fnalDecision;
		}

		public void setFnalDecision(Integer fnalDecision) {
			this.fnalDecision = fnalDecision;
		}

		public String getEventId() {
			return this.eventId;
		}

		public void setEventId(String eventId) {
			this.eventId = eventId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public Integer getFinalScore() {
			return this.finalScore;
		}

		public void setFinalScore(Integer finalScore) {
			this.finalScore = finalScore;
		}

		public String getFinalDesc() {
			return this.finalDesc;
		}

		public void setFinalDesc(String finalDesc) {
			this.finalDesc = finalDesc;
		}

		public String getDetail() {
			return this.detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}

		public String getCaptchaCheckData() {
			return this.captchaCheckData;
		}

		public void setCaptchaCheckData(String captchaCheckData) {
			this.captchaCheckData = captchaCheckData;
		}
	}

	@Override
	public OtherPreventionResponse getInstance(UnmarshallerContext context) {
		return	OtherPreventionResponseUnmarshaller.unmarshall(this, context);
	}
}
