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

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamTranscodeInfoResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeInfo;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeInfo.CustomTranscodeParameters;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamTranscodeInfoResponseUnmarshaller {

	public static DescribeLiveStreamTranscodeInfoResponse unmarshall(DescribeLiveStreamTranscodeInfoResponse describeLiveStreamTranscodeInfoResponse, UnmarshallerContext context) {
		
		describeLiveStreamTranscodeInfoResponse.setRequestId(context.stringValue("DescribeLiveStreamTranscodeInfoResponse.RequestId"));

		List<DomainTranscodeInfo> domainTranscodeList = new ArrayList<DomainTranscodeInfo>();
		for (int i = 0; i < context.lengthValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList.Length"); i++) {
			DomainTranscodeInfo domainTranscodeInfo = new DomainTranscodeInfo();
			domainTranscodeInfo.setTranscodeApp(context.stringValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].TranscodeApp"));
			domainTranscodeInfo.setTranscodeName(context.stringValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].TranscodeName"));
			domainTranscodeInfo.setTranscodeTemplate(context.stringValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].TranscodeTemplate"));

			CustomTranscodeParameters customTranscodeParameters = new CustomTranscodeParameters();
			customTranscodeParameters.setVideoBitrate(context.integerValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].CustomTranscodeParameters.VideoBitrate"));
			customTranscodeParameters.setFPS(context.integerValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].CustomTranscodeParameters.FPS"));
			customTranscodeParameters.setHeight(context.integerValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].CustomTranscodeParameters.Height"));
			customTranscodeParameters.setWidth(context.integerValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].CustomTranscodeParameters.Width"));
			customTranscodeParameters.setTemplateType(context.stringValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].CustomTranscodeParameters.TemplateType"));
			domainTranscodeInfo.setCustomTranscodeParameters(customTranscodeParameters);

			domainTranscodeList.add(domainTranscodeInfo);
		}
		describeLiveStreamTranscodeInfoResponse.setDomainTranscodeList(domainTranscodeList);
	 
	 	return describeLiveStreamTranscodeInfoResponse;
	}
}