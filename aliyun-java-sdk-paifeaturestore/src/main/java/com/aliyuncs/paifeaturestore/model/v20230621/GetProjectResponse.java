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

package com.aliyuncs.paifeaturestore.model.v20230621;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.paifeaturestore.transform.v20230621.GetProjectResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetProjectResponse extends AcsResponse {

	private String requestId;

	private String name;

	private String description;

	private String offlineDatasourceType;

	private String offlineDatasourceId;

	private String offlineDatasourceName;

	private String onlineDatasourceType;

	private String onlineDatasourceId;

	private String onlineDatasourceName;

	private Integer offlineLifecycle;

	private Integer featureEntityCount;

	private Integer featureViewCount;

	private Integer modelCount;

	private String owner;

	private String gmtCreateTime;

	private String gmtModifiedTime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public String getOfflineDatasourceType() {
		return this.offlineDatasourceType;
	}

	public void setOfflineDatasourceType(String offlineDatasourceType) {
		this.offlineDatasourceType = offlineDatasourceType;
	}

	public String getOfflineDatasourceId() {
		return this.offlineDatasourceId;
	}

	public void setOfflineDatasourceId(String offlineDatasourceId) {
		this.offlineDatasourceId = offlineDatasourceId;
	}

	public String getOfflineDatasourceName() {
		return this.offlineDatasourceName;
	}

	public void setOfflineDatasourceName(String offlineDatasourceName) {
		this.offlineDatasourceName = offlineDatasourceName;
	}

	public String getOnlineDatasourceType() {
		return this.onlineDatasourceType;
	}

	public void setOnlineDatasourceType(String onlineDatasourceType) {
		this.onlineDatasourceType = onlineDatasourceType;
	}

	public String getOnlineDatasourceId() {
		return this.onlineDatasourceId;
	}

	public void setOnlineDatasourceId(String onlineDatasourceId) {
		this.onlineDatasourceId = onlineDatasourceId;
	}

	public String getOnlineDatasourceName() {
		return this.onlineDatasourceName;
	}

	public void setOnlineDatasourceName(String onlineDatasourceName) {
		this.onlineDatasourceName = onlineDatasourceName;
	}

	public Integer getOfflineLifecycle() {
		return this.offlineLifecycle;
	}

	public void setOfflineLifecycle(Integer offlineLifecycle) {
		this.offlineLifecycle = offlineLifecycle;
	}

	public Integer getFeatureEntityCount() {
		return this.featureEntityCount;
	}

	public void setFeatureEntityCount(Integer featureEntityCount) {
		this.featureEntityCount = featureEntityCount;
	}

	public Integer getFeatureViewCount() {
		return this.featureViewCount;
	}

	public void setFeatureViewCount(Integer featureViewCount) {
		this.featureViewCount = featureViewCount;
	}

	public Integer getModelCount() {
		return this.modelCount;
	}

	public void setModelCount(Integer modelCount) {
		this.modelCount = modelCount;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
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
	public GetProjectResponse getInstance(UnmarshallerContext context) {
		return	GetProjectResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
