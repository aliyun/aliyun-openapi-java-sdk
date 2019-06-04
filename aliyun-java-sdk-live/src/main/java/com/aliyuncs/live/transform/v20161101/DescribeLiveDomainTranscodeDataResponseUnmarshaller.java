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

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainTranscodeDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainTranscodeDataResponse.TranscodeDataInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainTranscodeDataResponseUnmarshaller {

	public static DescribeLiveDomainTranscodeDataResponse unmarshall(DescribeLiveDomainTranscodeDataResponse describeLiveDomainTranscodeDataResponse, UnmarshallerContext context) {
		
		describeLiveDomainTranscodeDataResponse.setRequestId(context.stringValue("DescribeLiveDomainTranscodeDataResponse.RequestId"));

		List<TranscodeDataInfo> transcodeDataInfos = new ArrayList<TranscodeDataInfo>();
		for (int i = 0; i < context.lengthValue("DescribeLiveDomainTranscodeDataResponse.TranscodeDataInfos.Length"); i++) {
			TranscodeDataInfo transcodeDataInfo = new TranscodeDataInfo();
			transcodeDataInfo.setDate(context.stringValue("DescribeLiveDomainTranscodeDataResponse.TranscodeDataInfos["+ i +"].Date"));
			transcodeDataInfo.setTotal(context.integerValue("DescribeLiveDomainTranscodeDataResponse.TranscodeDataInfos["+ i +"].Total"));
			transcodeDataInfo.setDetail(context.stringValue("DescribeLiveDomainTranscodeDataResponse.TranscodeDataInfos["+ i +"].Detail"));

			transcodeDataInfos.add(transcodeDataInfo);
		}
		describeLiveDomainTranscodeDataResponse.setTranscodeDataInfos(transcodeDataInfos);
	 
	 	return describeLiveDomainTranscodeDataResponse;
	}
}