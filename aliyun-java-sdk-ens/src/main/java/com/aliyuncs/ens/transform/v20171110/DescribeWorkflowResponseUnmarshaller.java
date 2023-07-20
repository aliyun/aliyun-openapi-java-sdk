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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeWorkflowResponse;
import com.aliyuncs.ens.model.v20171110.DescribeWorkflowResponse.WorkFlowInfos;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWorkflowResponseUnmarshaller {

	public static DescribeWorkflowResponse unmarshall(DescribeWorkflowResponse describeWorkflowResponse, UnmarshallerContext _ctx) {
		
		describeWorkflowResponse.setRequestId(_ctx.stringValue("DescribeWorkflowResponse.RequestId"));

		List<WorkFlowInfos> workFlowInfo = new ArrayList<WorkFlowInfos>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWorkflowResponse.WorkFlowInfo.Length"); i++) {
			WorkFlowInfos workFlowInfos = new WorkFlowInfos();
			workFlowInfos.setGmtCreate(_ctx.stringValue("DescribeWorkflowResponse.WorkFlowInfo["+ i +"].GmtCreate"));
			workFlowInfos.setGmtExpire(_ctx.stringValue("DescribeWorkflowResponse.WorkFlowInfo["+ i +"].GmtExpire"));
			workFlowInfos.setWorkflowId(_ctx.stringValue("DescribeWorkflowResponse.WorkFlowInfo["+ i +"].WorkflowId"));
			workFlowInfos.setBizType(_ctx.stringValue("DescribeWorkflowResponse.WorkFlowInfo["+ i +"].BizType"));
			workFlowInfos.setInitAttributes(_ctx.stringValue("DescribeWorkflowResponse.WorkFlowInfo["+ i +"].InitAttributes"));
			workFlowInfos.setWorkerNode(_ctx.stringValue("DescribeWorkflowResponse.WorkFlowInfo["+ i +"].WorkerNode"));
			workFlowInfos.setDuration(_ctx.stringValue("DescribeWorkflowResponse.WorkFlowInfo["+ i +"].Duration"));
			workFlowInfos.setGmtStart(_ctx.stringValue("DescribeWorkflowResponse.WorkFlowInfo["+ i +"].GmtStart"));
			workFlowInfos.setAliUid(_ctx.stringValue("DescribeWorkflowResponse.WorkFlowInfo["+ i +"].AliUid"));
			workFlowInfos.setEnsRegionId(_ctx.stringValue("DescribeWorkflowResponse.WorkFlowInfo["+ i +"].EnsRegionId"));
			workFlowInfos.setInstanceId(_ctx.stringValue("DescribeWorkflowResponse.WorkFlowInfo["+ i +"].InstanceId"));
			workFlowInfos.setName(_ctx.stringValue("DescribeWorkflowResponse.WorkFlowInfo["+ i +"].Name"));
			workFlowInfos.setGmtModify(_ctx.stringValue("DescribeWorkflowResponse.WorkFlowInfo["+ i +"].GmtModify"));
			workFlowInfos.setId(_ctx.stringValue("DescribeWorkflowResponse.WorkFlowInfo["+ i +"].Id"));
			workFlowInfos.setGmtEnd(_ctx.stringValue("DescribeWorkflowResponse.WorkFlowInfo["+ i +"].GmtEnd"));
			workFlowInfos.setBussinessId(_ctx.stringValue("DescribeWorkflowResponse.WorkFlowInfo["+ i +"].BussinessId"));
			workFlowInfos.setStatus(_ctx.stringValue("DescribeWorkflowResponse.WorkFlowInfo["+ i +"].Status"));
			workFlowInfos.setPriority(_ctx.stringValue("DescribeWorkflowResponse.WorkFlowInfo["+ i +"].Priority"));

			workFlowInfo.add(workFlowInfos);
		}
		describeWorkflowResponse.setWorkFlowInfo(workFlowInfo);
	 
	 	return describeWorkflowResponse;
	}
}