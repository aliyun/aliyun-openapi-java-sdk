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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiStageResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiStageResponse.VariableItem;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiStageResponse.VariableItem.StageRouteModel;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiStageResponse.VariableItem.StageRouteModel.RouteRuleItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApiStageResponseUnmarshaller {

	public static DescribeApiStageResponse unmarshall(DescribeApiStageResponse describeApiStageResponse, UnmarshallerContext _ctx) {
		
		describeApiStageResponse.setRequestId(_ctx.stringValue("DescribeApiStageResponse.RequestId"));
		describeApiStageResponse.setGroupId(_ctx.stringValue("DescribeApiStageResponse.GroupId"));
		describeApiStageResponse.setStageId(_ctx.stringValue("DescribeApiStageResponse.StageId"));
		describeApiStageResponse.setStageName(_ctx.stringValue("DescribeApiStageResponse.StageName"));
		describeApiStageResponse.setDescription(_ctx.stringValue("DescribeApiStageResponse.Description"));
		describeApiStageResponse.setCreatedTime(_ctx.stringValue("DescribeApiStageResponse.CreatedTime"));
		describeApiStageResponse.setModifiedTime(_ctx.stringValue("DescribeApiStageResponse.ModifiedTime"));

		List<VariableItem> variables = new ArrayList<VariableItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiStageResponse.Variables.Length"); i++) {
			VariableItem variableItem = new VariableItem();
			variableItem.setVariableName(_ctx.stringValue("DescribeApiStageResponse.Variables["+ i +"].VariableName"));
			variableItem.setVariableValue(_ctx.stringValue("DescribeApiStageResponse.Variables["+ i +"].VariableValue"));
			variableItem.setSupportRoute(_ctx.booleanValue("DescribeApiStageResponse.Variables["+ i +"].SupportRoute"));

			StageRouteModel stageRouteModel = new StageRouteModel();
			stageRouteModel.setParameterCatalog(_ctx.stringValue("DescribeApiStageResponse.Variables["+ i +"].StageRouteModel.ParameterCatalog"));
			stageRouteModel.setServiceParameterName(_ctx.stringValue("DescribeApiStageResponse.Variables["+ i +"].StageRouteModel.ServiceParameterName"));
			stageRouteModel.setLocation(_ctx.stringValue("DescribeApiStageResponse.Variables["+ i +"].StageRouteModel.Location"));
			stageRouteModel.setParameterType(_ctx.stringValue("DescribeApiStageResponse.Variables["+ i +"].StageRouteModel.ParameterType"));
			stageRouteModel.setRouteMatchSymbol(_ctx.stringValue("DescribeApiStageResponse.Variables["+ i +"].StageRouteModel.RouteMatchSymbol"));

			List<RouteRuleItem> routeRules = new ArrayList<RouteRuleItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeApiStageResponse.Variables["+ i +"].StageRouteModel.RouteRules.Length"); j++) {
				RouteRuleItem routeRuleItem = new RouteRuleItem();
				routeRuleItem.setMaxValue(_ctx.longValue("DescribeApiStageResponse.Variables["+ i +"].StageRouteModel.RouteRules["+ j +"].MaxValue"));
				routeRuleItem.setMinValue(_ctx.longValue("DescribeApiStageResponse.Variables["+ i +"].StageRouteModel.RouteRules["+ j +"].MinValue"));
				routeRuleItem.setConditionValue(_ctx.stringValue("DescribeApiStageResponse.Variables["+ i +"].StageRouteModel.RouteRules["+ j +"].ConditionValue"));
				routeRuleItem.setResultValue(_ctx.stringValue("DescribeApiStageResponse.Variables["+ i +"].StageRouteModel.RouteRules["+ j +"].ResultValue"));

				routeRules.add(routeRuleItem);
			}
			stageRouteModel.setRouteRules(routeRules);
			variableItem.setStageRouteModel(stageRouteModel);

			variables.add(variableItem);
		}
		describeApiStageResponse.setVariables(variables);
	 
	 	return describeApiStageResponse;
	}
}