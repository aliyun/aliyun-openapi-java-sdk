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

import com.aliyuncs.live.model.v20161101.DescribeLiveDelayedStreamingUsageResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDelayedStreamingUsageResponse.DelayDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDelayedStreamingUsageResponseUnmarshaller {

	public static DescribeLiveDelayedStreamingUsageResponse unmarshall(DescribeLiveDelayedStreamingUsageResponse describeLiveDelayedStreamingUsageResponse, UnmarshallerContext _ctx) {
		
		describeLiveDelayedStreamingUsageResponse.setRequestId(_ctx.stringValue("DescribeLiveDelayedStreamingUsageResponse.RequestId"));
		describeLiveDelayedStreamingUsageResponse.setEndTime(_ctx.stringValue("DescribeLiveDelayedStreamingUsageResponse.EndTime"));
		describeLiveDelayedStreamingUsageResponse.setStartTime(_ctx.stringValue("DescribeLiveDelayedStreamingUsageResponse.StartTime"));

		List<DelayDataItem> delayData = new ArrayList<DelayDataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDelayedStreamingUsageResponse.DelayData.Length"); i++) {
			DelayDataItem delayDataItem = new DelayDataItem();
			delayDataItem.setDuration(_ctx.longValue("DescribeLiveDelayedStreamingUsageResponse.DelayData["+ i +"].Duration"));
			delayDataItem.setTimeStamp(_ctx.stringValue("DescribeLiveDelayedStreamingUsageResponse.DelayData["+ i +"].TimeStamp"));
			delayDataItem.setStreamName(_ctx.stringValue("DescribeLiveDelayedStreamingUsageResponse.DelayData["+ i +"].StreamName"));
			delayDataItem.setDomainName(_ctx.stringValue("DescribeLiveDelayedStreamingUsageResponse.DelayData["+ i +"].DomainName"));
			delayDataItem.setRegion(_ctx.stringValue("DescribeLiveDelayedStreamingUsageResponse.DelayData["+ i +"].Region"));

			delayData.add(delayDataItem);
		}
		describeLiveDelayedStreamingUsageResponse.setDelayData(delayData);
	 
	 	return describeLiveDelayedStreamingUsageResponse;
	}
}