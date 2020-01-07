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

import com.aliyuncs.retailcloud.model.v20180313.DeleteRdsAccountResponse;
import com.aliyuncs.retailcloud.model.v20180313.DeleteRdsAccountResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRdsAccountResponseUnmarshaller {

	public static DeleteRdsAccountResponse unmarshall(DeleteRdsAccountResponse deleteRdsAccountResponse, UnmarshallerContext _ctx) {
		
		deleteRdsAccountResponse.setRequestId(_ctx.stringValue("DeleteRdsAccountResponse.RequestId"));
		deleteRdsAccountResponse.setErrMsg(_ctx.stringValue("DeleteRdsAccountResponse.ErrMsg"));
		deleteRdsAccountResponse.setCode(_ctx.integerValue("DeleteRdsAccountResponse.Code"));

		Result result = new Result();
		result.setRequestId(_ctx.stringValue("DeleteRdsAccountResponse.Result.RequestId"));
		deleteRdsAccountResponse.setResult(result);
	 
	 	return deleteRdsAccountResponse;
	}
}