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

package com.aliyuncs.dypnsapi.transform.v20170525;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dypnsapi.model.v20170525.QueryGateVerifyBillingPublicResponse;
import com.aliyuncs.dypnsapi.model.v20170525.QueryGateVerifyBillingPublicResponse.Data;
import com.aliyuncs.dypnsapi.model.v20170525.QueryGateVerifyBillingPublicResponse.Data.SceneBillingListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryGateVerifyBillingPublicResponseUnmarshaller {

	public static QueryGateVerifyBillingPublicResponse unmarshall(QueryGateVerifyBillingPublicResponse queryGateVerifyBillingPublicResponse, UnmarshallerContext _ctx) {
		
		queryGateVerifyBillingPublicResponse.setRequestId(_ctx.stringValue("QueryGateVerifyBillingPublicResponse.RequestId"));
		queryGateVerifyBillingPublicResponse.setCode(_ctx.stringValue("QueryGateVerifyBillingPublicResponse.Code"));
		queryGateVerifyBillingPublicResponse.setMessage(_ctx.stringValue("QueryGateVerifyBillingPublicResponse.Message"));

		Data data = new Data();
		data.setAmountSum(_ctx.stringValue("QueryGateVerifyBillingPublicResponse.Data.AmountSum"));

		List<SceneBillingListItem> sceneBillingList = new ArrayList<SceneBillingListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryGateVerifyBillingPublicResponse.Data.SceneBillingList.Length"); i++) {
			SceneBillingListItem sceneBillingListItem = new SceneBillingListItem();
			sceneBillingListItem.setAdd(_ctx.stringValue("QueryGateVerifyBillingPublicResponse.Data.SceneBillingList["+ i +"].Add"));
			sceneBillingListItem.setSinglePrice(_ctx.stringValue("QueryGateVerifyBillingPublicResponse.Data.SceneBillingList["+ i +"].SinglePrice"));
			sceneBillingListItem.setAmount(_ctx.stringValue("QueryGateVerifyBillingPublicResponse.Data.SceneBillingList["+ i +"].Amount"));
			sceneBillingListItem.setItemName(_ctx.stringValue("QueryGateVerifyBillingPublicResponse.Data.SceneBillingList["+ i +"].ItemName"));
			sceneBillingListItem.setSceneCode(_ctx.stringValue("QueryGateVerifyBillingPublicResponse.Data.SceneBillingList["+ i +"].SceneCode"));
			sceneBillingListItem.setAppName(_ctx.stringValue("QueryGateVerifyBillingPublicResponse.Data.SceneBillingList["+ i +"].AppName"));
			sceneBillingListItem.setSceneName(_ctx.stringValue("QueryGateVerifyBillingPublicResponse.Data.SceneBillingList["+ i +"].SceneName"));

			sceneBillingList.add(sceneBillingListItem);
		}
		data.setSceneBillingList(sceneBillingList);
		queryGateVerifyBillingPublicResponse.setData(data);
	 
	 	return queryGateVerifyBillingPublicResponse;
	}
}