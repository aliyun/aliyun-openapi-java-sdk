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
import com.aliyuncs.eas.transform.v20210701.DescribeResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourceResponse extends AcsResponse {

	private String requestId;

	private String resourceId;

	private String resourceName;

	private String clusterId;

	private String createTime;

	private String updateTime;

	private String ownerUid;

	private Integer instanceCount;

	private Integer prePaidInstanceCount;

	private Integer postPaidInstanceCount;

	private Integer cpuCount;

	private Integer gpuCount;

	private String status;

	private String message;

	private String extraData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceName() {
		return this.resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
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

	public String getOwnerUid() {
		return this.ownerUid;
	}

	public void setOwnerUid(String ownerUid) {
		this.ownerUid = ownerUid;
	}

	public Integer getInstanceCount() {
		return this.instanceCount;
	}

	public void setInstanceCount(Integer instanceCount) {
		this.instanceCount = instanceCount;
	}

	public Integer getPrePaidInstanceCount() {
		return this.prePaidInstanceCount;
	}

	public void setPrePaidInstanceCount(Integer prePaidInstanceCount) {
		this.prePaidInstanceCount = prePaidInstanceCount;
	}

	public Integer getPostPaidInstanceCount() {
		return this.postPaidInstanceCount;
	}

	public void setPostPaidInstanceCount(Integer postPaidInstanceCount) {
		this.postPaidInstanceCount = postPaidInstanceCount;
	}

	public Integer getCpuCount() {
		return this.cpuCount;
	}

	public void setCpuCount(Integer cpuCount) {
		this.cpuCount = cpuCount;
	}

	public Integer getGpuCount() {
		return this.gpuCount;
	}

	public void setGpuCount(Integer gpuCount) {
		this.gpuCount = gpuCount;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getExtraData() {
		return this.extraData;
	}

	public void setExtraData(String extraData) {
		this.extraData = extraData;
	}

	@Override
	public DescribeResourceResponse getInstance(UnmarshallerContext context) {
		return	DescribeResourceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
