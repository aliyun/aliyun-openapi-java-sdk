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
import com.aliyuncs.pairecservice.transform.v20221213.GetExperimentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetExperimentResponse extends AcsResponse {

	private String requestId;

	private String aliasExperimentId;

	private String experimentGroupId;

	private String layerId;

	private String laboratoryId;

	private String sceneId;

	private String name;

	private String description;

	private String type;

	private Integer flowPercent;

	private String buckets;

	private String debugUsers;

	private String debugCrowdId;

	private String config;

	private String status;

	private String gmtCreateTime;

	private String gmtModifiedTime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAliasExperimentId() {
		return this.aliasExperimentId;
	}

	public void setAliasExperimentId(String aliasExperimentId) {
		this.aliasExperimentId = aliasExperimentId;
	}

	public String getExperimentGroupId() {
		return this.experimentGroupId;
	}

	public void setExperimentGroupId(String experimentGroupId) {
		this.experimentGroupId = experimentGroupId;
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getFlowPercent() {
		return this.flowPercent;
	}

	public void setFlowPercent(Integer flowPercent) {
		this.flowPercent = flowPercent;
	}

	public String getBuckets() {
		return this.buckets;
	}

	public void setBuckets(String buckets) {
		this.buckets = buckets;
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

	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGmtCreateTime() {
		return this.gmtCreateTime;
	}

	public void setGmtCreateTime(String gmtCreateTime) {
		this.gmtCreateTime = gmtCreateTime;
	}

	public String getGmtModifiedTime() {
		return this.gmtModifiedTime;
	}

	public void setGmtModifiedTime(String gmtModifiedTime) {
		this.gmtModifiedTime = gmtModifiedTime;
	}

	@Override
	public GetExperimentResponse getInstance(UnmarshallerContext context) {
		return	GetExperimentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
