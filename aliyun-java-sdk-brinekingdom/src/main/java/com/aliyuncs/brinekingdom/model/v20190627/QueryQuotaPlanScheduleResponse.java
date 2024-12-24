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

package com.aliyuncs.brinekingdom.model.v20190627;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.brinekingdom.transform.v20190627.QueryQuotaPlanScheduleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryQuotaPlanScheduleResponse extends AcsResponse {

	private String resultCode;

	private String requestId;

	private String errorMessage;

	private Boolean success;

	private List<ResultItem> result;

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String status;

		private String creatorNick;

		private Long quotaPlanId;

		private Long deliveryDate;

		private String configModel;

		private String tenantName;

		private String creatorWorkNo;

		private Integer quantity;

		private String productCode;

		private List<LadingScheduleListItem> ladingScheduleList;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreatorNick() {
			return this.creatorNick;
		}

		public void setCreatorNick(String creatorNick) {
			this.creatorNick = creatorNick;
		}

		public Long getQuotaPlanId() {
			return this.quotaPlanId;
		}

		public void setQuotaPlanId(Long quotaPlanId) {
			this.quotaPlanId = quotaPlanId;
		}

		public Long getDeliveryDate() {
			return this.deliveryDate;
		}

		public void setDeliveryDate(Long deliveryDate) {
			this.deliveryDate = deliveryDate;
		}

		public String getConfigModel() {
			return this.configModel;
		}

		public void setConfigModel(String configModel) {
			this.configModel = configModel;
		}

		public String getTenantName() {
			return this.tenantName;
		}

		public void setTenantName(String tenantName) {
			this.tenantName = tenantName;
		}

		public String getCreatorWorkNo() {
			return this.creatorWorkNo;
		}

		public void setCreatorWorkNo(String creatorWorkNo) {
			this.creatorWorkNo = creatorWorkNo;
		}

		public Integer getQuantity() {
			return this.quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public List<LadingScheduleListItem> getLadingScheduleList() {
			return this.ladingScheduleList;
		}

		public void setLadingScheduleList(List<LadingScheduleListItem> ladingScheduleList) {
			this.ladingScheduleList = ladingScheduleList;
		}

		public static class LadingScheduleListItem {

			private String status;

			private Integer quantity;

			private Integer deliveryQuantity;

			private String ladingId;

			private List<ServerScheduleListItem> serverScheduleList;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Integer getQuantity() {
				return this.quantity;
			}

			public void setQuantity(Integer quantity) {
				this.quantity = quantity;
			}

			public Integer getDeliveryQuantity() {
				return this.deliveryQuantity;
			}

			public void setDeliveryQuantity(Integer deliveryQuantity) {
				this.deliveryQuantity = deliveryQuantity;
			}

			public String getLadingId() {
				return this.ladingId;
			}

			public void setLadingId(String ladingId) {
				this.ladingId = ladingId;
			}

			public List<ServerScheduleListItem> getServerScheduleList() {
				return this.serverScheduleList;
			}

			public void setServerScheduleList(List<ServerScheduleListItem> serverScheduleList) {
				this.serverScheduleList = serverScheduleList;
			}

			public static class ServerScheduleListItem {

				private String type;

				private String serialNumber;

				private String status;

				private Boolean delivery;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getSerialNumber() {
					return this.serialNumber;
				}

				public void setSerialNumber(String serialNumber) {
					this.serialNumber = serialNumber;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public Boolean getDelivery() {
					return this.delivery;
				}

				public void setDelivery(Boolean delivery) {
					this.delivery = delivery;
				}
			}
		}
	}

	@Override
	public QueryQuotaPlanScheduleResponse getInstance(UnmarshallerContext context) {
		return	QueryQuotaPlanScheduleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
