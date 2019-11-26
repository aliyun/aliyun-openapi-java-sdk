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

import com.aliyuncs.dyvms.model.v20170620.QueryRobotv2SemanticDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRobotv2SemanticDetailResponseUnmarshaller {

	public static QueryRobotv2SemanticDetailResponse unmarshall(QueryRobotv2SemanticDetailResponse queryRobotv2SemanticDetailResponse, UnmarshallerContext _ctx) {
		
		queryRobotv2SemanticDetailResponse.setRequestId(_ctx.stringValue("QueryRobotv2SemanticDetailResponse.RequestId"));
		queryRobotv2SemanticDetailResponse.setCode(_ctx.stringValue("QueryRobotv2SemanticDetailResponse.code"));
		queryRobotv2SemanticDetailResponse.setData(_ctx.stringValue("QueryRobotv2SemanticDetailResponse.data"));
	 
	 	return queryRobotv2SemanticDetailResponse;
	}
}