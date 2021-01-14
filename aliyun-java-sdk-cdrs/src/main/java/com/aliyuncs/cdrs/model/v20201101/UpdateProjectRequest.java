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

package com.aliyuncs.cdrs.model.v20201101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateProjectRequest extends RpcAcsRequest<UpdateProjectResponse> {
	   

	private String corpId;

	private String icon;

	private String description;

	private String name;

	private String aggregateSceneCode;
	public UpdateProjectRequest() {
		super("CDRS", "2020-11-01", "UpdateProject");
		setMethod(MethodType.POST);
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putBodyParameter("CorpId", corpId);
		}
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
		if(icon != null){
			putBodyParameter("Icon", icon);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getAggregateSceneCode() {
		return this.aggregateSceneCode;
	}

	public void setAggregateSceneCode(String aggregateSceneCode) {
		this.aggregateSceneCode = aggregateSceneCode;
		if(aggregateSceneCode != null){
			putBodyParameter("AggregateSceneCode", aggregateSceneCode);
		}
	}

	@Override
	public Class<UpdateProjectResponse> getResponseClass() {
		return UpdateProjectResponse.class;
	}

}
