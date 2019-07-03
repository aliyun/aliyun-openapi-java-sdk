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

import com.aliyuncs.iot.model.v20180120.QueryTopicRouteTableResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTopicRouteTableResponseUnmarshaller {

	public static QueryTopicRouteTableResponse unmarshall(QueryTopicRouteTableResponse queryTopicRouteTableResponse, UnmarshallerContext _ctx) {
		
		queryTopicRouteTableResponse.setRequestId(_ctx.stringValue("QueryTopicRouteTableResponse.RequestId"));
		queryTopicRouteTableResponse.setSuccess(_ctx.booleanValue("QueryTopicRouteTableResponse.Success"));
		queryTopicRouteTableResponse.setCode(_ctx.stringValue("QueryTopicRouteTableResponse.Code"));
		queryTopicRouteTableResponse.setErrorMessage(_ctx.stringValue("QueryTopicRouteTableResponse.ErrorMessage"));

		List<String> dstTopics = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryTopicRouteTableResponse.DstTopics.Length"); i++) {
			dstTopics.add(_ctx.stringValue("QueryTopicRouteTableResponse.DstTopics["+ i +"]"));
		}
		queryTopicRouteTableResponse.setDstTopics(dstTopics);
	 
	 	return queryTopicRouteTableResponse;
	}
}