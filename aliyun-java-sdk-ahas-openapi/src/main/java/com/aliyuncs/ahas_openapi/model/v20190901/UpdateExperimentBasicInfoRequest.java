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

package com.aliyuncs.ahas_openapi.model.v20190901;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ahas_openapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateExperimentBasicInfoRequest extends RpcAcsRequest<UpdateExperimentBasicInfoResponse> {
	   

	private String description;

	private String ahasRegionId;

	private List<String> tagss;

	private String nameSpace;

	private String name;

	private String experimentId;
	public UpdateExperimentBasicInfoRequest() {
		super("ahas-openapi", "2019-09-01", "UpdateExperimentBasicInfo", "ahas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getAhasRegionId() {
		return this.ahasRegionId;
	}

	public void setAhasRegionId(String ahasRegionId) {
		this.ahasRegionId = ahasRegionId;
		if(ahasRegionId != null){
			putQueryParameter("AhasRegionId", ahasRegionId);
		}
	}

	public List<String> getTagss() {
		return this.tagss;
	}

	public void setTagss(List<String> tagss) {
		this.tagss = tagss;	
		if (tagss != null) {
			for (int i = 0; i < tagss.size(); i++) {
				putQueryParameter("Tags." + (i + 1) , tagss.get(i));
			}
		}	
	}

	public String getNameSpace() {
		return this.nameSpace;
	}

	public void setNameSpace(String nameSpace) {
		this.nameSpace = nameSpace;
		if(nameSpace != null){
			putQueryParameter("NameSpace", nameSpace);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getExperimentId() {
		return this.experimentId;
	}

	public void setExperimentId(String experimentId) {
		this.experimentId = experimentId;
		if(experimentId != null){
			putQueryParameter("ExperimentId", experimentId);
		}
	}

	@Override
	public Class<UpdateExperimentBasicInfoResponse> getResponseClass() {
		return UpdateExperimentBasicInfoResponse.class;
	}

}
