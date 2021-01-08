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

import com.aliyuncs.cms.model.v20190101.DescribeAlertLogCountResponse;
import com.aliyuncs.cms.model.v20190101.DescribeAlertLogCountResponse.AlertLogCountItem;
import com.aliyuncs.cms.model.v20190101.DescribeAlertLogCountResponse.AlertLogCountItem.LogsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlertLogCountResponseUnmarshaller {

	public static DescribeAlertLogCountResponse unmarshall(DescribeAlertLogCountResponse describeAlertLogCountResponse, UnmarshallerContext _ctx) {
		
		describeAlertLogCountResponse.setRequestId(_ctx.stringValue("DescribeAlertLogCountResponse.RequestId"));
		describeAlertLogCountResponse.setCode(_ctx.stringValue("DescribeAlertLogCountResponse.Code"));
		describeAlertLogCountResponse.setMessage(_ctx.stringValue("DescribeAlertLogCountResponse.Message"));
		describeAlertLogCountResponse.setSuccess(_ctx.booleanValue("DescribeAlertLogCountResponse.Success"));

		List<AlertLogCountItem> alertLogCount = new ArrayList<AlertLogCountItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAlertLogCountResponse.AlertLogCount.Length"); i++) {
			AlertLogCountItem alertLogCountItem = new AlertLogCountItem();
			alertLogCountItem.setCount(_ctx.integerValue("DescribeAlertLogCountResponse.AlertLogCount["+ i +"].Count"));

			List<LogsItem> logs = new ArrayList<LogsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertLogCountResponse.AlertLogCount["+ i +"].Logs.Length"); j++) {
				LogsItem logsItem = new LogsItem();
				logsItem.setName(_ctx.stringValue("DescribeAlertLogCountResponse.AlertLogCount["+ i +"].Logs["+ j +"].Name"));
				logsItem.setValue(_ctx.stringValue("DescribeAlertLogCountResponse.AlertLogCount["+ i +"].Logs["+ j +"].Value"));

				logs.add(logsItem);
			}
			alertLogCountItem.setLogs(logs);

			alertLogCount.add(alertLogCountItem);
		}
		describeAlertLogCountResponse.setAlertLogCount(alertLogCount);
	 
	 	return describeAlertLogCountResponse;
	}
}