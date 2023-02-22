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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.DescribeEventLevelCountResponse;
import com.aliyuncs.sas.model.v20181203.DescribeEventLevelCountResponse.EventLevels;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEventLevelCountResponseUnmarshaller {

	public static DescribeEventLevelCountResponse unmarshall(DescribeEventLevelCountResponse describeEventLevelCountResponse, UnmarshallerContext _ctx) {
		
		describeEventLevelCountResponse.setRequestId(_ctx.stringValue("DescribeEventLevelCountResponse.RequestId"));
		describeEventLevelCountResponse.setSuccess(_ctx.booleanValue("DescribeEventLevelCountResponse.Success"));
		describeEventLevelCountResponse.setCode(_ctx.stringValue("DescribeEventLevelCountResponse.Code"));
		describeEventLevelCountResponse.setMessage(_ctx.stringValue("DescribeEventLevelCountResponse.Message"));

		EventLevels eventLevels = new EventLevels();
		eventLevels.setSerious(_ctx.integerValue("DescribeEventLevelCountResponse.EventLevels.Serious"));
		eventLevels.setSuspicious(_ctx.integerValue("DescribeEventLevelCountResponse.EventLevels.Suspicious"));
		eventLevels.setRemind(_ctx.integerValue("DescribeEventLevelCountResponse.EventLevels.Remind"));
		describeEventLevelCountResponse.setEventLevels(eventLevels);
	 
	 	return describeEventLevelCountResponse;
	}
}