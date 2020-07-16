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

package com.aliyuncs.opensearch.model.v20171225;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.opensearch.transform.v20171225.ListDeployedAlgorithmModelsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDeployedAlgorithmModelsResponse extends AcsResponse {

	private String requestId;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String id;

		private String appGroupName;

		private String scene;

		private String desc;

		private String gmtCreate;

		private String gmtModified;

		private String status;

		private List<ModelsItem> models;

		private List<String> apps;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getAppGroupName() {
			return this.appGroupName;
		}

		public void setAppGroupName(String appGroupName) {
			this.appGroupName = appGroupName;
		}

		public String getScene() {
			return this.scene;
		}

		public void setScene(String scene) {
			this.scene = scene;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<ModelsItem> getModels() {
			return this.models;
		}

		public void setModels(List<ModelsItem> models) {
			this.models = models;
		}

		public List<String> getApps() {
			return this.apps;
		}

		public void setApps(List<String> apps) {
			this.apps = apps;
		}

		public static class ModelsItem {

			private String modelName;

			private Integer modelId;

			private Integer progress;

			private String status;

			private Integer projectId;

			private String algorithmType;

			public String getModelName() {
				return this.modelName;
			}

			public void setModelName(String modelName) {
				this.modelName = modelName;
			}

			public Integer getModelId() {
				return this.modelId;
			}

			public void setModelId(Integer modelId) {
				this.modelId = modelId;
			}

			public Integer getProgress() {
				return this.progress;
			}

			public void setProgress(Integer progress) {
				this.progress = progress;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Integer getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Integer projectId) {
				this.projectId = projectId;
			}

			public String getAlgorithmType() {
				return this.algorithmType;
			}

			public void setAlgorithmType(String algorithmType) {
				this.algorithmType = algorithmType;
			}
		}
	}

	@Override
	public ListDeployedAlgorithmModelsResponse getInstance(UnmarshallerContext context) {
		return	ListDeployedAlgorithmModelsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
