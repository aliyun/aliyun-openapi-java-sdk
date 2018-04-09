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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListClusterForAdminResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClusterForAdminResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Cluster> clusterList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public List<Cluster> getClusterList() {
		return this.clusterList;
	}

	public void setClusterList(List<Cluster> clusterList) {
		this.clusterList = clusterList;
	}

	public static class Cluster {

		private String id;

		private String name;

		private String bizId;

		private String lusterType;

		private Long createTime;

		private Long runningTime;

		private String status;

		private String payType;

		private String regionId;

		private Boolean easEnable;

		private String depositType;

		private Boolean useLocalMetadb;

		private Boolean highAvailabilityEnable;

		private Integer nodeCount;

		private Long expiredTime;

		private String netType;

		private Boolean hasUncompletedOrder;

		private String orderList;

		private String createResource;

		private String userId;

		private String ecmClusterId;

		private String emrVersion;

		private String vpcId;

		private String vSwitchId;

		private OrderTaskInfo orderTaskInfo;

		private FailReason failReason;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getLusterType() {
			return this.lusterType;
		}

		public void setLusterType(String lusterType) {
			this.lusterType = lusterType;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getRunningTime() {
			return this.runningTime;
		}

		public void setRunningTime(Long runningTime) {
			this.runningTime = runningTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Boolean getEasEnable() {
			return this.easEnable;
		}

		public void setEasEnable(Boolean easEnable) {
			this.easEnable = easEnable;
		}

		public String getDepositType() {
			return this.depositType;
		}

		public void setDepositType(String depositType) {
			this.depositType = depositType;
		}

		public Boolean getUseLocalMetadb() {
			return this.useLocalMetadb;
		}

		public void setUseLocalMetadb(Boolean useLocalMetadb) {
			this.useLocalMetadb = useLocalMetadb;
		}

		public Boolean getHighAvailabilityEnable() {
			return this.highAvailabilityEnable;
		}

		public void setHighAvailabilityEnable(Boolean highAvailabilityEnable) {
			this.highAvailabilityEnable = highAvailabilityEnable;
		}

		public Integer getNodeCount() {
			return this.nodeCount;
		}

		public void setNodeCount(Integer nodeCount) {
			this.nodeCount = nodeCount;
		}

		public Long getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(Long expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getNetType() {
			return this.netType;
		}

		public void setNetType(String netType) {
			this.netType = netType;
		}

		public Boolean getHasUncompletedOrder() {
			return this.hasUncompletedOrder;
		}

		public void setHasUncompletedOrder(Boolean hasUncompletedOrder) {
			this.hasUncompletedOrder = hasUncompletedOrder;
		}

		public String getOrderList() {
			return this.orderList;
		}

		public void setOrderList(String orderList) {
			this.orderList = orderList;
		}

		public String getCreateResource() {
			return this.createResource;
		}

		public void setCreateResource(String createResource) {
			this.createResource = createResource;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getEcmClusterId() {
			return this.ecmClusterId;
		}

		public void setEcmClusterId(String ecmClusterId) {
			this.ecmClusterId = ecmClusterId;
		}

		public String getEmrVersion() {
			return this.emrVersion;
		}

		public void setEmrVersion(String emrVersion) {
			this.emrVersion = emrVersion;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public OrderTaskInfo getOrderTaskInfo() {
			return this.orderTaskInfo;
		}

		public void setOrderTaskInfo(OrderTaskInfo orderTaskInfo) {
			this.orderTaskInfo = orderTaskInfo;
		}

		public FailReason getFailReason() {
			return this.failReason;
		}

		public void setFailReason(FailReason failReason) {
			this.failReason = failReason;
		}

		public static class OrderTaskInfo {

			private Integer targetCount;

			private Integer currentCount;

			private String orderIdList;

			public Integer getTargetCount() {
				return this.targetCount;
			}

			public void setTargetCount(Integer targetCount) {
				this.targetCount = targetCount;
			}

			public Integer getCurrentCount() {
				return this.currentCount;
			}

			public void setCurrentCount(Integer currentCount) {
				this.currentCount = currentCount;
			}

			public String getOrderIdList() {
				return this.orderIdList;
			}

			public void setOrderIdList(String orderIdList) {
				this.orderIdList = orderIdList;
			}
		}

		public static class FailReason {

			private String errorCode;

			private String errorMsg;

			private String requestId;

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public String getErrorMsg() {
				return this.errorMsg;
			}

			public void setErrorMsg(String errorMsg) {
				this.errorMsg = errorMsg;
			}

			public String getRequestId() {
				return this.requestId;
			}

			public void setRequestId(String requestId) {
				this.requestId = requestId;
			}
		}
	}

	@Override
	public ListClusterForAdminResponse getInstance(UnmarshallerContext context) {
		return	ListClusterForAdminResponseUnmarshaller.unmarshall(this, context);
	}
}
