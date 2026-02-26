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

package com.aliyuncs.brinekingdom.model.v20190627;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryTemplateRequest extends RpcAcsRequest<QueryTemplateResponse> {
	   

	private String osName;

	private String modelName;

	private Boolean isFactoryInstall;
	public QueryTemplateRequest() {
		super("brinekingdom", "2019-06-27", "QueryTemplate");
		setMethod(MethodType.POST);
	}

	public String getOsName() {
		return this.osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
		if(osName != null){
			putQueryParameter("OsName", osName);
		}
	}

	public String getModelName() {
		return this.modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
		if(modelName != null){
			putQueryParameter("ModelName", modelName);
		}
	}

	public Boolean getIsFactoryInstall() {
		return this.isFactoryInstall;
	}

	public void setIsFactoryInstall(Boolean isFactoryInstall) {
		this.isFactoryInstall = isFactoryInstall;
		if(isFactoryInstall != null){
			putQueryParameter("IsFactoryInstall", isFactoryInstall.toString());
		}
	}

	@Override
	public Class<QueryTemplateResponse> getResponseClass() {
		return QueryTemplateResponse.class;
	}

}
