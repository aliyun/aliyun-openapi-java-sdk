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

import com.aliyuncs.elasticsearch.model.v20170613.CreateDataStreamResponse;
import com.aliyuncs.elasticsearch.model.v20170613.CreateDataStreamResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDataStreamResponseUnmarshaller {

	public static CreateDataStreamResponse unmarshall(CreateDataStreamResponse createDataStreamResponse, UnmarshallerContext _ctx) {
		
		createDataStreamResponse.setRequestId(_ctx.stringValue("CreateDataStreamResponse.RequestId"));

		Result result = new Result();
		result.setName(_ctx.stringValue("CreateDataStreamResponse.Result.name"));
		createDataStreamResponse.setResult(result);
	 
	 	return createDataStreamResponse;
	}
}