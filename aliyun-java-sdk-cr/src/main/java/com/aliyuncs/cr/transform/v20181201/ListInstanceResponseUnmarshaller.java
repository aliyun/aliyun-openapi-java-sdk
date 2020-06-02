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

package com.aliyuncs.cr.transform.v20181201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cr.model.v20181201.ListInstanceResponse;
import com.aliyuncs.cr.model.v20181201.ListInstanceResponse.InstancesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceResponseUnmarshaller {

	public static ListInstanceResponse unmarshall(ListInstanceResponse listInstanceResponse, UnmarshallerContext _ctx) {
		
		listInstanceResponse.setRequestId(_ctx.stringValue("ListInstanceResponse.RequestId"));
		listInstanceResponse.setIsSuccess(_ctx.booleanValue("ListInstanceResponse.IsSuccess"));
		listInstanceResponse.setCode(_ctx.stringValue("ListInstanceResponse.Code"));
		listInstanceResponse.setPageNo(_ctx.integerValue("ListInstanceResponse.PageNo"));
		listInstanceResponse.setPageSize(_ctx.integerValue("ListInstanceResponse.PageSize"));
		listInstanceResponse.setTotalCount(_ctx.integerValue("ListInstanceResponse.TotalCount"));

		List<InstancesItem> instances = new ArrayList<InstancesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListInstanceResponse.Instances.Length"); i++) {
			InstancesItem instancesItem = new InstancesItem();
			instancesItem.setInstanceId(_ctx.stringValue("ListInstanceResponse.Instances["+ i +"].InstanceId"));
			instancesItem.setInstanceName(_ctx.stringValue("ListInstanceResponse.Instances["+ i +"].InstanceName"));
			instancesItem.setInstanceSpecification(_ctx.stringValue("ListInstanceResponse.Instances["+ i +"].InstanceSpecification"));
			instancesItem.setInstanceStatus(_ctx.stringValue("ListInstanceResponse.Instances["+ i +"].InstanceStatus"));
			instancesItem.setCreateTime(_ctx.stringValue("ListInstanceResponse.Instances["+ i +"].CreateTime"));
			instancesItem.setModifiedTime(_ctx.stringValue("ListInstanceResponse.Instances["+ i +"].ModifiedTime"));
			instancesItem.setRegionId(_ctx.stringValue("ListInstanceResponse.Instances["+ i +"].RegionId"));

			instances.add(instancesItem);
		}
		listInstanceResponse.setInstances(instances);
	 
	 	return listInstanceResponse;
	}
}