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

import com.aliyuncs.eiam.model.v20211201.ListInstancesResponse;
import com.aliyuncs.eiam.model.v20211201.ListInstancesResponse.Instance;
import com.aliyuncs.eiam.model.v20211201.ListInstancesResponse.Instance.DefaultEndpoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesResponseUnmarshaller {

	public static ListInstancesResponse unmarshall(ListInstancesResponse listInstancesResponse, UnmarshallerContext _ctx) {
		
		listInstancesResponse.setRequestId(_ctx.stringValue("ListInstancesResponse.RequestId"));
		listInstancesResponse.setTotalCount(_ctx.longValue("ListInstancesResponse.TotalCount"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setCreateTime(_ctx.longValue("ListInstancesResponse.Instances["+ i +"].CreateTime"));
			instance.setStatus(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Status"));
			instance.setDescription(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Description"));

			DefaultEndpoint defaultEndpoint = new DefaultEndpoint();
			defaultEndpoint.setEndpoint(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].DefaultEndpoint.Endpoint"));
			defaultEndpoint.setStatus(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].DefaultEndpoint.Status"));
			instance.setDefaultEndpoint(defaultEndpoint);

			instances.add(instance);
		}
		listInstancesResponse.setInstances(instances);
	 
	 	return listInstancesResponse;
	}
}