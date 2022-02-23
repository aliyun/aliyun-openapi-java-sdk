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

package com.aliyuncs.agency.model.v20210609;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.agency.transform.v20210609.GetOwnerAgreementInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOwnerAgreementInstanceResponse extends AcsResponse {

	private String errMsg;

	private Boolean success;

	private String errCode;

	private String requestId;

	private Data data;

	public String getErrMsg() {
		return this.errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String name;

		private String pid;

		private String uid;

		private List<AgreementPropertyRoleDTOListItem> agreementPropertyRoleDTOList;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPid() {
			return this.pid;
		}

		public void setPid(String pid) {
			this.pid = pid;
		}

		public String getUid() {
			return this.uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}

		public List<AgreementPropertyRoleDTOListItem> getAgreementPropertyRoleDTOList() {
			return this.agreementPropertyRoleDTOList;
		}

		public void setAgreementPropertyRoleDTOList(List<AgreementPropertyRoleDTOListItem> agreementPropertyRoleDTOList) {
			this.agreementPropertyRoleDTOList = agreementPropertyRoleDTOList;
		}

		public static class AgreementPropertyRoleDTOListItem {

			private String agreementCode;

			public String getAgreementCode() {
				return this.agreementCode;
			}

			public void setAgreementCode(String agreementCode) {
				this.agreementCode = agreementCode;
			}
		}
	}

	@Override
	public GetOwnerAgreementInstanceResponse getInstance(UnmarshallerContext context) {
		return	GetOwnerAgreementInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
