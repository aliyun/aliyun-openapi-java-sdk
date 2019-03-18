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

package com.aliyuncs.ccs.model.v20171001;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateTicketRequest extends RpcAcsRequest<CreateTicketResponse> {
	
	public CreateTicketRequest() {
		super("Ccs", "2017-10-01", "CreateTicket", "ccs");
		setMethod(MethodType.POST);
	}

	private String creatorId;

	private String description;

	private String type;

	private String ccsInstanceId;

	private String customFields;

	public String getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
		if(creatorId != null){
			putQueryParameter("CreatorId", creatorId);
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}

	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
		if(ccsInstanceId != null){
			putQueryParameter("CcsInstanceId", ccsInstanceId);
		}
	}

	public String getCustomFields() {
		return this.customFields;
	}

	public void setCustomFields(String customFields) {
		this.customFields = customFields;
		if(customFields != null){
			putQueryParameter("CustomFields", customFields);
		}
	}

	@Override
	public Class<CreateTicketResponse> getResponseClass() {
		return CreateTicketResponse.class;
	}

}
