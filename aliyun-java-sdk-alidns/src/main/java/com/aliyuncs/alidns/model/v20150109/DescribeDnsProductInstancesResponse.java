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
import com.aliyuncs.alidns.transform.v20150109.DescribeDnsProductInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDnsProductInstancesResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private Long pageNumber;

	private Long pageSize;

	private List<DnsProduct> dnsProducts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
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

	public List<DnsProduct> getDnsProducts() {
		return this.dnsProducts;
	}

	public void setDnsProducts(List<DnsProduct> dnsProducts) {
		this.dnsProducts = dnsProducts;
	}

	public static class DnsProduct {

		private String instanceId;

		private String startTime;

		private String endTime;

		private String domain;

		private Long bindCount;

		private Long bindUsedCount;

		private Long tTLMinValue;

		private Long subDomainLevel;

		private Long dnsSLBCount;

		private Long uRLForwardCount;

		private Long dDosDefendFlow;

		private Long dDosDefendQuery;

		private Long overseaDDosDefendFlow;

		private String searchEngineLines;

		private String iSPLines;

		private String iSPRegionLines;

		private String overseaLine;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
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

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public Long getBindCount() {
			return this.bindCount;
		}

		public void setBindCount(Long bindCount) {
			this.bindCount = bindCount;
		}

		public Long getBindUsedCount() {
			return this.bindUsedCount;
		}

		public void setBindUsedCount(Long bindUsedCount) {
			this.bindUsedCount = bindUsedCount;
		}

		public Long getTTLMinValue() {
			return this.tTLMinValue;
		}

		public void setTTLMinValue(Long tTLMinValue) {
			this.tTLMinValue = tTLMinValue;
		}

		public Long getSubDomainLevel() {
			return this.subDomainLevel;
		}

		public void setSubDomainLevel(Long subDomainLevel) {
			this.subDomainLevel = subDomainLevel;
		}

		public Long getDnsSLBCount() {
			return this.dnsSLBCount;
		}

		public void setDnsSLBCount(Long dnsSLBCount) {
			this.dnsSLBCount = dnsSLBCount;
		}

		public Long getURLForwardCount() {
			return this.uRLForwardCount;
		}

		public void setURLForwardCount(Long uRLForwardCount) {
			this.uRLForwardCount = uRLForwardCount;
		}

		public Long getDDosDefendFlow() {
			return this.dDosDefendFlow;
		}

		public void setDDosDefendFlow(Long dDosDefendFlow) {
			this.dDosDefendFlow = dDosDefendFlow;
		}

		public Long getDDosDefendQuery() {
			return this.dDosDefendQuery;
		}

		public void setDDosDefendQuery(Long dDosDefendQuery) {
			this.dDosDefendQuery = dDosDefendQuery;
		}

		public Long getOverseaDDosDefendFlow() {
			return this.overseaDDosDefendFlow;
		}

		public void setOverseaDDosDefendFlow(Long overseaDDosDefendFlow) {
			this.overseaDDosDefendFlow = overseaDDosDefendFlow;
		}

		public String getSearchEngineLines() {
			return this.searchEngineLines;
		}

		public void setSearchEngineLines(String searchEngineLines) {
			this.searchEngineLines = searchEngineLines;
		}

		public String getISPLines() {
			return this.iSPLines;
		}

		public void setISPLines(String iSPLines) {
			this.iSPLines = iSPLines;
		}

		public String getISPRegionLines() {
			return this.iSPRegionLines;
		}

		public void setISPRegionLines(String iSPRegionLines) {
			this.iSPRegionLines = iSPRegionLines;
		}

		public String getOverseaLine() {
			return this.overseaLine;
		}

		public void setOverseaLine(String overseaLine) {
			this.overseaLine = overseaLine;
		}
	}

	@Override
	public DescribeDnsProductInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDnsProductInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
