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

package com.aliyuncs.computenestsupplier.model.v20210521;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.computenestsupplier.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateArtifactRequest extends RpcAcsRequest<CreateArtifactResponse> {
	   

	private String description;

	private List<String> supportRegionIdss;

	private String artifactType;

	private String name;

	private String artifactId;

	private String artifactProperty;

	private String versionName;
	public CreateArtifactRequest() {
		super("ComputeNestSupplier", "2021-05-21", "CreateArtifact");
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

	public List<String> getSupportRegionIdss() {
		return this.supportRegionIdss;
	}

	public void setSupportRegionIdss(List<String> supportRegionIdss) {
		this.supportRegionIdss = supportRegionIdss;	
		if (supportRegionIdss != null) {
			for (int i = 0; i < supportRegionIdss.size(); i++) {
				putQueryParameter("SupportRegionIds." + (i + 1) , supportRegionIdss.get(i));
			}
		}	
	}

	public String getArtifactType() {
		return this.artifactType;
	}

	public void setArtifactType(String artifactType) {
		this.artifactType = artifactType;
		if(artifactType != null){
			putQueryParameter("ArtifactType", artifactType);
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

	public String getArtifactId() {
		return this.artifactId;
	}

	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
		if(artifactId != null){
			putQueryParameter("ArtifactId", artifactId);
		}
	}

	public String getArtifactProperty() {
		return this.artifactProperty;
	}

	public void setArtifactProperty(String artifactProperty) {
		this.artifactProperty = artifactProperty;
		if(artifactProperty != null){
			putQueryParameter("ArtifactProperty", artifactProperty);
		}
	}

	public String getVersionName() {
		return this.versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
		if(versionName != null){
			putQueryParameter("VersionName", versionName);
		}
	}

	@Override
	public Class<CreateArtifactResponse> getResponseClass() {
		return CreateArtifactResponse.class;
	}

}
