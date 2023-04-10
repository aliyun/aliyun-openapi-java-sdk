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

package com.aliyuncs.documentautoml.transform.v20221229;

import com.aliyuncs.documentautoml.model.v20221229.PredictTemplateModelResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class PredictTemplateModelResponseUnmarshaller {

	public static PredictTemplateModelResponse unmarshall(PredictTemplateModelResponse predictTemplateModelResponse, UnmarshallerContext _ctx) {
		
		predictTemplateModelResponse.setRequestId(_ctx.stringValue("PredictTemplateModelResponse.RequestId"));
		predictTemplateModelResponse.setData(_ctx.mapValue("PredictTemplateModelResponse.Data"));
		predictTemplateModelResponse.setMessage(_ctx.stringValue("PredictTemplateModelResponse.Message"));
		predictTemplateModelResponse.setCode(_ctx.stringValue("PredictTemplateModelResponse.Code"));
	 
	 	return predictTemplateModelResponse;
	}
}