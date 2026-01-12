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

package com.aliyuncs.xrengine.model.v20221111;

import com.aliyuncs.RpcAcsRequest;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.xrengine.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateProjectRequest extends RpcAcsRequest<UpdateProjectResponse> {
	   

	@SerializedName("ext")
	private Map<String,Object> ext;

	private String title;

	private Boolean autoBuild;

	private String intro;

	private String jwtToken;

	private String projectId;
	public UpdateProjectRequest() {
		super("xrEngine", "2022-11-11", "UpdateProject");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Map<String,Object> getExt() {
		return this.ext;
	}

	public void setExt(Map<String,Object> ext) {
		this.ext = ext;	
		if (ext != null) {
			putQueryParameter("Ext" , new Gson().toJson(ext));
		}	
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putQueryParameter("Title", title);
		}
	}

	public Boolean getAutoBuild() {
		return this.autoBuild;
	}

	public void setAutoBuild(Boolean autoBuild) {
		this.autoBuild = autoBuild;
		if(autoBuild != null){
			putQueryParameter("AutoBuild", autoBuild.toString());
		}
	}

	public String getIntro() {
		return this.intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
		if(intro != null){
			putQueryParameter("Intro", intro);
		}
	}

	public String getJwtToken() {
		return this.jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
		if(jwtToken != null){
			putQueryParameter("JwtToken", jwtToken);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	@Override
	public Class<UpdateProjectResponse> getResponseClass() {
		return UpdateProjectResponse.class;
	}

}
