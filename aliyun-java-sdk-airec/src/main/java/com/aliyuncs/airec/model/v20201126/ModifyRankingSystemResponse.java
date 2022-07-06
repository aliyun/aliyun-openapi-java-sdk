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

package com.aliyuncs.airec.model.v20201126;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20201126.ModifyRankingSystemResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyRankingSystemResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String applyStatus;

		private String deployStatus;

		private String name;

		private String modelTemplateId;

		private List<Long> sceneIdList;

		private Meta meta;

		public String getApplyStatus() {
			return this.applyStatus;
		}

		public void setApplyStatus(String applyStatus) {
			this.applyStatus = applyStatus;
		}

		public String getDeployStatus() {
			return this.deployStatus;
		}

		public void setDeployStatus(String deployStatus) {
			this.deployStatus = deployStatus;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getModelTemplateId() {
			return this.modelTemplateId;
		}

		public void setModelTemplateId(String modelTemplateId) {
			this.modelTemplateId = modelTemplateId;
		}

		public List<Long> getSceneIdList() {
			return this.sceneIdList;
		}

		public void setSceneIdList(List<Long> sceneIdList) {
			this.sceneIdList = sceneIdList;
		}

		public Meta getMeta() {
			return this.meta;
		}

		public void setMeta(Meta meta) {
			this.meta = meta;
		}

		public static class Meta {

			private Boolean autoDeploy;

			private String autoDeployAuc;

			private String conf;

			private String predictEngineType;

			private String modelVersionName;

			private String failMsg;

			private PredictEngine predictEngine;

			public Boolean getAutoDeploy() {
				return this.autoDeploy;
			}

			public void setAutoDeploy(Boolean autoDeploy) {
				this.autoDeploy = autoDeploy;
			}

			public String getAutoDeployAuc() {
				return this.autoDeployAuc;
			}

			public void setAutoDeployAuc(String autoDeployAuc) {
				this.autoDeployAuc = autoDeployAuc;
			}

			public String getConf() {
				return this.conf;
			}

			public void setConf(String conf) {
				this.conf = conf;
			}

			public String getPredictEngineType() {
				return this.predictEngineType;
			}

			public void setPredictEngineType(String predictEngineType) {
				this.predictEngineType = predictEngineType;
			}

			public String getModelVersionName() {
				return this.modelVersionName;
			}

			public void setModelVersionName(String modelVersionName) {
				this.modelVersionName = modelVersionName;
			}

			public String getFailMsg() {
				return this.failMsg;
			}

			public void setFailMsg(String failMsg) {
				this.failMsg = failMsg;
			}

			public PredictEngine getPredictEngine() {
				return this.predictEngine;
			}

			public void setPredictEngine(PredictEngine predictEngine) {
				this.predictEngine = predictEngine;
			}

			public static class PredictEngine {

				private String resourceId;

				private String version;

				private String clusterId;

				public String getResourceId() {
					return this.resourceId;
				}

				public void setResourceId(String resourceId) {
					this.resourceId = resourceId;
				}

				public String getVersion() {
					return this.version;
				}

				public void setVersion(String version) {
					this.version = version;
				}

				public String getClusterId() {
					return this.clusterId;
				}

				public void setClusterId(String clusterId) {
					this.clusterId = clusterId;
				}
			}
		}
	}

	@Override
	public ModifyRankingSystemResponse getInstance(UnmarshallerContext context) {
		return	ModifyRankingSystemResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
