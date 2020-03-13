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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.DeleteMqSofamqTopicResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMqSofamqTopicResponseUnmarshaller {

	public static DeleteMqSofamqTopicResponse unmarshall(DeleteMqSofamqTopicResponse deleteMqSofamqTopicResponse, UnmarshallerContext _ctx) {
		
		deleteMqSofamqTopicResponse.setRequestId(_ctx.stringValue("DeleteMqSofamqTopicResponse.RequestId"));
		deleteMqSofamqTopicResponse.setResultCode(_ctx.stringValue("DeleteMqSofamqTopicResponse.ResultCode"));
		deleteMqSofamqTopicResponse.setResultMessage(_ctx.stringValue("DeleteMqSofamqTopicResponse.ResultMessage"));
	 
	 	return deleteMqSofamqTopicResponse;
	}
}