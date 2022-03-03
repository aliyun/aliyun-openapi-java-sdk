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

package com.aliyuncs.companyreg.transform.v20190508;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20190508.QueryIcpIntentionListResponse;
import com.aliyuncs.companyreg.model.v20190508.QueryIcpIntentionListResponse.Trademark;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryIcpIntentionListResponseUnmarshaller {

	public static QueryIcpIntentionListResponse unmarshall(QueryIcpIntentionListResponse queryIcpIntentionListResponse, UnmarshallerContext _ctx) {
		
		queryIcpIntentionListResponse.setRequestId(_ctx.stringValue("QueryIcpIntentionListResponse.RequestId"));
		queryIcpIntentionListResponse.setCurrentPageNum(_ctx.longValue("QueryIcpIntentionListResponse.CurrentPageNum"));
		queryIcpIntentionListResponse.setTotalPageNum(_ctx.longValue("QueryIcpIntentionListResponse.TotalPageNum"));
		queryIcpIntentionListResponse.setPageSize(_ctx.longValue("QueryIcpIntentionListResponse.PageSize"));
		queryIcpIntentionListResponse.setTotalItemNum(_ctx.longValue("QueryIcpIntentionListResponse.TotalItemNum"));

		List<Trademark> data = new ArrayList<Trademark>();
		for (int i = 0; i < _ctx.lengthValue("QueryIcpIntentionListResponse.Data.Length"); i++) {
			Trademark trademark = new Trademark();
			trademark.setBizId(_ctx.stringValue("QueryIcpIntentionListResponse.Data["+ i +"].BizId"));
			trademark.setMobile(_ctx.stringValue("QueryIcpIntentionListResponse.Data["+ i +"].Mobile"));

			data.add(trademark);
		}
		queryIcpIntentionListResponse.setData(data);
	 
	 	return queryIcpIntentionListResponse;
	}
}