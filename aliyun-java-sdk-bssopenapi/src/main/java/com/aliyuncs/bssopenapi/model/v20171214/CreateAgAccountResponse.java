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

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.CreateAgAccountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateAgAccountResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private AgRelationDto agRelationDto;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public AgRelationDto getAgRelationDto() {
		return this.agRelationDto;
	}

	public void setAgRelationDto(AgRelationDto agRelationDto) {
		this.agRelationDto = agRelationDto;
	}

	public static class AgRelationDto {

		private String pk;

		private String type;

		private String mpk;

		private String ramAdminRoleName;

		public String getPk() {
			return this.pk;
		}

		public void setPk(String pk) {
			this.pk = pk;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getMpk() {
			return this.mpk;
		}

		public void setMpk(String mpk) {
			this.mpk = mpk;
		}

		public String getRamAdminRoleName() {
			return this.ramAdminRoleName;
		}

		public void setRamAdminRoleName(String ramAdminRoleName) {
			this.ramAdminRoleName = ramAdminRoleName;
		}
	}

	@Override
	public CreateAgAccountResponse getInstance(UnmarshallerContext context) {
		return	CreateAgAccountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
