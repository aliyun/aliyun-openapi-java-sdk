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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.ListDefaultCollectorConfigurationsResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListDefaultCollectorConfigurationsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDefaultCollectorConfigurationsResponseUnmarshaller {

	public static ListDefaultCollectorConfigurationsResponse unmarshall(ListDefaultCollectorConfigurationsResponse listDefaultCollectorConfigurationsResponse, UnmarshallerContext _ctx) {
		
		listDefaultCollectorConfigurationsResponse.setRequestId(_ctx.stringValue("ListDefaultCollectorConfigurationsResponse.RequestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDefaultCollectorConfigurationsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setFileName(_ctx.stringValue("ListDefaultCollectorConfigurationsResponse.Result["+ i +"].fileName"));
			resultItem.setContent(_ctx.stringValue("ListDefaultCollectorConfigurationsResponse.Result["+ i +"].content"));

			result.add(resultItem);
		}
		listDefaultCollectorConfigurationsResponse.setResult(result);
	 
	 	return listDefaultCollectorConfigurationsResponse;
	}
}