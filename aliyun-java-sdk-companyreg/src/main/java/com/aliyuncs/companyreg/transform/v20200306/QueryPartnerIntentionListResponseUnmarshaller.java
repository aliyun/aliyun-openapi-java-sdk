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

package com.aliyuncs.companyreg.transform.v20200306;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20200306.QueryPartnerIntentionListResponse;
import com.aliyuncs.companyreg.model.v20200306.QueryPartnerIntentionListResponse.Intention;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPartnerIntentionListResponseUnmarshaller {

	public static QueryPartnerIntentionListResponse unmarshall(QueryPartnerIntentionListResponse queryPartnerIntentionListResponse, UnmarshallerContext _ctx) {
		
		queryPartnerIntentionListResponse.setRequestId(_ctx.stringValue("QueryPartnerIntentionListResponse.RequestId"));
		queryPartnerIntentionListResponse.setCurrentPageNum(_ctx.longValue("QueryPartnerIntentionListResponse.CurrentPageNum"));
		queryPartnerIntentionListResponse.setTotalPageNum(_ctx.longValue("QueryPartnerIntentionListResponse.TotalPageNum"));
		queryPartnerIntentionListResponse.setPageSize(_ctx.longValue("QueryPartnerIntentionListResponse.PageSize"));
		queryPartnerIntentionListResponse.setTotalItemNum(_ctx.longValue("QueryPartnerIntentionListResponse.TotalItemNum"));

		List<Intention> data = new ArrayList<Intention>();
		for (int i = 0; i < _ctx.lengthValue("QueryPartnerIntentionListResponse.Data.Length"); i++) {
			Intention intention = new Intention();
			intention.setBizId(_ctx.stringValue("QueryPartnerIntentionListResponse.Data["+ i +"].BizId"));
			intention.setMobile(_ctx.stringValue("QueryPartnerIntentionListResponse.Data["+ i +"].Mobile"));
			intention.setBizType(_ctx.stringValue("QueryPartnerIntentionListResponse.Data["+ i +"].BizType"));

			data.add(intention);
		}
		queryPartnerIntentionListResponse.setData(data);
	 
	 	return queryPartnerIntentionListResponse;
	}
}