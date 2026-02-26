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

package com.aliyuncs.linkcard.model.v20210520;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkcard.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetCardFlowInfoRequest extends RpcAcsRequest<GetCardFlowInfoResponse> {
	   

	private String iccid;

	private List<String> dateLists;
	public GetCardFlowInfoRequest() {
		super("Linkcard", "2021-05-20", "GetCardFlowInfo");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIccid() {
		return this.iccid;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
		if(iccid != null){
			putQueryParameter("Iccid", iccid);
		}
	}

	public List<String> getDateLists() {
		return this.dateLists;
	}

	public void setDateLists(List<String> dateLists) {
		this.dateLists = dateLists;	
		if (dateLists != null) {
			for (int i = 0; i < dateLists.size(); i++) {
				putQueryParameter("DateList." + (i + 1) , dateLists.get(i));
			}
		}	
	}

	@Override
	public Class<GetCardFlowInfoResponse> getResponseClass() {
		return GetCardFlowInfoResponse.class;
	}

}
