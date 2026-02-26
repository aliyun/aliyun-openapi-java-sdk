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

package com.aliyuncs.cams.transform.v20200606;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cams.model.v20200606.ChatappEmbedSignUpResponse;
import com.aliyuncs.cams.model.v20200606.ChatappEmbedSignUpResponse.Waba列表;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChatappEmbedSignUpResponseUnmarshaller {

	public static ChatappEmbedSignUpResponse unmarshall(ChatappEmbedSignUpResponse chatappEmbedSignUpResponse, UnmarshallerContext _ctx) {
		
		chatappEmbedSignUpResponse.setRequestId(_ctx.stringValue("ChatappEmbedSignUpResponse.RequestId"));
		chatappEmbedSignUpResponse.setCode(_ctx.stringValue("ChatappEmbedSignUpResponse.Code"));
		chatappEmbedSignUpResponse.setMessage(_ctx.stringValue("ChatappEmbedSignUpResponse.Message"));
		chatappEmbedSignUpResponse.setAccessDeniedDetail(_ctx.stringValue("ChatappEmbedSignUpResponse.AccessDeniedDetail"));

		List<Waba列表> wabas = new ArrayList<Waba列表>();
		for (int i = 0; i < _ctx.lengthValue("ChatappEmbedSignUpResponse.Wabas.Length"); i++) {
			Waba列表 waba列表 = new Waba列表();
			waba列表.setId(_ctx.stringValue("ChatappEmbedSignUpResponse.Wabas["+ i +"].Id"));
			waba列表.setName(_ctx.stringValue("ChatappEmbedSignUpResponse.Wabas["+ i +"].Name"));
			waba列表.setCurrency(_ctx.stringValue("ChatappEmbedSignUpResponse.Wabas["+ i +"].Currency"));
			waba列表.setAccountReviewStatus(_ctx.stringValue("ChatappEmbedSignUpResponse.Wabas["+ i +"].AccountReviewStatus"));
			waba列表.setMessageTemplateNamespace(_ctx.stringValue("ChatappEmbedSignUpResponse.Wabas["+ i +"].MessageTemplateNamespace"));

			wabas.add(waba列表);
		}
		chatappEmbedSignUpResponse.setWabas(wabas);
	 
	 	return chatappEmbedSignUpResponse;
	}
}