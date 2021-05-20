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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.AddAiotPersonTableItemsResponse;
import com.aliyuncs.vcs.model.v20200515.AddAiotPersonTableItemsResponse.ResultListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddAiotPersonTableItemsResponseUnmarshaller {

	public static AddAiotPersonTableItemsResponse unmarshall(AddAiotPersonTableItemsResponse addAiotPersonTableItemsResponse, UnmarshallerContext _ctx) {
		
		addAiotPersonTableItemsResponse.setRequestId(_ctx.stringValue("AddAiotPersonTableItemsResponse.RequestId"));
		addAiotPersonTableItemsResponse.setMessage(_ctx.stringValue("AddAiotPersonTableItemsResponse.Message"));
		addAiotPersonTableItemsResponse.setCode(_ctx.stringValue("AddAiotPersonTableItemsResponse.Code"));

		List<ResultListItem> resultList = new ArrayList<ResultListItem>();
		for (int i = 0; i < _ctx.lengthValue("AddAiotPersonTableItemsResponse.ResultList.Length"); i++) {
			ResultListItem resultListItem = new ResultListItem();
			resultListItem.setPersonTableItemId(_ctx.stringValue("AddAiotPersonTableItemsResponse.ResultList["+ i +"].PersonTableItemId"));
			resultListItem.setMessage(_ctx.stringValue("AddAiotPersonTableItemsResponse.ResultList["+ i +"].Message"));
			resultListItem.setCode(_ctx.stringValue("AddAiotPersonTableItemsResponse.ResultList["+ i +"].Code"));

			resultList.add(resultListItem);
		}
		addAiotPersonTableItemsResponse.setResultList(resultList);
	 
	 	return addAiotPersonTableItemsResponse;
	}
}