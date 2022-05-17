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

package com.aliyuncs.retailbot.transform.v20210224;

import com.aliyuncs.retailbot.model.v20210224.QueryByTaskIdResponse;
import com.aliyuncs.retailbot.model.v20210224.QueryByTaskIdResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryByTaskIdResponseUnmarshaller {

	public static QueryByTaskIdResponse unmarshall(QueryByTaskIdResponse queryByTaskIdResponse, UnmarshallerContext _ctx) {
		
		queryByTaskIdResponse.setRequestId(_ctx.stringValue("QueryByTaskIdResponse.RequestId"));
		queryByTaskIdResponse.setSuccess(_ctx.booleanValue("QueryByTaskIdResponse.Success"));
		queryByTaskIdResponse.setCode(_ctx.stringValue("QueryByTaskIdResponse.Code"));
		queryByTaskIdResponse.setMessage(_ctx.stringValue("QueryByTaskIdResponse.Message"));

		Data data = new Data();
		data.setRobotCode(_ctx.stringValue("QueryByTaskIdResponse.Data.RobotCode"));
		data.setEndpoint(_ctx.stringValue("QueryByTaskIdResponse.Data.Endpoint"));
		data.setAccessKeyId(_ctx.stringValue("QueryByTaskIdResponse.Data.AccessKeyId"));
		data.setAccessKeySecret(_ctx.stringValue("QueryByTaskIdResponse.Data.AccessKeySecret"));
		data.setSecurityToken(_ctx.stringValue("QueryByTaskIdResponse.Data.SecurityToken"));
		data.setBucketName(_ctx.stringValue("QueryByTaskIdResponse.Data.BucketName"));
		data.setExpirationDate(_ctx.longValue("QueryByTaskIdResponse.Data.ExpirationDate"));
		data.setAnswerFilePath(_ctx.stringValue("QueryByTaskIdResponse.Data.AnswerFilePath"));
		data.setQueryFilePath(_ctx.stringValue("QueryByTaskIdResponse.Data.QueryFilePath"));
		queryByTaskIdResponse.setData(data);
	 
	 	return queryByTaskIdResponse;
	}
}