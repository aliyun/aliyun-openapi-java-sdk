/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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

	private Long totalCount;

	private String domainType;

	private Long pageSize;

	private String requestId;

	private Long pageNumber;

	private List<DnsProduct> dnsProducts;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getDomainType() {
		return this.domainType;
	}

	public void setDomainType(String domainType) {
		this.domainType = domainType;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

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

	public List<DnsProduct> getDnsProducts() {
		return this.dnsProducts;
	}

	public void setDnsProducts(List<DnsProduct> dnsProducts) {
		this.dnsProducts = dnsProducts;
	}

	public static class DnsProduct {

		private String overseaLine;

		private String paymentType;

		private Long monitorNodeCount;

		private Boolean inBlackHole;

		private Long bindDomainUsedCount;

		private String iSPRegionLines;

		private Long tTLMinValue;

		private String iSPLines;

		private String searchEngineLines;

		private Long endTimestamp;

		private String versionName;

		private String versionCode;

		private Long monitorTaskCount;

		private Long bindUsedCount;

		private String domain;

		private Long monitorFrequency;

		private Boolean inClean;

		private Long uRLForwardCount;

		private Long startTimestamp;

		private Long dDosDefendQuery;

		private String instanceId;

		private Long dDosDefendFlow;

		private Long bindCount;

		private Long subDomainLevel;

		private Long bindDomainCount;

		private String endTime;

		private String startTime;

		private Long overseaDDosDefendFlow;

		private Boolean regionLines;

		private Boolean gslb;

		private String dnsSecurity;

		private Long dnsSLBCount;

		public String getOverseaLine() {
			return this.overseaLine;
		}

		public void setOverseaLine(String overseaLine) {
			this.overseaLine = overseaLine;
		}

		public String getPaymentType() {
			return this.paymentType;
		}

		public void setPaymentType(String paymentType) {
			this.paymentType = paymentType;
		}

		public Long getMonitorNodeCount() {
			return this.monitorNodeCount;
		}

		public void setMonitorNodeCount(Long monitorNodeCount) {
			this.monitorNodeCount = monitorNodeCount;
		}

		public Boolean getInBlackHole() {
			return this.inBlackHole;
		}

		public void setInBlackHole(Boolean inBlackHole) {
			this.inBlackHole = inBlackHole;
		}

		public Long getBindDomainUsedCount() {
			return this.bindDomainUsedCount;
		}

		public void setBindDomainUsedCount(Long bindDomainUsedCount) {
			this.bindDomainUsedCount = bindDomainUsedCount;
		}

		public String getISPRegionLines() {
			return this.iSPRegionLines;
		}

		public void setISPRegionLines(String iSPRegionLines) {
			this.iSPRegionLines = iSPRegionLines;
		}

		public Long getTTLMinValue() {
			return this.tTLMinValue;
		}

		public void setTTLMinValue(Long tTLMinValue) {
			this.tTLMinValue = tTLMinValue;
		}

		public String getISPLines() {
			return this.iSPLines;
		}

		public void setISPLines(String iSPLines) {
			this.iSPLines = iSPLines;
		}

		public String getSearchEngineLines() {
			return this.searchEngineLines;
		}

		public void setSearchEngineLines(String searchEngineLines) {
			this.searchEngineLines = searchEngineLines;
		}

		public Long getEndTimestamp() {
			return this.endTimestamp;
		}

		public void setEndTimestamp(Long endTimestamp) {
			this.endTimestamp = endTimestamp;
		}

		public String getVersionName() {
			return this.versionName;
		}

		public void setVersionName(String versionName) {
			this.versionName = versionName;
		}

		public String getVersionCode() {
			return this.versionCode;
		}

		public void setVersionCode(String versionCode) {
			this.versionCode = versionCode;
		}

		public Long getMonitorTaskCount() {
			return this.monitorTaskCount;
		}

		public void setMonitorTaskCount(Long monitorTaskCount) {
			this.monitorTaskCount = monitorTaskCount;
		}

		public Long getBindUsedCount() {
			return this.bindUsedCount;
		}

		public void setBindUsedCount(Long bindUsedCount) {
			this.bindUsedCount = bindUsedCount;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public Long getMonitorFrequency() {
			return this.monitorFrequency;
		}

		public void setMonitorFrequency(Long monitorFrequency) {
			this.monitorFrequency = monitorFrequency;
		}

		public Boolean getInClean() {
			return this.inClean;
		}

		public void setInClean(Boolean inClean) {
			this.inClean = inClean;
		}

		public Long getURLForwardCount() {
			return this.uRLForwardCount;
		}

		public void setURLForwardCount(Long uRLForwardCount) {
			this.uRLForwardCount = uRLForwardCount;
		}

		public Long getStartTimestamp() {
			return this.startTimestamp;
		}

		public void setStartTimestamp(Long startTimestamp) {
			this.startTimestamp = startTimestamp;
		}

		public Long getDDosDefendQuery() {
			return this.dDosDefendQuery;
		}

		public void setDDosDefendQuery(Long dDosDefendQuery) {
			this.dDosDefendQuery = dDosDefendQuery;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getDDosDefendFlow() {
			return this.dDosDefendFlow;
		}

		public void setDDosDefendFlow(Long dDosDefendFlow) {
			this.dDosDefendFlow = dDosDefendFlow;
		}

		public Long getBindCount() {
			return this.bindCount;
		}

		public void setBindCount(Long bindCount) {
			this.bindCount = bindCount;
		}

		public Long getSubDomainLevel() {
			return this.subDomainLevel;
		}

		public void setSubDomainLevel(Long subDomainLevel) {
			this.subDomainLevel = subDomainLevel;
		}

		public Long getBindDomainCount() {
			return this.bindDomainCount;
		}

		public void setBindDomainCount(Long bindDomainCount) {
			this.bindDomainCount = bindDomainCount;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public Long getOverseaDDosDefendFlow() {
			return this.overseaDDosDefendFlow;
		}

		public void setOverseaDDosDefendFlow(Long overseaDDosDefendFlow) {
			this.overseaDDosDefendFlow = overseaDDosDefendFlow;
		}

		public Boolean getRegionLines() {
			return this.regionLines;
		}

		public void setRegionLines(Boolean regionLines) {
			this.regionLines = regionLines;
		}

		public Boolean getGslb() {
			return this.gslb;
		}

		public void setGslb(Boolean gslb) {
			this.gslb = gslb;
		}

		public String getDnsSecurity() {
			return this.dnsSecurity;
		}

		public void setDnsSecurity(String dnsSecurity) {
			this.dnsSecurity = dnsSecurity;
		}

		public Long getDnsSLBCount() {
			return this.dnsSLBCount;
		}

		public void setDnsSLBCount(Long dnsSLBCount) {
			this.dnsSLBCount = dnsSLBCount;
		}
	}

	@Override
	public DescribeDnsProductInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDnsProductInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
