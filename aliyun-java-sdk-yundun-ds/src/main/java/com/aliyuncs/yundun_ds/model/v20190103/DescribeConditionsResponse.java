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

package com.aliyuncs.yundun_ds.model.v20190103;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.yundun_ds.transform.v20190103.DescribeConditionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeConditionsResponse extends AcsResponse {

	private String requestId;

	private Condition condition;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Condition getCondition() {
		return this.condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	public static class Condition {

		private List<RiskLevel> riskLevelList;

		private List<Rule> ruleList;

		private List<Range> rangeList;

		private List<EventType> eventTypeList;

		private List<Status> statusList;

		private List<DataType> dataTypeList;

		private List<Operation> operationList;

		private List<Product> productList;

		private List<TransferProduct> transferProductList;

		private List<RuleCategory> ruleCategoryList;

		public List<RiskLevel> getRiskLevelList() {
			return this.riskLevelList;
		}

		public void setRiskLevelList(List<RiskLevel> riskLevelList) {
			this.riskLevelList = riskLevelList;
		}

		public List<Rule> getRuleList() {
			return this.ruleList;
		}

		public void setRuleList(List<Rule> ruleList) {
			this.ruleList = ruleList;
		}

		public List<Range> getRangeList() {
			return this.rangeList;
		}

		public void setRangeList(List<Range> rangeList) {
			this.rangeList = rangeList;
		}

		public List<EventType> getEventTypeList() {
			return this.eventTypeList;
		}

		public void setEventTypeList(List<EventType> eventTypeList) {
			this.eventTypeList = eventTypeList;
		}

		public List<Status> getStatusList() {
			return this.statusList;
		}

		public void setStatusList(List<Status> statusList) {
			this.statusList = statusList;
		}

		public List<DataType> getDataTypeList() {
			return this.dataTypeList;
		}

		public void setDataTypeList(List<DataType> dataTypeList) {
			this.dataTypeList = dataTypeList;
		}

		public List<Operation> getOperationList() {
			return this.operationList;
		}

		public void setOperationList(List<Operation> operationList) {
			this.operationList = operationList;
		}

		public List<Product> getProductList() {
			return this.productList;
		}

		public void setProductList(List<Product> productList) {
			this.productList = productList;
		}

		public List<TransferProduct> getTransferProductList() {
			return this.transferProductList;
		}

		public void setTransferProductList(List<TransferProduct> transferProductList) {
			this.transferProductList = transferProductList;
		}

		public List<RuleCategory> getRuleCategoryList() {
			return this.ruleCategoryList;
		}

		public void setRuleCategoryList(List<RuleCategory> ruleCategoryList) {
			this.ruleCategoryList = ruleCategoryList;
		}

		public static class RiskLevel {

			private Long id;

			private String name;

			private Boolean defaulted;

			private Boolean sensitive;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Boolean getDefaulted() {
				return this.defaulted;
			}

			public void setDefaulted(Boolean defaulted) {
				this.defaulted = defaulted;
			}

			public Boolean getSensitive() {
				return this.sensitive;
			}

			public void setSensitive(Boolean sensitive) {
				this.sensitive = sensitive;
			}
		}

		public static class Rule {

			private Long id;

			private String name;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class Range {

			private Long id;

			private String name;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class EventType {

			private Long id;

			private String name;

			private String code;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}
		}

		public static class Status {

			private Long id;

			private String name;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class DataType {

			private Long id;

			private String name;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class Operation {

			private Long id;

			private String name;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class Product {

			private Long id;

			private String name;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class TransferProduct {

			private String code;

			private Integer status;

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}
		}

		public static class RuleCategory {

			private Long id;

			private String name;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
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
	public DescribeConditionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeConditionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
