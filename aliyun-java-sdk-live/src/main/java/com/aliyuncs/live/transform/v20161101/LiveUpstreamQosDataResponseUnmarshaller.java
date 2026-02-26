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

import com.aliyuncs.live.model.v20161101.LiveUpstreamQosDataResponse;
import com.aliyuncs.live.model.v20161101.LiveUpstreamQosDataResponse.DataItem;
import com.aliyuncs.live.model.v20161101.LiveUpstreamQosDataResponse.DataItem.DetailDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class LiveUpstreamQosDataResponseUnmarshaller {

	public static LiveUpstreamQosDataResponse unmarshall(LiveUpstreamQosDataResponse liveUpstreamQosDataResponse, UnmarshallerContext _ctx) {
		
		liveUpstreamQosDataResponse.setRequestId(_ctx.stringValue("LiveUpstreamQosDataResponse.RequestId"));
		liveUpstreamQosDataResponse.setStartTime(_ctx.stringValue("LiveUpstreamQosDataResponse.StartTime"));
		liveUpstreamQosDataResponse.setEndTime(_ctx.stringValue("LiveUpstreamQosDataResponse.EndTime"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("LiveUpstreamQosDataResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCdnDomain(_ctx.stringValue("LiveUpstreamQosDataResponse.Data["+ i +"].CdnDomain"));
			dataItem.setUpstreamDomain(_ctx.stringValue("LiveUpstreamQosDataResponse.Data["+ i +"].UpstreamDomain"));
			dataItem.setKwaiSidc(_ctx.stringValue("LiveUpstreamQosDataResponse.Data["+ i +"].KwaiSidc"));
			dataItem.setKwaiTsc(_ctx.longValue("LiveUpstreamQosDataResponse.Data["+ i +"].KwaiTsc"));
			dataItem.setCdnIsp(_ctx.stringValue("LiveUpstreamQosDataResponse.Data["+ i +"].CdnIsp"));
			dataItem.setCdnProvince(_ctx.stringValue("LiveUpstreamQosDataResponse.Data["+ i +"].CdnProvince"));
			dataItem.setCdnOcid(_ctx.stringValue("LiveUpstreamQosDataResponse.Data["+ i +"].CdnOcid"));

			List<DetailDataItem> detailData = new ArrayList<DetailDataItem>();
			for (int j = 0; j < _ctx.lengthValue("LiveUpstreamQosDataResponse.Data["+ i +"].DetailData.Length"); j++) {
				DetailDataItem detailDataItem = new DetailDataItem();
				detailDataItem.setTimestamp(_ctx.stringValue("LiveUpstreamQosDataResponse.Data["+ i +"].DetailData["+ j +"].Timestamp"));
				detailDataItem.setConnectDur(_ctx.longValue("LiveUpstreamQosDataResponse.Data["+ i +"].DetailData["+ j +"].ConnectDur"));
				detailDataItem.setFirstDataDur(_ctx.longValue("LiveUpstreamQosDataResponse.Data["+ i +"].DetailData["+ j +"].FirstDataDur"));
				detailDataItem.setFirstFrameDur(_ctx.longValue("LiveUpstreamQosDataResponse.Data["+ i +"].DetailData["+ j +"].FirstFrameDur"));
				detailDataItem.setConnectFailedCount(_ctx.longValue("LiveUpstreamQosDataResponse.Data["+ i +"].DetailData["+ j +"].ConnectFailedCount"));
				detailDataItem.setFirstDataFailedCount(_ctx.longValue("LiveUpstreamQosDataResponse.Data["+ i +"].DetailData["+ j +"].FirstDataFailedCount"));
				detailDataItem.setStatusCode5Xx(_ctx.longValue("LiveUpstreamQosDataResponse.Data["+ i +"].DetailData["+ j +"].StatusCode5Xx"));
				detailDataItem.setStatusCode4Xx(_ctx.longValue("LiveUpstreamQosDataResponse.Data["+ i +"].DetailData["+ j +"].StatusCode4Xx"));
				detailDataItem.setStatusCode3Xx(_ctx.longValue("LiveUpstreamQosDataResponse.Data["+ i +"].DetailData["+ j +"].StatusCode3Xx"));
				detailDataItem.setStatusCode2Xx(_ctx.longValue("LiveUpstreamQosDataResponse.Data["+ i +"].DetailData["+ j +"].StatusCode2Xx"));
				detailDataItem.setFirstFrameSuccessCount(_ctx.longValue("LiveUpstreamQosDataResponse.Data["+ i +"].DetailData["+ j +"].FirstFrameSuccessCount"));
				detailDataItem.setCount(_ctx.longValue("LiveUpstreamQosDataResponse.Data["+ i +"].DetailData["+ j +"].Count"));

				detailData.add(detailDataItem);
			}
			dataItem.setDetailData(detailData);

			data.add(dataItem);
		}
		liveUpstreamQosDataResponse.setData(data);
	 
	 	return liveUpstreamQosDataResponse;
	}
}