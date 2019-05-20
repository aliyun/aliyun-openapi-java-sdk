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

package com.aliyuncs.yundun_ds.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.yundun_ds.model.v20190103.DescribeConditionsResponse;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeConditionsResponse.Condition;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeConditionsResponse.Condition.DataType;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeConditionsResponse.Condition.EventType;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeConditionsResponse.Condition.Operation;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeConditionsResponse.Condition.Product;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeConditionsResponse.Condition.Range;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeConditionsResponse.Condition.RiskLevel;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeConditionsResponse.Condition.Rule;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeConditionsResponse.Condition.RuleCategory;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeConditionsResponse.Condition.Status;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeConditionsResponse.Condition.TransferProduct;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConditionsResponseUnmarshaller {

	public static DescribeConditionsResponse unmarshall(DescribeConditionsResponse describeConditionsResponse, UnmarshallerContext context) {
		
		describeConditionsResponse.setRequestId(context.stringValue("DescribeConditionsResponse.RequestId"));

		Condition condition = new Condition();

		List<RiskLevel> riskLevelList = new ArrayList<RiskLevel>();
		for (int i = 0; i < context.lengthValue("DescribeConditionsResponse.Condition.RiskLevelList.Length"); i++) {
			RiskLevel riskLevel = new RiskLevel();
			riskLevel.setId(context.longValue("DescribeConditionsResponse.Condition.RiskLevelList["+ i +"].Id"));
			riskLevel.setName(context.stringValue("DescribeConditionsResponse.Condition.RiskLevelList["+ i +"].Name"));
			riskLevel.setDefaulted(context.booleanValue("DescribeConditionsResponse.Condition.RiskLevelList["+ i +"].Defaulted"));
			riskLevel.setSensitive(context.booleanValue("DescribeConditionsResponse.Condition.RiskLevelList["+ i +"].Sensitive"));

			riskLevelList.add(riskLevel);
		}
		condition.setRiskLevelList(riskLevelList);

		List<Rule> ruleList = new ArrayList<Rule>();
		for (int i = 0; i < context.lengthValue("DescribeConditionsResponse.Condition.RuleList.Length"); i++) {
			Rule rule = new Rule();
			rule.setId(context.longValue("DescribeConditionsResponse.Condition.RuleList["+ i +"].Id"));
			rule.setName(context.stringValue("DescribeConditionsResponse.Condition.RuleList["+ i +"].Name"));

			ruleList.add(rule);
		}
		condition.setRuleList(ruleList);

		List<Range> rangeList = new ArrayList<Range>();
		for (int i = 0; i < context.lengthValue("DescribeConditionsResponse.Condition.RangeList.Length"); i++) {
			Range range = new Range();
			range.setId(context.longValue("DescribeConditionsResponse.Condition.RangeList["+ i +"].Id"));
			range.setName(context.stringValue("DescribeConditionsResponse.Condition.RangeList["+ i +"].Name"));

			rangeList.add(range);
		}
		condition.setRangeList(rangeList);

		List<EventType> eventTypeList = new ArrayList<EventType>();
		for (int i = 0; i < context.lengthValue("DescribeConditionsResponse.Condition.EventTypeList.Length"); i++) {
			EventType eventType = new EventType();
			eventType.setId(context.longValue("DescribeConditionsResponse.Condition.EventTypeList["+ i +"].Id"));
			eventType.setName(context.stringValue("DescribeConditionsResponse.Condition.EventTypeList["+ i +"].Name"));
			eventType.setCode(context.stringValue("DescribeConditionsResponse.Condition.EventTypeList["+ i +"].Code"));

			eventTypeList.add(eventType);
		}
		condition.setEventTypeList(eventTypeList);

		List<Status> statusList = new ArrayList<Status>();
		for (int i = 0; i < context.lengthValue("DescribeConditionsResponse.Condition.StatusList.Length"); i++) {
			Status status = new Status();
			status.setId(context.longValue("DescribeConditionsResponse.Condition.StatusList["+ i +"].Id"));
			status.setName(context.stringValue("DescribeConditionsResponse.Condition.StatusList["+ i +"].Name"));

			statusList.add(status);
		}
		condition.setStatusList(statusList);

		List<DataType> dataTypeList = new ArrayList<DataType>();
		for (int i = 0; i < context.lengthValue("DescribeConditionsResponse.Condition.DataTypeList.Length"); i++) {
			DataType dataType = new DataType();
			dataType.setId(context.longValue("DescribeConditionsResponse.Condition.DataTypeList["+ i +"].Id"));
			dataType.setName(context.stringValue("DescribeConditionsResponse.Condition.DataTypeList["+ i +"].Name"));

			dataTypeList.add(dataType);
		}
		condition.setDataTypeList(dataTypeList);

		List<Operation> operationList = new ArrayList<Operation>();
		for (int i = 0; i < context.lengthValue("DescribeConditionsResponse.Condition.OperationList.Length"); i++) {
			Operation operation = new Operation();
			operation.setId(context.longValue("DescribeConditionsResponse.Condition.OperationList["+ i +"].Id"));
			operation.setName(context.stringValue("DescribeConditionsResponse.Condition.OperationList["+ i +"].Name"));

			operationList.add(operation);
		}
		condition.setOperationList(operationList);

		List<Product> productList = new ArrayList<Product>();
		for (int i = 0; i < context.lengthValue("DescribeConditionsResponse.Condition.ProductList.Length"); i++) {
			Product product = new Product();
			product.setId(context.longValue("DescribeConditionsResponse.Condition.ProductList["+ i +"].Id"));
			product.setName(context.stringValue("DescribeConditionsResponse.Condition.ProductList["+ i +"].Name"));

			productList.add(product);
		}
		condition.setProductList(productList);

		List<TransferProduct> transferProductList = new ArrayList<TransferProduct>();
		for (int i = 0; i < context.lengthValue("DescribeConditionsResponse.Condition.TransferProductList.Length"); i++) {
			TransferProduct transferProduct = new TransferProduct();
			transferProduct.setCode(context.stringValue("DescribeConditionsResponse.Condition.TransferProductList["+ i +"].Code"));
			transferProduct.setStatus(context.integerValue("DescribeConditionsResponse.Condition.TransferProductList["+ i +"].Status"));

			transferProductList.add(transferProduct);
		}
		condition.setTransferProductList(transferProductList);

		List<RuleCategory> ruleCategoryList = new ArrayList<RuleCategory>();
		for (int i = 0; i < context.lengthValue("DescribeConditionsResponse.Condition.RuleCategoryList.Length"); i++) {
			RuleCategory ruleCategory = new RuleCategory();
			ruleCategory.setId(context.longValue("DescribeConditionsResponse.Condition.RuleCategoryList["+ i +"].Id"));
			ruleCategory.setName(context.stringValue("DescribeConditionsResponse.Condition.RuleCategoryList["+ i +"].Name"));

			ruleCategoryList.add(ruleCategory);
		}
		condition.setRuleCategoryList(ruleCategoryList);
		describeConditionsResponse.setCondition(condition);
	 
	 	return describeConditionsResponse;
	}
}