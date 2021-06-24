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

package com.aliyuncs.dts.transform.v20200101;

import com.aliyuncs.dts.model.v20200101.DeleteConsumerChannelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteConsumerChannelResponseUnmarshaller {

	public static DeleteConsumerChannelResponse unmarshall(DeleteConsumerChannelResponse deleteConsumerChannelResponse, UnmarshallerContext _ctx) {
		
		deleteConsumerChannelResponse.setRequestId(_ctx.stringValue("DeleteConsumerChannelResponse.RequestId"));
		deleteConsumerChannelResponse.setErrCode(_ctx.stringValue("DeleteConsumerChannelResponse.ErrCode"));
		deleteConsumerChannelResponse.setErrMessage(_ctx.stringValue("DeleteConsumerChannelResponse.ErrMessage"));
		deleteConsumerChannelResponse.setSuccess(_ctx.stringValue("DeleteConsumerChannelResponse.Success"));
		deleteConsumerChannelResponse.setHttpStatusCode(_ctx.stringValue("DeleteConsumerChannelResponse.HttpStatusCode"));
	 
	 	return deleteConsumerChannelResponse;
	}
}