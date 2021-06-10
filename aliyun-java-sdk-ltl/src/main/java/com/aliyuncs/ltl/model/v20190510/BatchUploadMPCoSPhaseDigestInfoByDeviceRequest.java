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
public class BatchUploadMPCoSPhaseDigestInfoByDeviceRequest extends RpcAcsRequest<BatchUploadMPCoSPhaseDigestInfoByDeviceResponse> {
	   

	private String iotSignature;

	private String iotAuthType;

	private String iotIdSource;

	private String phaseId;

	private String apiVersion;

	private String bizChainId;

	private List<Object> phaseDataList;

	private String iotId;

	private String phaseGroupId;

	private String iotDataDigest;

	private String iotIdServiceProvider;
	public BatchUploadMPCoSPhaseDigestInfoByDeviceRequest() {
		super("ltl", "2019-05-10", "BatchUploadMPCoSPhaseDigestInfoByDevice");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIotSignature() {
		return this.iotSignature;
	}

	public void setIotSignature(String iotSignature) {
		this.iotSignature = iotSignature;
		if(iotSignature != null){
			putQueryParameter("IotSignature", iotSignature);
		}
	}

	public String getIotAuthType() {
		return this.iotAuthType;
	}

	public void setIotAuthType(String iotAuthType) {
		this.iotAuthType = iotAuthType;
		if(iotAuthType != null){
			putQueryParameter("IotAuthType", iotAuthType);
		}
	}

	public String getIotIdSource() {
		return this.iotIdSource;
	}

	public void setIotIdSource(String iotIdSource) {
		this.iotIdSource = iotIdSource;
		if(iotIdSource != null){
			putQueryParameter("IotIdSource", iotIdSource);
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

	public List<Object> getPhaseDataList() {
		return this.phaseDataList;
	}

	public void setPhaseDataList(List<Object> phaseDataList) {
		this.phaseDataList = phaseDataList;
		if(phaseDataList != null){
			putQueryParameter("PhaseDataList", new Gson().toJson(phaseDataList));
		}
	}

	public String getIotId() {
		return this.iotId;
	}

	public void setIotId(String iotId) {
		this.iotId = iotId;
		if(iotId != null){
			putQueryParameter("IotId", iotId);
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

	public String getIotDataDigest() {
		return this.iotDataDigest;
	}

	public void setIotDataDigest(String iotDataDigest) {
		this.iotDataDigest = iotDataDigest;
		if(iotDataDigest != null){
			putQueryParameter("IotDataDigest", iotDataDigest);
		}
	}

	public String getIotIdServiceProvider() {
		return this.iotIdServiceProvider;
	}

	public void setIotIdServiceProvider(String iotIdServiceProvider) {
		this.iotIdServiceProvider = iotIdServiceProvider;
		if(iotIdServiceProvider != null){
			putQueryParameter("IotIdServiceProvider", iotIdServiceProvider);
		}
	}

	@Override
	public Class<BatchUploadMPCoSPhaseDigestInfoByDeviceResponse> getResponseClass() {
		return BatchUploadMPCoSPhaseDigestInfoByDeviceResponse.class;
	}

}
