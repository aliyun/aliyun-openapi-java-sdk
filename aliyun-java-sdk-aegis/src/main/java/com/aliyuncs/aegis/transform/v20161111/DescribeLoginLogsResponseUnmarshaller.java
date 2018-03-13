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

import com.aliyuncs.aegis.model.v20161111.DescribeLoginLogsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoginLogsResponseUnmarshaller {

	public static DescribeLoginLogsResponse unmarshall(DescribeLoginLogsResponse describeLoginLogsResponse, UnmarshallerContext context) {
		
		describeLoginLogsResponse.setRequestId(context.stringValue("DescribeLoginLogsResponse.RequestId"));
		describeLoginLogsResponse.setPageSize(context.integerValue("DescribeLoginLogsResponse.PageSize"));
		describeLoginLogsResponse.setCurrentPage(context.integerValue("DescribeLoginLogsResponse.CurrentPage"));
		describeLoginLogsResponse.setTotalCount(context.integerValue("DescribeLoginLogsResponse.TotalCount"));
		describeLoginLogsResponse.setHttpStatusCode(context.integerValue("DescribeLoginLogsResponse.HttpStatusCode"));

		List<String> loginLogs = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeLoginLogsResponse.LoginLogs.Length"); i++) {
			loginLogs.add(context.stringValue("DescribeLoginLogsResponse.LoginLogs["+ i +"]"));
		}
		describeLoginLogsResponse.setLoginLogs(loginLogs);
	 
	 	return describeLoginLogsResponse;
	}
}