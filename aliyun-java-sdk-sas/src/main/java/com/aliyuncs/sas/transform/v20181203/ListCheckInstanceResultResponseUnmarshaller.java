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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListCheckInstanceResultResponse;
import com.aliyuncs.sas.model.v20181203.ListCheckInstanceResultResponse.BasicDataItem;
import com.aliyuncs.sas.model.v20181203.ListCheckInstanceResultResponse.ColumnsItem;
import com.aliyuncs.sas.model.v20181203.ListCheckInstanceResultResponse.ColumnsItem.GridsItem;
import com.aliyuncs.sas.model.v20181203.ListCheckInstanceResultResponse.PageInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCheckInstanceResultResponseUnmarshaller {

	public static ListCheckInstanceResultResponse unmarshall(ListCheckInstanceResultResponse listCheckInstanceResultResponse, UnmarshallerContext _ctx) {
		
		listCheckInstanceResultResponse.setRequestId(_ctx.stringValue("ListCheckInstanceResultResponse.RequestId"));

		List<Map<Object, Object>> checks = _ctx.listMapValue("ListCheckInstanceResultResponse.Checks");
		listCheckInstanceResultResponse.setChecks(checks);

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListCheckInstanceResultResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListCheckInstanceResultResponse.PageInfo.PageSize"));
		pageInfo.setNextToken(_ctx.stringValue("ListCheckInstanceResultResponse.PageInfo.NextToken"));
		pageInfo.setMaxResults(_ctx.integerValue("ListCheckInstanceResultResponse.PageInfo.MaxResults"));
		pageInfo.setTotalCount(_ctx.integerValue("ListCheckInstanceResultResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.stringValue("ListCheckInstanceResultResponse.PageInfo.Count"));
		listCheckInstanceResultResponse.setPageInfo(pageInfo);

		List<BasicDataItem> basicData = new ArrayList<BasicDataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCheckInstanceResultResponse.BasicData.Length"); i++) {
			BasicDataItem basicDataItem = new BasicDataItem();
			basicDataItem.setId(_ctx.longValue("ListCheckInstanceResultResponse.BasicData["+ i +"].Id"));
			basicDataItem.setStatus(_ctx.stringValue("ListCheckInstanceResultResponse.BasicData["+ i +"].Status"));
			basicDataItem.setRegionId(_ctx.stringValue("ListCheckInstanceResultResponse.BasicData["+ i +"].RegionId"));
			basicDataItem.setInstanceId(_ctx.stringValue("ListCheckInstanceResultResponse.BasicData["+ i +"].InstanceId"));
			basicDataItem.setInstanceName(_ctx.stringValue("ListCheckInstanceResultResponse.BasicData["+ i +"].InstanceName"));
			basicDataItem.setStatusMessage(_ctx.stringValue("ListCheckInstanceResultResponse.BasicData["+ i +"].StatusMessage"));

			basicData.add(basicDataItem);
		}
		listCheckInstanceResultResponse.setBasicData(basicData);

		List<ColumnsItem> columns = new ArrayList<ColumnsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCheckInstanceResultResponse.Columns.Length"); i++) {
			ColumnsItem columnsItem = new ColumnsItem();
			columnsItem.setType(_ctx.stringValue("ListCheckInstanceResultResponse.Columns["+ i +"].Type"));
			columnsItem.setKey(_ctx.stringValue("ListCheckInstanceResultResponse.Columns["+ i +"].Key"));
			columnsItem.setShowName(_ctx.stringValue("ListCheckInstanceResultResponse.Columns["+ i +"].ShowName"));
			columnsItem.setSearch(_ctx.booleanValue("ListCheckInstanceResultResponse.Columns["+ i +"].Search"));
			columnsItem.setSearchKey(_ctx.stringValue("ListCheckInstanceResultResponse.Columns["+ i +"].SearchKey"));

			List<GridsItem> grids = new ArrayList<GridsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListCheckInstanceResultResponse.Columns["+ i +"].Grids.Length"); j++) {
				GridsItem gridsItem = new GridsItem();
				gridsItem.setType(_ctx.stringValue("ListCheckInstanceResultResponse.Columns["+ i +"].Grids["+ j +"].Type"));
				gridsItem.setKey(_ctx.stringValue("ListCheckInstanceResultResponse.Columns["+ i +"].Grids["+ j +"].Key"));
				gridsItem.setShowName(_ctx.stringValue("ListCheckInstanceResultResponse.Columns["+ i +"].Grids["+ j +"].ShowName"));

				grids.add(gridsItem);
			}
			columnsItem.setGrids(grids);

			columns.add(columnsItem);
		}
		listCheckInstanceResultResponse.setColumns(columns);
	 
	 	return listCheckInstanceResultResponse;
	}
}