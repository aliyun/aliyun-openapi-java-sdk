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
import com.aliyuncs.paifeaturestore.transform.v20230621.ListProjectFeatureViewsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProjectFeatureViewsResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private List<FeatureViewsItem> featureViews;

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

	public List<FeatureViewsItem> getFeatureViews() {
		return this.featureViews;
	}

	public void setFeatureViews(List<FeatureViewsItem> featureViews) {
		this.featureViews = featureViews;
	}

	public static class FeatureViewsItem {

		private String name;

		private String featureViewId;

		private List<FeaturesItem> features;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getFeatureViewId() {
			return this.featureViewId;
		}

		public void setFeatureViewId(String featureViewId) {
			this.featureViewId = featureViewId;
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

			private List<String> attributes;

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

			public List<String> getAttributes() {
				return this.attributes;
			}

			public void setAttributes(List<String> attributes) {
				this.attributes = attributes;
			}
		}
	}

	@Override
	public ListProjectFeatureViewsResponse getInstance(UnmarshallerContext context) {
		return	ListProjectFeatureViewsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
