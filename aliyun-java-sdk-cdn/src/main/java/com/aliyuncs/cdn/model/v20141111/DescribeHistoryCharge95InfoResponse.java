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
import com.aliyuncs.cdn.transform.v20141111.DescribeHistoryCharge95InfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHistoryCharge95InfoResponse extends AcsResponse {

	private String requestId;

	private Long pageNumber;

	private Long pageSize;

	private Long totalCount;

	private Long totalPages;

	private String userName;

	private List<HistoryCharge95Info> historyCharge95Infos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<HistoryCharge95Info> getHistoryCharge95Infos() {
		return this.historyCharge95Infos;
	}

	public void setHistoryCharge95Infos(List<HistoryCharge95Info> historyCharge95Infos) {
		this.historyCharge95Infos = historyCharge95Infos;
	}

	public static class HistoryCharge95Info {

		private String domainName;

		private String billTime;

		private String chargeItem;

		private Long max95Bps;

		private String max95BpsTime;

		private Float effectiveFactor;

		private String startTime;

		private String endTime;

		private Float proportion;

		private String downloadUrl;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getBillTime() {
			return this.billTime;
		}

		public void setBillTime(String billTime) {
			this.billTime = billTime;
		}

		public String getChargeItem() {
			return this.chargeItem;
		}

		public void setChargeItem(String chargeItem) {
			this.chargeItem = chargeItem;
		}

		public Long getMax95Bps() {
			return this.max95Bps;
		}

		public void setMax95Bps(Long max95Bps) {
			this.max95Bps = max95Bps;
		}

		public String getMax95BpsTime() {
			return this.max95BpsTime;
		}

		public void setMax95BpsTime(String max95BpsTime) {
			this.max95BpsTime = max95BpsTime;
		}

		public Float getEffectiveFactor() {
			return this.effectiveFactor;
		}

		public void setEffectiveFactor(Float effectiveFactor) {
			this.effectiveFactor = effectiveFactor;
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

		public Float getProportion() {
			return this.proportion;
		}

		public void setProportion(Float proportion) {
			this.proportion = proportion;
		}

		public String getDownloadUrl() {
			return this.downloadUrl;
		}

		public void setDownloadUrl(String downloadUrl) {
			this.downloadUrl = downloadUrl;
		}
	}

	@Override
	public DescribeHistoryCharge95InfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeHistoryCharge95InfoResponseUnmarshaller.unmarshall(this, context);
	}
}
