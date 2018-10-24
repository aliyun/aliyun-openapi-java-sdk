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

import com.aliyuncs.smartag_inner.model.v20180313.InnerListCCNEventFlowContextsResponse;
import com.aliyuncs.smartag_inner.model.v20180313.InnerListCCNEventFlowContextsResponse.FlowContext;
import com.aliyuncs.smartag_inner.model.v20180313.InnerListCCNEventFlowContextsResponse.FlowContext.FlowContextStep;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerListCCNEventFlowContextsResponseUnmarshaller {

	public static InnerListCCNEventFlowContextsResponse unmarshall(InnerListCCNEventFlowContextsResponse innerListCCNEventFlowContextsResponse, UnmarshallerContext context) {
		
		innerListCCNEventFlowContextsResponse.setRequestId(context.stringValue("InnerListCCNEventFlowContextsResponse.RequestId"));
		innerListCCNEventFlowContextsResponse.setTotal(context.integerValue("InnerListCCNEventFlowContextsResponse.Total"));
		innerListCCNEventFlowContextsResponse.setPageNumber(context.integerValue("InnerListCCNEventFlowContextsResponse.PageNumber"));
		innerListCCNEventFlowContextsResponse.setPageSize(context.integerValue("InnerListCCNEventFlowContextsResponse.PageSize"));

		List<FlowContext> flowContexts = new ArrayList<FlowContext>();
		for (int i = 0; i < context.lengthValue("InnerListCCNEventFlowContextsResponse.FlowContexts.Length"); i++) {
			FlowContext flowContext = new FlowContext();
			flowContext.setId(context.longValue("InnerListCCNEventFlowContextsResponse.FlowContexts["+ i +"].Id"));
			flowContext.setRegionNo(context.stringValue("InnerListCCNEventFlowContextsResponse.FlowContexts["+ i +"].RegionNo"));
			flowContext.setInstanceId(context.stringValue("InnerListCCNEventFlowContextsResponse.FlowContexts["+ i +"].InstanceId"));
			flowContext.setNamespace(context.stringValue("InnerListCCNEventFlowContextsResponse.FlowContexts["+ i +"].Namespace"));
			flowContext.setEventInstanceId(context.stringValue("InnerListCCNEventFlowContextsResponse.FlowContexts["+ i +"].EventInstanceId"));
			flowContext.setEventNamespace(context.stringValue("InnerListCCNEventFlowContextsResponse.FlowContexts["+ i +"].EventNamespace"));
			flowContext.setState(context.stringValue("InnerListCCNEventFlowContextsResponse.FlowContexts["+ i +"].State"));
			flowContext.setGmtModify(context.stringValue("InnerListCCNEventFlowContextsResponse.FlowContexts["+ i +"].GmtModify"));
			flowContext.setGmtCreate(context.stringValue("InnerListCCNEventFlowContextsResponse.FlowContexts["+ i +"].GmtCreate"));

			List<FlowContextStep> flowContextSteps = new ArrayList<FlowContextStep>();
			for (int j = 0; j < context.lengthValue("InnerListCCNEventFlowContextsResponse.FlowContexts["+ i +"].FlowContextSteps.Length"); j++) {
				FlowContextStep flowContextStep = new FlowContextStep();
				flowContextStep.setId(context.longValue("InnerListCCNEventFlowContextsResponse.FlowContexts["+ i +"].FlowContextSteps["+ j +"].Id"));
				flowContextStep.setRegionNo(context.stringValue("InnerListCCNEventFlowContextsResponse.FlowContexts["+ i +"].FlowContextSteps["+ j +"].RegionNo"));
				flowContextStep.setInstanceId(context.stringValue("InnerListCCNEventFlowContextsResponse.FlowContexts["+ i +"].FlowContextSteps["+ j +"].InstanceId"));
				flowContextStep.setNamespace(context.stringValue("InnerListCCNEventFlowContextsResponse.FlowContexts["+ i +"].FlowContextSteps["+ j +"].Namespace"));
				flowContextStep.setContextInstanceId(context.stringValue("InnerListCCNEventFlowContextsResponse.FlowContexts["+ i +"].FlowContextSteps["+ j +"].ContextInstanceId"));
				flowContextStep.setContextNamespace(context.stringValue("InnerListCCNEventFlowContextsResponse.FlowContexts["+ i +"].FlowContextSteps["+ j +"].ContextNamespace"));
				flowContextStep.setState(context.stringValue("InnerListCCNEventFlowContextsResponse.FlowContexts["+ i +"].FlowContextSteps["+ j +"].State"));
				flowContextStep.setStep(context.longValue("InnerListCCNEventFlowContextsResponse.FlowContexts["+ i +"].FlowContextSteps["+ j +"].Step"));
				flowContextStep.setData(context.longValue("InnerListCCNEventFlowContextsResponse.FlowContexts["+ i +"].FlowContextSteps["+ j +"].Data"));
				flowContextStep.setMessage(context.longValue("InnerListCCNEventFlowContextsResponse.FlowContexts["+ i +"].FlowContextSteps["+ j +"].Message"));
				flowContextStep.setGmtCreate(context.stringValue("InnerListCCNEventFlowContextsResponse.FlowContexts["+ i +"].FlowContextSteps["+ j +"].GmtCreate"));
				flowContextStep.setGmtModify(context.stringValue("InnerListCCNEventFlowContextsResponse.FlowContexts["+ i +"].FlowContextSteps["+ j +"].GmtModify"));

				flowContextSteps.add(flowContextStep);
			}
			flowContext.setFlowContextSteps(flowContextSteps);

			flowContexts.add(flowContext);
		}
		innerListCCNEventFlowContextsResponse.setFlowContexts(flowContexts);
	 
	 	return innerListCCNEventFlowContextsResponse;
	}
}