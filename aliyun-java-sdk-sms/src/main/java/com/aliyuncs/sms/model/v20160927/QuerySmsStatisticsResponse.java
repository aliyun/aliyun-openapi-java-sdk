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
import com.aliyuncs.sms.transform.v20160927.QuerySmsStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySmsStatisticsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<stat> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

		private String createTime;

		private String requestCount;

		private String successCount;

		private String faildCount;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getrequestCount() {
			return this.requestCount;
		}

		public void setrequestCount(String requestCount) {
			this.requestCount = requestCount;
		}

		public String getsuccessCount() {
			return this.successCount;
		}

		public void setsuccessCount(String successCount) {
			this.successCount = successCount;
		}

		public String getfaildCount() {
			return this.faildCount;
		}

		public void setfaildCount(String faildCount) {
			this.faildCount = faildCount;
		}
	}

	@Override
	public QuerySmsStatisticsResponse getInstance(UnmarshallerContext context) {
		return	QuerySmsStatisticsResponseUnmarshaller.unmarshall(this, context);
	}
}
