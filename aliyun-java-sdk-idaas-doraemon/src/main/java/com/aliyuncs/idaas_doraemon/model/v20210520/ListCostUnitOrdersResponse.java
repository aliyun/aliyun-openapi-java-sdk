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

package com.aliyuncs.idaas_doraemon.model.v20210520;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.idaas_doraemon.transform.v20210520.ListCostUnitOrdersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCostUnitOrdersResponse extends AcsResponse {

	private String requestId;

	private Long totalPages;

	private Long totalElements;

	private Long pageSize;

	private List<Item> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}

	public Long getTotalElements() {
		return this.totalElements;
	}

	public void setTotalElements(Long totalElements) {
		this.totalElements = totalElements;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public static class Item {

		private String aliOrderCode;

		private String aliOrderInstanceId;

		private Long totalCostUnit;

		private Long usedCostUnit;

		private String orderStatus;

		private Long createTime;

		private Long expiredTime;

		private Long refundTime;

		public String getAliOrderCode() {
			return this.aliOrderCode;
		}

		public void setAliOrderCode(String aliOrderCode) {
			this.aliOrderCode = aliOrderCode;
		}

		public String getAliOrderInstanceId() {
			return this.aliOrderInstanceId;
		}

		public void setAliOrderInstanceId(String aliOrderInstanceId) {
			this.aliOrderInstanceId = aliOrderInstanceId;
		}

		public Long getTotalCostUnit() {
			return this.totalCostUnit;
		}

		public void setTotalCostUnit(Long totalCostUnit) {
			this.totalCostUnit = totalCostUnit;
		}

		public Long getUsedCostUnit() {
			return this.usedCostUnit;
		}

		public void setUsedCostUnit(Long usedCostUnit) {
			this.usedCostUnit = usedCostUnit;
		}

		public String getOrderStatus() {
			return this.orderStatus;
		}

		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(Long expiredTime) {
			this.expiredTime = expiredTime;
		}

		public Long getRefundTime() {
			return this.refundTime;
		}

		public void setRefundTime(Long refundTime) {
			this.refundTime = refundTime;
		}
	}

	@Override
	public ListCostUnitOrdersResponse getInstance(UnmarshallerContext context) {
		return	ListCostUnitOrdersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
