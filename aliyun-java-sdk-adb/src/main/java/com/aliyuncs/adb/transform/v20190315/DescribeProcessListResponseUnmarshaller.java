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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeProcessListResponse;
import com.aliyuncs.adb.model.v20190315.DescribeProcessListResponse.Process;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProcessListResponseUnmarshaller {

	public static DescribeProcessListResponse unmarshall(DescribeProcessListResponse describeProcessListResponse, UnmarshallerContext _ctx) {
		
		describeProcessListResponse.setRequestId(_ctx.stringValue("DescribeProcessListResponse.RequestId"));
		describeProcessListResponse.setTotalCount(_ctx.stringValue("DescribeProcessListResponse.TotalCount"));
		describeProcessListResponse.setPageNumber(_ctx.stringValue("DescribeProcessListResponse.PageNumber"));
		describeProcessListResponse.setPageSize(_ctx.stringValue("DescribeProcessListResponse.PageSize"));

		List<Process> items = new ArrayList<Process>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProcessListResponse.Items.Length"); i++) {
			Process process = new Process();
			process.setId(_ctx.integerValue("DescribeProcessListResponse.Items["+ i +"].Id"));
			process.setProcessId(_ctx.stringValue("DescribeProcessListResponse.Items["+ i +"].ProcessId"));
			process.setUser(_ctx.stringValue("DescribeProcessListResponse.Items["+ i +"].User"));
			process.setHost(_ctx.stringValue("DescribeProcessListResponse.Items["+ i +"].Host"));
			process.setDB(_ctx.stringValue("DescribeProcessListResponse.Items["+ i +"].DB"));
			process.setCommand(_ctx.stringValue("DescribeProcessListResponse.Items["+ i +"].Command"));
			process.setTime(_ctx.integerValue("DescribeProcessListResponse.Items["+ i +"].Time"));
			process.setStartTime(_ctx.stringValue("DescribeProcessListResponse.Items["+ i +"].StartTime"));
			process.setInfo(_ctx.stringValue("DescribeProcessListResponse.Items["+ i +"].Info"));

			items.add(process);
		}
		describeProcessListResponse.setItems(items);
	 
	 	return describeProcessListResponse;
	}
}