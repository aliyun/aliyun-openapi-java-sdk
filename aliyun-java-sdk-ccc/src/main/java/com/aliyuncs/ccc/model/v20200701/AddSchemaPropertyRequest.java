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

package com.aliyuncs.ccc.model.v20200701;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddSchemaPropertyRequest extends RpcAcsRequest<AddSchemaPropertyResponse> {
	   

	private String instanceId;

	private String schemaId;

	private String requestId;

	@SerializedName("property")
	private Property property;
	public AddSchemaPropertyRequest() {
		super("CCC", "2020-07-01", "AddSchemaProperty", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getSchemaId() {
		return this.schemaId;
	}

	public void setSchemaId(String schemaId) {
		this.schemaId = schemaId;
		if(schemaId != null){
			putBodyParameter("SchemaId", schemaId);
		}
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putBodyParameter("RequestId", requestId);
		}
	}

	public Property getProperty() {
		return this.property;
	}

	public void setProperty(Property property) {
		this.property = property;	
		if (property != null) {
			putBodyParameter("Property" , new Gson().toJson(property));
		}	
	}

	public static class Property {

		@SerializedName("MinLength")
		private Integer minLength;

		@SerializedName("MaxLength")
		private Integer maxLength;

		@SerializedName("Pattern")
		private String pattern;

		@SerializedName("Description")
		private String description;

		@SerializedName("DisplayOrder")
		private Integer displayOrder;

		@SerializedName("PatternErrorMessage")
		private String patternErrorMessage;

		@SerializedName("EditorType")
		private String editorType;

		@SerializedName("Required")
		private Boolean required;

		@SerializedName("ReadOnly")
		private Boolean readOnly;

		@SerializedName("DataType")
		private String dataType;

		@SerializedName("Array")
		private Boolean array;

		@SerializedName("DisplayName")
		private String displayName;

		@SerializedName("Name")
		private String name;

		@SerializedName("Maximum")
		private Double maximum;

		@SerializedName("Disabled")
		private Boolean disabled;

		@SerializedName("Attributes")
		private String attributes;

		@SerializedName("Minimum")
		private Double minimum;

		public Integer getMinLength() {
			return this.minLength;
		}

		public void setMinLength(Integer minLength) {
			this.minLength = minLength;
		}

		public Integer getMaxLength() {
			return this.maxLength;
		}

		public void setMaxLength(Integer maxLength) {
			this.maxLength = maxLength;
		}

		public String getPattern() {
			return this.pattern;
		}

		public void setPattern(String pattern) {
			this.pattern = pattern;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getDisplayOrder() {
			return this.displayOrder;
		}

		public void setDisplayOrder(Integer displayOrder) {
			this.displayOrder = displayOrder;
		}

		public String getPatternErrorMessage() {
			return this.patternErrorMessage;
		}

		public void setPatternErrorMessage(String patternErrorMessage) {
			this.patternErrorMessage = patternErrorMessage;
		}

		public String getEditorType() {
			return this.editorType;
		}

		public void setEditorType(String editorType) {
			this.editorType = editorType;
		}

		public Boolean getRequired() {
			return this.required;
		}

		public void setRequired(Boolean required) {
			this.required = required;
		}

		public Boolean getReadOnly() {
			return this.readOnly;
		}

		public void setReadOnly(Boolean readOnly) {
			this.readOnly = readOnly;
		}

		public String getDataType() {
			return this.dataType;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
		}

		public Boolean getArray() {
			return this.array;
		}

		public void setArray(Boolean array) {
			this.array = array;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Double getMaximum() {
			return this.maximum;
		}

		public void setMaximum(Double maximum) {
			this.maximum = maximum;
		}

		public Boolean getDisabled() {
			return this.disabled;
		}

		public void setDisabled(Boolean disabled) {
			this.disabled = disabled;
		}

		public String getAttributes() {
			return this.attributes;
		}

		public void setAttributes(String attributes) {
			this.attributes = attributes;
		}

		public Double getMinimum() {
			return this.minimum;
		}

		public void setMinimum(Double minimum) {
			this.minimum = minimum;
		}
	}

	@Override
	public Class<AddSchemaPropertyResponse> getResponseClass() {
		return AddSchemaPropertyResponse.class;
	}

}
