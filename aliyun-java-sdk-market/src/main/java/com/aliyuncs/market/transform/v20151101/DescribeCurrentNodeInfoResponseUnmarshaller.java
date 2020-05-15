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

package com.aliyuncs.market.transform.v20151101;

import com.aliyuncs.market.model.v20151101.DescribeCurrentNodeInfoResponse;
import com.aliyuncs.market.model.v20151101.DescribeCurrentNodeInfoResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCurrentNodeInfoResponseUnmarshaller {

	public static DescribeCurrentNodeInfoResponse unmarshall(DescribeCurrentNodeInfoResponse describeCurrentNodeInfoResponse, UnmarshallerContext _ctx) {
		
		describeCurrentNodeInfoResponse.setRequestId(_ctx.stringValue("DescribeCurrentNodeInfoResponse.RequestId"));
		describeCurrentNodeInfoResponse.setSuccess(_ctx.booleanValue("DescribeCurrentNodeInfoResponse.Success"));

		Result result = new Result();
		result.setStepNo(_ctx.integerValue("DescribeCurrentNodeInfoResponse.Result.StepNo"));
		result.setFinalStepNo(_ctx.integerValue("DescribeCurrentNodeInfoResponse.Result.FinalStepNo"));
		result.setParentNodeId(_ctx.longValue("DescribeCurrentNodeInfoResponse.Result.ParentNodeId"));
		result.setNodeId(_ctx.longValue("DescribeCurrentNodeInfoResponse.Result.NodeId"));
		result.setNodeName(_ctx.stringValue("DescribeCurrentNodeInfoResponse.Result.NodeName"));
		result.setPreviousNodeId(_ctx.longValue("DescribeCurrentNodeInfoResponse.Result.PreviousNodeId"));
		result.setNextNodeId(_ctx.longValue("DescribeCurrentNodeInfoResponse.Result.NextNodeId"));
		result.setOperatorRole(_ctx.stringValue("DescribeCurrentNodeInfoResponse.Result.OperatorRole"));
		result.setAutoFinishNode(_ctx.booleanValue("DescribeCurrentNodeInfoResponse.Result.AutoFinishNode"));
		result.setNeedAttachment(_ctx.booleanValue("DescribeCurrentNodeInfoResponse.Result.NeedAttachment"));
		result.setAllowRollbackNode(_ctx.booleanValue("DescribeCurrentNodeInfoResponse.Result.AllowRollbackNode"));
		result.setTemplateForm(_ctx.stringValue("DescribeCurrentNodeInfoResponse.Result.TemplateForm"));
		result.setNodeStatus(_ctx.stringValue("DescribeCurrentNodeInfoResponse.Result.NodeStatus"));
		result.setGmtStart(_ctx.longValue("DescribeCurrentNodeInfoResponse.Result.GmtStart"));
		result.setGmtExpired(_ctx.longValue("DescribeCurrentNodeInfoResponse.Result.GmtExpired"));
		result.setGmtFinished(_ctx.longValue("DescribeCurrentNodeInfoResponse.Result.GmtFinished"));
		describeCurrentNodeInfoResponse.setResult(result);
	 
	 	return describeCurrentNodeInfoResponse;
	}
}