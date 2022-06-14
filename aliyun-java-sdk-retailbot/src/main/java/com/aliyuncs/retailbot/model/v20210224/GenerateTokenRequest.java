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

package com.aliyuncs.retailbot.model.v20210224;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GenerateTokenRequest extends RpcAcsRequest<GenerateTokenResponse> {
	   

	private Integer expireTime;

	private Long tenantId;

	private UserDto userDto;
	public GenerateTokenRequest() {
		super("RetailBot", "2021-02-24", "GenerateToken");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
	}

	public Integer getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(Integer expireTime) {
		this.expireTime = expireTime;
		if(expireTime != null){
			putQueryParameter("ExpireTime", expireTime.toString());
		}
	}

	public Long getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("TenantId", tenantId.toString());
		}
	}

	public UserDto getUserDto() {
		return this.userDto;
	}

	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;	
		if (userDto != null) {
			
				putQueryParameter("UserDto.Nick" , userDto.getNick());
				putQueryParameter("UserDto.ForeignId" , userDto.getForeignId());
				putQueryParameter("UserDto.Telephone" , userDto.getTelephone());
				putQueryParameter("UserDto.ExtraInfo" , userDto.getExtraInfo());
		}	
	}

	public static class UserDto {

		private String nick;

		private String foreignId;

		private String telephone;

		private String extraInfo;

		public String getNick() {
			return this.nick;
		}

		public void setNick(String nick) {
			this.nick = nick;
		}

		public String getForeignId() {
			return this.foreignId;
		}

		public void setForeignId(String foreignId) {
			this.foreignId = foreignId;
		}

		public String getTelephone() {
			return this.telephone;
		}

		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}

		public String getExtraInfo() {
			return this.extraInfo;
		}

		public void setExtraInfo(String extraInfo) {
			this.extraInfo = extraInfo;
		}
	}

	@Override
	public Class<GenerateTokenResponse> getResponseClass() {
		return GenerateTokenResponse.class;
	}

}
