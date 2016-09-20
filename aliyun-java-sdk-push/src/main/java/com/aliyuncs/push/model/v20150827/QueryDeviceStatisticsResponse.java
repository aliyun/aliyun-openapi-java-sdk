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
package com.aliyuncs.push.model.v20150827;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.push.transform.v20150827.QueryDeviceStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDeviceStatisticsResponse extends AcsResponse {

	private String requestId;

	private List<PushDeviceStatisticsInfo> pushDeviceStatisticsInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PushDeviceStatisticsInfo> getPushDeviceStatisticsInfos() {
		return this.pushDeviceStatisticsInfos;
	}

	public void setPushDeviceStatisticsInfos(List<PushDeviceStatisticsInfo> pushDeviceStatisticsInfos) {
		this.pushDeviceStatisticsInfos = pushDeviceStatisticsInfos;
	}

	public static class PushDeviceStatisticsInfo {

		private String date;

		private Integer deviceType;

		private Integer count;

		public String getDate() {
			return this.date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public Integer getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(Integer deviceType) {
			this.deviceType = deviceType;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public QueryDeviceStatisticsResponse getInstance(UnmarshallerContext context) {
		return	QueryDeviceStatisticsResponseUnmarshaller.unmarshall(this, context);
	}
}
