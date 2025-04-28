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

import com.aliyuncs.adb.model.v20190315.DescribeResubmitConfigResponse;
import com.aliyuncs.adb.model.v20190315.DescribeResubmitConfigResponse.RulesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResubmitConfigResponseUnmarshaller {

	public static DescribeResubmitConfigResponse unmarshall(DescribeResubmitConfigResponse describeResubmitConfigResponse, UnmarshallerContext _ctx) {
		
		describeResubmitConfigResponse.setRequestId(_ctx.stringValue("DescribeResubmitConfigResponse.RequestId"));
		describeResubmitConfigResponse.setDBClusterId(_ctx.stringValue("DescribeResubmitConfigResponse.DBClusterId"));

		List<RulesItem> rules = new ArrayList<RulesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResubmitConfigResponse.Rules.Length"); i++) {
			RulesItem rulesItem = new RulesItem();
			rulesItem.setPeakMemory(_ctx.stringValue("DescribeResubmitConfigResponse.Rules["+ i +"].PeakMemory"));
			rulesItem.setQueryTime(_ctx.stringValue("DescribeResubmitConfigResponse.Rules["+ i +"].QueryTime"));
			rulesItem.setTargetGroupName(_ctx.stringValue("DescribeResubmitConfigResponse.Rules["+ i +"].TargetGroupName"));
			rulesItem.setExceedMemoryException(_ctx.booleanValue("DescribeResubmitConfigResponse.Rules["+ i +"].ExceedMemoryException"));
			rulesItem.setGroupName(_ctx.stringValue("DescribeResubmitConfigResponse.Rules["+ i +"].GroupName"));

			rules.add(rulesItem);
		}
		describeResubmitConfigResponse.setRules(rules);
	 
	 	return describeResubmitConfigResponse;
	}
}