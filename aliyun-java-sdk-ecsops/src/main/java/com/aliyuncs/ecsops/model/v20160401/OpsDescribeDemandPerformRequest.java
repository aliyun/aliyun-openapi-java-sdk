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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeDemandPerformRequest extends RpcAcsRequest<OpsDescribeDemandPerformResponse> {
	   

	private List<String> demandIdss;

	private List<String> subDemandIdss;

	private String auditParamStr;
	public OpsDescribeDemandPerformRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeDemandPerform", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getDemandIdss() {
		return this.demandIdss;
	}

	public void setDemandIdss(List<String> demandIdss) {
		this.demandIdss = demandIdss;	
		if (demandIdss != null) {
			for (int i = 0; i < demandIdss.size(); i++) {
				putQueryParameter("DemandIds." + (i + 1) , demandIdss.get(i));
			}
		}	
	}

	public List<String> getSubDemandIdss() {
		return this.subDemandIdss;
	}

	public void setSubDemandIdss(List<String> subDemandIdss) {
		this.subDemandIdss = subDemandIdss;	
		if (subDemandIdss != null) {
			for (int i = 0; i < subDemandIdss.size(); i++) {
				putQueryParameter("SubDemandIds." + (i + 1) , subDemandIdss.get(i));
			}
		}	
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsDescribeDemandPerformResponse> getResponseClass() {
		return OpsDescribeDemandPerformResponse.class;
	}

}
