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

package com.aliyuncs.cccxspaceinner.model.v20191227;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetAgentBusinessUnitByOuterInfoRequest extends RpcAcsRequest<GetAgentBusinessUnitByOuterInfoResponse> {
	   

	private String outerType;

	private String outerBuId;
	public GetAgentBusinessUnitByOuterInfoRequest() {
		super("CCCXSpaceInner", "2019-12-27", "GetAgentBusinessUnitByOuterInfo");
		setMethod(MethodType.GET);
	}

	public String getOuterType() {
		return this.outerType;
	}

	public void setOuterType(String outerType) {
		this.outerType = outerType;
		if(outerType != null){
			putQueryParameter("OuterType", outerType);
		}
	}

	public String getOuterBuId() {
		return this.outerBuId;
	}

	public void setOuterBuId(String outerBuId) {
		this.outerBuId = outerBuId;
		if(outerBuId != null){
			putQueryParameter("OuterBuId", outerBuId);
		}
	}

	@Override
	public Class<GetAgentBusinessUnitByOuterInfoResponse> getResponseClass() {
		return GetAgentBusinessUnitByOuterInfoResponse.class;
	}

}
