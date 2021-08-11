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

package com.aliyuncs.aiccs.model.v20191015;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.aiccs.transform.v20191015.GetAgentByIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAgentByIdResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String showName;

		private String foreignKey;

		private Integer servicerType;

		private String realName;

		private String createUserName;

		private Integer agentId;

		private String foreignNick;

		public String getShowName() {
			return this.showName;
		}

		public void setShowName(String showName) {
			this.showName = showName;
		}

		public String getForeignKey() {
			return this.foreignKey;
		}

		public void setForeignKey(String foreignKey) {
			this.foreignKey = foreignKey;
		}

		public Integer getServicerType() {
			return this.servicerType;
		}

		public void setServicerType(Integer servicerType) {
			this.servicerType = servicerType;
		}

		public String getRealName() {
			return this.realName;
		}

		public void setRealName(String realName) {
			this.realName = realName;
		}

		public String getCreateUserName() {
			return this.createUserName;
		}

		public void setCreateUserName(String createUserName) {
			this.createUserName = createUserName;
		}

		public Integer getAgentId() {
			return this.agentId;
		}

		public void setAgentId(Integer agentId) {
			this.agentId = agentId;
		}

		public String getForeignNick() {
			return this.foreignNick;
		}

		public void setForeignNick(String foreignNick) {
			this.foreignNick = foreignNick;
		}
	}

	@Override
	public GetAgentByIdResponse getInstance(UnmarshallerContext context) {
		return	GetAgentByIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
