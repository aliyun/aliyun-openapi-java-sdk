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

import com.aliyuncs.dataphin_public.model.v20230630.GetPhysicalNodeResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetPhysicalNodeResponse.NodeInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetPhysicalNodeResponse.NodeInfo.Creator;
import com.aliyuncs.dataphin_public.model.v20230630.GetPhysicalNodeResponse.NodeInfo.Modifier;
import com.aliyuncs.dataphin_public.model.v20230630.GetPhysicalNodeResponse.NodeInfo.Owner;
import com.aliyuncs.dataphin_public.model.v20230630.GetPhysicalNodeResponse.NodeInfo.ProjectInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPhysicalNodeResponseUnmarshaller {

	public static GetPhysicalNodeResponse unmarshall(GetPhysicalNodeResponse getPhysicalNodeResponse, UnmarshallerContext _ctx) {
		
		getPhysicalNodeResponse.setRequestId(_ctx.stringValue("GetPhysicalNodeResponse.RequestId"));
		getPhysicalNodeResponse.setSuccess(_ctx.booleanValue("GetPhysicalNodeResponse.Success"));
		getPhysicalNodeResponse.setHttpStatusCode(_ctx.integerValue("GetPhysicalNodeResponse.HttpStatusCode"));
		getPhysicalNodeResponse.setCode(_ctx.stringValue("GetPhysicalNodeResponse.Code"));
		getPhysicalNodeResponse.setMessage(_ctx.stringValue("GetPhysicalNodeResponse.Message"));

		NodeInfo nodeInfo = new NodeInfo();
		nodeInfo.setId(_ctx.stringValue("GetPhysicalNodeResponse.NodeInfo.Id"));
		nodeInfo.setName(_ctx.stringValue("GetPhysicalNodeResponse.NodeInfo.Name"));
		nodeInfo.setDescription(_ctx.stringValue("GetPhysicalNodeResponse.NodeInfo.Description"));
		nodeInfo.setOperatorType(_ctx.stringValue("GetPhysicalNodeResponse.NodeInfo.OperatorType"));
		nodeInfo.setScheduleType(_ctx.stringValue("GetPhysicalNodeResponse.NodeInfo.ScheduleType"));
		nodeInfo.setPriority(_ctx.stringValue("GetPhysicalNodeResponse.NodeInfo.Priority"));
		nodeInfo.setCreateTime(_ctx.longValue("GetPhysicalNodeResponse.NodeInfo.CreateTime"));
		nodeInfo.setLastModifiedTime(_ctx.longValue("GetPhysicalNodeResponse.NodeInfo.LastModifiedTime"));
		nodeInfo.setStatus(_ctx.stringValue("GetPhysicalNodeResponse.NodeInfo.Status"));
		nodeInfo.setTriggerConfig(_ctx.stringValue("GetPhysicalNodeResponse.NodeInfo.TriggerConfig"));
		nodeInfo.setFrom(_ctx.stringValue("GetPhysicalNodeResponse.NodeInfo.From"));
		nodeInfo.setCronExpression(_ctx.stringValue("GetPhysicalNodeResponse.NodeInfo.CronExpression"));
		nodeInfo.setDataSourceId(_ctx.longValue("GetPhysicalNodeResponse.NodeInfo.DataSourceId"));
		nodeInfo.setDataSourceSchema(_ctx.stringValue("GetPhysicalNodeResponse.NodeInfo.DataSourceSchema"));

		List<String> outputNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPhysicalNodeResponse.NodeInfo.OutputNameList.Length"); i++) {
			outputNameList.add(_ctx.stringValue("GetPhysicalNodeResponse.NodeInfo.OutputNameList["+ i +"]"));
		}
		nodeInfo.setOutputNameList(outputNameList);

		ProjectInfo projectInfo = new ProjectInfo();
		projectInfo.setId(_ctx.stringValue("GetPhysicalNodeResponse.NodeInfo.ProjectInfo.Id"));
		projectInfo.setName(_ctx.stringValue("GetPhysicalNodeResponse.NodeInfo.ProjectInfo.Name"));
		nodeInfo.setProjectInfo(projectInfo);

		Creator creator = new Creator();
		creator.setId(_ctx.stringValue("GetPhysicalNodeResponse.NodeInfo.Creator.Id"));
		creator.setName(_ctx.stringValue("GetPhysicalNodeResponse.NodeInfo.Creator.Name"));
		nodeInfo.setCreator(creator);

		Owner owner = new Owner();
		owner.setId(_ctx.stringValue("GetPhysicalNodeResponse.NodeInfo.Owner.Id"));
		owner.setName(_ctx.stringValue("GetPhysicalNodeResponse.NodeInfo.Owner.Name"));
		nodeInfo.setOwner(owner);

		Modifier modifier = new Modifier();
		modifier.setId(_ctx.stringValue("GetPhysicalNodeResponse.NodeInfo.Modifier.Id"));
		modifier.setName(_ctx.stringValue("GetPhysicalNodeResponse.NodeInfo.Modifier.Name"));
		nodeInfo.setModifier(modifier);
		getPhysicalNodeResponse.setNodeInfo(nodeInfo);
	 
	 	return getPhysicalNodeResponse;
	}
}