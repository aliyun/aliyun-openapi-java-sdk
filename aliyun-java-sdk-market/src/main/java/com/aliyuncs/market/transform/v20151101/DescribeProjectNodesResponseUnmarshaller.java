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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.market.model.v20151101.DescribeProjectNodesResponse;
import com.aliyuncs.market.model.v20151101.DescribeProjectNodesResponse.ProjectNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProjectNodesResponseUnmarshaller {

	public static DescribeProjectNodesResponse unmarshall(DescribeProjectNodesResponse describeProjectNodesResponse, UnmarshallerContext _ctx) {
		
		describeProjectNodesResponse.setRequestId(_ctx.stringValue("DescribeProjectNodesResponse.RequestId"));
		describeProjectNodesResponse.setSuccess(_ctx.booleanValue("DescribeProjectNodesResponse.Success"));

		List<ProjectNode> result = new ArrayList<ProjectNode>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProjectNodesResponse.Result.Length"); i++) {
			ProjectNode projectNode = new ProjectNode();
			projectNode.setStepNo(_ctx.integerValue("DescribeProjectNodesResponse.Result["+ i +"].StepNo"));
			projectNode.setFinalStepNo(_ctx.integerValue("DescribeProjectNodesResponse.Result["+ i +"].FinalStepNo"));
			projectNode.setParentNodeId(_ctx.longValue("DescribeProjectNodesResponse.Result["+ i +"].ParentNodeId"));
			projectNode.setNodeId(_ctx.longValue("DescribeProjectNodesResponse.Result["+ i +"].NodeId"));
			projectNode.setNodeName(_ctx.stringValue("DescribeProjectNodesResponse.Result["+ i +"].NodeName"));
			projectNode.setPreviousNodeId(_ctx.longValue("DescribeProjectNodesResponse.Result["+ i +"].PreviousNodeId"));
			projectNode.setNextNodeId(_ctx.longValue("DescribeProjectNodesResponse.Result["+ i +"].NextNodeId"));
			projectNode.setOperatorRole(_ctx.stringValue("DescribeProjectNodesResponse.Result["+ i +"].OperatorRole"));
			projectNode.setAutoFinishNode(_ctx.booleanValue("DescribeProjectNodesResponse.Result["+ i +"].AutoFinishNode"));
			projectNode.setNeedAttachment(_ctx.booleanValue("DescribeProjectNodesResponse.Result["+ i +"].NeedAttachment"));
			projectNode.setAllowRollbackNode(_ctx.booleanValue("DescribeProjectNodesResponse.Result["+ i +"].AllowRollbackNode"));
			projectNode.setTemplateForm(_ctx.stringValue("DescribeProjectNodesResponse.Result["+ i +"].TemplateForm"));
			projectNode.setNodeStatus(_ctx.stringValue("DescribeProjectNodesResponse.Result["+ i +"].NodeStatus"));
			projectNode.setGmtStart(_ctx.longValue("DescribeProjectNodesResponse.Result["+ i +"].GmtStart"));
			projectNode.setGmtExpired(_ctx.longValue("DescribeProjectNodesResponse.Result["+ i +"].GmtExpired"));
			projectNode.setGmtFinished(_ctx.longValue("DescribeProjectNodesResponse.Result["+ i +"].GmtFinished"));

			result.add(projectNode);
		}
		describeProjectNodesResponse.setResult(result);
	 
	 	return describeProjectNodesResponse;
	}
}