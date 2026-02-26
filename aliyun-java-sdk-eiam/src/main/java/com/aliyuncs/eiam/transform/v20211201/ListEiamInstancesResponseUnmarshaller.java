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

package com.aliyuncs.eiam.transform.v20211201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.ListEiamInstancesResponse;
import com.aliyuncs.eiam.model.v20211201.ListEiamInstancesResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEiamInstancesResponseUnmarshaller {

	public static ListEiamInstancesResponse unmarshall(ListEiamInstancesResponse listEiamInstancesResponse, UnmarshallerContext _ctx) {
		
		listEiamInstancesResponse.setRequestId(_ctx.stringValue("ListEiamInstancesResponse.RequestId"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("ListEiamInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setDescription(_ctx.stringValue("ListEiamInstancesResponse.Instances["+ i +"].Description"));
			instance.setInstanceId(_ctx.stringValue("ListEiamInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setStartTime(_ctx.longValue("ListEiamInstancesResponse.Instances["+ i +"].StartTime"));
			instance.setSSODomain(_ctx.stringValue("ListEiamInstancesResponse.Instances["+ i +"].SSODomain"));
			instance.setDeveloperAPIPrivateDomain(_ctx.stringValue("ListEiamInstancesResponse.Instances["+ i +"].DeveloperAPIPrivateDomain"));
			instance.setDeveloperAPIPublicDomain(_ctx.stringValue("ListEiamInstancesResponse.Instances["+ i +"].DeveloperAPIPublicDomain"));
			instance.setOpenAPIPrivateDomain(_ctx.stringValue("ListEiamInstancesResponse.Instances["+ i +"].OpenAPIPrivateDomain"));
			instance.setOpenAPIPublicDomain(_ctx.stringValue("ListEiamInstancesResponse.Instances["+ i +"].OpenAPIPublicDomain"));
			instance.setInstanceStatus(_ctx.stringValue("ListEiamInstancesResponse.Instances["+ i +"].InstanceStatus"));
			instance.setInstanceVersion(_ctx.stringValue("ListEiamInstancesResponse.Instances["+ i +"].InstanceVersion"));

			instances.add(instance);
		}
		listEiamInstancesResponse.setInstances(instances);
	 
	 	return listEiamInstancesResponse;
	}
}