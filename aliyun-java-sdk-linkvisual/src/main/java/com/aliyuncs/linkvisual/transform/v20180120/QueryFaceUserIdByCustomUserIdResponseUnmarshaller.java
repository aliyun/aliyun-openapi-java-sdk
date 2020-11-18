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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.QueryFaceUserIdByCustomUserIdResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryFaceUserIdByCustomUserIdResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFaceUserIdByCustomUserIdResponseUnmarshaller {

	public static QueryFaceUserIdByCustomUserIdResponse unmarshall(QueryFaceUserIdByCustomUserIdResponse queryFaceUserIdByCustomUserIdResponse, UnmarshallerContext _ctx) {
		
		queryFaceUserIdByCustomUserIdResponse.setRequestId(_ctx.stringValue("QueryFaceUserIdByCustomUserIdResponse.RequestId"));
		queryFaceUserIdByCustomUserIdResponse.setSuccess(_ctx.booleanValue("QueryFaceUserIdByCustomUserIdResponse.Success"));
		queryFaceUserIdByCustomUserIdResponse.setErrorMessage(_ctx.stringValue("QueryFaceUserIdByCustomUserIdResponse.ErrorMessage"));
		queryFaceUserIdByCustomUserIdResponse.setCode(_ctx.stringValue("QueryFaceUserIdByCustomUserIdResponse.Code"));

		Data data = new Data();
		data.setUserId(_ctx.stringValue("QueryFaceUserIdByCustomUserIdResponse.Data.UserId"));
		data.setCustomUserId(_ctx.stringValue("QueryFaceUserIdByCustomUserIdResponse.Data.CustomUserId"));
		data.setName(_ctx.stringValue("QueryFaceUserIdByCustomUserIdResponse.Data.Name"));
		data.setParams(_ctx.stringValue("QueryFaceUserIdByCustomUserIdResponse.Data.Params"));
		queryFaceUserIdByCustomUserIdResponse.setData(data);
	 
	 	return queryFaceUserIdByCustomUserIdResponse;
	}
}