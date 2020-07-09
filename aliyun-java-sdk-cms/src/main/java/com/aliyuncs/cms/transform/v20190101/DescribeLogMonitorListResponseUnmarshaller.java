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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeLogMonitorListResponse;
import com.aliyuncs.cms.model.v20190101.DescribeLogMonitorListResponse.LogMonitor;
import com.aliyuncs.cms.model.v20190101.DescribeLogMonitorListResponse.LogMonitor.ValueFilterObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLogMonitorListResponseUnmarshaller {

	public static DescribeLogMonitorListResponse unmarshall(DescribeLogMonitorListResponse describeLogMonitorListResponse, UnmarshallerContext _ctx) {
		
		describeLogMonitorListResponse.setRequestId(_ctx.stringValue("DescribeLogMonitorListResponse.RequestId"));
		describeLogMonitorListResponse.setCode(_ctx.stringValue("DescribeLogMonitorListResponse.Code"));
		describeLogMonitorListResponse.setMessage(_ctx.stringValue("DescribeLogMonitorListResponse.Message"));
		describeLogMonitorListResponse.setSuccess(_ctx.booleanValue("DescribeLogMonitorListResponse.Success"));
		describeLogMonitorListResponse.setTotal(_ctx.longValue("DescribeLogMonitorListResponse.Total"));
		describeLogMonitorListResponse.setPageNumber(_ctx.integerValue("DescribeLogMonitorListResponse.PageNumber"));
		describeLogMonitorListResponse.setPageSize(_ctx.integerValue("DescribeLogMonitorListResponse.PageSize"));

		List<LogMonitor> logMonitorList = new ArrayList<LogMonitor>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLogMonitorListResponse.LogMonitorList.Length"); i++) {
			LogMonitor logMonitor = new LogMonitor();
			logMonitor.setLogId(_ctx.longValue("DescribeLogMonitorListResponse.LogMonitorList["+ i +"].LogId"));
			logMonitor.setSlsRegionId(_ctx.stringValue("DescribeLogMonitorListResponse.LogMonitorList["+ i +"].SlsRegionId"));
			logMonitor.setSlsProject(_ctx.stringValue("DescribeLogMonitorListResponse.LogMonitorList["+ i +"].SlsProject"));
			logMonitor.setSlsLogstore(_ctx.stringValue("DescribeLogMonitorListResponse.LogMonitorList["+ i +"].SlsLogstore"));
			logMonitor.setMetricName(_ctx.stringValue("DescribeLogMonitorListResponse.LogMonitorList["+ i +"].MetricName"));
			logMonitor.setGmtCreate(_ctx.longValue("DescribeLogMonitorListResponse.LogMonitorList["+ i +"].GmtCreate"));
			logMonitor.setValueFilterRelation(_ctx.stringValue("DescribeLogMonitorListResponse.LogMonitorList["+ i +"].ValueFilterRelation"));
			logMonitor.setGroupId(_ctx.longValue("DescribeLogMonitorListResponse.LogMonitorList["+ i +"].GroupId"));

			List<ValueFilterObject> valueFilter = new ArrayList<ValueFilterObject>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLogMonitorListResponse.LogMonitorList["+ i +"].ValueFilter.Length"); j++) {
				ValueFilterObject valueFilterObject = new ValueFilterObject();
				valueFilterObject.setKey(_ctx.stringValue("DescribeLogMonitorListResponse.LogMonitorList["+ i +"].ValueFilter["+ j +"].Key"));
				valueFilterObject.setOperator(_ctx.stringValue("DescribeLogMonitorListResponse.LogMonitorList["+ i +"].ValueFilter["+ j +"].Operator"));
				valueFilterObject.setValue(_ctx.stringValue("DescribeLogMonitorListResponse.LogMonitorList["+ i +"].ValueFilter["+ j +"].Value"));

				valueFilter.add(valueFilterObject);
			}
			logMonitor.setValueFilter(valueFilter);

			logMonitorList.add(logMonitor);
		}
		describeLogMonitorListResponse.setLogMonitorList(logMonitorList);
	 
	 	return describeLogMonitorListResponse;
	}
}