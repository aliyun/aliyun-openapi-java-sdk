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

	private String code;

	private String message;

	private String requestId;

	private SecretBindDetailDTO secretBindDetailDTO;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public SecretBindDetailDTO getSecretBindDetailDTO() {
		return this.secretBindDetailDTO;
	}

	public void setSecretBindDetailDTO(SecretBindDetailDTO secretBindDetailDTO) {
		this.secretBindDetailDTO = secretBindDetailDTO;
	}

	public static class SecretBindDetailDTO {

		private Long status;

		private String extension;

		private String phoneNoB;

		private Long groupId;

		private Boolean needRecord;

		private Boolean aSRStatus;

		private String gmtCreate;

		private String expireDate;

		private String subsId;

		private String phoneNoX;

		private String callRestrict;

		private String aSRModelId;

		private String phoneNoA;

		public Long getStatus() {
			return this.status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}

		public String getExtension() {
			return this.extension;
		}

		public void setExtension(String extension) {
			this.extension = extension;
		}

		public String getPhoneNoB() {
			return this.phoneNoB;
		}

		public void setPhoneNoB(String phoneNoB) {
			this.phoneNoB = phoneNoB;
		}

		public Long getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}

		public Boolean getNeedRecord() {
			return this.needRecord;
		}

		public void setNeedRecord(Boolean needRecord) {
			this.needRecord = needRecord;
		}

		public Boolean getASRStatus() {
			return this.aSRStatus;
		}

		public void setASRStatus(Boolean aSRStatus) {
			this.aSRStatus = aSRStatus;
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

		public String getSubsId() {
			return this.subsId;
		}

		public void setSubsId(String subsId) {
			this.subsId = subsId;
		}

		public String getPhoneNoX() {
			return this.phoneNoX;
		}

		public void setPhoneNoX(String phoneNoX) {
			this.phoneNoX = phoneNoX;
		}

		public String getCallRestrict() {
			return this.callRestrict;
		}

		public void setCallRestrict(String callRestrict) {
			this.callRestrict = callRestrict;
		}

		public String getASRModelId() {
			return this.aSRModelId;
		}

		public void setASRModelId(String aSRModelId) {
			this.aSRModelId = aSRModelId;
		}

		public String getPhoneNoA() {
			return this.phoneNoA;
		}

		public void setPhoneNoA(String phoneNoA) {
			this.phoneNoA = phoneNoA;
		}
	}

	@Override
	public QuerySubscriptionDetailResponse getInstance(UnmarshallerContext context) {
		return	QuerySubscriptionDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
