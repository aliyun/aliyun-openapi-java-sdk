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

package com.aliyuncs.premiumpics.model.v20190619;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetImageProduceSummaryRequest extends RpcAcsRequest<GetImageProduceSummaryResponse> {
	   

	private String authId;
	public GetImageProduceSummaryRequest() {
		super("Premiumpics", "2019-06-19", "GetImageProduceSummary");
		setMethod(MethodType.GET);
	}

	public String getAuthId() {
		return this.authId;
	}

	public void setAuthId(String authId) {
		this.authId = authId;
		if(authId != null){
			putQueryParameter("AuthId", authId);
		}
	}

	@Override
	public Class<GetImageProduceSummaryResponse> getResponseClass() {
		return GetImageProduceSummaryResponse.class;
	}

}
