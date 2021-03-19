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
public class SaveClriskDataNodeRequest extends RpcAcsRequest<SaveClriskDataNodeResponse> {
	   

	private String description;

	private String checkField;

	private String hashGroupPolicy;

	private String type;

	private String popField;

	private String popDataPolicy;

	private String nodeCode;

	private String tableName;

	private String orderField;

	private String groovyFilterScript;

	private List<FieldFromStatistics> fieldFromStatisticss;

	private List<FieldFromVariables> fieldFromVariabless;

	private String dataSourceId;

	private String name;

	private String hashStartToEndIndex;
	public SaveClriskDataNodeRequest() {
		super("SOFA", "2019-08-15", "SaveClriskDataNode", "sofacaferms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getCheckField() {
		return this.checkField;
	}

	public void setCheckField(String checkField) {
		this.checkField = checkField;
		if(checkField != null){
			putBodyParameter("CheckField", checkField);
		}
	}

	public String getHashGroupPolicy() {
		return this.hashGroupPolicy;
	}

	public void setHashGroupPolicy(String hashGroupPolicy) {
		this.hashGroupPolicy = hashGroupPolicy;
		if(hashGroupPolicy != null){
			putBodyParameter("HashGroupPolicy", hashGroupPolicy);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public String getPopField() {
		return this.popField;
	}

	public void setPopField(String popField) {
		this.popField = popField;
		if(popField != null){
			putBodyParameter("PopField", popField);
		}
	}

	public String getPopDataPolicy() {
		return this.popDataPolicy;
	}

	public void setPopDataPolicy(String popDataPolicy) {
		this.popDataPolicy = popDataPolicy;
		if(popDataPolicy != null){
			putBodyParameter("PopDataPolicy", popDataPolicy);
		}
	}

	public String getNodeCode() {
		return this.nodeCode;
	}

	public void setNodeCode(String nodeCode) {
		this.nodeCode = nodeCode;
		if(nodeCode != null){
			putBodyParameter("NodeCode", nodeCode);
		}
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
		if(tableName != null){
			putBodyParameter("TableName", tableName);
		}
	}

	public String getOrderField() {
		return this.orderField;
	}

	public void setOrderField(String orderField) {
		this.orderField = orderField;
		if(orderField != null){
			putBodyParameter("OrderField", orderField);
		}
	}

	public String getGroovyFilterScript() {
		return this.groovyFilterScript;
	}

	public void setGroovyFilterScript(String groovyFilterScript) {
		this.groovyFilterScript = groovyFilterScript;
		if(groovyFilterScript != null){
			putBodyParameter("GroovyFilterScript", groovyFilterScript);
		}
	}

	public List<FieldFromStatistics> getFieldFromStatisticss() {
		return this.fieldFromStatisticss;
	}

	public void setFieldFromStatisticss(List<FieldFromStatistics> fieldFromStatisticss) {
		this.fieldFromStatisticss = fieldFromStatisticss;	
		if (fieldFromStatisticss != null) {
			for (int depth1 = 0; depth1 < fieldFromStatisticss.size(); depth1++) {
				putBodyParameter("FieldFromStatistics." + (depth1 + 1) + ".ToCentGroovyScript" , fieldFromStatisticss.get(depth1).getToCentGroovyScript());
				putBodyParameter("FieldFromStatistics." + (depth1 + 1) + ".StatisticName" , fieldFromStatisticss.get(depth1).getStatisticName());
				putBodyParameter("FieldFromStatistics." + (depth1 + 1) + ".DcFieldName" , fieldFromStatisticss.get(depth1).getDcFieldName());
				putBodyParameter("FieldFromStatistics." + (depth1 + 1) + ".GroupBy" , fieldFromStatisticss.get(depth1).getGroupBy());
				putBodyParameter("FieldFromStatistics." + (depth1 + 1) + ".StatisticComputeType" , fieldFromStatisticss.get(depth1).getStatisticComputeType());
			}
		}	
	}

	public List<FieldFromVariables> getFieldFromVariabless() {
		return this.fieldFromVariabless;
	}

	public void setFieldFromVariabless(List<FieldFromVariables> fieldFromVariabless) {
		this.fieldFromVariabless = fieldFromVariabless;	
		if (fieldFromVariabless != null) {
			for (int depth1 = 0; depth1 < fieldFromVariabless.size(); depth1++) {
				putBodyParameter("FieldFromVariables." + (depth1 + 1) + ".ToCentGroovyScript" , fieldFromVariabless.get(depth1).getToCentGroovyScript());
				putBodyParameter("FieldFromVariables." + (depth1 + 1) + ".StatisticName" , fieldFromVariabless.get(depth1).getStatisticName());
				putBodyParameter("FieldFromVariables." + (depth1 + 1) + ".DcFieldName" , fieldFromVariabless.get(depth1).getDcFieldName());
				putBodyParameter("FieldFromVariables." + (depth1 + 1) + ".GroupBy" , fieldFromVariabless.get(depth1).getGroupBy());
				putBodyParameter("FieldFromVariables." + (depth1 + 1) + ".StatisticComputeType" , fieldFromVariabless.get(depth1).getStatisticComputeType());
			}
		}	
	}

	public String getDataSourceId() {
		return this.dataSourceId;
	}

	public void setDataSourceId(String dataSourceId) {
		this.dataSourceId = dataSourceId;
		if(dataSourceId != null){
			putBodyParameter("DataSourceId", dataSourceId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getHashStartToEndIndex() {
		return this.hashStartToEndIndex;
	}

	public void setHashStartToEndIndex(String hashStartToEndIndex) {
		this.hashStartToEndIndex = hashStartToEndIndex;
		if(hashStartToEndIndex != null){
			putBodyParameter("HashStartToEndIndex", hashStartToEndIndex);
		}
	}

	public static class FieldFromStatistics {

		private String toCentGroovyScript;

		private String statisticName;

		private String dcFieldName;

		private String groupBy;

		private String statisticComputeType;

		public String getToCentGroovyScript() {
			return this.toCentGroovyScript;
		}

		public void setToCentGroovyScript(String toCentGroovyScript) {
			this.toCentGroovyScript = toCentGroovyScript;
		}

		public String getStatisticName() {
			return this.statisticName;
		}

		public void setStatisticName(String statisticName) {
			this.statisticName = statisticName;
		}

		public String getDcFieldName() {
			return this.dcFieldName;
		}

		public void setDcFieldName(String dcFieldName) {
			this.dcFieldName = dcFieldName;
		}

		public String getGroupBy() {
			return this.groupBy;
		}

		public void setGroupBy(String groupBy) {
			this.groupBy = groupBy;
		}

		public String getStatisticComputeType() {
			return this.statisticComputeType;
		}

		public void setStatisticComputeType(String statisticComputeType) {
			this.statisticComputeType = statisticComputeType;
		}
	}

	public static class FieldFromVariables {

		private String toCentGroovyScript;

		private String statisticName;

		private String dcFieldName;

		private String groupBy;

		private String statisticComputeType;

		public String getToCentGroovyScript() {
			return this.toCentGroovyScript;
		}

		public void setToCentGroovyScript(String toCentGroovyScript) {
			this.toCentGroovyScript = toCentGroovyScript;
		}

		public String getStatisticName() {
			return this.statisticName;
		}

		public void setStatisticName(String statisticName) {
			this.statisticName = statisticName;
		}

		public String getDcFieldName() {
			return this.dcFieldName;
		}

		public void setDcFieldName(String dcFieldName) {
			this.dcFieldName = dcFieldName;
		}

		public String getGroupBy() {
			return this.groupBy;
		}

		public void setGroupBy(String groupBy) {
			this.groupBy = groupBy;
		}

		public String getStatisticComputeType() {
			return this.statisticComputeType;
		}

		public void setStatisticComputeType(String statisticComputeType) {
			this.statisticComputeType = statisticComputeType;
		}
	}

	@Override
	public Class<SaveClriskDataNodeResponse> getResponseClass() {
		return SaveClriskDataNodeResponse.class;
	}

}
