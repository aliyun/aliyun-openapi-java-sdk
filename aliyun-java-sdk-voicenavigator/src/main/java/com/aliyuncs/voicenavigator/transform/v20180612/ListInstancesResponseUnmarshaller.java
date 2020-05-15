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

package com.aliyuncs.voicenavigator.transform.v20180612;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.voicenavigator.model.v20180612.ListInstancesResponse;
import com.aliyuncs.voicenavigator.model.v20180612.ListInstancesResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesResponseUnmarshaller {

	public static ListInstancesResponse unmarshall(ListInstancesResponse listInstancesResponse, UnmarshallerContext _ctx) {
		
		listInstancesResponse.setRequestId(_ctx.stringValue("ListInstancesResponse.RequestId"));
		listInstancesResponse.setTotalCount(_ctx.integerValue("ListInstancesResponse.TotalCount"));
		listInstancesResponse.setPageNumber(_ctx.integerValue("ListInstancesResponse.PageNumber"));
		listInstancesResponse.setPageSize(_ctx.integerValue("ListInstancesResponse.PageSize"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setName(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Name"));
			instance.setDescription(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Description"));
			instance.setStatus(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Status"));
			instance.setConcurrency(_ctx.longValue("ListInstancesResponse.Instances["+ i +"].Concurrency"));
			instance.setModifyTime(_ctx.longValue("ListInstancesResponse.Instances["+ i +"].ModifyTime"));
			instance.setModifyUserName(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ModifyUserName"));
			instance.setNluServiceType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].NluServiceType"));

			List<String> applicableOperations = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListInstancesResponse.Instances["+ i +"].ApplicableOperations.Length"); j++) {
				applicableOperations.add(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ApplicableOperations["+ j +"]"));
			}
			instance.setApplicableOperations(applicableOperations);

			instances.add(instance);
		}
		listInstancesResponse.setInstances(instances);
	 
	 	return listInstancesResponse;
	}
}