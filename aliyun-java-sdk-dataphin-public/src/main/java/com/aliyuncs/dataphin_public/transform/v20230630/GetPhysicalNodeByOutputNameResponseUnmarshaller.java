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

import com.aliyuncs.dataphin_public.model.v20230630.GetPhysicalNodeByOutputNameResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetPhysicalNodeByOutputNameResponse.NodeInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetPhysicalNodeByOutputNameResponse.NodeInfo.Creator;
import com.aliyuncs.dataphin_public.model.v20230630.GetPhysicalNodeByOutputNameResponse.NodeInfo.Modifier;
import com.aliyuncs.dataphin_public.model.v20230630.GetPhysicalNodeByOutputNameResponse.NodeInfo.Owner;
import com.aliyuncs.dataphin_public.model.v20230630.GetPhysicalNodeByOutputNameResponse.NodeInfo.ProjectInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPhysicalNodeByOutputNameResponseUnmarshaller {

	public static GetPhysicalNodeByOutputNameResponse unmarshall(GetPhysicalNodeByOutputNameResponse getPhysicalNodeByOutputNameResponse, UnmarshallerContext _ctx) {
		
		getPhysicalNodeByOutputNameResponse.setRequestId(_ctx.stringValue("GetPhysicalNodeByOutputNameResponse.RequestId"));
		getPhysicalNodeByOutputNameResponse.setSuccess(_ctx.booleanValue("GetPhysicalNodeByOutputNameResponse.Success"));
		getPhysicalNodeByOutputNameResponse.setHttpStatusCode(_ctx.integerValue("GetPhysicalNodeByOutputNameResponse.HttpStatusCode"));
		getPhysicalNodeByOutputNameResponse.setCode(_ctx.stringValue("GetPhysicalNodeByOutputNameResponse.Code"));
		getPhysicalNodeByOutputNameResponse.setMessage(_ctx.stringValue("GetPhysicalNodeByOutputNameResponse.Message"));

		NodeInfo nodeInfo = new NodeInfo();
		nodeInfo.setId(_ctx.stringValue("GetPhysicalNodeByOutputNameResponse.NodeInfo.Id"));
		nodeInfo.setName(_ctx.stringValue("GetPhysicalNodeByOutputNameResponse.NodeInfo.Name"));
		nodeInfo.setDescription(_ctx.stringValue("GetPhysicalNodeByOutputNameResponse.NodeInfo.Description"));
		nodeInfo.setOperatorType(_ctx.stringValue("GetPhysicalNodeByOutputNameResponse.NodeInfo.OperatorType"));
		nodeInfo.setScheduleType(_ctx.stringValue("GetPhysicalNodeByOutputNameResponse.NodeInfo.ScheduleType"));
		nodeInfo.setPriority(_ctx.stringValue("GetPhysicalNodeByOutputNameResponse.NodeInfo.Priority"));
		nodeInfo.setCreateTime(_ctx.longValue("GetPhysicalNodeByOutputNameResponse.NodeInfo.CreateTime"));
		nodeInfo.setLastModifiedTime(_ctx.longValue("GetPhysicalNodeByOutputNameResponse.NodeInfo.LastModifiedTime"));
		nodeInfo.setStatus(_ctx.stringValue("GetPhysicalNodeByOutputNameResponse.NodeInfo.Status"));
		nodeInfo.setTriggerConfig(_ctx.stringValue("GetPhysicalNodeByOutputNameResponse.NodeInfo.TriggerConfig"));
		nodeInfo.setFrom(_ctx.stringValue("GetPhysicalNodeByOutputNameResponse.NodeInfo.From"));

		ProjectInfo projectInfo = new ProjectInfo();
		projectInfo.setId(_ctx.stringValue("GetPhysicalNodeByOutputNameResponse.NodeInfo.ProjectInfo.Id"));
		projectInfo.setName(_ctx.stringValue("GetPhysicalNodeByOutputNameResponse.NodeInfo.ProjectInfo.Name"));
		nodeInfo.setProjectInfo(projectInfo);

		Creator creator = new Creator();
		creator.setId(_ctx.stringValue("GetPhysicalNodeByOutputNameResponse.NodeInfo.Creator.Id"));
		creator.setName(_ctx.stringValue("GetPhysicalNodeByOutputNameResponse.NodeInfo.Creator.Name"));
		nodeInfo.setCreator(creator);

		Owner owner = new Owner();
		owner.setId(_ctx.stringValue("GetPhysicalNodeByOutputNameResponse.NodeInfo.Owner.Id"));
		owner.setName(_ctx.stringValue("GetPhysicalNodeByOutputNameResponse.NodeInfo.Owner.Name"));
		nodeInfo.setOwner(owner);

		Modifier modifier = new Modifier();
		modifier.setId(_ctx.stringValue("GetPhysicalNodeByOutputNameResponse.NodeInfo.Modifier.Id"));
		modifier.setName(_ctx.stringValue("GetPhysicalNodeByOutputNameResponse.NodeInfo.Modifier.Name"));
		nodeInfo.setModifier(modifier);
		getPhysicalNodeByOutputNameResponse.setNodeInfo(nodeInfo);
	 
	 	return getPhysicalNodeByOutputNameResponse;
	}
}