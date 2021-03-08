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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateTableLevelRequest extends RpcAcsRequest<UpdateTableLevelResponse> {
	   

	private Long levelId;

	private Integer levelType;

	private String name;

	private String description;

	private Long projectId;
	public UpdateTableLevelRequest() {
		super("dataworks-public", "2020-05-18", "UpdateTableLevel");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getLevelId() {
		return this.levelId;
	}

	public void setLevelId(Long levelId) {
		this.levelId = levelId;
		if(levelId != null){
			putQueryParameter("LevelId", levelId.toString());
		}
	}

	public Integer getLevelType() {
		return this.levelType;
	}

	public void setLevelType(Integer levelType) {
		this.levelType = levelType;
		if(levelType != null){
			putQueryParameter("LevelType", levelType.toString());
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId.toString());
		}
	}

	@Override
	public Class<UpdateTableLevelResponse> getResponseClass() {
		return UpdateTableLevelResponse.class;
	}

}
