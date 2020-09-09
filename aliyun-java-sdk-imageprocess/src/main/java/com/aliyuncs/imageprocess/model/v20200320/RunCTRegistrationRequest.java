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

package com.aliyuncs.imageprocess.model.v20200320;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imageprocess.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RunCTRegistrationRequest extends RpcAcsRequest<RunCTRegistrationResponse> {
	   

	private String dataSourceType;

	private String orgName;

	private List<ReferenceList> referenceLists;

	private String dataFormat;

	private String orgId;

	private List<FloatingList> floatingLists;
	public RunCTRegistrationRequest() {
		super("imageprocess", "2020-03-20", "RunCTRegistration", "imageprocess");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDataSourceType() {
		return this.dataSourceType;
	}

	public void setDataSourceType(String dataSourceType) {
		this.dataSourceType = dataSourceType;
		if(dataSourceType != null){
			putBodyParameter("DataSourceType", dataSourceType);
		}
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
		if(orgName != null){
			putBodyParameter("OrgName", orgName);
		}
	}

	public List<ReferenceList> getReferenceLists() {
		return this.referenceLists;
	}

	public void setReferenceLists(List<ReferenceList> referenceLists) {
		this.referenceLists = referenceLists;	
		if (referenceLists != null) {
			for (int depth1 = 0; depth1 < referenceLists.size(); depth1++) {
				putBodyParameter("ReferenceList." + (depth1 + 1) + ".ReferenceURL" , referenceLists.get(depth1).getReferenceURL());
			}
		}	
	}

	public String getDataFormat() {
		return this.dataFormat;
	}

	public void setDataFormat(String dataFormat) {
		this.dataFormat = dataFormat;
		if(dataFormat != null){
			putBodyParameter("DataFormat", dataFormat);
		}
	}

	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
		if(orgId != null){
			putBodyParameter("OrgId", orgId);
		}
	}

	public List<FloatingList> getFloatingLists() {
		return this.floatingLists;
	}

	public void setFloatingLists(List<FloatingList> floatingLists) {
		this.floatingLists = floatingLists;	
		if (floatingLists != null) {
			for (int depth1 = 0; depth1 < floatingLists.size(); depth1++) {
				putBodyParameter("FloatingList." + (depth1 + 1) + ".FloatingURL" , floatingLists.get(depth1).getFloatingURL());
			}
		}	
	}

	public static class ReferenceList {

		private String referenceURL;

		public String getReferenceURL() {
			return this.referenceURL;
		}

		public void setReferenceURL(String referenceURL) {
			this.referenceURL = referenceURL;
		}
	}

	public static class FloatingList {

		private String floatingURL;

		public String getFloatingURL() {
			return this.floatingURL;
		}

		public void setFloatingURL(String floatingURL) {
			this.floatingURL = floatingURL;
		}
	}

	@Override
	public Class<RunCTRegistrationResponse> getResponseClass() {
		return RunCTRegistrationResponse.class;
	}

}
