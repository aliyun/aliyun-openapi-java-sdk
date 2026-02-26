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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateProjectFieldRequest extends RoaAcsRequest<UpdateProjectFieldResponse> {
	   

	private String identifier;

	@SerializedName("body")
	private Body body;

	private String organizationId;
	public UpdateProjectFieldRequest() {
		super("devops", "2021-06-25", "UpdateProjectField");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/organization/[organizationId]/project/[identifier]");
		setMethod(MethodType.POST);
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
		if(identifier != null){
			putPathParameter("identifier", identifier);
		}
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

		@SerializedName("updateBasicFieldRequestList")
		private List<UpdateBasicFieldRequestListItem> updateBasicFieldRequestList;

		@SerializedName("statusIdentifier")
		private String statusIdentifier;

		@SerializedName("updateForOpenApiList")
		private List<UpdateForOpenApiListItem> updateForOpenApiList;

		public List<UpdateBasicFieldRequestListItem> getUpdateBasicFieldRequestList() {
			return this.updateBasicFieldRequestList;
		}

		public void setUpdateBasicFieldRequestList(List<UpdateBasicFieldRequestListItem> updateBasicFieldRequestList) {
			this.updateBasicFieldRequestList = updateBasicFieldRequestList;
		}

		public String getStatusIdentifier() {
			return this.statusIdentifier;
		}

		public void setStatusIdentifier(String statusIdentifier) {
			this.statusIdentifier = statusIdentifier;
		}

		public List<UpdateForOpenApiListItem> getUpdateForOpenApiList() {
			return this.updateForOpenApiList;
		}

		public void setUpdateForOpenApiList(List<UpdateForOpenApiListItem> updateForOpenApiList) {
			this.updateForOpenApiList = updateForOpenApiList;
		}

		public static class UpdateBasicFieldRequestListItem {

			@SerializedName("propertyKey")
			private String propertyKey;

			@SerializedName("propertyValue")
			private String propertyValue;

			public String getPropertyKey() {
				return this.propertyKey;
			}

			public void setPropertyKey(String propertyKey) {
				this.propertyKey = propertyKey;
			}

			public String getPropertyValue() {
				return this.propertyValue;
			}

			public void setPropertyValue(String propertyValue) {
				this.propertyValue = propertyValue;
			}
		}

		public static class UpdateForOpenApiListItem {

			@SerializedName("fieldIdentifier")
			private String fieldIdentifier;

			@SerializedName("value")
			private String value;

			public String getFieldIdentifier() {
				return this.fieldIdentifier;
			}

			public void setFieldIdentifier(String fieldIdentifier) {
				this.fieldIdentifier = fieldIdentifier;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public Class<UpdateProjectFieldResponse> getResponseClass() {
		return UpdateProjectFieldResponse.class;
	}

}
