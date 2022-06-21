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

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainStreamTranscodeDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainStreamTranscodeDataResponse.TranscodeData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainStreamTranscodeDataResponseUnmarshaller {

	public static DescribeLiveDomainStreamTranscodeDataResponse unmarshall(DescribeLiveDomainStreamTranscodeDataResponse describeLiveDomainStreamTranscodeDataResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainStreamTranscodeDataResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainStreamTranscodeDataResponse.RequestId"));

		List<TranscodeData> transcodeDataList = new ArrayList<TranscodeData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDomainStreamTranscodeDataResponse.TranscodeDataList.Length"); i++) {
			TranscodeData transcodeData = new TranscodeData();
			transcodeData.setTimeStamp(_ctx.stringValue("DescribeLiveDomainStreamTranscodeDataResponse.TranscodeDataList["+ i +"].TimeStamp"));
			transcodeData.setDomain(_ctx.stringValue("DescribeLiveDomainStreamTranscodeDataResponse.TranscodeDataList["+ i +"].Domain"));
			transcodeData.setRegion(_ctx.stringValue("DescribeLiveDomainStreamTranscodeDataResponse.TranscodeDataList["+ i +"].Region"));
			transcodeData.setTanscodeType(_ctx.stringValue("DescribeLiveDomainStreamTranscodeDataResponse.TranscodeDataList["+ i +"].TanscodeType"));
			transcodeData.setResolution(_ctx.stringValue("DescribeLiveDomainStreamTranscodeDataResponse.TranscodeDataList["+ i +"].Resolution"));
			transcodeData.setFps(_ctx.stringValue("DescribeLiveDomainStreamTranscodeDataResponse.TranscodeDataList["+ i +"].Fps"));
			transcodeData.setDuration(_ctx.integerValue("DescribeLiveDomainStreamTranscodeDataResponse.TranscodeDataList["+ i +"].Duration"));

			transcodeDataList.add(transcodeData);
		}
		describeLiveDomainStreamTranscodeDataResponse.setTranscodeDataList(transcodeDataList);
	 
	 	return describeLiveDomainStreamTranscodeDataResponse;
	}
}