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

package com.aliyuncs.grace.model.v20220606;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AnalyzeFileRequest extends RoaAcsRequest<AnalyzeFileResponse> {
	   

	private Boolean keepUnreachableObjects;

	private String token;

	private String name;
	public AnalyzeFileRequest() {
		super("grace", "2022-06-06", "AnalyzeFile", "grace");
		setUriPattern("/AnalyzeFile");
		setMethod(MethodType.POST);
	}

	public Boolean getKeepUnreachableObjects() {
		return this.keepUnreachableObjects;
	}

	public void setKeepUnreachableObjects(Boolean keepUnreachableObjects) {
		this.keepUnreachableObjects = keepUnreachableObjects;
		if(keepUnreachableObjects != null){
			putQueryParameter("keepUnreachableObjects", keepUnreachableObjects.toString());
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("token", token);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("name", name);
		}
	}

	@Override
	public Class<AnalyzeFileResponse> getResponseClass() {
		return AnalyzeFileResponse.class;
	}

}
