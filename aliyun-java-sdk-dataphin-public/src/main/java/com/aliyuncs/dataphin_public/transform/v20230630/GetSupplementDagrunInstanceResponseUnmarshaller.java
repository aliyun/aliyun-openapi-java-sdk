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

import com.aliyuncs.dataphin_public.model.v20230630.GetSupplementDagrunInstanceResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetSupplementDagrunInstanceResponse.Instance;
import com.aliyuncs.dataphin_public.model.v20230630.GetSupplementDagrunInstanceResponse.Instance.NodeInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetSupplementDagrunInstanceResponse.Instance.NodeInfo.Creator;
import com.aliyuncs.dataphin_public.model.v20230630.GetSupplementDagrunInstanceResponse.Instance.NodeInfo.Modifier;
import com.aliyuncs.dataphin_public.model.v20230630.GetSupplementDagrunInstanceResponse.Instance.NodeInfo.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSupplementDagrunInstanceResponseUnmarshaller {

	public static GetSupplementDagrunInstanceResponse unmarshall(GetSupplementDagrunInstanceResponse getSupplementDagrunInstanceResponse, UnmarshallerContext _ctx) {
		
		getSupplementDagrunInstanceResponse.setRequestId(_ctx.stringValue("GetSupplementDagrunInstanceResponse.RequestId"));
		getSupplementDagrunInstanceResponse.setSuccess(_ctx.booleanValue("GetSupplementDagrunInstanceResponse.Success"));
		getSupplementDagrunInstanceResponse.setHttpStatusCode(_ctx.integerValue("GetSupplementDagrunInstanceResponse.HttpStatusCode"));
		getSupplementDagrunInstanceResponse.setCode(_ctx.stringValue("GetSupplementDagrunInstanceResponse.Code"));
		getSupplementDagrunInstanceResponse.setMessage(_ctx.stringValue("GetSupplementDagrunInstanceResponse.Message"));

		List<Instance> instanceList = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("GetSupplementDagrunInstanceResponse.InstanceList.Length"); i++) {
			Instance instance = new Instance();
			instance.setId(_ctx.stringValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].Id"));
			instance.setType(_ctx.stringValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].Type"));
			instance.setBizDate(_ctx.longValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].BizDate"));
			instance.setDueTime(_ctx.longValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].DueTime"));
			instance.setStartExecuteTime(_ctx.longValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].StartExecuteTime"));
			instance.setEndExecuteTime(_ctx.longValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].EndExecuteTime"));
			instance.setDuration(_ctx.stringValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].Duration"));
			instance.setIndex(_ctx.integerValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].Index"));
			instance.setExtendInfo(_ctx.stringValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].ExtendInfo"));

			List<String> statusList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].StatusList.Length"); j++) {
				statusList.add(_ctx.stringValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].StatusList["+ j +"]"));
			}
			instance.setStatusList(statusList);

			NodeInfo nodeInfo = new NodeInfo();
			nodeInfo.setId(_ctx.stringValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].NodeInfo.Id"));
			nodeInfo.setName(_ctx.stringValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].NodeInfo.Name"));
			nodeInfo.setType(_ctx.stringValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].NodeInfo.Type"));
			nodeInfo.setFrom(_ctx.stringValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].NodeInfo.From"));
			nodeInfo.setSubDetailType(_ctx.stringValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].NodeInfo.SubDetailType"));
			nodeInfo.setDescription(_ctx.stringValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].NodeInfo.Description"));
			nodeInfo.setDryRun(_ctx.booleanValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].NodeInfo.DryRun"));
			nodeInfo.setSchedulePaused(_ctx.booleanValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].NodeInfo.SchedulePaused"));
			nodeInfo.setHasProd(_ctx.booleanValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].NodeInfo.HasProd"));
			nodeInfo.setHasDev(_ctx.booleanValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].NodeInfo.HasDev"));
			nodeInfo.setBizUnitName(_ctx.stringValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].NodeInfo.BizUnitName"));
			nodeInfo.setCreateTime(_ctx.stringValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].NodeInfo.CreateTime"));
			nodeInfo.setLastModifiedTime(_ctx.stringValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].NodeInfo.LastModifiedTime"));

			List<String> resourceGroupList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].NodeInfo.ResourceGroupList.Length"); j++) {
				resourceGroupList.add(_ctx.stringValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].NodeInfo.ResourceGroupList["+ j +"]"));
			}
			nodeInfo.setResourceGroupList(resourceGroupList);

			List<String> priorityList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].NodeInfo.PriorityList.Length"); j++) {
				priorityList.add(_ctx.stringValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].NodeInfo.PriorityList["+ j +"]"));
			}
			nodeInfo.setPriorityList(priorityList);

			List<String> schedulePeriodList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].NodeInfo.SchedulePeriodList.Length"); j++) {
				schedulePeriodList.add(_ctx.stringValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].NodeInfo.SchedulePeriodList["+ j +"]"));
			}
			nodeInfo.setSchedulePeriodList(schedulePeriodList);

			Creator creator = new Creator();
			creator.setId(_ctx.stringValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].NodeInfo.Creator.Id"));
			creator.setName(_ctx.stringValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].NodeInfo.Creator.Name"));
			nodeInfo.setCreator(creator);

			Modifier modifier = new Modifier();
			modifier.setId(_ctx.stringValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].NodeInfo.Modifier.Id"));
			modifier.setName(_ctx.stringValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].NodeInfo.Modifier.Name"));
			nodeInfo.setModifier(modifier);

			List<User> ownerList = new ArrayList<User>();
			for (int j = 0; j < _ctx.lengthValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].NodeInfo.OwnerList.Length"); j++) {
				User user = new User();
				user.setId(_ctx.stringValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].NodeInfo.OwnerList["+ j +"].Id"));
				user.setName(_ctx.stringValue("GetSupplementDagrunInstanceResponse.InstanceList["+ i +"].NodeInfo.OwnerList["+ j +"].Name"));

				ownerList.add(user);
			}
			nodeInfo.setOwnerList(ownerList);
			instance.setNodeInfo(nodeInfo);

			instanceList.add(instance);
		}
		getSupplementDagrunInstanceResponse.setInstanceList(instanceList);
	 
	 	return getSupplementDagrunInstanceResponse;
	}
}