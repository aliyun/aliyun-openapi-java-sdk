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

package com.aliyuncs.ga.model.v20191120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ga.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteIpSetsRequest extends RpcAcsRequest<DeleteIpSetsResponse> {
	   

	private List<String> ipSetIdss;
	public DeleteIpSetsRequest() {
		super("Ga", "2019-11-20", "DeleteIpSets", "gaplus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getIpSetIdss() {
		return this.ipSetIdss;
	}

	public void setIpSetIdss(List<String> ipSetIdss) {
		this.ipSetIdss = ipSetIdss;	
		if (ipSetIdss != null) {
			for (int i = 0; i < ipSetIdss.size(); i++) {
				putQueryParameter("IpSetIds." + (i + 1) , ipSetIdss.get(i));
			}
		}	
	}

	@Override
	public Class<DeleteIpSetsResponse> getResponseClass() {
		return DeleteIpSetsResponse.class;
	}

}
