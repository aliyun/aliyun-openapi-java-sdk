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

package com.aliyuncs.linkwan.model.v20190301;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkwan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CountNodeTupleOrdersRequest extends RpcAcsRequest<CountNodeTupleOrdersResponse> {
	   

	private Boolean isKpm;

	private List<String> statess;
	public CountNodeTupleOrdersRequest() {
		super("LinkWAN", "2019-03-01", "CountNodeTupleOrders", "linkwan");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getIsKpm() {
		return this.isKpm;
	}

	public void setIsKpm(Boolean isKpm) {
		this.isKpm = isKpm;
		if(isKpm != null){
			putQueryParameter("IsKpm", isKpm.toString());
		}
	}

	public List<String> getStatess() {
		return this.statess;
	}

	public void setStatess(List<String> statess) {
		this.statess = statess;	
		if (statess != null) {
			for (int i = 0; i < statess.size(); i++) {
				putQueryParameter("States." + (i + 1) , statess.get(i));
			}
		}	
	}

	@Override
	public Class<CountNodeTupleOrdersResponse> getResponseClass() {
		return CountNodeTupleOrdersResponse.class;
	}

}
