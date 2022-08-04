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

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20180724.QueryTradeProduceDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTradeProduceDetailResponse extends AcsResponse {

	private String requestId;

	private Data data;

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

		private Long updateTime;

		private String thirdCode;

		private String share;

		private Float preAmount;

		private Long createTime;

		private String userId;

		private Float refundAmount;

		private String icon;

		private String bizId;

		private Integer buyerStatus;

		private Integer source;

		private Float confiscateAmount;

		private String operateNote;

		private String preOrderId;

		private Map<Object,Object> extend;

		private String tmName;

		private String exclusiveDateLimit;

		private Boolean allowCancel;

		private String registerNumber;

		private Float finalAmount;

		private String classification;

		private Float paidAmount;

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getThirdCode() {
			return this.thirdCode;
		}

		public void setThirdCode(String thirdCode) {
			this.thirdCode = thirdCode;
		}

		public String getShare() {
			return this.share;
		}

		public void setShare(String share) {
			this.share = share;
		}

		public Float getPreAmount() {
			return this.preAmount;
		}

		public void setPreAmount(Float preAmount) {
			this.preAmount = preAmount;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public Float getRefundAmount() {
			return this.refundAmount;
		}

		public void setRefundAmount(Float refundAmount) {
			this.refundAmount = refundAmount;
		}

		public String getIcon() {
			return this.icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public Integer getBuyerStatus() {
			return this.buyerStatus;
		}

		public void setBuyerStatus(Integer buyerStatus) {
			this.buyerStatus = buyerStatus;
		}

		public Integer getSource() {
			return this.source;
		}

		public void setSource(Integer source) {
			this.source = source;
		}

		public Float getConfiscateAmount() {
			return this.confiscateAmount;
		}

		public void setConfiscateAmount(Float confiscateAmount) {
			this.confiscateAmount = confiscateAmount;
		}

		public String getOperateNote() {
			return this.operateNote;
		}

		public void setOperateNote(String operateNote) {
			this.operateNote = operateNote;
		}

		public String getPreOrderId() {
			return this.preOrderId;
		}

		public void setPreOrderId(String preOrderId) {
			this.preOrderId = preOrderId;
		}

		public Map<Object,Object> getExtend() {
			return this.extend;
		}

		public void setExtend(Map<Object,Object> extend) {
			this.extend = extend;
		}

		public String getTmName() {
			return this.tmName;
		}

		public void setTmName(String tmName) {
			this.tmName = tmName;
		}

		public String getExclusiveDateLimit() {
			return this.exclusiveDateLimit;
		}

		public void setExclusiveDateLimit(String exclusiveDateLimit) {
			this.exclusiveDateLimit = exclusiveDateLimit;
		}

		public Boolean getAllowCancel() {
			return this.allowCancel;
		}

		public void setAllowCancel(Boolean allowCancel) {
			this.allowCancel = allowCancel;
		}

		public String getRegisterNumber() {
			return this.registerNumber;
		}

		public void setRegisterNumber(String registerNumber) {
			this.registerNumber = registerNumber;
		}

		public Float getFinalAmount() {
			return this.finalAmount;
		}

		public void setFinalAmount(Float finalAmount) {
			this.finalAmount = finalAmount;
		}

		public String getClassification() {
			return this.classification;
		}

		public void setClassification(String classification) {
			this.classification = classification;
		}

		public Float getPaidAmount() {
			return this.paidAmount;
		}

		public void setPaidAmount(Float paidAmount) {
			this.paidAmount = paidAmount;
		}
	}

	@Override
	public QueryTradeProduceDetailResponse getInstance(UnmarshallerContext context) {
		return	QueryTradeProduceDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
