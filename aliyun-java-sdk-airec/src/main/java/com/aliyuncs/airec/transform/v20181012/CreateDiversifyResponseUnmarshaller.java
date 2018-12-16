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

package com.aliyuncs.airec.transform.v20181012;

import com.aliyuncs.airec.model.v20181012.CreateDiversifyResponse;
import com.aliyuncs.airec.model.v20181012.CreateDiversifyResponse.Result;
import com.aliyuncs.airec.model.v20181012.CreateDiversifyResponse.Result.Parameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDiversifyResponseUnmarshaller {

	public static CreateDiversifyResponse unmarshall(CreateDiversifyResponse createDiversifyResponse, UnmarshallerContext context) {
		
		createDiversifyResponse.setRequestId(context.stringValue("CreateDiversifyResponse.RequestId"));
		createDiversifyResponse.setCode(context.stringValue("CreateDiversifyResponse.Code"));
		createDiversifyResponse.setMessage(context.stringValue("CreateDiversifyResponse.Message"));

		Result result = new Result();
		result.setName(context.stringValue("CreateDiversifyResponse.Result.Name"));
		result.setGmtCreate(context.stringValue("CreateDiversifyResponse.Result.GmtCreate"));
		result.setGmtModified(context.stringValue("CreateDiversifyResponse.Result.GmtModified"));

		Parameter parameter = new Parameter();
		parameter.setCategoryIndex(context.integerValue("CreateDiversifyResponse.Result.Parameter.CategoryIndex"));
		parameter.setWindow(context.integerValue("CreateDiversifyResponse.Result.Parameter.Window"));
		result.setParameter(parameter);
		createDiversifyResponse.setResult(result);
	 
	 	return createDiversifyResponse;
	}
}