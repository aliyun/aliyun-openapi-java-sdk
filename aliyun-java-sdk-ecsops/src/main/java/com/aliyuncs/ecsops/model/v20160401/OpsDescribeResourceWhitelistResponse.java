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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeResourceWhitelistResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeResourceWhitelistResponse extends AcsResponse {

	private String requestId;

	private List<ResourceWhitelist> resourceWhitelists;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResourceWhitelist> getResourceWhitelists() {
		return this.resourceWhitelists;
	}

	public void setResourceWhitelists(List<ResourceWhitelist> resourceWhitelists) {
		this.resourceWhitelists = resourceWhitelists;
	}

	public static class ResourceWhitelist {

		private String module;

		private String product;

		private List<ResourceProperty> propertyLists;

		private List<ModuleRule> rules;

		private List<Whitelist> whitelists;

		public String getModule() {
			return this.module;
		}

		public void setModule(String module) {
			this.module = module;
		}

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public List<ResourceProperty> getPropertyLists() {
			return this.propertyLists;
		}

		public void setPropertyLists(List<ResourceProperty> propertyLists) {
			this.propertyLists = propertyLists;
		}

		public List<ModuleRule> getRules() {
			return this.rules;
		}

		public void setRules(List<ModuleRule> rules) {
			this.rules = rules;
		}

		public List<Whitelist> getWhitelists() {
			return this.whitelists;
		}

		public void setWhitelists(List<Whitelist> whitelists) {
			this.whitelists = whitelists;
		}

		public static class ResourceProperty {

			private String value;

			private String name;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class ModuleRule {

			private Integer groupId;

			private String requirements;

			private String moduleRuleName;

			private String supportedProducts;

			private String supportedActions;

			private Boolean notFlag;

			public Integer getGroupId() {
				return this.groupId;
			}

			public void setGroupId(Integer groupId) {
				this.groupId = groupId;
			}

			public String getRequirements() {
				return this.requirements;
			}

			public void setRequirements(String requirements) {
				this.requirements = requirements;
			}

			public String getModuleRuleName() {
				return this.moduleRuleName;
			}

			public void setModuleRuleName(String moduleRuleName) {
				this.moduleRuleName = moduleRuleName;
			}

			public String getSupportedProducts() {
				return this.supportedProducts;
			}

			public void setSupportedProducts(String supportedProducts) {
				this.supportedProducts = supportedProducts;
			}

			public String getSupportedActions() {
				return this.supportedActions;
			}

			public void setSupportedActions(String supportedActions) {
				this.supportedActions = supportedActions;
			}

			public Boolean getNotFlag() {
				return this.notFlag;
			}

			public void setNotFlag(Boolean notFlag) {
				this.notFlag = notFlag;
			}
		}

		public static class Whitelist {

			private Integer groupId;

			private String groupName;

			private String supportedProducts;

			private String supportedActions;

			private List<ResourceProperty1> existedMembers;

			public Integer getGroupId() {
				return this.groupId;
			}

			public void setGroupId(Integer groupId) {
				this.groupId = groupId;
			}

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}

			public String getSupportedProducts() {
				return this.supportedProducts;
			}

			public void setSupportedProducts(String supportedProducts) {
				this.supportedProducts = supportedProducts;
			}

			public String getSupportedActions() {
				return this.supportedActions;
			}

			public void setSupportedActions(String supportedActions) {
				this.supportedActions = supportedActions;
			}

			public List<ResourceProperty1> getExistedMembers() {
				return this.existedMembers;
			}

			public void setExistedMembers(List<ResourceProperty1> existedMembers) {
				this.existedMembers = existedMembers;
			}

			public static class ResourceProperty1 {

				private String value;

				private String name;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}
	}

	@Override
	public OpsDescribeResourceWhitelistResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeResourceWhitelistResponseUnmarshaller.unmarshall(this, context);
	}
}
