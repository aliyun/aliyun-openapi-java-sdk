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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetLinkeBahamutIterationunitjarhistrorysummaryRequest extends RpcAcsRequest<GetLinkeBahamutIterationunitjarhistrorysummaryResponse> {
	   

	private String unitStageId;

	private String publishJarEnv;
	public GetLinkeBahamutIterationunitjarhistrorysummaryRequest() {
		super("SOFA", "2019-08-15", "GetLinkeBahamutIterationunitjarhistrorysummary", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUnitStageId() {
		return this.unitStageId;
	}

	public void setUnitStageId(String unitStageId) {
		this.unitStageId = unitStageId;
		if(unitStageId != null){
			putBodyParameter("UnitStageId", unitStageId);
		}
	}

	public String getPublishJarEnv() {
		return this.publishJarEnv;
	}

	public void setPublishJarEnv(String publishJarEnv) {
		this.publishJarEnv = publishJarEnv;
		if(publishJarEnv != null){
			putBodyParameter("PublishJarEnv", publishJarEnv);
		}
	}

	@Override
	public Class<GetLinkeBahamutIterationunitjarhistrorysummaryResponse> getResponseClass() {
		return GetLinkeBahamutIterationunitjarhistrorysummaryResponse.class;
	}

}
