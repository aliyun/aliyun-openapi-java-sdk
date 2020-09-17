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
public class ConfirmLinkefabricFabricSmartdeployconfigsRequest extends RpcAcsRequest<ConfirmLinkefabricFabricSmartdeployconfigsResponse> {
	   

	private List<String> drmConfigsRepeatLists;

	private String context;

	private List<String> antxConfigsRepeatLists;
	public ConfirmLinkefabricFabricSmartdeployconfigsRequest() {
		super("SOFA", "2019-08-15", "ConfirmLinkefabricFabricSmartdeployconfigs", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getDrmConfigsRepeatLists() {
		return this.drmConfigsRepeatLists;
	}

	public void setDrmConfigsRepeatLists(List<String> drmConfigsRepeatLists) {
		this.drmConfigsRepeatLists = drmConfigsRepeatLists;	
		if (drmConfigsRepeatLists != null) {
			for (int i = 0; i < drmConfigsRepeatLists.size(); i++) {
				putBodyParameter("DrmConfigsRepeatList." + (i + 1) , drmConfigsRepeatLists.get(i));
			}
		}	
	}

	public String getContext() {
		return this.context;
	}

	public void setContext(String context) {
		this.context = context;
		if(context != null){
			putBodyParameter("Context", context);
		}
	}

	public List<String> getAntxConfigsRepeatLists() {
		return this.antxConfigsRepeatLists;
	}

	public void setAntxConfigsRepeatLists(List<String> antxConfigsRepeatLists) {
		this.antxConfigsRepeatLists = antxConfigsRepeatLists;	
		if (antxConfigsRepeatLists != null) {
			for (int i = 0; i < antxConfigsRepeatLists.size(); i++) {
				putBodyParameter("AntxConfigsRepeatList." + (i + 1) , antxConfigsRepeatLists.get(i));
			}
		}	
	}

	@Override
	public Class<ConfirmLinkefabricFabricSmartdeployconfigsResponse> getResponseClass() {
		return ConfirmLinkefabricFabricSmartdeployconfigsResponse.class;
	}

}
