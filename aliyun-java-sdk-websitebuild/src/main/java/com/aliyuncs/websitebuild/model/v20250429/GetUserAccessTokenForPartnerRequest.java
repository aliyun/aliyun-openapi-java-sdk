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

package com.aliyuncs.websitebuild.model.v20250429;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetUserAccessTokenForPartnerRequest extends RpcAcsRequest<GetUserAccessTokenForPartnerResponse> {
	   

	private String ticket;

	private String siteHost;
	public GetUserAccessTokenForPartnerRequest() {
		super("WebsiteBuild", "2025-04-29", "GetUserAccessTokenForPartner");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getTicket() {
		return this.ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
		if(ticket != null){
			putQueryParameter("Ticket", ticket);
		}
	}

	public String getSiteHost() {
		return this.siteHost;
	}

	public void setSiteHost(String siteHost) {
		this.siteHost = siteHost;
		if(siteHost != null){
			putQueryParameter("SiteHost", siteHost);
		}
	}

	@Override
	public Class<GetUserAccessTokenForPartnerResponse> getResponseClass() {
		return GetUserAccessTokenForPartnerResponse.class;
	}

}
