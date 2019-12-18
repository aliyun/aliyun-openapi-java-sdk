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

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.CreateIntentionOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateIntentionOrderResponseUnmarshaller {

	public static CreateIntentionOrderResponse unmarshall(CreateIntentionOrderResponse createIntentionOrderResponse, UnmarshallerContext _ctx) {
		
		createIntentionOrderResponse.setRequestId(_ctx.stringValue("CreateIntentionOrderResponse.RequestId"));
		createIntentionOrderResponse.setSuccess(_ctx.booleanValue("CreateIntentionOrderResponse.Success"));
		createIntentionOrderResponse.setErrorMsg(_ctx.stringValue("CreateIntentionOrderResponse.ErrorMsg"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateIntentionOrderResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("CreateIntentionOrderResponse.Data["+ i +"]"));
		}
		createIntentionOrderResponse.setData(data);
	 
	 	return createIntentionOrderResponse;
	}
}