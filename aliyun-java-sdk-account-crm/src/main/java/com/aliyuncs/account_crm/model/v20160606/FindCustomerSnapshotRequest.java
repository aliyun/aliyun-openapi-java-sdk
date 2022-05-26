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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class FindCustomerSnapshotRequest extends RpcAcsRequest<FindCustomerSnapshotResponse> {
	   

	private String versionId;

	private Long pk;

	private String infoType;
	public FindCustomerSnapshotRequest() {
		super("account-crm", "2016-06-06", "FindCustomerSnapshot");
		setMethod(MethodType.POST);
	}

	public String getVersionId() {
		return this.versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
		if(versionId != null){
			putQueryParameter("VersionId", versionId);
		}
	}

	public Long getPk() {
		return this.pk;
	}

	public void setPk(Long pk) {
		this.pk = pk;
		if(pk != null){
			putQueryParameter("Pk", pk.toString());
		}
	}

	public String getInfoType() {
		return this.infoType;
	}

	public void setInfoType(String infoType) {
		this.infoType = infoType;
		if(infoType != null){
			putQueryParameter("InfoType", infoType);
		}
	}

	@Override
	public Class<FindCustomerSnapshotResponse> getResponseClass() {
		return FindCustomerSnapshotResponse.class;
	}

}
