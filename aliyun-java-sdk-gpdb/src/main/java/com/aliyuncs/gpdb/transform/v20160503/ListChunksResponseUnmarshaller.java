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

import com.aliyuncs.gpdb.model.v20160503.ListChunksResponse;
import com.aliyuncs.gpdb.model.v20160503.ListChunksResponse.ChunksItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListChunksResponseUnmarshaller {

	public static ListChunksResponse unmarshall(ListChunksResponse listChunksResponse, UnmarshallerContext _ctx) {
		
		listChunksResponse.setRequestId(_ctx.stringValue("ListChunksResponse.RequestId"));
		listChunksResponse.setTotalRecordCount(_ctx.longValue("ListChunksResponse.TotalRecordCount"));
		listChunksResponse.setPageRecordCount(_ctx.longValue("ListChunksResponse.PageRecordCount"));
		listChunksResponse.setPageNumber(_ctx.longValue("ListChunksResponse.PageNumber"));

		List<ChunksItem> chunks = new ArrayList<ChunksItem>();
		for (int i = 0; i < _ctx.lengthValue("ListChunksResponse.Chunks.Length"); i++) {
			ChunksItem chunksItem = new ChunksItem();
			chunksItem.setContent(_ctx.stringValue("ListChunksResponse.Chunks["+ i +"].Content"));
			chunksItem.setFileName(_ctx.stringValue("ListChunksResponse.Chunks["+ i +"].FileName"));
			chunksItem.setMetadata(_ctx.mapValue("ListChunksResponse.Chunks["+ i +"].Metadata"));
			chunksItem.setLoaderMetadata(_ctx.stringValue("ListChunksResponse.Chunks["+ i +"].LoaderMetadata"));
			chunksItem.setId(_ctx.stringValue("ListChunksResponse.Chunks["+ i +"].Id"));
			chunksItem.setPageIndex(_ctx.longValue("ListChunksResponse.Chunks["+ i +"].PageIndex"));

			List<Double> vector = new ArrayList<Double>();
			for (int j = 0; j < _ctx.lengthValue("ListChunksResponse.Chunks["+ i +"].Vector.Length"); j++) {
				vector.add(_ctx.doubleValue("ListChunksResponse.Chunks["+ i +"].Vector["+ j +"]"));
			}
			chunksItem.setVector(vector);

			chunks.add(chunksItem);
		}
		listChunksResponse.setChunks(chunks);
	 
	 	return listChunksResponse;
	}
}