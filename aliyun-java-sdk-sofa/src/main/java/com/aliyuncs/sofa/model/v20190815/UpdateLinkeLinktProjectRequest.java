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
public class UpdateLinkeLinktProjectRequest extends RpcAcsRequest<UpdateLinkeLinktProjectResponse> {
	   

	private String description;

	private String projectSign;

	private String notice;

	private String parentSign;

	private String asPublic;

	private String archive;

	private Boolean deleted;

	private String name;
	public UpdateLinkeLinktProjectRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeLinktProject", "sofa");
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

	public String getProjectSign() {
		return this.projectSign;
	}

	public void setProjectSign(String projectSign) {
		this.projectSign = projectSign;
		if(projectSign != null){
			putBodyParameter("ProjectSign", projectSign);
		}
	}

	public String getNotice() {
		return this.notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
		if(notice != null){
			putBodyParameter("Notice", notice);
		}
	}

	public String getParentSign() {
		return this.parentSign;
	}

	public void setParentSign(String parentSign) {
		this.parentSign = parentSign;
		if(parentSign != null){
			putBodyParameter("ParentSign", parentSign);
		}
	}

	public String getAsPublic() {
		return this.asPublic;
	}

	public void setAsPublic(String asPublic) {
		this.asPublic = asPublic;
		if(asPublic != null){
			putBodyParameter("AsPublic", asPublic);
		}
	}

	public String getArchive() {
		return this.archive;
	}

	public void setArchive(String archive) {
		this.archive = archive;
		if(archive != null){
			putBodyParameter("Archive", archive);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	@Override
	public Class<UpdateLinkeLinktProjectResponse> getResponseClass() {
		return UpdateLinkeLinktProjectResponse.class;
	}

}
