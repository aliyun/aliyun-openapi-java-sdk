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

import com.aliyuncs.dataworks_public.model.v20200518.GetManualDagInstancesResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetManualDagInstancesResponse.InstancesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetManualDagInstancesResponseUnmarshaller {

	public static GetManualDagInstancesResponse unmarshall(GetManualDagInstancesResponse getManualDagInstancesResponse, UnmarshallerContext _ctx) {
		
		getManualDagInstancesResponse.setRequestId(_ctx.stringValue("GetManualDagInstancesResponse.RequestId"));

		List<InstancesItem> instances = new ArrayList<InstancesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetManualDagInstancesResponse.Instances.Length"); i++) {
			InstancesItem instancesItem = new InstancesItem();
			instancesItem.setNodeId(_ctx.longValue("GetManualDagInstancesResponse.Instances["+ i +"].NodeId"));
			instancesItem.setInstanceId(_ctx.longValue("GetManualDagInstancesResponse.Instances["+ i +"].InstanceId"));
			instancesItem.setDagId(_ctx.longValue("GetManualDagInstancesResponse.Instances["+ i +"].DagId"));
			instancesItem.setDagType(_ctx.stringValue("GetManualDagInstancesResponse.Instances["+ i +"].DagType"));
			instancesItem.setStatus(_ctx.stringValue("GetManualDagInstancesResponse.Instances["+ i +"].Status"));
			instancesItem.setBizDate(_ctx.longValue("GetManualDagInstancesResponse.Instances["+ i +"].BizDate"));
			instancesItem.setCycTime(_ctx.longValue("GetManualDagInstancesResponse.Instances["+ i +"].CycTime"));
			instancesItem.setCreateTime(_ctx.longValue("GetManualDagInstancesResponse.Instances["+ i +"].CreateTime"));
			instancesItem.setModifyTime(_ctx.longValue("GetManualDagInstancesResponse.Instances["+ i +"].ModifyTime"));
			instancesItem.setNodeName(_ctx.stringValue("GetManualDagInstancesResponse.Instances["+ i +"].NodeName"));
			instancesItem.setBeginWaitTimeTime(_ctx.longValue("GetManualDagInstancesResponse.Instances["+ i +"].BeginWaitTimeTime"));
			instancesItem.setBeginWaitResTime(_ctx.longValue("GetManualDagInstancesResponse.Instances["+ i +"].BeginWaitResTime"));
			instancesItem.setBeginRunningTime(_ctx.longValue("GetManualDagInstancesResponse.Instances["+ i +"].BeginRunningTime"));
			instancesItem.setParamValues(_ctx.stringValue("GetManualDagInstancesResponse.Instances["+ i +"].ParamValues"));
			instancesItem.setFinishTime(_ctx.longValue("GetManualDagInstancesResponse.Instances["+ i +"].FinishTime"));

			instances.add(instancesItem);
		}
		getManualDagInstancesResponse.setInstances(instances);
	 
	 	return getManualDagInstancesResponse;
	}
}