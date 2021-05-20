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

package com.aliyuncs.vcs.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.GetInventoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInventoryResponse extends AcsResponse {

	private Boolean success;

	private Data data;

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

		private List<ResultObjectItem> resultObject;

		public List<ResultObjectItem> getResultObject() {
			return this.resultObject;
		}

		public void setResultObject(List<ResultObjectItem> resultObject) {
			this.resultObject = resultObject;
		}

		public static class ResultObjectItem {

			private String buyerId;

			private String instanceId;

			private String currentInventory;

			private String validEndTime;

			private String commodityCode;

			private String validStartTime;

			private String inventoryId;

			public String getBuyerId() {
				return this.buyerId;
			}

			public void setBuyerId(String buyerId) {
				this.buyerId = buyerId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getCurrentInventory() {
				return this.currentInventory;
			}

			public void setCurrentInventory(String currentInventory) {
				this.currentInventory = currentInventory;
			}

			public String getValidEndTime() {
				return this.validEndTime;
			}

			public void setValidEndTime(String validEndTime) {
				this.validEndTime = validEndTime;
			}

			public String getCommodityCode() {
				return this.commodityCode;
			}

			public void setCommodityCode(String commodityCode) {
				this.commodityCode = commodityCode;
			}

			public String getValidStartTime() {
				return this.validStartTime;
			}

			public void setValidStartTime(String validStartTime) {
				this.validStartTime = validStartTime;
			}

			public String getInventoryId() {
				return this.inventoryId;
			}

			public void setInventoryId(String inventoryId) {
				this.inventoryId = inventoryId;
			}
		}
	}

	@Override
	public GetInventoryResponse getInstance(UnmarshallerContext context) {
		return	GetInventoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
