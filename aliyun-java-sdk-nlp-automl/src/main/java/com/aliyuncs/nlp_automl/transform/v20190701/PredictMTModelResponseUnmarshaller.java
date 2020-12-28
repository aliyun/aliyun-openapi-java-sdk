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

package com.aliyuncs.nlp_automl.transform.v20190701;

import com.aliyuncs.nlp_automl.model.v20190701.PredictMTModelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PredictMTModelResponseUnmarshaller {

	public static PredictMTModelResponse unmarshall(PredictMTModelResponse predictMTModelResponse, UnmarshallerContext _ctx) {
		
		predictMTModelResponse.setRequestId(_ctx.stringValue("PredictMTModelResponse.RequestId"));
		predictMTModelResponse.setCode(_ctx.integerValue("PredictMTModelResponse.Code"));
		predictMTModelResponse.setMessage(_ctx.integerValue("PredictMTModelResponse.Message"));
		predictMTModelResponse.setData(_ctx.stringValue("PredictMTModelResponse.Data"));
	 
	 	return predictMTModelResponse;
	}
}