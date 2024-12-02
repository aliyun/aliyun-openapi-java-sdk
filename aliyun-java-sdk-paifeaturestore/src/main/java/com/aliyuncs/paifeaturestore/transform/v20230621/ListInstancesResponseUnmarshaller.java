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

package com.aliyuncs.paifeaturestore.transform.v20230621;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paifeaturestore.model.v20230621.ListInstancesResponse;
import com.aliyuncs.paifeaturestore.model.v20230621.ListInstancesResponse.InstancesItem;
import com.aliyuncs.paifeaturestore.model.v20230621.ListInstancesResponse.InstancesItem.FeatureDBInstanceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesResponseUnmarshaller {

	public static ListInstancesResponse unmarshall(ListInstancesResponse listInstancesResponse, UnmarshallerContext _ctx) {
		
		listInstancesResponse.setRequestId(_ctx.stringValue("ListInstancesResponse.RequestId"));
		listInstancesResponse.setTotalCount(_ctx.longValue("ListInstancesResponse.TotalCount"));

		List<InstancesItem> instances = new ArrayList<InstancesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesResponse.Instances.Length"); i++) {
			InstancesItem instancesItem = new InstancesItem();
			instancesItem.setInstanceId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceId"));
			instancesItem.setType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Type"));
			instancesItem.setStatus(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Status"));
			instancesItem.setRegionId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].RegionId"));
			instancesItem.setGmtCreateTime(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].GmtCreateTime"));
			instancesItem.setGmtModifiedTime(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].GmtModifiedTime"));

			FeatureDBInstanceInfo featureDBInstanceInfo = new FeatureDBInstanceInfo();
			featureDBInstanceInfo.setStatus(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].FeatureDBInstanceInfo.Status"));
			instancesItem.setFeatureDBInstanceInfo(featureDBInstanceInfo);

			instances.add(instancesItem);
		}
		listInstancesResponse.setInstances(instances);
	 
	 	return listInstancesResponse;
	}
}