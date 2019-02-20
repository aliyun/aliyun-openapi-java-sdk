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

package com.aliyuncs.linkwan.model.v20181230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20181230.GetNodeGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetNodeGroupResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

		private String nodeGroupId;

		private String nodeGroupName;

		private Long nodesCnt;

		private Boolean dataDispatchEnabled;

		private String joinPermissionId;

		private String joinPermissionOwnerAliyunId;

		private String joinEui;

		private Long freqBandPlanGroupId;

		private String classMode;

		private String joinPermissionType;

		private Boolean joinPermissionEnabled;

		private String rxDailySum;

		private Long rxMonthSum;

		private Long txDailySum;

		private Long txMonthSum;

		private Long createMillis;

		private List<LocksItem> locks;

		private DataDispatchConfig dataDispatchConfig;

		public String getNodeGroupId() {
			return this.nodeGroupId;
		}

		public void setNodeGroupId(String nodeGroupId) {
			this.nodeGroupId = nodeGroupId;
		}

		public String getNodeGroupName() {
			return this.nodeGroupName;
		}

		public void setNodeGroupName(String nodeGroupName) {
			this.nodeGroupName = nodeGroupName;
		}

		public Long getNodesCnt() {
			return this.nodesCnt;
		}

		public void setNodesCnt(Long nodesCnt) {
			this.nodesCnt = nodesCnt;
		}

		public Boolean getDataDispatchEnabled() {
			return this.dataDispatchEnabled;
		}

		public void setDataDispatchEnabled(Boolean dataDispatchEnabled) {
			this.dataDispatchEnabled = dataDispatchEnabled;
		}

		public String getJoinPermissionId() {
			return this.joinPermissionId;
		}

		public void setJoinPermissionId(String joinPermissionId) {
			this.joinPermissionId = joinPermissionId;
		}

		public String getJoinPermissionOwnerAliyunId() {
			return this.joinPermissionOwnerAliyunId;
		}

		public void setJoinPermissionOwnerAliyunId(String joinPermissionOwnerAliyunId) {
			this.joinPermissionOwnerAliyunId = joinPermissionOwnerAliyunId;
		}

		public String getJoinEui() {
			return this.joinEui;
		}

		public void setJoinEui(String joinEui) {
			this.joinEui = joinEui;
		}

		public Long getFreqBandPlanGroupId() {
			return this.freqBandPlanGroupId;
		}

		public void setFreqBandPlanGroupId(Long freqBandPlanGroupId) {
			this.freqBandPlanGroupId = freqBandPlanGroupId;
		}

		public String getClassMode() {
			return this.classMode;
		}

		public void setClassMode(String classMode) {
			this.classMode = classMode;
		}

		public String getJoinPermissionType() {
			return this.joinPermissionType;
		}

		public void setJoinPermissionType(String joinPermissionType) {
			this.joinPermissionType = joinPermissionType;
		}

		public Boolean getJoinPermissionEnabled() {
			return this.joinPermissionEnabled;
		}

		public void setJoinPermissionEnabled(Boolean joinPermissionEnabled) {
			this.joinPermissionEnabled = joinPermissionEnabled;
		}

		public String getRxDailySum() {
			return this.rxDailySum;
		}

		public void setRxDailySum(String rxDailySum) {
			this.rxDailySum = rxDailySum;
		}

		public Long getRxMonthSum() {
			return this.rxMonthSum;
		}

		public void setRxMonthSum(Long rxMonthSum) {
			this.rxMonthSum = rxMonthSum;
		}

		public Long getTxDailySum() {
			return this.txDailySum;
		}

		public void setTxDailySum(Long txDailySum) {
			this.txDailySum = txDailySum;
		}

		public Long getTxMonthSum() {
			return this.txMonthSum;
		}

		public void setTxMonthSum(Long txMonthSum) {
			this.txMonthSum = txMonthSum;
		}

		public Long getCreateMillis() {
			return this.createMillis;
		}

		public void setCreateMillis(Long createMillis) {
			this.createMillis = createMillis;
		}

		public List<LocksItem> getLocks() {
			return this.locks;
		}

		public void setLocks(List<LocksItem> locks) {
			this.locks = locks;
		}

		public DataDispatchConfig getDataDispatchConfig() {
			return this.dataDispatchConfig;
		}

		public void setDataDispatchConfig(DataDispatchConfig dataDispatchConfig) {
			this.dataDispatchConfig = dataDispatchConfig;
		}

		public static class LocksItem {

			private String lockId;

			private String lockType;

			private Boolean enabled;

			private Long createMillis;

			public String getLockId() {
				return this.lockId;
			}

			public void setLockId(String lockId) {
				this.lockId = lockId;
			}

			public String getLockType() {
				return this.lockType;
			}

			public void setLockType(String lockType) {
				this.lockType = lockType;
			}

			public Boolean getEnabled() {
				return this.enabled;
			}

			public void setEnabled(Boolean enabled) {
				this.enabled = enabled;
			}

			public Long getCreateMillis() {
				return this.createMillis;
			}

			public void setCreateMillis(Long createMillis) {
				this.createMillis = createMillis;
			}
		}

		public static class DataDispatchConfig {

			private String destination;

			private IotProduct iotProduct;

			private OnsTopics onsTopics;

			public String getDestination() {
				return this.destination;
			}

			public void setDestination(String destination) {
				this.destination = destination;
			}

			public IotProduct getIotProduct() {
				return this.iotProduct;
			}

			public void setIotProduct(IotProduct iotProduct) {
				this.iotProduct = iotProduct;
			}

			public OnsTopics getOnsTopics() {
				return this.onsTopics;
			}

			public void setOnsTopics(OnsTopics onsTopics) {
				this.onsTopics = onsTopics;
			}

			public static class IotProduct {

				private String productName;

				private String productKey;

				private String productType;

				public String getProductName() {
					return this.productName;
				}

				public void setProductName(String productName) {
					this.productName = productName;
				}

				public String getProductKey() {
					return this.productKey;
				}

				public void setProductKey(String productKey) {
					this.productKey = productKey;
				}

				public String getProductType() {
					return this.productType;
				}

				public void setProductType(String productType) {
					this.productType = productType;
				}
			}

			public static class OnsTopics {

				private String downlinkRegionName;

				private String downlinkTopic;

				private String uplinkRegionName;

				private String uplinkTopic;

				public String getDownlinkRegionName() {
					return this.downlinkRegionName;
				}

				public void setDownlinkRegionName(String downlinkRegionName) {
					this.downlinkRegionName = downlinkRegionName;
				}

				public String getDownlinkTopic() {
					return this.downlinkTopic;
				}

				public void setDownlinkTopic(String downlinkTopic) {
					this.downlinkTopic = downlinkTopic;
				}

				public String getUplinkRegionName() {
					return this.uplinkRegionName;
				}

				public void setUplinkRegionName(String uplinkRegionName) {
					this.uplinkRegionName = uplinkRegionName;
				}

				public String getUplinkTopic() {
					return this.uplinkTopic;
				}

				public void setUplinkTopic(String uplinkTopic) {
					this.uplinkTopic = uplinkTopic;
				}
			}
		}
	}

	@Override
	public GetNodeGroupResponse getInstance(UnmarshallerContext context) {
		return	GetNodeGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
