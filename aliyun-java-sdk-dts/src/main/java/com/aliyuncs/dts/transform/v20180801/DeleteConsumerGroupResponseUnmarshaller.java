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

package com.aliyuncs.dts.transform.v20180801;

import com.aliyuncs.dts.model.v20180801.DeleteConsumerGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteConsumerGroupResponseUnmarshaller {

	public static DeleteConsumerGroupResponse unmarshall(DeleteConsumerGroupResponse deleteConsumerGroupResponse, UnmarshallerContext _ctx) {
		
		deleteConsumerGroupResponse.setRequestId(_ctx.stringValue("DeleteConsumerGroupResponse.RequestId"));
		deleteConsumerGroupResponse.setSuccess(_ctx.stringValue("DeleteConsumerGroupResponse.Success"));
		deleteConsumerGroupResponse.setErrCode(_ctx.stringValue("DeleteConsumerGroupResponse.ErrCode"));
		deleteConsumerGroupResponse.setErrMessage(_ctx.stringValue("DeleteConsumerGroupResponse.ErrMessage"));
	 
	 	return deleteConsumerGroupResponse;
	}
}