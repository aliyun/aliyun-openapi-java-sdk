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

package com.aliyuncs.account_crm.model.v20160606;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.account_crm.transform.v20160606.GetDingTalkUserOrgByAliyunTmpCodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDingTalkUserOrgByAliyunTmpCodeResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String httpCode;

	private String message;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(String httpCode) {
		this.httpCode = httpCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String associatedUnionId;

		private String nick;

		private List<OrgDtoListItem> orgDtoList;

		public String getAssociatedUnionId() {
			return this.associatedUnionId;
		}

		public void setAssociatedUnionId(String associatedUnionId) {
			this.associatedUnionId = associatedUnionId;
		}

		public String getNick() {
			return this.nick;
		}

		public void setNick(String nick) {
			this.nick = nick;
		}

		public List<OrgDtoListItem> getOrgDtoList() {
			return this.orgDtoList;
		}

		public void setOrgDtoList(List<OrgDtoListItem> orgDtoList) {
			this.orgDtoList = orgDtoList;
		}

		public static class OrgDtoListItem {

			private String orgName;

			private String orgId;

			private String corpId;

			public String getOrgName() {
				return this.orgName;
			}

			public void setOrgName(String orgName) {
				this.orgName = orgName;
			}

			public String getOrgId() {
				return this.orgId;
			}

			public void setOrgId(String orgId) {
				this.orgId = orgId;
			}

			public String getCorpId() {
				return this.corpId;
			}

			public void setCorpId(String corpId) {
				this.corpId = corpId;
			}
		}
	}

	@Override
	public GetDingTalkUserOrgByAliyunTmpCodeResponse getInstance(UnmarshallerContext context) {
		return	GetDingTalkUserOrgByAliyunTmpCodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
