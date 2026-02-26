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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetBizMetricByNameResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBizMetricByNameResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long tenantId;

		private String guid;

		private String name;

		private String displayName;

		private String description;

		private String bizOwnerName;

		private String metricDefinition;

		private Boolean metricRelationDiagramSwitchOpen;

		private String metricRelationDiagramExpression;

		private Boolean operateInstructionEnabled;

		private String operateInstructionContent;

		private List<归属目录列表> catalogs;

		private List<RelatedBizMetricsItem> relatedBizMetrics;

		private List<AssociatedTechMetricsItem> associatedTechMetrics;

		private List<自定义属性> customAttribute;

		private List<String> labels;

		private ViewScope viewScope;

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}

		public String getGuid() {
			return this.guid;
		}

		public void setGuid(String guid) {
			this.guid = guid;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getBizOwnerName() {
			return this.bizOwnerName;
		}

		public void setBizOwnerName(String bizOwnerName) {
			this.bizOwnerName = bizOwnerName;
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

		public String getMetricRelationDiagramExpression() {
			return this.metricRelationDiagramExpression;
		}

		public void setMetricRelationDiagramExpression(String metricRelationDiagramExpression) {
			this.metricRelationDiagramExpression = metricRelationDiagramExpression;
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

		public List<归属目录列表> getCatalogs() {
			return this.catalogs;
		}

		public void setCatalogs(List<归属目录列表> catalogs) {
			this.catalogs = catalogs;
		}

		public List<RelatedBizMetricsItem> getRelatedBizMetrics() {
			return this.relatedBizMetrics;
		}

		public void setRelatedBizMetrics(List<RelatedBizMetricsItem> relatedBizMetrics) {
			this.relatedBizMetrics = relatedBizMetrics;
		}

		public List<AssociatedTechMetricsItem> getAssociatedTechMetrics() {
			return this.associatedTechMetrics;
		}

		public void setAssociatedTechMetrics(List<AssociatedTechMetricsItem> associatedTechMetrics) {
			this.associatedTechMetrics = associatedTechMetrics;
		}

		public List<自定义属性> getCustomAttribute() {
			return this.customAttribute;
		}

		public void setCustomAttribute(List<自定义属性> customAttribute) {
			this.customAttribute = customAttribute;
		}

		public List<String> getLabels() {
			return this.labels;
		}

		public void setLabels(List<String> labels) {
			this.labels = labels;
		}

		public ViewScope getViewScope() {
			return this.viewScope;
		}

		public void setViewScope(ViewScope viewScope) {
			this.viewScope = viewScope;
		}

		public static class 归属目录列表 {

			private Long topicId;

			private String topicName;

			private Long catalogId;

			private String catalogName;

			private String catalogDesc;

			private Long parentCatalogId;

			private String parentPath;

			public Long getTopicId() {
				return this.topicId;
			}

			public void setTopicId(Long topicId) {
				this.topicId = topicId;
			}

			public String getTopicName() {
				return this.topicName;
			}

			public void setTopicName(String topicName) {
				this.topicName = topicName;
			}

			public Long getCatalogId() {
				return this.catalogId;
			}

			public void setCatalogId(Long catalogId) {
				this.catalogId = catalogId;
			}

			public String getCatalogName() {
				return this.catalogName;
			}

			public void setCatalogName(String catalogName) {
				this.catalogName = catalogName;
			}

			public String getCatalogDesc() {
				return this.catalogDesc;
			}

			public void setCatalogDesc(String catalogDesc) {
				this.catalogDesc = catalogDesc;
			}

			public Long getParentCatalogId() {
				return this.parentCatalogId;
			}

			public void setParentCatalogId(Long parentCatalogId) {
				this.parentCatalogId = parentCatalogId;
			}

			public String getParentPath() {
				return this.parentPath;
			}

			public void setParentPath(String parentPath) {
				this.parentPath = parentPath;
			}
		}

		public static class RelatedBizMetricsItem {

			private String guid;

			private String name;

			private String displayName;

			private String description;

			private String relationType;

			public String getGuid() {
				return this.guid;
			}

			public void setGuid(String guid) {
				this.guid = guid;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getRelationType() {
				return this.relationType;
			}

			public void setRelationType(String relationType) {
				this.relationType = relationType;
			}
		}

		public static class AssociatedTechMetricsItem {

			private String guid;

			private String name;

			private String displayName;

			private String description;

			private String subType;

			public String getGuid() {
				return this.guid;
			}

			public void setGuid(String guid) {
				this.guid = guid;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getSubType() {
				return this.subType;
			}

			public void setSubType(String subType) {
				this.subType = subType;
			}
		}

		public static class 自定义属性 {

			private String code;

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

		public static class ViewScope {

			private String scopeType;

			private List<String> userNames;

			private List<String> userGroupNames;

			public String getScopeType() {
				return this.scopeType;
			}

			public void setScopeType(String scopeType) {
				this.scopeType = scopeType;
			}

			public List<String> getUserNames() {
				return this.userNames;
			}

			public void setUserNames(List<String> userNames) {
				this.userNames = userNames;
			}

			public List<String> getUserGroupNames() {
				return this.userGroupNames;
			}

			public void setUserGroupNames(List<String> userGroupNames) {
				this.userGroupNames = userGroupNames;
			}
		}
	}

	@Override
	public GetBizMetricByNameResponse getInstance(UnmarshallerContext context) {
		return	GetBizMetricByNameResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
