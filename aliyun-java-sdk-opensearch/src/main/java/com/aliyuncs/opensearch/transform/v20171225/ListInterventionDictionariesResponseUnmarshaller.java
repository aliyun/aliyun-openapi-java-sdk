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

import com.aliyuncs.opensearch.model.v20171225.ListInterventionDictionariesResponse;
import com.aliyuncs.opensearch.model.v20171225.ListInterventionDictionariesResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInterventionDictionariesResponseUnmarshaller {

	public static ListInterventionDictionariesResponse unmarshall(ListInterventionDictionariesResponse listInterventionDictionariesResponse, UnmarshallerContext _ctx) {
		
		listInterventionDictionariesResponse.setRequestId(_ctx.stringValue("ListInterventionDictionariesResponse.requestId"));
		listInterventionDictionariesResponse.setTotalCount(_ctx.integerValue("ListInterventionDictionariesResponse.totalCount"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListInterventionDictionariesResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.integerValue("ListInterventionDictionariesResponse.result["+ i +"].id"));
			resultItem.setName(_ctx.stringValue("ListInterventionDictionariesResponse.result["+ i +"].name"));
			resultItem.setType(_ctx.stringValue("ListInterventionDictionariesResponse.result["+ i +"].type"));
			resultItem.setAnalyzer(_ctx.stringValue("ListInterventionDictionariesResponse.result["+ i +"].analyzer"));
			resultItem.setCreated(_ctx.integerValue("ListInterventionDictionariesResponse.result["+ i +"].created"));
			resultItem.setUpdated(_ctx.integerValue("ListInterventionDictionariesResponse.result["+ i +"].updated"));

			result.add(resultItem);
		}
		listInterventionDictionariesResponse.setResult(result);
	 
	 	return listInterventionDictionariesResponse;
	}
}