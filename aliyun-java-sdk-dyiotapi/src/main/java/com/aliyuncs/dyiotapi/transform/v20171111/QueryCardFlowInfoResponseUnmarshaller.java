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

package com.aliyuncs.dyiotapi.transform.v20171111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dyiotapi.model.v20171111.QueryCardFlowInfoResponse;
import com.aliyuncs.dyiotapi.model.v20171111.QueryCardFlowInfoResponse.CardFlowInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCardFlowInfoResponseUnmarshaller {

	public static QueryCardFlowInfoResponse unmarshall(QueryCardFlowInfoResponse queryCardFlowInfoResponse, UnmarshallerContext _ctx) {
		
		queryCardFlowInfoResponse.setRequestId(_ctx.stringValue("QueryCardFlowInfoResponse.RequestId"));
		queryCardFlowInfoResponse.setCode(_ctx.stringValue("QueryCardFlowInfoResponse.Code"));
		queryCardFlowInfoResponse.setMessage(_ctx.stringValue("QueryCardFlowInfoResponse.Message"));

		List<CardFlowInfo> cardFlowInfos = new ArrayList<CardFlowInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryCardFlowInfoResponse.CardFlowInfos.Length"); i++) {
			CardFlowInfo cardFlowInfo = new CardFlowInfo();
			cardFlowInfo.setResourceType(_ctx.stringValue("QueryCardFlowInfoResponse.CardFlowInfos["+ i +"].ResourceType"));
			cardFlowInfo.setResName(_ctx.stringValue("QueryCardFlowInfoResponse.CardFlowInfos["+ i +"].ResName"));
			cardFlowInfo.setFlowResource(_ctx.longValue("QueryCardFlowInfoResponse.CardFlowInfos["+ i +"].FlowResource"));
			cardFlowInfo.setRestOfFlow(_ctx.longValue("QueryCardFlowInfoResponse.CardFlowInfos["+ i +"].RestOfFlow"));
			cardFlowInfo.setFlowUsed(_ctx.longValue("QueryCardFlowInfoResponse.CardFlowInfos["+ i +"].FlowUsed"));
			cardFlowInfo.setValidDate(_ctx.stringValue("QueryCardFlowInfoResponse.CardFlowInfos["+ i +"].ValidDate"));
			cardFlowInfo.setExpireDate(_ctx.stringValue("QueryCardFlowInfoResponse.CardFlowInfos["+ i +"].ExpireDate"));
			cardFlowInfo.setSmsUsed(_ctx.longValue("QueryCardFlowInfoResponse.CardFlowInfos["+ i +"].SmsUsed"));
			cardFlowInfo.setVoiceUsed(_ctx.longValue("QueryCardFlowInfoResponse.CardFlowInfos["+ i +"].VoiceUsed"));
			cardFlowInfo.setVoiceTotal(_ctx.longValue("QueryCardFlowInfoResponse.CardFlowInfos["+ i +"].VoiceTotal"));

			cardFlowInfos.add(cardFlowInfo);
		}
		queryCardFlowInfoResponse.setCardFlowInfos(cardFlowInfos);
	 
	 	return queryCardFlowInfoResponse;
	}
}