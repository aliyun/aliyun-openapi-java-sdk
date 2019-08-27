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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.DescribeFlowNodeInstanceContainerLogResponse;
import com.aliyuncs.emr.model.v20160408.DescribeFlowNodeInstanceContainerLogResponse.LogEntry;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFlowNodeInstanceContainerLogResponseUnmarshaller {

	public static DescribeFlowNodeInstanceContainerLogResponse unmarshall(DescribeFlowNodeInstanceContainerLogResponse describeFlowNodeInstanceContainerLogResponse, UnmarshallerContext _ctx) {
		
		describeFlowNodeInstanceContainerLogResponse.setRequestId(_ctx.stringValue("DescribeFlowNodeInstanceContainerLogResponse.RequestId"));
		describeFlowNodeInstanceContainerLogResponse.setLogEnd(_ctx.booleanValue("DescribeFlowNodeInstanceContainerLogResponse.LogEnd"));

		List<LogEntry> logEntrys = new ArrayList<LogEntry>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFlowNodeInstanceContainerLogResponse.LogEntrys.Length"); i++) {
			LogEntry logEntry = new LogEntry();
			logEntry.setContent(_ctx.stringValue("DescribeFlowNodeInstanceContainerLogResponse.LogEntrys["+ i +"].Content"));

			logEntrys.add(logEntry);
		}
		describeFlowNodeInstanceContainerLogResponse.setLogEntrys(logEntrys);
	 
	 	return describeFlowNodeInstanceContainerLogResponse;
	}
}