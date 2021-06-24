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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsModifyAdvisorCheckRequest extends RpcAcsRequest<OpsModifyAdvisorCheckResponse> {
	   

	private Integer visibility;

	private String customSummary;

	private List<Column> columns;

	private String summaryColumns;

	private Integer priority;

	private String type;

	private Boolean hasHideableItems;

	private String summaryActionLink;

	private Boolean unRefreshable;

	private String customFilters;

	private List<Property> propertys;

	private String checkId;

	private String auditParamStr;
	public OpsModifyAdvisorCheckRequest() {
		super("Ecsops", "2016-04-01", "OpsModifyAdvisorCheck", "ecsops");
		setMethod(MethodType.POST);
	}

	public Integer getVisibility() {
		return this.visibility;
	}

	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
		if(visibility != null){
			putQueryParameter("Visibility", visibility.toString());
		}
	}

	public String getCustomSummary() {
		return this.customSummary;
	}

	public void setCustomSummary(String customSummary) {
		this.customSummary = customSummary;
		if(customSummary != null){
			putQueryParameter("CustomSummary", customSummary);
		}
	}

	public List<Column> getColumns() {
		return this.columns;
	}

	public void setColumns(List<Column> columns) {
		this.columns = columns;	
		if (columns != null) {
			for (int depth1 = 0; depth1 < columns.size(); depth1++) {
				putQueryParameter("Column." + (depth1 + 1) + ".Field" , columns.get(depth1).getField());
				putQueryParameter("Column." + (depth1 + 1) + ".DataType" , columns.get(depth1).getDataType());
				putQueryParameter("Column." + (depth1 + 1) + ".DisplayName" , columns.get(depth1).getDisplayName());
				putQueryParameter("Column." + (depth1 + 1) + ".CustomSort" , columns.get(depth1).getCustomSort());
				putQueryParameter("Column." + (depth1 + 1) + ".Width" , columns.get(depth1).getWidth());
				putQueryParameter("Column." + (depth1 + 1) + ".Sortable" , columns.get(depth1).getSortable());
			}
		}	
	}

	public String getSummaryColumns() {
		return this.summaryColumns;
	}

	public void setSummaryColumns(String summaryColumns) {
		this.summaryColumns = summaryColumns;
		if(summaryColumns != null){
			putQueryParameter("SummaryColumns", summaryColumns);
		}
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("Priority", priority.toString());
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

	public Boolean getHasHideableItems() {
		return this.hasHideableItems;
	}

	public void setHasHideableItems(Boolean hasHideableItems) {
		this.hasHideableItems = hasHideableItems;
		if(hasHideableItems != null){
			putQueryParameter("HasHideableItems", hasHideableItems.toString());
		}
	}

	public String getSummaryActionLink() {
		return this.summaryActionLink;
	}

	public void setSummaryActionLink(String summaryActionLink) {
		this.summaryActionLink = summaryActionLink;
		if(summaryActionLink != null){
			putQueryParameter("SummaryActionLink", summaryActionLink);
		}
	}

	public Boolean getUnRefreshable() {
		return this.unRefreshable;
	}

	public void setUnRefreshable(Boolean unRefreshable) {
		this.unRefreshable = unRefreshable;
		if(unRefreshable != null){
			putQueryParameter("UnRefreshable", unRefreshable.toString());
		}
	}

	public String getCustomFilters() {
		return this.customFilters;
	}

	public void setCustomFilters(String customFilters) {
		this.customFilters = customFilters;
		if(customFilters != null){
			putQueryParameter("CustomFilters", customFilters);
		}
	}

	public List<Property> getPropertys() {
		return this.propertys;
	}

	public void setPropertys(List<Property> propertys) {
		this.propertys = propertys;	
		if (propertys != null) {
			for (int depth1 = 0; depth1 < propertys.size(); depth1++) {
				putQueryParameter("Property." + (depth1 + 1) + ".EnumValues" , propertys.get(depth1).getEnumValues());
				putQueryParameter("Property." + (depth1 + 1) + ".DataType" , propertys.get(depth1).getDataType());
				putQueryParameter("Property." + (depth1 + 1) + ".FieldId" , propertys.get(depth1).getFieldId());
			}
		}	
	}

	public String getCheckId() {
		return this.checkId;
	}

	public void setCheckId(String checkId) {
		this.checkId = checkId;
		if(checkId != null){
			putQueryParameter("CheckId", checkId);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	public static class Column {

		private String field;

		private String dataType;

		private String displayName;

		private String customSort;

		private String width;

		private Boolean sortable;

		public String getField() {
			return this.field;
		}

		public void setField(String field) {
			this.field = field;
		}

		public String getDataType() {
			return this.dataType;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getCustomSort() {
			return this.customSort;
		}

		public void setCustomSort(String customSort) {
			this.customSort = customSort;
		}

		public String getWidth() {
			return this.width;
		}

		public void setWidth(String width) {
			this.width = width;
		}

		public Boolean getSortable() {
			return this.sortable;
		}

		public void setSortable(Boolean sortable) {
			this.sortable = sortable;
		}
	}

	public static class Property {

		private String enumValues;

		private String dataType;

		private String fieldId;

		public String getEnumValues() {
			return this.enumValues;
		}

		public void setEnumValues(String enumValues) {
			this.enumValues = enumValues;
		}

		public String getDataType() {
			return this.dataType;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
		}

		public String getFieldId() {
			return this.fieldId;
		}

		public void setFieldId(String fieldId) {
			this.fieldId = fieldId;
		}
	}

	@Override
	public Class<OpsModifyAdvisorCheckResponse> getResponseClass() {
		return OpsModifyAdvisorCheckResponse.class;
	}

}
