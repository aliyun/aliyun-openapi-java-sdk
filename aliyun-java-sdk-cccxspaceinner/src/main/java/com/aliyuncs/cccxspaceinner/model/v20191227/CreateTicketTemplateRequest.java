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

package com.aliyuncs.cccxspaceinner.model.v20191227;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateTicketTemplateRequest extends RpcAcsRequest<CreateTicketTemplateResponse> {
	   

	private Long buId;

	private Long agentId;

	private String categoryId;

	private Integer ticketType;

	private String templateName;

	private String operatorType;

	private String schema;
	public CreateTicketTemplateRequest() {
		super("CCCXSpaceInner", "2019-12-27", "CreateTicketTemplate");
		setMethod(MethodType.POST);
	}

	public Long getBuId() {
		return this.buId;
	}

	public void setBuId(Long buId) {
		this.buId = buId;
		if(buId != null){
			putBodyParameter("BuId", buId.toString());
		}
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
		if(agentId != null){
			putBodyParameter("AgentId", agentId.toString());
		}
	}

	public String getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
		if(categoryId != null){
			putBodyParameter("CategoryId", categoryId);
		}
	}

	public Integer getTicketType() {
		return this.ticketType;
	}

	public void setTicketType(Integer ticketType) {
		this.ticketType = ticketType;
		if(ticketType != null){
			putBodyParameter("TicketType", ticketType.toString());
		}
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
		if(templateName != null){
			putBodyParameter("TemplateName", templateName);
		}
	}

	public String getOperatorType() {
		return this.operatorType;
	}

	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
		if(operatorType != null){
			putBodyParameter("OperatorType", operatorType);
		}
	}

	public String getSchema() {
		return this.schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
		if(schema != null){
			putBodyParameter("Schema", schema);
		}
	}

	@Override
	public Class<CreateTicketTemplateResponse> getResponseClass() {
		return CreateTicketTemplateResponse.class;
	}

}
