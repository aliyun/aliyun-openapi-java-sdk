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

package com.aliyuncs.pairecservice.model.v20221213;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.pairecservice.transform.v20221213.GetExperimentGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetExperimentGroupResponse extends AcsResponse {

	private String requestId;

	private String layerId;

	private String laboratoryId;

	private String sceneId;

	private String name;

	private String description;

	private String debugUsers;

	private String debugCrowdId;

	private String owner;

	private Boolean needAA;

	private String filter;

	private String distributionType;

	private Integer distributionTimeDuration;

	private String crowdId;

	private String config;

	private String reservedBuckets;

	private String status;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLayerId() {
		return this.layerId;
	}

	public void setLayerId(String layerId) {
		this.layerId = layerId;
	}

	public String getLaboratoryId() {
		return this.laboratoryId;
	}

	public void setLaboratoryId(String laboratoryId) {
		this.laboratoryId = laboratoryId;
	}

	public String getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDebugUsers() {
		return this.debugUsers;
	}

	public void setDebugUsers(String debugUsers) {
		this.debugUsers = debugUsers;
	}

	public String getDebugCrowdId() {
		return this.debugCrowdId;
	}

	public void setDebugCrowdId(String debugCrowdId) {
		this.debugCrowdId = debugCrowdId;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Boolean getNeedAA() {
		return this.needAA;
	}

	public void setNeedAA(Boolean needAA) {
		this.needAA = needAA;
	}

	public String getFilter() {
		return this.filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public String getDistributionType() {
		return this.distributionType;
	}

	public void setDistributionType(String distributionType) {
		this.distributionType = distributionType;
	}

	public Integer getDistributionTimeDuration() {
		return this.distributionTimeDuration;
	}

	public void setDistributionTimeDuration(Integer distributionTimeDuration) {
		this.distributionTimeDuration = distributionTimeDuration;
	}

	public String getCrowdId() {
		return this.crowdId;
	}

	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}

	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public String getReservedBuckets() {
		return this.reservedBuckets;
	}

	public void setReservedBuckets(String reservedBuckets) {
		this.reservedBuckets = reservedBuckets;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public GetExperimentGroupResponse getInstance(UnmarshallerContext context) {
		return	GetExperimentGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
