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

import com.aliyuncs.gpdb.model.v20160503.ListIndicesResponse;
import com.aliyuncs.gpdb.model.v20160503.ListIndicesResponse.IndicesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIndicesResponseUnmarshaller {

	public static ListIndicesResponse unmarshall(ListIndicesResponse listIndicesResponse, UnmarshallerContext _ctx) {
		
		listIndicesResponse.setRequestId(_ctx.stringValue("ListIndicesResponse.RequestId"));
		listIndicesResponse.setMessage(_ctx.stringValue("ListIndicesResponse.Message"));
		listIndicesResponse.setStatus(_ctx.stringValue("ListIndicesResponse.Status"));

		List<IndicesItem> indices = new ArrayList<IndicesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListIndicesResponse.Indices.Length"); i++) {
			IndicesItem indicesItem = new IndicesItem();
			indicesItem.setNamespace(_ctx.stringValue("ListIndicesResponse.Indices["+ i +"].Namespace"));
			indicesItem.setCollection(_ctx.stringValue("ListIndicesResponse.Indices["+ i +"].Collection"));
			indicesItem.setIndexName(_ctx.stringValue("ListIndicesResponse.Indices["+ i +"].IndexName"));
			indicesItem.setIndexDef(_ctx.stringValue("ListIndicesResponse.Indices["+ i +"].IndexDef"));

			indices.add(indicesItem);
		}
		listIndicesResponse.setIndices(indices);
	 
	 	return listIndicesResponse;
	}
}