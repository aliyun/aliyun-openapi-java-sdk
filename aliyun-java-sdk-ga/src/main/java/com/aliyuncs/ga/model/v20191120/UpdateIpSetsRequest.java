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
public class UpdateIpSetsRequest extends RpcAcsRequest<UpdateIpSetsResponse> {
	   

	private List<IpSets> ipSetss;
	public UpdateIpSetsRequest() {
		super("Ga", "2019-11-20", "UpdateIpSets", "gaplus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<IpSets> getIpSetss() {
		return this.ipSetss;
	}

	public void setIpSetss(List<IpSets> ipSetss) {
		this.ipSetss = ipSetss;	
		if (ipSetss != null) {
			for (int depth1 = 0; depth1 < ipSetss.size(); depth1++) {
				putQueryParameter("IpSets." + (depth1 + 1) + ".Bandwidth" , ipSetss.get(depth1).getBandwidth());
				putQueryParameter("IpSets." + (depth1 + 1) + ".IpSetId" , ipSetss.get(depth1).getIpSetId());
			}
		}	
	}

	public static class IpSets {

		private Integer bandwidth;

		private String ipSetId;

		public Integer getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Integer bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getIpSetId() {
			return this.ipSetId;
		}

		public void setIpSetId(String ipSetId) {
			this.ipSetId = ipSetId;
		}
	}

	@Override
	public Class<UpdateIpSetsResponse> getResponseClass() {
		return UpdateIpSetsResponse.class;
	}

}
