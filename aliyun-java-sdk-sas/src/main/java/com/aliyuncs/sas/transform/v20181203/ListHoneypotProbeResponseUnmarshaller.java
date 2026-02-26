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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListHoneypotProbeResponse;
import com.aliyuncs.sas.model.v20181203.ListHoneypotProbeResponse.ListItem;
import com.aliyuncs.sas.model.v20181203.ListHoneypotProbeResponse.ListItem.ControlNode;
import com.aliyuncs.sas.model.v20181203.ListHoneypotProbeResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHoneypotProbeResponseUnmarshaller {

	public static ListHoneypotProbeResponse unmarshall(ListHoneypotProbeResponse listHoneypotProbeResponse, UnmarshallerContext _ctx) {
		
		listHoneypotProbeResponse.setRequestId(_ctx.stringValue("ListHoneypotProbeResponse.RequestId"));
		listHoneypotProbeResponse.setSuccess(_ctx.booleanValue("ListHoneypotProbeResponse.Success"));
		listHoneypotProbeResponse.setCode(_ctx.stringValue("ListHoneypotProbeResponse.Code"));
		listHoneypotProbeResponse.setMessage(_ctx.stringValue("ListHoneypotProbeResponse.Message"));
		listHoneypotProbeResponse.setHttpStatusCode(_ctx.integerValue("ListHoneypotProbeResponse.HttpStatusCode"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListHoneypotProbeResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListHoneypotProbeResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("ListHoneypotProbeResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("ListHoneypotProbeResponse.PageInfo.Count"));
		listHoneypotProbeResponse.setPageInfo(pageInfo);

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListHoneypotProbeResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setProbeId(_ctx.stringValue("ListHoneypotProbeResponse.List["+ i +"].ProbeId"));
			listItem.setProbeType(_ctx.stringValue("ListHoneypotProbeResponse.List["+ i +"].ProbeType"));
			listItem.setProbeVersion(_ctx.stringValue("ListHoneypotProbeResponse.List["+ i +"].ProbeVersion"));
			listItem.setDisplayName(_ctx.stringValue("ListHoneypotProbeResponse.List["+ i +"].DisplayName"));
			listItem.setOsType(_ctx.stringValue("ListHoneypotProbeResponse.List["+ i +"].OsType"));
			listItem.setHostIp(_ctx.stringValue("ListHoneypotProbeResponse.List["+ i +"].HostIp"));
			listItem.setDeployTime(_ctx.longValue("ListHoneypotProbeResponse.List["+ i +"].DeployTime"));
			listItem.setStatus(_ctx.stringValue("ListHoneypotProbeResponse.List["+ i +"].Status"));
			listItem.setUuid(_ctx.stringValue("ListHoneypotProbeResponse.List["+ i +"].Uuid"));
			listItem.setVpcId(_ctx.stringValue("ListHoneypotProbeResponse.List["+ i +"].VpcId"));

			ControlNode controlNode = new ControlNode();
			controlNode.setNodeId(_ctx.stringValue("ListHoneypotProbeResponse.List["+ i +"].ControlNode.NodeId"));
			controlNode.setNodeName(_ctx.stringValue("ListHoneypotProbeResponse.List["+ i +"].ControlNode.NodeName"));
			controlNode.setEcsInstanceId(_ctx.stringValue("ListHoneypotProbeResponse.List["+ i +"].ControlNode.EcsInstanceId"));
			listItem.setControlNode(controlNode);

			list.add(listItem);
		}
		listHoneypotProbeResponse.setList(list);
	 
	 	return listHoneypotProbeResponse;
	}
}