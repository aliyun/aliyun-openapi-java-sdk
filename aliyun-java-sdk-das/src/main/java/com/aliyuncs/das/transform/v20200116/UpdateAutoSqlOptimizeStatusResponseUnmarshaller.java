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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.UpdateAutoSqlOptimizeStatusResponse;
import com.aliyuncs.das.model.v20200116.UpdateAutoSqlOptimizeStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAutoSqlOptimizeStatusResponseUnmarshaller {

	public static UpdateAutoSqlOptimizeStatusResponse unmarshall(UpdateAutoSqlOptimizeStatusResponse updateAutoSqlOptimizeStatusResponse, UnmarshallerContext _ctx) {
		
		updateAutoSqlOptimizeStatusResponse.setRequestId(_ctx.stringValue("UpdateAutoSqlOptimizeStatusResponse.RequestId"));
		updateAutoSqlOptimizeStatusResponse.setCode(_ctx.stringValue("UpdateAutoSqlOptimizeStatusResponse.Code"));
		updateAutoSqlOptimizeStatusResponse.setMessage(_ctx.stringValue("UpdateAutoSqlOptimizeStatusResponse.Message"));
		updateAutoSqlOptimizeStatusResponse.setSuccess(_ctx.stringValue("UpdateAutoSqlOptimizeStatusResponse.Success"));

		Data data = new Data();
		data.setSuccess(_ctx.stringValue("UpdateAutoSqlOptimizeStatusResponse.Data.Success"));
		data.setErrorCode(_ctx.stringValue("UpdateAutoSqlOptimizeStatusResponse.Data.ErrorCode"));
		data.setErrorMsg(_ctx.stringValue("UpdateAutoSqlOptimizeStatusResponse.Data.ErrorMsg"));
		updateAutoSqlOptimizeStatusResponse.setData(data);
	 
	 	return updateAutoSqlOptimizeStatusResponse;
	}
}