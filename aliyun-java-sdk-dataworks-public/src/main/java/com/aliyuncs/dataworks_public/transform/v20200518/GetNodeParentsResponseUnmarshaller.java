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

import com.aliyuncs.dataworks_public.model.v20200518.GetNodeParentsResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetNodeParentsResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.GetNodeParentsResponse.Data.NodesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNodeParentsResponseUnmarshaller {

	public static GetNodeParentsResponse unmarshall(GetNodeParentsResponse getNodeParentsResponse, UnmarshallerContext _ctx) {
		
		getNodeParentsResponse.setRequestId(_ctx.stringValue("GetNodeParentsResponse.RequestId"));
		getNodeParentsResponse.setSuccess(_ctx.booleanValue("GetNodeParentsResponse.Success"));
		getNodeParentsResponse.setHttpStatusCode(_ctx.integerValue("GetNodeParentsResponse.HttpStatusCode"));
		getNodeParentsResponse.setErrorCode(_ctx.stringValue("GetNodeParentsResponse.ErrorCode"));
		getNodeParentsResponse.setErrorMessage(_ctx.stringValue("GetNodeParentsResponse.ErrorMessage"));

		Data data = new Data();

		List<NodesItem> nodes = new ArrayList<NodesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetNodeParentsResponse.Data.Nodes.Length"); i++) {
			NodesItem nodesItem = new NodesItem();
			nodesItem.setNodeId(_ctx.longValue("GetNodeParentsResponse.Data.Nodes["+ i +"].NodeId"));
			nodesItem.setNodeName(_ctx.stringValue("GetNodeParentsResponse.Data.Nodes["+ i +"].NodeName"));
			nodesItem.setCronExpress(_ctx.stringValue("GetNodeParentsResponse.Data.Nodes["+ i +"].CronExpress"));
			nodesItem.setSchedulerType(_ctx.stringValue("GetNodeParentsResponse.Data.Nodes["+ i +"].SchedulerType"));
			nodesItem.setProgramType(_ctx.stringValue("GetNodeParentsResponse.Data.Nodes["+ i +"].ProgramType"));
			nodesItem.setOwnerId(_ctx.stringValue("GetNodeParentsResponse.Data.Nodes["+ i +"].OwnerId"));
			nodesItem.setProjectId(_ctx.longValue("GetNodeParentsResponse.Data.Nodes["+ i +"].ProjectId"));
			nodesItem.setRepeatability(_ctx.booleanValue("GetNodeParentsResponse.Data.Nodes["+ i +"].Repeatability"));
			nodesItem.setPriority(_ctx.integerValue("GetNodeParentsResponse.Data.Nodes["+ i +"].Priority"));
			nodesItem.setBaselineId(_ctx.longValue("GetNodeParentsResponse.Data.Nodes["+ i +"].BaselineId"));

			nodes.add(nodesItem);
		}
		data.setNodes(nodes);
		getNodeParentsResponse.setData(data);
	 
	 	return getNodeParentsResponse;
	}
}