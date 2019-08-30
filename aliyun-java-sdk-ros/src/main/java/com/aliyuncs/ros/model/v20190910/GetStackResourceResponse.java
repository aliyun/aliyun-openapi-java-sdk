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

package com.aliyuncs.ros.model.v20190910;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ros.transform.v20190910.GetStackResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetStackResourceResponse extends AcsResponse {

	private String createTime;

	private String description;

	private String logicalResourceId;

	private Map<Object,Object> metadata;

	private String physicalResourceId;

	private String requestId;

	private String resourceType;

	private String stackId;

	private String stackName;

	private String status;

	private String statusReason;

	private String updateTime;

	private List<Map<Object,Object>> resourceAttributes;

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLogicalResourceId() {
		return this.logicalResourceId;
	}

	public void setLogicalResourceId(String logicalResourceId) {
		this.logicalResourceId = logicalResourceId;
	}

	public Map<Object,Object> getMetadata() {
		return this.metadata;
	}

	public void setMetadata(Map<Object,Object> metadata) {
		this.metadata = metadata;
	}

	public String getPhysicalResourceId() {
		return this.physicalResourceId;
	}

	public void setPhysicalResourceId(String physicalResourceId) {
		this.physicalResourceId = physicalResourceId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getStackId() {
		return this.stackId;
	}

	public void setStackId(String stackId) {
		this.stackId = stackId;
	}

	public String getStackName() {
		return this.stackName;
	}

	public void setStackName(String stackName) {
		this.stackName = stackName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusReason() {
		return this.statusReason;
	}

	public void setStatusReason(String statusReason) {
		this.statusReason = statusReason;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public List<Map<Object,Object>> getResourceAttributes() {
		return this.resourceAttributes;
	}

	public void setResourceAttributes(List<Map<Object,Object>> resourceAttributes) {
		this.resourceAttributes = resourceAttributes;
	}

	@Override
	public GetStackResourceResponse getInstance(UnmarshallerContext context) {
		return	GetStackResourceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
