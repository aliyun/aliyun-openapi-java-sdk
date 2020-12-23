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

package com.aliyuncs.hbase.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20190101.ListHBaseInstancesResponse;
import com.aliyuncs.hbase.model.v20190101.ListHBaseInstancesResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHBaseInstancesResponseUnmarshaller {

	public static ListHBaseInstancesResponse unmarshall(ListHBaseInstancesResponse listHBaseInstancesResponse, UnmarshallerContext _ctx) {
		
		listHBaseInstancesResponse.setRequestId(_ctx.stringValue("ListHBaseInstancesResponse.RequestId"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("ListHBaseInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(_ctx.stringValue("ListHBaseInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setInstanceName(_ctx.stringValue("ListHBaseInstancesResponse.Instances["+ i +"].InstanceName"));
			instance.setIsDefault(_ctx.booleanValue("ListHBaseInstancesResponse.Instances["+ i +"].IsDefault"));

			instances.add(instance);
		}
		listHBaseInstancesResponse.setInstances(instances);
	 
	 	return listHBaseInstancesResponse;
	}
}