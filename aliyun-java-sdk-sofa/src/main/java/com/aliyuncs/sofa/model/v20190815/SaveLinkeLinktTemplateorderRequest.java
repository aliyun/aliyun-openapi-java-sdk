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
public class SaveLinkeLinktTemplateorderRequest extends RpcAcsRequest<SaveLinkeLinktTemplateorderResponse> {
	   

	private String stamp;

	private String projectSign;

	private List<Templates> templatess;
	public SaveLinkeLinktTemplateorderRequest() {
		super("SOFA", "2019-08-15", "SaveLinkeLinktTemplateorder", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStamp() {
		return this.stamp;
	}

	public void setStamp(String stamp) {
		this.stamp = stamp;
		if(stamp != null){
			putBodyParameter("Stamp", stamp);
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

	public List<Templates> getTemplatess() {
		return this.templatess;
	}

	public void setTemplatess(List<Templates> templatess) {
		this.templatess = templatess;	
		if (templatess != null) {
			for (int depth1 = 0; depth1 < templatess.size(); depth1++) {
				putBodyParameter("Templates." + (depth1 + 1) + ".Creator" , templatess.get(depth1).getCreator());
				putBodyParameter("Templates." + (depth1 + 1) + ".Description" , templatess.get(depth1).getDescription());
				putBodyParameter("Templates." + (depth1 + 1) + ".Stamp" , templatess.get(depth1).getStamp());
				putBodyParameter("Templates." + (depth1 + 1) + ".TemplateLabel" , templatess.get(depth1).getTemplateLabel());
				putBodyParameter("Templates." + (depth1 + 1) + ".DefaultContent" , templatess.get(depth1).getDefaultContent());
				putBodyParameter("Templates." + (depth1 + 1) + ".Priority" , templatess.get(depth1).getPriority());
				putBodyParameter("Templates." + (depth1 + 1) + ".Type" , templatess.get(depth1).getType());
				putBodyParameter("Templates." + (depth1 + 1) + ".CreatedAt" , templatess.get(depth1).getCreatedAt());
				putBodyParameter("Templates." + (depth1 + 1) + ".Deleted" , templatess.get(depth1).getDeleted());
				putBodyParameter("Templates." + (depth1 + 1) + ".Name" , templatess.get(depth1).getName());
				putBodyParameter("Templates." + (depth1 + 1) + ".Id" , templatess.get(depth1).getId());
				putBodyParameter("Templates." + (depth1 + 1) + ".ProjectSign" , templatess.get(depth1).getProjectSign());
				putBodyParameter("Templates." + (depth1 + 1) + ".WorkflowId" , templatess.get(depth1).getWorkflowId());
				putBodyParameter("Templates." + (depth1 + 1) + ".UpdatedAt" , templatess.get(depth1).getUpdatedAt());
			}
		}	
	}

	public static class Templates {

		private String creator;

		private String description;

		private String stamp;

		private String templateLabel;

		private String defaultContent;

		private Long priority;

		private Long type;

		private Long createdAt;

		private Boolean deleted;

		private String name;

		private Long id;

		private String projectSign;

		private Long workflowId;

		private Long updatedAt;

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getStamp() {
			return this.stamp;
		}

		public void setStamp(String stamp) {
			this.stamp = stamp;
		}

		public String getTemplateLabel() {
			return this.templateLabel;
		}

		public void setTemplateLabel(String templateLabel) {
			this.templateLabel = templateLabel;
		}

		public String getDefaultContent() {
			return this.defaultContent;
		}

		public void setDefaultContent(String defaultContent) {
			this.defaultContent = defaultContent;
		}

		public Long getPriority() {
			return this.priority;
		}

		public void setPriority(Long priority) {
			this.priority = priority;
		}

		public Long getType() {
			return this.type;
		}

		public void setType(Long type) {
			this.type = type;
		}

		public Long getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(Long createdAt) {
			this.createdAt = createdAt;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getProjectSign() {
			return this.projectSign;
		}

		public void setProjectSign(String projectSign) {
			this.projectSign = projectSign;
		}

		public Long getWorkflowId() {
			return this.workflowId;
		}

		public void setWorkflowId(Long workflowId) {
			this.workflowId = workflowId;
		}

		public Long getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(Long updatedAt) {
			this.updatedAt = updatedAt;
		}
	}

	@Override
	public Class<SaveLinkeLinktTemplateorderResponse> getResponseClass() {
		return SaveLinkeLinktTemplateorderResponse.class;
	}

}
