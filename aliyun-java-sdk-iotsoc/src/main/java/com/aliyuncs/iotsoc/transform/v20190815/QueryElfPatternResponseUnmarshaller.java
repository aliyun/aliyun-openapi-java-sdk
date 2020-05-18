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

package com.aliyuncs.iotsoc.transform.v20190815;

import com.aliyuncs.iotsoc.model.v20190815.QueryElfPatternResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryElfPatternResponseUnmarshaller {

	public static QueryElfPatternResponse unmarshall(QueryElfPatternResponse queryElfPatternResponse, UnmarshallerContext _ctx) {
		
		queryElfPatternResponse.setRequestId(_ctx.stringValue("QueryElfPatternResponse.RequestId"));
		queryElfPatternResponse.setData(_ctx.stringValue("QueryElfPatternResponse.Data"));
		queryElfPatternResponse.setCode(_ctx.stringValue("QueryElfPatternResponse.Code"));
	 
	 	return queryElfPatternResponse;
	}
}