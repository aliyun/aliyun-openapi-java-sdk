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

import com.aliyuncs.iot.model.v20180120.CreateTopicRouteTableResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTopicRouteTableResponseUnmarshaller {

	public static CreateTopicRouteTableResponse unmarshall(CreateTopicRouteTableResponse createTopicRouteTableResponse, UnmarshallerContext _ctx) {
		
		createTopicRouteTableResponse.setRequestId(_ctx.stringValue("CreateTopicRouteTableResponse.RequestId"));
		createTopicRouteTableResponse.setSuccess(_ctx.booleanValue("CreateTopicRouteTableResponse.Success"));
		createTopicRouteTableResponse.setCode(_ctx.stringValue("CreateTopicRouteTableResponse.Code"));
		createTopicRouteTableResponse.setIsAllSucceed(_ctx.booleanValue("CreateTopicRouteTableResponse.IsAllSucceed"));
		createTopicRouteTableResponse.setErrorMessage(_ctx.stringValue("CreateTopicRouteTableResponse.ErrorMessage"));

		List<Map<Object, Object>> failureTopics = _ctx.listMapValue("CreateTopicRouteTableResponse.FailureTopics");
		createTopicRouteTableResponse.setFailureTopics(failureTopics);
	 
	 	return createTopicRouteTableResponse;
	}
}