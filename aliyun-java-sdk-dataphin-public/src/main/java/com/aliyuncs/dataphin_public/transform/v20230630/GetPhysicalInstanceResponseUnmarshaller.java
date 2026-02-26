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

import com.aliyuncs.dataphin_public.model.v20230630.GetPhysicalInstanceResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetPhysicalInstanceResponse.Instance;
import com.aliyuncs.dataphin_public.model.v20230630.GetPhysicalInstanceResponse.Instance.NodeInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetPhysicalInstanceResponse.Instance.NodeInfo.Creator;
import com.aliyuncs.dataphin_public.model.v20230630.GetPhysicalInstanceResponse.Instance.NodeInfo.Modifier;
import com.aliyuncs.dataphin_public.model.v20230630.GetPhysicalInstanceResponse.Instance.NodeInfo.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPhysicalInstanceResponseUnmarshaller {

	public static GetPhysicalInstanceResponse unmarshall(GetPhysicalInstanceResponse getPhysicalInstanceResponse, UnmarshallerContext _ctx) {
		
		getPhysicalInstanceResponse.setRequestId(_ctx.stringValue("GetPhysicalInstanceResponse.RequestId"));
		getPhysicalInstanceResponse.setSuccess(_ctx.booleanValue("GetPhysicalInstanceResponse.Success"));
		getPhysicalInstanceResponse.setHttpStatusCode(_ctx.integerValue("GetPhysicalInstanceResponse.HttpStatusCode"));
		getPhysicalInstanceResponse.setCode(_ctx.stringValue("GetPhysicalInstanceResponse.Code"));
		getPhysicalInstanceResponse.setMessage(_ctx.stringValue("GetPhysicalInstanceResponse.Message"));

		Instance instance = new Instance();
		instance.setId(_ctx.stringValue("GetPhysicalInstanceResponse.Instance.Id"));
		instance.setBizDate(_ctx.stringValue("GetPhysicalInstanceResponse.Instance.BizDate"));
		instance.setDueTime(_ctx.stringValue("GetPhysicalInstanceResponse.Instance.DueTime"));
		instance.setStartExecuteTime(_ctx.longValue("GetPhysicalInstanceResponse.Instance.StartExecuteTime"));
		instance.setEndExecuteTime(_ctx.longValue("GetPhysicalInstanceResponse.Instance.EndExecuteTime"));
		instance.setDuration(_ctx.stringValue("GetPhysicalInstanceResponse.Instance.Duration"));
		instance.setIndex(_ctx.integerValue("GetPhysicalInstanceResponse.Instance.Index"));
		instance.setExtendInfo(_ctx.stringValue("GetPhysicalInstanceResponse.Instance.ExtendInfo"));

		List<String> statusList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPhysicalInstanceResponse.Instance.StatusList.Length"); i++) {
			statusList.add(_ctx.stringValue("GetPhysicalInstanceResponse.Instance.StatusList["+ i +"]"));
		}
		instance.setStatusList(statusList);

		NodeInfo nodeInfo = new NodeInfo();
		nodeInfo.setId(_ctx.stringValue("GetPhysicalInstanceResponse.Instance.NodeInfo.Id"));
		nodeInfo.setFrom(_ctx.stringValue("GetPhysicalInstanceResponse.Instance.NodeInfo.From"));
		nodeInfo.setType(_ctx.stringValue("GetPhysicalInstanceResponse.Instance.NodeInfo.Type"));
		nodeInfo.setName(_ctx.stringValue("GetPhysicalInstanceResponse.Instance.NodeInfo.Name"));
		nodeInfo.setSubDetailType(_ctx.stringValue("GetPhysicalInstanceResponse.Instance.NodeInfo.SubDetailType"));
		nodeInfo.setDescription(_ctx.stringValue("GetPhysicalInstanceResponse.Instance.NodeInfo.Description"));
		nodeInfo.setDryRun(_ctx.booleanValue("GetPhysicalInstanceResponse.Instance.NodeInfo.DryRun"));
		nodeInfo.setSchedulePaused(_ctx.booleanValue("GetPhysicalInstanceResponse.Instance.NodeInfo.SchedulePaused"));
		nodeInfo.setHasProd(_ctx.booleanValue("GetPhysicalInstanceResponse.Instance.NodeInfo.HasProd"));
		nodeInfo.setHasDev(_ctx.booleanValue("GetPhysicalInstanceResponse.Instance.NodeInfo.HasDev"));
		nodeInfo.setBizUnitName(_ctx.stringValue("GetPhysicalInstanceResponse.Instance.NodeInfo.BizUnitName"));
		nodeInfo.setCreateTime(_ctx.stringValue("GetPhysicalInstanceResponse.Instance.NodeInfo.CreateTime"));
		nodeInfo.setLastModifiedTime(_ctx.stringValue("GetPhysicalInstanceResponse.Instance.NodeInfo.LastModifiedTime"));

		List<String> priorityList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPhysicalInstanceResponse.Instance.NodeInfo.PriorityList.Length"); i++) {
			priorityList.add(_ctx.stringValue("GetPhysicalInstanceResponse.Instance.NodeInfo.PriorityList["+ i +"]"));
		}
		nodeInfo.setPriorityList(priorityList);

		List<String> resourceGroupList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPhysicalInstanceResponse.Instance.NodeInfo.ResourceGroupList.Length"); i++) {
			resourceGroupList.add(_ctx.stringValue("GetPhysicalInstanceResponse.Instance.NodeInfo.ResourceGroupList["+ i +"]"));
		}
		nodeInfo.setResourceGroupList(resourceGroupList);

		List<String> schedulePeriodList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPhysicalInstanceResponse.Instance.NodeInfo.SchedulePeriodList.Length"); i++) {
			schedulePeriodList.add(_ctx.stringValue("GetPhysicalInstanceResponse.Instance.NodeInfo.SchedulePeriodList["+ i +"]"));
		}
		nodeInfo.setSchedulePeriodList(schedulePeriodList);

		Creator creator = new Creator();
		creator.setId(_ctx.stringValue("GetPhysicalInstanceResponse.Instance.NodeInfo.Creator.Id"));
		creator.setName(_ctx.stringValue("GetPhysicalInstanceResponse.Instance.NodeInfo.Creator.Name"));
		nodeInfo.setCreator(creator);

		Modifier modifier = new Modifier();
		modifier.setId(_ctx.stringValue("GetPhysicalInstanceResponse.Instance.NodeInfo.Modifier.Id"));
		modifier.setName(_ctx.stringValue("GetPhysicalInstanceResponse.Instance.NodeInfo.Modifier.Name"));
		nodeInfo.setModifier(modifier);

		List<User> ownerList = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("GetPhysicalInstanceResponse.Instance.NodeInfo.OwnerList.Length"); i++) {
			User user = new User();
			user.setId(_ctx.stringValue("GetPhysicalInstanceResponse.Instance.NodeInfo.OwnerList["+ i +"].Id"));
			user.setName(_ctx.stringValue("GetPhysicalInstanceResponse.Instance.NodeInfo.OwnerList["+ i +"].Name"));

			ownerList.add(user);
		}
		nodeInfo.setOwnerList(ownerList);
		instance.setNodeInfo(nodeInfo);
		getPhysicalInstanceResponse.setInstance(instance);
	 
	 	return getPhysicalInstanceResponse;
	}
}