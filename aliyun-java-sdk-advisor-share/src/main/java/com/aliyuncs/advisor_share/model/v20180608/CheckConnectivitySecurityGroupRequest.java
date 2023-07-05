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

package com.aliyuncs.advisor_share.model.v20180608;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CheckConnectivitySecurityGroupRequest extends RpcAcsRequest<CheckConnectivitySecurityGroupResponse> {
	   

	private String checkSource;

	private String language;

	private String checkDestination;
	public CheckConnectivitySecurityGroupRequest() {
		super("Advisor-Share", "2018-06-08", "CheckConnectivitySecurityGroup", "advisor");
		setMethod(MethodType.POST);
	}

	public String getCheckSource() {
		return this.checkSource;
	}

	public void setCheckSource(String checkSource) {
		this.checkSource = checkSource;
		if(checkSource != null){
			putQueryParameter("CheckSource", checkSource);
		}
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		if(language != null){
			putQueryParameter("Language", language);
		}
	}

	public String getCheckDestination() {
		return this.checkDestination;
	}

	public void setCheckDestination(String checkDestination) {
		this.checkDestination = checkDestination;
		if(checkDestination != null){
			putQueryParameter("CheckDestination", checkDestination);
		}
	}

	@Override
	public Class<CheckConnectivitySecurityGroupResponse> getResponseClass() {
		return CheckConnectivitySecurityGroupResponse.class;
	}

}
