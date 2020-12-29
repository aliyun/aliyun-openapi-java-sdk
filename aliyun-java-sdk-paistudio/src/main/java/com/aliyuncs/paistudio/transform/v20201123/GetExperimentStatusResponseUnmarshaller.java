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

package com.aliyuncs.paistudio.transform.v20201123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paistudio.model.v20201123.GetExperimentStatusResponse;
import com.aliyuncs.paistudio.model.v20201123.GetExperimentStatusResponse.Data;
import com.aliyuncs.paistudio.model.v20201123.GetExperimentStatusResponse.Data.NodesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetExperimentStatusResponseUnmarshaller {

	public static GetExperimentStatusResponse unmarshall(GetExperimentStatusResponse getExperimentStatusResponse, UnmarshallerContext _ctx) {
		
		getExperimentStatusResponse.setRequestId(_ctx.stringValue("GetExperimentStatusResponse.RequestId"));
		getExperimentStatusResponse.setCode(_ctx.stringValue("GetExperimentStatusResponse.Code"));
		getExperimentStatusResponse.setMessage(_ctx.stringValue("GetExperimentStatusResponse.Message"));

		Data data = new Data();
		data.setExperimentId(_ctx.stringValue("GetExperimentStatusResponse.Data.ExperimentId"));
		data.setStatus(_ctx.stringValue("GetExperimentStatusResponse.Data.Status"));

		List<NodesItem> nodes = new ArrayList<NodesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetExperimentStatusResponse.Data.Nodes.Length"); i++) {
			NodesItem nodesItem = new NodesItem();
			nodesItem.setNodeId(_ctx.stringValue("GetExperimentStatusResponse.Data.Nodes["+ i +"].NodeId"));
			nodesItem.setExecutionId(_ctx.stringValue("GetExperimentStatusResponse.Data.Nodes["+ i +"].ExecutionId"));
			nodesItem.setRunId(_ctx.stringValue("GetExperimentStatusResponse.Data.Nodes["+ i +"].RunId"));
			nodesItem.setRunNodeId(_ctx.stringValue("GetExperimentStatusResponse.Data.Nodes["+ i +"].RunNodeId"));
			nodesItem.setStatus(_ctx.stringValue("GetExperimentStatusResponse.Data.Nodes["+ i +"].Status"));

			nodes.add(nodesItem);
		}
		data.setNodes(nodes);
		getExperimentStatusResponse.setData(data);
	 
	 	return getExperimentStatusResponse;
	}
}