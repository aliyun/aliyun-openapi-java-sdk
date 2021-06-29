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

package com.aliyuncs.vcs.transform.v20200515;

import com.aliyuncs.vcs.model.v20200515.DeleteChannelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteChannelResponseUnmarshaller {

	public static DeleteChannelResponse unmarshall(DeleteChannelResponse deleteChannelResponse, UnmarshallerContext _ctx) {
		
		deleteChannelResponse.setRequestId(_ctx.stringValue("DeleteChannelResponse.RequestId"));
		deleteChannelResponse.setCode(_ctx.stringValue("DeleteChannelResponse.Code"));
		deleteChannelResponse.setMessage(_ctx.stringValue("DeleteChannelResponse.Message"));
		deleteChannelResponse.setData(_ctx.stringValue("DeleteChannelResponse.Data"));
	 
	 	return deleteChannelResponse;
	}
}