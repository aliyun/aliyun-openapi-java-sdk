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

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainFrameRateAndBitRateDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainFrameRateAndBitRateDataResponse.FrameRateAndBitRateInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainFrameRateAndBitRateDataResponseUnmarshaller {

	public static DescribeLiveDomainFrameRateAndBitRateDataResponse unmarshall(DescribeLiveDomainFrameRateAndBitRateDataResponse describeLiveDomainFrameRateAndBitRateDataResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainFrameRateAndBitRateDataResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainFrameRateAndBitRateDataResponse.RequestId"));

		List<FrameRateAndBitRateInfo> frameRateAndBitRateInfos = new ArrayList<FrameRateAndBitRateInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDomainFrameRateAndBitRateDataResponse.FrameRateAndBitRateInfos.Length"); i++) {
			FrameRateAndBitRateInfo frameRateAndBitRateInfo = new FrameRateAndBitRateInfo();
			frameRateAndBitRateInfo.setAudioFrameRate(_ctx.floatValue("DescribeLiveDomainFrameRateAndBitRateDataResponse.FrameRateAndBitRateInfos["+ i +"].AudioFrameRate"));
			frameRateAndBitRateInfo.setBitRate(_ctx.floatValue("DescribeLiveDomainFrameRateAndBitRateDataResponse.FrameRateAndBitRateInfos["+ i +"].BitRate"));
			frameRateAndBitRateInfo.setVideoFrameRate(_ctx.floatValue("DescribeLiveDomainFrameRateAndBitRateDataResponse.FrameRateAndBitRateInfos["+ i +"].VideoFrameRate"));
			frameRateAndBitRateInfo.setStreamUrl(_ctx.stringValue("DescribeLiveDomainFrameRateAndBitRateDataResponse.FrameRateAndBitRateInfos["+ i +"].StreamUrl"));

			frameRateAndBitRateInfos.add(frameRateAndBitRateInfo);
		}
		describeLiveDomainFrameRateAndBitRateDataResponse.setFrameRateAndBitRateInfos(frameRateAndBitRateInfos);
	 
	 	return describeLiveDomainFrameRateAndBitRateDataResponse;
	}
}