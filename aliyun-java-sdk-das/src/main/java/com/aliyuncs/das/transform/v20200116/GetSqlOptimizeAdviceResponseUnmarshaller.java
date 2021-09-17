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

import com.aliyuncs.das.model.v20200116.GetSqlOptimizeAdviceResponse;
import com.aliyuncs.das.model.v20200116.GetSqlOptimizeAdviceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSqlOptimizeAdviceResponseUnmarshaller {

	public static GetSqlOptimizeAdviceResponse unmarshall(GetSqlOptimizeAdviceResponse getSqlOptimizeAdviceResponse, UnmarshallerContext _ctx) {
		
		getSqlOptimizeAdviceResponse.setRequestId(_ctx.stringValue("GetSqlOptimizeAdviceResponse.RequestId"));
		getSqlOptimizeAdviceResponse.setCode(_ctx.stringValue("GetSqlOptimizeAdviceResponse.Code"));
		getSqlOptimizeAdviceResponse.setMessage(_ctx.stringValue("GetSqlOptimizeAdviceResponse.Message"));
		getSqlOptimizeAdviceResponse.setSuccess(_ctx.stringValue("GetSqlOptimizeAdviceResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetSqlOptimizeAdviceResponse.Data.Status"));
		data.setStatusCode(_ctx.stringValue("GetSqlOptimizeAdviceResponse.Data.StatusCode"));
		data.setDownloadUrl(_ctx.stringValue("GetSqlOptimizeAdviceResponse.Data.DownloadUrl"));
		data.setCreateTime(_ctx.stringValue("GetSqlOptimizeAdviceResponse.Data.CreateTime"));
		data.setExpireTime(_ctx.stringValue("GetSqlOptimizeAdviceResponse.Data.ExpireTime"));
		data.setTaskId(_ctx.stringValue("GetSqlOptimizeAdviceResponse.Data.TaskId"));
		getSqlOptimizeAdviceResponse.setData(data);
	 
	 	return getSqlOptimizeAdviceResponse;
	}
}