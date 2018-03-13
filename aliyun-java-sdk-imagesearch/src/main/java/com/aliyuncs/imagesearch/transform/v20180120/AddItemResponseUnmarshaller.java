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
package com.aliyuncs.imagesearch.transform.v20180120;

import com.aliyuncs.imagesearch.model.v20180120.AddItemResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddItemResponseUnmarshaller {

	public static AddItemResponse unmarshall(AddItemResponse addItemResponse, UnmarshallerContext context) {
		
		addItemResponse.setRequestId(context.stringValue("AddItemResponse.RequestId"));
		addItemResponse.setSuccess(context.booleanValue("AddItemResponse.Success"));
		addItemResponse.setMessage(context.stringValue("AddItemResponse.Message"));
		addItemResponse.setCode(context.integerValue("AddItemResponse.Code"));
	 
	 	return addItemResponse;
	}
}