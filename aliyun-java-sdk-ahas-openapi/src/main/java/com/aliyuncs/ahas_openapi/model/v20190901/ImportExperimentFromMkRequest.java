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
public class ImportExperimentFromMkRequest extends RpcAcsRequest<ImportExperimentFromMkResponse> {
	   

	private String importUserId;

	private String description;

	private List<String> tagss;

	private String name;

	private String nameSpace;

	private String definition;
	public ImportExperimentFromMkRequest() {
		super("ahas-openapi", "2019-09-01", "ImportExperimentFromMk", "ahas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getImportUserId() {
		return this.importUserId;
	}

	public void setImportUserId(String importUserId) {
		this.importUserId = importUserId;
		if(importUserId != null){
			putQueryParameter("ImportUserId", importUserId);
		}
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
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

	public String getDefinition() {
		return this.definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
		if(definition != null){
			putQueryParameter("Definition", definition);
		}
	}

	@Override
	public Class<ImportExperimentFromMkResponse> getResponseClass() {
		return ImportExperimentFromMkResponse.class;
	}

}
