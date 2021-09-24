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

package com.aliyuncs.mse.model.v20190531;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.GetGovernanceKubernetesClusterListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetGovernanceKubernetesClusterListResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Integer code;

	private Boolean success;

	private Data data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer totalSize;

		private Integer pageNumber;

		private Integer pageSize;

		private List<ClusterList> result;

		public Integer getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Integer totalSize) {
			this.totalSize = totalSize;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<ClusterList> getResult() {
			return this.result;
		}

		public void setResult(List<ClusterList> result) {
			this.result = result;
		}

		public static class ClusterList {

			private String clusterName;

			private String clusterId;

			private String region;

			private String k8sVersion;

			private String namespaceInfos;

			private String pilotStartTime;

			public String getClusterName() {
				return this.clusterName;
			}

			public void setClusterName(String clusterName) {
				this.clusterName = clusterName;
			}

			public String getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(String clusterId) {
				this.clusterId = clusterId;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getK8sVersion() {
				return this.k8sVersion;
			}

			public void setK8sVersion(String k8sVersion) {
				this.k8sVersion = k8sVersion;
			}

			public String getNamespaceInfos() {
				return this.namespaceInfos;
			}

			public void setNamespaceInfos(String namespaceInfos) {
				this.namespaceInfos = namespaceInfos;
			}

			public String getPilotStartTime() {
				return this.pilotStartTime;
			}

			public void setPilotStartTime(String pilotStartTime) {
				this.pilotStartTime = pilotStartTime;
			}
		}
	}

	@Override
	public GetGovernanceKubernetesClusterListResponse getInstance(UnmarshallerContext context) {
		return	GetGovernanceKubernetesClusterListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
