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

package com.aliyuncs.opensearch.transform.v20171225;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.opensearch.model.v20171225.ListABTestScenesResponse;
import com.aliyuncs.opensearch.model.v20171225.ListABTestScenesResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListABTestScenesResponseUnmarshaller {

	public static ListABTestScenesResponse unmarshall(ListABTestScenesResponse listABTestScenesResponse, UnmarshallerContext _ctx) {
		
		listABTestScenesResponse.setRequestId(_ctx.stringValue("ListABTestScenesResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListABTestScenesResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.stringValue("ListABTestScenesResponse.result["+ i +"].id"));
			resultItem.setName(_ctx.stringValue("ListABTestScenesResponse.result["+ i +"].name"));
			resultItem.setStatus(_ctx.integerValue("ListABTestScenesResponse.result["+ i +"].status"));
			resultItem.setCreated(_ctx.integerValue("ListABTestScenesResponse.result["+ i +"].created"));
			resultItem.setUpdated(_ctx.integerValue("ListABTestScenesResponse.result["+ i +"].updated"));

			List<String> values = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListABTestScenesResponse.result["+ i +"].values.Length"); j++) {
				values.add(_ctx.stringValue("ListABTestScenesResponse.result["+ i +"].values["+ j +"]"));
			}
			resultItem.setValues(values);

			result.add(resultItem);
		}
		listABTestScenesResponse.setResult(result);
	 
	 	return listABTestScenesResponse;
	}
}