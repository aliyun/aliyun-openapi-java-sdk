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
public class CreateHybridMonitorTaskRequest extends RpcAcsRequest<CreateHybridMonitorTaskResponse> {
	   

	private String description;

	private String taskName;

	private String collectInterval;

	private String targetUserId;

	private String collectTargetType;

	private List<AttachLabels> attachLabelss;

	private String taskType;

	private String groupId;

	private String targetUserIdList;

	private String yARMConfig;

	private String namespace;

	private SLSProcessConfig sLSProcessConfig;
	public CreateHybridMonitorTaskRequest() {
		super("Cms", "2019-01-01", "CreateHybridMonitorTask", "cms");
		setMethod(MethodType.POST);
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

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putQueryParameter("TaskName", taskName);
		}
	}

	public String getCollectInterval() {
		return this.collectInterval;
	}

	public void setCollectInterval(String collectInterval) {
		this.collectInterval = collectInterval;
		if(collectInterval != null){
			putQueryParameter("CollectInterval", collectInterval);
		}
	}

	public String getTargetUserId() {
		return this.targetUserId;
	}

	public void setTargetUserId(String targetUserId) {
		this.targetUserId = targetUserId;
		if(targetUserId != null){
			putQueryParameter("TargetUserId", targetUserId);
		}
	}

	public String getCollectTargetType() {
		return this.collectTargetType;
	}

	public void setCollectTargetType(String collectTargetType) {
		this.collectTargetType = collectTargetType;
		if(collectTargetType != null){
			putQueryParameter("CollectTargetType", collectTargetType);
		}
	}

	public List<AttachLabels> getAttachLabelss() {
		return this.attachLabelss;
	}

	public void setAttachLabelss(List<AttachLabels> attachLabelss) {
		this.attachLabelss = attachLabelss;	
		if (attachLabelss != null) {
			for (int depth1 = 0; depth1 < attachLabelss.size(); depth1++) {
				putQueryParameter("AttachLabels." + (depth1 + 1) + ".Name" , attachLabelss.get(depth1).getName());
				putQueryParameter("AttachLabels." + (depth1 + 1) + ".Value" , attachLabelss.get(depth1).getValue());
			}
		}	
	}

	public String getTaskType() {
		return this.taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
		if(taskType != null){
			putQueryParameter("TaskType", taskType);
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

	public String getTargetUserIdList() {
		return this.targetUserIdList;
	}

	public void setTargetUserIdList(String targetUserIdList) {
		this.targetUserIdList = targetUserIdList;
		if(targetUserIdList != null){
			putQueryParameter("TargetUserIdList", targetUserIdList);
		}
	}

	public String getYARMConfig() {
		return this.yARMConfig;
	}

	public void setYARMConfig(String yARMConfig) {
		this.yARMConfig = yARMConfig;
		if(yARMConfig != null){
			putQueryParameter("YARMConfig", yARMConfig);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	public SLSProcessConfig getSLSProcessConfig() {
		return this.sLSProcessConfig;
	}

	public void setSLSProcessConfig(SLSProcessConfig sLSProcessConfig) {
		this.sLSProcessConfig = sLSProcessConfig;	
		if (sLSProcessConfig != null) {
			
				if (sLSProcessConfig.getFilter() != null) {
					
						if (sLSProcessConfig.getFilter().getFilters() != null) {
							for (int depth1 = 0; depth1 < sLSProcessConfig.getFilter().getFilters().size(); depth1++) {
								if (sLSProcessConfig.getFilter().getFilters().get(depth1) != null) {
									
										putQueryParameter("SLSProcessConfig.Filter.Filters." + (depth1 + 1) + ".SLSKeyName" , sLSProcessConfig.getFilter().getFilters().get(depth1).getSLSKeyName());
										putQueryParameter("SLSProcessConfig.Filter.Filters." + (depth1 + 1) + ".Value" , sLSProcessConfig.getFilter().getFilters().get(depth1).getValue());
										putQueryParameter("SLSProcessConfig.Filter.Filters." + (depth1 + 1) + ".Operator" , sLSProcessConfig.getFilter().getFilters().get(depth1).getOperator());
								}
							}
						}
						putQueryParameter("SLSProcessConfig.Filter.Relation" , sLSProcessConfig.getFilter().getRelation());
				}
				if (sLSProcessConfig.getExpress() != null) {
					for (int depth1 = 0; depth1 < sLSProcessConfig.getExpress().size(); depth1++) {
						if (sLSProcessConfig.getExpress().get(depth1) != null) {
							
								putQueryParameter("SLSProcessConfig.Express." + (depth1 + 1) + ".Alias" , sLSProcessConfig.getExpress().get(depth1).getAlias());
								putQueryParameter("SLSProcessConfig.Express." + (depth1 + 1) + ".Express" , sLSProcessConfig.getExpress().get(depth1).getExpress());
						}
					}
				}
				if (sLSProcessConfig.getGroupBy() != null) {
					for (int depth1 = 0; depth1 < sLSProcessConfig.getGroupBy().size(); depth1++) {
						if (sLSProcessConfig.getGroupBy().get(depth1) != null) {
							
								putQueryParameter("SLSProcessConfig.GroupBy." + (depth1 + 1) + ".SLSKeyName" , sLSProcessConfig.getGroupBy().get(depth1).getSLSKeyName());
								putQueryParameter("SLSProcessConfig.GroupBy." + (depth1 + 1) + ".Alias" , sLSProcessConfig.getGroupBy().get(depth1).getAlias());
						}
					}
				}
				if (sLSProcessConfig.getStatistics() != null) {
					for (int depth1 = 0; depth1 < sLSProcessConfig.getStatistics().size(); depth1++) {
						if (sLSProcessConfig.getStatistics().get(depth1) != null) {
							
								putQueryParameter("SLSProcessConfig.Statistics." + (depth1 + 1) + ".SLSKeyName" , sLSProcessConfig.getStatistics().get(depth1).getSLSKeyName());
								putQueryParameter("SLSProcessConfig.Statistics." + (depth1 + 1) + ".Function" , sLSProcessConfig.getStatistics().get(depth1).getFunction());
								putQueryParameter("SLSProcessConfig.Statistics." + (depth1 + 1) + ".Alias" , sLSProcessConfig.getStatistics().get(depth1).getAlias());
								putQueryParameter("SLSProcessConfig.Statistics." + (depth1 + 1) + ".Parameter2" , sLSProcessConfig.getStatistics().get(depth1).getParameter2());
								putQueryParameter("SLSProcessConfig.Statistics." + (depth1 + 1) + ".Parameter1" , sLSProcessConfig.getStatistics().get(depth1).getParameter1());
						}
					}
				}
		}	
	}

	public static class AttachLabels {

		private String name;

		private String value;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	public static class SLSProcessConfig {

		private Filter filter;

		private List<ExpressItem> express;

		private List<GroupByItem> groupBy;

		private List<StatisticsItem> statistics;

		public Filter getFilter() {
			return this.filter;
		}

		public void setFilter(Filter filter) {
			this.filter = filter;
		}

		public List<ExpressItem> getExpress() {
			return this.express;
		}

		public void setExpress(List<ExpressItem> express) {
			this.express = express;
		}

		public List<GroupByItem> getGroupBy() {
			return this.groupBy;
		}

		public void setGroupBy(List<GroupByItem> groupBy) {
			this.groupBy = groupBy;
		}

		public List<StatisticsItem> getStatistics() {
			return this.statistics;
		}

		public void setStatistics(List<StatisticsItem> statistics) {
			this.statistics = statistics;
		}

		public static class Filter {

			private List<FiltersItem> filters;

			private String relation;

			public List<FiltersItem> getFilters() {
				return this.filters;
			}

			public void setFilters(List<FiltersItem> filters) {
				this.filters = filters;
			}

			public String getRelation() {
				return this.relation;
			}

			public void setRelation(String relation) {
				this.relation = relation;
			}

			public static class FiltersItem {

				private String sLSKeyName;

				private String value;

				private String operator;

				public String getSLSKeyName() {
					return this.sLSKeyName;
				}

				public void setSLSKeyName(String sLSKeyName) {
					this.sLSKeyName = sLSKeyName;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getOperator() {
					return this.operator;
				}

				public void setOperator(String operator) {
					this.operator = operator;
				}
			}
		}

		public static class ExpressItem {

			private String alias;

			private String express;

			public String getAlias() {
				return this.alias;
			}

			public void setAlias(String alias) {
				this.alias = alias;
			}

			public String getExpress() {
				return this.express;
			}

			public void setExpress(String express) {
				this.express = express;
			}
		}

		public static class GroupByItem {

			private String sLSKeyName;

			private String alias;

			public String getSLSKeyName() {
				return this.sLSKeyName;
			}

			public void setSLSKeyName(String sLSKeyName) {
				this.sLSKeyName = sLSKeyName;
			}

			public String getAlias() {
				return this.alias;
			}

			public void setAlias(String alias) {
				this.alias = alias;
			}
		}

		public static class StatisticsItem {

			private String sLSKeyName;

			private String function;

			private String alias;

			private String parameter2;

			private String parameter1;

			public String getSLSKeyName() {
				return this.sLSKeyName;
			}

			public void setSLSKeyName(String sLSKeyName) {
				this.sLSKeyName = sLSKeyName;
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

			public String getParameter2() {
				return this.parameter2;
			}

			public void setParameter2(String parameter2) {
				this.parameter2 = parameter2;
			}

			public String getParameter1() {
				return this.parameter1;
			}

			public void setParameter1(String parameter1) {
				this.parameter1 = parameter1;
			}
		}
	}

	@Override
	public Class<CreateHybridMonitorTaskResponse> getResponseClass() {
		return CreateHybridMonitorTaskResponse.class;
	}

}
