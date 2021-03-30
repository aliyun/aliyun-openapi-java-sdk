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

package com.aliyuncs.airec.transform.v20201126;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20201126.ListMixCategoriesResponse;
import com.aliyuncs.airec.model.v20201126.ListMixCategoriesResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMixCategoriesResponseUnmarshaller {

	public static ListMixCategoriesResponse unmarshall(ListMixCategoriesResponse listMixCategoriesResponse, UnmarshallerContext _ctx) {
		
		listMixCategoriesResponse.setCode(_ctx.stringValue("ListMixCategoriesResponse.code"));
		listMixCategoriesResponse.setMessage(_ctx.stringValue("ListMixCategoriesResponse.message"));
		listMixCategoriesResponse.setRequestId(_ctx.stringValue("ListMixCategoriesResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMixCategoriesResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();

			List<Long> categories = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListMixCategoriesResponse.result["+ i +"].categories.Length"); j++) {
				categories.add(_ctx.longValue("ListMixCategoriesResponse.result["+ i +"].categories["+ j +"]"));
			}
			resultItem.setCategories(categories);

			result.add(resultItem);
		}
		listMixCategoriesResponse.setResult(result);
	 
	 	return listMixCategoriesResponse;
	}
}