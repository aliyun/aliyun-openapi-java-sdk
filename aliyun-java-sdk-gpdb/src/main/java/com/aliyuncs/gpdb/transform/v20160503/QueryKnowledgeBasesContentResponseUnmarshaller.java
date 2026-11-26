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

import com.aliyuncs.gpdb.model.v20160503.QueryKnowledgeBasesContentResponse;
import com.aliyuncs.gpdb.model.v20160503.QueryKnowledgeBasesContentResponse.EntitiesItem;
import com.aliyuncs.gpdb.model.v20160503.QueryKnowledgeBasesContentResponse.MatchList;
import com.aliyuncs.gpdb.model.v20160503.QueryKnowledgeBasesContentResponse.RelationsItem;
import com.aliyuncs.gpdb.model.v20160503.QueryKnowledgeBasesContentResponse.Usage;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryKnowledgeBasesContentResponseUnmarshaller {

	public static QueryKnowledgeBasesContentResponse unmarshall(QueryKnowledgeBasesContentResponse queryKnowledgeBasesContentResponse, UnmarshallerContext _ctx) {
		
		queryKnowledgeBasesContentResponse.setRequestId(_ctx.stringValue("QueryKnowledgeBasesContentResponse.RequestId"));
		queryKnowledgeBasesContentResponse.setEmbeddingTokens(_ctx.stringValue("QueryKnowledgeBasesContentResponse.EmbeddingTokens"));
		queryKnowledgeBasesContentResponse.setStatus(_ctx.stringValue("QueryKnowledgeBasesContentResponse.Status"));
		queryKnowledgeBasesContentResponse.setMessage(_ctx.stringValue("QueryKnowledgeBasesContentResponse.Message"));

		Usage usage = new Usage();
		usage.setEmbeddingTokens(_ctx.stringValue("QueryKnowledgeBasesContentResponse.Usage.EmbeddingTokens"));
		usage.setEmbeddingEntries(_ctx.stringValue("QueryKnowledgeBasesContentResponse.Usage.EmbeddingEntries"));
		queryKnowledgeBasesContentResponse.setUsage(usage);

		List<MatchList> matches = new ArrayList<MatchList>();
		for (int i = 0; i < _ctx.lengthValue("QueryKnowledgeBasesContentResponse.Matches.Length"); i++) {
			MatchList matchList = new MatchList();
			matchList.setFileURL(_ctx.stringValue("QueryKnowledgeBasesContentResponse.Matches["+ i +"].FileURL"));
			matchList.setRetrievalSource(_ctx.integerValue("QueryKnowledgeBasesContentResponse.Matches["+ i +"].RetrievalSource"));
			matchList.setScore(_ctx.doubleValue("QueryKnowledgeBasesContentResponse.Matches["+ i +"].Score"));
			matchList.setContent(_ctx.stringValue("QueryKnowledgeBasesContentResponse.Matches["+ i +"].Content"));
			matchList.setFileName(_ctx.stringValue("QueryKnowledgeBasesContentResponse.Matches["+ i +"].FileName"));
			matchList.setMetadata(_ctx.mapValue("QueryKnowledgeBasesContentResponse.Matches["+ i +"].Metadata"));
			matchList.setRerankScore(_ctx.doubleValue("QueryKnowledgeBasesContentResponse.Matches["+ i +"].RerankScore"));
			matchList.setLoaderMetadata(_ctx.stringValue("QueryKnowledgeBasesContentResponse.Matches["+ i +"].LoaderMetadata"));
			matchList.setId(_ctx.stringValue("QueryKnowledgeBasesContentResponse.Matches["+ i +"].Id"));

			matches.add(matchList);
		}
		queryKnowledgeBasesContentResponse.setMatches(matches);

		List<RelationsItem> relations = new ArrayList<RelationsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryKnowledgeBasesContentResponse.Relations.Length"); i++) {
			RelationsItem relationsItem = new RelationsItem();
			relationsItem.setDescription(_ctx.stringValue("QueryKnowledgeBasesContentResponse.Relations["+ i +"].Description"));
			relationsItem.setSourceEntity(_ctx.stringValue("QueryKnowledgeBasesContentResponse.Relations["+ i +"].SourceEntity"));
			relationsItem.setFileName(_ctx.stringValue("QueryKnowledgeBasesContentResponse.Relations["+ i +"].FileName"));
			relationsItem.setId(_ctx.stringValue("QueryKnowledgeBasesContentResponse.Relations["+ i +"].Id"));
			relationsItem.setTargetEntity(_ctx.stringValue("QueryKnowledgeBasesContentResponse.Relations["+ i +"].TargetEntity"));

			relations.add(relationsItem);
		}
		queryKnowledgeBasesContentResponse.setRelations(relations);

		List<EntitiesItem> entities = new ArrayList<EntitiesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryKnowledgeBasesContentResponse.Entities.Length"); i++) {
			EntitiesItem entitiesItem = new EntitiesItem();
			entitiesItem.setEntity(_ctx.stringValue("QueryKnowledgeBasesContentResponse.Entities["+ i +"].Entity"));
			entitiesItem.setType(_ctx.stringValue("QueryKnowledgeBasesContentResponse.Entities["+ i +"].Type"));
			entitiesItem.setDescription(_ctx.stringValue("QueryKnowledgeBasesContentResponse.Entities["+ i +"].Description"));
			entitiesItem.setFileName(_ctx.stringValue("QueryKnowledgeBasesContentResponse.Entities["+ i +"].FileName"));
			entitiesItem.setId(_ctx.stringValue("QueryKnowledgeBasesContentResponse.Entities["+ i +"].Id"));

			entities.add(entitiesItem);
		}
		queryKnowledgeBasesContentResponse.setEntities(entities);
	 
	 	return queryKnowledgeBasesContentResponse;
	}
}