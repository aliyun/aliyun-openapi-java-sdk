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

import com.aliyuncs.companyreg.model.v20200306.QueryPartnerProduceListResponse;
import com.aliyuncs.companyreg.model.v20200306.QueryPartnerProduceListResponse.Produce;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPartnerProduceListResponseUnmarshaller {

	public static QueryPartnerProduceListResponse unmarshall(QueryPartnerProduceListResponse queryPartnerProduceListResponse, UnmarshallerContext _ctx) {
		
		queryPartnerProduceListResponse.setRequestId(_ctx.stringValue("QueryPartnerProduceListResponse.RequestId"));
		queryPartnerProduceListResponse.setCurrentPageNum(_ctx.longValue("QueryPartnerProduceListResponse.CurrentPageNum"));
		queryPartnerProduceListResponse.setTotalPageNum(_ctx.longValue("QueryPartnerProduceListResponse.TotalPageNum"));
		queryPartnerProduceListResponse.setPageSize(_ctx.longValue("QueryPartnerProduceListResponse.PageSize"));
		queryPartnerProduceListResponse.setTotalItemNum(_ctx.longValue("QueryPartnerProduceListResponse.TotalItemNum"));

		List<Produce> data = new ArrayList<Produce>();
		for (int i = 0; i < _ctx.lengthValue("QueryPartnerProduceListResponse.Data.Length"); i++) {
			Produce produce = new Produce();
			produce.setBizId(_ctx.stringValue("QueryPartnerProduceListResponse.Data["+ i +"].BizId"));
			produce.setBizType(_ctx.stringValue("QueryPartnerProduceListResponse.Data["+ i +"].BizType"));
			produce.setMobile(_ctx.stringValue("QueryPartnerProduceListResponse.Data["+ i +"].mobile"));

			data.add(produce);
		}
		queryPartnerProduceListResponse.setData(data);
	 
	 	return queryPartnerProduceListResponse;
	}
}