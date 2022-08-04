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

	public static QueryMaterialListResponse unmarshall(QueryMaterialListResponse queryMaterialListResponse, UnmarshallerContext _ctx) {
		
		queryMaterialListResponse.setRequestId(_ctx.stringValue("QueryMaterialListResponse.RequestId"));
		queryMaterialListResponse.setCurrentPageNum(_ctx.integerValue("QueryMaterialListResponse.CurrentPageNum"));
		queryMaterialListResponse.setTotalPageNum(_ctx.integerValue("QueryMaterialListResponse.TotalPageNum"));
		queryMaterialListResponse.setPageSize(_ctx.integerValue("QueryMaterialListResponse.PageSize"));
		queryMaterialListResponse.setTotalItemNum(_ctx.integerValue("QueryMaterialListResponse.TotalItemNum"));

		List<Trademark> data = new ArrayList<Trademark>();
		for (int i = 0; i < _ctx.lengthValue("QueryMaterialListResponse.Data.Length"); i++) {
			Trademark trademark = new Trademark();
			trademark.setPrincipalDescription(_ctx.stringValue("QueryMaterialListResponse.Data["+ i +"].PrincipalDescription"));
			trademark.setStatus(_ctx.integerValue("QueryMaterialListResponse.Data["+ i +"].Status"));
			trademark.setType(_ctx.integerValue("QueryMaterialListResponse.Data["+ i +"].Type"));
			trademark.setContactName(_ctx.stringValue("QueryMaterialListResponse.Data["+ i +"].ContactName"));
			trademark.setCardNumber(_ctx.stringValue("QueryMaterialListResponse.Data["+ i +"].CardNumber"));
			trademark.setValidDate(_ctx.longValue("QueryMaterialListResponse.Data["+ i +"].ValidDate"));
			trademark.setRegion(_ctx.integerValue("QueryMaterialListResponse.Data["+ i +"].Region"));
			trademark.setPrincipalName(_ctx.integerValue("QueryMaterialListResponse.Data["+ i +"].PrincipalName"));
			trademark.setLoaStatus(_ctx.integerValue("QueryMaterialListResponse.Data["+ i +"].LoaStatus"));
			trademark.setName(_ctx.stringValue("QueryMaterialListResponse.Data["+ i +"].Name"));
			trademark.setLoaKey(_ctx.stringValue("QueryMaterialListResponse.Data["+ i +"].LoaKey"));
			trademark.setId(_ctx.longValue("QueryMaterialListResponse.Data["+ i +"].Id"));
			trademark.setReason(_ctx.stringValue("QueryMaterialListResponse.Data["+ i +"].Reason"));
			trademark.setMaterialVersion(_ctx.stringValue("QueryMaterialListResponse.Data["+ i +"].MaterialVersion"));

			data.add(trademark);
		}
		queryMaterialListResponse.setData(data);
	 
	 	return queryMaterialListResponse;
	}
}