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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateUserAccessTokenRequest extends RpcAcsRequest<CreateUserAccessTokenResponse> {
	   

	private String sourceKey;

	private Long sourceId;

	private Long expireTime;

	private String aliyunUid;

	private String extraInfo;

	private UserDto userDto;
	public CreateUserAccessTokenRequest() {
		super("RetailBot", "2021-02-24", "CreateUserAccessToken");
		setMethod(MethodType.POST);
	}

	public String getSourceKey() {
		return this.sourceKey;
	}

	public void setSourceKey(String sourceKey) {
		this.sourceKey = sourceKey;
		if(sourceKey != null){
			putBodyParameter("SourceKey", sourceKey);
		}
	}

	public Long getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(Long sourceId) {
		this.sourceId = sourceId;
		if(sourceId != null){
			putBodyParameter("SourceId", sourceId.toString());
		}
	}

	public Long getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
		if(expireTime != null){
			putBodyParameter("ExpireTime", expireTime.toString());
		}
	}

	public String getAliyunUid() {
		return this.aliyunUid;
	}

	public void setAliyunUid(String aliyunUid) {
		this.aliyunUid = aliyunUid;
		if(aliyunUid != null){
			putBodyParameter("AliyunUid", aliyunUid);
		}
	}

	public String getExtraInfo() {
		return this.extraInfo;
	}

	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
		if(extraInfo != null){
			putBodyParameter("ExtraInfo", extraInfo);
		}
	}

	public UserDto getUserDto() {
		return this.userDto;
	}

	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;	
		if (userDto != null) {
			
				putBodyParameter("UserDto.Nick" , userDto.getNick());
				putBodyParameter("UserDto.ForeignId" , userDto.getForeignId());
		}	
	}

	public static class UserDto {

		private String nick;

		private String foreignId;

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
	}

	@Override
	public Class<CreateUserAccessTokenResponse> getResponseClass() {
		return CreateUserAccessTokenResponse.class;
	}

}
