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
import com.aliyuncs.trademark.transform.v20180724.QueryProduceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryProduceListResponse extends AcsResponse {

	private Boolean nextPage;

	private String requestId;

	private Integer totalItemNum;

	private Boolean prePage;

	private Integer currentPageNum;

	private Integer pageSize;

	private Integer totalPageNum;

	private List<TmProduces> data;

	public Boolean getNextPage() {
		return this.nextPage;
	}

	public void setNextPage(Boolean nextPage) {
		this.nextPage = nextPage;
	}

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

	public Boolean getPrePage() {
		return this.prePage;
	}

	public void setPrePage(Boolean prePage) {
		this.prePage = prePage;
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

	public List<TmProduces> getData() {
		return this.data;
	}

	public void setData(List<TmProduces> data) {
		this.data = data;
	}

	public static class TmProduces {

		private Integer status;

		private Integer type;

		private Float orderPrice;

		private Long updateTime;

		private String materialName;

		private Long createTime;

		private String userId;

		private String receiptUrl;

		private String bizId;

		private String tmIcon;

		private String tmName;

		private String loaUrl;

		private String note;

		private String tmNumber;

		private Integer principalName;

		private Integer submitCount;

		private String orderId;

		private Classification classification;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Float getOrderPrice() {
			return this.orderPrice;
		}

		public void setOrderPrice(Float orderPrice) {
			this.orderPrice = orderPrice;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getMaterialName() {
			return this.materialName;
		}

		public void setMaterialName(String materialName) {
			this.materialName = materialName;
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

		public String getReceiptUrl() {
			return this.receiptUrl;
		}

		public void setReceiptUrl(String receiptUrl) {
			this.receiptUrl = receiptUrl;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
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

		public String getLoaUrl() {
			return this.loaUrl;
		}

		public void setLoaUrl(String loaUrl) {
			this.loaUrl = loaUrl;
		}

		public String getNote() {
			return this.note;
		}

		public void setNote(String note) {
			this.note = note;
		}

		public String getTmNumber() {
			return this.tmNumber;
		}

		public void setTmNumber(String tmNumber) {
			this.tmNumber = tmNumber;
		}

		public Integer getPrincipalName() {
			return this.principalName;
		}

		public void setPrincipalName(Integer principalName) {
			this.principalName = principalName;
		}

		public Integer getSubmitCount() {
			return this.submitCount;
		}

		public void setSubmitCount(Integer submitCount) {
			this.submitCount = submitCount;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public Classification getClassification() {
			return this.classification;
		}

		public void setClassification(Classification classification) {
			this.classification = classification;
		}

		public static class Classification {

			private String classificationName;

			private String classificationCode;

			public String getClassificationName() {
				return this.classificationName;
			}

			public void setClassificationName(String classificationName) {
				this.classificationName = classificationName;
			}

			public String getClassificationCode() {
				return this.classificationCode;
			}

			public void setClassificationCode(String classificationCode) {
				this.classificationCode = classificationCode;
			}
		}
	}

	@Override
	public QueryProduceListResponse getInstance(UnmarshallerContext context) {
		return	QueryProduceListResponseUnmarshaller.unmarshall(this, context);
	}
}
