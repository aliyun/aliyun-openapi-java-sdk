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

package com.aliyuncs.eas.model.v20210701;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.eas.transform.v20210701.DescribeServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeServiceResponse extends AcsResponse {

	private String requestId;

	private String region;

	private String callerUid;

	private String parentUid;

	private Integer currentVersion;

	private Integer cpu;

	private Integer gpu;

	private String image;

	private Integer pendingInstance;

	private Integer runningInstance;

	private Integer totalInstance;

	private String internetEndpoint;

	private String intranetEndpoint;

	private Integer latestVersion;

	private Integer memory;

	private String message;

	private String namespace;

	private String reason;

	private String resource;

	private String serviceConfig;

	private String serviceName;

	private String status;

	private String createTime;

	private String updateTime;

	private Integer weight;

	private String serviceId;

	private String accessToken;

	private String source;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCallerUid() {
		return this.callerUid;
	}

	public void setCallerUid(String callerUid) {
		this.callerUid = callerUid;
	}

	public String getParentUid() {
		return this.parentUid;
	}

	public void setParentUid(String parentUid) {
		this.parentUid = parentUid;
	}

	public Integer getCurrentVersion() {
		return this.currentVersion;
	}

	public void setCurrentVersion(Integer currentVersion) {
		this.currentVersion = currentVersion;
	}

	public Integer getCpu() {
		return this.cpu;
	}

	public void setCpu(Integer cpu) {
		this.cpu = cpu;
	}

	public Integer getGpu() {
		return this.gpu;
	}

	public void setGpu(Integer gpu) {
		this.gpu = gpu;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getPendingInstance() {
		return this.pendingInstance;
	}

	public void setPendingInstance(Integer pendingInstance) {
		this.pendingInstance = pendingInstance;
	}

	public Integer getRunningInstance() {
		return this.runningInstance;
	}

	public void setRunningInstance(Integer runningInstance) {
		this.runningInstance = runningInstance;
	}

	public Integer getTotalInstance() {
		return this.totalInstance;
	}

	public void setTotalInstance(Integer totalInstance) {
		this.totalInstance = totalInstance;
	}

	public String getInternetEndpoint() {
		return this.internetEndpoint;
	}

	public void setInternetEndpoint(String internetEndpoint) {
		this.internetEndpoint = internetEndpoint;
	}

	public String getIntranetEndpoint() {
		return this.intranetEndpoint;
	}

	public void setIntranetEndpoint(String intranetEndpoint) {
		this.intranetEndpoint = intranetEndpoint;
	}

	public Integer getLatestVersion() {
		return this.latestVersion;
	}

	public void setLatestVersion(Integer latestVersion) {
		this.latestVersion = latestVersion;
	}

	public Integer getMemory() {
		return this.memory;
	}

	public void setMemory(Integer memory) {
		this.memory = memory;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getResource() {
		return this.resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public String getServiceConfig() {
		return this.serviceConfig;
	}

	public void setServiceConfig(String serviceConfig) {
		this.serviceConfig = serviceConfig;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getWeight() {
		return this.weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public DescribeServiceResponse getInstance(UnmarshallerContext context) {
		return	DescribeServiceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
