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

package com.aliyuncs.commondriver.transform.v20160712;

import com.aliyuncs.commondriver.model.v20160712.QueryHostResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryHostResponseUnmarshaller {

	public static QueryHostResponse unmarshall(QueryHostResponse queryHostResponse, UnmarshallerContext _ctx) {
		
		queryHostResponse.setRequestId(_ctx.stringValue("QueryHostResponse.RequestId"));
		queryHostResponse.setCode(_ctx.stringValue("QueryHostResponse.Code"));
		queryHostResponse.setMessage(_ctx.stringValue("QueryHostResponse.Message"));
		queryHostResponse.setData(_ctx.stringValue("QueryHostResponse.Data"));
		queryHostResponse.setSuccess(_ctx.booleanValue("QueryHostResponse.Success"));
	 
	 	return queryHostResponse;
	}
}