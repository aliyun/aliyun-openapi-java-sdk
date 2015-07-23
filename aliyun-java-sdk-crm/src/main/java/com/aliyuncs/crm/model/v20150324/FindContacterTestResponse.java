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
package com.aliyuncs.crm.model.v20150324;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.crm.transform.v20150324.FindContacterTestResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindContacterTestResponse extends AcsResponse {

	private Boolean success;

	private String resultCode;

	private String resultMessage;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long contacterId;

		private Long kpId;

		private Long customerId;

		private String contacterName;

		private String contacterEmail;

		private String contacterMobile;

		private String contacterPosition;

		public Long getContacterId() {
			return this.contacterId;
		}

		public void setContacterId(Long contacterId) {
			this.contacterId = contacterId;
		}

		public Long getKpId() {
			return this.kpId;
		}

		public void setKpId(Long kpId) {
			this.kpId = kpId;
		}

		public Long getCustomerId() {
			return this.customerId;
		}

		public void setCustomerId(Long customerId) {
			this.customerId = customerId;
		}

		public String getContacterName() {
			return this.contacterName;
		}

		public void setContacterName(String contacterName) {
			this.contacterName = contacterName;
		}

		public String getContacterEmail() {
			return this.contacterEmail;
		}

		public void setContacterEmail(String contacterEmail) {
			this.contacterEmail = contacterEmail;
		}

		public String getContacterMobile() {
			return this.contacterMobile;
		}

		public void setContacterMobile(String contacterMobile) {
			this.contacterMobile = contacterMobile;
		}

		public String getContacterPosition() {
			return this.contacterPosition;
		}

		public void setContacterPosition(String contacterPosition) {
			this.contacterPosition = contacterPosition;
		}
	}

	@Override
	public FindContacterTestResponse getInstance(UnmarshallerContext context) {
		return	FindContacterTestResponseUnmarshaller.unmarshall(this, context);
	}
}
