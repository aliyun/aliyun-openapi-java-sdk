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
public class DescribeBuildpackIdVersionPairsRequest extends RpcAcsRequest<DescribeBuildpackIdVersionPairsResponse> {
	   

	private String fullVersion;

	private Long techstackId;

	private List<String> statusesRepeatLists;
	public DescribeBuildpackIdVersionPairsRequest() {
		super("SOFA", "2019-08-15", "DescribeBuildpackIdVersionPairs", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFullVersion() {
		return this.fullVersion;
	}

	public void setFullVersion(String fullVersion) {
		this.fullVersion = fullVersion;
		if(fullVersion != null){
			putBodyParameter("FullVersion", fullVersion);
		}
	}

	public Long getTechstackId() {
		return this.techstackId;
	}

	public void setTechstackId(Long techstackId) {
		this.techstackId = techstackId;
		if(techstackId != null){
			putBodyParameter("TechstackId", techstackId.toString());
		}
	}

	public List<String> getStatusesRepeatLists() {
		return this.statusesRepeatLists;
	}

	public void setStatusesRepeatLists(List<String> statusesRepeatLists) {
		this.statusesRepeatLists = statusesRepeatLists;	
		if (statusesRepeatLists != null) {
			for (int i = 0; i < statusesRepeatLists.size(); i++) {
				putBodyParameter("StatusesRepeatList." + (i + 1) , statusesRepeatLists.get(i));
			}
		}	
	}

	@Override
	public Class<DescribeBuildpackIdVersionPairsResponse> getResponseClass() {
		return DescribeBuildpackIdVersionPairsResponse.class;
	}

}
