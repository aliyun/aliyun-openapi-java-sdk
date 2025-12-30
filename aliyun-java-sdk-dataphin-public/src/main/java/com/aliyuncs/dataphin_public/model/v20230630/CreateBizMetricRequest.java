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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateBizMetricRequest extends RpcAcsRequest<CreateBizMetricResponse> {
	   

	private Long opTenantId;

	@SerializedName("createBizMetricCommand")
	private CreateBizMetricCommand createBizMetricCommand;
	public CreateBizMetricRequest() {
		super("dataphin-public", "2023-06-30", "CreateBizMetric");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public CreateBizMetricCommand getCreateBizMetricCommand() {
		return this.createBizMetricCommand;
	}

	public void setCreateBizMetricCommand(CreateBizMetricCommand createBizMetricCommand) {
		this.createBizMetricCommand = createBizMetricCommand;	
		if (createBizMetricCommand != null) {
			putBodyParameter("CreateBizMetricCommand" , new Gson().toJson(createBizMetricCommand));
		}	
	}

	public static class CreateBizMetricCommand {

		@SerializedName("ViewScope")
		private ViewScope viewScope;

		@SerializedName("CustomAttribute")
		private List<CustomAttributeItem> customAttribute;

		@SerializedName("MetricRelationDiagramExpression")
		private String metricRelationDiagramExpression;

		@SerializedName("Description")
		private String description;

		@SerializedName("OperateInstructionEnabled")
		private Boolean operateInstructionEnabled;

		@SerializedName("OperateInstructionContent")
		private String operateInstructionContent;

		@SerializedName("BizOwnerName")
		private String bizOwnerName;

		@SerializedName("CatalogIds")
		private List<Long> catalogIds;

		@SerializedName("Labels")
		private List<String> labels;

		@SerializedName("AssociatedTechMetricFullNames")
		private List<String> associatedTechMetricFullNames;

		@SerializedName("RelatedBizMetrics")
		private List<RelatedBizMetricsItem> relatedBizMetrics;

		@SerializedName("DisplayName")
		private String displayName;

		@SerializedName("Name")
		private String name;

		@SerializedName("MetricDefinition")
		private String metricDefinition;

		@SerializedName("MetricRelationDiagramSwitchOpen")
		private Boolean metricRelationDiagramSwitchOpen;

		public ViewScope getViewScope() {
			return this.viewScope;
		}

		public void setViewScope(ViewScope viewScope) {
			this.viewScope = viewScope;
		}

		public List<CustomAttributeItem> getCustomAttribute() {
			return this.customAttribute;
		}

		public void setCustomAttribute(List<CustomAttributeItem> customAttribute) {
			this.customAttribute = customAttribute;
		}

		public String getMetricRelationDiagramExpression() {
			return this.metricRelationDiagramExpression;
		}

		public void setMetricRelationDiagramExpression(String metricRelationDiagramExpression) {
			this.metricRelationDiagramExpression = metricRelationDiagramExpression;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getOperateInstructionEnabled() {
			return this.operateInstructionEnabled;
		}

		public void setOperateInstructionEnabled(Boolean operateInstructionEnabled) {
			this.operateInstructionEnabled = operateInstructionEnabled;
		}

		public String getOperateInstructionContent() {
			return this.operateInstructionContent;
		}

		public void setOperateInstructionContent(String operateInstructionContent) {
			this.operateInstructionContent = operateInstructionContent;
		}

		public String getBizOwnerName() {
			return this.bizOwnerName;
		}

		public void setBizOwnerName(String bizOwnerName) {
			this.bizOwnerName = bizOwnerName;
		}

		public List<Long> getCatalogIds() {
			return this.catalogIds;
		}

		public void setCatalogIds(List<Long> catalogIds) {
			this.catalogIds = catalogIds;
		}

		public List<String> getLabels() {
			return this.labels;
		}

		public void setLabels(List<String> labels) {
			this.labels = labels;
		}

		public List<String> getAssociatedTechMetricFullNames() {
			return this.associatedTechMetricFullNames;
		}

		public void setAssociatedTechMetricFullNames(List<String> associatedTechMetricFullNames) {
			this.associatedTechMetricFullNames = associatedTechMetricFullNames;
		}

		public List<RelatedBizMetricsItem> getRelatedBizMetrics() {
			return this.relatedBizMetrics;
		}

		public void setRelatedBizMetrics(List<RelatedBizMetricsItem> relatedBizMetrics) {
			this.relatedBizMetrics = relatedBizMetrics;
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

		public String getMetricDefinition() {
			return this.metricDefinition;
		}

		public void setMetricDefinition(String metricDefinition) {
			this.metricDefinition = metricDefinition;
		}

		public Boolean getMetricRelationDiagramSwitchOpen() {
			return this.metricRelationDiagramSwitchOpen;
		}

		public void setMetricRelationDiagramSwitchOpen(Boolean metricRelationDiagramSwitchOpen) {
			this.metricRelationDiagramSwitchOpen = metricRelationDiagramSwitchOpen;
		}

		public static class ViewScope {

			@SerializedName("ScopeType")
			private String scopeType;

			@SerializedName("UserGroupNames")
			private List<String> userGroupNames;

			@SerializedName("UserNames")
			private List<String> userNames;

			public String getScopeType() {
				return this.scopeType;
			}

			public void setScopeType(String scopeType) {
				this.scopeType = scopeType;
			}

			public List<String> getUserGroupNames() {
				return this.userGroupNames;
			}

			public void setUserGroupNames(List<String> userGroupNames) {
				this.userGroupNames = userGroupNames;
			}

			public List<String> getUserNames() {
				return this.userNames;
			}

			public void setUserNames(List<String> userNames) {
				this.userNames = userNames;
			}
		}

		public static class CustomAttributeItem {

			@SerializedName("Code")
			private String code;

			@SerializedName("Values")
			private List<String> values;

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public List<String> getValues() {
				return this.values;
			}

			public void setValues(List<String> values) {
				this.values = values;
			}
		}

		public static class RelatedBizMetricsItem {

			@SerializedName("RelationType")
			private String relationType;

			@SerializedName("Name")
			private String name;

			public String getRelationType() {
				return this.relationType;
			}

			public void setRelationType(String relationType) {
				this.relationType = relationType;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public Class<CreateBizMetricResponse> getResponseClass() {
		return CreateBizMetricResponse.class;
	}

}
