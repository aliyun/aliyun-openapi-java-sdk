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

package com.aliyuncs.voicenavigator.transform.v20180612;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.voicenavigator.model.v20180612.DescribeVoiceConfigResponse;
import com.aliyuncs.voicenavigator.model.v20180612.DescribeVoiceConfigResponse.Ip;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVoiceConfigResponseUnmarshaller {

	public static DescribeVoiceConfigResponse unmarshall(DescribeVoiceConfigResponse describeVoiceConfigResponse, UnmarshallerContext _ctx) {
		
		describeVoiceConfigResponse.setRequestId(_ctx.stringValue("DescribeVoiceConfigResponse.RequestId"));
		describeVoiceConfigResponse.setSpeechNoiseThreshold(_ctx.stringValue("DescribeVoiceConfigResponse.SpeechNoiseThreshold"));
		describeVoiceConfigResponse.setAsrCustomizationId(_ctx.stringValue("DescribeVoiceConfigResponse.AsrCustomizationId"));
		describeVoiceConfigResponse.setVoice(_ctx.stringValue("DescribeVoiceConfigResponse.Voice"));
		describeVoiceConfigResponse.setAsrClassVocabularyId(_ctx.stringValue("DescribeVoiceConfigResponse.AsrClassVocabularyId"));
		describeVoiceConfigResponse.setAsrVocabularyId(_ctx.stringValue("DescribeVoiceConfigResponse.AsrVocabularyId"));
		describeVoiceConfigResponse.setAsrAcousticModelId(_ctx.stringValue("DescribeVoiceConfigResponse.AsrAcousticModelId"));
		describeVoiceConfigResponse.setVolume(_ctx.integerValue("DescribeVoiceConfigResponse.Volume"));
		describeVoiceConfigResponse.setSpeechRate(_ctx.integerValue("DescribeVoiceConfigResponse.SpeechRate"));

		List<Ip> apesIpList = new ArrayList<Ip>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVoiceConfigResponse.ApesIpList.Length"); i++) {
			Ip ip = new Ip();
			ip.setIp(_ctx.stringValue("DescribeVoiceConfigResponse.ApesIpList["+ i +"].Ip"));

			apesIpList.add(ip);
		}
		describeVoiceConfigResponse.setApesIpList(apesIpList);
	 
	 	return describeVoiceConfigResponse;
	}
}