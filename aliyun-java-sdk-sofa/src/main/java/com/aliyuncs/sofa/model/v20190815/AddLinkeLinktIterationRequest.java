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
public class AddLinkeLinktIterationRequest extends RpcAcsRequest<AddLinkeLinktIterationResponse> {
	   

	private Long beginDate;

	private Long id;

	private Boolean locked;

	private String projectSign;

	private String owner;

	private String creator;

	private String iterationSign;

	private Long createdAt;

	private Boolean deleted;

	private Long endDate;

	private String name;

	private String region;

	private Long updatedAt;
	public AddLinkeLinktIterationRequest() {
		super("SOFA", "2019-08-15", "AddLinkeLinktIteration", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getBeginDate() {
		return this.beginDate;
	}

	public void setBeginDate(Long beginDate) {
		this.beginDate = beginDate;
		if(beginDate != null){
			putBodyParameter("BeginDate", beginDate.toString());
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

	public Boolean getLocked() {
		return this.locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
		if(locked != null){
			putBodyParameter("Locked", locked.toString());
		}
	}

	public String getProjectSign() {
		return this.projectSign;
	}

	public void setProjectSign(String projectSign) {
		this.projectSign = projectSign;
		if(projectSign != null){
			putBodyParameter("ProjectSign", projectSign);
		}
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
		if(owner != null){
			putBodyParameter("Owner", owner);
		}
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
		if(creator != null){
			putBodyParameter("Creator", creator);
		}
	}

	public String getIterationSign() {
		return this.iterationSign;
	}

	public void setIterationSign(String iterationSign) {
		this.iterationSign = iterationSign;
		if(iterationSign != null){
			putBodyParameter("IterationSign", iterationSign);
		}
	}

	public Long getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
		if(createdAt != null){
			putBodyParameter("CreatedAt", createdAt.toString());
		}
	}

	public Boolean getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
		if(deleted != null){
			putBodyParameter("Deleted", deleted.toString());
		}
	}

	public Long getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Long endDate) {
		this.endDate = endDate;
		if(endDate != null){
			putBodyParameter("EndDate", endDate.toString());
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

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putBodyParameter("Region", region);
		}
	}

	public Long getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Long updatedAt) {
		this.updatedAt = updatedAt;
		if(updatedAt != null){
			putBodyParameter("UpdatedAt", updatedAt.toString());
		}
	}

	@Override
	public Class<AddLinkeLinktIterationResponse> getResponseClass() {
		return AddLinkeLinktIterationResponse.class;
	}

}
