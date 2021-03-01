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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListIndexesResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListIndexesResponse.Index;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIndexesResponseUnmarshaller {

	public static ListIndexesResponse unmarshall(ListIndexesResponse listIndexesResponse, UnmarshallerContext _ctx) {
		
		listIndexesResponse.setRequestId(_ctx.stringValue("ListIndexesResponse.RequestId"));
		listIndexesResponse.setErrorCode(_ctx.stringValue("ListIndexesResponse.ErrorCode"));
		listIndexesResponse.setErrorMessage(_ctx.stringValue("ListIndexesResponse.ErrorMessage"));
		listIndexesResponse.setSuccess(_ctx.booleanValue("ListIndexesResponse.Success"));

		List<Index> indexList = new ArrayList<Index>();
		for (int i = 0; i < _ctx.lengthValue("ListIndexesResponse.IndexList.Length"); i++) {
			Index index = new Index();
			index.setTableId(_ctx.stringValue("ListIndexesResponse.IndexList["+ i +"].TableId"));
			index.setIndexName(_ctx.stringValue("ListIndexesResponse.IndexList["+ i +"].IndexName"));
			index.setIndexId(_ctx.stringValue("ListIndexesResponse.IndexList["+ i +"].IndexId"));
			index.setIndexComment(_ctx.stringValue("ListIndexesResponse.IndexList["+ i +"].IndexComment"));
			index.setIndexType(_ctx.stringValue("ListIndexesResponse.IndexList["+ i +"].IndexType"));

			indexList.add(index);
		}
		listIndexesResponse.setIndexList(indexList);
	 
	 	return listIndexesResponse;
	}
}