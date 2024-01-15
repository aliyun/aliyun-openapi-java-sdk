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

package com.aliyuncs.trademark.model.v20190902;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetStsByTaobaoUidRequest extends RpcAcsRequest<GetStsByTaobaoUidResponse> {
	   

	private String aliyunUid;

	private String tbUid;
	public GetStsByTaobaoUidRequest() {
		super("Trademark", "2019-09-02", "GetStsByTaobaoUid");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAliyunUid() {
		return this.aliyunUid;
	}

	public void setAliyunUid(String aliyunUid) {
		this.aliyunUid = aliyunUid;
		if(aliyunUid != null){
			putQueryParameter("AliyunUid", aliyunUid);
		}
	}

	public String getTbUid() {
		return this.tbUid;
	}

	public void setTbUid(String tbUid) {
		this.tbUid = tbUid;
		if(tbUid != null){
			putQueryParameter("TbUid", tbUid);
		}
	}

	@Override
	public Class<GetStsByTaobaoUidResponse> getResponseClass() {
		return GetStsByTaobaoUidResponse.class;
	}

}
