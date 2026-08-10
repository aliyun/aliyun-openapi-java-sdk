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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.SearchKgBySemanticResponse;
import com.aliyuncs.dataphin_public.model.v20230630.SearchKgBySemanticResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.SearchKgBySemanticResponse.Data.SearchResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchKgBySemanticResponseUnmarshaller {

	public static SearchKgBySemanticResponse unmarshall(SearchKgBySemanticResponse searchKgBySemanticResponse, UnmarshallerContext _ctx) {
		
		searchKgBySemanticResponse.setRequestId(_ctx.stringValue("SearchKgBySemanticResponse.RequestId"));
		searchKgBySemanticResponse.setMessage(_ctx.stringValue("SearchKgBySemanticResponse.Message"));
		searchKgBySemanticResponse.setHttpStatusCode(_ctx.integerValue("SearchKgBySemanticResponse.HttpStatusCode"));
		searchKgBySemanticResponse.setCode(_ctx.stringValue("SearchKgBySemanticResponse.Code"));
		searchKgBySemanticResponse.setSuccess(_ctx.booleanValue("SearchKgBySemanticResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("SearchKgBySemanticResponse.Data.TotalCount"));

		List<SearchResult> searchResults = new ArrayList<SearchResult>();
		for (int i = 0; i < _ctx.lengthValue("SearchKgBySemanticResponse.Data.SearchResults.Length"); i++) {
			SearchResult searchResult = new SearchResult();
			searchResult.setMatchedPropertyCode(_ctx.stringValue("SearchKgBySemanticResponse.Data.SearchResults["+ i +"].MatchedPropertyCode"));
			searchResult.setItemTypeCode(_ctx.stringValue("SearchKgBySemanticResponse.Data.SearchResults["+ i +"].ItemTypeCode"));
			searchResult.setMatchedPropertyValue(_ctx.stringValue("SearchKgBySemanticResponse.Data.SearchResults["+ i +"].MatchedPropertyValue"));
			searchResult.setSimilarityScore(_ctx.floatValue("SearchKgBySemanticResponse.Data.SearchResults["+ i +"].SimilarityScore"));
			searchResult.setItemId(_ctx.stringValue("SearchKgBySemanticResponse.Data.SearchResults["+ i +"].ItemId"));

			searchResults.add(searchResult);
		}
		data.setSearchResults(searchResults);
		searchKgBySemanticResponse.setData(data);
	 
	 	return searchKgBySemanticResponse;
	}
}