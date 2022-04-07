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

import com.aliyuncs.dataworks_public.model.v20200518.ListNodesResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListNodesResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListNodesResponse.Data.NodesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodesResponseUnmarshaller {

	public static ListNodesResponse unmarshall(ListNodesResponse listNodesResponse, UnmarshallerContext _ctx) {
		
		listNodesResponse.setRequestId(_ctx.stringValue("ListNodesResponse.RequestId"));
		listNodesResponse.setHttpStatusCode(_ctx.integerValue("ListNodesResponse.HttpStatusCode"));
		listNodesResponse.setErrorMessage(_ctx.stringValue("ListNodesResponse.ErrorMessage"));
		listNodesResponse.setErrorCode(_ctx.stringValue("ListNodesResponse.ErrorCode"));
		listNodesResponse.setSuccess(_ctx.booleanValue("ListNodesResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListNodesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListNodesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListNodesResponse.Data.TotalCount"));

		List<NodesItem> nodes = new ArrayList<NodesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListNodesResponse.Data.Nodes.Length"); i++) {
			NodesItem nodesItem = new NodesItem();
			nodesItem.setSchedulerType(_ctx.stringValue("ListNodesResponse.Data.Nodes["+ i +"].SchedulerType"));
			nodesItem.setRepeatInterval(_ctx.longValue("ListNodesResponse.Data.Nodes["+ i +"].RepeatInterval"));
			nodesItem.setRepeatability(_ctx.booleanValue("ListNodesResponse.Data.Nodes["+ i +"].Repeatability"));
			nodesItem.setProjectId(_ctx.longValue("ListNodesResponse.Data.Nodes["+ i +"].ProjectId"));
			nodesItem.setProgramType(_ctx.stringValue("ListNodesResponse.Data.Nodes["+ i +"].ProgramType"));
			nodesItem.setPriority(_ctx.integerValue("ListNodesResponse.Data.Nodes["+ i +"].Priority"));
			nodesItem.setOwnerId(_ctx.stringValue("ListNodesResponse.Data.Nodes["+ i +"].OwnerId"));
			nodesItem.setConnection(_ctx.stringValue("ListNodesResponse.Data.Nodes["+ i +"].Connection"));
			nodesItem.setParamValues(_ctx.stringValue("ListNodesResponse.Data.Nodes["+ i +"].ParamValues"));
			nodesItem.setRelatedFlowId(_ctx.longValue("ListNodesResponse.Data.Nodes["+ i +"].RelatedFlowId"));
			nodesItem.setDqcType(_ctx.integerValue("ListNodesResponse.Data.Nodes["+ i +"].DqcType"));
			nodesItem.setBaselineId(_ctx.longValue("ListNodesResponse.Data.Nodes["+ i +"].BaselineId"));
			nodesItem.setDescription(_ctx.stringValue("ListNodesResponse.Data.Nodes["+ i +"].Description"));
			nodesItem.setNodeName(_ctx.stringValue("ListNodesResponse.Data.Nodes["+ i +"].NodeName"));
			nodesItem.setResGroupName(_ctx.stringValue("ListNodesResponse.Data.Nodes["+ i +"].ResGroupName"));
			nodesItem.setBusinessId(_ctx.longValue("ListNodesResponse.Data.Nodes["+ i +"].BusinessId"));
			nodesItem.setDqcDescription(_ctx.stringValue("ListNodesResponse.Data.Nodes["+ i +"].DqcDescription"));
			nodesItem.setCronExpress(_ctx.stringValue("ListNodesResponse.Data.Nodes["+ i +"].CronExpress"));
			nodesItem.setNodeId(_ctx.longValue("ListNodesResponse.Data.Nodes["+ i +"].NodeId"));

			nodes.add(nodesItem);
		}
		data.setNodes(nodes);
		listNodesResponse.setData(data);
	 
	 	return listNodesResponse;
	}
}