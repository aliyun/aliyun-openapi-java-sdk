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
public class ListMemberAccessRecordRequest extends RpcAcsRequest<ListMemberAccessRecordResponse> {
	   

	private Long num;

	private String uid;

	private Long size;

	private String name;

	private String contactor;

	private String accessStatus;
	public ListMemberAccessRecordRequest() {
		super("lto", "2021-07-07", "ListMemberAccessRecord");
		setMethod(MethodType.POST);
	}

	public Long getNum() {
		return this.num;
	}

	public void setNum(Long num) {
		this.num = num;
		if(num != null){
			putQueryParameter("Num", num.toString());
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

	public Long getSize() {
		return this.size;
	}

	public void setSize(Long size) {
		this.size = size;
		if(size != null){
			putQueryParameter("Size", size.toString());
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

	public String getContactor() {
		return this.contactor;
	}

	public void setContactor(String contactor) {
		this.contactor = contactor;
		if(contactor != null){
			putQueryParameter("Contactor", contactor);
		}
	}

	public String getAccessStatus() {
		return this.accessStatus;
	}

	public void setAccessStatus(String accessStatus) {
		this.accessStatus = accessStatus;
		if(accessStatus != null){
			putQueryParameter("AccessStatus", accessStatus);
		}
	}

	@Override
	public Class<ListMemberAccessRecordResponse> getResponseClass() {
		return ListMemberAccessRecordResponse.class;
	}

}
