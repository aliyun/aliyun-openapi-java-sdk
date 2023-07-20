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
public class ListAssetSelectionSelectedTargetRequest extends RpcAcsRequest<ListAssetSelectionSelectedTargetResponse> {
	   

	private List<String> targetLists;

	private String selectionKey;
	public ListAssetSelectionSelectedTargetRequest() {
		super("Sas", "2018-12-03", "ListAssetSelectionSelectedTarget");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getTargetLists() {
		return this.targetLists;
	}

	public void setTargetLists(List<String> targetLists) {
		this.targetLists = targetLists;	
		if (targetLists != null) {
			for (int i = 0; i < targetLists.size(); i++) {
				putQueryParameter("TargetList." + (i + 1) , targetLists.get(i));
			}
		}	
	}

	public String getSelectionKey() {
		return this.selectionKey;
	}

	public void setSelectionKey(String selectionKey) {
		this.selectionKey = selectionKey;
		if(selectionKey != null){
			putQueryParameter("SelectionKey", selectionKey);
		}
	}

	@Override
	public Class<ListAssetSelectionSelectedTargetResponse> getResponseClass() {
		return ListAssetSelectionSelectedTargetResponse.class;
	}

}
