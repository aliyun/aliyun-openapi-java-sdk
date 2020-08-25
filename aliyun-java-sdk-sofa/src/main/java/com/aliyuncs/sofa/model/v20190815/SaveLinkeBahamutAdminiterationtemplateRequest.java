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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveLinkeBahamutAdminiterationtemplateRequest extends RpcAcsRequest<SaveLinkeBahamutAdminiterationtemplateResponse> {
	   

	private List<String> stagesRepeatLists;

	private Boolean needProject;

	private String description;

	private Boolean independentComplete;

	private String type;

	private String tenantId;

	private String id;

	private Boolean needWorkItem;

	private String fabricBizType;

	private Boolean xflushCheckEnable;

	private String name;
	public SaveLinkeBahamutAdminiterationtemplateRequest() {
		super("SOFA", "2019-08-15", "SaveLinkeBahamutAdminiterationtemplate", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getStagesRepeatLists() {
		return this.stagesRepeatLists;
	}

	public void setStagesRepeatLists(List<String> stagesRepeatLists) {
		this.stagesRepeatLists = stagesRepeatLists;	
		if (stagesRepeatLists != null) {
			for (int i = 0; i < stagesRepeatLists.size(); i++) {
				putBodyParameter("StagesRepeatList." + (i + 1) , stagesRepeatLists.get(i));
			}
		}	
	}

	public Boolean getNeedProject() {
		return this.needProject;
	}

	public void setNeedProject(Boolean needProject) {
		this.needProject = needProject;
		if(needProject != null){
			putBodyParameter("NeedProject", needProject.toString());
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

	public Boolean getIndependentComplete() {
		return this.independentComplete;
	}

	public void setIndependentComplete(Boolean independentComplete) {
		this.independentComplete = independentComplete;
		if(independentComplete != null){
			putBodyParameter("IndependentComplete", independentComplete.toString());
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public Boolean getNeedWorkItem() {
		return this.needWorkItem;
	}

	public void setNeedWorkItem(Boolean needWorkItem) {
		this.needWorkItem = needWorkItem;
		if(needWorkItem != null){
			putBodyParameter("NeedWorkItem", needWorkItem.toString());
		}
	}

	public String getFabricBizType() {
		return this.fabricBizType;
	}

	public void setFabricBizType(String fabricBizType) {
		this.fabricBizType = fabricBizType;
		if(fabricBizType != null){
			putBodyParameter("FabricBizType", fabricBizType);
		}
	}

	public Boolean getXflushCheckEnable() {
		return this.xflushCheckEnable;
	}

	public void setXflushCheckEnable(Boolean xflushCheckEnable) {
		this.xflushCheckEnable = xflushCheckEnable;
		if(xflushCheckEnable != null){
			putBodyParameter("XflushCheckEnable", xflushCheckEnable.toString());
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
	public Class<SaveLinkeBahamutAdminiterationtemplateResponse> getResponseClass() {
		return SaveLinkeBahamutAdminiterationtemplateResponse.class;
	}

}
