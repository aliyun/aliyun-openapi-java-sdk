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

import com.aliyuncs.gpdb.model.v20160503.ListDocumentCollectionsResponse;
import com.aliyuncs.gpdb.model.v20160503.ListDocumentCollectionsResponse.CollectionList;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDocumentCollectionsResponseUnmarshaller {

	public static ListDocumentCollectionsResponse unmarshall(ListDocumentCollectionsResponse listDocumentCollectionsResponse, UnmarshallerContext _ctx) {
		
		listDocumentCollectionsResponse.setRequestId(_ctx.stringValue("ListDocumentCollectionsResponse.RequestId"));
		listDocumentCollectionsResponse.setStatus(_ctx.stringValue("ListDocumentCollectionsResponse.Status"));
		listDocumentCollectionsResponse.setMessage(_ctx.stringValue("ListDocumentCollectionsResponse.Message"));
		listDocumentCollectionsResponse.setCount(_ctx.integerValue("ListDocumentCollectionsResponse.Count"));

		List<CollectionList> items = new ArrayList<CollectionList>();
		for (int i = 0; i < _ctx.lengthValue("ListDocumentCollectionsResponse.Items.Length"); i++) {
			CollectionList collectionList = new CollectionList();
			collectionList.setCollectionName(_ctx.stringValue("ListDocumentCollectionsResponse.Items["+ i +"].CollectionName"));
			collectionList.setEmbeddingModel(_ctx.stringValue("ListDocumentCollectionsResponse.Items["+ i +"].EmbeddingModel"));
			collectionList.setDimension(_ctx.integerValue("ListDocumentCollectionsResponse.Items["+ i +"].Dimension"));
			collectionList.setFullTextRetrievalFields(_ctx.stringValue("ListDocumentCollectionsResponse.Items["+ i +"].FullTextRetrievalFields"));
			collectionList.setMetadata(_ctx.stringValue("ListDocumentCollectionsResponse.Items["+ i +"].Metadata"));
			collectionList.setParser(_ctx.stringValue("ListDocumentCollectionsResponse.Items["+ i +"].Parser"));
			collectionList.setMetrics(_ctx.stringValue("ListDocumentCollectionsResponse.Items["+ i +"].Metrics"));

			items.add(collectionList);
		}
		listDocumentCollectionsResponse.setItems(items);
	 
	 	return listDocumentCollectionsResponse;
	}
}