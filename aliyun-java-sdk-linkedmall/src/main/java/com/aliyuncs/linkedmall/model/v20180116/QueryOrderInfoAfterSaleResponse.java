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
import com.aliyuncs.linkedmall.transform.v20180116.QueryOrderInfoAfterSaleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryOrderInfoAfterSaleResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Model model;

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

	public Model getModel() {
		return this.model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public static class Model {

		private Long lmOrderId;

		private Long tbOrderId;

		private String createDate;

		private String cashAmount;

		private Long points;

		private Long pointsAmount;

		private String orderStatus;

		private String shopName;

		private String refundStatus;

		private Long refundAmount;

		private String refundRate;

		private String xiaomiCode;

		private String shopServiceTelephone;

		private String extJson;

		private List<Logistics> logisticsList;

		public Long getLmOrderId() {
			return this.lmOrderId;
		}

		public void setLmOrderId(Long lmOrderId) {
			this.lmOrderId = lmOrderId;
		}

		public Long getTbOrderId() {
			return this.tbOrderId;
		}

		public void setTbOrderId(Long tbOrderId) {
			this.tbOrderId = tbOrderId;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getCashAmount() {
			return this.cashAmount;
		}

		public void setCashAmount(String cashAmount) {
			this.cashAmount = cashAmount;
		}

		public Long getPoints() {
			return this.points;
		}

		public void setPoints(Long points) {
			this.points = points;
		}

		public Long getPointsAmount() {
			return this.pointsAmount;
		}

		public void setPointsAmount(Long pointsAmount) {
			this.pointsAmount = pointsAmount;
		}

		public String getOrderStatus() {
			return this.orderStatus;
		}

		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
		}

		public String getShopName() {
			return this.shopName;
		}

		public void setShopName(String shopName) {
			this.shopName = shopName;
		}

		public String getRefundStatus() {
			return this.refundStatus;
		}

		public void setRefundStatus(String refundStatus) {
			this.refundStatus = refundStatus;
		}

		public Long getRefundAmount() {
			return this.refundAmount;
		}

		public void setRefundAmount(Long refundAmount) {
			this.refundAmount = refundAmount;
		}

		public String getRefundRate() {
			return this.refundRate;
		}

		public void setRefundRate(String refundRate) {
			this.refundRate = refundRate;
		}

		public String getXiaomiCode() {
			return this.xiaomiCode;
		}

		public void setXiaomiCode(String xiaomiCode) {
			this.xiaomiCode = xiaomiCode;
		}

		public String getShopServiceTelephone() {
			return this.shopServiceTelephone;
		}

		public void setShopServiceTelephone(String shopServiceTelephone) {
			this.shopServiceTelephone = shopServiceTelephone;
		}

		public String getExtJson() {
			return this.extJson;
		}

		public void setExtJson(String extJson) {
			this.extJson = extJson;
		}

		public List<Logistics> getLogisticsList() {
			return this.logisticsList;
		}

		public void setLogisticsList(List<Logistics> logisticsList) {
			this.logisticsList = logisticsList;
		}

		public static class Logistics {

			private String logisticsNo;

			private String logisticsStatus;

			private String logisticsCompanyName;

			private String logisticsCompanyCode;

			public String getLogisticsNo() {
				return this.logisticsNo;
			}

			public void setLogisticsNo(String logisticsNo) {
				this.logisticsNo = logisticsNo;
			}

			public String getLogisticsStatus() {
				return this.logisticsStatus;
			}

			public void setLogisticsStatus(String logisticsStatus) {
				this.logisticsStatus = logisticsStatus;
			}

			public String getLogisticsCompanyName() {
				return this.logisticsCompanyName;
			}

			public void setLogisticsCompanyName(String logisticsCompanyName) {
				this.logisticsCompanyName = logisticsCompanyName;
			}

			public String getLogisticsCompanyCode() {
				return this.logisticsCompanyCode;
			}

			public void setLogisticsCompanyCode(String logisticsCompanyCode) {
				this.logisticsCompanyCode = logisticsCompanyCode;
			}
		}
	}

	@Override
	public QueryOrderInfoAfterSaleResponse getInstance(UnmarshallerContext context) {
		return	QueryOrderInfoAfterSaleResponseUnmarshaller.unmarshall(this, context);
	}
}
