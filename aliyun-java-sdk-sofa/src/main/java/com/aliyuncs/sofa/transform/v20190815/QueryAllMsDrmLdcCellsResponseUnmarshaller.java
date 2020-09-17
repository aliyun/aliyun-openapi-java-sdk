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

import com.aliyuncs.sofa.model.v20190815.QueryAllMsDrmLdcCellsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryAllMsDrmLdcCellsResponse.NewCellsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAllMsDrmLdcCellsResponseUnmarshaller {

	public static QueryAllMsDrmLdcCellsResponse unmarshall(QueryAllMsDrmLdcCellsResponse queryAllMsDrmLdcCellsResponse, UnmarshallerContext _ctx) {
		
		queryAllMsDrmLdcCellsResponse.setRequestId(_ctx.stringValue("QueryAllMsDrmLdcCellsResponse.RequestId"));
		queryAllMsDrmLdcCellsResponse.setResultCode(_ctx.stringValue("QueryAllMsDrmLdcCellsResponse.ResultCode"));
		queryAllMsDrmLdcCellsResponse.setResultMessage(_ctx.stringValue("QueryAllMsDrmLdcCellsResponse.ResultMessage"));
		queryAllMsDrmLdcCellsResponse.setIsLdc(_ctx.booleanValue("QueryAllMsDrmLdcCellsResponse.IsLdc"));

		List<String> oldCells = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryAllMsDrmLdcCellsResponse.OldCells.Length"); i++) {
			oldCells.add(_ctx.stringValue("QueryAllMsDrmLdcCellsResponse.OldCells["+ i +"]"));
		}
		queryAllMsDrmLdcCellsResponse.setOldCells(oldCells);

		List<NewCellsItem> newCells = new ArrayList<NewCellsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryAllMsDrmLdcCellsResponse.NewCells.Length"); i++) {
			NewCellsItem newCellsItem = new NewCellsItem();
			newCellsItem.setName(_ctx.stringValue("QueryAllMsDrmLdcCellsResponse.NewCells["+ i +"].Name"));
			newCellsItem.setType(_ctx.stringValue("QueryAllMsDrmLdcCellsResponse.NewCells["+ i +"].Type"));

			newCells.add(newCellsItem);
		}
		queryAllMsDrmLdcCellsResponse.setNewCells(newCells);
	 
	 	return queryAllMsDrmLdcCellsResponse;
	}
}