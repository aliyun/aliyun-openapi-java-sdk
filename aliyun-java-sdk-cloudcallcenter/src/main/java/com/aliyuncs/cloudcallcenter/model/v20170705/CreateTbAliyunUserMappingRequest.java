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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateTbAliyunUserMappingRequest extends RpcAcsRequest<CreateTbAliyunUserMappingResponse> {
	
	public CreateTbAliyunUserMappingRequest() {
		super("CloudCallCenter", "2017-07-05", "CreateTbAliyunUserMapping", "CloudCallCenter", "innerAPI");
	}

	private Long aliyunPk;

	private Long tbUserid;

	private Boolean subAccount;

	private Long primaryAccountPk;

	private String aliyunAkId;

	private String aliyunAkSecret;

	private String tbNickname;

	public Long getAliyunPk() {
		return this.aliyunPk;
	}

	public void setAliyunPk(Long aliyunPk) {
		this.aliyunPk = aliyunPk;
		if(aliyunPk != null){
			putQueryParameter("AliyunPk", aliyunPk.toString());
		}
	}

	public Long getTbUserid() {
		return this.tbUserid;
	}

	public void setTbUserid(Long tbUserid) {
		this.tbUserid = tbUserid;
		if(tbUserid != null){
			putQueryParameter("TbUserid", tbUserid.toString());
		}
	}

	public Boolean getSubAccount() {
		return this.subAccount;
	}

	public void setSubAccount(Boolean subAccount) {
		this.subAccount = subAccount;
		if(subAccount != null){
			putQueryParameter("SubAccount", subAccount.toString());
		}
	}

	public Long getPrimaryAccountPk() {
		return this.primaryAccountPk;
	}

	public void setPrimaryAccountPk(Long primaryAccountPk) {
		this.primaryAccountPk = primaryAccountPk;
		if(primaryAccountPk != null){
			putQueryParameter("PrimaryAccountPk", primaryAccountPk.toString());
		}
	}

	public String getAliyunAkId() {
		return this.aliyunAkId;
	}

	public void setAliyunAkId(String aliyunAkId) {
		this.aliyunAkId = aliyunAkId;
		if(aliyunAkId != null){
			putQueryParameter("AliyunAkId", aliyunAkId);
		}
	}

	public String getAliyunAkSecret() {
		return this.aliyunAkSecret;
	}

	public void setAliyunAkSecret(String aliyunAkSecret) {
		this.aliyunAkSecret = aliyunAkSecret;
		if(aliyunAkSecret != null){
			putQueryParameter("AliyunAkSecret", aliyunAkSecret);
		}
	}

	public String getTbNickname() {
		return this.tbNickname;
	}

	public void setTbNickname(String tbNickname) {
		this.tbNickname = tbNickname;
		if(tbNickname != null){
			putQueryParameter("TbNickname", tbNickname);
		}
	}

	@Override
	public Class<CreateTbAliyunUserMappingResponse> getResponseClass() {
		return CreateTbAliyunUserMappingResponse.class;
	}

}
