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
import com.aliyuncs.linkedmall.transform.v20180116.ModifyBasicAndBizItemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyBasicAndBizItemsResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private List<Item> failedItemList;

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

	public List<Item> getFailedItemList() {
		return this.failedItemList;
	}

	public void setFailedItemList(List<Item> failedItemList) {
		this.failedItemList = failedItemList;
	}

	public static class Item {

		private Long itemId;

		private List<String> skuIdList;

		public Long getItemId() {
			return this.itemId;
		}

		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}

		public List<String> getSkuIdList() {
			return this.skuIdList;
		}

		public void setSkuIdList(List<String> skuIdList) {
			this.skuIdList = skuIdList;
		}
	}

	@Override
	public ModifyBasicAndBizItemsResponse getInstance(UnmarshallerContext context) {
		return	ModifyBasicAndBizItemsResponseUnmarshaller.unmarshall(this, context);
	}
}
