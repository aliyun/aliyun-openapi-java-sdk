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

import com.aliyuncs.retailcloud.model.v20180313.CreateDbResponse;
import com.aliyuncs.retailcloud.model.v20180313.CreateDbResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDbResponseUnmarshaller {

	public static CreateDbResponse unmarshall(CreateDbResponse createDbResponse, UnmarshallerContext context) {
		
		createDbResponse.setRequestId(context.stringValue("CreateDbResponse.RequestId"));
		createDbResponse.setCode(context.integerValue("CreateDbResponse.Code"));
		createDbResponse.setSuccess(context.booleanValue("CreateDbResponse.Success"));
		createDbResponse.setErrMsg(context.stringValue("CreateDbResponse.ErrMsg"));
		createDbResponse.set_Class(context.stringValue("CreateDbResponse.Class"));
		createDbResponse.setTransmitAliyun(context.booleanValue("CreateDbResponse.TransmitAliyun"));

		Result result = new Result();
		result.set_Class(context.stringValue("CreateDbResponse.Result.Class"));
		createDbResponse.setResult(result);
	 
	 	return createDbResponse;
	}
}