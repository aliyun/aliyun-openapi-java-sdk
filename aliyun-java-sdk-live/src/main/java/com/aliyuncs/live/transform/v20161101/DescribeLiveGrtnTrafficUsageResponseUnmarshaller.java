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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveGrtnTrafficUsageResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveGrtnTrafficUsageResponse.UsageData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveGrtnTrafficUsageResponseUnmarshaller {

	public static DescribeLiveGrtnTrafficUsageResponse unmarshall(DescribeLiveGrtnTrafficUsageResponse describeLiveGrtnTrafficUsageResponse, UnmarshallerContext _ctx) {
		
		describeLiveGrtnTrafficUsageResponse.setRequestId(_ctx.stringValue("DescribeLiveGrtnTrafficUsageResponse.RequestId"));
		describeLiveGrtnTrafficUsageResponse.setAppId(_ctx.stringValue("DescribeLiveGrtnTrafficUsageResponse.AppId"));
		describeLiveGrtnTrafficUsageResponse.setArea(_ctx.stringValue("DescribeLiveGrtnTrafficUsageResponse.Area"));
		describeLiveGrtnTrafficUsageResponse.setEndTime(_ctx.stringValue("DescribeLiveGrtnTrafficUsageResponse.EndTime"));
		describeLiveGrtnTrafficUsageResponse.setFiled(_ctx.stringValue("DescribeLiveGrtnTrafficUsageResponse.Filed"));
		describeLiveGrtnTrafficUsageResponse.setStartTime(_ctx.stringValue("DescribeLiveGrtnTrafficUsageResponse.StartTime"));

		List<UsageData> usageDataPerInterval = new ArrayList<UsageData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveGrtnTrafficUsageResponse.UsageDataPerInterval.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setTimeStamp(_ctx.stringValue("DescribeLiveGrtnTrafficUsageResponse.UsageDataPerInterval["+ i +"].TimeStamp"));
			usageData.setValue(_ctx.doubleValue("DescribeLiveGrtnTrafficUsageResponse.UsageDataPerInterval["+ i +"].Value"));

			usageDataPerInterval.add(usageData);
		}
		describeLiveGrtnTrafficUsageResponse.setUsageDataPerInterval(usageDataPerInterval);
	 
	 	return describeLiveGrtnTrafficUsageResponse;
	}
}