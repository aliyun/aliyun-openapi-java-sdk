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

package com.aliyuncs.elasticsearch.transform.v20170613;

import com.aliyuncs.elasticsearch.model.v20170613.CreateCollectorResponse;
import com.aliyuncs.elasticsearch.model.v20170613.CreateCollectorResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCollectorResponseUnmarshaller {

	public static CreateCollectorResponse unmarshall(CreateCollectorResponse createCollectorResponse, UnmarshallerContext _ctx) {
		
		createCollectorResponse.setRequestId(_ctx.stringValue("CreateCollectorResponse.RequestId"));

		Result result = new Result();
		result.setResId(_ctx.stringValue("CreateCollectorResponse.Result.resId"));
		createCollectorResponse.setResult(result);
	 
	 	return createCollectorResponse;
	}
}