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

import com.aliyuncs.retailcloud.model.v20180313.DeleteResAccountsResponse;
import com.aliyuncs.retailcloud.model.v20180313.DeleteResAccountsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteResAccountsResponseUnmarshaller {

	public static DeleteResAccountsResponse unmarshall(DeleteResAccountsResponse deleteResAccountsResponse, UnmarshallerContext context) {
		
		deleteResAccountsResponse.setRequestId(context.stringValue("DeleteResAccountsResponse.RequestId"));
		deleteResAccountsResponse.setCode(context.integerValue("DeleteResAccountsResponse.Code"));
		deleteResAccountsResponse.setSuccess(context.booleanValue("DeleteResAccountsResponse.Success"));
		deleteResAccountsResponse.setErrMsg(context.stringValue("DeleteResAccountsResponse.ErrMsg"));
		deleteResAccountsResponse.set_Class(context.stringValue("DeleteResAccountsResponse.Class"));
		deleteResAccountsResponse.setTransmitAliyun(context.booleanValue("DeleteResAccountsResponse.TransmitAliyun"));

		Result result = new Result();
		result.setRequestId(context.stringValue("DeleteResAccountsResponse.Result.RequestId"));
		result.set_Class(context.stringValue("DeleteResAccountsResponse.Result.Class"));
		deleteResAccountsResponse.setResult(result);
	 
	 	return deleteResAccountsResponse;
	}
}