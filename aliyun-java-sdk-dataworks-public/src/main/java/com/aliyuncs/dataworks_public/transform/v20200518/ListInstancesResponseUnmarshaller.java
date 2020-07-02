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

import com.aliyuncs.dataworks_public.model.v20200518.ListInstancesResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListInstancesResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListInstancesResponse.Data.InstancesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesResponseUnmarshaller {

	public static ListInstancesResponse unmarshall(ListInstancesResponse listInstancesResponse, UnmarshallerContext _ctx) {
		
		listInstancesResponse.setRequestId(_ctx.stringValue("ListInstancesResponse.RequestId"));
		listInstancesResponse.setSuccess(_ctx.booleanValue("ListInstancesResponse.Success"));
		listInstancesResponse.setHttpStatusCode(_ctx.integerValue("ListInstancesResponse.HttpStatusCode"));
		listInstancesResponse.setErrorCode(_ctx.stringValue("ListInstancesResponse.ErrorCode"));
		listInstancesResponse.setErrorMessage(_ctx.stringValue("ListInstancesResponse.ErrorMessage"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListInstancesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListInstancesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListInstancesResponse.Data.TotalCount"));

		List<InstancesItem> instances = new ArrayList<InstancesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesResponse.Data.Instances.Length"); i++) {
			InstancesItem instancesItem = new InstancesItem();
			instancesItem.setNodeId(_ctx.integerValue("ListInstancesResponse.Data.Instances["+ i +"].NodeId"));
			instancesItem.setInstanceId(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].InstanceId"));
			instancesItem.setDagId(_ctx.integerValue("ListInstancesResponse.Data.Instances["+ i +"].DagId"));
			instancesItem.setDagType(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].DagType"));
			instancesItem.setStatus(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].Status"));
			instancesItem.setBizdate(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].Bizdate"));
			instancesItem.setCycTime(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].CycTime"));
			instancesItem.setCreateTime(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].CreateTime"));
			instancesItem.setModifyTime(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].ModifyTime"));
			instancesItem.setNodeName(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].NodeName"));
			instancesItem.setBeginWaitTimeTime(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].BeginWaitTimeTime"));
			instancesItem.setBeginWaitResTime(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].BeginWaitResTime"));
			instancesItem.setBeginRunningTime(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].BeginRunningTime"));
			instancesItem.setParamValues(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].ParamValues"));
			instancesItem.setFinishTime(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].FinishTime"));

			instances.add(instancesItem);
		}
		data.setInstances(instances);
		listInstancesResponse.setData(data);
	 
	 	return listInstancesResponse;
	}
}