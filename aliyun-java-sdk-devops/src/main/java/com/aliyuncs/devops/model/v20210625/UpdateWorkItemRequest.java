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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.RoaAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateWorkItemRequest extends RoaAcsRequest<UpdateWorkItemResponse> {
	   

	@SerializedName("body")
	private Body body;

	private String organizationId;
	public UpdateWorkItemRequest() {
		super("devops", "2021-06-25", "UpdateWorkItem");
		setUriPattern("/organization/[organizationId]/workitems/update");
		setMethod(MethodType.POST);
	}

	public Body getBody() {
		return this.body;
	}

	public void setBody(Body body) {
		this.body = body;	
		if (body != null) {
			putBodyParameter("body" , new Gson().toJson(body));
		}	
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putPathParameter("organizationId", organizationId);
		}
	}

	public static class Body {

		@SerializedName("propertyKey")
		private String propertyKey;

		@SerializedName("identifier")
		private String identifier;

		@SerializedName("propertyValue")
		private String propertyValue;

		@SerializedName("fieldType")
		private String fieldType;

		public String getPropertyKey() {
			return this.propertyKey;
		}

		public void setPropertyKey(String propertyKey) {
			this.propertyKey = propertyKey;
		}

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public String getPropertyValue() {
			return this.propertyValue;
		}

		public void setPropertyValue(String propertyValue) {
			this.propertyValue = propertyValue;
		}

		public String getFieldType() {
			return this.fieldType;
		}

		public void setFieldType(String fieldType) {
			this.fieldType = fieldType;
		}
	}

	@Override
	public Class<UpdateWorkItemResponse> getResponseClass() {
		return UpdateWorkItemResponse.class;
	}

}
