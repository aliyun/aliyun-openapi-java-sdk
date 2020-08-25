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
public class DeleteLinkeBahamutPaasdeleteserversRequest extends RpcAcsRequest<DeleteLinkeBahamutPaasdeleteserversResponse> {
	   

	private List<String> serversRepeatLists;

	private String iterationId;
	public DeleteLinkeBahamutPaasdeleteserversRequest() {
		super("SOFA", "2019-08-15", "DeleteLinkeBahamutPaasdeleteservers", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getServersRepeatLists() {
		return this.serversRepeatLists;
	}

	public void setServersRepeatLists(List<String> serversRepeatLists) {
		this.serversRepeatLists = serversRepeatLists;	
		if (serversRepeatLists != null) {
			for (int i = 0; i < serversRepeatLists.size(); i++) {
				putBodyParameter("ServersRepeatList." + (i + 1) , serversRepeatLists.get(i));
			}
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
	public Class<DeleteLinkeBahamutPaasdeleteserversResponse> getResponseClass() {
		return DeleteLinkeBahamutPaasdeleteserversResponse.class;
	}

}
