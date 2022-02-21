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

import com.aliyuncs.companyreg.model.v20190508.QueryIcpProduceListResponse;
import com.aliyuncs.companyreg.model.v20190508.QueryIcpProduceListResponse.Trademark;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryIcpProduceListResponseUnmarshaller {

	public static QueryIcpProduceListResponse unmarshall(QueryIcpProduceListResponse queryIcpProduceListResponse, UnmarshallerContext _ctx) {
		
		queryIcpProduceListResponse.setRequestId(_ctx.stringValue("QueryIcpProduceListResponse.RequestId"));
		queryIcpProduceListResponse.setCurrentPageNum(_ctx.longValue("QueryIcpProduceListResponse.CurrentPageNum"));
		queryIcpProduceListResponse.setTotalPageNum(_ctx.longValue("QueryIcpProduceListResponse.TotalPageNum"));
		queryIcpProduceListResponse.setPageSize(_ctx.longValue("QueryIcpProduceListResponse.PageSize"));
		queryIcpProduceListResponse.setTotalItemNum(_ctx.longValue("QueryIcpProduceListResponse.TotalItemNum"));

		List<Trademark> data = new ArrayList<Trademark>();
		for (int i = 0; i < _ctx.lengthValue("QueryIcpProduceListResponse.Data.Length"); i++) {
			Trademark trademark = new Trademark();
			trademark.setBizId(_ctx.stringValue("QueryIcpProduceListResponse.Data["+ i +"].BizId"));
			trademark.setMobile(_ctx.stringValue("QueryIcpProduceListResponse.Data["+ i +"].Mobile"));

			data.add(trademark);
		}
		queryIcpProduceListResponse.setData(data);
	 
	 	return queryIcpProduceListResponse;
	}
}