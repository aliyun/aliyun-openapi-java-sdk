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

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamDetailFrameRateAndBitRateDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamDetailFrameRateAndBitRateDataResponse.Frabr;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamDetailFrameRateAndBitRateDataResponseUnmarshaller {

	public static DescribeLiveStreamDetailFrameRateAndBitRateDataResponse unmarshall(DescribeLiveStreamDetailFrameRateAndBitRateDataResponse describeLiveStreamDetailFrameRateAndBitRateDataResponse, UnmarshallerContext _ctx) {
		
		describeLiveStreamDetailFrameRateAndBitRateDataResponse.setRequestId(_ctx.stringValue("DescribeLiveStreamDetailFrameRateAndBitRateDataResponse.RequestId"));

		List<Frabr> frameRateAndBitRateInfos = new ArrayList<Frabr>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveStreamDetailFrameRateAndBitRateDataResponse.FrameRateAndBitRateInfos.Length"); i++) {
			Frabr frabr = new Frabr();
			frabr.setAudioBitRate(_ctx.floatValue("DescribeLiveStreamDetailFrameRateAndBitRateDataResponse.FrameRateAndBitRateInfos["+ i +"].AudioBitRate"));
			frabr.setAudioFrameRate(_ctx.floatValue("DescribeLiveStreamDetailFrameRateAndBitRateDataResponse.FrameRateAndBitRateInfos["+ i +"].AudioFrameRate"));
			frabr.setBitRate(_ctx.floatValue("DescribeLiveStreamDetailFrameRateAndBitRateDataResponse.FrameRateAndBitRateInfos["+ i +"].BitRate"));
			frabr.setStreamUrl(_ctx.stringValue("DescribeLiveStreamDetailFrameRateAndBitRateDataResponse.FrameRateAndBitRateInfos["+ i +"].StreamUrl"));
			frabr.setTime(_ctx.stringValue("DescribeLiveStreamDetailFrameRateAndBitRateDataResponse.FrameRateAndBitRateInfos["+ i +"].Time"));
			frabr.setVideoBitRate(_ctx.floatValue("DescribeLiveStreamDetailFrameRateAndBitRateDataResponse.FrameRateAndBitRateInfos["+ i +"].VideoBitRate"));
			frabr.setVideoFrameRate(_ctx.floatValue("DescribeLiveStreamDetailFrameRateAndBitRateDataResponse.FrameRateAndBitRateInfos["+ i +"].VideoFrameRate"));

			frameRateAndBitRateInfos.add(frabr);
		}
		describeLiveStreamDetailFrameRateAndBitRateDataResponse.setFrameRateAndBitRateInfos(frameRateAndBitRateInfos);
	 
	 	return describeLiveStreamDetailFrameRateAndBitRateDataResponse;
	}
}