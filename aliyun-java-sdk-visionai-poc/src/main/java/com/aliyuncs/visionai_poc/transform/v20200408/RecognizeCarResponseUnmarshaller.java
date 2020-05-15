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

package com.aliyuncs.visionai_poc.transform.v20200408;

import com.aliyuncs.visionai_poc.model.v20200408.RecognizeCarResponse;
import com.aliyuncs.visionai_poc.model.v20200408.RecognizeCarResponse.Response;
import com.aliyuncs.visionai_poc.model.v20200408.RecognizeCarResponse.Response.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeCarResponseUnmarshaller {

	public static RecognizeCarResponse unmarshall(RecognizeCarResponse recognizeCarResponse, UnmarshallerContext _ctx) {
		
		recognizeCarResponse.setCode(_ctx.integerValue("RecognizeCarResponse.Code"));
		recognizeCarResponse.setMessage(_ctx.stringValue("RecognizeCarResponse.Message"));
		recognizeCarResponse.setSuccess(_ctx.booleanValue("RecognizeCarResponse.Success"));

		Response response = new Response();
		response.setSuccess(_ctx.booleanValue("RecognizeCarResponse.Response.Success"));
		response.setUrl(_ctx.stringValue("RecognizeCarResponse.Response.Url"));
		response.setRequestId(_ctx.stringValue("RecognizeCarResponse.Response.RequestId"));
		response.setErrorCode(_ctx.stringValue("RecognizeCarResponse.Response.ErrorCode"));
		response.setErrorMessage(_ctx.stringValue("RecognizeCarResponse.Response.ErrorMessage"));

		Data data = new Data();
		data.setExternal(_ctx.stringValue("RecognizeCarResponse.Response.Data.External"));
		data.setModelName(_ctx.stringValue("RecognizeCarResponse.Response.Data.ModelName"));
		data.setConfidence(_ctx.stringValue("RecognizeCarResponse.Response.Data.Confidence"));
		data.setProp(_ctx.stringValue("RecognizeCarResponse.Response.Data.Prop"));
		data.setName(_ctx.stringValue("RecognizeCarResponse.Response.Data.Name"));
		data.setPicUrl(_ctx.stringValue("RecognizeCarResponse.Response.Data.PicUrl"));
		data.setSptId(_ctx.stringValue("RecognizeCarResponse.Response.Data.SptId"));
		data.setRoid(_ctx.stringValue("RecognizeCarResponse.Response.Data.Roid"));
		data.setTips(_ctx.stringValue("RecognizeCarResponse.Response.Data.Tips"));
		data.setDescription(_ctx.stringValue("RecognizeCarResponse.Response.Data.Description"));
		data.setPredictRes(_ctx.stringValue("RecognizeCarResponse.Response.Data.PredictRes"));
		response.setData(data);
		recognizeCarResponse.setResponse(response);
	 
	 	return recognizeCarResponse;
	}
}