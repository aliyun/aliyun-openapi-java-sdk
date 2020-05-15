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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryAllDrmCellsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAllDrmCellsResponseUnmarshaller {

	public static QueryAllDrmCellsResponse unmarshall(QueryAllDrmCellsResponse queryAllDrmCellsResponse, UnmarshallerContext _ctx) {
		
		queryAllDrmCellsResponse.setRequestId(_ctx.stringValue("QueryAllDrmCellsResponse.RequestId"));
		queryAllDrmCellsResponse.setResultCode(_ctx.stringValue("QueryAllDrmCellsResponse.ResultCode"));
		queryAllDrmCellsResponse.setResultMessage(_ctx.stringValue("QueryAllDrmCellsResponse.ResultMessage"));

		List<String> cells = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryAllDrmCellsResponse.Cells.Length"); i++) {
			cells.add(_ctx.stringValue("QueryAllDrmCellsResponse.Cells["+ i +"]"));
		}
		queryAllDrmCellsResponse.setCells(cells);
	 
	 	return queryAllDrmCellsResponse;
	}
}