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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PutLogMonitorRequest extends RpcAcsRequest<PutLogMonitorResponse> {
	   

	private String slsLogstore;

	private String slsProject;

	private List<ValueFilter> valueFilters;

	private String metricExpress;

	private String slsRegionId;

	private String metricName;

	private String groupId;

	private String tumblingwindows;

	private String valueFilterRelation;

	private String unit;

	private List<Groupbys> groupbyss;

	private String logId;

	private List<Aggregates> aggregatess;
	public PutLogMonitorRequest() {
		super("Cms", "2019-01-01", "PutLogMonitor", "cms");
		setMethod(MethodType.POST);
	}

	public String getSlsLogstore() {
		return this.slsLogstore;
	}

	public void setSlsLogstore(String slsLogstore) {
		this.slsLogstore = slsLogstore;
		if(slsLogstore != null){
			putQueryParameter("SlsLogstore", slsLogstore);
		}
	}

	public String getSlsProject() {
		return this.slsProject;
	}

	public void setSlsProject(String slsProject) {
		this.slsProject = slsProject;
		if(slsProject != null){
			putQueryParameter("SlsProject", slsProject);
		}
	}

	public List<ValueFilter> getValueFilters() {
		return this.valueFilters;
	}

	public void setValueFilters(List<ValueFilter> valueFilters) {
		this.valueFilters = valueFilters;	
		if (valueFilters != null) {
			for (int depth1 = 0; depth1 < valueFilters.size(); depth1++) {
				putQueryParameter("ValueFilter." + (depth1 + 1) + ".Value" , valueFilters.get(depth1).getValue());
				putQueryParameter("ValueFilter." + (depth1 + 1) + ".Key" , valueFilters.get(depth1).getKey());
				putQueryParameter("ValueFilter." + (depth1 + 1) + ".Operator" , valueFilters.get(depth1).getOperator());
			}
		}	
	}

	public String getMetricExpress() {
		return this.metricExpress;
	}

	public void setMetricExpress(String metricExpress) {
		this.metricExpress = metricExpress;
		if(metricExpress != null){
			putQueryParameter("MetricExpress", metricExpress);
		}
	}

	public String getSlsRegionId() {
		return this.slsRegionId;
	}

	public void setSlsRegionId(String slsRegionId) {
		this.slsRegionId = slsRegionId;
		if(slsRegionId != null){
			putQueryParameter("SlsRegionId", slsRegionId);
		}
	}

	public String getMetricName() {
		return this.metricName;
	}

	public void setMetricName(String metricName) {
		this.metricName = metricName;
		if(metricName != null){
			putQueryParameter("MetricName", metricName);
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getTumblingwindows() {
		return this.tumblingwindows;
	}

	public void setTumblingwindows(String tumblingwindows) {
		this.tumblingwindows = tumblingwindows;
		if(tumblingwindows != null){
			putQueryParameter("Tumblingwindows", tumblingwindows);
		}
	}

	public String getValueFilterRelation() {
		return this.valueFilterRelation;
	}

	public void setValueFilterRelation(String valueFilterRelation) {
		this.valueFilterRelation = valueFilterRelation;
		if(valueFilterRelation != null){
			putQueryParameter("ValueFilterRelation", valueFilterRelation);
		}
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
		if(unit != null){
			putQueryParameter("Unit", unit);
		}
	}

	public List<Groupbys> getGroupbyss() {
		return this.groupbyss;
	}

	public void setGroupbyss(List<Groupbys> groupbyss) {
		this.groupbyss = groupbyss;	
		if (groupbyss != null) {
			for (int depth1 = 0; depth1 < groupbyss.size(); depth1++) {
				putQueryParameter("Groupbys." + (depth1 + 1) + ".FieldName" , groupbyss.get(depth1).getFieldName());
				putQueryParameter("Groupbys." + (depth1 + 1) + ".Alias" , groupbyss.get(depth1).getAlias());
			}
		}	
	}

	public String getLogId() {
		return this.logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
		if(logId != null){
			putQueryParameter("LogId", logId);
		}
	}

	public List<Aggregates> getAggregatess() {
		return this.aggregatess;
	}

	public void setAggregatess(List<Aggregates> aggregatess) {
		this.aggregatess = aggregatess;	
		if (aggregatess != null) {
			for (int depth1 = 0; depth1 < aggregatess.size(); depth1++) {
				putQueryParameter("Aggregates." + (depth1 + 1) + ".FieldName" , aggregatess.get(depth1).getFieldName());
				putQueryParameter("Aggregates." + (depth1 + 1) + ".Function" , aggregatess.get(depth1).getFunction());
				putQueryParameter("Aggregates." + (depth1 + 1) + ".Alias" , aggregatess.get(depth1).getAlias());
			}
		}	
	}

	public static class ValueFilter {

		private String value;

		private String key;

		private String operator;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}
	}

	public static class Groupbys {

		private String fieldName;

		private String alias;

		public String getFieldName() {
			return this.fieldName;
		}

		public void setFieldName(String fieldName) {
			this.fieldName = fieldName;
		}

		public String getAlias() {
			return this.alias;
		}

		public void setAlias(String alias) {
			this.alias = alias;
		}
	}

	public static class Aggregates {

		private String fieldName;

		private String function;

		private String alias;

		public String getFieldName() {
			return this.fieldName;
		}

		public void setFieldName(String fieldName) {
			this.fieldName = fieldName;
		}

		public String getFunction() {
			return this.function;
		}

		public void setFunction(String function) {
			this.function = function;
		}

		public String getAlias() {
			return this.alias;
		}

		public void setAlias(String alias) {
			this.alias = alias;
		}
	}

	@Override
	public Class<PutLogMonitorResponse> getResponseClass() {
		return PutLogMonitorResponse.class;
	}

}
