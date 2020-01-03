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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.ListInvocationStatusResponse;
import com.aliyuncs.ehpc.model.v20180412.ListInvocationStatusResponse.InvokeInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInvocationStatusResponseUnmarshaller {

	public static ListInvocationStatusResponse unmarshall(ListInvocationStatusResponse listInvocationStatusResponse, UnmarshallerContext _ctx) {
		
		listInvocationStatusResponse.setRequestId(_ctx.stringValue("ListInvocationStatusResponse.RequestId"));
		listInvocationStatusResponse.setCommandId(_ctx.stringValue("ListInvocationStatusResponse.CommandId"));
		listInvocationStatusResponse.setInvokeStatus(_ctx.stringValue("ListInvocationStatusResponse.InvokeStatus"));

		List<InvokeInstance> invokeInstances = new ArrayList<InvokeInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListInvocationStatusResponse.InvokeInstances.Length"); i++) {
			InvokeInstance invokeInstance = new InvokeInstance();
			invokeInstance.setInstanceId(_ctx.stringValue("ListInvocationStatusResponse.InvokeInstances["+ i +"].InstanceId"));
			invokeInstance.setInstanceInvokeStatus(_ctx.stringValue("ListInvocationStatusResponse.InvokeInstances["+ i +"].InstanceInvokeStatus"));

			invokeInstances.add(invokeInstance);
		}
		listInvocationStatusResponse.setInvokeInstances(invokeInstances);
	 
	 	return listInvocationStatusResponse;
	}
}