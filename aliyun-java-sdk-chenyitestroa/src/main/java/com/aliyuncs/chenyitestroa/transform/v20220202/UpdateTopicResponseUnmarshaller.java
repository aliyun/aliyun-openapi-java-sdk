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

package com.aliyuncs.chenyitestroa.transform.v20220202;

import com.aliyuncs.chenyitestroa.model.v20220202.UpdateTopicResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTopicResponseUnmarshaller {

	public static UpdateTopicResponse unmarshall(UpdateTopicResponse updateTopicResponse, UnmarshallerContext _ctx) {
		
		updateTopicResponse.setTopicId(_ctx.stringValue("UpdateTopicResponse.TopicId"));
		updateTopicResponse.setRequestId(_ctx.stringValue("UpdateTopicResponse.requestId"));
	 
	 	return updateTopicResponse;
	}
}