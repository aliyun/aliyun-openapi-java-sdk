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

import com.aliyuncs.opensearch.model.v20171225.ListABTestExperimentsResponse;
import com.aliyuncs.opensearch.model.v20171225.ListABTestExperimentsResponse.ResultItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListABTestExperimentsResponseUnmarshaller {

	public static ListABTestExperimentsResponse unmarshall(ListABTestExperimentsResponse listABTestExperimentsResponse, UnmarshallerContext _ctx) {
		
		listABTestExperimentsResponse.setRequestId(_ctx.stringValue("ListABTestExperimentsResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListABTestExperimentsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.stringValue("ListABTestExperimentsResponse.result["+ i +"].id"));
			resultItem.setName(_ctx.stringValue("ListABTestExperimentsResponse.result["+ i +"].name"));
			resultItem.setParams(_ctx.mapValue("ListABTestExperimentsResponse.result["+ i +"].params"));
			resultItem.setCreated(_ctx.integerValue("ListABTestExperimentsResponse.result["+ i +"].created"));
			resultItem.setUpdated(_ctx.integerValue("ListABTestExperimentsResponse.result["+ i +"].updated"));
			resultItem.setOnline(_ctx.booleanValue("ListABTestExperimentsResponse.result["+ i +"].online"));
			resultItem.setTraffic(_ctx.integerValue("ListABTestExperimentsResponse.result["+ i +"].traffic"));

			result.add(resultItem);
		}
		listABTestExperimentsResponse.setResult(result);
	 
	 	return listABTestExperimentsResponse;
	}
}