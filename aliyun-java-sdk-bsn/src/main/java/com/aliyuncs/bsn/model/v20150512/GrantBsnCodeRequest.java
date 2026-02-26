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

package com.aliyuncs.bsn.model.v20150512;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GrantBsnCodeRequest extends RpcAcsRequest<GrantBsnCodeResponse> {
	   

	private String notes;

	private Long grantToAliuid;

	private String sn;

	private Long aliUid;
	public GrantBsnCodeRequest() {
		super("Bsn", "2015-05-12", "GrantBsnCode");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
		if(notes != null){
			putQueryParameter("Notes", notes);
		}
	}

	public Long getGrantToAliuid() {
		return this.grantToAliuid;
	}

	public void setGrantToAliuid(Long grantToAliuid) {
		this.grantToAliuid = grantToAliuid;
		if(grantToAliuid != null){
			putQueryParameter("GrantToAliuid", grantToAliuid.toString());
		}
	}

	public String getSn() {
		return this.sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
		if(sn != null){
			putQueryParameter("Sn", sn);
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
		}
	}

	@Override
	public Class<GrantBsnCodeResponse> getResponseClass() {
		return GrantBsnCodeResponse.class;
	}

}
