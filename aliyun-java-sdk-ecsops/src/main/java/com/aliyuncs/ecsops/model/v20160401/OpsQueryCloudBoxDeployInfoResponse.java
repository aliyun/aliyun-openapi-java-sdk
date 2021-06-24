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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryCloudBoxDeployInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryCloudBoxDeployInfoResponse extends AcsResponse {

	private String requestId;

	private List<CloudBoxDeployInfoModel> cloudBoxDeployInfoModels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CloudBoxDeployInfoModel> getCloudBoxDeployInfoModels() {
		return this.cloudBoxDeployInfoModels;
	}

	public void setCloudBoxDeployInfoModels(List<CloudBoxDeployInfoModel> cloudBoxDeployInfoModels) {
		this.cloudBoxDeployInfoModels = cloudBoxDeployInfoModels;
	}

	public static class CloudBoxDeployInfoModel {

		private String status;

		private List<DeployModel> deployModels;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<DeployModel> getDeployModels() {
			return this.deployModels;
		}

		public void setDeployModels(List<DeployModel> deployModels) {
			this.deployModels = deployModels;
		}

		public static class DeployModel {

			private String deployType;

			private List<DeployInfo> deployInfos;

			public String getDeployType() {
				return this.deployType;
			}

			public void setDeployType(String deployType) {
				this.deployType = deployType;
			}

			public List<DeployInfo> getDeployInfos() {
				return this.deployInfos;
			}

			public void setDeployInfos(List<DeployInfo> deployInfos) {
				this.deployInfos = deployInfos;
			}

			public static class DeployInfo {

				private String cluster;

				private List<String> ags;

				private List<String> sns;

				public String getCluster() {
					return this.cluster;
				}

				public void setCluster(String cluster) {
					this.cluster = cluster;
				}

				public List<String> getAgs() {
					return this.ags;
				}

				public void setAgs(List<String> ags) {
					this.ags = ags;
				}

				public List<String> getSns() {
					return this.sns;
				}

				public void setSns(List<String> sns) {
					this.sns = sns;
				}
			}
		}
	}

	@Override
	public OpsQueryCloudBoxDeployInfoResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryCloudBoxDeployInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
