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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeOrdersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeOrdersResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<OrderSet> orderSets;

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

	public List<OrderSet> getOrderSets() {
		return this.orderSets;
	}

	public void setOrderSets(List<OrderSet> orderSets) {
		this.orderSets = orderSets;
	}

	public static class OrderSet {

		private Long id;

		private Long orderId;

		private Long aliUid;

		private Integer status;

		private String orderDetail;

		private Integer actionType;

		private Boolean isAsync;

		private Integer chargeType;

		private String gmtCreate;

		private String gmtModified;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getOrderId() {
			return this.orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getOrderDetail() {
			return this.orderDetail;
		}

		public void setOrderDetail(String orderDetail) {
			this.orderDetail = orderDetail;
		}

		public Integer getActionType() {
			return this.actionType;
		}

		public void setActionType(Integer actionType) {
			this.actionType = actionType;
		}

		public Boolean getIsAsync() {
			return this.isAsync;
		}

		public void setIsAsync(Boolean isAsync) {
			this.isAsync = isAsync;
		}

		public Integer getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(Integer chargeType) {
			this.chargeType = chargeType;
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
	}

	@Override
	public OpsDescribeOrdersResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeOrdersResponseUnmarshaller.unmarshall(this, context);
	}
}
