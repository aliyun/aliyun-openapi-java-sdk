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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.GetDigitalWatermarkExtractResultResponse;
import com.aliyuncs.vod.model.v20170321.GetDigitalWatermarkExtractResultResponse.AiExtractResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDigitalWatermarkExtractResultResponseUnmarshaller {

	public static GetDigitalWatermarkExtractResultResponse unmarshall(GetDigitalWatermarkExtractResultResponse getDigitalWatermarkExtractResultResponse, UnmarshallerContext _ctx) {
		
		getDigitalWatermarkExtractResultResponse.setRequestId(_ctx.stringValue("GetDigitalWatermarkExtractResultResponse.RequestId"));

		List<AiExtractResult> aiExtractResultList = new ArrayList<AiExtractResult>();
		for (int i = 0; i < _ctx.lengthValue("GetDigitalWatermarkExtractResultResponse.AiExtractResultList.Length"); i++) {
			AiExtractResult aiExtractResult = new AiExtractResult();
			aiExtractResult.setJobId(_ctx.stringValue("GetDigitalWatermarkExtractResultResponse.AiExtractResultList["+ i +"].JobId"));
			aiExtractResult.setCreateTime(_ctx.stringValue("GetDigitalWatermarkExtractResultResponse.AiExtractResultList["+ i +"].CreateTime"));
			aiExtractResult.setModifyTime(_ctx.stringValue("GetDigitalWatermarkExtractResultResponse.AiExtractResultList["+ i +"].ModifyTime"));
			aiExtractResult.setStatus(_ctx.stringValue("GetDigitalWatermarkExtractResultResponse.AiExtractResultList["+ i +"].Status"));
			aiExtractResult.setErrorMessage(_ctx.stringValue("GetDigitalWatermarkExtractResultResponse.AiExtractResultList["+ i +"].ErrorMessage"));
			aiExtractResult.setWaterMarkText(_ctx.stringValue("GetDigitalWatermarkExtractResultResponse.AiExtractResultList["+ i +"].WaterMarkText"));

			aiExtractResultList.add(aiExtractResult);
		}
		getDigitalWatermarkExtractResultResponse.setAiExtractResultList(aiExtractResultList);
	 
	 	return getDigitalWatermarkExtractResultResponse;
	}
}