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
import com.aliyuncs.idaas_doraemon.transform.v20210520.ListOrderConsumeStatisticRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListOrderConsumeStatisticRecordsResponse extends AcsResponse {

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

		private Long statisticTime;

		private String applicationExternalId;

		private String serviceCode;

		private Long unitPrice;

		private Long chargedCount;

		private Long totalPrice;

		public String getAliOrderCode() {
			return this.aliOrderCode;
		}

		public void setAliOrderCode(String aliOrderCode) {
			this.aliOrderCode = aliOrderCode;
		}

		public Long getStatisticTime() {
			return this.statisticTime;
		}

		public void setStatisticTime(Long statisticTime) {
			this.statisticTime = statisticTime;
		}

		public String getApplicationExternalId() {
			return this.applicationExternalId;
		}

		public void setApplicationExternalId(String applicationExternalId) {
			this.applicationExternalId = applicationExternalId;
		}

		public String getServiceCode() {
			return this.serviceCode;
		}

		public void setServiceCode(String serviceCode) {
			this.serviceCode = serviceCode;
		}

		public Long getUnitPrice() {
			return this.unitPrice;
		}

		public void setUnitPrice(Long unitPrice) {
			this.unitPrice = unitPrice;
		}

		public Long getChargedCount() {
			return this.chargedCount;
		}

		public void setChargedCount(Long chargedCount) {
			this.chargedCount = chargedCount;
		}

		public Long getTotalPrice() {
			return this.totalPrice;
		}

		public void setTotalPrice(Long totalPrice) {
			this.totalPrice = totalPrice;
		}
	}

	@Override
	public ListOrderConsumeStatisticRecordsResponse getInstance(UnmarshallerContext context) {
		return	ListOrderConsumeStatisticRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
