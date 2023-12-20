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

import com.aliyuncs.linkvisual.model.v20180120.QueryRtmpKeyResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryRtmpKeyResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRtmpKeyResponseUnmarshaller {

	public static QueryRtmpKeyResponse unmarshall(QueryRtmpKeyResponse queryRtmpKeyResponse, UnmarshallerContext _ctx) {
		
		queryRtmpKeyResponse.setRequestId(_ctx.stringValue("QueryRtmpKeyResponse.RequestId"));
		queryRtmpKeyResponse.setCode(_ctx.stringValue("QueryRtmpKeyResponse.Code"));
		queryRtmpKeyResponse.setErrorMessage(_ctx.stringValue("QueryRtmpKeyResponse.ErrorMessage"));
		queryRtmpKeyResponse.setSuccess(_ctx.booleanValue("QueryRtmpKeyResponse.Success"));

		Data data = new Data();
		data.setPullAuthKey(_ctx.stringValue("QueryRtmpKeyResponse.Data.PullAuthKey"));
		data.setPullKeyExpireTime(_ctx.integerValue("QueryRtmpKeyResponse.Data.PullKeyExpireTime"));
		data.setPushKeyExpireTime(_ctx.integerValue("QueryRtmpKeyResponse.Data.PushKeyExpireTime"));
		data.setStreamName(_ctx.stringValue("QueryRtmpKeyResponse.Data.StreamName"));
		data.setPushAuthKey(_ctx.stringValue("QueryRtmpKeyResponse.Data.PushAuthKey"));
		queryRtmpKeyResponse.setData(data);
	 
	 	return queryRtmpKeyResponse;
	}
}