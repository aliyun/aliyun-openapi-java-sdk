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

package com.aliyuncs.waf_openapi.model.v20180117;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.waf_openapi.transform.v20180117.DescribeAclRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAclRulesResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Integer total;

		private List<AclRule> aclRules;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public List<AclRule> getAclRules() {
			return this.aclRules;
		}

		public void setAclRules(List<AclRule> aclRules) {
			this.aclRules = aclRules;
		}

		public static class AclRule {

			private Integer continueWaf;

			private Integer continueBlockGeo;

			private Integer continueSA;

			private Integer continueSdk;

			private Integer continueDataRiskControl;

			private Integer continueCc;

			private Integer isDefault;

			private String name;

			private Integer action;

			private Long id;

			private Integer order;

			private List<Condition> conditions;

			public Integer getContinueWaf() {
				return this.continueWaf;
			}

			public void setContinueWaf(Integer continueWaf) {
				this.continueWaf = continueWaf;
			}

			public Integer getContinueBlockGeo() {
				return this.continueBlockGeo;
			}

			public void setContinueBlockGeo(Integer continueBlockGeo) {
				this.continueBlockGeo = continueBlockGeo;
			}

			public Integer getContinueSA() {
				return this.continueSA;
			}

			public void setContinueSA(Integer continueSA) {
				this.continueSA = continueSA;
			}

			public Integer getContinueSdk() {
				return this.continueSdk;
			}

			public void setContinueSdk(Integer continueSdk) {
				this.continueSdk = continueSdk;
			}

			public Integer getContinueDataRiskControl() {
				return this.continueDataRiskControl;
			}

			public void setContinueDataRiskControl(Integer continueDataRiskControl) {
				this.continueDataRiskControl = continueDataRiskControl;
			}

			public Integer getContinueCc() {
				return this.continueCc;
			}

			public void setContinueCc(Integer continueCc) {
				this.continueCc = continueCc;
			}

			public Integer getIsDefault() {
				return this.isDefault;
			}

			public void setIsDefault(Integer isDefault) {
				this.isDefault = isDefault;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getAction() {
				return this.action;
			}

			public void setAction(Integer action) {
				this.action = action;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Integer getOrder() {
				return this.order;
			}

			public void setOrder(Integer order) {
				this.order = order;
			}

			public List<Condition> getConditions() {
				return this.conditions;
			}

			public void setConditions(List<Condition> conditions) {
				this.conditions = conditions;
			}

			public static class Condition {

				private String contain;

				private String value;

				private String key;

				public String getContain() {
					return this.contain;
				}

				public void setContain(String contain) {
					this.contain = contain;
				}

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
			}
		}
	}

	@Override
	public DescribeAclRulesResponse getInstance(UnmarshallerContext context) {
		return	DescribeAclRulesResponseUnmarshaller.unmarshall(this, context);
	}
}
