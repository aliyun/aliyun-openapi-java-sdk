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

package com.aliyuncs.linkedmall.model.v20180116;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.QueryOrderItemInfoByPaymentIdForAiZhanYouResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryOrderItemInfoByPaymentIdForAiZhanYouResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<LmOrderListItem> lmOrderList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<LmOrderListItem> getLmOrderList() {
		return this.lmOrderList;
	}

	public void setLmOrderList(List<LmOrderListItem> lmOrderList) {
		this.lmOrderList = lmOrderList;
	}

	public static class LmOrderListItem {

		private String itemName;

		private Long lmOrderId;

		private Long skuId;

		private String skuName;

		private Long itemId;

		public String getItemName() {
			return this.itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public Long getLmOrderId() {
			return this.lmOrderId;
		}

		public void setLmOrderId(Long lmOrderId) {
			this.lmOrderId = lmOrderId;
		}

		public Long getSkuId() {
			return this.skuId;
		}

		public void setSkuId(Long skuId) {
			this.skuId = skuId;
		}

		public String getSkuName() {
			return this.skuName;
		}

		public void setSkuName(String skuName) {
			this.skuName = skuName;
		}

		public Long getItemId() {
			return this.itemId;
		}

		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}
	}

	@Override
	public QueryOrderItemInfoByPaymentIdForAiZhanYouResponse getInstance(UnmarshallerContext context) {
		return	QueryOrderItemInfoByPaymentIdForAiZhanYouResponseUnmarshaller.unmarshall(this, context);
	}
}
