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

package com.aliyuncs.trademark.model.v20180724;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20180724.QueryTmSbjProduceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTmSbjProduceResponse extends AcsResponse {

	private String requestId;

	private List<TmSbjProduceList> moudle;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TmSbjProduceList> getMoudle() {
		return this.moudle;
	}

	public void setMoudle(List<TmSbjProduceList> moudle) {
		this.moudle = moudle;
	}

	public static class TmSbjProduceList {

		private Long bitFlag;

		private String bizId;

		private String classificationCode;

		private String deleteFlag;

		private String env;

		private Long loaId;

		private String mainOrderId;

		private Long materialId;

		private String materialName;

		private String orderId;

		private Float orderPrice;

		private String principalKey;

		private String principalName;

		private String productType;

		private String riskSource;

		private String status;

		private Long submitAuditTime;

		private String submitStatus;

		private Long submitTime;

		private Long submitTimes;

		private String tmCode;

		private String tmIcon;

		private String tmName;

		private String type;

		private String userId;

		private Extend extend;

		public Long getBitFlag() {
			return this.bitFlag;
		}

		public void setBitFlag(Long bitFlag) {
			this.bitFlag = bitFlag;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getClassificationCode() {
			return this.classificationCode;
		}

		public void setClassificationCode(String classificationCode) {
			this.classificationCode = classificationCode;
		}

		public String getDeleteFlag() {
			return this.deleteFlag;
		}

		public void setDeleteFlag(String deleteFlag) {
			this.deleteFlag = deleteFlag;
		}

		public String getEnv() {
			return this.env;
		}

		public void setEnv(String env) {
			this.env = env;
		}

		public Long getLoaId() {
			return this.loaId;
		}

		public void setLoaId(Long loaId) {
			this.loaId = loaId;
		}

		public String getMainOrderId() {
			return this.mainOrderId;
		}

		public void setMainOrderId(String mainOrderId) {
			this.mainOrderId = mainOrderId;
		}

		public Long getMaterialId() {
			return this.materialId;
		}

		public void setMaterialId(Long materialId) {
			this.materialId = materialId;
		}

		public String getMaterialName() {
			return this.materialName;
		}

		public void setMaterialName(String materialName) {
			this.materialName = materialName;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public Float getOrderPrice() {
			return this.orderPrice;
		}

		public void setOrderPrice(Float orderPrice) {
			this.orderPrice = orderPrice;
		}

		public String getPrincipalKey() {
			return this.principalKey;
		}

		public void setPrincipalKey(String principalKey) {
			this.principalKey = principalKey;
		}

		public String getPrincipalName() {
			return this.principalName;
		}

		public void setPrincipalName(String principalName) {
			this.principalName = principalName;
		}

		public String getProductType() {
			return this.productType;
		}

		public void setProductType(String productType) {
			this.productType = productType;
		}

		public String getRiskSource() {
			return this.riskSource;
		}

		public void setRiskSource(String riskSource) {
			this.riskSource = riskSource;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getSubmitAuditTime() {
			return this.submitAuditTime;
		}

		public void setSubmitAuditTime(Long submitAuditTime) {
			this.submitAuditTime = submitAuditTime;
		}

		public String getSubmitStatus() {
			return this.submitStatus;
		}

		public void setSubmitStatus(String submitStatus) {
			this.submitStatus = submitStatus;
		}

		public Long getSubmitTime() {
			return this.submitTime;
		}

		public void setSubmitTime(Long submitTime) {
			this.submitTime = submitTime;
		}

		public Long getSubmitTimes() {
			return this.submitTimes;
		}

		public void setSubmitTimes(Long submitTimes) {
			this.submitTimes = submitTimes;
		}

		public String getTmCode() {
			return this.tmCode;
		}

		public void setTmCode(String tmCode) {
			this.tmCode = tmCode;
		}

		public String getTmIcon() {
			return this.tmIcon;
		}

		public void setTmIcon(String tmIcon) {
			this.tmIcon = tmIcon;
		}

		public String getTmName() {
			return this.tmName;
		}

		public void setTmName(String tmName) {
			this.tmName = tmName;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public Extend getExtend() {
			return this.extend;
		}

		public void setExtend(Extend extend) {
			this.extend = extend;
		}

		public static class Extend {

			private Long bid;

			private Boolean blackIcon;

			private String loaOssKey;

			private String logoGoodsId;

			private String materialId;

			private Long submitCount;

			private Long tmNametype;

			public Long getBid() {
				return this.bid;
			}

			public void setBid(Long bid) {
				this.bid = bid;
			}

			public Boolean getBlackIcon() {
				return this.blackIcon;
			}

			public void setBlackIcon(Boolean blackIcon) {
				this.blackIcon = blackIcon;
			}

			public String getLoaOssKey() {
				return this.loaOssKey;
			}

			public void setLoaOssKey(String loaOssKey) {
				this.loaOssKey = loaOssKey;
			}

			public String getLogoGoodsId() {
				return this.logoGoodsId;
			}

			public void setLogoGoodsId(String logoGoodsId) {
				this.logoGoodsId = logoGoodsId;
			}

			public String getMaterialId() {
				return this.materialId;
			}

			public void setMaterialId(String materialId) {
				this.materialId = materialId;
			}

			public Long getSubmitCount() {
				return this.submitCount;
			}

			public void setSubmitCount(Long submitCount) {
				this.submitCount = submitCount;
			}

			public Long getTmNametype() {
				return this.tmNametype;
			}

			public void setTmNametype(Long tmNametype) {
				this.tmNametype = tmNametype;
			}
		}
	}

	@Override
	public QueryTmSbjProduceResponse getInstance(UnmarshallerContext context) {
		return	QueryTmSbjProduceResponseUnmarshaller.unmarshall(this, context);
	}
}
