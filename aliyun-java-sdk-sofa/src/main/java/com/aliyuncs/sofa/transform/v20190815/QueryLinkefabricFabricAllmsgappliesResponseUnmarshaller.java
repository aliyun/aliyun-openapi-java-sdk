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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricAllmsgappliesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricAllmsgappliesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricAllmsgappliesResponseUnmarshaller {

	public static QueryLinkefabricFabricAllmsgappliesResponse unmarshall(QueryLinkefabricFabricAllmsgappliesResponse queryLinkefabricFabricAllmsgappliesResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricAllmsgappliesResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricAllmsgappliesResponse.RequestId"));
		queryLinkefabricFabricAllmsgappliesResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricAllmsgappliesResponse.ResultCode"));
		queryLinkefabricFabricAllmsgappliesResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricAllmsgappliesResponse.ResultMessage"));
		queryLinkefabricFabricAllmsgappliesResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricAllmsgappliesResponse.Message"));
		queryLinkefabricFabricAllmsgappliesResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricAllmsgappliesResponse.ResponseStatusCode"));
		queryLinkefabricFabricAllmsgappliesResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricAllmsgappliesResponse.Success"));

		Data data = new Data();

		List<String> finishedMsgApplies = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricAllmsgappliesResponse.Data.FinishedMsgApplies.Length"); i++) {
			finishedMsgApplies.add(_ctx.stringValue("QueryLinkefabricFabricAllmsgappliesResponse.Data.FinishedMsgApplies["+ i +"]"));
		}
		data.setFinishedMsgApplies(finishedMsgApplies);

		List<String> handledMsgApplies = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricAllmsgappliesResponse.Data.HandledMsgApplies.Length"); i++) {
			handledMsgApplies.add(_ctx.stringValue("QueryLinkefabricFabricAllmsgappliesResponse.Data.HandledMsgApplies["+ i +"]"));
		}
		data.setHandledMsgApplies(handledMsgApplies);

		List<String> unHandledMsgApplies = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricAllmsgappliesResponse.Data.UnHandledMsgApplies.Length"); i++) {
			unHandledMsgApplies.add(_ctx.stringValue("QueryLinkefabricFabricAllmsgappliesResponse.Data.UnHandledMsgApplies["+ i +"]"));
		}
		data.setUnHandledMsgApplies(unHandledMsgApplies);
		queryLinkefabricFabricAllmsgappliesResponse.setData(data);
	 
	 	return queryLinkefabricFabricAllmsgappliesResponse;
	}
}