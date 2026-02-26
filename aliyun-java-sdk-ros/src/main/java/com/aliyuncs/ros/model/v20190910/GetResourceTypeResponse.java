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

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ros.transform.v20190910.GetResourceTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetResourceTypeResponse extends AcsResponse {

	private String requestId;

	private Map<Object,Object> attributes;

	private String resourceType;

	private Map<Object,Object> properties;

	private Boolean supportDriftDetection;

	private Boolean supportScratchDetection;

	private String entityType;

	private String provider;

	private String description;

	private String defaultVersionId;

	private String latestVersionId;

	private String createTime;

	private String updateTime;

	private Integer totalVersionCount;

	private Boolean reachVersionCountLimit;

	private Boolean isDefaultVersion;

	private String templateBody;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Map<Object,Object> getAttributes() {
		return this.attributes;
	}

	public void setAttributes(Map<Object,Object> attributes) {
		this.attributes = attributes;
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public Map<Object,Object> getProperties() {
		return this.properties;
	}

	public void setProperties(Map<Object,Object> properties) {
		this.properties = properties;
	}

	public Boolean getSupportDriftDetection() {
		return this.supportDriftDetection;
	}

	public void setSupportDriftDetection(Boolean supportDriftDetection) {
		this.supportDriftDetection = supportDriftDetection;
	}

	public Boolean getSupportScratchDetection() {
		return this.supportScratchDetection;
	}

	public void setSupportScratchDetection(Boolean supportScratchDetection) {
		this.supportScratchDetection = supportScratchDetection;
	}

	public String getEntityType() {
		return this.entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getProvider() {
		return this.provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDefaultVersionId() {
		return this.defaultVersionId;
	}

	public void setDefaultVersionId(String defaultVersionId) {
		this.defaultVersionId = defaultVersionId;
	}

	public String getLatestVersionId() {
		return this.latestVersionId;
	}

	public void setLatestVersionId(String latestVersionId) {
		this.latestVersionId = latestVersionId;
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

	public Integer getTotalVersionCount() {
		return this.totalVersionCount;
	}

	public void setTotalVersionCount(Integer totalVersionCount) {
		this.totalVersionCount = totalVersionCount;
	}

	public Boolean getReachVersionCountLimit() {
		return this.reachVersionCountLimit;
	}

	public void setReachVersionCountLimit(Boolean reachVersionCountLimit) {
		this.reachVersionCountLimit = reachVersionCountLimit;
	}

	public Boolean getIsDefaultVersion() {
		return this.isDefaultVersion;
	}

	public void setIsDefaultVersion(Boolean isDefaultVersion) {
		this.isDefaultVersion = isDefaultVersion;
	}

	public String getTemplateBody() {
		return this.templateBody;
	}

	public void setTemplateBody(String templateBody) {
		this.templateBody = templateBody;
	}

	@Override
	public GetResourceTypeResponse getInstance(UnmarshallerContext context) {
		return	GetResourceTypeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
