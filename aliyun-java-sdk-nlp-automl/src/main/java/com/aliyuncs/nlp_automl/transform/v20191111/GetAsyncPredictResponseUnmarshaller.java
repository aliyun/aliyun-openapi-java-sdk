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

package com.aliyuncs.nlp_automl.transform.v20191111;

import com.aliyuncs.nlp_automl.model.v20191111.GetAsyncPredictResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAsyncPredictResponseUnmarshaller {

	public static GetAsyncPredictResponse unmarshall(GetAsyncPredictResponse getAsyncPredictResponse, UnmarshallerContext _ctx) {
		
		getAsyncPredictResponse.setRequestId(_ctx.stringValue("GetAsyncPredictResponse.RequestId"));
		getAsyncPredictResponse.setAsyncPredictId(_ctx.integerValue("GetAsyncPredictResponse.AsyncPredictId"));
		getAsyncPredictResponse.setStatus(_ctx.integerValue("GetAsyncPredictResponse.Status"));
		getAsyncPredictResponse.setContent(_ctx.stringValue("GetAsyncPredictResponse.Content"));
	 
	 	return getAsyncPredictResponse;
	}
}