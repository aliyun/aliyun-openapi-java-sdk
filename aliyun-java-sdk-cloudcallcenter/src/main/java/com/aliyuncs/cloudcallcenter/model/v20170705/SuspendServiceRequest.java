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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SuspendServiceRequest extends RpcAcsRequest<SuspendServiceResponse> {
	
	public SuspendServiceRequest() {
		super("CloudCallCenter", "2017-07-05", "SuspendService", "CloudCallCenter", "innerAPI");
	}

	private Long ownerUid;

	public Long getOwnerUid() {
		return this.ownerUid;
	}

	public void setOwnerUid(Long ownerUid) {
		this.ownerUid = ownerUid;
		if(ownerUid != null){
			putQueryParameter("OwnerUid", ownerUid.toString());
		}
	}

	@Override
	public Class<SuspendServiceResponse> getResponseClass() {
		return SuspendServiceResponse.class;
	}

}
