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

	public static QueryTopicReverseRouteTableResponse unmarshall(QueryTopicReverseRouteTableResponse queryTopicReverseRouteTableResponse, UnmarshallerContext context) {
		
		queryTopicReverseRouteTableResponse.setRequestId(context.stringValue("QueryTopicReverseRouteTableResponse.RequestId"));
		queryTopicReverseRouteTableResponse.setSuccess(context.booleanValue("QueryTopicReverseRouteTableResponse.Success"));
		queryTopicReverseRouteTableResponse.setCode(context.stringValue("QueryTopicReverseRouteTableResponse.Code"));
		queryTopicReverseRouteTableResponse.setErrorMessage(context.stringValue("QueryTopicReverseRouteTableResponse.ErrorMessage"));

		List<String> srcTopics = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryTopicReverseRouteTableResponse.SrcTopics.Length"); i++) {
			srcTopics.add(context.stringValue("QueryTopicReverseRouteTableResponse.SrcTopics["+ i +"]"));
		}
		queryTopicReverseRouteTableResponse.setSrcTopics(srcTopics);
	 
	 	return queryTopicReverseRouteTableResponse;
	}
}