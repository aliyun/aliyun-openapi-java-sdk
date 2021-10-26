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

package com.aliyuncs.quickbi_public.transform.v20200806;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20200806.QueryDatasetInfoResponse;
import com.aliyuncs.quickbi_public.model.v20200806.QueryDatasetInfoResponse.Result;
import com.aliyuncs.quickbi_public.model.v20200806.QueryDatasetInfoResponse.Result.CubeTableListItem;
import com.aliyuncs.quickbi_public.model.v20200806.QueryDatasetInfoResponse.Result.DimensionListItem;
import com.aliyuncs.quickbi_public.model.v20200806.QueryDatasetInfoResponse.Result.Directory;
import com.aliyuncs.quickbi_public.model.v20200806.QueryDatasetInfoResponse.Result.MeasureListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDatasetInfoResponseUnmarshaller {

	public static QueryDatasetInfoResponse unmarshall(QueryDatasetInfoResponse queryDatasetInfoResponse, UnmarshallerContext _ctx) {
		
		queryDatasetInfoResponse.setRequestId(_ctx.stringValue("QueryDatasetInfoResponse.RequestId"));
		queryDatasetInfoResponse.setSuccess(_ctx.booleanValue("QueryDatasetInfoResponse.Success"));

		Result result = new Result();
		result.setGmtModify(_ctx.stringValue("QueryDatasetInfoResponse.Result.GmtModify"));
		result.setDsName(_ctx.stringValue("QueryDatasetInfoResponse.Result.DsName"));
		result.setDsId(_ctx.stringValue("QueryDatasetInfoResponse.Result.DsId"));
		result.setOwnerName(_ctx.stringValue("QueryDatasetInfoResponse.Result.OwnerName"));
		result.setWorkspaceName(_ctx.stringValue("QueryDatasetInfoResponse.Result.WorkspaceName"));
		result.setOwnerId(_ctx.stringValue("QueryDatasetInfoResponse.Result.OwnerId"));
		result.setDatasetName(_ctx.stringValue("QueryDatasetInfoResponse.Result.DatasetName"));
		result.setRowLevel(_ctx.booleanValue("QueryDatasetInfoResponse.Result.RowLevel"));
		result.setWorkspaceId(_ctx.stringValue("QueryDatasetInfoResponse.Result.WorkspaceId"));
		result.setCustimzeSql(_ctx.booleanValue("QueryDatasetInfoResponse.Result.CustimzeSql"));
		result.setGmtCreate(_ctx.stringValue("QueryDatasetInfoResponse.Result.GmtCreate"));
		result.setDsType(_ctx.stringValue("QueryDatasetInfoResponse.Result.DsType"));
		result.setDatasetId(_ctx.stringValue("QueryDatasetInfoResponse.Result.DatasetId"));

		Directory directory = new Directory();
		directory.setPathId(_ctx.stringValue("QueryDatasetInfoResponse.Result.Directory.PathId"));
		directory.setPathName(_ctx.stringValue("QueryDatasetInfoResponse.Result.Directory.PathName"));
		directory.setName(_ctx.stringValue("QueryDatasetInfoResponse.Result.Directory.Name"));
		directory.setId(_ctx.stringValue("QueryDatasetInfoResponse.Result.Directory.Id"));
		result.setDirectory(directory);

		List<CubeTableListItem> cubeTableList = new ArrayList<CubeTableListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDatasetInfoResponse.Result.CubeTableList.Length"); i++) {
			CubeTableListItem cubeTableListItem = new CubeTableListItem();
			cubeTableListItem.setTableName(_ctx.stringValue("QueryDatasetInfoResponse.Result.CubeTableList["+ i +"].TableName"));
			cubeTableListItem.setDatasourceId(_ctx.stringValue("QueryDatasetInfoResponse.Result.CubeTableList["+ i +"].DatasourceId"));
			cubeTableListItem.setDsType(_ctx.stringValue("QueryDatasetInfoResponse.Result.CubeTableList["+ i +"].DsType"));
			cubeTableListItem.setUniqueId(_ctx.stringValue("QueryDatasetInfoResponse.Result.CubeTableList["+ i +"].UniqueId"));
			cubeTableListItem.setFactTable(_ctx.booleanValue("QueryDatasetInfoResponse.Result.CubeTableList["+ i +"].FactTable"));
			cubeTableListItem.setCaption(_ctx.stringValue("QueryDatasetInfoResponse.Result.CubeTableList["+ i +"].Caption"));
			cubeTableListItem.setCustomsql(_ctx.booleanValue("QueryDatasetInfoResponse.Result.CubeTableList["+ i +"].Customsql"));
			cubeTableListItem.setSql(_ctx.stringValue("QueryDatasetInfoResponse.Result.CubeTableList["+ i +"].Sql"));

			cubeTableList.add(cubeTableListItem);
		}
		result.setCubeTableList(cubeTableList);

		List<DimensionListItem> dimensionList = new ArrayList<DimensionListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDatasetInfoResponse.Result.DimensionList.Length"); i++) {
			DimensionListItem dimensionListItem = new DimensionListItem();
			dimensionListItem.setDataType(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].DataType"));
			dimensionListItem.setExpression(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].Expression"));
			dimensionListItem.setFactColumn(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].FactColumn"));
			dimensionListItem.setDimensionType(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].DimensionType"));
			dimensionListItem.setGranularity(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].Granularity"));
			dimensionListItem.setRefUid(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].RefUid"));
			dimensionListItem.setCaption(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].Caption"));
			dimensionListItem.setUid(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].Uid"));
			dimensionListItem.setTableUniqueId(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].TableUniqueId"));

			dimensionList.add(dimensionListItem);
		}
		result.setDimensionList(dimensionList);

		List<MeasureListItem> measureList = new ArrayList<MeasureListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDatasetInfoResponse.Result.MeasureList.Length"); i++) {
			MeasureListItem measureListItem = new MeasureListItem();
			measureListItem.setDataType(_ctx.stringValue("QueryDatasetInfoResponse.Result.MeasureList["+ i +"].DataType"));
			measureListItem.setExpression(_ctx.stringValue("QueryDatasetInfoResponse.Result.MeasureList["+ i +"].Expression"));
			measureListItem.setMeasureType(_ctx.stringValue("QueryDatasetInfoResponse.Result.MeasureList["+ i +"].MeasureType"));
			measureListItem.setFactColumn(_ctx.stringValue("QueryDatasetInfoResponse.Result.MeasureList["+ i +"].FactColumn"));
			measureListItem.setCaption(_ctx.stringValue("QueryDatasetInfoResponse.Result.MeasureList["+ i +"].Caption"));
			measureListItem.setTableUniqueId(_ctx.stringValue("QueryDatasetInfoResponse.Result.MeasureList["+ i +"].TableUniqueId"));
			measureListItem.setUid(_ctx.stringValue("QueryDatasetInfoResponse.Result.MeasureList["+ i +"].Uid"));

			measureList.add(measureListItem);
		}
		result.setMeasureList(measureList);
		queryDatasetInfoResponse.setResult(result);
	 
	 	return queryDatasetInfoResponse;
	}
}