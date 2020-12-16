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

import com.aliyuncs.companyreg.model.v20190508.QueryIntentionListResponse;
import com.aliyuncs.companyreg.model.v20190508.QueryIntentionListResponse.Intention;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryIntentionListResponseUnmarshaller {

	public static QueryIntentionListResponse unmarshall(QueryIntentionListResponse queryIntentionListResponse, UnmarshallerContext _ctx) {
		
		queryIntentionListResponse.setRequestId(_ctx.stringValue("QueryIntentionListResponse.RequestId"));
		queryIntentionListResponse.setTotalItemNum(_ctx.integerValue("QueryIntentionListResponse.TotalItemNum"));
		queryIntentionListResponse.setCurrentPageNum(_ctx.integerValue("QueryIntentionListResponse.CurrentPageNum"));
		queryIntentionListResponse.setPageSize(_ctx.integerValue("QueryIntentionListResponse.PageSize"));
		queryIntentionListResponse.setTotalPageNum(_ctx.integerValue("QueryIntentionListResponse.TotalPageNum"));

		List<Intention> data = new ArrayList<Intention>();
		for (int i = 0; i < _ctx.lengthValue("QueryIntentionListResponse.Data.Length"); i++) {
			Intention intention = new Intention();
			intention.setUserId(_ctx.stringValue("QueryIntentionListResponse.Data["+ i +"].UserId"));
			intention.setRegisterNumber(_ctx.stringValue("QueryIntentionListResponse.Data["+ i +"].RegisterNumber"));
			intention.setClassification(_ctx.stringValue("QueryIntentionListResponse.Data["+ i +"].Classification"));
			intention.setType(_ctx.integerValue("QueryIntentionListResponse.Data["+ i +"].Type"));
			intention.setBizId(_ctx.stringValue("QueryIntentionListResponse.Data["+ i +"].BizId"));
			intention.setDescription(_ctx.stringValue("QueryIntentionListResponse.Data["+ i +"].Description"));
			intention.setStatus(_ctx.integerValue("QueryIntentionListResponse.Data["+ i +"].Status"));
			intention.setUpdateTime(_ctx.longValue("QueryIntentionListResponse.Data["+ i +"].UpdateTime"));
			intention.setCreateTime(_ctx.longValue("QueryIntentionListResponse.Data["+ i +"].CreateTime"));
			intention.setArea(_ctx.integerValue("QueryIntentionListResponse.Data["+ i +"].Area"));

			data.add(intention);
		}
		queryIntentionListResponse.setData(data);
	 
	 	return queryIntentionListResponse;
	}
}