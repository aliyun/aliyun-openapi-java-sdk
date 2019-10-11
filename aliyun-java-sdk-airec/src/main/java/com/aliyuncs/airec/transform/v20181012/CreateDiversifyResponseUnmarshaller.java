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

	public static CreateDiversifyResponse unmarshall(CreateDiversifyResponse createDiversifyResponse, UnmarshallerContext _ctx) {
		
		createDiversifyResponse.setRequestId(_ctx.stringValue("CreateDiversifyResponse.RequestId"));
		createDiversifyResponse.setCode(_ctx.stringValue("CreateDiversifyResponse.Code"));
		createDiversifyResponse.setMessage(_ctx.stringValue("CreateDiversifyResponse.Message"));

		Result result = new Result();
		result.setName(_ctx.stringValue("CreateDiversifyResponse.Result.Name"));
		result.setGmtCreate(_ctx.stringValue("CreateDiversifyResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.stringValue("CreateDiversifyResponse.Result.GmtModified"));

		Parameter parameter = new Parameter();
		parameter.setCategoryIndex(_ctx.integerValue("CreateDiversifyResponse.Result.Parameter.CategoryIndex"));
		parameter.setWindow(_ctx.integerValue("CreateDiversifyResponse.Result.Parameter.Window"));
		result.setParameter(parameter);
		createDiversifyResponse.setResult(result);
	 
	 	return createDiversifyResponse;
	}
}