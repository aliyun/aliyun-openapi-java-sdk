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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeAgentInstallStatusResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeAgentInstallStatusResponse.AegisClientInvokeStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAgentInstallStatusResponseUnmarshaller {

	public static DescribeAgentInstallStatusResponse unmarshall(DescribeAgentInstallStatusResponse describeAgentInstallStatusResponse, UnmarshallerContext context) {
		
		describeAgentInstallStatusResponse.setRequestId(context.stringValue("DescribeAgentInstallStatusResponse.RequestId"));

		List<AegisClientInvokeStatusResponse> aegisClientInvokeStatusResponseList = new ArrayList<AegisClientInvokeStatusResponse>();
		for (int i = 0; i < context.lengthValue("DescribeAgentInstallStatusResponse.AegisClientInvokeStatusResponseList.Length"); i++) {
			AegisClientInvokeStatusResponse aegisClientInvokeStatusResponse = new AegisClientInvokeStatusResponse();
			aegisClientInvokeStatusResponse.setUuid(context.stringValue("DescribeAgentInstallStatusResponse.AegisClientInvokeStatusResponseList["+ i +"].Uuid"));
			aegisClientInvokeStatusResponse.setMessage(context.stringValue("DescribeAgentInstallStatusResponse.AegisClientInvokeStatusResponseList["+ i +"].Message"));
			aegisClientInvokeStatusResponse.setResult(context.integerValue("DescribeAgentInstallStatusResponse.AegisClientInvokeStatusResponseList["+ i +"].Result"));

			aegisClientInvokeStatusResponseList.add(aegisClientInvokeStatusResponse);
		}
		describeAgentInstallStatusResponse.setAegisClientInvokeStatusResponseList(aegisClientInvokeStatusResponseList);
	 
	 	return describeAgentInstallStatusResponse;
	}
}