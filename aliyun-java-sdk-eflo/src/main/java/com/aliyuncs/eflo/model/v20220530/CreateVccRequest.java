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

package com.aliyuncs.eflo.model.v20220530;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateVccRequest extends RpcAcsRequest<CreateVccResponse> {
	   

	private String bgpCidr;

	private String cenId;

	private String description;

	private Boolean accessCouldService;

	private String vccId;

	private String vSwitchId;

	private String vpdId;

	private String vpcId;
	public CreateVccRequest() {
		super("eflo", "2022-05-30", "CreateVcc", "eflo");
		setMethod(MethodType.POST);
	}

	public String getBgpCidr() {
		return this.bgpCidr;
	}

	public void setBgpCidr(String bgpCidr) {
		this.bgpCidr = bgpCidr;
		if(bgpCidr != null){
			putBodyParameter("BgpCidr", bgpCidr);
		}
	}

	public String getCenId() {
		return this.cenId;
	}

	public void setCenId(String cenId) {
		this.cenId = cenId;
		if(cenId != null){
			putBodyParameter("CenId", cenId);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public Boolean getAccessCouldService() {
		return this.accessCouldService;
	}

	public void setAccessCouldService(Boolean accessCouldService) {
		this.accessCouldService = accessCouldService;
		if(accessCouldService != null){
			putBodyParameter("AccessCouldService", accessCouldService.toString());
		}
	}

	public String getVccId() {
		return this.vccId;
	}

	public void setVccId(String vccId) {
		this.vccId = vccId;
		if(vccId != null){
			putBodyParameter("VccId", vccId);
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putBodyParameter("VSwitchId", vSwitchId);
		}
	}

	public String getVpdId() {
		return this.vpdId;
	}

	public void setVpdId(String vpdId) {
		this.vpdId = vpdId;
		if(vpdId != null){
			putBodyParameter("VpdId", vpdId);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putBodyParameter("VpcId", vpcId);
		}
	}

	@Override
	public Class<CreateVccResponse> getResponseClass() {
		return CreateVccResponse.class;
	}

}
