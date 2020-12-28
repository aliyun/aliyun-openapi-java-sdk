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

import com.aliyuncs.nlp_automl.model.v20191111.CreateModelResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateModelResponseUnmarshaller {

	public static CreateModelResponse unmarshall(CreateModelResponse createModelResponse, UnmarshallerContext _ctx) {
		
		createModelResponse.setRequestId(_ctx.stringValue("CreateModelResponse.RequestId"));
		createModelResponse.setData(_ctx.mapValue("CreateModelResponse.Data"));
		createModelResponse.setCode(_ctx.integerValue("CreateModelResponse.Code"));
		createModelResponse.setMessage(_ctx.stringValue("CreateModelResponse.Message"));
		createModelResponse.setSuccess(_ctx.booleanValue("CreateModelResponse.Success"));
	 
	 	return createModelResponse;
	}
}