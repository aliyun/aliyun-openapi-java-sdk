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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryTopicReverseRouteTableResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTopicReverseRouteTableResponseUnmarshaller {

	public static QueryTopicReverseRouteTableResponse unmarshall(QueryTopicReverseRouteTableResponse queryTopicReverseRouteTableResponse, UnmarshallerContext _ctx) {
		
		queryTopicReverseRouteTableResponse.setRequestId(_ctx.stringValue("QueryTopicReverseRouteTableResponse.RequestId"));
		queryTopicReverseRouteTableResponse.setSuccess(_ctx.booleanValue("QueryTopicReverseRouteTableResponse.Success"));
		queryTopicReverseRouteTableResponse.setCode(_ctx.stringValue("QueryTopicReverseRouteTableResponse.Code"));
		queryTopicReverseRouteTableResponse.setErrorMessage(_ctx.stringValue("QueryTopicReverseRouteTableResponse.ErrorMessage"));

		List<Map<Object, Object>> srcTopics = _ctx.listMapValue("QueryTopicReverseRouteTableResponse.SrcTopics");
		queryTopicReverseRouteTableResponse.setSrcTopics(srcTopics);
	 
	 	return queryTopicReverseRouteTableResponse;
	}
}