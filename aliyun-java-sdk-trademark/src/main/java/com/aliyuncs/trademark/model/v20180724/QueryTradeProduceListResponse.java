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

	private String requestId;

	private Integer totalItemNum;

	private Integer currentPageNum;

	private Integer pageSize;

	private Integer totalPageNum;

	private List<TradeProduces> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalItemNum() {
		return this.totalItemNum;
	}

	public void setTotalItemNum(Integer totalItemNum) {
		this.totalItemNum = totalItemNum;
	}

	public Integer getCurrentPageNum() {
		return this.currentPageNum;
	}

	public void setCurrentPageNum(Integer currentPageNum) {
		this.currentPageNum = currentPageNum;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public List<TradeProduces> getData() {
		return this.data;
	}

	public void setData(List<TradeProduces> data) {
		this.data = data;
	}

	public static class TradeProduces {

		private String bizId;

		private String preOrderId;

		private Integer preAmount;

		private Integer finalAmount;

		private String registerNumber;

		private String classification;

		private String icon;

		private String operateNote;

		private Integer buyerStatus;

		private String userId;

		private Long createTime;

		private Long updateTime;

		private Boolean allowCancel;

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getPreOrderId() {
			return this.preOrderId;
		}

		public void setPreOrderId(String preOrderId) {
			this.preOrderId = preOrderId;
		}

		public Integer getPreAmount() {
			return this.preAmount;
		}

		public void setPreAmount(Integer preAmount) {
			this.preAmount = preAmount;
		}

		public Integer getFinalAmount() {
			return this.finalAmount;
		}

		public void setFinalAmount(Integer finalAmount) {
			this.finalAmount = finalAmount;
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

		public String getIcon() {
			return this.icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}

		public String getOperateNote() {
			return this.operateNote;
		}

		public void setOperateNote(String operateNote) {
			this.operateNote = operateNote;
		}

		public Integer getBuyerStatus() {
			return this.buyerStatus;
		}

		public void setBuyerStatus(Integer buyerStatus) {
			this.buyerStatus = buyerStatus;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public Boolean getAllowCancel() {
			return this.allowCancel;
		}

		public void setAllowCancel(Boolean allowCancel) {
			this.allowCancel = allowCancel;
		}
	}

	@Override
	public QueryTradeProduceListResponse getInstance(UnmarshallerContext context) {
		return	QueryTradeProduceListResponseUnmarshaller.unmarshall(this, context);
	}
}
