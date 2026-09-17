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

package com.aliyuncs.swas_open.transform.v20200601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas_open.model.v20200601.DescribeInvocationsResponse;
import com.aliyuncs.swas_open.model.v20200601.DescribeInvocationsResponse.Invocation;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInvocationsResponseUnmarshaller {

	public static DescribeInvocationsResponse unmarshall(DescribeInvocationsResponse describeInvocationsResponse, UnmarshallerContext _ctx) {
		
		describeInvocationsResponse.setRequestId(_ctx.stringValue("DescribeInvocationsResponse.RequestId"));
		describeInvocationsResponse.setTotalCount(_ctx.integerValue("DescribeInvocationsResponse.TotalCount"));
		describeInvocationsResponse.setPageSize(_ctx.integerValue("DescribeInvocationsResponse.PageSize"));
		describeInvocationsResponse.setPageNumber(_ctx.integerValue("DescribeInvocationsResponse.PageNumber"));

		List<Invocation> invocations = new ArrayList<Invocation>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInvocationsResponse.Invocations.Length"); i++) {
			Invocation invocation = new Invocation();
			invocation.setCommandContent(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].CommandContent"));
			invocation.setInvocationStatus(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvocationStatus"));
			invocation.setParameters(_ctx.mapValue("DescribeInvocationsResponse.Invocations["+ i +"].Parameters"));
			invocation.setInvokeStatus(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeStatus"));
			invocation.setCommandType(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].CommandType"));
			invocation.setCreationTime(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].CreationTime"));
			invocation.setCommandName(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].CommandName"));
			invocation.setInvokeId(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeId"));

			invocations.add(invocation);
		}
		describeInvocationsResponse.setInvocations(invocations);
	 
	 	return describeInvocationsResponse;
	}
}