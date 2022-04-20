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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.CreateCustomCallTaggingResponse;
import com.aliyuncs.ccc.model.v20200701.CreateCustomCallTaggingResponse.FailureItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCustomCallTaggingResponseUnmarshaller {

	public static CreateCustomCallTaggingResponse unmarshall(CreateCustomCallTaggingResponse createCustomCallTaggingResponse, UnmarshallerContext _ctx) {
		
		createCustomCallTaggingResponse.setRequestId(_ctx.stringValue("CreateCustomCallTaggingResponse.RequestId"));
		createCustomCallTaggingResponse.setHttpStatusCode(_ctx.integerValue("CreateCustomCallTaggingResponse.HttpStatusCode"));
		createCustomCallTaggingResponse.setCode(_ctx.stringValue("CreateCustomCallTaggingResponse.Code"));
		createCustomCallTaggingResponse.setMessage(_ctx.stringValue("CreateCustomCallTaggingResponse.Message"));

		List<FailureItem> data = new ArrayList<FailureItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateCustomCallTaggingResponse.Data.Length"); i++) {
			FailureItem failureItem = new FailureItem();
			failureItem.setItem(_ctx.stringValue("CreateCustomCallTaggingResponse.Data["+ i +"].Item"));
			failureItem.setReason(_ctx.stringValue("CreateCustomCallTaggingResponse.Data["+ i +"].Reason"));

			data.add(failureItem);
		}
		createCustomCallTaggingResponse.setData(data);
	 
	 	return createCustomCallTaggingResponse;
	}
}