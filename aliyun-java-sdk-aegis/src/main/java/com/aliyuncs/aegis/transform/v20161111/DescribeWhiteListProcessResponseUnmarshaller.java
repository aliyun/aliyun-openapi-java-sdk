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

import com.aliyuncs.aegis.model.v20161111.DescribeWhiteListProcessResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeWhiteListProcessResponse.Process;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWhiteListProcessResponseUnmarshaller {

	public static DescribeWhiteListProcessResponse unmarshall(DescribeWhiteListProcessResponse describeWhiteListProcessResponse, UnmarshallerContext context) {
		
		describeWhiteListProcessResponse.setRequestId(context.stringValue("DescribeWhiteListProcessResponse.RequestId"));
		describeWhiteListProcessResponse.setCount(context.integerValue("DescribeWhiteListProcessResponse.Count"));
		describeWhiteListProcessResponse.setPageSize(context.integerValue("DescribeWhiteListProcessResponse.PageSize"));
		describeWhiteListProcessResponse.setTotalCount(context.integerValue("DescribeWhiteListProcessResponse.TotalCount"));
		describeWhiteListProcessResponse.setCurrentPage(context.integerValue("DescribeWhiteListProcessResponse.CurrentPage"));

		List<Process> processes = new ArrayList<Process>();
		for (int i = 0; i < context.lengthValue("DescribeWhiteListProcessResponse.Processes.Length"); i++) {
			Process process = new Process();
			process.setId(context.longValue("DescribeWhiteListProcessResponse.Processes["+ i +"].Id"));
			process.setProcessId(context.integerValue("DescribeWhiteListProcessResponse.Processes["+ i +"].ProcessId"));
			process.setProcessName(context.stringValue("DescribeWhiteListProcessResponse.Processes["+ i +"].ProcessName"));
			process.setFilePath(context.stringValue("DescribeWhiteListProcessResponse.Processes["+ i +"].FilePath"));
			process.setMd5(context.stringValue("DescribeWhiteListProcessResponse.Processes["+ i +"].Md5"));
			process.setLevel(context.integerValue("DescribeWhiteListProcessResponse.Processes["+ i +"].Level"));
			process.setProcessType(context.integerValue("DescribeWhiteListProcessResponse.Processes["+ i +"].ProcessType"));
			process.setStatus(context.integerValue("DescribeWhiteListProcessResponse.Processes["+ i +"].Status"));

			processes.add(process);
		}
		describeWhiteListProcessResponse.setProcesses(processes);
	 
	 	return describeWhiteListProcessResponse;
	}
}