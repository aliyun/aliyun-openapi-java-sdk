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

import com.aliyuncs.trademark.model.v20180724.QueryMaterialListResponse;
import com.aliyuncs.trademark.model.v20180724.QueryMaterialListResponse.Trademark;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMaterialListResponseUnmarshaller {

	public static QueryMaterialListResponse unmarshall(QueryMaterialListResponse queryMaterialListResponse, UnmarshallerContext context) {
		
		queryMaterialListResponse.setRequestId(context.stringValue("QueryMaterialListResponse.RequestId"));
		queryMaterialListResponse.setTotalItemNum(context.integerValue("QueryMaterialListResponse.TotalItemNum"));
		queryMaterialListResponse.setCurrentPageNum(context.integerValue("QueryMaterialListResponse.CurrentPageNum"));
		queryMaterialListResponse.setPageSize(context.integerValue("QueryMaterialListResponse.PageSize"));
		queryMaterialListResponse.setTotalPageNum(context.integerValue("QueryMaterialListResponse.TotalPageNum"));

		List<Trademark> data = new ArrayList<Trademark>();
		for (int i = 0; i < context.lengthValue("QueryMaterialListResponse.Data.Length"); i++) {
			Trademark trademark = new Trademark();
			trademark.setId(context.longValue("QueryMaterialListResponse.Data["+ i +"].Id"));
			trademark.setName(context.stringValue("QueryMaterialListResponse.Data["+ i +"].Name"));
			trademark.setType(context.integerValue("QueryMaterialListResponse.Data["+ i +"].Type"));
			trademark.setRegion(context.integerValue("QueryMaterialListResponse.Data["+ i +"].Region"));
			trademark.setContactName(context.stringValue("QueryMaterialListResponse.Data["+ i +"].ContactName"));
			trademark.setStatus(context.integerValue("QueryMaterialListResponse.Data["+ i +"].Status"));
			trademark.setLoaKey(context.stringValue("QueryMaterialListResponse.Data["+ i +"].LoaKey"));
			trademark.setLoaStatus(context.integerValue("QueryMaterialListResponse.Data["+ i +"].LoaStatus"));
			trademark.setCardNumber(context.stringValue("QueryMaterialListResponse.Data["+ i +"].CardNumber"));

			data.add(trademark);
		}
		queryMaterialListResponse.setData(data);
	 
	 	return queryMaterialListResponse;
	}
}