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
package com.aliyuncs.alidns.model.v20150109;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeBatchResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBatchResultResponse extends AcsResponse {

	private String requestId;

	private String traceId;

	private Long status;

	private Long batchCount;

	private Long successNumber;

	private List<FailResult> failResults;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getBatchCount() {
		return this.batchCount;
	}

	public void setBatchCount(Long batchCount) {
		this.batchCount = batchCount;
	}

	public Long getSuccessNumber() {
		return this.successNumber;
	}

	public void setSuccessNumber(Long successNumber) {
		this.successNumber = successNumber;
	}

	public List<FailResult> getFailResults() {
		return this.failResults;
	}

	public void setFailResults(List<FailResult> failResults) {
		this.failResults = failResults;
	}

	public static class FailResult {

		private String batchIndex;

		private String errorCode;

		public String getBatchIndex() {
			return this.batchIndex;
		}

		public void setBatchIndex(String batchIndex) {
			this.batchIndex = batchIndex;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
	}

	@Override
	public DescribeBatchResultResponse getInstance(UnmarshallerContext context) {
		return	DescribeBatchResultResponseUnmarshaller.unmarshall(this, context);
	}
}
