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

package com.aliyuncs.slb.transform.v20140515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.DescribeAccessLogsDownloadAttributeResponse;
import com.aliyuncs.slb.model.v20140515.DescribeAccessLogsDownloadAttributeResponse.LogsDownloadAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccessLogsDownloadAttributeResponseUnmarshaller {

	public static DescribeAccessLogsDownloadAttributeResponse unmarshall(DescribeAccessLogsDownloadAttributeResponse describeAccessLogsDownloadAttributeResponse, UnmarshallerContext _ctx) {
		
		describeAccessLogsDownloadAttributeResponse.setRequestId(_ctx.stringValue("DescribeAccessLogsDownloadAttributeResponse.RequestId"));
		describeAccessLogsDownloadAttributeResponse.setPageSize(_ctx.integerValue("DescribeAccessLogsDownloadAttributeResponse.PageSize"));
		describeAccessLogsDownloadAttributeResponse.setPageNumber(_ctx.integerValue("DescribeAccessLogsDownloadAttributeResponse.PageNumber"));
		describeAccessLogsDownloadAttributeResponse.setTotalCount(_ctx.integerValue("DescribeAccessLogsDownloadAttributeResponse.TotalCount"));
		describeAccessLogsDownloadAttributeResponse.setCount(_ctx.integerValue("DescribeAccessLogsDownloadAttributeResponse.Count"));

		List<LogsDownloadAttribute> logsDownloadAttributes = new ArrayList<LogsDownloadAttribute>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccessLogsDownloadAttributeResponse.LogsDownloadAttributes.Length"); i++) {
			LogsDownloadAttribute logsDownloadAttribute = new LogsDownloadAttribute();
			logsDownloadAttribute.setLogProject(_ctx.stringValue("DescribeAccessLogsDownloadAttributeResponse.LogsDownloadAttributes["+ i +"].LogProject"));
			logsDownloadAttribute.setRoleArn(_ctx.stringValue("DescribeAccessLogsDownloadAttributeResponse.LogsDownloadAttributes["+ i +"].RoleArn"));
			logsDownloadAttribute.setLogStore(_ctx.stringValue("DescribeAccessLogsDownloadAttributeResponse.LogsDownloadAttributes["+ i +"].LogStore"));
			logsDownloadAttribute.setLoadBalancerId(_ctx.stringValue("DescribeAccessLogsDownloadAttributeResponse.LogsDownloadAttributes["+ i +"].LoadBalancerId"));
			logsDownloadAttribute.setRegion(_ctx.stringValue("DescribeAccessLogsDownloadAttributeResponse.LogsDownloadAttributes["+ i +"].Region"));
			logsDownloadAttribute.setLogType(_ctx.stringValue("DescribeAccessLogsDownloadAttributeResponse.LogsDownloadAttributes["+ i +"].LogType"));

			logsDownloadAttributes.add(logsDownloadAttribute);
		}
		describeAccessLogsDownloadAttributeResponse.setLogsDownloadAttributes(logsDownloadAttributes);
	 
	 	return describeAccessLogsDownloadAttributeResponse;
	}
}