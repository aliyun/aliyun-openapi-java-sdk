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

package com.aliyuncs.airec.transform.v20201126;

import com.aliyuncs.airec.model.v20201126.QueryRawDataResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRawDataResponseUnmarshaller {

	public static QueryRawDataResponse unmarshall(QueryRawDataResponse queryRawDataResponse, UnmarshallerContext _ctx) {
		
		queryRawDataResponse.setCode(_ctx.stringValue("QueryRawDataResponse.code"));
		queryRawDataResponse.setMessage(_ctx.stringValue("QueryRawDataResponse.Message"));
		queryRawDataResponse.setRequestId(_ctx.stringValue("QueryRawDataResponse.requestId"));
		queryRawDataResponse.setResult(_ctx.mapValue("QueryRawDataResponse.result"));
	 
	 	return queryRawDataResponse;
	}
}