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

import com.aliyuncs.documentautoml.model.v20221229.PredictClassifierModelResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class PredictClassifierModelResponseUnmarshaller {

	public static PredictClassifierModelResponse unmarshall(PredictClassifierModelResponse predictClassifierModelResponse, UnmarshallerContext _ctx) {
		
		predictClassifierModelResponse.setRequestId(_ctx.stringValue("PredictClassifierModelResponse.RequestId"));
		predictClassifierModelResponse.setCode(_ctx.integerValue("PredictClassifierModelResponse.Code"));
		predictClassifierModelResponse.setData(_ctx.mapValue("PredictClassifierModelResponse.Data"));
		predictClassifierModelResponse.setMessage(_ctx.stringValue("PredictClassifierModelResponse.Message"));
	 
	 	return predictClassifierModelResponse;
	}
}