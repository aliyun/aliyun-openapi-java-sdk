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

package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamFrameAndBitRateByDomainResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamFrameAndBitRateByDomainResponse.FrameRateAndBitRateInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamFrameAndBitRateByDomainResponseUnmarshaller {

	public static DescribeLiveStreamFrameAndBitRateByDomainResponse unmarshall(DescribeLiveStreamFrameAndBitRateByDomainResponse describeLiveStreamFrameAndBitRateByDomainResponse, UnmarshallerContext context) {
		
		describeLiveStreamFrameAndBitRateByDomainResponse.setRequestId(context.stringValue("DescribeLiveStreamFrameAndBitRateByDomainResponse.RequestId"));
		describeLiveStreamFrameAndBitRateByDomainResponse.setCount(context.longValue("DescribeLiveStreamFrameAndBitRateByDomainResponse.Count"));
		describeLiveStreamFrameAndBitRateByDomainResponse.setPageNumber(context.longValue("DescribeLiveStreamFrameAndBitRateByDomainResponse.pageNumber"));
		describeLiveStreamFrameAndBitRateByDomainResponse.setPageSize(context.longValue("DescribeLiveStreamFrameAndBitRateByDomainResponse.pageSize"));

		List<FrameRateAndBitRateInfo> frameRateAndBitRateInfos = new ArrayList<FrameRateAndBitRateInfo>();
		for (int i = 0; i < context.lengthValue("DescribeLiveStreamFrameAndBitRateByDomainResponse.FrameRateAndBitRateInfos.Length"); i++) {
			FrameRateAndBitRateInfo frameRateAndBitRateInfo = new FrameRateAndBitRateInfo();
			frameRateAndBitRateInfo.setStreamUrl(context.stringValue("DescribeLiveStreamFrameAndBitRateByDomainResponse.FrameRateAndBitRateInfos["+ i +"].StreamUrl"));
			frameRateAndBitRateInfo.setVideoFrameRate(context.floatValue("DescribeLiveStreamFrameAndBitRateByDomainResponse.FrameRateAndBitRateInfos["+ i +"].VideoFrameRate"));
			frameRateAndBitRateInfo.setAudioFrameRate(context.floatValue("DescribeLiveStreamFrameAndBitRateByDomainResponse.FrameRateAndBitRateInfos["+ i +"].AudioFrameRate"));
			frameRateAndBitRateInfo.setBitRate(context.floatValue("DescribeLiveStreamFrameAndBitRateByDomainResponse.FrameRateAndBitRateInfos["+ i +"].BitRate"));
			frameRateAndBitRateInfo.setTime(context.stringValue("DescribeLiveStreamFrameAndBitRateByDomainResponse.FrameRateAndBitRateInfos["+ i +"].Time"));

			frameRateAndBitRateInfos.add(frameRateAndBitRateInfo);
		}
		describeLiveStreamFrameAndBitRateByDomainResponse.setFrameRateAndBitRateInfos(frameRateAndBitRateInfos);
	 
	 	return describeLiveStreamFrameAndBitRateByDomainResponse;
	}
}