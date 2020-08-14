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

package com.aliyuncs.opensearch.transform.v20171225;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.opensearch.model.v20171225.GetValidationErrorResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetValidationErrorResponseUnmarshaller {

	public static GetValidationErrorResponse unmarshall(GetValidationErrorResponse getValidationErrorResponse, UnmarshallerContext _ctx) {
		
		getValidationErrorResponse.setRequestId(_ctx.stringValue("GetValidationErrorResponse.requestId"));

		List<Map<Object, Object>> result = _ctx.listMapValue("GetValidationErrorResponse.result");
		getValidationErrorResponse.setResult(result);
	 
	 	return getValidationErrorResponse;
	}
}