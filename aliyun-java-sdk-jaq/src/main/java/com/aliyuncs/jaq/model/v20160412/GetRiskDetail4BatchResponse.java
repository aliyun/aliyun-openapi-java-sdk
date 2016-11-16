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
package com.aliyuncs.jaq.model.v20160412;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.jaq.transform.v20160412.GetRiskDetail4BatchResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRiskDetail4BatchResponse extends AcsResponse {

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

		private Integer totalStatus;

		private String resultInfos;

		public Integer getTotalStatus() {
			return this.totalStatus;
		}

		public void setTotalStatus(Integer totalStatus) {
			this.totalStatus = totalStatus;
		}

		public String getResultInfos() {
			return this.resultInfos;
		}

		public void setResultInfos(String resultInfos) {
			this.resultInfos = resultInfos;
		}
	}

	@Override
	public GetRiskDetail4BatchResponse getInstance(UnmarshallerContext context) {
		return	GetRiskDetail4BatchResponseUnmarshaller.unmarshall(this, context);
	}
}
