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

import com.aliyuncs.documentautoml.model.v20221229.GetModelAsyncPredictResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetModelAsyncPredictResponseUnmarshaller {

	public static GetModelAsyncPredictResponse unmarshall(GetModelAsyncPredictResponse getModelAsyncPredictResponse, UnmarshallerContext _ctx) {
		
		getModelAsyncPredictResponse.setRequestId(_ctx.stringValue("GetModelAsyncPredictResponse.RequestId"));
		getModelAsyncPredictResponse.setCode(_ctx.integerValue("GetModelAsyncPredictResponse.Code"));
		getModelAsyncPredictResponse.setMessage(_ctx.stringValue("GetModelAsyncPredictResponse.Message"));
		getModelAsyncPredictResponse.setData(_ctx.stringValue("GetModelAsyncPredictResponse.Data"));
	 
	 	return getModelAsyncPredictResponse;
	}
}