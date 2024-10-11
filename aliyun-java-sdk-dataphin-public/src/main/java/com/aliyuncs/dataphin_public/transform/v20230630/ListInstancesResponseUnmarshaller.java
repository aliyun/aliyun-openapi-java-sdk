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

import com.aliyuncs.dataphin_public.model.v20230630.ListInstancesResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListInstancesResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListInstancesResponse.PageResult.Instance;
import com.aliyuncs.dataphin_public.model.v20230630.ListInstancesResponse.PageResult.Instance.NodeInfo;
import com.aliyuncs.dataphin_public.model.v20230630.ListInstancesResponse.PageResult.Instance.NodeInfo.Creator;
import com.aliyuncs.dataphin_public.model.v20230630.ListInstancesResponse.PageResult.Instance.NodeInfo.Modifier;
import com.aliyuncs.dataphin_public.model.v20230630.ListInstancesResponse.PageResult.Instance.NodeInfo.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesResponseUnmarshaller {

	public static ListInstancesResponse unmarshall(ListInstancesResponse listInstancesResponse, UnmarshallerContext _ctx) {
		
		listInstancesResponse.setRequestId(_ctx.stringValue("ListInstancesResponse.RequestId"));
		listInstancesResponse.setSuccess(_ctx.booleanValue("ListInstancesResponse.Success"));
		listInstancesResponse.setHttpStatusCode(_ctx.integerValue("ListInstancesResponse.HttpStatusCode"));
		listInstancesResponse.setCode(_ctx.stringValue("ListInstancesResponse.Code"));
		listInstancesResponse.setMessage(_ctx.stringValue("ListInstancesResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.integerValue("ListInstancesResponse.PageResult.TotalCount"));

		List<Instance> data = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesResponse.PageResult.Data.Length"); i++) {
			Instance instance = new Instance();
			instance.setId(_ctx.stringValue("ListInstancesResponse.PageResult.Data["+ i +"].Id"));
			instance.setBizDate(_ctx.stringValue("ListInstancesResponse.PageResult.Data["+ i +"].BizDate"));
			instance.setDueTime(_ctx.stringValue("ListInstancesResponse.PageResult.Data["+ i +"].DueTime"));
			instance.setStartExecuteTime(_ctx.longValue("ListInstancesResponse.PageResult.Data["+ i +"].StartExecuteTime"));
			instance.setEndExecuteTime(_ctx.longValue("ListInstancesResponse.PageResult.Data["+ i +"].EndExecuteTime"));
			instance.setDuration(_ctx.stringValue("ListInstancesResponse.PageResult.Data["+ i +"].Duration"));
			instance.setIndex(_ctx.integerValue("ListInstancesResponse.PageResult.Data["+ i +"].Index"));
			instance.setExtendInfo(_ctx.stringValue("ListInstancesResponse.PageResult.Data["+ i +"].ExtendInfo"));

			List<String> statusList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListInstancesResponse.PageResult.Data["+ i +"].StatusList.Length"); j++) {
				statusList.add(_ctx.stringValue("ListInstancesResponse.PageResult.Data["+ i +"].StatusList["+ j +"]"));
			}
			instance.setStatusList(statusList);

			NodeInfo nodeInfo = new NodeInfo();
			nodeInfo.setId(_ctx.stringValue("ListInstancesResponse.PageResult.Data["+ i +"].NodeInfo.Id"));
			nodeInfo.setFrom(_ctx.stringValue("ListInstancesResponse.PageResult.Data["+ i +"].NodeInfo.From"));
			nodeInfo.setType(_ctx.stringValue("ListInstancesResponse.PageResult.Data["+ i +"].NodeInfo.Type"));
			nodeInfo.setName(_ctx.stringValue("ListInstancesResponse.PageResult.Data["+ i +"].NodeInfo.Name"));
			nodeInfo.setSubDetailType(_ctx.stringValue("ListInstancesResponse.PageResult.Data["+ i +"].NodeInfo.SubDetailType"));
			nodeInfo.setDescription(_ctx.stringValue("ListInstancesResponse.PageResult.Data["+ i +"].NodeInfo.Description"));
			nodeInfo.setDryRun(_ctx.booleanValue("ListInstancesResponse.PageResult.Data["+ i +"].NodeInfo.DryRun"));
			nodeInfo.setSchedulePaused(_ctx.booleanValue("ListInstancesResponse.PageResult.Data["+ i +"].NodeInfo.SchedulePaused"));
			nodeInfo.setHasProd(_ctx.booleanValue("ListInstancesResponse.PageResult.Data["+ i +"].NodeInfo.HasProd"));
			nodeInfo.setHasDev(_ctx.booleanValue("ListInstancesResponse.PageResult.Data["+ i +"].NodeInfo.HasDev"));
			nodeInfo.setBizUnitName(_ctx.stringValue("ListInstancesResponse.PageResult.Data["+ i +"].NodeInfo.BizUnitName"));
			nodeInfo.setCreateTime(_ctx.stringValue("ListInstancesResponse.PageResult.Data["+ i +"].NodeInfo.CreateTime"));
			nodeInfo.setLastModifiedTime(_ctx.stringValue("ListInstancesResponse.PageResult.Data["+ i +"].NodeInfo.LastModifiedTime"));

			List<String> priorityList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListInstancesResponse.PageResult.Data["+ i +"].NodeInfo.PriorityList.Length"); j++) {
				priorityList.add(_ctx.stringValue("ListInstancesResponse.PageResult.Data["+ i +"].NodeInfo.PriorityList["+ j +"]"));
			}
			nodeInfo.setPriorityList(priorityList);

			List<String> resourceGroupList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListInstancesResponse.PageResult.Data["+ i +"].NodeInfo.ResourceGroupList.Length"); j++) {
				resourceGroupList.add(_ctx.stringValue("ListInstancesResponse.PageResult.Data["+ i +"].NodeInfo.ResourceGroupList["+ j +"]"));
			}
			nodeInfo.setResourceGroupList(resourceGroupList);

			List<String> schedulePeriodList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListInstancesResponse.PageResult.Data["+ i +"].NodeInfo.SchedulePeriodList.Length"); j++) {
				schedulePeriodList.add(_ctx.stringValue("ListInstancesResponse.PageResult.Data["+ i +"].NodeInfo.SchedulePeriodList["+ j +"]"));
			}
			nodeInfo.setSchedulePeriodList(schedulePeriodList);

			Creator creator = new Creator();
			creator.setId(_ctx.stringValue("ListInstancesResponse.PageResult.Data["+ i +"].NodeInfo.Creator.Id"));
			creator.setName(_ctx.stringValue("ListInstancesResponse.PageResult.Data["+ i +"].NodeInfo.Creator.Name"));
			nodeInfo.setCreator(creator);

			Modifier modifier = new Modifier();
			modifier.setId(_ctx.stringValue("ListInstancesResponse.PageResult.Data["+ i +"].NodeInfo.Modifier.Id"));
			modifier.setName(_ctx.stringValue("ListInstancesResponse.PageResult.Data["+ i +"].NodeInfo.Modifier.Name"));
			nodeInfo.setModifier(modifier);

			List<User> ownerList = new ArrayList<User>();
			for (int j = 0; j < _ctx.lengthValue("ListInstancesResponse.PageResult.Data["+ i +"].NodeInfo.OwnerList.Length"); j++) {
				User user = new User();
				user.setId(_ctx.stringValue("ListInstancesResponse.PageResult.Data["+ i +"].NodeInfo.OwnerList["+ j +"].Id"));
				user.setName(_ctx.stringValue("ListInstancesResponse.PageResult.Data["+ i +"].NodeInfo.OwnerList["+ j +"].Name"));

				ownerList.add(user);
			}
			nodeInfo.setOwnerList(ownerList);
			instance.setNodeInfo(nodeInfo);

			data.add(instance);
		}
		pageResult.setData(data);
		listInstancesResponse.setPageResult(pageResult);
	 
	 	return listInstancesResponse;
	}
}