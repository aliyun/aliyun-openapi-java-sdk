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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.QueryContentResponse;
import com.aliyuncs.gpdb.model.v20160503.QueryContentResponse.MatchList;
import com.aliyuncs.gpdb.model.v20160503.QueryContentResponse.Usage;
import com.aliyuncs.gpdb.model.v20160503.QueryContentResponse.WindowMatchesItem;
import com.aliyuncs.gpdb.model.v20160503.QueryContentResponse.WindowMatchesItem.WindowMatchItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryContentResponseUnmarshaller {

	public static QueryContentResponse unmarshall(QueryContentResponse queryContentResponse, UnmarshallerContext _ctx) {
		
		queryContentResponse.setRequestId(_ctx.stringValue("QueryContentResponse.RequestId"));
		queryContentResponse.setMessage(_ctx.stringValue("QueryContentResponse.Message"));
		queryContentResponse.setStatus(_ctx.stringValue("QueryContentResponse.Status"));
		queryContentResponse.setEmbeddingTokens(_ctx.stringValue("QueryContentResponse.EmbeddingTokens"));

		Usage usage = new Usage();
		usage.setEmbeddingTokens(_ctx.stringValue("QueryContentResponse.Usage.EmbeddingTokens"));
		usage.setEmbeddingEntries(_ctx.stringValue("QueryContentResponse.Usage.EmbeddingEntries"));
		queryContentResponse.setUsage(usage);

		List<MatchList> matches = new ArrayList<MatchList>();
		for (int i = 0; i < _ctx.lengthValue("QueryContentResponse.Matches.Length"); i++) {
			MatchList matchList = new MatchList();
			matchList.setId(_ctx.stringValue("QueryContentResponse.Matches["+ i +"].Id"));
			matchList.setContent(_ctx.stringValue("QueryContentResponse.Matches["+ i +"].Content"));
			matchList.setMetadata(_ctx.mapValue("QueryContentResponse.Matches["+ i +"].Metadata"));
			matchList.setFileName(_ctx.stringValue("QueryContentResponse.Matches["+ i +"].FileName"));
			matchList.setScore(_ctx.doubleValue("QueryContentResponse.Matches["+ i +"].Score"));
			matchList.setRetrievalSource(_ctx.integerValue("QueryContentResponse.Matches["+ i +"].RetrievalSource"));
			matchList.setLoaderMetadata(_ctx.stringValue("QueryContentResponse.Matches["+ i +"].LoaderMetadata"));
			matchList.setFileURL(_ctx.stringValue("QueryContentResponse.Matches["+ i +"].FileURL"));
			matchList.setRerankScore(_ctx.doubleValue("QueryContentResponse.Matches["+ i +"].RerankScore"));

			List<Double> vector = new ArrayList<Double>();
			for (int j = 0; j < _ctx.lengthValue("QueryContentResponse.Matches["+ i +"].Vector.Length"); j++) {
				vector.add(_ctx.doubleValue("QueryContentResponse.Matches["+ i +"].Vector["+ j +"]"));
			}
			matchList.setVector(vector);

			matches.add(matchList);
		}
		queryContentResponse.setMatches(matches);

		List<WindowMatchesItem> windowMatches = new ArrayList<WindowMatchesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryContentResponse.WindowMatches.Length"); i++) {
			WindowMatchesItem windowMatchesItem = new WindowMatchesItem();

			List<WindowMatchItem> windowMatch = new ArrayList<WindowMatchItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryContentResponse.WindowMatches["+ i +"].WindowMatch.Length"); j++) {
				WindowMatchItem windowMatchItem = new WindowMatchItem();
				windowMatchItem.setId(_ctx.stringValue("QueryContentResponse.WindowMatches["+ i +"].WindowMatch["+ j +"].Id"));
				windowMatchItem.setContent(_ctx.stringValue("QueryContentResponse.WindowMatches["+ i +"].WindowMatch["+ j +"].Content"));
				windowMatchItem.setMetadata(_ctx.mapValue("QueryContentResponse.WindowMatches["+ i +"].WindowMatch["+ j +"].Metadata"));
				windowMatchItem.setFileName(_ctx.stringValue("QueryContentResponse.WindowMatches["+ i +"].WindowMatch["+ j +"].FileName"));
				windowMatchItem.setLoaderMetadata(_ctx.stringValue("QueryContentResponse.WindowMatches["+ i +"].WindowMatch["+ j +"].LoaderMetadata"));

				windowMatch.add(windowMatchItem);
			}
			windowMatchesItem.setWindowMatch(windowMatch);

			windowMatches.add(windowMatchesItem);
		}
		queryContentResponse.setWindowMatches(windowMatches);
	 
	 	return queryContentResponse;
	}
}