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

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamBitRateDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamBitRateDataResponse.FrameRateAndBitRateInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamBitRateDataResponseUnmarshaller {

	public static DescribeLiveStreamBitRateDataResponse unmarshall(DescribeLiveStreamBitRateDataResponse describeLiveStreamBitRateDataResponse, UnmarshallerContext _ctx) {
		
		describeLiveStreamBitRateDataResponse.setRequestId(_ctx.stringValue("DescribeLiveStreamBitRateDataResponse.RequestId"));

		List<FrameRateAndBitRateInfo> frameRateAndBitRateInfos = new ArrayList<FrameRateAndBitRateInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveStreamBitRateDataResponse.FrameRateAndBitRateInfos.Length"); i++) {
			FrameRateAndBitRateInfo frameRateAndBitRateInfo = new FrameRateAndBitRateInfo();
			frameRateAndBitRateInfo.setTime(_ctx.stringValue("DescribeLiveStreamBitRateDataResponse.FrameRateAndBitRateInfos["+ i +"].Time"));
			frameRateAndBitRateInfo.setVideoFrameRate(_ctx.floatValue("DescribeLiveStreamBitRateDataResponse.FrameRateAndBitRateInfos["+ i +"].VideoFrameRate"));
			frameRateAndBitRateInfo.setAudioFrameRate(_ctx.floatValue("DescribeLiveStreamBitRateDataResponse.FrameRateAndBitRateInfos["+ i +"].AudioFrameRate"));
			frameRateAndBitRateInfo.setStreamUrl(_ctx.stringValue("DescribeLiveStreamBitRateDataResponse.FrameRateAndBitRateInfos["+ i +"].StreamUrl"));
			frameRateAndBitRateInfo.setBitRate(_ctx.floatValue("DescribeLiveStreamBitRateDataResponse.FrameRateAndBitRateInfos["+ i +"].BitRate"));

			frameRateAndBitRateInfos.add(frameRateAndBitRateInfo);
		}
		describeLiveStreamBitRateDataResponse.setFrameRateAndBitRateInfos(frameRateAndBitRateInfos);
	 
	 	return describeLiveStreamBitRateDataResponse;
	}
}