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

package com.aliyuncs.iot.transform.v20170420;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20170420.QueryTopicRouteTableResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTopicRouteTableResponseUnmarshaller {

	public static QueryTopicRouteTableResponse unmarshall(QueryTopicRouteTableResponse queryTopicRouteTableResponse, UnmarshallerContext context) {
		
		queryTopicRouteTableResponse.setRequestId(context.stringValue("QueryTopicRouteTableResponse.RequestId"));
		queryTopicRouteTableResponse.setSuccess(context.booleanValue("QueryTopicRouteTableResponse.Success"));
		queryTopicRouteTableResponse.setCode(context.stringValue("QueryTopicRouteTableResponse.Code"));
		queryTopicRouteTableResponse.setErrorMessage(context.stringValue("QueryTopicRouteTableResponse.ErrorMessage"));

		List<String> dstTopics = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryTopicRouteTableResponse.DstTopics.Length"); i++) {
			dstTopics.add(context.stringValue("QueryTopicRouteTableResponse.DstTopics["+ i +"]"));
		}
		queryTopicRouteTableResponse.setDstTopics(dstTopics);
	 
	 	return queryTopicRouteTableResponse;
	}
}