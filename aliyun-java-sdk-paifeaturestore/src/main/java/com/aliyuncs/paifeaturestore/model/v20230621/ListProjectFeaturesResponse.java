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
import com.aliyuncs.paifeaturestore.transform.v20230621.ListProjectFeaturesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProjectFeaturesResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<FeaturesItem> features;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FeaturesItem> getFeatures() {
		return this.features;
	}

	public void setFeatures(List<FeaturesItem> features) {
		this.features = features;
	}

	public static class FeaturesItem {

		private String name;

		private String type;

		private String featureViewId;

		private String featureViewName;

		private String owner;

		private Integer modelFeatureCount;

		private String aliasNames;

		private String gmtCreateTime;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getFeatureViewId() {
			return this.featureViewId;
		}

		public void setFeatureViewId(String featureViewId) {
			this.featureViewId = featureViewId;
		}

		public String getFeatureViewName() {
			return this.featureViewName;
		}

		public void setFeatureViewName(String featureViewName) {
			this.featureViewName = featureViewName;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public Integer getModelFeatureCount() {
			return this.modelFeatureCount;
		}

		public void setModelFeatureCount(Integer modelFeatureCount) {
			this.modelFeatureCount = modelFeatureCount;
		}

		public String getAliasNames() {
			return this.aliasNames;
		}

		public void setAliasNames(String aliasNames) {
			this.aliasNames = aliasNames;
		}

		public String getGmtCreateTime() {
			return this.gmtCreateTime;
		}

		public void setGmtCreateTime(String gmtCreateTime) {
			this.gmtCreateTime = gmtCreateTime;
		}
	}

	@Override
	public ListProjectFeaturesResponse getInstance(UnmarshallerContext context) {
		return	ListProjectFeaturesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
