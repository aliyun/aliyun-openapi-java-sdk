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

package com.aliyuncs.dybaseapi.transform.v20170525;

import com.aliyuncs.dybaseapi.model.v20170525.QueryTokenForMnsQueueResponse;
import com.aliyuncs.dybaseapi.model.v20170525.QueryTokenForMnsQueueResponse.MessageTokenDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTokenForMnsQueueResponseUnmarshaller {

	public static QueryTokenForMnsQueueResponse unmarshall(QueryTokenForMnsQueueResponse queryTokenForMnsQueueResponse, UnmarshallerContext _ctx) {
		
		queryTokenForMnsQueueResponse.setRequestId(_ctx.stringValue("QueryTokenForMnsQueueResponse.RequestId"));
		queryTokenForMnsQueueResponse.setCode(_ctx.stringValue("QueryTokenForMnsQueueResponse.Code"));
		queryTokenForMnsQueueResponse.setMessage(_ctx.stringValue("QueryTokenForMnsQueueResponse.Message"));

		MessageTokenDTO messageTokenDTO = new MessageTokenDTO();
		messageTokenDTO.setAccessKeySecret(_ctx.stringValue("QueryTokenForMnsQueueResponse.MessageTokenDTO.AccessKeySecret"));
		messageTokenDTO.setExpireTime(_ctx.stringValue("QueryTokenForMnsQueueResponse.MessageTokenDTO.ExpireTime"));
		messageTokenDTO.setSecurityToken(_ctx.stringValue("QueryTokenForMnsQueueResponse.MessageTokenDTO.SecurityToken"));
		messageTokenDTO.setAccessKeyId(_ctx.stringValue("QueryTokenForMnsQueueResponse.MessageTokenDTO.AccessKeyId"));
		messageTokenDTO.setCreateTime(_ctx.stringValue("QueryTokenForMnsQueueResponse.MessageTokenDTO.CreateTime"));
		queryTokenForMnsQueueResponse.setMessageTokenDTO(messageTokenDTO);
	 
	 	return queryTokenForMnsQueueResponse;
	}
}