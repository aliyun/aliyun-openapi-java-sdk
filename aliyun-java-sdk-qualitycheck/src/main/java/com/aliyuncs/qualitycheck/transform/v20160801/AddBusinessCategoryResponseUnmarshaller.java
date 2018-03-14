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

package com.aliyuncs.qualitycheck.transform.v20160801;

import com.aliyuncs.qualitycheck.model.v20160801.AddBusinessCategoryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddBusinessCategoryResponseUnmarshaller {

	public static AddBusinessCategoryResponse unmarshall(AddBusinessCategoryResponse addBusinessCategoryResponse, UnmarshallerContext context) {
		
		addBusinessCategoryResponse.setRequestId(context.stringValue("AddBusinessCategoryResponse.RequestId"));
		addBusinessCategoryResponse.setSuccess(context.booleanValue("AddBusinessCategoryResponse.Success"));
		addBusinessCategoryResponse.setCode(context.stringValue("AddBusinessCategoryResponse.Code"));
		addBusinessCategoryResponse.setMessage(context.stringValue("AddBusinessCategoryResponse.Message"));
	 
	 	return addBusinessCategoryResponse;
	}
}