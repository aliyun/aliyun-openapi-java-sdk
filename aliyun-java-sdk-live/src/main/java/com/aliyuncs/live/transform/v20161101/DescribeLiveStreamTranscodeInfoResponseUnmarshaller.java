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

	public static DescribeLiveStreamTranscodeInfoResponse unmarshall(DescribeLiveStreamTranscodeInfoResponse describeLiveStreamTranscodeInfoResponse, UnmarshallerContext _ctx) {
		
		describeLiveStreamTranscodeInfoResponse.setRequestId(_ctx.stringValue("DescribeLiveStreamTranscodeInfoResponse.RequestId"));

		List<DomainTranscodeInfo> domainTranscodeList = new ArrayList<DomainTranscodeInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList.Length"); i++) {
			DomainTranscodeInfo domainTranscodeInfo = new DomainTranscodeInfo();
			domainTranscodeInfo.setTranscodeApp(_ctx.stringValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].TranscodeApp"));
			domainTranscodeInfo.setTranscodeName(_ctx.stringValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].TranscodeName"));
			domainTranscodeInfo.setTranscodeTemplate(_ctx.stringValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].TranscodeTemplate"));

			CustomTranscodeParameters customTranscodeParameters = new CustomTranscodeParameters();
			customTranscodeParameters.setRtsFlag(_ctx.stringValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].CustomTranscodeParameters.RtsFlag"));
			customTranscodeParameters.setBframes(_ctx.stringValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].CustomTranscodeParameters.Bframes"));
			customTranscodeParameters.setVideoBitrate(_ctx.integerValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].CustomTranscodeParameters.VideoBitrate"));
			customTranscodeParameters.setFPS(_ctx.integerValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].CustomTranscodeParameters.FPS"));
			customTranscodeParameters.setHeight(_ctx.integerValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].CustomTranscodeParameters.Height"));
			customTranscodeParameters.setWidth(_ctx.integerValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].CustomTranscodeParameters.Width"));
			customTranscodeParameters.setTemplateType(_ctx.stringValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].CustomTranscodeParameters.TemplateType"));
			customTranscodeParameters.setVideoProfile(_ctx.stringValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].CustomTranscodeParameters.VideoProfile"));
			customTranscodeParameters.setGop(_ctx.stringValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].CustomTranscodeParameters.Gop"));
			customTranscodeParameters.setAudioBitrate(_ctx.integerValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].CustomTranscodeParameters.AudioBitrate"));
			customTranscodeParameters.setAudioProfile(_ctx.stringValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].CustomTranscodeParameters.AudioProfile"));
			customTranscodeParameters.setAudioCodec(_ctx.stringValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].CustomTranscodeParameters.AudioCodec"));
			customTranscodeParameters.setAudioRate(_ctx.integerValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].CustomTranscodeParameters.AudioRate"));
			customTranscodeParameters.setAudioChannelNum(_ctx.integerValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].CustomTranscodeParameters.AudioChannelNum"));
			domainTranscodeInfo.setCustomTranscodeParameters(customTranscodeParameters);

			domainTranscodeList.add(domainTranscodeInfo);
		}
		describeLiveStreamTranscodeInfoResponse.setDomainTranscodeList(domainTranscodeList);
	 
	 	return describeLiveStreamTranscodeInfoResponse;
	}
}