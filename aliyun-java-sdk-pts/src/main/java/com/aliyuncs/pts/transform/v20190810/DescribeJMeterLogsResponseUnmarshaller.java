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

package com.aliyuncs.pts.transform.v20190810;

import com.aliyuncs.pts.model.v20190810.DescribeJMeterLogsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJMeterLogsResponseUnmarshaller {

	public static DescribeJMeterLogsResponse unmarshall(DescribeJMeterLogsResponse describeJMeterLogsResponse, UnmarshallerContext _ctx) {
		
		describeJMeterLogsResponse.setRequestId(_ctx.stringValue("DescribeJMeterLogsResponse.RequestId"));
		describeJMeterLogsResponse.setCode(_ctx.stringValue("DescribeJMeterLogsResponse.Code"));
		describeJMeterLogsResponse.setMessage(_ctx.stringValue("DescribeJMeterLogsResponse.Message"));
		describeJMeterLogsResponse.setSuccess(_ctx.booleanValue("DescribeJMeterLogsResponse.Success"));
		describeJMeterLogsResponse.setPageNumber(_ctx.integerValue("DescribeJMeterLogsResponse.PageNumber"));
		describeJMeterLogsResponse.setPageSize(_ctx.integerValue("DescribeJMeterLogsResponse.PageSize"));
		describeJMeterLogsResponse.setTotalCount(_ctx.longValue("DescribeJMeterLogsResponse.TotalCount"));
		describeJMeterLogsResponse.setLogs(_ctx.stringValue("DescribeJMeterLogsResponse.Logs"));
	 
	 	return describeJMeterLogsResponse;
	}
}