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

package com.aliyuncs.ddosdiversion.model.v20230701;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ConfigNetStatusRequest extends RpcAcsRequest<ConfigNetStatusResponse> {
	   

	private List<String> regions;

	private List<String> subNets;

	private String net;

	private String saleId;

	private String status;
	public ConfigNetStatusRequest() {
		super("DdosDiversion", "2023-07-01", "ConfigNetStatus");
		setMethod(MethodType.POST);
	}

	public List<String> getRegions() {
		return this.regions;
	}

	public void setRegions(List<String> regions) {
		this.regions = regions;	
		if (regions != null) {
			for (int depth1 = 0; depth1 < regions.size(); depth1++) {
				putQueryParameter("Regions." + (depth1 + 1) , regions.get(depth1));
			}
		}	
	}

	public List<String> getSubNets() {
		return this.subNets;
	}

	public void setSubNets(List<String> subNets) {
		this.subNets = subNets;	
		if (subNets != null) {
			for (int depth1 = 0; depth1 < subNets.size(); depth1++) {
				putQueryParameter("SubNets." + (depth1 + 1) , subNets.get(depth1));
			}
		}	
	}

	public String getNet() {
		return this.net;
	}

	public void setNet(String net) {
		this.net = net;
		if(net != null){
			putQueryParameter("Net", net);
		}
	}

	public String getSaleId() {
		return this.saleId;
	}

	public void setSaleId(String saleId) {
		this.saleId = saleId;
		if(saleId != null){
			putQueryParameter("SaleId", saleId);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<ConfigNetStatusResponse> getResponseClass() {
		return ConfigNetStatusResponse.class;
	}

}
