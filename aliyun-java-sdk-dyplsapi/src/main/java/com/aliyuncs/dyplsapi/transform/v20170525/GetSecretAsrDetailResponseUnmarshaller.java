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

package com.aliyuncs.dyplsapi.transform.v20170525;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dyplsapi.model.v20170525.GetSecretAsrDetailResponse;
import com.aliyuncs.dyplsapi.model.v20170525.GetSecretAsrDetailResponse.Data;
import com.aliyuncs.dyplsapi.model.v20170525.GetSecretAsrDetailResponse.Data.SecretAsrSentenceDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSecretAsrDetailResponseUnmarshaller {

	public static GetSecretAsrDetailResponse unmarshall(GetSecretAsrDetailResponse getSecretAsrDetailResponse, UnmarshallerContext _ctx) {
		
		getSecretAsrDetailResponse.setRequestId(_ctx.stringValue("GetSecretAsrDetailResponse.RequestId"));
		getSecretAsrDetailResponse.setCode(_ctx.stringValue("GetSecretAsrDetailResponse.Code"));
		getSecretAsrDetailResponse.setMessage(_ctx.stringValue("GetSecretAsrDetailResponse.Message"));

		Data data = new Data();
		data.setRequestId(_ctx.stringValue("GetSecretAsrDetailResponse.Data.RequestId"));
		data.setBusinessId(_ctx.stringValue("GetSecretAsrDetailResponse.Data.BusinessId"));
		data.setBusinessKey(_ctx.stringValue("GetSecretAsrDetailResponse.Data.BusinessKey"));
		data.setCode(_ctx.stringValue("GetSecretAsrDetailResponse.Data.Code"));
		data.setMsg(_ctx.stringValue("GetSecretAsrDetailResponse.Data.Msg"));
		data.setBizDuration(_ctx.longValue("GetSecretAsrDetailResponse.Data.BizDuration"));
		data.setType(_ctx.stringValue("GetSecretAsrDetailResponse.Data.Type"));

		List<SecretAsrSentenceDTO> sentences = new ArrayList<SecretAsrSentenceDTO>();
		for (int i = 0; i < _ctx.lengthValue("GetSecretAsrDetailResponse.Data.Sentences.Length"); i++) {
			SecretAsrSentenceDTO secretAsrSentenceDTO = new SecretAsrSentenceDTO();
			secretAsrSentenceDTO.setEndTime(_ctx.longValue("GetSecretAsrDetailResponse.Data.Sentences["+ i +"].EndTime"));
			secretAsrSentenceDTO.setSilenceDuration(_ctx.longValue("GetSecretAsrDetailResponse.Data.Sentences["+ i +"].SilenceDuration"));
			secretAsrSentenceDTO.setBeginTime(_ctx.longValue("GetSecretAsrDetailResponse.Data.Sentences["+ i +"].BeginTime"));
			secretAsrSentenceDTO.setText(_ctx.stringValue("GetSecretAsrDetailResponse.Data.Sentences["+ i +"].Text"));
			secretAsrSentenceDTO.setChannelId(_ctx.integerValue("GetSecretAsrDetailResponse.Data.Sentences["+ i +"].ChannelId"));
			secretAsrSentenceDTO.setSpeechRate(_ctx.integerValue("GetSecretAsrDetailResponse.Data.Sentences["+ i +"].SpeechRate"));
			secretAsrSentenceDTO.setEmotionValue(_ctx.stringValue("GetSecretAsrDetailResponse.Data.Sentences["+ i +"].EmotionValue"));

			sentences.add(secretAsrSentenceDTO);
		}
		data.setSentences(sentences);
		getSecretAsrDetailResponse.setData(data);
	 
	 	return getSecretAsrDetailResponse;
	}
}