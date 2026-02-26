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

package com.aliyuncs.cloud_siem.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloud_siem.model.v20220616.DescribeEventCountByThreatLevelResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeEventCountByThreatLevelResponse.Data;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeEventCountByThreatLevelResponse.Data.EventDailyNumItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEventCountByThreatLevelResponseUnmarshaller {

	public static DescribeEventCountByThreatLevelResponse unmarshall(DescribeEventCountByThreatLevelResponse describeEventCountByThreatLevelResponse, UnmarshallerContext _ctx) {
		
		describeEventCountByThreatLevelResponse.setRequestId(_ctx.stringValue("DescribeEventCountByThreatLevelResponse.RequestId"));
		describeEventCountByThreatLevelResponse.setSuccess(_ctx.booleanValue("DescribeEventCountByThreatLevelResponse.Success"));
		describeEventCountByThreatLevelResponse.setCode(_ctx.integerValue("DescribeEventCountByThreatLevelResponse.Code"));
		describeEventCountByThreatLevelResponse.setMessage(_ctx.stringValue("DescribeEventCountByThreatLevelResponse.Message"));

		Data data = new Data();
		data.setEventNum(_ctx.longValue("DescribeEventCountByThreatLevelResponse.Data.EventNum"));
		data.setUndealEventNum(_ctx.longValue("DescribeEventCountByThreatLevelResponse.Data.UndealEventNum"));
		data.setHighLevelEventNum(_ctx.longValue("DescribeEventCountByThreatLevelResponse.Data.HighLevelEventNum"));
		data.setMediumLevelEventNum(_ctx.longValue("DescribeEventCountByThreatLevelResponse.Data.MediumLevelEventNum"));
		data.setLowLevelEventNum(_ctx.longValue("DescribeEventCountByThreatLevelResponse.Data.LowLevelEventNum"));
		data.setSeriousLevelEventNum(_ctx.longValue("DescribeEventCountByThreatLevelResponse.Data.SeriousLevelEventNum"));
		data.setInfoLevelEventNum(_ctx.longValue("DescribeEventCountByThreatLevelResponse.Data.InfoLevelEventNum"));

		List<EventDailyNumItem> eventDailyNum = new ArrayList<EventDailyNumItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEventCountByThreatLevelResponse.Data.EventDailyNum.Length"); i++) {
			EventDailyNumItem eventDailyNumItem = new EventDailyNumItem();
			eventDailyNumItem.setDate(_ctx.stringValue("DescribeEventCountByThreatLevelResponse.Data.EventDailyNum["+ i +"].Date"));
			eventDailyNumItem.setEventNum(_ctx.longValue("DescribeEventCountByThreatLevelResponse.Data.EventDailyNum["+ i +"].EventNum"));
			eventDailyNumItem.setUndealEventNum(_ctx.longValue("DescribeEventCountByThreatLevelResponse.Data.EventDailyNum["+ i +"].UndealEventNum"));

			eventDailyNum.add(eventDailyNumItem);
		}
		data.setEventDailyNum(eventDailyNum);
		describeEventCountByThreatLevelResponse.setData(data);
	 
	 	return describeEventCountByThreatLevelResponse;
	}
}