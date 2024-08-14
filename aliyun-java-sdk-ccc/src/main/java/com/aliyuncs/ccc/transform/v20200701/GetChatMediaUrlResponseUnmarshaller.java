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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.GetChatMediaUrlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetChatMediaUrlResponseUnmarshaller {

	public static GetChatMediaUrlResponse unmarshall(GetChatMediaUrlResponse getChatMediaUrlResponse, UnmarshallerContext _ctx) {
		
		getChatMediaUrlResponse.setRequestId(_ctx.stringValue("GetChatMediaUrlResponse.RequestId"));
		getChatMediaUrlResponse.setData(_ctx.stringValue("GetChatMediaUrlResponse.Data"));
		getChatMediaUrlResponse.setHttpStatusCode(_ctx.integerValue("GetChatMediaUrlResponse.HttpStatusCode"));
		getChatMediaUrlResponse.setCode(_ctx.stringValue("GetChatMediaUrlResponse.Code"));
		getChatMediaUrlResponse.setMessage(_ctx.stringValue("GetChatMediaUrlResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetChatMediaUrlResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("GetChatMediaUrlResponse.Params["+ i +"]"));
		}
		getChatMediaUrlResponse.setParams(params);
	 
	 	return getChatMediaUrlResponse;
	}
}