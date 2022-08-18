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
import com.aliyuncs.alidns.transform.v20150109.DescribeDnsProductInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDnsProductInstanceResponse extends AcsResponse {

	private Long monitorNodeCount;

	private Boolean inBlackHole;

	private Long bindDomainCount;

	private Boolean regionLines;

	private Long bindCount;

	private String endTime;

	private Long startTimestamp;

	private String iSPLines;

	private Long endTimestamp;

	private Long dDosDefendQuery;

	private String dnsSecurity;

	private String domainType;

	private Long uRLForwardCount;

	private Long tTLMinValue;

	private String paymentType;

	private String versionName;

	private String overseaLine;

	private String iSPRegionLines;

	private Boolean gslb;

	private Long bindUsedCount;

	private String requestId;

	private Long dnsSLBCount;

	private String instanceId;

	private Long monitorTaskCount;

	private String startTime;

	private Long dDosDefendFlow;

	private Long monitorFrequency;

	private String searchEngineLines;

	private Long bindDomainUsedCount;

	private String versionCode;

	private Long overseaDDosDefendFlow;

	private Boolean inClean;

	private Long subDomainLevel;

	private String domain;

	private List<String> dnsServers;

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

	public Long getBindDomainCount() {
		return this.bindDomainCount;
	}

	public void setBindDomainCount(Long bindDomainCount) {
		this.bindDomainCount = bindDomainCount;
	}

	public Boolean getRegionLines() {
		return this.regionLines;
	}

	public void setRegionLines(Boolean regionLines) {
		this.regionLines = regionLines;
	}

	public Long getBindCount() {
		return this.bindCount;
	}

	public void setBindCount(Long bindCount) {
		this.bindCount = bindCount;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Long getStartTimestamp() {
		return this.startTimestamp;
	}

	public void setStartTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
	}

	public String getISPLines() {
		return this.iSPLines;
	}

	public void setISPLines(String iSPLines) {
		this.iSPLines = iSPLines;
	}

	public Long getEndTimestamp() {
		return this.endTimestamp;
	}

	public void setEndTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
	}

	public Long getDDosDefendQuery() {
		return this.dDosDefendQuery;
	}

	public void setDDosDefendQuery(Long dDosDefendQuery) {
		this.dDosDefendQuery = dDosDefendQuery;
	}

	public String getDnsSecurity() {
		return this.dnsSecurity;
	}

	public void setDnsSecurity(String dnsSecurity) {
		this.dnsSecurity = dnsSecurity;
	}

	public String getDomainType() {
		return this.domainType;
	}

	public void setDomainType(String domainType) {
		this.domainType = domainType;
	}

	public Long getURLForwardCount() {
		return this.uRLForwardCount;
	}

	public void setURLForwardCount(Long uRLForwardCount) {
		this.uRLForwardCount = uRLForwardCount;
	}

	public Long getTTLMinValue() {
		return this.tTLMinValue;
	}

	public void setTTLMinValue(Long tTLMinValue) {
		this.tTLMinValue = tTLMinValue;
	}

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getVersionName() {
		return this.versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public String getOverseaLine() {
		return this.overseaLine;
	}

	public void setOverseaLine(String overseaLine) {
		this.overseaLine = overseaLine;
	}

	public String getISPRegionLines() {
		return this.iSPRegionLines;
	}

	public void setISPRegionLines(String iSPRegionLines) {
		this.iSPRegionLines = iSPRegionLines;
	}

	public Boolean getGslb() {
		return this.gslb;
	}

	public void setGslb(Boolean gslb) {
		this.gslb = gslb;
	}

	public Long getBindUsedCount() {
		return this.bindUsedCount;
	}

	public void setBindUsedCount(Long bindUsedCount) {
		this.bindUsedCount = bindUsedCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getDnsSLBCount() {
		return this.dnsSLBCount;
	}

	public void setDnsSLBCount(Long dnsSLBCount) {
		this.dnsSLBCount = dnsSLBCount;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public Long getMonitorTaskCount() {
		return this.monitorTaskCount;
	}

	public void setMonitorTaskCount(Long monitorTaskCount) {
		this.monitorTaskCount = monitorTaskCount;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public Long getDDosDefendFlow() {
		return this.dDosDefendFlow;
	}

	public void setDDosDefendFlow(Long dDosDefendFlow) {
		this.dDosDefendFlow = dDosDefendFlow;
	}

	public Long getMonitorFrequency() {
		return this.monitorFrequency;
	}

	public void setMonitorFrequency(Long monitorFrequency) {
		this.monitorFrequency = monitorFrequency;
	}

	public String getSearchEngineLines() {
		return this.searchEngineLines;
	}

	public void setSearchEngineLines(String searchEngineLines) {
		this.searchEngineLines = searchEngineLines;
	}

	public Long getBindDomainUsedCount() {
		return this.bindDomainUsedCount;
	}

	public void setBindDomainUsedCount(Long bindDomainUsedCount) {
		this.bindDomainUsedCount = bindDomainUsedCount;
	}

	public String getVersionCode() {
		return this.versionCode;
	}

	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}

	public Long getOverseaDDosDefendFlow() {
		return this.overseaDDosDefendFlow;
	}

	public void setOverseaDDosDefendFlow(Long overseaDDosDefendFlow) {
		this.overseaDDosDefendFlow = overseaDDosDefendFlow;
	}

	public Boolean getInClean() {
		return this.inClean;
	}

	public void setInClean(Boolean inClean) {
		this.inClean = inClean;
	}

	public Long getSubDomainLevel() {
		return this.subDomainLevel;
	}

	public void setSubDomainLevel(Long subDomainLevel) {
		this.subDomainLevel = subDomainLevel;
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public List<String> getDnsServers() {
		return this.dnsServers;
	}

	public void setDnsServers(List<String> dnsServers) {
		this.dnsServers = dnsServers;
	}

	@Override
	public DescribeDnsProductInstanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeDnsProductInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
