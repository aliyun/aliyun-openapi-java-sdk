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

package com.aliyuncs.dypnsapi.model.v20170525;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dypnsapi.transform.v20170525.QuerySendDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySendDetailsResponse extends AcsResponse {

	private String accessDeniedDetail;

	private Long totalCount;

	private String message;

	private String code;

	private Boolean success;

	private List<ModelItem> model;

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ModelItem> getModel() {
		return this.model;
	}

	public void setModel(List<ModelItem> model) {
		this.model = model;
	}

	public static class ModelItem {

		private String templateCode;

		private String receiveDate;

		private String phoneNum;

		private String content;

		private Long sendStatus;

		private String outId;

		private String sendDate;

		private String errCode;

		public String getTemplateCode() {
			return this.templateCode;
		}

		public void setTemplateCode(String templateCode) {
			this.templateCode = templateCode;
		}

		public String getReceiveDate() {
			return this.receiveDate;
		}

		public void setReceiveDate(String receiveDate) {
			this.receiveDate = receiveDate;
		}

		public String getPhoneNum() {
			return this.phoneNum;
		}

		public void setPhoneNum(String phoneNum) {
			this.phoneNum = phoneNum;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public Long getSendStatus() {
			return this.sendStatus;
		}

		public void setSendStatus(Long sendStatus) {
			this.sendStatus = sendStatus;
		}

		public String getOutId() {
			return this.outId;
		}

		public void setOutId(String outId) {
			this.outId = outId;
		}

		public String getSendDate() {
			return this.sendDate;
		}

		public void setSendDate(String sendDate) {
			this.sendDate = sendDate;
		}

		public String getErrCode() {
			return this.errCode;
		}

		public void setErrCode(String errCode) {
			this.errCode = errCode;
		}
	}

	@Override
	public QuerySendDetailsResponse getInstance(UnmarshallerContext context) {
		return	QuerySendDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
