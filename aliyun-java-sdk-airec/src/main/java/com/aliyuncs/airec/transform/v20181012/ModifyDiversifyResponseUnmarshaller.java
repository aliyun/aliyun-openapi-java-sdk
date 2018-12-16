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

import com.aliyuncs.airec.model.v20181012.ModifyDiversifyResponse;
import com.aliyuncs.airec.model.v20181012.ModifyDiversifyResponse.Result;
import com.aliyuncs.airec.model.v20181012.ModifyDiversifyResponse.Result.Parameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyDiversifyResponseUnmarshaller {

	public static ModifyDiversifyResponse unmarshall(ModifyDiversifyResponse modifyDiversifyResponse, UnmarshallerContext context) {
		
		modifyDiversifyResponse.setRequestId(context.stringValue("ModifyDiversifyResponse.RequestId"));
		modifyDiversifyResponse.setCode(context.stringValue("ModifyDiversifyResponse.Code"));
		modifyDiversifyResponse.setMessage(context.stringValue("ModifyDiversifyResponse.Message"));

		Result result = new Result();
		result.setName(context.stringValue("ModifyDiversifyResponse.Result.Name"));
		result.setGmtCreate(context.stringValue("ModifyDiversifyResponse.Result.GmtCreate"));
		result.setGmtModified(context.stringValue("ModifyDiversifyResponse.Result.GmtModified"));

		Parameter parameter = new Parameter();
		parameter.setCategoryIndex(context.integerValue("ModifyDiversifyResponse.Result.Parameter.CategoryIndex"));
		parameter.setWindow(context.integerValue("ModifyDiversifyResponse.Result.Parameter.Window"));
		result.setParameter(parameter);
		modifyDiversifyResponse.setResult(result);
	 
	 	return modifyDiversifyResponse;
	}
}