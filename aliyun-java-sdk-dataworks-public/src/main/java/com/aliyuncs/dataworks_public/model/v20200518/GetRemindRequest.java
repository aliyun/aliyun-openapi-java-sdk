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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetRemindRequest extends RpcAcsRequest<GetRemindResponse> {
	   

	private Long remindId;
	public GetRemindRequest() {
		super("dataworks-public", "2020-05-18", "GetRemind");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getRemindId() {
		return this.remindId;
	}

	public void setRemindId(Long remindId) {
		this.remindId = remindId;
		if(remindId != null){
			putBodyParameter("RemindId", remindId.toString());
		}
	}

	@Override
	public Class<GetRemindResponse> getResponseClass() {
		return GetRemindResponse.class;
	}

}
