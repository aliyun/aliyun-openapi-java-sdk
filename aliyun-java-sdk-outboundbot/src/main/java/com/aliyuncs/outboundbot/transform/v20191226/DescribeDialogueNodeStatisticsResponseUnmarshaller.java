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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.DescribeDialogueNodeStatisticsResponse;
import com.aliyuncs.outboundbot.model.v20191226.DescribeDialogueNodeStatisticsResponse.NoAnswerDialogueNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDialogueNodeStatisticsResponseUnmarshaller {

	public static DescribeDialogueNodeStatisticsResponse unmarshall(DescribeDialogueNodeStatisticsResponse describeDialogueNodeStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeDialogueNodeStatisticsResponse.setRequestId(_ctx.stringValue("DescribeDialogueNodeStatisticsResponse.RequestId"));
		describeDialogueNodeStatisticsResponse.setSuccess(_ctx.booleanValue("DescribeDialogueNodeStatisticsResponse.Success"));
		describeDialogueNodeStatisticsResponse.setCode(_ctx.stringValue("DescribeDialogueNodeStatisticsResponse.Code"));
		describeDialogueNodeStatisticsResponse.setMessage(_ctx.stringValue("DescribeDialogueNodeStatisticsResponse.Message"));
		describeDialogueNodeStatisticsResponse.setHttpStatusCode(_ctx.integerValue("DescribeDialogueNodeStatisticsResponse.HttpStatusCode"));
		describeDialogueNodeStatisticsResponse.setGroupId(_ctx.stringValue("DescribeDialogueNodeStatisticsResponse.GroupId"));
		describeDialogueNodeStatisticsResponse.setInstanceId(_ctx.stringValue("DescribeDialogueNodeStatisticsResponse.InstanceId"));
		describeDialogueNodeStatisticsResponse.setTotalCompleted(_ctx.integerValue("DescribeDialogueNodeStatisticsResponse.TotalCompleted"));

		List<NoAnswerDialogueNode> noAnswerDialogueNodes = new ArrayList<NoAnswerDialogueNode>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDialogueNodeStatisticsResponse.NoAnswerDialogueNodes.Length"); i++) {
			NoAnswerDialogueNode noAnswerDialogueNode = new NoAnswerDialogueNode();
			noAnswerDialogueNode.setId(_ctx.stringValue("DescribeDialogueNodeStatisticsResponse.NoAnswerDialogueNodes["+ i +"].Id"));
			noAnswerDialogueNode.setInstanceId(_ctx.stringValue("DescribeDialogueNodeStatisticsResponse.NoAnswerDialogueNodes["+ i +"].InstanceId"));
			noAnswerDialogueNode.setGroupId(_ctx.stringValue("DescribeDialogueNodeStatisticsResponse.NoAnswerDialogueNodes["+ i +"].GroupId"));
			noAnswerDialogueNode.setNodeId(_ctx.stringValue("DescribeDialogueNodeStatisticsResponse.NoAnswerDialogueNodes["+ i +"].NodeId"));
			noAnswerDialogueNode.setNodeName(_ctx.stringValue("DescribeDialogueNodeStatisticsResponse.NoAnswerDialogueNodes["+ i +"].NodeName"));
			noAnswerDialogueNode.setHitNum(_ctx.integerValue("DescribeDialogueNodeStatisticsResponse.NoAnswerDialogueNodes["+ i +"].HitNum"));
			noAnswerDialogueNode.setHangUpNum(_ctx.integerValue("DescribeDialogueNodeStatisticsResponse.NoAnswerDialogueNodes["+ i +"].HangUpNum"));
			noAnswerDialogueNode.setNoAnswerNum(_ctx.integerValue("DescribeDialogueNodeStatisticsResponse.NoAnswerDialogueNodes["+ i +"].NoAnswerNum"));

			noAnswerDialogueNodes.add(noAnswerDialogueNode);
		}
		describeDialogueNodeStatisticsResponse.setNoAnswerDialogueNodes(noAnswerDialogueNodes);
	 
	 	return describeDialogueNodeStatisticsResponse;
	}
}