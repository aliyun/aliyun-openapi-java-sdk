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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.PageQuerySharedSpeechOpenResponse;
import com.aliyuncs.iot.model.v20180120.PageQuerySharedSpeechOpenResponse.Data;
import com.aliyuncs.iot.model.v20180120.PageQuerySharedSpeechOpenResponse.Data.Data1;
import com.aliyuncs.transform.UnmarshallerContext;


public class PageQuerySharedSpeechOpenResponseUnmarshaller {

	public static PageQuerySharedSpeechOpenResponse unmarshall(PageQuerySharedSpeechOpenResponse pageQuerySharedSpeechOpenResponse, UnmarshallerContext _ctx) {
		
		pageQuerySharedSpeechOpenResponse.setRequestId(_ctx.stringValue("PageQuerySharedSpeechOpenResponse.RequestId"));
		pageQuerySharedSpeechOpenResponse.setCode(_ctx.stringValue("PageQuerySharedSpeechOpenResponse.Code"));
		pageQuerySharedSpeechOpenResponse.setErrorMessage(_ctx.stringValue("PageQuerySharedSpeechOpenResponse.ErrorMessage"));
		pageQuerySharedSpeechOpenResponse.setSuccess(_ctx.booleanValue("PageQuerySharedSpeechOpenResponse.Success"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("PageQuerySharedSpeechOpenResponse.Data.PageSize"));
		data.setPageId(_ctx.integerValue("PageQuerySharedSpeechOpenResponse.Data.PageId"));
		data.setTotal(_ctx.integerValue("PageQuerySharedSpeechOpenResponse.Data.Total"));

		List<Data1> resultData = new ArrayList<Data1>();
		for (int i = 0; i < _ctx.lengthValue("PageQuerySharedSpeechOpenResponse.Data.ResultData.Length"); i++) {
			Data1 data1 = new Data1();
			data1.setStatus(_ctx.integerValue("PageQuerySharedSpeechOpenResponse.Data.ResultData["+ i +"].Status"));
			data1.setVoice(_ctx.stringValue("PageQuerySharedSpeechOpenResponse.Data.ResultData["+ i +"].Voice"));
			data1.setBizCode(_ctx.stringValue("PageQuerySharedSpeechOpenResponse.Data.ResultData["+ i +"].BizCode"));
			data1.setCode(_ctx.stringValue("PageQuerySharedSpeechOpenResponse.Data.ResultData["+ i +"].Code"));
			data1.setText(_ctx.stringValue("PageQuerySharedSpeechOpenResponse.Data.ResultData["+ i +"].Text"));
			data1.setSpeechRate(_ctx.integerValue("PageQuerySharedSpeechOpenResponse.Data.ResultData["+ i +"].SpeechRate"));
			data1.setVolume(_ctx.integerValue("PageQuerySharedSpeechOpenResponse.Data.ResultData["+ i +"].Volume"));
			data1.setAudioFormat(_ctx.stringValue("PageQuerySharedSpeechOpenResponse.Data.ResultData["+ i +"].AudioFormat"));

			resultData.add(data1);
		}
		data.setResultData(resultData);
		pageQuerySharedSpeechOpenResponse.setData(data);
	 
	 	return pageQuerySharedSpeechOpenResponse;
	}
}