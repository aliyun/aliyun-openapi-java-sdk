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
import com.aliyuncs.yundun.transform.v20150416.WafLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class WafLogResponse extends AcsResponse {

	private String requestId;

	private Integer webAttack;

	private Boolean newWafUser;

	private Boolean wafOpened;

	private Boolean inWhiteList;

	private Integer domainCount;

	private String startTime;

	private String endTime;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<WafLog> logList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getWebAttack() {
		return this.webAttack;
	}

	public void setWebAttack(Integer webAttack) {
		this.webAttack = webAttack;
	}

	public Boolean getNewWafUser() {
		return this.newWafUser;
	}

	public void setNewWafUser(Boolean newWafUser) {
		this.newWafUser = newWafUser;
	}

	public Boolean getWafOpened() {
		return this.wafOpened;
	}

	public void setWafOpened(Boolean wafOpened) {
		this.wafOpened = wafOpened;
	}

	public Boolean getInWhiteList() {
		return this.inWhiteList;
	}

	public void setInWhiteList(Boolean inWhiteList) {
		this.inWhiteList = inWhiteList;
	}

	public Integer getDomainCount() {
		return this.domainCount;
	}

	public void setDomainCount(Integer domainCount) {
		this.domainCount = domainCount;
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

	public List<WafLog> getLogList() {
		return this.logList;
	}

	public void setLogList(List<WafLog> logList) {
		this.logList = logList;
	}

	public static class WafLog {

		private String sourceIp;

		private String time;

		private String url;

		private String type;

		private Integer status;

		public String getSourceIp() {
			return this.sourceIp;
		}

		public void setSourceIp(String sourceIp) {
			this.sourceIp = sourceIp;
		}

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
	}

	@Override
	public WafLogResponse getInstance(UnmarshallerContext context) {
		return	WafLogResponseUnmarshaller.unmarshall(this, context);
	}
}
