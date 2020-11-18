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

import com.aliyuncs.linkvisual.model.v20180120.QueryFaceCustomUserIdByUserIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFaceCustomUserIdByUserIdResponseUnmarshaller {

	public static QueryFaceCustomUserIdByUserIdResponse unmarshall(QueryFaceCustomUserIdByUserIdResponse queryFaceCustomUserIdByUserIdResponse, UnmarshallerContext _ctx) {
		
		queryFaceCustomUserIdByUserIdResponse.setRequestId(_ctx.stringValue("QueryFaceCustomUserIdByUserIdResponse.RequestId"));
		queryFaceCustomUserIdByUserIdResponse.setSuccess(_ctx.booleanValue("QueryFaceCustomUserIdByUserIdResponse.Success"));
		queryFaceCustomUserIdByUserIdResponse.setErrorMessage(_ctx.stringValue("QueryFaceCustomUserIdByUserIdResponse.ErrorMessage"));
		queryFaceCustomUserIdByUserIdResponse.setCode(_ctx.stringValue("QueryFaceCustomUserIdByUserIdResponse.Code"));
		queryFaceCustomUserIdByUserIdResponse.setData(_ctx.stringValue("QueryFaceCustomUserIdByUserIdResponse.Data"));
	 
	 	return queryFaceCustomUserIdByUserIdResponse;
	}
}