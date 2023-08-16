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

package com.aliyuncs.csas.model.v20230120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateDynamicRouteRequest extends RpcAcsRequest<CreateDynamicRouteResponse> {
	   

	private String description;

	private String dynamicRouteType;

	private List<String> tagIds;

	private List<String> regionIds;

	private Integer priority;

	private String nextHop;

	private List<String> applicationIds;

	private String name;

	private String applicationType;

	private String status;
	public CreateDynamicRouteRequest() {
		super("csas", "2023-01-20", "CreateDynamicRoute");
		setMethod(MethodType.POST);
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

	public String getDynamicRouteType() {
		return this.dynamicRouteType;
	}

	public void setDynamicRouteType(String dynamicRouteType) {
		this.dynamicRouteType = dynamicRouteType;
		if(dynamicRouteType != null){
			putBodyParameter("DynamicRouteType", dynamicRouteType);
		}
	}

	public List<String> getTagIds() {
		return this.tagIds;
	}

	public void setTagIds(List<String> tagIds) {
		this.tagIds = tagIds;	
		if (tagIds != null) {
			for (int depth1 = 0; depth1 < tagIds.size(); depth1++) {
				putBodyParameter("TagIds." + (depth1 + 1) , tagIds.get(depth1));
			}
		}	
	}

	public List<String> getRegionIds() {
		return this.regionIds;
	}

	public void setRegionIds(List<String> regionIds) {
		this.regionIds = regionIds;	
		if (regionIds != null) {
			for (int depth1 = 0; depth1 < regionIds.size(); depth1++) {
				putBodyParameter("RegionIds." + (depth1 + 1) , regionIds.get(depth1));
			}
		}	
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
		if(priority != null){
			putBodyParameter("Priority", priority.toString());
		}
	}

	public String getNextHop() {
		return this.nextHop;
	}

	public void setNextHop(String nextHop) {
		this.nextHop = nextHop;
		if(nextHop != null){
			putBodyParameter("NextHop", nextHop);
		}
	}

	public List<String> getApplicationIds() {
		return this.applicationIds;
	}

	public void setApplicationIds(List<String> applicationIds) {
		this.applicationIds = applicationIds;	
		if (applicationIds != null) {
			for (int depth1 = 0; depth1 < applicationIds.size(); depth1++) {
				putBodyParameter("ApplicationIds." + (depth1 + 1) , applicationIds.get(depth1));
			}
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

	public String getApplicationType() {
		return this.applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
		if(applicationType != null){
			putBodyParameter("ApplicationType", applicationType);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	@Override
	public Class<CreateDynamicRouteResponse> getResponseClass() {
		return CreateDynamicRouteResponse.class;
	}

}
