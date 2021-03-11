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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.GetNodeChildrenResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetNodeChildrenResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.GetNodeChildrenResponse.Data.NodesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNodeChildrenResponseUnmarshaller {

	public static GetNodeChildrenResponse unmarshall(GetNodeChildrenResponse getNodeChildrenResponse, UnmarshallerContext _ctx) {
		
		getNodeChildrenResponse.setRequestId(_ctx.stringValue("GetNodeChildrenResponse.RequestId"));
		getNodeChildrenResponse.setSuccess(_ctx.booleanValue("GetNodeChildrenResponse.Success"));
		getNodeChildrenResponse.setHttpStatusCode(_ctx.integerValue("GetNodeChildrenResponse.HttpStatusCode"));
		getNodeChildrenResponse.setErrorCode(_ctx.stringValue("GetNodeChildrenResponse.ErrorCode"));
		getNodeChildrenResponse.setErrorMessage(_ctx.stringValue("GetNodeChildrenResponse.ErrorMessage"));

		Data data = new Data();

		List<NodesItem> nodes = new ArrayList<NodesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetNodeChildrenResponse.Data.Nodes.Length"); i++) {
			NodesItem nodesItem = new NodesItem();
			nodesItem.setNodeId(_ctx.longValue("GetNodeChildrenResponse.Data.Nodes["+ i +"].NodeId"));
			nodesItem.setNodeName(_ctx.stringValue("GetNodeChildrenResponse.Data.Nodes["+ i +"].NodeName"));
			nodesItem.setCronExpress(_ctx.stringValue("GetNodeChildrenResponse.Data.Nodes["+ i +"].CronExpress"));
			nodesItem.setSchedulerType(_ctx.stringValue("GetNodeChildrenResponse.Data.Nodes["+ i +"].SchedulerType"));
			nodesItem.setProgramType(_ctx.stringValue("GetNodeChildrenResponse.Data.Nodes["+ i +"].ProgramType"));
			nodesItem.setOwnerId(_ctx.stringValue("GetNodeChildrenResponse.Data.Nodes["+ i +"].OwnerId"));
			nodesItem.setProjectId(_ctx.longValue("GetNodeChildrenResponse.Data.Nodes["+ i +"].ProjectId"));
			nodesItem.setRepeatability(_ctx.booleanValue("GetNodeChildrenResponse.Data.Nodes["+ i +"].Repeatability"));
			nodesItem.setPriority(_ctx.integerValue("GetNodeChildrenResponse.Data.Nodes["+ i +"].Priority"));
			nodesItem.setBaselineId(_ctx.longValue("GetNodeChildrenResponse.Data.Nodes["+ i +"].BaselineId"));

			nodes.add(nodesItem);
		}
		data.setNodes(nodes);
		getNodeChildrenResponse.setData(data);
	 
	 	return getNodeChildrenResponse;
	}
}