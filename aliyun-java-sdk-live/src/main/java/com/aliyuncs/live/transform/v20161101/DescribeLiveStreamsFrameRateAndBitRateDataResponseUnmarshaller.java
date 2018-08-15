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

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamsFrameRateAndBitRateDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamsFrameRateAndBitRateDataResponse.FrameRateAndBitRateInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamsFrameRateAndBitRateDataResponseUnmarshaller {

	public static DescribeLiveStreamsFrameRateAndBitRateDataResponse unmarshall(DescribeLiveStreamsFrameRateAndBitRateDataResponse describeLiveStreamsFrameRateAndBitRateDataResponse, UnmarshallerContext context) {
		
		describeLiveStreamsFrameRateAndBitRateDataResponse.setRequestId(context.stringValue("DescribeLiveStreamsFrameRateAndBitRateDataResponse.RequestId"));

		List<FrameRateAndBitRateInfo> frameRateAndBitRateInfos = new ArrayList<FrameRateAndBitRateInfo>();
		for (int i = 0; i < context.lengthValue("DescribeLiveStreamsFrameRateAndBitRateDataResponse.FrameRateAndBitRateInfos.Length"); i++) {
			FrameRateAndBitRateInfo frameRateAndBitRateInfo = new FrameRateAndBitRateInfo();
			frameRateAndBitRateInfo.setStreamUrl(context.stringValue("DescribeLiveStreamsFrameRateAndBitRateDataResponse.FrameRateAndBitRateInfos["+ i +"].StreamUrl"));
			frameRateAndBitRateInfo.setVideoFrameRate(context.floatValue("DescribeLiveStreamsFrameRateAndBitRateDataResponse.FrameRateAndBitRateInfos["+ i +"].VideoFrameRate"));
			frameRateAndBitRateInfo.setAudioFrameRate(context.floatValue("DescribeLiveStreamsFrameRateAndBitRateDataResponse.FrameRateAndBitRateInfos["+ i +"].AudioFrameRate"));
			frameRateAndBitRateInfo.setBitRate(context.floatValue("DescribeLiveStreamsFrameRateAndBitRateDataResponse.FrameRateAndBitRateInfos["+ i +"].BitRate"));
			frameRateAndBitRateInfo.setTime(context.stringValue("DescribeLiveStreamsFrameRateAndBitRateDataResponse.FrameRateAndBitRateInfos["+ i +"].Time"));

			frameRateAndBitRateInfos.add(frameRateAndBitRateInfo);
		}
		describeLiveStreamsFrameRateAndBitRateDataResponse.setFrameRateAndBitRateInfos(frameRateAndBitRateInfos);
	 
	 	return describeLiveStreamsFrameRateAndBitRateDataResponse;
	}
}