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

import com.aliyuncs.opensearch.model.v20171225.ListInterventionDictionaryNerResultsResponse;
import com.aliyuncs.opensearch.model.v20171225.ListInterventionDictionaryNerResultsResponse.NerItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInterventionDictionaryNerResultsResponseUnmarshaller {

	public static ListInterventionDictionaryNerResultsResponse unmarshall(ListInterventionDictionaryNerResultsResponse listInterventionDictionaryNerResultsResponse, UnmarshallerContext _ctx) {
		
		listInterventionDictionaryNerResultsResponse.setRequestId(_ctx.stringValue("ListInterventionDictionaryNerResultsResponse.requestId"));

		List<NerItem> result = new ArrayList<NerItem>();
		for (int i = 0; i < _ctx.lengthValue("ListInterventionDictionaryNerResultsResponse.result.Length"); i++) {
			NerItem nerItem = new NerItem();
			nerItem.setTag(_ctx.stringValue("ListInterventionDictionaryNerResultsResponse.result["+ i +"].tag"));
			nerItem.setTagLabel(_ctx.stringValue("ListInterventionDictionaryNerResultsResponse.result["+ i +"].tagLabel"));
			nerItem.setToken(_ctx.stringValue("ListInterventionDictionaryNerResultsResponse.result["+ i +"].token"));
			nerItem.setOrder(_ctx.integerValue("ListInterventionDictionaryNerResultsResponse.result["+ i +"].order"));

			result.add(nerItem);
		}
		listInterventionDictionaryNerResultsResponse.setResult(result);
	 
	 	return listInterventionDictionaryNerResultsResponse;
	}
}