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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeProductsOfActiveMetricRuleResponse;
import com.aliyuncs.cms.model.v20190101.DescribeProductsOfActiveMetricRuleResponse.AllProductInitMetricRule;
import com.aliyuncs.cms.model.v20190101.DescribeProductsOfActiveMetricRuleResponse.AllProductInitMetricRule.AlertInitConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProductsOfActiveMetricRuleResponseUnmarshaller {

	public static DescribeProductsOfActiveMetricRuleResponse unmarshall(DescribeProductsOfActiveMetricRuleResponse describeProductsOfActiveMetricRuleResponse, UnmarshallerContext _ctx) {
		
		describeProductsOfActiveMetricRuleResponse.setRequestId(_ctx.stringValue("DescribeProductsOfActiveMetricRuleResponse.RequestId"));
		describeProductsOfActiveMetricRuleResponse.setSuccess(_ctx.booleanValue("DescribeProductsOfActiveMetricRuleResponse.Success"));
		describeProductsOfActiveMetricRuleResponse.setCode(_ctx.integerValue("DescribeProductsOfActiveMetricRuleResponse.Code"));
		describeProductsOfActiveMetricRuleResponse.setMessage(_ctx.stringValue("DescribeProductsOfActiveMetricRuleResponse.Message"));
		describeProductsOfActiveMetricRuleResponse.setDatapoints(_ctx.stringValue("DescribeProductsOfActiveMetricRuleResponse.Datapoints"));

		List<AllProductInitMetricRule> allProductInitMetricRuleList = new ArrayList<AllProductInitMetricRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProductsOfActiveMetricRuleResponse.AllProductInitMetricRuleList.Length"); i++) {
			AllProductInitMetricRule allProductInitMetricRule = new AllProductInitMetricRule();
			allProductInitMetricRule.setProduct(_ctx.stringValue("DescribeProductsOfActiveMetricRuleResponse.AllProductInitMetricRuleList["+ i +"].Product"));

			List<AlertInitConfig> alertInitConfigList = new ArrayList<AlertInitConfig>();
			for (int j = 0; j < _ctx.lengthValue("DescribeProductsOfActiveMetricRuleResponse.AllProductInitMetricRuleList["+ i +"].AlertInitConfigList.Length"); j++) {
				AlertInitConfig alertInitConfig = new AlertInitConfig();
				alertInitConfig.setNamespace(_ctx.stringValue("DescribeProductsOfActiveMetricRuleResponse.AllProductInitMetricRuleList["+ i +"].AlertInitConfigList["+ j +"].Namespace"));
				alertInitConfig.setMetricName(_ctx.stringValue("DescribeProductsOfActiveMetricRuleResponse.AllProductInitMetricRuleList["+ i +"].AlertInitConfigList["+ j +"].MetricName"));
				alertInitConfig.setStatistics(_ctx.stringValue("DescribeProductsOfActiveMetricRuleResponse.AllProductInitMetricRuleList["+ i +"].AlertInitConfigList["+ j +"].Statistics"));
				alertInitConfig.setEvaluationCount(_ctx.stringValue("DescribeProductsOfActiveMetricRuleResponse.AllProductInitMetricRuleList["+ i +"].AlertInitConfigList["+ j +"].EvaluationCount"));
				alertInitConfig.setThreshold(_ctx.stringValue("DescribeProductsOfActiveMetricRuleResponse.AllProductInitMetricRuleList["+ i +"].AlertInitConfigList["+ j +"].Threshold"));
				alertInitConfig.setPeriod(_ctx.stringValue("DescribeProductsOfActiveMetricRuleResponse.AllProductInitMetricRuleList["+ i +"].AlertInitConfigList["+ j +"].Period"));

				alertInitConfigList.add(alertInitConfig);
			}
			allProductInitMetricRule.setAlertInitConfigList(alertInitConfigList);

			allProductInitMetricRuleList.add(allProductInitMetricRule);
		}
		describeProductsOfActiveMetricRuleResponse.setAllProductInitMetricRuleList(allProductInitMetricRuleList);
	 
	 	return describeProductsOfActiveMetricRuleResponse;
	}
}