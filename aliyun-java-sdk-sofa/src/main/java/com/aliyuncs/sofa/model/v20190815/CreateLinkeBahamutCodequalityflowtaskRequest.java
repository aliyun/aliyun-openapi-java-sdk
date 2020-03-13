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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLinkeBahamutCodequalityflowtaskRequest extends RpcAcsRequest<CreateLinkeBahamutCodequalityflowtaskResponse> {
	   

	private List<String> appListRepeatLists;

	private String stage;

	private String iterationId;
	public CreateLinkeBahamutCodequalityflowtaskRequest() {
		super("SOFA", "2019-08-15", "CreateLinkeBahamutCodequalityflowtask", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getAppListRepeatLists() {
		return this.appListRepeatLists;
	}

	public void setAppListRepeatLists(List<String> appListRepeatLists) {
		this.appListRepeatLists = appListRepeatLists;	
		if (appListRepeatLists != null) {
			for (int i = 0; i < appListRepeatLists.size(); i++) {
				putBodyParameter("AppListRepeatList." + (i + 1) , appListRepeatLists.get(i));
			}
		}	
	}

	public String getStage() {
		return this.stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
		if(stage != null){
			putBodyParameter("Stage", stage);
		}
	}

	public String getIterationId() {
		return this.iterationId;
	}

	public void setIterationId(String iterationId) {
		this.iterationId = iterationId;
		if(iterationId != null){
			putBodyParameter("IterationId", iterationId);
		}
	}

	@Override
	public Class<CreateLinkeBahamutCodequalityflowtaskResponse> getResponseClass() {
		return CreateLinkeBahamutCodequalityflowtaskResponse.class;
	}

}
