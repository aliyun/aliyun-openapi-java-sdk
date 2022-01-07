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

package com.aliyuncs.dypnsapi.model.v20170525;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dypnsapi.transform.v20170525.QueryGateVerifyBillingPublicResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryGateVerifyBillingPublicResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String amountSum;

		private List<SceneBillingListItem> sceneBillingList;

		public String getAmountSum() {
			return this.amountSum;
		}

		public void setAmountSum(String amountSum) {
			this.amountSum = amountSum;
		}

		public List<SceneBillingListItem> getSceneBillingList() {
			return this.sceneBillingList;
		}

		public void setSceneBillingList(List<SceneBillingListItem> sceneBillingList) {
			this.sceneBillingList = sceneBillingList;
		}

		public static class SceneBillingListItem {

			private String add;

			private String singlePrice;

			private String amount;

			private String itemName;

			private String sceneCode;

			private String appName;

			private String sceneName;

			public String getAdd() {
				return this.add;
			}

			public void setAdd(String add) {
				this.add = add;
			}

			public String getSinglePrice() {
				return this.singlePrice;
			}

			public void setSinglePrice(String singlePrice) {
				this.singlePrice = singlePrice;
			}

			public String getAmount() {
				return this.amount;
			}

			public void setAmount(String amount) {
				this.amount = amount;
			}

			public String getItemName() {
				return this.itemName;
			}

			public void setItemName(String itemName) {
				this.itemName = itemName;
			}

			public String getSceneCode() {
				return this.sceneCode;
			}

			public void setSceneCode(String sceneCode) {
				this.sceneCode = sceneCode;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getSceneName() {
				return this.sceneName;
			}

			public void setSceneName(String sceneName) {
				this.sceneName = sceneName;
			}
		}
	}

	@Override
	public QueryGateVerifyBillingPublicResponse getInstance(UnmarshallerContext context) {
		return	QueryGateVerifyBillingPublicResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
