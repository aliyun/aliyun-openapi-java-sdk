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
public class CheckConnectivityRequest extends RpcAcsRequest<CheckConnectivityResponse> {
	   

	private String checkDestinationIp;

	private String checkSourceIp;

	private String language;
	public CheckConnectivityRequest() {
		super("Advisor-Share", "2018-06-08", "CheckConnectivity", "advisor");
		setMethod(MethodType.POST);
	}

	public String getCheckDestinationIp() {
		return this.checkDestinationIp;
	}

	public void setCheckDestinationIp(String checkDestinationIp) {
		this.checkDestinationIp = checkDestinationIp;
		if(checkDestinationIp != null){
			putQueryParameter("CheckDestinationIp", checkDestinationIp);
		}
	}

	public String getCheckSourceIp() {
		return this.checkSourceIp;
	}

	public void setCheckSourceIp(String checkSourceIp) {
		this.checkSourceIp = checkSourceIp;
		if(checkSourceIp != null){
			putQueryParameter("CheckSourceIp", checkSourceIp);
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

	@Override
	public Class<CheckConnectivityResponse> getResponseClass() {
		return CheckConnectivityResponse.class;
	}

}
