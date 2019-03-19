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

package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class SaveProbeDataSubscriberRequest extends RpcAcsRequest<SaveProbeDataSubscriberResponse> {
	
	public SaveProbeDataSubscriberRequest() {
		super("cloudwf", "2017-03-28", "SaveProbeDataSubscriber", "cloudwf");
	}

	private String apiUrl;

	private String paramGenScript;

	private String name;

	private String httpMethod;

	private String description;

	private Long id;

	private Integer type;

	private List<Long> resourceIdss;

	public String getApiUrl() {
		return this.apiUrl;
	}

	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
		if(apiUrl != null){
			putQueryParameter("ApiUrl", apiUrl);
		}
	}

	public String getParamGenScript() {
		return this.paramGenScript;
	}

	public void setParamGenScript(String paramGenScript) {
		this.paramGenScript = paramGenScript;
		if(paramGenScript != null){
			putQueryParameter("ParamGenScript", paramGenScript);
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

	public String getHttpMethod() {
		return this.httpMethod;
	}

	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
		if(httpMethod != null){
			putQueryParameter("HttpMethod", httpMethod);
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

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type.toString());
		}
	}

	public List<Long> getResourceIdss() {
		return this.resourceIdss;
	}

	public void setResourceIdss(List<Long> resourceIdss) {
		this.resourceIdss = resourceIdss;	
		if (resourceIdss != null) {
			for (int i = 0; i < resourceIdss.size(); i++) {
				putQueryParameter("ResourceIds." + (i + 1) , resourceIdss.get(i));
			}
		}	
	}

	@Override
	public Class<SaveProbeDataSubscriberResponse> getResponseClass() {
		return SaveProbeDataSubscriberResponse.class;
	}

}
