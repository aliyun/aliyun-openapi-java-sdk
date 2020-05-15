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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateLinkeLinktMilestoneRequest extends RpcAcsRequest<UpdateLinkeLinktMilestoneResponse> {
	   

	private String description;

	private Long actualEndDate;

	private Long id;

	private String manager;

	private Long expectEndDate;

	private String target;

	private String name;

	private String status;
	public UpdateLinkeLinktMilestoneRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeLinktMilestone", "ApplySidecarCert");
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
			putBodyParameter("Description", description);
		}
	}

	public Long getActualEndDate() {
		return this.actualEndDate;
	}

	public void setActualEndDate(Long actualEndDate) {
		this.actualEndDate = actualEndDate;
		if(actualEndDate != null){
			putBodyParameter("ActualEndDate", actualEndDate.toString());
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	public String getManager() {
		return this.manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
		if(manager != null){
			putBodyParameter("Manager", manager);
		}
	}

	public Long getExpectEndDate() {
		return this.expectEndDate;
	}

	public void setExpectEndDate(Long expectEndDate) {
		this.expectEndDate = expectEndDate;
		if(expectEndDate != null){
			putBodyParameter("ExpectEndDate", expectEndDate.toString());
		}
	}

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
		if(target != null){
			putBodyParameter("Target", target);
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
	public Class<UpdateLinkeLinktMilestoneResponse> getResponseClass() {
		return UpdateLinkeLinktMilestoneResponse.class;
	}

}
