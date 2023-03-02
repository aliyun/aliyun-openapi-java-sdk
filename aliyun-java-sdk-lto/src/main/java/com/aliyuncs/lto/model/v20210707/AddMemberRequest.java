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

package com.aliyuncs.lto.model.v20210707;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddMemberRequest extends RpcAcsRequest<AddMemberResponse> {
	   

	private String remark;

	private String uid;

	private String telephony;

	private String name;

	private Integer authorizedDeviceCount;

	private String contactor;

	private Long authorizedCount;
	public AddMemberRequest() {
		super("lto", "2021-07-07", "AddMember");
		setMethod(MethodType.POST);
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("Uid", uid);
		}
	}

	public String getTelephony() {
		return this.telephony;
	}

	public void setTelephony(String telephony) {
		this.telephony = telephony;
		if(telephony != null){
			putQueryParameter("Telephony", telephony);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Integer getAuthorizedDeviceCount() {
		return this.authorizedDeviceCount;
	}

	public void setAuthorizedDeviceCount(Integer authorizedDeviceCount) {
		this.authorizedDeviceCount = authorizedDeviceCount;
		if(authorizedDeviceCount != null){
			putQueryParameter("AuthorizedDeviceCount", authorizedDeviceCount.toString());
		}
	}

	public String getContactor() {
		return this.contactor;
	}

	public void setContactor(String contactor) {
		this.contactor = contactor;
		if(contactor != null){
			putQueryParameter("Contactor", contactor);
		}
	}

	public Long getAuthorizedCount() {
		return this.authorizedCount;
	}

	public void setAuthorizedCount(Long authorizedCount) {
		this.authorizedCount = authorizedCount;
		if(authorizedCount != null){
			putQueryParameter("AuthorizedCount", authorizedCount.toString());
		}
	}

	@Override
	public Class<AddMemberResponse> getResponseClass() {
		return AddMemberResponse.class;
	}

}
