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

import com.aliyuncs.sofa.model.v20190815.QueryDTXBiztypeRelationResponse;
import com.aliyuncs.sofa.model.v20190815.QueryDTXBiztypeRelationResponse.AppActionItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDTXBiztypeRelationResponseUnmarshaller {

	public static QueryDTXBiztypeRelationResponse unmarshall(QueryDTXBiztypeRelationResponse queryDTXBiztypeRelationResponse, UnmarshallerContext _ctx) {
		
		queryDTXBiztypeRelationResponse.setRequestId(_ctx.stringValue("QueryDTXBiztypeRelationResponse.RequestId"));
		queryDTXBiztypeRelationResponse.setResultCode(_ctx.stringValue("QueryDTXBiztypeRelationResponse.ResultCode"));
		queryDTXBiztypeRelationResponse.setResultMessage(_ctx.stringValue("QueryDTXBiztypeRelationResponse.ResultMessage"));
		queryDTXBiztypeRelationResponse.setAppName(_ctx.stringValue("QueryDTXBiztypeRelationResponse.AppName"));
		queryDTXBiztypeRelationResponse.setBizType(_ctx.stringValue("QueryDTXBiztypeRelationResponse.BizType"));
		queryDTXBiztypeRelationResponse.setDesc(_ctx.stringValue("QueryDTXBiztypeRelationResponse.Desc"));

		List<AppActionItem> appAction = new ArrayList<AppActionItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDTXBiztypeRelationResponse.AppAction.Length"); i++) {
			AppActionItem appActionItem = new AppActionItem();
			appActionItem.setAppName(_ctx.stringValue("QueryDTXBiztypeRelationResponse.AppAction["+ i +"].AppName"));

			List<String> actionArray = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryDTXBiztypeRelationResponse.AppAction["+ i +"].ActionArray.Length"); j++) {
				actionArray.add(_ctx.stringValue("QueryDTXBiztypeRelationResponse.AppAction["+ i +"].ActionArray["+ j +"]"));
			}
			appActionItem.setActionArray(actionArray);

			appAction.add(appActionItem);
		}
		queryDTXBiztypeRelationResponse.setAppAction(appAction);
	 
	 	return queryDTXBiztypeRelationResponse;
	}
}