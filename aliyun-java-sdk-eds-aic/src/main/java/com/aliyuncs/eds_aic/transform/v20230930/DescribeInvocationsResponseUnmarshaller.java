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

package com.aliyuncs.eds_aic.transform.v20230930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_aic.model.v20230930.DescribeInvocationsResponse;
import com.aliyuncs.eds_aic.model.v20230930.DescribeInvocationsResponse.InvocationModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInvocationsResponseUnmarshaller {

	public static DescribeInvocationsResponse unmarshall(DescribeInvocationsResponse describeInvocationsResponse, UnmarshallerContext _ctx) {
		
		describeInvocationsResponse.setRequestId(_ctx.stringValue("DescribeInvocationsResponse.RequestId"));
		describeInvocationsResponse.setTotalCount(_ctx.stringValue("DescribeInvocationsResponse.TotalCount"));

		List<InvocationModel> data = new ArrayList<InvocationModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInvocationsResponse.Data.Length"); i++) {
			InvocationModel invocationModel = new InvocationModel();
			invocationModel.setInvocationId(_ctx.stringValue("DescribeInvocationsResponse.Data["+ i +"].InvocationId"));
			invocationModel.setStartTime(_ctx.stringValue("DescribeInvocationsResponse.Data["+ i +"].StartTime"));
			invocationModel.setFinishTime(_ctx.stringValue("DescribeInvocationsResponse.Data["+ i +"].FinishTime"));
			invocationModel.setOutput(_ctx.stringValue("DescribeInvocationsResponse.Data["+ i +"].Output"));
			invocationModel.setInstanceId(_ctx.stringValue("DescribeInvocationsResponse.Data["+ i +"].InstanceId"));
			invocationModel.setInvocationStatus(_ctx.stringValue("DescribeInvocationsResponse.Data["+ i +"].InvocationStatus"));

			data.add(invocationModel);
		}
		describeInvocationsResponse.setData(data);
	 
	 	return describeInvocationsResponse;
	}
}