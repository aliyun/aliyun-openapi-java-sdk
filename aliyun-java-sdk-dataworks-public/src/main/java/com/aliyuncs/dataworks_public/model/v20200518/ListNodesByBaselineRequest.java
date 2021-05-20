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
public class ListNodesByBaselineRequest extends RpcAcsRequest<ListNodesByBaselineResponse> {
	   

	private Long baselineId;
	public ListNodesByBaselineRequest() {
		super("dataworks-public", "2020-05-18", "ListNodesByBaseline");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getBaselineId() {
		return this.baselineId;
	}

	public void setBaselineId(Long baselineId) {
		this.baselineId = baselineId;
		if(baselineId != null){
			putBodyParameter("BaselineId", baselineId.toString());
		}
	}

	@Override
	public Class<ListNodesByBaselineResponse> getResponseClass() {
		return ListNodesByBaselineResponse.class;
	}

}
