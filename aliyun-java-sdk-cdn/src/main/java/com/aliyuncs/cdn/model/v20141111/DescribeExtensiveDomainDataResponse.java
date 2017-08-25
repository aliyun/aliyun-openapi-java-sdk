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
package com.aliyuncs.cdn.model.v20141111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeExtensiveDomainDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeExtensiveDomainDataResponse extends AcsResponse {

	private String requestId;

	private String extensiveDomain;

	private String dataInterval;

	private String startTime;

	private String endTime;

	private String pageNumber;

	private String totalCount;

	private String pageSize;

	private List<UsageData> dataPerInterval;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getExtensiveDomain() {
		return this.extensiveDomain;
	}

	public void setExtensiveDomain(String extensiveDomain) {
		this.extensiveDomain = extensiveDomain;
	}

	public String getDataInterval() {
		return this.dataInterval;
	}

	public void setDataInterval(String dataInterval) {
		this.dataInterval = dataInterval;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public List<UsageData> getDataPerInterval() {
		return this.dataPerInterval;
	}

	public void setDataPerInterval(List<UsageData> dataPerInterval) {
		this.dataPerInterval = dataPerInterval;
	}

	public static class UsageData {

		private String exactDomain;

		private String timeStamp;

		private String acc;

		private String flow;

		public String getExactDomain() {
			return this.exactDomain;
		}

		public void setExactDomain(String exactDomain) {
			this.exactDomain = exactDomain;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getAcc() {
			return this.acc;
		}

		public void setAcc(String acc) {
			this.acc = acc;
		}

		public String getFlow() {
			return this.flow;
		}

		public void setFlow(String flow) {
			this.flow = flow;
		}
	}

	@Override
	public DescribeExtensiveDomainDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeExtensiveDomainDataResponseUnmarshaller.unmarshall(this, context);
	}
}
