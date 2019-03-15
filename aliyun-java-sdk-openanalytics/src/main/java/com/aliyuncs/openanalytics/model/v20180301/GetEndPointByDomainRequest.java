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

package com.aliyuncs.openanalytics.model.v20180301;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetEndPointByDomainRequest extends RpcAcsRequest<GetEndPointByDomainResponse> {
	
	public GetEndPointByDomainRequest() {
		super("openanalytics", "2018-03-01", "GetEndPointByDomain", "openanalytics");
	}

	private Long userID;

	private String domainURL;

	public Long getUserID() {
		return this.userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
		if(userID != null){
			putBodyParameter("UserID", userID.toString());
		}
	}

	public String getDomainURL() {
		return this.domainURL;
	}

	public void setDomainURL(String domainURL) {
		this.domainURL = domainURL;
		if(domainURL != null){
			putBodyParameter("DomainURL", domainURL);
		}
	}

	@Override
	public Class<GetEndPointByDomainResponse> getResponseClass() {
		return GetEndPointByDomainResponse.class;
	}

}
