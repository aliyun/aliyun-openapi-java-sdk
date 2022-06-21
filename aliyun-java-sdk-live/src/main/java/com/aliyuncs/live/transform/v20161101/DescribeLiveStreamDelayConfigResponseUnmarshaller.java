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

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamDelayConfigResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamDelayConfigResponse.LiveStreamFlvDelayConfig;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamDelayConfigResponse.LiveStreamHlsDelayConfig;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamDelayConfigResponse.LiveStreamRtmpDelayConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamDelayConfigResponseUnmarshaller {

	public static DescribeLiveStreamDelayConfigResponse unmarshall(DescribeLiveStreamDelayConfigResponse describeLiveStreamDelayConfigResponse, UnmarshallerContext _ctx) {
		
		describeLiveStreamDelayConfigResponse.setRequestId(_ctx.stringValue("DescribeLiveStreamDelayConfigResponse.RequestId"));

		LiveStreamHlsDelayConfig liveStreamHlsDelayConfig = new LiveStreamHlsDelayConfig();
		liveStreamHlsDelayConfig.setLevel(_ctx.stringValue("DescribeLiveStreamDelayConfigResponse.LiveStreamHlsDelayConfig.Level"));
		liveStreamHlsDelayConfig.setDelay(_ctx.integerValue("DescribeLiveStreamDelayConfigResponse.LiveStreamHlsDelayConfig.Delay"));
		describeLiveStreamDelayConfigResponse.setLiveStreamHlsDelayConfig(liveStreamHlsDelayConfig);

		LiveStreamFlvDelayConfig liveStreamFlvDelayConfig = new LiveStreamFlvDelayConfig();
		liveStreamFlvDelayConfig.setLevel(_ctx.stringValue("DescribeLiveStreamDelayConfigResponse.LiveStreamFlvDelayConfig.Level"));
		liveStreamFlvDelayConfig.setDelay(_ctx.integerValue("DescribeLiveStreamDelayConfigResponse.LiveStreamFlvDelayConfig.Delay"));
		describeLiveStreamDelayConfigResponse.setLiveStreamFlvDelayConfig(liveStreamFlvDelayConfig);

		LiveStreamRtmpDelayConfig liveStreamRtmpDelayConfig = new LiveStreamRtmpDelayConfig();
		liveStreamRtmpDelayConfig.setLevel(_ctx.stringValue("DescribeLiveStreamDelayConfigResponse.LiveStreamRtmpDelayConfig.Level"));
		liveStreamRtmpDelayConfig.setDelay(_ctx.integerValue("DescribeLiveStreamDelayConfigResponse.LiveStreamRtmpDelayConfig.Delay"));
		describeLiveStreamDelayConfigResponse.setLiveStreamRtmpDelayConfig(liveStreamRtmpDelayConfig);
	 
	 	return describeLiveStreamDelayConfigResponse;
	}
}