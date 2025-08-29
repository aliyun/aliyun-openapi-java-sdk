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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class TransferOwnershipForAllObjectRequest extends RpcAcsRequest<TransferOwnershipForAllObjectResponse> {
	   

	private Long opTenantId;

	@SerializedName("privilegeTransferRecord")
	private PrivilegeTransferRecord privilegeTransferRecord;
	public TransferOwnershipForAllObjectRequest() {
		super("dataphin-public", "2023-06-30", "TransferOwnershipForAllObject");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public PrivilegeTransferRecord getPrivilegeTransferRecord() {
		return this.privilegeTransferRecord;
	}

	public void setPrivilegeTransferRecord(PrivilegeTransferRecord privilegeTransferRecord) {
		this.privilegeTransferRecord = privilegeTransferRecord;	
		if (privilegeTransferRecord != null) {
			putBodyParameter("PrivilegeTransferRecord" , new Gson().toJson(privilegeTransferRecord));
		}	
	}

	public static class PrivilegeTransferRecord {

		@SerializedName("OldOwner")
		private String oldOwner;

		@SerializedName("TransferComment")
		private String transferComment;

		@SerializedName("NewOwner")
		private String newOwner;

		public String getOldOwner() {
			return this.oldOwner;
		}

		public void setOldOwner(String oldOwner) {
			this.oldOwner = oldOwner;
		}

		public String getTransferComment() {
			return this.transferComment;
		}

		public void setTransferComment(String transferComment) {
			this.transferComment = transferComment;
		}

		public String getNewOwner() {
			return this.newOwner;
		}

		public void setNewOwner(String newOwner) {
			this.newOwner = newOwner;
		}
	}

	@Override
	public Class<TransferOwnershipForAllObjectResponse> getResponseClass() {
		return TransferOwnershipForAllObjectResponse.class;
	}

}
