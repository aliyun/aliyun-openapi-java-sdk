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

import com.aliyuncs.opensearch.model.v20171225.ListInterventionDictionaryEntriesResponse;
import com.aliyuncs.opensearch.model.v20171225.ListInterventionDictionaryEntriesResponse.WordItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInterventionDictionaryEntriesResponseUnmarshaller {

	public static ListInterventionDictionaryEntriesResponse unmarshall(ListInterventionDictionaryEntriesResponse listInterventionDictionaryEntriesResponse, UnmarshallerContext _ctx) {
		
		listInterventionDictionaryEntriesResponse.setRequestId(_ctx.stringValue("ListInterventionDictionaryEntriesResponse.requestId"));

		List<WordItem> result = new ArrayList<WordItem>();
		for (int i = 0; i < _ctx.lengthValue("ListInterventionDictionaryEntriesResponse.result.Length"); i++) {
			WordItem wordItem = new WordItem();
			wordItem.setCmd(_ctx.stringValue("ListInterventionDictionaryEntriesResponse.result["+ i +"].cmd"));
			wordItem.setWord(_ctx.stringValue("ListInterventionDictionaryEntriesResponse.result["+ i +"].word"));
			wordItem.setCreated(_ctx.longValue("ListInterventionDictionaryEntriesResponse.result["+ i +"].created"));
			wordItem.setUpdated(_ctx.longValue("ListInterventionDictionaryEntriesResponse.result["+ i +"].updated"));
			wordItem.setStatus(_ctx.stringValue("ListInterventionDictionaryEntriesResponse.result["+ i +"].status"));
			wordItem.setRelevance(_ctx.mapValue("ListInterventionDictionaryEntriesResponse.result["+ i +"].relevance"));

			result.add(wordItem);
		}
		listInterventionDictionaryEntriesResponse.setResult(result);
	 
	 	return listInterventionDictionaryEntriesResponse;
	}
}