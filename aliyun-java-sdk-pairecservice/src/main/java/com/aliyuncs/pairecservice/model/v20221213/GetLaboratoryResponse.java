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
import com.aliyuncs.pairecservice.transform.v20221213.GetLaboratoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLaboratoryResponse extends AcsResponse {

	private String requestId;

	private String sceneId;

	private String name;

	private String description;

	private String debugUsers;

	private String debugCrowdId;

	private Integer bucketCount;

	private String buckets;

	private String bucketType;

	private String filter;

	private String environment;

	private String type;

	private String status;

	private String crowdId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getBucketCount() {
		return this.bucketCount;
	}

	public void setBucketCount(Integer bucketCount) {
		this.bucketCount = bucketCount;
	}

	public String getBuckets() {
		return this.buckets;
	}

	public void setBuckets(String buckets) {
		this.buckets = buckets;
	}

	public String getBucketType() {
		return this.bucketType;
	}

	public void setBucketType(String bucketType) {
		this.bucketType = bucketType;
	}

	public String getFilter() {
		return this.filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public String getEnvironment() {
		return this.environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCrowdId() {
		return this.crowdId;
	}

	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}

	@Override
	public GetLaboratoryResponse getInstance(UnmarshallerContext context) {
		return	GetLaboratoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
