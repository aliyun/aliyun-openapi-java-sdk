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

import com.aliyuncs.dataworks_public.model.v20200518.ListNodesByOutputResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListNodesByOutputResponse.OutputNodePair;
import com.aliyuncs.dataworks_public.model.v20200518.ListNodesByOutputResponse.OutputNodePair.Node;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodesByOutputResponseUnmarshaller {

	public static ListNodesByOutputResponse unmarshall(ListNodesByOutputResponse listNodesByOutputResponse, UnmarshallerContext _ctx) {
		
		listNodesByOutputResponse.setRequestId(_ctx.stringValue("ListNodesByOutputResponse.RequestId"));
		listNodesByOutputResponse.setSuccess(_ctx.booleanValue("ListNodesByOutputResponse.Success"));
		listNodesByOutputResponse.setHttpStatusCode(_ctx.integerValue("ListNodesByOutputResponse.HttpStatusCode"));
		listNodesByOutputResponse.setErrorCode(_ctx.stringValue("ListNodesByOutputResponse.ErrorCode"));
		listNodesByOutputResponse.setErrorMessage(_ctx.stringValue("ListNodesByOutputResponse.ErrorMessage"));

		List<OutputNodePair> data = new ArrayList<OutputNodePair>();
		for (int i = 0; i < _ctx.lengthValue("ListNodesByOutputResponse.Data.Length"); i++) {
			OutputNodePair outputNodePair = new OutputNodePair();
			outputNodePair.setOutput(_ctx.stringValue("ListNodesByOutputResponse.Data["+ i +"].Output"));

			List<Node> nodeList = new ArrayList<Node>();
			for (int j = 0; j < _ctx.lengthValue("ListNodesByOutputResponse.Data["+ i +"].NodeList.Length"); j++) {
				Node node = new Node();
				node.setNodeId(_ctx.longValue("ListNodesByOutputResponse.Data["+ i +"].NodeList["+ j +"].NodeId"));
				node.setNodeName(_ctx.stringValue("ListNodesByOutputResponse.Data["+ i +"].NodeList["+ j +"].NodeName"));
				node.setOwnerId(_ctx.stringValue("ListNodesByOutputResponse.Data["+ i +"].NodeList["+ j +"].OwnerId"));
				node.setDescription(_ctx.stringValue("ListNodesByOutputResponse.Data["+ i +"].NodeList["+ j +"].Description"));
				node.setResGroupName(_ctx.stringValue("ListNodesByOutputResponse.Data["+ i +"].NodeList["+ j +"].ResGroupName"));
				node.setCronExpress(_ctx.stringValue("ListNodesByOutputResponse.Data["+ i +"].NodeList["+ j +"].CronExpress"));
				node.setRepeatability(_ctx.booleanValue("ListNodesByOutputResponse.Data["+ i +"].NodeList["+ j +"].Repeatability"));
				node.setProgramType(_ctx.stringValue("ListNodesByOutputResponse.Data["+ i +"].NodeList["+ j +"].ProgramType"));
				node.setProjectId(_ctx.longValue("ListNodesByOutputResponse.Data["+ i +"].NodeList["+ j +"].ProjectId"));
				node.setSchedulerType(_ctx.stringValue("ListNodesByOutputResponse.Data["+ i +"].NodeList["+ j +"].SchedulerType"));
				node.setParamValues(_ctx.stringValue("ListNodesByOutputResponse.Data["+ i +"].NodeList["+ j +"].ParamValues"));
				node.setPriority(_ctx.integerValue("ListNodesByOutputResponse.Data["+ i +"].NodeList["+ j +"].Priority"));
				node.setBaselineId(_ctx.longValue("ListNodesByOutputResponse.Data["+ i +"].NodeList["+ j +"].BaselineId"));
				node.setRepeatInterval(_ctx.integerValue("ListNodesByOutputResponse.Data["+ i +"].NodeList["+ j +"].RepeatInterval"));
				node.setConnection(_ctx.stringValue("ListNodesByOutputResponse.Data["+ i +"].NodeList["+ j +"].Connection"));
				node.setDqcType(_ctx.integerValue("ListNodesByOutputResponse.Data["+ i +"].NodeList["+ j +"].DqcType"));
				node.setDqcDescription(_ctx.stringValue("ListNodesByOutputResponse.Data["+ i +"].NodeList["+ j +"].DqcDescription"));
				node.setRelatedFlowId(_ctx.longValue("ListNodesByOutputResponse.Data["+ i +"].NodeList["+ j +"].RelatedFlowId"));
				node.setFileType(_ctx.stringValue("ListNodesByOutputResponse.Data["+ i +"].NodeList["+ j +"].FileType"));

				nodeList.add(node);
			}
			outputNodePair.setNodeList(nodeList);

			data.add(outputNodePair);
		}
		listNodesByOutputResponse.setData(data);
	 
	 	return listNodesByOutputResponse;
	}
}