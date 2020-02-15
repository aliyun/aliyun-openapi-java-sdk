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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ApplyAntChainCertificateWithKeyAutoCreationRequest extends RpcAcsRequest<ApplyAntChainCertificateWithKeyAutoCreationResponse> {
	   

	private String organizationUnitName;

	private String localityName;

	private String password;

	private String commonName;

	private String antChainId;

	private String countryName;

	private String stateOrProvinceName;

	private String organizationName;

	private String consortiumId;
	public ApplyAntChainCertificateWithKeyAutoCreationRequest() {
		super("Baas", "2018-12-21", "ApplyAntChainCertificateWithKeyAutoCreation", "baas");
		setMethod(MethodType.PUT);
	}

	public String getOrganizationUnitName() {
		return this.organizationUnitName;
	}

	public void setOrganizationUnitName(String organizationUnitName) {
		this.organizationUnitName = organizationUnitName;
		if(organizationUnitName != null){
			putBodyParameter("OrganizationUnitName", organizationUnitName);
		}
	}

	public String getLocalityName() {
		return this.localityName;
	}

	public void setLocalityName(String localityName) {
		this.localityName = localityName;
		if(localityName != null){
			putBodyParameter("LocalityName", localityName);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putBodyParameter("Password", password);
		}
	}

	public String getCommonName() {
		return this.commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
		if(commonName != null){
			putBodyParameter("CommonName", commonName);
		}
	}

	public String getAntChainId() {
		return this.antChainId;
	}

	public void setAntChainId(String antChainId) {
		this.antChainId = antChainId;
		if(antChainId != null){
			putBodyParameter("AntChainId", antChainId);
		}
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
		if(countryName != null){
			putBodyParameter("CountryName", countryName);
		}
	}

	public String getStateOrProvinceName() {
		return this.stateOrProvinceName;
	}

	public void setStateOrProvinceName(String stateOrProvinceName) {
		this.stateOrProvinceName = stateOrProvinceName;
		if(stateOrProvinceName != null){
			putBodyParameter("StateOrProvinceName", stateOrProvinceName);
		}
	}

	public String getOrganizationName() {
		return this.organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
		if(organizationName != null){
			putBodyParameter("OrganizationName", organizationName);
		}
	}

	public String getConsortiumId() {
		return this.consortiumId;
	}

	public void setConsortiumId(String consortiumId) {
		this.consortiumId = consortiumId;
		if(consortiumId != null){
			putBodyParameter("ConsortiumId", consortiumId);
		}
	}

	@Override
	public Class<ApplyAntChainCertificateWithKeyAutoCreationResponse> getResponseClass() {
		return ApplyAntChainCertificateWithKeyAutoCreationResponse.class;
	}

}
