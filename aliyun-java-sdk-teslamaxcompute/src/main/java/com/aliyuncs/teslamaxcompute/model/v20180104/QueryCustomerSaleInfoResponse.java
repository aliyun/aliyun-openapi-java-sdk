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
import com.aliyuncs.teslamaxcompute.transform.v20180104.QueryCustomerSaleInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCustomerSaleInfoResponse extends AcsResponse {

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

			private String cluster;

			private String region;

			private String machineRoom;

			private List<SaleInfo> saleInfos;

			public String getCluster() {
				return this.cluster;
			}

			public void setCluster(String cluster) {
				this.cluster = cluster;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getMachineRoom() {
				return this.machineRoom;
			}

			public void setMachineRoom(String machineRoom) {
				this.machineRoom = machineRoom;
			}

			public List<SaleInfo> getSaleInfos() {
				return this.saleInfos;
			}

			public void setSaleInfos(List<SaleInfo> saleInfos) {
				this.saleInfos = saleInfos;
			}

			public static class SaleInfo {

				private String saleMode;

				private String uid;

				private Long mem;

				private Long cpu;

				private String bizCategory;

				private String owner;

				private String queryDate;

				public String getSaleMode() {
					return this.saleMode;
				}

				public void setSaleMode(String saleMode) {
					this.saleMode = saleMode;
				}

				public String getUid() {
					return this.uid;
				}

				public void setUid(String uid) {
					this.uid = uid;
				}

				public Long getMem() {
					return this.mem;
				}

				public void setMem(Long mem) {
					this.mem = mem;
				}

				public Long getCpu() {
					return this.cpu;
				}

				public void setCpu(Long cpu) {
					this.cpu = cpu;
				}

				public String getBizCategory() {
					return this.bizCategory;
				}

				public void setBizCategory(String bizCategory) {
					this.bizCategory = bizCategory;
				}

				public String getOwner() {
					return this.owner;
				}

				public void setOwner(String owner) {
					this.owner = owner;
				}

				public String getQueryDate() {
					return this.queryDate;
				}

				public void setQueryDate(String queryDate) {
					this.queryDate = queryDate;
				}
			}
		}
	}

	@Override
	public QueryCustomerSaleInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryCustomerSaleInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
