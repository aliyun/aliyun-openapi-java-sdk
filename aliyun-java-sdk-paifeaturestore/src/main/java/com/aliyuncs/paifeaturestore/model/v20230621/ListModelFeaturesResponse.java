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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.paifeaturestore.transform.v20230621.ListModelFeaturesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListModelFeaturesResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private List<ModelFeaturesItem> modelFeatures;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<ModelFeaturesItem> getModelFeatures() {
		return this.modelFeatures;
	}

	public void setModelFeatures(List<ModelFeaturesItem> modelFeatures) {
		this.modelFeatures = modelFeatures;
	}

	public static class ModelFeaturesItem {

		private String modelFeatureId;

		private String projectId;

		private String projectName;

		private String name;

		private String owner;

		private String gmtCreateTime;

		private String gmtModifiedTime;

		private String labelTableName;

		public String getModelFeatureId() {
			return this.modelFeatureId;
		}

		public void setModelFeatureId(String modelFeatureId) {
			this.modelFeatureId = modelFeatureId;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
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

		public String getLabelTableName() {
			return this.labelTableName;
		}

		public void setLabelTableName(String labelTableName) {
			this.labelTableName = labelTableName;
		}
	}

	@Override
	public ListModelFeaturesResponse getInstance(UnmarshallerContext context) {
		return	ListModelFeaturesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
