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

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamMonitorListResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamMonitorListResponse.LiveStreamMonitorInfo;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamMonitorListResponse.LiveStreamMonitorInfo.InputConfig;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamMonitorListResponse.LiveStreamMonitorInfo.InputConfig.LayoutConfig;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamMonitorListResponse.LiveStreamMonitorInfo.InputConfig.PlayConfig;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamMonitorListResponse.LiveStreamMonitorInfo.OutputUrls;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamMonitorListResponseUnmarshaller {

	public static DescribeLiveStreamMonitorListResponse unmarshall(DescribeLiveStreamMonitorListResponse describeLiveStreamMonitorListResponse, UnmarshallerContext _ctx) {
		
		describeLiveStreamMonitorListResponse.setRequestId(_ctx.stringValue("DescribeLiveStreamMonitorListResponse.RequestId"));
		describeLiveStreamMonitorListResponse.setTotal(_ctx.integerValue("DescribeLiveStreamMonitorListResponse.Total"));

		List<LiveStreamMonitorInfo> liveStreamMonitorList = new ArrayList<LiveStreamMonitorInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveStreamMonitorListResponse.LiveStreamMonitorList.Length"); i++) {
			LiveStreamMonitorInfo liveStreamMonitorInfo = new LiveStreamMonitorInfo();
			liveStreamMonitorInfo.setStatus(_ctx.integerValue("DescribeLiveStreamMonitorListResponse.LiveStreamMonitorList["+ i +"].Status"));
			liveStreamMonitorInfo.setMonitorConfig(_ctx.stringValue("DescribeLiveStreamMonitorListResponse.LiveStreamMonitorList["+ i +"].MonitorConfig"));
			liveStreamMonitorInfo.setStartTime(_ctx.stringValue("DescribeLiveStreamMonitorListResponse.LiveStreamMonitorList["+ i +"].StartTime"));
			liveStreamMonitorInfo.setMonitorId(_ctx.stringValue("DescribeLiveStreamMonitorListResponse.LiveStreamMonitorList["+ i +"].MonitorId"));
			liveStreamMonitorInfo.setDomain(_ctx.stringValue("DescribeLiveStreamMonitorListResponse.LiveStreamMonitorList["+ i +"].Domain"));
			liveStreamMonitorInfo.setOutputTemplate(_ctx.stringValue("DescribeLiveStreamMonitorListResponse.LiveStreamMonitorList["+ i +"].OutputTemplate"));
			liveStreamMonitorInfo.setRegion(_ctx.stringValue("DescribeLiveStreamMonitorListResponse.LiveStreamMonitorList["+ i +"].Region"));
			liveStreamMonitorInfo.setAudioFrom(_ctx.integerValue("DescribeLiveStreamMonitorListResponse.LiveStreamMonitorList["+ i +"].AudioFrom"));
			liveStreamMonitorInfo.setMonitorName(_ctx.stringValue("DescribeLiveStreamMonitorListResponse.LiveStreamMonitorList["+ i +"].MonitorName"));
			liveStreamMonitorInfo.setStopTime(_ctx.stringValue("DescribeLiveStreamMonitorListResponse.LiveStreamMonitorList["+ i +"].StopTime"));

			OutputUrls outputUrls = new OutputUrls();
			outputUrls.setFlvUrl(_ctx.stringValue("DescribeLiveStreamMonitorListResponse.LiveStreamMonitorList["+ i +"].OutputUrls.FlvUrl"));
			outputUrls.setRtmpUrl(_ctx.stringValue("DescribeLiveStreamMonitorListResponse.LiveStreamMonitorList["+ i +"].OutputUrls.RtmpUrl"));
			liveStreamMonitorInfo.setOutputUrls(outputUrls);

			List<InputConfig> inputList = new ArrayList<InputConfig>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveStreamMonitorListResponse.LiveStreamMonitorList["+ i +"].InputList.Length"); j++) {
				InputConfig inputConfig = new InputConfig();
				inputConfig.setIndex(_ctx.integerValue("DescribeLiveStreamMonitorListResponse.LiveStreamMonitorList["+ i +"].InputList["+ j +"].Index"));
				inputConfig.setInputUrl(_ctx.stringValue("DescribeLiveStreamMonitorListResponse.LiveStreamMonitorList["+ i +"].InputList["+ j +"].InputUrl"));
				inputConfig.setLayoutId(_ctx.integerValue("DescribeLiveStreamMonitorListResponse.LiveStreamMonitorList["+ i +"].InputList["+ j +"].LayoutId"));
				inputConfig.setStreamName(_ctx.stringValue("DescribeLiveStreamMonitorListResponse.LiveStreamMonitorList["+ i +"].InputList["+ j +"].StreamName"));

				LayoutConfig layoutConfig = new LayoutConfig();
				layoutConfig.setFillMode(_ctx.stringValue("DescribeLiveStreamMonitorListResponse.LiveStreamMonitorList["+ i +"].InputList["+ j +"].LayoutConfig.FillMode"));
				layoutConfig.setPositionRefer(_ctx.stringValue("DescribeLiveStreamMonitorListResponse.LiveStreamMonitorList["+ i +"].InputList["+ j +"].LayoutConfig.PositionRefer"));

				List<Float> positionNormalized = new ArrayList<Float>();
				for (int k = 0; k < _ctx.lengthValue("DescribeLiveStreamMonitorListResponse.LiveStreamMonitorList["+ i +"].InputList["+ j +"].LayoutConfig.PositionNormalized.Length"); k++) {
					positionNormalized.add(_ctx.floatValue("DescribeLiveStreamMonitorListResponse.LiveStreamMonitorList["+ i +"].InputList["+ j +"].LayoutConfig.PositionNormalized["+ k +"]"));
				}
				layoutConfig.setPositionNormalized(positionNormalized);

				List<Float> sizeNormalized = new ArrayList<Float>();
				for (int k = 0; k < _ctx.lengthValue("DescribeLiveStreamMonitorListResponse.LiveStreamMonitorList["+ i +"].InputList["+ j +"].LayoutConfig.SizeNormalized.Length"); k++) {
					sizeNormalized.add(_ctx.floatValue("DescribeLiveStreamMonitorListResponse.LiveStreamMonitorList["+ i +"].InputList["+ j +"].LayoutConfig.SizeNormalized["+ k +"]"));
				}
				layoutConfig.setSizeNormalized(sizeNormalized);
				inputConfig.setLayoutConfig(layoutConfig);

				PlayConfig playConfig = new PlayConfig();
				playConfig.setVolumeRate(_ctx.floatValue("DescribeLiveStreamMonitorListResponse.LiveStreamMonitorList["+ i +"].InputList["+ j +"].PlayConfig.VolumeRate"));
				inputConfig.setPlayConfig(playConfig);

				inputList.add(inputConfig);
			}
			liveStreamMonitorInfo.setInputList(inputList);

			liveStreamMonitorList.add(liveStreamMonitorInfo);
		}
		describeLiveStreamMonitorListResponse.setLiveStreamMonitorList(liveStreamMonitorList);
	 
	 	return describeLiveStreamMonitorListResponse;
	}
}