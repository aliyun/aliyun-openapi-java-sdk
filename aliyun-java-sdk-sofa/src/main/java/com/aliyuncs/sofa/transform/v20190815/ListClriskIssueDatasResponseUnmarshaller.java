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

import com.aliyuncs.sofa.model.v20190815.ListClriskIssueDatasResponse;
import com.aliyuncs.sofa.model.v20190815.ListClriskIssueDatasResponse.DataListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClriskIssueDatasResponseUnmarshaller {

	public static ListClriskIssueDatasResponse unmarshall(ListClriskIssueDatasResponse listClriskIssueDatasResponse, UnmarshallerContext _ctx) {
		
		listClriskIssueDatasResponse.setRequestId(_ctx.stringValue("ListClriskIssueDatasResponse.RequestId"));
		listClriskIssueDatasResponse.setResultCode(_ctx.stringValue("ListClriskIssueDatasResponse.ResultCode"));
		listClriskIssueDatasResponse.setResultMessage(_ctx.stringValue("ListClriskIssueDatasResponse.ResultMessage"));
		listClriskIssueDatasResponse.setPageCount(_ctx.longValue("ListClriskIssueDatasResponse.PageCount"));
		listClriskIssueDatasResponse.setPageNumber(_ctx.longValue("ListClriskIssueDatasResponse.PageNumber"));
		listClriskIssueDatasResponse.setPageSize(_ctx.longValue("ListClriskIssueDatasResponse.PageSize"));
		listClriskIssueDatasResponse.setTotalCount(_ctx.longValue("ListClriskIssueDatasResponse.TotalCount"));

		List<DataListItem> dataList = new ArrayList<DataListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClriskIssueDatasResponse.DataList.Length"); i++) {
			DataListItem dataListItem = new DataListItem();
			dataListItem.setCycle(_ctx.stringValue("ListClriskIssueDatasResponse.DataList["+ i +"].Cycle"));
			dataListItem.setDiffSize(_ctx.longValue("ListClriskIssueDatasResponse.DataList["+ i +"].DiffSize"));
			dataListItem.setGmtModified(_ctx.stringValue("ListClriskIssueDatasResponse.DataList["+ i +"].GmtModified"));
			dataListItem.setIssueDataId(_ctx.longValue("ListClriskIssueDatasResponse.DataList["+ i +"].IssueDataId"));
			dataListItem.setTaskId(_ctx.longValue("ListClriskIssueDatasResponse.DataList["+ i +"].TaskId"));

			dataList.add(dataListItem);
		}
		listClriskIssueDatasResponse.setDataList(dataList);
	 
	 	return listClriskIssueDatasResponse;
	}
}