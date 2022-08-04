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

import com.aliyuncs.trademark.model.v20180724.QueryTmCollectionPageListResponse;
import com.aliyuncs.trademark.model.v20180724.QueryTmCollectionPageListResponse.Trademark;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTmCollectionPageListResponseUnmarshaller {

	public static QueryTmCollectionPageListResponse unmarshall(QueryTmCollectionPageListResponse queryTmCollectionPageListResponse, UnmarshallerContext _ctx) {
		
		queryTmCollectionPageListResponse.setRequestId(_ctx.stringValue("QueryTmCollectionPageListResponse.RequestId"));
		queryTmCollectionPageListResponse.setCurrentPageNum(_ctx.integerValue("QueryTmCollectionPageListResponse.CurrentPageNum"));
		queryTmCollectionPageListResponse.setTotalPageNum(_ctx.integerValue("QueryTmCollectionPageListResponse.TotalPageNum"));
		queryTmCollectionPageListResponse.setPageSize(_ctx.integerValue("QueryTmCollectionPageListResponse.PageSize"));
		queryTmCollectionPageListResponse.setTotalItemNum(_ctx.integerValue("QueryTmCollectionPageListResponse.TotalItemNum"));

		List<Trademark> data = new ArrayList<Trademark>();
		for (int i = 0; i < _ctx.lengthValue("QueryTmCollectionPageListResponse.Data.Length"); i++) {
			Trademark trademark = new Trademark();
			trademark.setCollectionContent(_ctx.stringValue("QueryTmCollectionPageListResponse.Data["+ i +"].CollectionContent"));
			trademark.setId(_ctx.longValue("QueryTmCollectionPageListResponse.Data["+ i +"].Id"));
			trademark.setItemId(_ctx.stringValue("QueryTmCollectionPageListResponse.Data["+ i +"].ItemId"));
			trademark.setTmName(_ctx.stringValue("QueryTmCollectionPageListResponse.Data["+ i +"].TmName"));
			trademark.setClassification(_ctx.stringValue("QueryTmCollectionPageListResponse.Data["+ i +"].Classification"));
			trademark.setCollected(_ctx.booleanValue("QueryTmCollectionPageListResponse.Data["+ i +"].Collected"));

			data.add(trademark);
		}
		queryTmCollectionPageListResponse.setData(data);
	 
	 	return queryTmCollectionPageListResponse;
	}
}