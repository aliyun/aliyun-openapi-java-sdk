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
import com.aliyuncs.linkedmall.transform.v20180116.QueryInventoryOfItemsInBizItemGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryInventoryOfItemsInBizItemGroupResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private List<Item> itemList;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Item> getItemList() {
		return this.itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public static class Item {

		private Long itemId;

		private String lmItemId;

		private Integer quantity;

		private List<Sku> skuList;

		public Long getItemId() {
			return this.itemId;
		}

		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}

		public String getLmItemId() {
			return this.lmItemId;
		}

		public void setLmItemId(String lmItemId) {
			this.lmItemId = lmItemId;
		}

		public Integer getQuantity() {
			return this.quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public List<Sku> getSkuList() {
			return this.skuList;
		}

		public void setSkuList(List<Sku> skuList) {
			this.skuList = skuList;
		}

		public static class Sku {

			private Long skuId;

			private Integer quantity;

			public Long getSkuId() {
				return this.skuId;
			}

			public void setSkuId(Long skuId) {
				this.skuId = skuId;
			}

			public Integer getQuantity() {
				return this.quantity;
			}

			public void setQuantity(Integer quantity) {
				this.quantity = quantity;
			}
		}
	}

	@Override
	public QueryInventoryOfItemsInBizItemGroupResponse getInstance(UnmarshallerContext context) {
		return	QueryInventoryOfItemsInBizItemGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
