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

import com.aliyuncs.live.model.v20161101.DescribeLiveRtcRecordUsageDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveRtcRecordUsageDataResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveRtcRecordUsageDataResponseUnmarshaller {

	public static DescribeLiveRtcRecordUsageDataResponse unmarshall(DescribeLiveRtcRecordUsageDataResponse describeLiveRtcRecordUsageDataResponse, UnmarshallerContext _ctx) {
		
		describeLiveRtcRecordUsageDataResponse.setRequestId(_ctx.stringValue("DescribeLiveRtcRecordUsageDataResponse.RequestId"));
		describeLiveRtcRecordUsageDataResponse.setRecordMode(_ctx.stringValue("DescribeLiveRtcRecordUsageDataResponse.RecordMode"));
		describeLiveRtcRecordUsageDataResponse.setAppId(_ctx.stringValue("DescribeLiveRtcRecordUsageDataResponse.AppId"));
		describeLiveRtcRecordUsageDataResponse.setTotalSummaryDuration(_ctx.doubleValue("DescribeLiveRtcRecordUsageDataResponse.TotalSummaryDuration"));
		describeLiveRtcRecordUsageDataResponse.setAudioSummaryDuration(_ctx.doubleValue("DescribeLiveRtcRecordUsageDataResponse.AudioSummaryDuration"));
		describeLiveRtcRecordUsageDataResponse.setV480SummaryDuration(_ctx.doubleValue("DescribeLiveRtcRecordUsageDataResponse.V480SummaryDuration"));
		describeLiveRtcRecordUsageDataResponse.setV720SummaryDuration(_ctx.doubleValue("DescribeLiveRtcRecordUsageDataResponse.V720SummaryDuration"));
		describeLiveRtcRecordUsageDataResponse.setV1080SummaryDuration(_ctx.doubleValue("DescribeLiveRtcRecordUsageDataResponse.V1080SummaryDuration"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveRtcRecordUsageDataResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTimestamp(_ctx.stringValue("DescribeLiveRtcRecordUsageDataResponse.Data["+ i +"].Timestamp"));
			dataItem.setTotalDuration(_ctx.doubleValue("DescribeLiveRtcRecordUsageDataResponse.Data["+ i +"].TotalDuration"));
			dataItem.setAudioDuration(_ctx.doubleValue("DescribeLiveRtcRecordUsageDataResponse.Data["+ i +"].AudioDuration"));
			dataItem.setV480Duration(_ctx.doubleValue("DescribeLiveRtcRecordUsageDataResponse.Data["+ i +"].V480Duration"));
			dataItem.setV720Duration(_ctx.doubleValue("DescribeLiveRtcRecordUsageDataResponse.Data["+ i +"].V720Duration"));
			dataItem.setV1080Duration(_ctx.doubleValue("DescribeLiveRtcRecordUsageDataResponse.Data["+ i +"].V1080Duration"));

			data.add(dataItem);
		}
		describeLiveRtcRecordUsageDataResponse.setData(data);
	 
	 	return describeLiveRtcRecordUsageDataResponse;
	}
}