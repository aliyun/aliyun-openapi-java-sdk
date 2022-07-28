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

package com.aliyuncs.eas.transform.v20210701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eas.model.v20210701.ListResourceInstancesResponse;
import com.aliyuncs.eas.model.v20210701.ListResourceInstancesResponse.InstancesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourceInstancesResponseUnmarshaller {

	public static ListResourceInstancesResponse unmarshall(ListResourceInstancesResponse listResourceInstancesResponse, UnmarshallerContext _ctx) {
		
		listResourceInstancesResponse.setRequestId(_ctx.stringValue("ListResourceInstancesResponse.RequestId"));
		listResourceInstancesResponse.setPageNumber(_ctx.integerValue("ListResourceInstancesResponse.PageNumber"));
		listResourceInstancesResponse.setPageSize(_ctx.integerValue("ListResourceInstancesResponse.PageSize"));
		listResourceInstancesResponse.setTotalCount(_ctx.integerValue("ListResourceInstancesResponse.TotalCount"));

		List<InstancesItem> instances = new ArrayList<InstancesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListResourceInstancesResponse.Instances.Length"); i++) {
			InstancesItem instancesItem = new InstancesItem();
			instancesItem.setInstanceId(_ctx.stringValue("ListResourceInstancesResponse.Instances["+ i +"].InstanceId"));
			instancesItem.setInstanceName(_ctx.stringValue("ListResourceInstancesResponse.Instances["+ i +"].InstanceName"));
			instancesItem.setInstanceIp(_ctx.stringValue("ListResourceInstancesResponse.Instances["+ i +"].InstanceIp"));
			instancesItem.setInstanceStatus(_ctx.stringValue("ListResourceInstancesResponse.Instances["+ i +"].InstanceStatus"));
			instancesItem.setInstanceCpuCount(_ctx.integerValue("ListResourceInstancesResponse.Instances["+ i +"].InstanceCpuCount"));
			instancesItem.setInstanceGpuCount(_ctx.integerValue("ListResourceInstancesResponse.Instances["+ i +"].InstanceGpuCount"));
			instancesItem.setInstanceMemory(_ctx.stringValue("ListResourceInstancesResponse.Instances["+ i +"].InstanceMemory"));
			instancesItem.setInstanceUsedCpu(_ctx.floatValue("ListResourceInstancesResponse.Instances["+ i +"].InstanceUsedCpu"));
			instancesItem.setInstanceUsedGpu(_ctx.integerValue("ListResourceInstancesResponse.Instances["+ i +"].InstanceUsedGpu"));
			instancesItem.setInstanceUsedMemory(_ctx.stringValue("ListResourceInstancesResponse.Instances["+ i +"].InstanceUsedMemory"));
			instancesItem.setInstanceType(_ctx.stringValue("ListResourceInstancesResponse.Instances["+ i +"].InstanceType"));
			instancesItem.setCreateTime(_ctx.stringValue("ListResourceInstancesResponse.Instances["+ i +"].CreateTime"));
			instancesItem.setChargeType(_ctx.stringValue("ListResourceInstancesResponse.Instances["+ i +"].ChargeType"));
			instancesItem.setExpiredTime(_ctx.stringValue("ListResourceInstancesResponse.Instances["+ i +"].ExpiredTime"));
			instancesItem.setAutoRenewal(_ctx.booleanValue("ListResourceInstancesResponse.Instances["+ i +"].AutoRenewal"));

			instances.add(instancesItem);
		}
		listResourceInstancesResponse.setInstances(instances);
	 
	 	return listResourceInstancesResponse;
	}
}