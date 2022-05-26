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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.account_crm.transform.v20160606.RegisterInternalAccountForBucResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RegisterInternalAccountForBucResponse extends AcsResponse {

	private String msg;

	private String code;

	private String message;

	private String requestId;

	private String localizedMessage;

	private Data data;

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLocalizedMessage() {
		return this.localizedMessage;
	}

	public void setLocalizedMessage(String localizedMessage) {
		this.localizedMessage = localizedMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String parentPk;

		private String pk;

		private String site;

		private String havanaId;

		private String accountStatus;

		private String lastLoginTime;

		private String partnerPk;

		private String accountStructure;

		private String ownerBid;

		private String extendInfo;

		public String getParentPk() {
			return this.parentPk;
		}

		public void setParentPk(String parentPk) {
			this.parentPk = parentPk;
		}

		public String getPk() {
			return this.pk;
		}

		public void setPk(String pk) {
			this.pk = pk;
		}

		public String getSite() {
			return this.site;
		}

		public void setSite(String site) {
			this.site = site;
		}

		public String getHavanaId() {
			return this.havanaId;
		}

		public void setHavanaId(String havanaId) {
			this.havanaId = havanaId;
		}

		public String getAccountStatus() {
			return this.accountStatus;
		}

		public void setAccountStatus(String accountStatus) {
			this.accountStatus = accountStatus;
		}

		public String getLastLoginTime() {
			return this.lastLoginTime;
		}

		public void setLastLoginTime(String lastLoginTime) {
			this.lastLoginTime = lastLoginTime;
		}

		public String getPartnerPk() {
			return this.partnerPk;
		}

		public void setPartnerPk(String partnerPk) {
			this.partnerPk = partnerPk;
		}

		public String getAccountStructure() {
			return this.accountStructure;
		}

		public void setAccountStructure(String accountStructure) {
			this.accountStructure = accountStructure;
		}

		public String getOwnerBid() {
			return this.ownerBid;
		}

		public void setOwnerBid(String ownerBid) {
			this.ownerBid = ownerBid;
		}

		public String getExtendInfo() {
			return this.extendInfo;
		}

		public void setExtendInfo(String extendInfo) {
			this.extendInfo = extendInfo;
		}
	}

	@Override
	public RegisterInternalAccountForBucResponse getInstance(UnmarshallerContext context) {
		return	RegisterInternalAccountForBucResponseUnmarshaller.unmarshall(this, context);
	}
}
