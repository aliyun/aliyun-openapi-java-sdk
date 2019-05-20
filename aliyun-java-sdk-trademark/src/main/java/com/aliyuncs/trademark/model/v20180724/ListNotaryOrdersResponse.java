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
import com.aliyuncs.trademark.transform.v20180724.ListNotaryOrdersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListNotaryOrdersResponse extends AcsResponse {

	private String requestId;

	private Integer totalItemNum;

	private Integer currentPageNum;

	private Integer pageSize;

	private Integer totalPageNum;

	private Boolean prePage;

	private Boolean nextPage;

	private Boolean success;

	private String errorMsg;

	private String errorCode;

	private List<NotaryOrder> data;

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

	public Boolean getPrePage() {
		return this.prePage;
	}

	public void setPrePage(Boolean prePage) {
		this.prePage = prePage;
	}

	public Boolean getNextPage() {
		return this.nextPage;
	}

	public void setNextPage(Boolean nextPage) {
		this.nextPage = nextPage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<NotaryOrder> getData() {
		return this.data;
	}

	public void setData(List<NotaryOrder> data) {
		this.data = data;
	}

	public static class NotaryOrder {

		private Long notaryOrderId;

		private String aliyunOrderId;

		private String tmRegisterNo;

		private String tmName;

		private String tmImage;

		private String tmClassification;

		private Float orderPrice;

		private Integer notaryStatus;

		private Long orderDate;

		private Long gmtModified;

		private String notaryCertificate;

		private String bizId;

		private Integer notaryType;

		private String notaryPlatformName;

		private String applyPostStatus;

		public Long getNotaryOrderId() {
			return this.notaryOrderId;
		}

		public void setNotaryOrderId(Long notaryOrderId) {
			this.notaryOrderId = notaryOrderId;
		}

		public String getAliyunOrderId() {
			return this.aliyunOrderId;
		}

		public void setAliyunOrderId(String aliyunOrderId) {
			this.aliyunOrderId = aliyunOrderId;
		}

		public String getTmRegisterNo() {
			return this.tmRegisterNo;
		}

		public void setTmRegisterNo(String tmRegisterNo) {
			this.tmRegisterNo = tmRegisterNo;
		}

		public String getTmName() {
			return this.tmName;
		}

		public void setTmName(String tmName) {
			this.tmName = tmName;
		}

		public String getTmImage() {
			return this.tmImage;
		}

		public void setTmImage(String tmImage) {
			this.tmImage = tmImage;
		}

		public String getTmClassification() {
			return this.tmClassification;
		}

		public void setTmClassification(String tmClassification) {
			this.tmClassification = tmClassification;
		}

		public Float getOrderPrice() {
			return this.orderPrice;
		}

		public void setOrderPrice(Float orderPrice) {
			this.orderPrice = orderPrice;
		}

		public Integer getNotaryStatus() {
			return this.notaryStatus;
		}

		public void setNotaryStatus(Integer notaryStatus) {
			this.notaryStatus = notaryStatus;
		}

		public Long getOrderDate() {
			return this.orderDate;
		}

		public void setOrderDate(Long orderDate) {
			this.orderDate = orderDate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getNotaryCertificate() {
			return this.notaryCertificate;
		}

		public void setNotaryCertificate(String notaryCertificate) {
			this.notaryCertificate = notaryCertificate;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public Integer getNotaryType() {
			return this.notaryType;
		}

		public void setNotaryType(Integer notaryType) {
			this.notaryType = notaryType;
		}

		public String getNotaryPlatformName() {
			return this.notaryPlatformName;
		}

		public void setNotaryPlatformName(String notaryPlatformName) {
			this.notaryPlatformName = notaryPlatformName;
		}

		public String getApplyPostStatus() {
			return this.applyPostStatus;
		}

		public void setApplyPostStatus(String applyPostStatus) {
			this.applyPostStatus = applyPostStatus;
		}
	}

	@Override
	public ListNotaryOrdersResponse getInstance(UnmarshallerContext context) {
		return	ListNotaryOrdersResponseUnmarshaller.unmarshall(this, context);
	}
}
