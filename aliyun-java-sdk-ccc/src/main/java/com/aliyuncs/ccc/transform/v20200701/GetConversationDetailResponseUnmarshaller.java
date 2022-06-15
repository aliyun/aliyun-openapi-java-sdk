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

import com.aliyuncs.ccc.model.v20200701.GetConversationDetailResponse;
import com.aliyuncs.ccc.model.v20200701.GetConversationDetailResponse.Phrase;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetConversationDetailResponseUnmarshaller {

	public static GetConversationDetailResponse unmarshall(GetConversationDetailResponse getConversationDetailResponse, UnmarshallerContext _ctx) {
		
		getConversationDetailResponse.setRequestId(_ctx.stringValue("GetConversationDetailResponse.RequestId"));
		getConversationDetailResponse.setCode(_ctx.stringValue("GetConversationDetailResponse.Code"));
		getConversationDetailResponse.setHttpStatusCode(_ctx.integerValue("GetConversationDetailResponse.HttpStatusCode"));
		getConversationDetailResponse.setMessage(_ctx.stringValue("GetConversationDetailResponse.Message"));

		List<Phrase> phrases = new ArrayList<Phrase>();
		for (int i = 0; i < _ctx.lengthValue("GetConversationDetailResponse.Phrases.Length"); i++) {
			Phrase phrase = new Phrase();
			phrase.setIdentity(_ctx.stringValue("GetConversationDetailResponse.Phrases["+ i +"].Identity"));
			phrase.setRole(_ctx.stringValue("GetConversationDetailResponse.Phrases["+ i +"].Role"));
			phrase.setBegin(_ctx.integerValue("GetConversationDetailResponse.Phrases["+ i +"].Begin"));
			phrase.setEnd(_ctx.integerValue("GetConversationDetailResponse.Phrases["+ i +"].End"));
			phrase.setWords(_ctx.stringValue("GetConversationDetailResponse.Phrases["+ i +"].Words"));

			phrases.add(phrase);
		}
		getConversationDetailResponse.setPhrases(phrases);
	 
	 	return getConversationDetailResponse;
	}
}