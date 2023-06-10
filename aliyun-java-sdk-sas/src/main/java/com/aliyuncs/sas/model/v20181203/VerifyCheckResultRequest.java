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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class VerifyCheckResultRequest extends RpcAcsRequest<VerifyCheckResultResponse> {
	   

	private List<Long> checkIdss;
	public VerifyCheckResultRequest() {
		super("Sas", "2018-12-03", "VerifyCheckResult", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Long> getCheckIdss() {
		return this.checkIdss;
	}

	public void setCheckIdss(List<Long> checkIdss) {
		this.checkIdss = checkIdss;	
		if (checkIdss != null) {
			for (int i = 0; i < checkIdss.size(); i++) {
				putQueryParameter("CheckIds." + (i + 1) , checkIdss.get(i));
			}
		}	
	}

	@Override
	public Class<VerifyCheckResultResponse> getResponseClass() {
		return VerifyCheckResultResponse.class;
	}

}
