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

package com.aliyuncs.swas_open.transform.v20200601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas_open.model.v20200601.ListInstancesResponse;
import com.aliyuncs.swas_open.model.v20200601.ListInstancesResponse.InstancesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesResponseUnmarshaller {

	public static ListInstancesResponse unmarshall(ListInstancesResponse listInstancesResponse, UnmarshallerContext _ctx) {
		
		listInstancesResponse.setRequestId(_ctx.stringValue("ListInstancesResponse.RequestId"));

		List<InstancesItem> instances = new ArrayList<InstancesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesResponse.Instances.Length"); i++) {
			InstancesItem instancesItem = new InstancesItem();
			instancesItem.setInstanceId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceId"));
			instancesItem.setInstanceName(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceName"));
			instancesItem.setCreationTime(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].CreationTime"));
			instancesItem.setExpiredTime(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ExpiredTime"));
			instancesItem.setChargeType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ChargeType"));
			instancesItem.setPublicIpAddress(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].PublicIpAddress"));
			instancesItem.setInnerIpAddress(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InnerIpAddress"));
			instancesItem.setRegionId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].RegionId"));
			instancesItem.setStatus(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Status"));
			instancesItem.setDdosStatus(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].DdosStatus"));
			instancesItem.setImageId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ImageId"));
			instancesItem.setPlanId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].PlanId"));
			instancesItem.setBusinessStatus(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].BusinessStatus"));

			instances.add(instancesItem);
		}
		listInstancesResponse.setInstances(instances);
	 
	 	return listInstancesResponse;
	}
}