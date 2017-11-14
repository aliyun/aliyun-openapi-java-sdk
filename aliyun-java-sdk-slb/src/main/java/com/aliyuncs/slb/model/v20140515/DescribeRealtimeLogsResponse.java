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
package com.aliyuncs.slb.model.v20140515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.DescribeRealtimeLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRealtimeLogsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Long totalCount;

	private String progress;

	private List<LBRealTimeLog> lBRealTimeLogsSet;

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

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getProgress() {
		return this.progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}

	public List<LBRealTimeLog> getLBRealTimeLogsSet() {
		return this.lBRealTimeLogsSet;
	}

	public void setLBRealTimeLogsSet(List<LBRealTimeLog> lBRealTimeLogsSet) {
		this.lBRealTimeLogsSet = lBRealTimeLogsSet;
	}

	public static class LBRealTimeLog {

		private String logDetail;

		public String getLogDetail() {
			return this.logDetail;
		}

		public void setLogDetail(String logDetail) {
			this.logDetail = logDetail;
		}
	}

	@Override
	public DescribeRealtimeLogsResponse getInstance(UnmarshallerContext context) {
		return	DescribeRealtimeLogsResponseUnmarshaller.unmarshall(this, context);
	}
}
