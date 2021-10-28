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

package com.aliyuncs.cloudauth.model.v20200618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudauth.transform.v20200618.DescribeSmsDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSmsDetailResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private Integer totalItem;

	private Integer totalPage;

	private Integer currentPage;

	private Integer pageSize;

	private List<ItemsItem> items;

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

	public Integer getTotalItem() {
		return this.totalItem;
	}

	public void setTotalItem(Integer totalItem) {
		this.totalItem = totalItem;
	}

	public Integer getTotalPage() {
		return this.totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public static class ItemsItem {

		private String bizId;

		private String outerOrderNo;

		private String content;

		private String errorCode;

		private String errorMessage;

		private Integer smsSize;

		private String mobile;

		private String receiveDate;

		private String sendDate;

		private String signName;

		private String templateCode;

		private String taskDate;

		private String sendStatus;

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getOuterOrderNo() {
			return this.outerOrderNo;
		}

		public void setOuterOrderNo(String outerOrderNo) {
			this.outerOrderNo = outerOrderNo;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public Integer getSmsSize() {
			return this.smsSize;
		}

		public void setSmsSize(Integer smsSize) {
			this.smsSize = smsSize;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getReceiveDate() {
			return this.receiveDate;
		}

		public void setReceiveDate(String receiveDate) {
			this.receiveDate = receiveDate;
		}

		public String getSendDate() {
			return this.sendDate;
		}

		public void setSendDate(String sendDate) {
			this.sendDate = sendDate;
		}

		public String getSignName() {
			return this.signName;
		}

		public void setSignName(String signName) {
			this.signName = signName;
		}

		public String getTemplateCode() {
			return this.templateCode;
		}

		public void setTemplateCode(String templateCode) {
			this.templateCode = templateCode;
		}

		public String getTaskDate() {
			return this.taskDate;
		}

		public void setTaskDate(String taskDate) {
			this.taskDate = taskDate;
		}

		public String getSendStatus() {
			return this.sendStatus;
		}

		public void setSendStatus(String sendStatus) {
			this.sendStatus = sendStatus;
		}
	}

	@Override
	public DescribeSmsDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeSmsDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
