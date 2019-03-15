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

package com.aliyuncs.alikafka.transform.v20181015;

import com.aliyuncs.alikafka.model.v20181015.CreateTopicResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTopicResponseUnmarshaller {

	public static CreateTopicResponse unmarshall(CreateTopicResponse createTopicResponse, UnmarshallerContext context) {
		
		createTopicResponse.setRequestId(context.stringValue("CreateTopicResponse.RequestId"));
		createTopicResponse.setSuccess(context.booleanValue("CreateTopicResponse.Success"));
		createTopicResponse.setCode(context.integerValue("CreateTopicResponse.Code"));
		createTopicResponse.setMessage(context.stringValue("CreateTopicResponse.Message"));
	 
	 	return createTopicResponse;
	}
}