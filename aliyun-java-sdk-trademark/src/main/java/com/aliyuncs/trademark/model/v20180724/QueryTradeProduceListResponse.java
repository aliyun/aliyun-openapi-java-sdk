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
import com.aliyuncs.trademark.transform.v20180724.QueryTradeProduceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTradeProduceListResponse extends AcsResponse {

	private Integer currentPageNum;

	private Integer totalPageNum;

	private String requestId;

	private Integer pageSize;

	private Integer totalItemNum;

	private List<TradeProduces> data;

	public Integer getCurrentPageNum() {
		return this.currentPageNum;
	}

	public void setCurrentPageNum(Integer currentPageNum) {
		this.currentPageNum = currentPageNum;
	}

	public Integer getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalItemNum() {
		return this.totalItemNum;
	}

	public void setTotalItemNum(Integer totalItemNum) {
		this.totalItemNum = totalItemNum;
	}

	public List<TradeProduces> getData() {
		return this.data;
	}

	public void setData(List<TradeProduces> data) {
		this.data = data;
	}

	public static class TradeProduces {

		private Long updateTime;

		private Float preAmount;

		private Long createTime;

		private String userId;

		private String bizId;

		private String icon;

		private Integer buyerStatus;

		private Integer source;

		private String operateNote;

		private String preOrderId;

		private Boolean allowCancel;

		private String registerNumber;

		private String classification;

		private Float finalAmount;

		private Integer failReason;

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
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

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getIcon() {
			return this.icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
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

		public String getClassification() {
			return this.classification;
		}

		public void setClassification(String classification) {
			this.classification = classification;
		}

		public Float getFinalAmount() {
			return this.finalAmount;
		}

		public void setFinalAmount(Float finalAmount) {
			this.finalAmount = finalAmount;
		}

		public Integer getFailReason() {
			return this.failReason;
		}

		public void setFailReason(Integer failReason) {
			this.failReason = failReason;
		}
	}

	@Override
	public QueryTradeProduceListResponse getInstance(UnmarshallerContext context) {
		return	QueryTradeProduceListResponseUnmarshaller.unmarshall(this, context);
	}
}
