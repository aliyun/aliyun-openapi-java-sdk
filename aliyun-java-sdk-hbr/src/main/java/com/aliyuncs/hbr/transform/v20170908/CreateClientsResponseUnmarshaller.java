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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.CreateClientsResponse;
import com.aliyuncs.hbr.model.v20170908.CreateClientsResponse.InstanceStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateClientsResponseUnmarshaller {

	public static CreateClientsResponse unmarshall(CreateClientsResponse createClientsResponse, UnmarshallerContext _ctx) {
		
		createClientsResponse.setRequestId(_ctx.stringValue("CreateClientsResponse.RequestId"));
		createClientsResponse.setSuccess(_ctx.booleanValue("CreateClientsResponse.Success"));
		createClientsResponse.setCode(_ctx.stringValue("CreateClientsResponse.Code"));
		createClientsResponse.setMessage(_ctx.stringValue("CreateClientsResponse.Message"));
		createClientsResponse.setTaskId(_ctx.stringValue("CreateClientsResponse.TaskId"));

		List<InstanceStatus> instanceStatuses = new ArrayList<InstanceStatus>();
		for (int i = 0; i < _ctx.lengthValue("CreateClientsResponse.InstanceStatuses.Length"); i++) {
			InstanceStatus instanceStatus = new InstanceStatus();
			instanceStatus.setInstanceId(_ctx.stringValue("CreateClientsResponse.InstanceStatuses["+ i +"].InstanceId"));
			instanceStatus.setValidInstance(_ctx.booleanValue("CreateClientsResponse.InstanceStatuses["+ i +"].ValidInstance"));

			instanceStatuses.add(instanceStatus);
		}
		createClientsResponse.setInstanceStatuses(instanceStatuses);
	 
	 	return createClientsResponse;
	}
}