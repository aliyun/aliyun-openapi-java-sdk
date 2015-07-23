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
package com.aliyuncs.yundun.model.v20150416;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.yundun.transform.v20150416.DdosLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DdosLogResponse extends AcsResponse {

	private String requestId;

	private Integer attackStatus;

	private String startTime;

	private String endTime;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<DdosLog> logList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getAttackStatus() {
		return this.attackStatus;
	}

	public void setAttackStatus(Integer attackStatus) {
		this.attackStatus = attackStatus;
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

	public List<DdosLog> getLogList() {
		return this.logList;
	}

	public void setLogList(List<DdosLog> logList) {
		this.logList = logList;
	}

	public static class DdosLog {

		private String startTime;

		private String endTime;

		private String reason;

		private Integer status;

		private Long bps;

		private Long pps;

		private Long qps;

		private String attackType;

		private String attackIpList;

		private Integer type;

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

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Long getBps() {
			return this.bps;
		}

		public void setBps(Long bps) {
			this.bps = bps;
		}

		public Long getPps() {
			return this.pps;
		}

		public void setPps(Long pps) {
			this.pps = pps;
		}

		public Long getQps() {
			return this.qps;
		}

		public void setQps(Long qps) {
			this.qps = qps;
		}

		public String getAttackType() {
			return this.attackType;
		}

		public void setAttackType(String attackType) {
			this.attackType = attackType;
		}

		public String getAttackIpList() {
			return this.attackIpList;
		}

		public void setAttackIpList(String attackIpList) {
			this.attackIpList = attackIpList;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}
	}

	@Override
	public DdosLogResponse getInstance(UnmarshallerContext context) {
		return	DdosLogResponseUnmarshaller.unmarshall(this, context);
	}
}
