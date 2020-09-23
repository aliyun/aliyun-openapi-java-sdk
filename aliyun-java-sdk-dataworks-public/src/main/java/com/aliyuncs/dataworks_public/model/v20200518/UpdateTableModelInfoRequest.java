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
public class UpdateTableModelInfoRequest extends RpcAcsRequest<UpdateTableModelInfoResponse> {
	   

	private Long secondLevelThemeId;

	private String tableGuid;

	private Long levelId;

	private Integer levelType;

	private Long firstLevelThemeId;
	public UpdateTableModelInfoRequest() {
		super("dataworks-public", "2020-05-18", "UpdateTableModelInfo", "dide");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getSecondLevelThemeId() {
		return this.secondLevelThemeId;
	}

	public void setSecondLevelThemeId(Long secondLevelThemeId) {
		this.secondLevelThemeId = secondLevelThemeId;
		if(secondLevelThemeId != null){
			putQueryParameter("SecondLevelThemeId", secondLevelThemeId.toString());
		}
	}

	public String getTableGuid() {
		return this.tableGuid;
	}

	public void setTableGuid(String tableGuid) {
		this.tableGuid = tableGuid;
		if(tableGuid != null){
			putQueryParameter("TableGuid", tableGuid);
		}
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

	public Long getFirstLevelThemeId() {
		return this.firstLevelThemeId;
	}

	public void setFirstLevelThemeId(Long firstLevelThemeId) {
		this.firstLevelThemeId = firstLevelThemeId;
		if(firstLevelThemeId != null){
			putQueryParameter("FirstLevelThemeId", firstLevelThemeId.toString());
		}
	}

	@Override
	public Class<UpdateTableModelInfoResponse> getResponseClass() {
		return UpdateTableModelInfoResponse.class;
	}

}
