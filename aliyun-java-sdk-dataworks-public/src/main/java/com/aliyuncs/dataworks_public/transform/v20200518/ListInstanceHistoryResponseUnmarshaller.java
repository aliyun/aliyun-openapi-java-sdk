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

import com.aliyuncs.dataworks_public.model.v20200518.ListInstanceHistoryResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListInstanceHistoryResponse.InstancesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceHistoryResponseUnmarshaller {

	public static ListInstanceHistoryResponse unmarshall(ListInstanceHistoryResponse listInstanceHistoryResponse, UnmarshallerContext _ctx) {
		
		listInstanceHistoryResponse.setRequestId(_ctx.stringValue("ListInstanceHistoryResponse.RequestId"));
		listInstanceHistoryResponse.setSuccess(_ctx.booleanValue("ListInstanceHistoryResponse.Success"));

		List<InstancesItem> instances = new ArrayList<InstancesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListInstanceHistoryResponse.Instances.Length"); i++) {
			InstancesItem instancesItem = new InstancesItem();
			instancesItem.setStatus(_ctx.stringValue("ListInstanceHistoryResponse.Instances["+ i +"].Status"));
			instancesItem.setCycTime(_ctx.longValue("ListInstanceHistoryResponse.Instances["+ i +"].CycTime"));
			instancesItem.setBeginRunningTime(_ctx.longValue("ListInstanceHistoryResponse.Instances["+ i +"].BeginRunningTime"));
			instancesItem.setFinishTime(_ctx.longValue("ListInstanceHistoryResponse.Instances["+ i +"].FinishTime"));
			instancesItem.setErrorMessage(_ctx.stringValue("ListInstanceHistoryResponse.Instances["+ i +"].ErrorMessage"));
			instancesItem.setCreateTime(_ctx.longValue("ListInstanceHistoryResponse.Instances["+ i +"].CreateTime"));
			instancesItem.setDagId(_ctx.longValue("ListInstanceHistoryResponse.Instances["+ i +"].DagId"));
			instancesItem.setTaskType(_ctx.stringValue("ListInstanceHistoryResponse.Instances["+ i +"].TaskType"));
			instancesItem.setDagType(_ctx.stringValue("ListInstanceHistoryResponse.Instances["+ i +"].DagType"));
			instancesItem.setModifyTime(_ctx.longValue("ListInstanceHistoryResponse.Instances["+ i +"].ModifyTime"));
			instancesItem.setInstanceId(_ctx.longValue("ListInstanceHistoryResponse.Instances["+ i +"].InstanceId"));
			instancesItem.setBeginWaitResTime(_ctx.longValue("ListInstanceHistoryResponse.Instances["+ i +"].BeginWaitResTime"));
			instancesItem.setBizdate(_ctx.longValue("ListInstanceHistoryResponse.Instances["+ i +"].Bizdate"));
			instancesItem.setNodeName(_ctx.stringValue("ListInstanceHistoryResponse.Instances["+ i +"].NodeName"));
			instancesItem.setBeginWaitTimeTime(_ctx.longValue("ListInstanceHistoryResponse.Instances["+ i +"].BeginWaitTimeTime"));
			instancesItem.setNodeId(_ctx.longValue("ListInstanceHistoryResponse.Instances["+ i +"].NodeId"));
			instancesItem.setInstanceHistoryId(_ctx.longValue("ListInstanceHistoryResponse.Instances["+ i +"].InstanceHistoryId"));

			instances.add(instancesItem);
		}
		listInstanceHistoryResponse.setInstances(instances);
	 
	 	return listInstanceHistoryResponse;
	}
}