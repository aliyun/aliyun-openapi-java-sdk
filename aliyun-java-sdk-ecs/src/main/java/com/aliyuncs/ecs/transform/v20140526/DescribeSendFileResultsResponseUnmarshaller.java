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
import com.aliyuncs.ecs.model.v20140526.DescribeSendFileResultsResponse.Invocation.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSendFileResultsResponseUnmarshaller {

	public static DescribeSendFileResultsResponse unmarshall(DescribeSendFileResultsResponse describeSendFileResultsResponse, UnmarshallerContext _ctx) {
		
		describeSendFileResultsResponse.setRequestId(_ctx.stringValue("DescribeSendFileResultsResponse.RequestId"));
		describeSendFileResultsResponse.setTotalCount(_ctx.longValue("DescribeSendFileResultsResponse.TotalCount"));
		describeSendFileResultsResponse.setPageSize(_ctx.longValue("DescribeSendFileResultsResponse.PageSize"));
		describeSendFileResultsResponse.setNextToken(_ctx.stringValue("DescribeSendFileResultsResponse.NextToken"));
		describeSendFileResultsResponse.setPageNumber(_ctx.longValue("DescribeSendFileResultsResponse.PageNumber"));

		List<Invocation> invocations = new ArrayList<Invocation>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSendFileResultsResponse.Invocations.Length"); i++) {
			Invocation invocation = new Invocation();
			invocation.setFileMode(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].FileMode"));
			invocation.setInvocationStatus(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].InvocationStatus"));
			invocation.setOverwrite(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].Overwrite"));
			invocation.setDescription(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].Description"));
			invocation.setContentType(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].ContentType"));
			invocation.setVmCount(_ctx.integerValue("DescribeSendFileResultsResponse.Invocations["+ i +"].VmCount"));
			invocation.setTargetDir(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].TargetDir"));
			invocation.setFileGroup(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].FileGroup"));
			invocation.setFileOwner(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].FileOwner"));
			invocation.setName(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].Name"));
			invocation.setContent(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].Content"));
			invocation.setCreationTime(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].CreationTime"));
			invocation.setInvokeId(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].InvokeId"));

			List<InvokeInstance> invokeInstances = new ArrayList<InvokeInstance>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSendFileResultsResponse.Invocations["+ i +"].InvokeInstances.Length"); j++) {
				InvokeInstance invokeInstance = new InvokeInstance();
				invokeInstance.setInvocationStatus(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].InvocationStatus"));
				invokeInstance.setFinishTime(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].FinishTime"));
				invokeInstance.setInstanceId(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].InstanceId"));
				invokeInstance.setErrorInfo(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].ErrorInfo"));
				invokeInstance.setCreationTime(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].CreationTime"));
				invokeInstance.setStartTime(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].StartTime"));
				invokeInstance.setUpdateTime(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].UpdateTime"));
				invokeInstance.setErrorCode(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].ErrorCode"));

				invokeInstances.add(invokeInstance);
			}
			invocation.setInvokeInstances(invokeInstances);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSendFileResultsResponse.Invocations["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeSendFileResultsResponse.Invocations["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			invocation.setTags(tags);

			invocations.add(invocation);
		}
		describeSendFileResultsResponse.setInvocations(invocations);
	 
	 	return describeSendFileResultsResponse;
	}
}