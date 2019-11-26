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

package com.aliyuncs.dyvms.transform.v20170620;

import com.aliyuncs.dyvms.model.v20170620.QueryRobotv2WorkorderPageListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRobotv2WorkorderPageListResponseUnmarshaller {

	public static QueryRobotv2WorkorderPageListResponse unmarshall(QueryRobotv2WorkorderPageListResponse queryRobotv2WorkorderPageListResponse, UnmarshallerContext _ctx) {
		
		queryRobotv2WorkorderPageListResponse.setRequestId(_ctx.stringValue("QueryRobotv2WorkorderPageListResponse.RequestId"));
		queryRobotv2WorkorderPageListResponse.setCode(_ctx.stringValue("QueryRobotv2WorkorderPageListResponse.code"));
		queryRobotv2WorkorderPageListResponse.setData(_ctx.stringValue("QueryRobotv2WorkorderPageListResponse.data"));
	 
	 	return queryRobotv2WorkorderPageListResponse;
	}
}