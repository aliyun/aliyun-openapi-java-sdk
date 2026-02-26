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

import com.aliyuncs.aicontent.model.v20240611.Personalizedtxt2imgAddInferenceJobResponse;
import com.aliyuncs.aicontent.model.v20240611.Personalizedtxt2imgAddInferenceJobResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class Personalizedtxt2imgAddInferenceJobResponseUnmarshaller {

	public static Personalizedtxt2imgAddInferenceJobResponse unmarshall(Personalizedtxt2imgAddInferenceJobResponse personalizedtxt2imgAddInferenceJobResponse, UnmarshallerContext _ctx) {
		
		personalizedtxt2imgAddInferenceJobResponse.setRequestId(_ctx.stringValue("Personalizedtxt2imgAddInferenceJobResponse.requestId"));
		personalizedtxt2imgAddInferenceJobResponse.setSuccess(_ctx.booleanValue("Personalizedtxt2imgAddInferenceJobResponse.success"));
		personalizedtxt2imgAddInferenceJobResponse.setErrCode(_ctx.stringValue("Personalizedtxt2imgAddInferenceJobResponse.errCode"));
		personalizedtxt2imgAddInferenceJobResponse.setErrMessage(_ctx.stringValue("Personalizedtxt2imgAddInferenceJobResponse.errMessage"));
		personalizedtxt2imgAddInferenceJobResponse.setHttpStatusCode(_ctx.integerValue("Personalizedtxt2imgAddInferenceJobResponse.httpStatusCode"));

		Data data = new Data();
		data.setId(_ctx.stringValue("Personalizedtxt2imgAddInferenceJobResponse.data.id"));
		data.setPromptId(_ctx.stringValue("Personalizedtxt2imgAddInferenceJobResponse.data.promptId"));
		data.setModelId(_ctx.stringValue("Personalizedtxt2imgAddInferenceJobResponse.data.modelId"));
		data.setJobStatus(_ctx.stringValue("Personalizedtxt2imgAddInferenceJobResponse.data.jobStatus"));
		data.setJobTrainProgress(_ctx.doubleValue("Personalizedtxt2imgAddInferenceJobResponse.data.jobTrainProgress"));
		data.setCreateTime(_ctx.stringValue("Personalizedtxt2imgAddInferenceJobResponse.data.createTime"));

		List<String> resultImageUrl = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("Personalizedtxt2imgAddInferenceJobResponse.data.resultImageUrl.Length"); i++) {
			resultImageUrl.add(_ctx.stringValue("Personalizedtxt2imgAddInferenceJobResponse.data.resultImageUrl["+ i +"]"));
		}
		data.setResultImageUrl(resultImageUrl);
		personalizedtxt2imgAddInferenceJobResponse.setData(data);
	 
	 	return personalizedtxt2imgAddInferenceJobResponse;
	}
}