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

import com.aliyuncs.dataworks_public.model.v20200518.ListManualDagInstancesResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListManualDagInstancesResponse.InstancesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListManualDagInstancesResponseUnmarshaller {

	public static ListManualDagInstancesResponse unmarshall(ListManualDagInstancesResponse listManualDagInstancesResponse, UnmarshallerContext _ctx) {
		
		listManualDagInstancesResponse.setRequestId(_ctx.stringValue("ListManualDagInstancesResponse.RequestId"));

		List<InstancesItem> instances = new ArrayList<InstancesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListManualDagInstancesResponse.Instances.Length"); i++) {
			InstancesItem instancesItem = new InstancesItem();
			instancesItem.setNodeId(_ctx.longValue("ListManualDagInstancesResponse.Instances["+ i +"].NodeId"));
			instancesItem.setInstanceId(_ctx.longValue("ListManualDagInstancesResponse.Instances["+ i +"].InstanceId"));
			instancesItem.setDagId(_ctx.longValue("ListManualDagInstancesResponse.Instances["+ i +"].DagId"));
			instancesItem.setDagType(_ctx.stringValue("ListManualDagInstancesResponse.Instances["+ i +"].DagType"));
			instancesItem.setStatus(_ctx.stringValue("ListManualDagInstancesResponse.Instances["+ i +"].Status"));
			instancesItem.setBizDate(_ctx.longValue("ListManualDagInstancesResponse.Instances["+ i +"].BizDate"));
			instancesItem.setCycTime(_ctx.longValue("ListManualDagInstancesResponse.Instances["+ i +"].CycTime"));
			instancesItem.setCreateTime(_ctx.longValue("ListManualDagInstancesResponse.Instances["+ i +"].CreateTime"));
			instancesItem.setModifyTime(_ctx.longValue("ListManualDagInstancesResponse.Instances["+ i +"].ModifyTime"));
			instancesItem.setNodeName(_ctx.stringValue("ListManualDagInstancesResponse.Instances["+ i +"].NodeName"));
			instancesItem.setBeginWaitTimeTime(_ctx.longValue("ListManualDagInstancesResponse.Instances["+ i +"].BeginWaitTimeTime"));
			instancesItem.setBeginWaitResTime(_ctx.longValue("ListManualDagInstancesResponse.Instances["+ i +"].BeginWaitResTime"));
			instancesItem.setBeginRunningTime(_ctx.longValue("ListManualDagInstancesResponse.Instances["+ i +"].BeginRunningTime"));
			instancesItem.setParamValues(_ctx.stringValue("ListManualDagInstancesResponse.Instances["+ i +"].ParamValues"));
			instancesItem.setFinishTime(_ctx.longValue("ListManualDagInstancesResponse.Instances["+ i +"].FinishTime"));
			instancesItem.setTaskType(_ctx.stringValue("ListManualDagInstancesResponse.Instances["+ i +"].TaskType"));

			instances.add(instancesItem);
		}
		listManualDagInstancesResponse.setInstances(instances);
	 
	 	return listManualDagInstancesResponse;
	}
}