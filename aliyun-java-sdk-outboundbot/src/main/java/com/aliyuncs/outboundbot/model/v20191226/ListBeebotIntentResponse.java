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

package com.aliyuncs.outboundbot.model.v20191226;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.ListBeebotIntentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBeebotIntentResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String requestId;

	private Boolean success;

	private String beebotRequestId;

	private String code;

	private String message;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer totalCount;

	private List<Intent> intents;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public String getBeebotRequestId() {
		return this.beebotRequestId;
	}

	public void setBeebotRequestId(String beebotRequestId) {
		this.beebotRequestId = beebotRequestId;
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Intent> getIntents() {
		return this.intents;
	}

	public void setIntents(List<Intent> intents) {
		this.intents = intents;
	}

	public static class Intent {

		private Long intentId;

		private String intentName;

		private String aliasName;

		private String modifyUserId;

		private String modifyUserName;

		private String createUserName;

		private String createTime;

		private String createUserId;

		private String modifyTime;

		public Long getIntentId() {
			return this.intentId;
		}

		public void setIntentId(Long intentId) {
			this.intentId = intentId;
		}

		public String getIntentName() {
			return this.intentName;
		}

		public void setIntentName(String intentName) {
			this.intentName = intentName;
		}

		public String getAliasName() {
			return this.aliasName;
		}

		public void setAliasName(String aliasName) {
			this.aliasName = aliasName;
		}

		public String getModifyUserId() {
			return this.modifyUserId;
		}

		public void setModifyUserId(String modifyUserId) {
			this.modifyUserId = modifyUserId;
		}

		public String getModifyUserName() {
			return this.modifyUserName;
		}

		public void setModifyUserName(String modifyUserName) {
			this.modifyUserName = modifyUserName;
		}

		public String getCreateUserName() {
			return this.createUserName;
		}

		public void setCreateUserName(String createUserName) {
			this.createUserName = createUserName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getCreateUserId() {
			return this.createUserId;
		}

		public void setCreateUserId(String createUserId) {
			this.createUserId = createUserId;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}
	}

	@Override
	public ListBeebotIntentResponse getInstance(UnmarshallerContext context) {
		return	ListBeebotIntentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
