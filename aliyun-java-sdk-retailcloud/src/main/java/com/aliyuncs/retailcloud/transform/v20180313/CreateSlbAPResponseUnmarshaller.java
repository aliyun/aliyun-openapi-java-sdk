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

package com.aliyuncs.retailcloud.transform.v20180313;

import com.aliyuncs.retailcloud.model.v20180313.CreateSlbAPResponse;
import com.aliyuncs.retailcloud.model.v20180313.CreateSlbAPResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSlbAPResponseUnmarshaller {

	public static CreateSlbAPResponse unmarshall(CreateSlbAPResponse createSlbAPResponse, UnmarshallerContext _ctx) {
		
		createSlbAPResponse.setRequestId(_ctx.stringValue("CreateSlbAPResponse.RequestId"));
		createSlbAPResponse.setCode(_ctx.integerValue("CreateSlbAPResponse.Code"));
		createSlbAPResponse.setErrMsg(_ctx.stringValue("CreateSlbAPResponse.ErrMsg"));
		createSlbAPResponse.setSuccess(_ctx.booleanValue("CreateSlbAPResponse.Success"));

		Result result = new Result();
		result.setSlbAPId(_ctx.longValue("CreateSlbAPResponse.Result.SlbAPId"));
		createSlbAPResponse.setResult(result);
	 
	 	return createSlbAPResponse;
	}
}