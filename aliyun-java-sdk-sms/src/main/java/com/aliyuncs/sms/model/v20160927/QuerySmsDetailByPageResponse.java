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
package com.aliyuncs.sms.model.v20160927;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sms.transform.v20160927.QuerySmsDetailByPageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySmsDetailByPageResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<stat> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<stat> getdata() {
		return this.data;
	}

	public void setdata(List<stat> data) {
		this.data = data;
	}

	public static class stat {

		private String receiverNum;

		private String smsCode;

		private String smsContent;

		private Integer smsStatus;

		private String resultCode;

		public String getReceiverNum() {
			return this.receiverNum;
		}

		public void setReceiverNum(String receiverNum) {
			this.receiverNum = receiverNum;
		}

		public String getSmsCode() {
			return this.smsCode;
		}

		public void setSmsCode(String smsCode) {
			this.smsCode = smsCode;
		}

		public String getSmsContent() {
			return this.smsContent;
		}

		public void setSmsContent(String smsContent) {
			this.smsContent = smsContent;
		}

		public Integer getSmsStatus() {
			return this.smsStatus;
		}

		public void setSmsStatus(Integer smsStatus) {
			this.smsStatus = smsStatus;
		}

		public String getResultCode() {
			return this.resultCode;
		}

		public void setResultCode(String resultCode) {
			this.resultCode = resultCode;
		}
	}

	@Override
	public QuerySmsDetailByPageResponse getInstance(UnmarshallerContext context) {
		return	QuerySmsDetailByPageResponseUnmarshaller.unmarshall(this, context);
	}
}
