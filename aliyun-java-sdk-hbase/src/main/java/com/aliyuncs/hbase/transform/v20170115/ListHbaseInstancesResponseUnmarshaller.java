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

package com.aliyuncs.hbase.transform.v20170115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20170115.ListHbaseInstancesResponse;
import com.aliyuncs.hbase.model.v20170115.ListHbaseInstancesResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHbaseInstancesResponseUnmarshaller {

	public static ListHbaseInstancesResponse unmarshall(ListHbaseInstancesResponse listHbaseInstancesResponse, UnmarshallerContext context) {
		
		listHbaseInstancesResponse.setRequestId(context.stringValue("ListHbaseInstancesResponse.RequestId"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < context.lengthValue("ListHbaseInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(context.stringValue("ListHbaseInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setInstanceName(context.stringValue("ListHbaseInstancesResponse.Instances["+ i +"].InstanceName"));
			instance.setIsDefault(context.booleanValue("ListHbaseInstancesResponse.Instances["+ i +"].IsDefault"));

			instances.add(instance);
		}
		listHbaseInstancesResponse.setInstances(instances);
	 
	 	return listHbaseInstancesResponse;
	}
}