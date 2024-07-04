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

package com.aliyuncs.dataphinconsole.model.v20240331;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SendTrialOrderRequest extends RpcAcsRequest<SendTrialOrderResponse> {
	   

	private String proposerName;

	private String proposerMobile;

	private String instanceRegion;

	private String sectorDetail;

	private String companyName;

	@SerializedName("featureCodes")
	private List<String> featureCodes;

	private String sectorName;

	private String verificationCode;
	public SendTrialOrderRequest() {
		super("DataphinConsole", "2024-03-31", "SendTrialOrder");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getProposerName() {
		return this.proposerName;
	}

	public void setProposerName(String proposerName) {
		this.proposerName = proposerName;
		if(proposerName != null){
			putBodyParameter("ProposerName", proposerName);
		}
	}

	public String getProposerMobile() {
		return this.proposerMobile;
	}

	public void setProposerMobile(String proposerMobile) {
		this.proposerMobile = proposerMobile;
		if(proposerMobile != null){
			putBodyParameter("ProposerMobile", proposerMobile);
		}
	}

	public String getInstanceRegion() {
		return this.instanceRegion;
	}

	public void setInstanceRegion(String instanceRegion) {
		this.instanceRegion = instanceRegion;
		if(instanceRegion != null){
			putBodyParameter("InstanceRegion", instanceRegion);
		}
	}

	public String getSectorDetail() {
		return this.sectorDetail;
	}

	public void setSectorDetail(String sectorDetail) {
		this.sectorDetail = sectorDetail;
		if(sectorDetail != null){
			putBodyParameter("SectorDetail", sectorDetail);
		}
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
		if(companyName != null){
			putBodyParameter("CompanyName", companyName);
		}
	}

	public List<String> getFeatureCodes() {
		return this.featureCodes;
	}

	public void setFeatureCodes(List<String> featureCodes) {
		this.featureCodes = featureCodes;	
		if (featureCodes != null) {
			putBodyParameter("FeatureCodes" , new Gson().toJson(featureCodes));
		}	
	}

	public String getSectorName() {
		return this.sectorName;
	}

	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
		if(sectorName != null){
			putBodyParameter("SectorName", sectorName);
		}
	}

	public String getVerificationCode() {
		return this.verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
		if(verificationCode != null){
			putBodyParameter("VerificationCode", verificationCode);
		}
	}

	@Override
	public Class<SendTrialOrderResponse> getResponseClass() {
		return SendTrialOrderResponse.class;
	}

}
