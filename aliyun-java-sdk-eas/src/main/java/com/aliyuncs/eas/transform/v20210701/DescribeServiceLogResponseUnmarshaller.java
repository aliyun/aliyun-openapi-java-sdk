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

package com.aliyuncs.eas.transform.v20210701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eas.model.v20210701.DescribeServiceLogResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServiceLogResponseUnmarshaller {

	public static DescribeServiceLogResponse unmarshall(DescribeServiceLogResponse describeServiceLogResponse, UnmarshallerContext _ctx) {
		
		describeServiceLogResponse.setRequestId(_ctx.stringValue("DescribeServiceLogResponse.RequestId"));
		describeServiceLogResponse.setPageNum(_ctx.longValue("DescribeServiceLogResponse.PageNum"));
		describeServiceLogResponse.setTotalCount(_ctx.longValue("DescribeServiceLogResponse.TotalCount"));
		describeServiceLogResponse.setTotalPageNum(_ctx.longValue("DescribeServiceLogResponse.TotalPageNum"));

		List<String> logs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeServiceLogResponse.Logs.Length"); i++) {
			logs.add(_ctx.stringValue("DescribeServiceLogResponse.Logs["+ i +"]"));
		}
		describeServiceLogResponse.setLogs(logs);
	 
	 	return describeServiceLogResponse;
	}
}