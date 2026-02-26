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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiQpsDataResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiQpsDataResponse.MonitorItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApiQpsDataResponseUnmarshaller {

	public static DescribeApiQpsDataResponse unmarshall(DescribeApiQpsDataResponse describeApiQpsDataResponse, UnmarshallerContext _ctx) {
		
		describeApiQpsDataResponse.setRequestId(_ctx.stringValue("DescribeApiQpsDataResponse.RequestId"));

		List<MonitorItem> callSuccesses = new ArrayList<MonitorItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiQpsDataResponse.CallSuccesses.Length"); i++) {
			MonitorItem monitorItem = new MonitorItem();
			monitorItem.setItemValue(_ctx.stringValue("DescribeApiQpsDataResponse.CallSuccesses["+ i +"].ItemValue"));
			monitorItem.setItemTime(_ctx.stringValue("DescribeApiQpsDataResponse.CallSuccesses["+ i +"].ItemTime"));

			callSuccesses.add(monitorItem);
		}
		describeApiQpsDataResponse.setCallSuccesses(callSuccesses);

		List<MonitorItem> callFails = new ArrayList<MonitorItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiQpsDataResponse.CallFails.Length"); i++) {
			MonitorItem monitorItem1 = new MonitorItem();
			monitorItem1.setItemValue(_ctx.stringValue("DescribeApiQpsDataResponse.CallFails["+ i +"].ItemValue"));
			monitorItem1.setItemTime(_ctx.stringValue("DescribeApiQpsDataResponse.CallFails["+ i +"].ItemTime"));

			callFails.add(monitorItem1);
		}
		describeApiQpsDataResponse.setCallFails(callFails);
	 
	 	return describeApiQpsDataResponse;
	}
}