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

package com.aliyuncs.viapi_regen.transform.v20211119;

import com.aliyuncs.viapi_regen.model.v20211119.CustomizeClassifyImageResponse;
import com.aliyuncs.viapi_regen.model.v20211119.CustomizeClassifyImageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CustomizeClassifyImageResponseUnmarshaller {

	public static CustomizeClassifyImageResponse unmarshall(CustomizeClassifyImageResponse customizeClassifyImageResponse, UnmarshallerContext _ctx) {
		
		customizeClassifyImageResponse.setRequestId(_ctx.stringValue("CustomizeClassifyImageResponse.RequestId"));
		customizeClassifyImageResponse.setCode(_ctx.stringValue("CustomizeClassifyImageResponse.Code"));
		customizeClassifyImageResponse.setMessage(_ctx.stringValue("CustomizeClassifyImageResponse.Message"));

		Data data = new Data();
		data.setCategory(_ctx.stringValue("CustomizeClassifyImageResponse.Data.Category"));
		data.setScore(_ctx.floatValue("CustomizeClassifyImageResponse.Data.Score"));
		customizeClassifyImageResponse.setData(data);
	 
	 	return customizeClassifyImageResponse;
	}
}