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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteSnatIpForSnatEntryRequest extends RpcAcsRequest<DeleteSnatIpForSnatEntryResponse> {
	   

	private String snatIp;

	private String snatEntryId;
	public DeleteSnatIpForSnatEntryRequest() {
		super("Ens", "2017-11-10", "DeleteSnatIpForSnatEntry", "ens");
		setMethod(MethodType.POST);
	}

	public String getSnatIp() {
		return this.snatIp;
	}

	public void setSnatIp(String snatIp) {
		this.snatIp = snatIp;
		if(snatIp != null){
			putQueryParameter("SnatIp", snatIp);
		}
	}

	public String getSnatEntryId() {
		return this.snatEntryId;
	}

	public void setSnatEntryId(String snatEntryId) {
		this.snatEntryId = snatEntryId;
		if(snatEntryId != null){
			putQueryParameter("SnatEntryId", snatEntryId);
		}
	}

	@Override
	public Class<DeleteSnatIpForSnatEntryResponse> getResponseClass() {
		return DeleteSnatIpForSnatEntryResponse.class;
	}

}
