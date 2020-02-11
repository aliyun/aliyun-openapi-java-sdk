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

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.QueryTradeIntentionUserListResponse;
import com.aliyuncs.trademark.model.v20180724.QueryTradeIntentionUserListResponse.Trademark;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTradeIntentionUserListResponseUnmarshaller {

	public static QueryTradeIntentionUserListResponse unmarshall(QueryTradeIntentionUserListResponse queryTradeIntentionUserListResponse, UnmarshallerContext _ctx) {
		
		queryTradeIntentionUserListResponse.setRequestId(_ctx.stringValue("QueryTradeIntentionUserListResponse.RequestId"));
		queryTradeIntentionUserListResponse.setTotalItemNum(_ctx.integerValue("QueryTradeIntentionUserListResponse.TotalItemNum"));
		queryTradeIntentionUserListResponse.setCurrentPageNum(_ctx.integerValue("QueryTradeIntentionUserListResponse.CurrentPageNum"));
		queryTradeIntentionUserListResponse.setPageSize(_ctx.integerValue("QueryTradeIntentionUserListResponse.PageSize"));
		queryTradeIntentionUserListResponse.setTotalPageNum(_ctx.integerValue("QueryTradeIntentionUserListResponse.TotalPageNum"));

		List<Trademark> data = new ArrayList<Trademark>();
		for (int i = 0; i < _ctx.lengthValue("QueryTradeIntentionUserListResponse.Data.Length"); i++) {
			Trademark trademark = new Trademark();
			trademark.setRegisterNumber(_ctx.stringValue("QueryTradeIntentionUserListResponse.Data["+ i +"].RegisterNumber"));
			trademark.setClassification(_ctx.stringValue("QueryTradeIntentionUserListResponse.Data["+ i +"].Classification"));
			trademark.setMobile(_ctx.stringValue("QueryTradeIntentionUserListResponse.Data["+ i +"].Mobile"));
			trademark.setUserName(_ctx.stringValue("QueryTradeIntentionUserListResponse.Data["+ i +"].UserName"));
			trademark.setBizId(_ctx.stringValue("QueryTradeIntentionUserListResponse.Data["+ i +"].BizId"));
			trademark.setDescription(_ctx.stringValue("QueryTradeIntentionUserListResponse.Data["+ i +"].Description"));
			trademark.setStatus(_ctx.integerValue("QueryTradeIntentionUserListResponse.Data["+ i +"].Status"));
			trademark.setType(_ctx.integerValue("QueryTradeIntentionUserListResponse.Data["+ i +"].Type"));

			data.add(trademark);
		}
		queryTradeIntentionUserListResponse.setData(data);
	 
	 	return queryTradeIntentionUserListResponse;
	}
}