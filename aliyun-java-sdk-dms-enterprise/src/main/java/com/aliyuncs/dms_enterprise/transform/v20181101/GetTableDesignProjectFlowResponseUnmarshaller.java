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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.GetTableDesignProjectFlowResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetTableDesignProjectFlowResponse.ProjectFlow;
import com.aliyuncs.dms_enterprise.model.v20181101.GetTableDesignProjectFlowResponse.ProjectFlow.FlowNodeArrayItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTableDesignProjectFlowResponseUnmarshaller {

	public static GetTableDesignProjectFlowResponse unmarshall(GetTableDesignProjectFlowResponse getTableDesignProjectFlowResponse, UnmarshallerContext _ctx) {
		
		getTableDesignProjectFlowResponse.setRequestId(_ctx.stringValue("GetTableDesignProjectFlowResponse.RequestId"));
		getTableDesignProjectFlowResponse.setSuccess(_ctx.booleanValue("GetTableDesignProjectFlowResponse.Success"));
		getTableDesignProjectFlowResponse.setErrorMessage(_ctx.stringValue("GetTableDesignProjectFlowResponse.ErrorMessage"));
		getTableDesignProjectFlowResponse.setErrorCode(_ctx.stringValue("GetTableDesignProjectFlowResponse.ErrorCode"));

		ProjectFlow projectFlow = new ProjectFlow();
		projectFlow.setCurrentPosition(_ctx.integerValue("GetTableDesignProjectFlowResponse.ProjectFlow.CurrentPosition"));
		projectFlow.setRuleName(_ctx.stringValue("GetTableDesignProjectFlowResponse.ProjectFlow.RuleName"));
		projectFlow.setRuleComment(_ctx.stringValue("GetTableDesignProjectFlowResponse.ProjectFlow.RuleComment"));

		List<FlowNodeArrayItem> flowNodeArray = new ArrayList<FlowNodeArrayItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTableDesignProjectFlowResponse.ProjectFlow.FlowNodeArray.Length"); i++) {
			FlowNodeArrayItem flowNodeArrayItem = new FlowNodeArrayItem();
			flowNodeArrayItem.setNodeRole(_ctx.stringValue("GetTableDesignProjectFlowResponse.ProjectFlow.FlowNodeArray["+ i +"].NodeRole"));
			flowNodeArrayItem.setNodeTitle(_ctx.stringValue("GetTableDesignProjectFlowResponse.ProjectFlow.FlowNodeArray["+ i +"].NodeTitle"));
			flowNodeArrayItem.setPosition(_ctx.integerValue("GetTableDesignProjectFlowResponse.ProjectFlow.FlowNodeArray["+ i +"].Position"));
			flowNodeArrayItem.setPublishAnchor(_ctx.booleanValue("GetTableDesignProjectFlowResponse.ProjectFlow.FlowNodeArray["+ i +"].PublishAnchor"));
			flowNodeArrayItem.setBackToDesign(_ctx.booleanValue("GetTableDesignProjectFlowResponse.ProjectFlow.FlowNodeArray["+ i +"].BackToDesign"));
			flowNodeArrayItem.setCanSkip(_ctx.booleanValue("GetTableDesignProjectFlowResponse.ProjectFlow.FlowNodeArray["+ i +"].CanSkip"));

			List<String> publishStrategies = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTableDesignProjectFlowResponse.ProjectFlow.FlowNodeArray["+ i +"].PublishStrategies.Length"); j++) {
				publishStrategies.add(_ctx.stringValue("GetTableDesignProjectFlowResponse.ProjectFlow.FlowNodeArray["+ i +"].PublishStrategies["+ j +"]"));
			}
			flowNodeArrayItem.setPublishStrategies(publishStrategies);

			flowNodeArray.add(flowNodeArrayItem);
		}
		projectFlow.setFlowNodeArray(flowNodeArray);
		getTableDesignProjectFlowResponse.setProjectFlow(projectFlow);
	 
	 	return getTableDesignProjectFlowResponse;
	}
}