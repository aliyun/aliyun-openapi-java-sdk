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
import com.aliyuncs.emr.transform.v20160408.ListFlowClusterAllResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFlowClusterAllResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<ClusterInfo> clusters;

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

	public List<ClusterInfo> getClusters() {
		return this.clusters;
	}

	public void setClusters(List<ClusterInfo> clusters) {
		this.clusters = clusters;
	}

	public static class ClusterInfo {

		private String id;

		private String name;

		private String type;

		private Long createTime;

		private Integer runningTime;

		private String status;

		private String chargeType;

		private Long expiredTime;

		private Integer period;

		private Boolean hasUncompletedOrder;

		private String orderList;

		private String createResource;

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

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Integer getRunningTime() {
			return this.runningTime;
		}

		public void setRunningTime(Integer runningTime) {
			this.runningTime = runningTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public Long getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(Long expiredTime) {
			this.expiredTime = expiredTime;
		}

		public Integer getPeriod() {
			return this.period;
		}

		public void setPeriod(Integer period) {
			this.period = period;
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
	public ListFlowClusterAllResponse getInstance(UnmarshallerContext context) {
		return	ListFlowClusterAllResponseUnmarshaller.unmarshall(this, context);
	}
}
