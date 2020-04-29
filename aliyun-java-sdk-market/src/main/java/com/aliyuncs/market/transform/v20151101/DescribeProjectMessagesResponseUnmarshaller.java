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

package com.aliyuncs.market.transform.v20151101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.market.model.v20151101.DescribeProjectMessagesResponse;
import com.aliyuncs.market.model.v20151101.DescribeProjectMessagesResponse.ProjectMessage;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProjectMessagesResponseUnmarshaller {

	public static DescribeProjectMessagesResponse unmarshall(DescribeProjectMessagesResponse describeProjectMessagesResponse, UnmarshallerContext _ctx) {
		
		describeProjectMessagesResponse.setRequestId(_ctx.stringValue("DescribeProjectMessagesResponse.RequestId"));
		describeProjectMessagesResponse.setSuccess(_ctx.booleanValue("DescribeProjectMessagesResponse.Success"));

		List<ProjectMessage> result = new ArrayList<ProjectMessage>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProjectMessagesResponse.Result.Length"); i++) {
			ProjectMessage projectMessage = new ProjectMessage();
			projectMessage.setOperatorRole(_ctx.stringValue("DescribeProjectMessagesResponse.Result["+ i +"].OperatorRole"));
			projectMessage.setOperator(_ctx.longValue("DescribeProjectMessagesResponse.Result["+ i +"].Operator"));
			projectMessage.setOperatorName(_ctx.stringValue("DescribeProjectMessagesResponse.Result["+ i +"].OperatorName"));
			projectMessage.setContent(_ctx.stringValue("DescribeProjectMessagesResponse.Result["+ i +"].Content"));
			projectMessage.setGmtCreate(_ctx.longValue("DescribeProjectMessagesResponse.Result["+ i +"].GmtCreate"));

			result.add(projectMessage);
		}
		describeProjectMessagesResponse.setResult(result);
	 
	 	return describeProjectMessagesResponse;
	}
}