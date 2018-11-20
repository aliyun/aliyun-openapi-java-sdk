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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateImageLibRequest extends RpcAcsRequest<CreateImageLibResponse> {
	
	public CreateImageLibRequest() {
		super("Green", "2017-08-23", "CreateImageLib", "green");
	}

	private String sourceIp;

	private String name;

	private String bizTypes;

	private String serviceModule;

	private String category;

	private String scene;

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
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

	public String getBizTypes() {
		return this.bizTypes;
	}

	public void setBizTypes(String bizTypes) {
		this.bizTypes = bizTypes;
		if(bizTypes != null){
			putQueryParameter("BizTypes", bizTypes);
		}
	}

	public String getServiceModule() {
		return this.serviceModule;
	}

	public void setServiceModule(String serviceModule) {
		this.serviceModule = serviceModule;
		if(serviceModule != null){
			putQueryParameter("ServiceModule", serviceModule);
		}
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putQueryParameter("Category", category);
		}
	}

	public String getScene() {
		return this.scene;
	}

	public void setScene(String scene) {
		this.scene = scene;
		if(scene != null){
			putQueryParameter("Scene", scene);
		}
	}

	@Override
	public Class<CreateImageLibResponse> getResponseClass() {
		return CreateImageLibResponse.class;
	}

}
