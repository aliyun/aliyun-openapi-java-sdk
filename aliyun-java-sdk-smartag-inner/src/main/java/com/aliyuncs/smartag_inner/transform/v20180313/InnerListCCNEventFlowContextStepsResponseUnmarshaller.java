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

package com.aliyuncs.smartag_inner.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag_inner.model.v20180313.InnerListCCNEventFlowContextStepsResponse;
import com.aliyuncs.smartag_inner.model.v20180313.InnerListCCNEventFlowContextStepsResponse.FlowContextStep;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerListCCNEventFlowContextStepsResponseUnmarshaller {

	public static InnerListCCNEventFlowContextStepsResponse unmarshall(InnerListCCNEventFlowContextStepsResponse innerListCCNEventFlowContextStepsResponse, UnmarshallerContext context) {
		
		innerListCCNEventFlowContextStepsResponse.setRequestId(context.stringValue("InnerListCCNEventFlowContextStepsResponse.RequestId"));
		innerListCCNEventFlowContextStepsResponse.setTotal(context.integerValue("InnerListCCNEventFlowContextStepsResponse.Total"));
		innerListCCNEventFlowContextStepsResponse.setPageNumber(context.integerValue("InnerListCCNEventFlowContextStepsResponse.PageNumber"));
		innerListCCNEventFlowContextStepsResponse.setPageSize(context.integerValue("InnerListCCNEventFlowContextStepsResponse.PageSize"));

		List<FlowContextStep> flowContextSteps = new ArrayList<FlowContextStep>();
		for (int i = 0; i < context.lengthValue("InnerListCCNEventFlowContextStepsResponse.FlowContextSteps.Length"); i++) {
			FlowContextStep flowContextStep = new FlowContextStep();
			flowContextStep.setId(context.longValue("InnerListCCNEventFlowContextStepsResponse.FlowContextSteps["+ i +"].Id"));
			flowContextStep.setRegionNo(context.stringValue("InnerListCCNEventFlowContextStepsResponse.FlowContextSteps["+ i +"].RegionNo"));
			flowContextStep.setInstanceId(context.stringValue("InnerListCCNEventFlowContextStepsResponse.FlowContextSteps["+ i +"].InstanceId"));
			flowContextStep.setNamespace(context.stringValue("InnerListCCNEventFlowContextStepsResponse.FlowContextSteps["+ i +"].Namespace"));
			flowContextStep.setContextInstanceId(context.stringValue("InnerListCCNEventFlowContextStepsResponse.FlowContextSteps["+ i +"].ContextInstanceId"));
			flowContextStep.setContextNamespace(context.stringValue("InnerListCCNEventFlowContextStepsResponse.FlowContextSteps["+ i +"].ContextNamespace"));
			flowContextStep.setState(context.stringValue("InnerListCCNEventFlowContextStepsResponse.FlowContextSteps["+ i +"].State"));
			flowContextStep.setStep(context.longValue("InnerListCCNEventFlowContextStepsResponse.FlowContextSteps["+ i +"].Step"));
			flowContextStep.setData(context.stringValue("InnerListCCNEventFlowContextStepsResponse.FlowContextSteps["+ i +"].Data"));
			flowContextStep.setMessage(context.stringValue("InnerListCCNEventFlowContextStepsResponse.FlowContextSteps["+ i +"].Message"));
			flowContextStep.setGmtCreate(context.stringValue("InnerListCCNEventFlowContextStepsResponse.FlowContextSteps["+ i +"].GmtCreate"));
			flowContextStep.setGmtModify(context.stringValue("InnerListCCNEventFlowContextStepsResponse.FlowContextSteps["+ i +"].GmtModify"));

			flowContextSteps.add(flowContextStep);
		}
		innerListCCNEventFlowContextStepsResponse.setFlowContextSteps(flowContextSteps);
	 
	 	return innerListCCNEventFlowContextStepsResponse;
	}
}