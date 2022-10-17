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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.AssignReviewerBySessionGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AssignReviewerBySessionGroupResponseUnmarshaller {

	public static AssignReviewerBySessionGroupResponse unmarshall(AssignReviewerBySessionGroupResponse assignReviewerBySessionGroupResponse, UnmarshallerContext _ctx) {
		
		assignReviewerBySessionGroupResponse.setRequestId(_ctx.stringValue("AssignReviewerBySessionGroupResponse.RequestId"));
		assignReviewerBySessionGroupResponse.setSuccess(_ctx.booleanValue("AssignReviewerBySessionGroupResponse.Success"));
		assignReviewerBySessionGroupResponse.setCode(_ctx.stringValue("AssignReviewerBySessionGroupResponse.Code"));
		assignReviewerBySessionGroupResponse.setMessage(_ctx.stringValue("AssignReviewerBySessionGroupResponse.Message"));
		assignReviewerBySessionGroupResponse.setHttpStatusCode(_ctx.integerValue("AssignReviewerBySessionGroupResponse.HttpStatusCode"));

		List<String> messages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AssignReviewerBySessionGroupResponse.Messages.Length"); i++) {
			messages.add(_ctx.stringValue("AssignReviewerBySessionGroupResponse.Messages["+ i +"]"));
		}
		assignReviewerBySessionGroupResponse.setMessages(messages);
	 
	 	return assignReviewerBySessionGroupResponse;
	}
}