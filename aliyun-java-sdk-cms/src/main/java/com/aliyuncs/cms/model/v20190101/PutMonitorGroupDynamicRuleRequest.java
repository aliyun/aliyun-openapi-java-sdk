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
public class PutMonitorGroupDynamicRuleRequest extends RpcAcsRequest<PutMonitorGroupDynamicRuleResponse> {
	   

	private List<GroupRules> groupRuless;

	private Long groupId;
	public PutMonitorGroupDynamicRuleRequest() {
		super("Cms", "2019-01-01", "PutMonitorGroupDynamicRule", "cms");
		setMethod(MethodType.POST);
	}

	public List<GroupRules> getGroupRuless() {
		return this.groupRuless;
	}

	public void setGroupRuless(List<GroupRules> groupRuless) {
		this.groupRuless = groupRuless;	
		if (groupRuless != null) {
			for (int depth1 = 0; depth1 < groupRuless.size(); depth1++) {
				putQueryParameter("GroupRules." + (depth1 + 1) + ".FilterRelation" , groupRuless.get(depth1).getFilterRelation());
				if (groupRuless.get(depth1).getFilterss() != null) {
					for (int depth2 = 0; depth2 < groupRuless.get(depth1).getFilterss().size(); depth2++) {
						putQueryParameter("GroupRules." + (depth1 + 1) + ".Filters." + (depth2 + 1) + ".Function" , groupRuless.get(depth1).getFilterss().get(depth2).getFunction());
						putQueryParameter("GroupRules." + (depth1 + 1) + ".Filters." + (depth2 + 1) + ".Name" , groupRuless.get(depth1).getFilterss().get(depth2).getName());
						putQueryParameter("GroupRules." + (depth1 + 1) + ".Filters." + (depth2 + 1) + ".Value" , groupRuless.get(depth1).getFilterss().get(depth2).getValue());
					}
				}
				putQueryParameter("GroupRules." + (depth1 + 1) + ".Category" , groupRuless.get(depth1).getCategory());
			}
		}	
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId.toString());
		}
	}

	public static class GroupRules {

		private String filterRelation;

		private List<Filters> filterss;

		private String category;

		public String getFilterRelation() {
			return this.filterRelation;
		}

		public void setFilterRelation(String filterRelation) {
			this.filterRelation = filterRelation;
		}

		public List<Filters> getFilterss() {
			return this.filterss;
		}

		public void setFilterss(List<Filters> filterss) {
			this.filterss = filterss;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public static class Filters {

			private String function;

			private String name;

			private String value;

			public String getFunction() {
				return this.function;
			}

			public void setFunction(String function) {
				this.function = function;
			}

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
	}

	@Override
	public Class<PutMonitorGroupDynamicRuleResponse> getResponseClass() {
		return PutMonitorGroupDynamicRuleResponse.class;
	}

}
