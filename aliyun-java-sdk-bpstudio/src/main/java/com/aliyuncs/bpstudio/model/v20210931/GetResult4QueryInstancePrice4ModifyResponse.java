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

package com.aliyuncs.bpstudio.model.v20210931;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bpstudio.transform.v20210931.GetResult4QueryInstancePrice4ModifyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetResult4QueryInstancePrice4ModifyResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private String accessDeniedDetail;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String taskId;

		private String status;

		private List<Item> priceList;

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<Item> getPriceList() {
			return this.priceList;
		}

		public void setPriceList(List<Item> priceList) {
			this.priceList = priceList;
		}

		public static class Item {

			private String nodeType;

			private Double tradeAmount;

			private Double discountAmount;

			private Double originalAmount;

			private String priceUnit;

			private String promotionName;

			private String eRROR;

			public String getNodeType() {
				return this.nodeType;
			}

			public void setNodeType(String nodeType) {
				this.nodeType = nodeType;
			}

			public Double getTradeAmount() {
				return this.tradeAmount;
			}

			public void setTradeAmount(Double tradeAmount) {
				this.tradeAmount = tradeAmount;
			}

			public Double getDiscountAmount() {
				return this.discountAmount;
			}

			public void setDiscountAmount(Double discountAmount) {
				this.discountAmount = discountAmount;
			}

			public Double getOriginalAmount() {
				return this.originalAmount;
			}

			public void setOriginalAmount(Double originalAmount) {
				this.originalAmount = originalAmount;
			}

			public String getPriceUnit() {
				return this.priceUnit;
			}

			public void setPriceUnit(String priceUnit) {
				this.priceUnit = priceUnit;
			}

			public String getPromotionName() {
				return this.promotionName;
			}

			public void setPromotionName(String promotionName) {
				this.promotionName = promotionName;
			}

			public String getERROR() {
				return this.eRROR;
			}

			public void setERROR(String eRROR) {
				this.eRROR = eRROR;
			}
		}
	}

	@Override
	public GetResult4QueryInstancePrice4ModifyResponse getInstance(UnmarshallerContext context) {
		return	GetResult4QueryInstancePrice4ModifyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
