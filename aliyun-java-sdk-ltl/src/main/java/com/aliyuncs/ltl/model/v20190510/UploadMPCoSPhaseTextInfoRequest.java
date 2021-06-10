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
import java.util.List;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ltl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UploadMPCoSPhaseTextInfoRequest extends RpcAcsRequest<UploadMPCoSPhaseTextInfoResponse> {
	   

	private String phaseData;

	private String phaseId;

	private String apiVersion;

	private String bizChainId;

	private String dataKey;

	private String dataSeq;

	private String phaseGroupId;

	private List<Object> relatedDataList;
	public UploadMPCoSPhaseTextInfoRequest() {
		super("ltl", "2019-05-10", "UploadMPCoSPhaseTextInfo");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPhaseData() {
		return this.phaseData;
	}

	public void setPhaseData(String phaseData) {
		this.phaseData = phaseData;
		if(phaseData != null){
			putQueryParameter("PhaseData", phaseData);
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

	public String getPhaseGroupId() {
		return this.phaseGroupId;
	}

	public void setPhaseGroupId(String phaseGroupId) {
		this.phaseGroupId = phaseGroupId;
		if(phaseGroupId != null){
			putQueryParameter("PhaseGroupId", phaseGroupId);
		}
	}

	public List<Object> getRelatedDataList() {
		return this.relatedDataList;
	}

	public void setRelatedDataList(List<Object> relatedDataList) {
		this.relatedDataList = relatedDataList;
		if(relatedDataList != null){
			putQueryParameter("RelatedDataList", new Gson().toJson(relatedDataList));
		}
	}

	@Override
	public Class<UploadMPCoSPhaseTextInfoResponse> getResponseClass() {
		return UploadMPCoSPhaseTextInfoResponse.class;
	}

}
