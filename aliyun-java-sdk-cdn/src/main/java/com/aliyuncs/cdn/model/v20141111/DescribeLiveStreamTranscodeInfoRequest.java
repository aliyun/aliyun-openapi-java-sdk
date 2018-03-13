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
package com.aliyuncs.cdn.model.v20141111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamTranscodeInfoRequest extends RpcAcsRequest<DescribeLiveStreamTranscodeInfoResponse> {
	
	public DescribeLiveStreamTranscodeInfoRequest() {
		super("Cdn", "2014-11-11", "DescribeLiveStreamTranscodeInfo");
	}

	private String securityToken;

	private Long ownerId;

	private String domainTranscodeName;

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getDomainTranscodeName() {
		return this.domainTranscodeName;
	}

	public void setDomainTranscodeName(String domainTranscodeName) {
		this.domainTranscodeName = domainTranscodeName;
		if(domainTranscodeName != null){
			putQueryParameter("DomainTranscodeName", domainTranscodeName);
		}
	}

	@Override
	public Class<DescribeLiveStreamTranscodeInfoResponse> getResponseClass() {
		return DescribeLiveStreamTranscodeInfoResponse.class;
	}

}
