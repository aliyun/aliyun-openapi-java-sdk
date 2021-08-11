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

package com.aliyuncs.ltl.model.v20190510;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ltl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeMPCoSPhaseInfoRequest extends RpcAcsRequest<DescribeMPCoSPhaseInfoResponse> {
	   

	private String dataKey;

	private String dataSeq;

	private String phaseId;

	private String phaseGroupId;

	private String apiVersion;

	private String bizChainId;
	public DescribeMPCoSPhaseInfoRequest() {
		super("ltl", "2019-05-10", "DescribeMPCoSPhaseInfo");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDataKey() {
		return this.dataKey;
	}

	public void setDataKey(String dataKey) {
		this.dataKey = dataKey;
		if(dataKey != null){
			putQueryParameter("DataKey", dataKey);
		}
	}

	public String getDataSeq() {
		return this.dataSeq;
	}

	public void setDataSeq(String dataSeq) {
		this.dataSeq = dataSeq;
		if(dataSeq != null){
			putQueryParameter("DataSeq", dataSeq);
		}
	}

	public String getPhaseId() {
		return this.phaseId;
	}

	public void setPhaseId(String phaseId) {
		this.phaseId = phaseId;
		if(phaseId != null){
			putQueryParameter("PhaseId", phaseId);
		}
	}

	public String getPhaseGroupId() {
		return this.phaseGroupId;
	}

	public void setPhaseGroupId(String phaseGroupId) {
		this.phaseGroupId = phaseGroupId;
		if(phaseGroupId != null){
			putQueryParameter("PhaseGroupId", phaseGroupId);
		}
	}

	public String getApiVersion() {
		return this.apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
		if(apiVersion != null){
			putQueryParameter("ApiVersion", apiVersion);
		}
	}

	public String getBizChainId() {
		return this.bizChainId;
	}

	public void setBizChainId(String bizChainId) {
		this.bizChainId = bizChainId;
		if(bizChainId != null){
			putQueryParameter("BizChainId", bizChainId);
		}
	}

	@Override
	public Class<DescribeMPCoSPhaseInfoResponse> getResponseClass() {
		return DescribeMPCoSPhaseInfoResponse.class;
	}

}
