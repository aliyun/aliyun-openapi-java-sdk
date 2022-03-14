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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.ListInstancesOfInternalResponse;
import com.aliyuncs.ccc.model.v20170705.ListInstancesOfInternalResponse.BriefInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesOfInternalResponseUnmarshaller {

	public static ListInstancesOfInternalResponse unmarshall(ListInstancesOfInternalResponse listInstancesOfInternalResponse, UnmarshallerContext _ctx) {
		
		listInstancesOfInternalResponse.setRequestId(_ctx.stringValue("ListInstancesOfInternalResponse.RequestId"));
		listInstancesOfInternalResponse.setHttpStatusCode(_ctx.integerValue("ListInstancesOfInternalResponse.HttpStatusCode"));
		listInstancesOfInternalResponse.setCode(_ctx.stringValue("ListInstancesOfInternalResponse.Code"));
		listInstancesOfInternalResponse.setMessage(_ctx.stringValue("ListInstancesOfInternalResponse.Message"));
		listInstancesOfInternalResponse.setSuccess(_ctx.booleanValue("ListInstancesOfInternalResponse.Success"));

		List<BriefInstance> instances = new ArrayList<BriefInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesOfInternalResponse.Instances.Length"); i++) {
			BriefInstance briefInstance = new BriefInstance();
			briefInstance.setAliyunUid(_ctx.stringValue("ListInstancesOfInternalResponse.Instances["+ i +"].AliyunUid"));
			briefInstance.setTenantId(_ctx.stringValue("ListInstancesOfInternalResponse.Instances["+ i +"].TenantId"));
			briefInstance.setInstanceId(_ctx.stringValue("ListInstancesOfInternalResponse.Instances["+ i +"].InstanceId"));
			briefInstance.setInstanceName(_ctx.stringValue("ListInstancesOfInternalResponse.Instances["+ i +"].InstanceName"));
			briefInstance.setStatus(_ctx.stringValue("ListInstancesOfInternalResponse.Instances["+ i +"].Status"));
			briefInstance.setConsoleUrl(_ctx.stringValue("ListInstancesOfInternalResponse.Instances["+ i +"].ConsoleUrl"));
			briefInstance.setMaxStorageTtl(_ctx.integerValue("ListInstancesOfInternalResponse.Instances["+ i +"].MaxStorageTtl"));
			briefInstance.setMaxStorageSize(_ctx.integerValue("ListInstancesOfInternalResponse.Instances["+ i +"].MaxStorageSize"));

			instances.add(briefInstance);
		}
		listInstancesOfInternalResponse.setInstances(instances);
	 
	 	return listInstancesOfInternalResponse;
	}
}