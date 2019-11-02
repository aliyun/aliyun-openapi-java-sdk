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

package com.aliyuncs.dyvmsapi.transform.v20170525;

import com.aliyuncs.dyvmsapi.model.v20170525.QueryRobotv2AllListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRobotv2AllListResponseUnmarshaller {

	public static QueryRobotv2AllListResponse unmarshall(QueryRobotv2AllListResponse queryRobotv2AllListResponse, UnmarshallerContext _ctx) {
		
		queryRobotv2AllListResponse.setRequestId(_ctx.stringValue("QueryRobotv2AllListResponse.RequestId"));
		queryRobotv2AllListResponse.setData(_ctx.stringValue("QueryRobotv2AllListResponse.Data"));
		queryRobotv2AllListResponse.setCode(_ctx.stringValue("QueryRobotv2AllListResponse.Code"));
		queryRobotv2AllListResponse.setMessage(_ctx.stringValue("QueryRobotv2AllListResponse.Message"));
	 
	 	return queryRobotv2AllListResponse;
	}
}