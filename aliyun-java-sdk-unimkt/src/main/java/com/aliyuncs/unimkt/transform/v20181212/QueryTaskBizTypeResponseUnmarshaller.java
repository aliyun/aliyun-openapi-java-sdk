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

package com.aliyuncs.unimkt.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.unimkt.model.v20181212.QueryTaskBizTypeResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTaskBizTypeResponseUnmarshaller {

	public static QueryTaskBizTypeResponse unmarshall(QueryTaskBizTypeResponse queryTaskBizTypeResponse, UnmarshallerContext _ctx) {
		
		queryTaskBizTypeResponse.setRequestId(_ctx.stringValue("QueryTaskBizTypeResponse.RequestId"));
		queryTaskBizTypeResponse.setCode(_ctx.integerValue("QueryTaskBizTypeResponse.Code"));
		queryTaskBizTypeResponse.setSuccess(_ctx.booleanValue("QueryTaskBizTypeResponse.Success"));
		queryTaskBizTypeResponse.setErrorMsg(_ctx.stringValue("QueryTaskBizTypeResponse.ErrorMsg"));

		List<Map<Object, Object>> data = _ctx.listMapValue("QueryTaskBizTypeResponse.Data");
		queryTaskBizTypeResponse.setData(data);
	 
	 	return queryTaskBizTypeResponse;
	}
}