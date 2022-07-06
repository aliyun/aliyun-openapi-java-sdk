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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20201126.GetRankingSystemHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRankingSystemHistoryResponse extends AcsResponse {

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

		private String operateTime;

		private String operateId;

		private String operateType;

		private String name;

		private Meta meta;

		public String getOperateTime() {
			return this.operateTime;
		}

		public void setOperateTime(String operateTime) {
			this.operateTime = operateTime;
		}

		public String getOperateId() {
			return this.operateId;
		}

		public void setOperateId(String operateId) {
			this.operateId = operateId;
		}

		public String getOperateType() {
			return this.operateType;
		}

		public void setOperateType(String operateType) {
			this.operateType = operateType;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
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

			private String modelTemplateName;

			private String predictEngineType;

			private String previousOperateId;

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

			public String getModelTemplateName() {
				return this.modelTemplateName;
			}

			public void setModelTemplateName(String modelTemplateName) {
				this.modelTemplateName = modelTemplateName;
			}

			public String getPredictEngineType() {
				return this.predictEngineType;
			}

			public void setPredictEngineType(String predictEngineType) {
				this.predictEngineType = predictEngineType;
			}

			public String getPreviousOperateId() {
				return this.previousOperateId;
			}

			public void setPreviousOperateId(String previousOperateId) {
				this.previousOperateId = previousOperateId;
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
			}
		}
	}

	@Override
	public GetRankingSystemHistoryResponse getInstance(UnmarshallerContext context) {
		return	GetRankingSystemHistoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
