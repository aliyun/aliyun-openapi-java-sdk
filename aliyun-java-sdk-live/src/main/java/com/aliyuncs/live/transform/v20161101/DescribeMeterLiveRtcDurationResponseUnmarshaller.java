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

import com.aliyuncs.live.model.v20161101.DescribeMeterLiveRtcDurationResponse;
import com.aliyuncs.live.model.v20161101.DescribeMeterLiveRtcDurationResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMeterLiveRtcDurationResponseUnmarshaller {

	public static DescribeMeterLiveRtcDurationResponse unmarshall(DescribeMeterLiveRtcDurationResponse describeMeterLiveRtcDurationResponse, UnmarshallerContext _ctx) {
		
		describeMeterLiveRtcDurationResponse.setRequestId(_ctx.stringValue("DescribeMeterLiveRtcDurationResponse.RequestId"));
		describeMeterLiveRtcDurationResponse.setTotalSummaryDuration(_ctx.longValue("DescribeMeterLiveRtcDurationResponse.TotalSummaryDuration"));
		describeMeterLiveRtcDurationResponse.setAudioSummaryDuration(_ctx.longValue("DescribeMeterLiveRtcDurationResponse.AudioSummaryDuration"));
		describeMeterLiveRtcDurationResponse.setV480SummaryDuration(_ctx.longValue("DescribeMeterLiveRtcDurationResponse.V480SummaryDuration"));
		describeMeterLiveRtcDurationResponse.setV720SummaryDuration(_ctx.longValue("DescribeMeterLiveRtcDurationResponse.V720SummaryDuration"));
		describeMeterLiveRtcDurationResponse.setV1080SummaryDuration(_ctx.longValue("DescribeMeterLiveRtcDurationResponse.V1080SummaryDuration"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMeterLiveRtcDurationResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTimestamp(_ctx.stringValue("DescribeMeterLiveRtcDurationResponse.Data["+ i +"].Timestamp"));
			dataItem.setTotalDuration(_ctx.longValue("DescribeMeterLiveRtcDurationResponse.Data["+ i +"].TotalDuration"));
			dataItem.setAudioDuration(_ctx.longValue("DescribeMeterLiveRtcDurationResponse.Data["+ i +"].AudioDuration"));
			dataItem.setV480Duration(_ctx.longValue("DescribeMeterLiveRtcDurationResponse.Data["+ i +"].V480Duration"));
			dataItem.setV720Duration(_ctx.longValue("DescribeMeterLiveRtcDurationResponse.Data["+ i +"].V720Duration"));
			dataItem.setV1080Duration(_ctx.longValue("DescribeMeterLiveRtcDurationResponse.Data["+ i +"].V1080Duration"));

			data.add(dataItem);
		}
		describeMeterLiveRtcDurationResponse.setData(data);
	 
	 	return describeMeterLiveRtcDurationResponse;
	}
}