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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeSendFileResultsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeSendFileResultsResponse.Invocation;
import com.aliyuncs.ecs.model.v20140526.DescribeSendFileResultsResponse.Invocation.InvokeInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSendFileResultsResponseUnmarshaller {

	public static DescribeSendFileResultsResponse unmarshall(DescribeSendFileResultsResponse describeSendFileResultsResponse, UnmarshallerContext _ctx) {
		
		describeSendFileResultsResponse.setRequestId(_ctx.stringValue("DescribeSendFileResultsResponse.RequestId"));
		describeSendFileResultsResponse.setTotalCount(_ctx.longValue("DescribeSendFileResultsResponse.TotalCount"));
		describeSendFileResultsResponse.setPageNumber(_ctx.longValue("DescribeSendFileResultsResponse.PageNumber"));
		describeSendFileResultsResponse.setPageSize(_ctx.longValue("DescribeSendFileResultsResponse.PageSize"));

		List<Invocation> invocations = new ArrayList<Invocation>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSendFileResultsResponse.Invocations.Length"); i++) {
			Invocation invocation = new Invocation();
			invocation.setInvokeId(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].InvokeId"));
			invocation.setName(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].Name"));
			invocation.setDescription(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].Description"));
			invocation.setTargetDir(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].TargetDir"));
			invocation.setContentType(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].ContentType"));
			invocation.setContent(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].Content"));
			invocation.setFileOwner(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].FileOwner"));
			invocation.setFileGroup(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].FileGroup"));
			invocation.setFileMode(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].FileMode"));
			invocation.setOverwrite(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].Overwrite"));
			invocation.setVmCount(_ctx.integerValue("DescribeSendFileResultsResponse.Invocations["+ i +"].VmCount"));
			invocation.setCreationTime(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].CreationTime"));
			invocation.setInvocationStatus(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].InvocationStatus"));

			List<InvokeInstance> invokeInstances = new ArrayList<InvokeInstance>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSendFileResultsResponse.Invocations["+ i +"].InvokeInstances.Length"); j++) {
				InvokeInstance invokeInstance = new InvokeInstance();
				invokeInstance.setInstanceId(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].InstanceId"));
				invokeInstance.setInvocationStatus(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].InvocationStatus"));
				invokeInstance.setCreationTime(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].CreationTime"));
				invokeInstance.setStartTime(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].StartTime"));
				invokeInstance.setFinishTime(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].FinishTime"));
				invokeInstance.setUpdateTime(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].UpdateTime"));
				invokeInstance.setErrorCode(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].ErrorCode"));
				invokeInstance.setErrorInfo(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].ErrorInfo"));

				invokeInstances.add(invokeInstance);
			}
			invocation.setInvokeInstances(invokeInstances);

			invocations.add(invocation);
		}
		describeSendFileResultsResponse.setInvocations(invocations);
	 
	 	return describeSendFileResultsResponse;
	}
}