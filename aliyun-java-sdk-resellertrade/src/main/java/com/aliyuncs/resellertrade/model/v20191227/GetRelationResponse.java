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

package com.aliyuncs.resellertrade.model.v20191227;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.resellertrade.transform.v20191227.GetRelationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRelationResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private String _class;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String get_Class() {
		return this._class;
	}

	public void set_Class(String _class) {
		this._class = _class;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String status;

		private Long endTime;

		private Long startTime;

		private String userType;

		private String _class;

		private Long resellerUid;

		private Boolean topReseller;

		private Long uid;

		private Boolean canLoginOfficial;

		private ResellerProductModeDO resellerProductModeDO;

		private ResellerProductRuleDO resellerProductRuleDO;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public String getUserType() {
			return this.userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

		public String get_Class() {
			return this._class;
		}

		public void set_Class(String _class) {
			this._class = _class;
		}

		public Long getResellerUid() {
			return this.resellerUid;
		}

		public void setResellerUid(Long resellerUid) {
			this.resellerUid = resellerUid;
		}

		public Boolean getTopReseller() {
			return this.topReseller;
		}

		public void setTopReseller(Boolean topReseller) {
			this.topReseller = topReseller;
		}

		public Long getUid() {
			return this.uid;
		}

		public void setUid(Long uid) {
			this.uid = uid;
		}

		public Boolean getCanLoginOfficial() {
			return this.canLoginOfficial;
		}

		public void setCanLoginOfficial(Boolean canLoginOfficial) {
			this.canLoginOfficial = canLoginOfficial;
		}

		public ResellerProductModeDO getResellerProductModeDO() {
			return this.resellerProductModeDO;
		}

		public void setResellerProductModeDO(ResellerProductModeDO resellerProductModeDO) {
			this.resellerProductModeDO = resellerProductModeDO;
		}

		public ResellerProductRuleDO getResellerProductRuleDO() {
			return this.resellerProductRuleDO;
		}

		public void setResellerProductRuleDO(ResellerProductRuleDO resellerProductRuleDO) {
			this.resellerProductRuleDO = resellerProductRuleDO;
		}

		public static class ResellerProductModeDO {

			private String productName;

			private Long isService;

			private String _class;

			private String productCode;

			public String getProductName() {
				return this.productName;
			}

			public void setProductName(String productName) {
				this.productName = productName;
			}

			public Long getIsService() {
				return this.isService;
			}

			public void setIsService(Long isService) {
				this.isService = isService;
			}

			public String get_Class() {
				return this._class;
			}

			public void set_Class(String _class) {
				this._class = _class;
			}

			public String getProductCode() {
				return this.productCode;
			}

			public void setProductCode(String productCode) {
				this.productCode = productCode;
			}
		}

		public static class ResellerProductRuleDO {

			private String _class;

			private Boolean multiOrder;

			private Boolean commodityRoute;

			private String payMode;

			public String get_Class() {
				return this._class;
			}

			public void set_Class(String _class) {
				this._class = _class;
			}

			public Boolean getMultiOrder() {
				return this.multiOrder;
			}

			public void setMultiOrder(Boolean multiOrder) {
				this.multiOrder = multiOrder;
			}

			public Boolean getCommodityRoute() {
				return this.commodityRoute;
			}

			public void setCommodityRoute(Boolean commodityRoute) {
				this.commodityRoute = commodityRoute;
			}

			public String getPayMode() {
				return this.payMode;
			}

			public void setPayMode(String payMode) {
				this.payMode = payMode;
			}
		}
	}

	@Override
	public GetRelationResponse getInstance(UnmarshallerContext context) {
		return	GetRelationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
