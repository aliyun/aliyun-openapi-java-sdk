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

package com.aliyuncs.ess.model.v20140828;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateAlarmRequest extends RpcAcsRequest<CreateAlarmResponse> {
	   

	private String metricType;

	private String scalingGroupId;

	private String description;

	private List<String> alarmActions;

	private Float threshold;

	private Integer evaluationCount;

	private String metricName;

	private List<Dimension> dimensions;

	private Integer period;

	private String resourceOwnerAccount;

	private Integer groupId;

	private Long ownerId;

	private String name;

	private String comparisonOperator;

	private String statistics;
	public CreateAlarmRequest() {
		super("Ess", "2014-08-28", "CreateAlarm", "ess");
		setMethod(MethodType.POST);
	}

	public String getMetricType() {
		return this.metricType;
	}

	public void setMetricType(String metricType) {
		this.metricType = metricType;
		if(metricType != null){
			putQueryParameter("MetricType", metricType);
		}
	}

	public String getScalingGroupId() {
		return this.scalingGroupId;
	}

	public void setScalingGroupId(String scalingGroupId) {
		this.scalingGroupId = scalingGroupId;
		if(scalingGroupId != null){
			putQueryParameter("ScalingGroupId", scalingGroupId);
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

	public List<String> getAlarmActions() {
		return this.alarmActions;
	}

	public void setAlarmActions(List<String> alarmActions) {
		this.alarmActions = alarmActions;	
		if (alarmActions != null) {
			for (int i = 0; i < alarmActions.size(); i++) {
				putQueryParameter("AlarmAction." + (i + 1) , alarmActions.get(i));
			}
		}	
	}

	public Float getThreshold() {
		return this.threshold;
	}

	public void setThreshold(Float threshold) {
		this.threshold = threshold;
		if(threshold != null){
			putQueryParameter("Threshold", threshold.toString());
		}
	}

	public Integer getEvaluationCount() {
		return this.evaluationCount;
	}

	public void setEvaluationCount(Integer evaluationCount) {
		this.evaluationCount = evaluationCount;
		if(evaluationCount != null){
			putQueryParameter("EvaluationCount", evaluationCount.toString());
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

	public List<Dimension> getDimensions() {
		return this.dimensions;
	}

	public void setDimensions(List<Dimension> dimensions) {
		this.dimensions = dimensions;	
		if (dimensions != null) {
			for (int depth1 = 0; depth1 < dimensions.size(); depth1++) {
				putQueryParameter("Dimension." + (depth1 + 1) + ".DimensionValue" , dimensions.get(depth1).getDimensionValue());
				putQueryParameter("Dimension." + (depth1 + 1) + ".DimensionKey" , dimensions.get(depth1).getDimensionKey());
			}
		}	
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getComparisonOperator() {
		return this.comparisonOperator;
	}

	public void setComparisonOperator(String comparisonOperator) {
		this.comparisonOperator = comparisonOperator;
		if(comparisonOperator != null){
			putQueryParameter("ComparisonOperator", comparisonOperator);
		}
	}

	public String getStatistics() {
		return this.statistics;
	}

	public void setStatistics(String statistics) {
		this.statistics = statistics;
		if(statistics != null){
			putQueryParameter("Statistics", statistics);
		}
	}

	public static class Dimension {

		private String dimensionValue;

		private String dimensionKey;

		public String getDimensionValue() {
			return this.dimensionValue;
		}

		public void setDimensionValue(String dimensionValue) {
			this.dimensionValue = dimensionValue;
		}

		public String getDimensionKey() {
			return this.dimensionKey;
		}

		public void setDimensionKey(String dimensionKey) {
			this.dimensionKey = dimensionKey;
		}
	}

	@Override
	public Class<CreateAlarmResponse> getResponseClass() {
		return CreateAlarmResponse.class;
	}

}
