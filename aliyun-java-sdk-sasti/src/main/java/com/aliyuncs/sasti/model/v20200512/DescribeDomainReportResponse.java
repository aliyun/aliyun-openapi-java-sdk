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

package com.aliyuncs.sasti.model.v20200512;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sasti.transform.v20200512.DescribeDomainReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainReportResponse extends AcsResponse {

	private String intelligences;

	private String domain;

	private String sslCert;

	private String attackPreferenceTop5;

	private String threatTypes;

	private String confidence;

	private String threatLevel;

	private String attackCntByThreatType;

	private String context;

	private String whois;

	private String requestId;

	private String scenario;

	private String basic;

	private String group;

	public String getIntelligences() {
		return this.intelligences;
	}

	public void setIntelligences(String intelligences) {
		this.intelligences = intelligences;
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getSslCert() {
		return this.sslCert;
	}

	public void setSslCert(String sslCert) {
		this.sslCert = sslCert;
	}

	public String getAttackPreferenceTop5() {
		return this.attackPreferenceTop5;
	}

	public void setAttackPreferenceTop5(String attackPreferenceTop5) {
		this.attackPreferenceTop5 = attackPreferenceTop5;
	}

	public String getThreatTypes() {
		return this.threatTypes;
	}

	public void setThreatTypes(String threatTypes) {
		this.threatTypes = threatTypes;
	}

	public String getConfidence() {
		return this.confidence;
	}

	public void setConfidence(String confidence) {
		this.confidence = confidence;
	}

	public String getThreatLevel() {
		return this.threatLevel;
	}

	public void setThreatLevel(String threatLevel) {
		this.threatLevel = threatLevel;
	}

	public String getAttackCntByThreatType() {
		return this.attackCntByThreatType;
	}

	public void setAttackCntByThreatType(String attackCntByThreatType) {
		this.attackCntByThreatType = attackCntByThreatType;
	}

	public String getContext() {
		return this.context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getWhois() {
		return this.whois;
	}

	public void setWhois(String whois) {
		this.whois = whois;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getScenario() {
		return this.scenario;
	}

	public void setScenario(String scenario) {
		this.scenario = scenario;
	}

	public String getBasic() {
		return this.basic;
	}

	public void setBasic(String basic) {
		this.basic = basic;
	}

	public String getGroup() {
		return this.group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public DescribeDomainReportResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainReportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
