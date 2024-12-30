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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ParseBatchTaskDependencyResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ParseBatchTaskDependencyResponse.ParseResult;
import com.aliyuncs.dataphin_public.model.v20230630.ParseBatchTaskDependencyResponse.ParseResult.DependNode;
import com.aliyuncs.dataphin_public.model.v20230630.ParseBatchTaskDependencyResponse.ParseResult.DependNode.NodeInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ParseBatchTaskDependencyResponseUnmarshaller {

	public static ParseBatchTaskDependencyResponse unmarshall(ParseBatchTaskDependencyResponse parseBatchTaskDependencyResponse, UnmarshallerContext _ctx) {
		
		parseBatchTaskDependencyResponse.setRequestId(_ctx.stringValue("ParseBatchTaskDependencyResponse.RequestId"));
		parseBatchTaskDependencyResponse.setSuccess(_ctx.booleanValue("ParseBatchTaskDependencyResponse.Success"));
		parseBatchTaskDependencyResponse.setHttpStatusCode(_ctx.integerValue("ParseBatchTaskDependencyResponse.HttpStatusCode"));
		parseBatchTaskDependencyResponse.setCode(_ctx.stringValue("ParseBatchTaskDependencyResponse.Code"));
		parseBatchTaskDependencyResponse.setMessage(_ctx.stringValue("ParseBatchTaskDependencyResponse.Message"));

		ParseResult parseResult = new ParseResult();

		List<DependNode> dependNodeList = new ArrayList<DependNode>();
		for (int i = 0; i < _ctx.lengthValue("ParseBatchTaskDependencyResponse.ParseResult.DependNodeList.Length"); i++) {
			DependNode dependNode = new DependNode();
			dependNode.setNodeIoType(_ctx.stringValue("ParseBatchTaskDependencyResponse.ParseResult.DependNodeList["+ i +"].NodeIoType"));

			List<NodeInfo> scheduleNodeInfoList = new ArrayList<NodeInfo>();
			for (int j = 0; j < _ctx.lengthValue("ParseBatchTaskDependencyResponse.ParseResult.DependNodeList["+ i +"].ScheduleNodeInfoList.Length"); j++) {
				NodeInfo nodeInfo = new NodeInfo();
				nodeInfo.setTableName(_ctx.stringValue("ParseBatchTaskDependencyResponse.ParseResult.DependNodeList["+ i +"].ScheduleNodeInfoList["+ j +"].TableName"));
				nodeInfo.setOutputName(_ctx.stringValue("ParseBatchTaskDependencyResponse.ParseResult.DependNodeList["+ i +"].ScheduleNodeInfoList["+ j +"].OutputName"));
				nodeInfo.setOwnerUserId(_ctx.stringValue("ParseBatchTaskDependencyResponse.ParseResult.DependNodeList["+ i +"].ScheduleNodeInfoList["+ j +"].OwnerUserId"));
				nodeInfo.setOwnerName(_ctx.stringValue("ParseBatchTaskDependencyResponse.ParseResult.DependNodeList["+ i +"].ScheduleNodeInfoList["+ j +"].OwnerName"));
				nodeInfo.setNodeId(_ctx.stringValue("ParseBatchTaskDependencyResponse.ParseResult.DependNodeList["+ i +"].ScheduleNodeInfoList["+ j +"].NodeId"));
				nodeInfo.setNodeName(_ctx.stringValue("ParseBatchTaskDependencyResponse.ParseResult.DependNodeList["+ i +"].ScheduleNodeInfoList["+ j +"].NodeName"));

				List<String> fieldList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ParseBatchTaskDependencyResponse.ParseResult.DependNodeList["+ i +"].ScheduleNodeInfoList["+ j +"].FieldList.Length"); k++) {
					fieldList.add(_ctx.stringValue("ParseBatchTaskDependencyResponse.ParseResult.DependNodeList["+ i +"].ScheduleNodeInfoList["+ j +"].FieldList["+ k +"]"));
				}
				nodeInfo.setFieldList(fieldList);

				scheduleNodeInfoList.add(nodeInfo);
			}
			dependNode.setScheduleNodeInfoList(scheduleNodeInfoList);

			dependNodeList.add(dependNode);
		}
		parseResult.setDependNodeList(dependNodeList);
		parseBatchTaskDependencyResponse.setParseResult(parseResult);
	 
	 	return parseBatchTaskDependencyResponse;
	}
}