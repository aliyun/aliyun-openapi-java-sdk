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

package com.aliyuncs.dyplsapi.model.v20170525;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dyplsapi.transform.v20170525.QuerySubscriptionDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySubscriptionDetailResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private SecretBindDetailDTO secretBindDetailDTO;

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

	public SecretBindDetailDTO getSecretBindDetailDTO() {
		return this.secretBindDetailDTO;
	}

	public void setSecretBindDetailDTO(SecretBindDetailDTO secretBindDetailDTO) {
		this.secretBindDetailDTO = secretBindDetailDTO;
	}

	public static class SecretBindDetailDTO {

		private String subsId;

		private String phoneNoA;

		private String phoneNoX;

		private String phoneNoB;

		private String extension;

		private Long groupId;

		private String gmtCreate;

		private String expireDate;

		private Boolean needRecord;

		private String callRestrict;

		private Long status;

		private Boolean aSRStatus;

		private String aSRModelId;

		public String getSubsId() {
			return this.subsId;
		}

		public void setSubsId(String subsId) {
			this.subsId = subsId;
		}

		public String getPhoneNoA() {
			return this.phoneNoA;
		}

		public void setPhoneNoA(String phoneNoA) {
			this.phoneNoA = phoneNoA;
		}

		public String getPhoneNoX() {
			return this.phoneNoX;
		}

		public void setPhoneNoX(String phoneNoX) {
			this.phoneNoX = phoneNoX;
		}

		public String getPhoneNoB() {
			return this.phoneNoB;
		}

		public void setPhoneNoB(String phoneNoB) {
			this.phoneNoB = phoneNoB;
		}

		public String getExtension() {
			return this.extension;
		}

		public void setExtension(String extension) {
			this.extension = extension;
		}

		public Long getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getExpireDate() {
			return this.expireDate;
		}

		public void setExpireDate(String expireDate) {
			this.expireDate = expireDate;
		}

		public Boolean getNeedRecord() {
			return this.needRecord;
		}

		public void setNeedRecord(Boolean needRecord) {
			this.needRecord = needRecord;
		}

		public String getCallRestrict() {
			return this.callRestrict;
		}

		public void setCallRestrict(String callRestrict) {
			this.callRestrict = callRestrict;
		}

		public Long getStatus() {
			return this.status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}

		public Boolean getASRStatus() {
			return this.aSRStatus;
		}

		public void setASRStatus(Boolean aSRStatus) {
			this.aSRStatus = aSRStatus;
		}

		public String getASRModelId() {
			return this.aSRModelId;
		}

		public void setASRModelId(String aSRModelId) {
			this.aSRModelId = aSRModelId;
		}
	}

	@Override
	public QuerySubscriptionDetailResponse getInstance(UnmarshallerContext context) {
		return	QuerySubscriptionDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
