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

package com.aliyuncs.devops_rdc.model.v20200303;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateDevopsOrganizationRequest extends RpcAcsRequest<CreateDevopsOrganizationResponse> {
	   

	private String orgName;

	private String source;

	private String realPk;

	private Integer desiredMemberCount;
	public CreateDevopsOrganizationRequest() {
		super("devops-rdc", "2020-03-03", "CreateDevopsOrganization", "1.9.6");
		setMethod(MethodType.POST);
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

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putBodyParameter("Source", source);
		}
	}

	public String getRealPk() {
		return this.realPk;
	}

	public void setRealPk(String realPk) {
		this.realPk = realPk;
		if(realPk != null){
			putBodyParameter("RealPk", realPk);
		}
	}

	public Integer getDesiredMemberCount() {
		return this.desiredMemberCount;
	}

	public void setDesiredMemberCount(Integer desiredMemberCount) {
		this.desiredMemberCount = desiredMemberCount;
		if(desiredMemberCount != null){
			putBodyParameter("DesiredMemberCount", desiredMemberCount.toString());
		}
	}

	@Override
	public Class<CreateDevopsOrganizationResponse> getResponseClass() {
		return CreateDevopsOrganizationResponse.class;
	}

}
