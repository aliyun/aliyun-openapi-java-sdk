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

package com.aliyuncs.ecsinc.model.v20160314;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsinc.transform.v20160314.QueryEcsInstanceOrderInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryEcsInstanceOrderInfoResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private Boolean bandwidthByFlow;

	private Integer baseBandwidth;

	private String renewChangeBeginTime;

	private String renewChangeEndTime;

	private Boolean renewChanged;

	private Boolean localOfSystemDisk;

	private String elasticModificationUtcEndTime;

	private Boolean includeActiveElasticModification;

	private String baseInstanceType;

	private Integer downgradeTimes;

	private Integer downgradeAvailableTimes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public Boolean getBandwidthByFlow() {
		return this.bandwidthByFlow;
	}

	public void setBandwidthByFlow(Boolean bandwidthByFlow) {
		this.bandwidthByFlow = bandwidthByFlow;
	}

	public Integer getBaseBandwidth() {
		return this.baseBandwidth;
	}

	public void setBaseBandwidth(Integer baseBandwidth) {
		this.baseBandwidth = baseBandwidth;
	}

	public String getRenewChangeBeginTime() {
		return this.renewChangeBeginTime;
	}

	public void setRenewChangeBeginTime(String renewChangeBeginTime) {
		this.renewChangeBeginTime = renewChangeBeginTime;
	}

	public String getRenewChangeEndTime() {
		return this.renewChangeEndTime;
	}

	public void setRenewChangeEndTime(String renewChangeEndTime) {
		this.renewChangeEndTime = renewChangeEndTime;
	}

	public Boolean getRenewChanged() {
		return this.renewChanged;
	}

	public void setRenewChanged(Boolean renewChanged) {
		this.renewChanged = renewChanged;
	}

	public Boolean getLocalOfSystemDisk() {
		return this.localOfSystemDisk;
	}

	public void setLocalOfSystemDisk(Boolean localOfSystemDisk) {
		this.localOfSystemDisk = localOfSystemDisk;
	}

	public String getElasticModificationUtcEndTime() {
		return this.elasticModificationUtcEndTime;
	}

	public void setElasticModificationUtcEndTime(String elasticModificationUtcEndTime) {
		this.elasticModificationUtcEndTime = elasticModificationUtcEndTime;
	}

	public Boolean getIncludeActiveElasticModification() {
		return this.includeActiveElasticModification;
	}

	public void setIncludeActiveElasticModification(Boolean includeActiveElasticModification) {
		this.includeActiveElasticModification = includeActiveElasticModification;
	}

	public String getBaseInstanceType() {
		return this.baseInstanceType;
	}

	public void setBaseInstanceType(String baseInstanceType) {
		this.baseInstanceType = baseInstanceType;
	}

	public Integer getDowngradeTimes() {
		return this.downgradeTimes;
	}

	public void setDowngradeTimes(Integer downgradeTimes) {
		this.downgradeTimes = downgradeTimes;
	}

	public Integer getDowngradeAvailableTimes() {
		return this.downgradeAvailableTimes;
	}

	public void setDowngradeAvailableTimes(Integer downgradeAvailableTimes) {
		this.downgradeAvailableTimes = downgradeAvailableTimes;
	}

	@Override
	public QueryEcsInstanceOrderInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryEcsInstanceOrderInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
