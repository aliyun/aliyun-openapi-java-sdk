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
import com.aliyuncs.paifeaturestore.transform.v20230621.ListFeatureViewRelationshipsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFeatureViewRelationshipsResponse extends AcsResponse {

	private String requestId;

	private List<RelationshipsItem> relationships;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RelationshipsItem> getRelationships() {
		return this.relationships;
	}

	public void setRelationships(List<RelationshipsItem> relationships) {
		this.relationships = relationships;
	}

	public static class RelationshipsItem {

		private String featureViewName;

		private String projectName;

		private List<ModelsItem> models;

		public String getFeatureViewName() {
			return this.featureViewName;
		}

		public void setFeatureViewName(String featureViewName) {
			this.featureViewName = featureViewName;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public List<ModelsItem> getModels() {
			return this.models;
		}

		public void setModels(List<ModelsItem> models) {
			this.models = models;
		}

		public static class ModelsItem {

			private String modelId;

			private String modelName;

			public String getModelId() {
				return this.modelId;
			}

			public void setModelId(String modelId) {
				this.modelId = modelId;
			}

			public String getModelName() {
				return this.modelName;
			}

			public void setModelName(String modelName) {
				this.modelName = modelName;
			}
		}
	}

	@Override
	public ListFeatureViewRelationshipsResponse getInstance(UnmarshallerContext context) {
		return	ListFeatureViewRelationshipsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
