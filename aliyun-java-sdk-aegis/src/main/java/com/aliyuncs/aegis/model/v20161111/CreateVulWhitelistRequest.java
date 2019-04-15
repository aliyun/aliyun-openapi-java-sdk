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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateVulWhitelistRequest extends RpcAcsRequest<CreateVulWhitelistResponse> {
	
	public CreateVulWhitelistRequest() {
		super("aegis", "2016-11-11", "CreateVulWhitelist", "vipaegis");
	}

	private String reason;

	private String sourceIp;

	private String whitelist;

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
		if(reason != null){
			putQueryParameter("Reason", reason);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getWhitelist() {
		return this.whitelist;
	}

	public void setWhitelist(String whitelist) {
		this.whitelist = whitelist;
		if(whitelist != null){
			putQueryParameter("Whitelist", whitelist);
		}
	}

	@Override
	public Class<CreateVulWhitelistResponse> getResponseClass() {
		return CreateVulWhitelistResponse.class;
	}

}
