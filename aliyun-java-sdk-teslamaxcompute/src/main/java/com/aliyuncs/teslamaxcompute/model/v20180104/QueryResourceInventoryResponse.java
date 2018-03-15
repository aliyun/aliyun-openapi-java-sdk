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

package com.aliyuncs.teslamaxcompute.model.v20180104;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.teslamaxcompute.transform.v20180104.QueryResourceInventoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryResourceInventoryResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String lastUpdate;

		private List<Cluster> clusters;

		public String getLastUpdate() {
			return this.lastUpdate;
		}

		public void setLastUpdate(String lastUpdate) {
			this.lastUpdate = lastUpdate;
		}

		public List<Cluster> getClusters() {
			return this.clusters;
		}

		public void setClusters(List<Cluster> clusters) {
			this.clusters = clusters;
		}

		public static class Cluster {

			private String status;

			private String cluster;

			private String machineRoom;

			private String region;

			private List<ResourceParameter> resourceParameters;

			private List<ResourceInventory> resourceInventories;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getCluster() {
				return this.cluster;
			}

			public void setCluster(String cluster) {
				this.cluster = cluster;
			}

			public String getMachineRoom() {
				return this.machineRoom;
			}

			public void setMachineRoom(String machineRoom) {
				this.machineRoom = machineRoom;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public List<ResourceParameter> getResourceParameters() {
				return this.resourceParameters;
			}

			public void setResourceParameters(List<ResourceParameter> resourceParameters) {
				this.resourceParameters = resourceParameters;
			}

			public List<ResourceInventory> getResourceInventories() {
				return this.resourceInventories;
			}

			public void setResourceInventories(List<ResourceInventory> resourceInventories) {
				this.resourceInventories = resourceInventories;
			}

			public static class ResourceParameter {

				private String paraName;

				private String paraValue;

				public String getParaName() {
					return this.paraName;
				}

				public void setParaName(String paraName) {
					this.paraName = paraName;
				}

				public String getParaValue() {
					return this.paraValue;
				}

				public void setParaValue(String paraValue) {
					this.paraValue = paraValue;
				}
			}

			public static class ResourceInventory {

				private Long total;

				private Long available;

				private Long used;

				private String resourceType;

				public Long getTotal() {
					return this.total;
				}

				public void setTotal(Long total) {
					this.total = total;
				}

				public Long getAvailable() {
					return this.available;
				}

				public void setAvailable(Long available) {
					this.available = available;
				}

				public Long getUsed() {
					return this.used;
				}

				public void setUsed(Long used) {
					this.used = used;
				}

				public String getResourceType() {
					return this.resourceType;
				}

				public void setResourceType(String resourceType) {
					this.resourceType = resourceType;
				}
			}
		}
	}

	@Override
	public QueryResourceInventoryResponse getInstance(UnmarshallerContext context) {
		return	QueryResourceInventoryResponseUnmarshaller.unmarshall(this, context);
	}
}
