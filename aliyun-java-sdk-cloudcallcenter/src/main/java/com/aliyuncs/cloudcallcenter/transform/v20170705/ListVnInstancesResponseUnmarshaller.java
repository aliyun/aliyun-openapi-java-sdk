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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ListVnInstancesResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListVnInstancesResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVnInstancesResponseUnmarshaller {

	public static ListVnInstancesResponse unmarshall(ListVnInstancesResponse listVnInstancesResponse, UnmarshallerContext context) {
		
		listVnInstancesResponse.setRequestId(context.stringValue("ListVnInstancesResponse.RequestId"));
		listVnInstancesResponse.setTotalCount(context.integerValue("ListVnInstancesResponse.TotalCount"));
		listVnInstancesResponse.setPageNumber(context.integerValue("ListVnInstancesResponse.PageNumber"));
		listVnInstancesResponse.setPageSize(context.integerValue("ListVnInstancesResponse.PageSize"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < context.lengthValue("ListVnInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(context.stringValue("ListVnInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setName(context.stringValue("ListVnInstancesResponse.Instances["+ i +"].Name"));
			instance.setDescription(context.stringValue("ListVnInstancesResponse.Instances["+ i +"].Description"));
			instance.setStatus(context.stringValue("ListVnInstancesResponse.Instances["+ i +"].Status"));
			instance.setConcurrency(context.longValue("ListVnInstancesResponse.Instances["+ i +"].Concurrency"));
			instance.setModifyTime(context.longValue("ListVnInstancesResponse.Instances["+ i +"].ModifyTime"));
			instance.setModifyUserName(context.stringValue("ListVnInstancesResponse.Instances["+ i +"].ModifyUserName"));
			instance.setNluServiceType(context.stringValue("ListVnInstancesResponse.Instances["+ i +"].NluServiceType"));

			List<String> applicableOperations = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListVnInstancesResponse.Instances["+ i +"].ApplicableOperations.Length"); j++) {
				applicableOperations.add(context.stringValue("ListVnInstancesResponse.Instances["+ i +"].ApplicableOperations["+ j +"]"));
			}
			instance.setApplicableOperations(applicableOperations);

			instances.add(instance);
		}
		listVnInstancesResponse.setInstances(instances);
	 
	 	return listVnInstancesResponse;
	}
}