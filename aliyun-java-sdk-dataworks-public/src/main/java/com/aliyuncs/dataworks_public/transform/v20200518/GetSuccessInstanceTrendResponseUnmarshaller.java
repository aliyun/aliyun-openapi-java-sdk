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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.GetSuccessInstanceTrendResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetSuccessInstanceTrendResponse.InstanceStatusTrend;
import com.aliyuncs.dataworks_public.model.v20200518.GetSuccessInstanceTrendResponse.InstanceStatusTrend.AvgTrendItem;
import com.aliyuncs.dataworks_public.model.v20200518.GetSuccessInstanceTrendResponse.InstanceStatusTrend.TodayTrendItem;
import com.aliyuncs.dataworks_public.model.v20200518.GetSuccessInstanceTrendResponse.InstanceStatusTrend.YesterdayTrendItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSuccessInstanceTrendResponseUnmarshaller {

	public static GetSuccessInstanceTrendResponse unmarshall(GetSuccessInstanceTrendResponse getSuccessInstanceTrendResponse, UnmarshallerContext _ctx) {
		
		getSuccessInstanceTrendResponse.setRequestId(_ctx.stringValue("GetSuccessInstanceTrendResponse.RequestId"));

		InstanceStatusTrend instanceStatusTrend = new InstanceStatusTrend();

		List<TodayTrendItem> todayTrend = new ArrayList<TodayTrendItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSuccessInstanceTrendResponse.InstanceStatusTrend.TodayTrend.Length"); i++) {
			TodayTrendItem todayTrendItem = new TodayTrendItem();
			todayTrendItem.setTimePoint(_ctx.stringValue("GetSuccessInstanceTrendResponse.InstanceStatusTrend.TodayTrend["+ i +"].TimePoint"));
			todayTrendItem.setCount(_ctx.integerValue("GetSuccessInstanceTrendResponse.InstanceStatusTrend.TodayTrend["+ i +"].Count"));

			todayTrend.add(todayTrendItem);
		}
		instanceStatusTrend.setTodayTrend(todayTrend);

		List<YesterdayTrendItem> yesterdayTrend = new ArrayList<YesterdayTrendItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSuccessInstanceTrendResponse.InstanceStatusTrend.YesterdayTrend.Length"); i++) {
			YesterdayTrendItem yesterdayTrendItem = new YesterdayTrendItem();
			yesterdayTrendItem.setTimePoint(_ctx.stringValue("GetSuccessInstanceTrendResponse.InstanceStatusTrend.YesterdayTrend["+ i +"].TimePoint"));
			yesterdayTrendItem.setCount(_ctx.integerValue("GetSuccessInstanceTrendResponse.InstanceStatusTrend.YesterdayTrend["+ i +"].Count"));

			yesterdayTrend.add(yesterdayTrendItem);
		}
		instanceStatusTrend.setYesterdayTrend(yesterdayTrend);

		List<AvgTrendItem> avgTrend = new ArrayList<AvgTrendItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSuccessInstanceTrendResponse.InstanceStatusTrend.AvgTrend.Length"); i++) {
			AvgTrendItem avgTrendItem = new AvgTrendItem();
			avgTrendItem.setTimePoint(_ctx.stringValue("GetSuccessInstanceTrendResponse.InstanceStatusTrend.AvgTrend["+ i +"].TimePoint"));
			avgTrendItem.setCount(_ctx.integerValue("GetSuccessInstanceTrendResponse.InstanceStatusTrend.AvgTrend["+ i +"].Count"));

			avgTrend.add(avgTrendItem);
		}
		instanceStatusTrend.setAvgTrend(avgTrend);
		getSuccessInstanceTrendResponse.setInstanceStatusTrend(instanceStatusTrend);
	 
	 	return getSuccessInstanceTrendResponse;
	}
}