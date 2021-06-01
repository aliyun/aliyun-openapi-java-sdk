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

package com.aliyuncs.workbench_ide.model.v20210121;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddEnvironmentRequest extends RpcAcsRequest<AddEnvironmentResponse> {
	   

	private Long productId;

	private String envName;

	private String currentOrgId;

	private String securityGroupId;

	private String envDescription;

	private List<String> supportComputeTypess;

	private String vpcId;

	private Boolean isOpenNatEip;
	public AddEnvironmentRequest() {
		super("Workbench-ide", "2021-01-21", "AddEnvironment");
		setMethod(MethodType.POST);
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
		if(productId != null){
			putQueryParameter("ProductId", productId.toString());
		}
	}

	public String getEnvName() {
		return this.envName;
	}

	public void setEnvName(String envName) {
		this.envName = envName;
		if(envName != null){
			putQueryParameter("EnvName", envName);
		}
	}

	public String getCurrentOrgId() {
		return this.currentOrgId;
	}

	public void setCurrentOrgId(String currentOrgId) {
		this.currentOrgId = currentOrgId;
		if(currentOrgId != null){
			putQueryParameter("CurrentOrgId", currentOrgId);
		}
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		if(securityGroupId != null){
			putQueryParameter("SecurityGroupId", securityGroupId);
		}
	}

	public String getEnvDescription() {
		return this.envDescription;
	}

	public void setEnvDescription(String envDescription) {
		this.envDescription = envDescription;
		if(envDescription != null){
			putQueryParameter("EnvDescription", envDescription);
		}
	}

	public List<String> getSupportComputeTypess() {
		return this.supportComputeTypess;
	}

	public void setSupportComputeTypess(List<String> supportComputeTypess) {
		this.supportComputeTypess = supportComputeTypess;	
		if (supportComputeTypess != null) {
			for (int i = 0; i < supportComputeTypess.size(); i++) {
				putQueryParameter("SupportComputeTypes." + (i + 1) , supportComputeTypess.get(i));
			}
		}	
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public Boolean getIsOpenNatEip() {
		return this.isOpenNatEip;
	}

	public void setIsOpenNatEip(Boolean isOpenNatEip) {
		this.isOpenNatEip = isOpenNatEip;
		if(isOpenNatEip != null){
			putQueryParameter("IsOpenNatEip", isOpenNatEip.toString());
		}
	}

	@Override
	public Class<AddEnvironmentResponse> getResponseClass() {
		return AddEnvironmentResponse.class;
	}

}
