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

package com.aliyuncs.aicontent.transform.v20240611;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aicontent.model.v20240611.Personalizedtxt2imgQueryInferenceJobInfoResponse;
import com.aliyuncs.aicontent.model.v20240611.Personalizedtxt2imgQueryInferenceJobInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class Personalizedtxt2imgQueryInferenceJobInfoResponseUnmarshaller {

	public static Personalizedtxt2imgQueryInferenceJobInfoResponse unmarshall(Personalizedtxt2imgQueryInferenceJobInfoResponse personalizedtxt2imgQueryInferenceJobInfoResponse, UnmarshallerContext _ctx) {
		
		personalizedtxt2imgQueryInferenceJobInfoResponse.setRequestId(_ctx.stringValue("Personalizedtxt2imgQueryInferenceJobInfoResponse.requestId"));
		personalizedtxt2imgQueryInferenceJobInfoResponse.setSuccess(_ctx.booleanValue("Personalizedtxt2imgQueryInferenceJobInfoResponse.success"));
		personalizedtxt2imgQueryInferenceJobInfoResponse.setErrCode(_ctx.stringValue("Personalizedtxt2imgQueryInferenceJobInfoResponse.errCode"));
		personalizedtxt2imgQueryInferenceJobInfoResponse.setErrMessage(_ctx.stringValue("Personalizedtxt2imgQueryInferenceJobInfoResponse.errMessage"));
		personalizedtxt2imgQueryInferenceJobInfoResponse.setHttpStatusCode(_ctx.integerValue("Personalizedtxt2imgQueryInferenceJobInfoResponse.httpStatusCode"));

		Data data = new Data();
		data.setId(_ctx.stringValue("Personalizedtxt2imgQueryInferenceJobInfoResponse.data.id"));
		data.setPromptId(_ctx.stringValue("Personalizedtxt2imgQueryInferenceJobInfoResponse.data.promptId"));
		data.setModelId(_ctx.stringValue("Personalizedtxt2imgQueryInferenceJobInfoResponse.data.modelId"));
		data.setJobStatus(_ctx.stringValue("Personalizedtxt2imgQueryInferenceJobInfoResponse.data.jobStatus"));
		data.setJobTrainProgress(_ctx.doubleValue("Personalizedtxt2imgQueryInferenceJobInfoResponse.data.jobTrainProgress"));
		data.setCreateTime(_ctx.stringValue("Personalizedtxt2imgQueryInferenceJobInfoResponse.data.createTime"));

		List<String> resultImageUrl = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("Personalizedtxt2imgQueryInferenceJobInfoResponse.data.resultImageUrl.Length"); i++) {
			resultImageUrl.add(_ctx.stringValue("Personalizedtxt2imgQueryInferenceJobInfoResponse.data.resultImageUrl["+ i +"]"));
		}
		data.setResultImageUrl(resultImageUrl);
		personalizedtxt2imgQueryInferenceJobInfoResponse.setData(data);
	 
	 	return personalizedtxt2imgQueryInferenceJobInfoResponse;
	}
}