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
		result.setDatasetId(_ctx.stringValue("QueryDatasetInfoResponse.Result.DatasetId"));
		result.setDatasetName(_ctx.stringValue("QueryDatasetInfoResponse.Result.DatasetName"));
		result.setOwnerName(_ctx.stringValue("QueryDatasetInfoResponse.Result.OwnerName"));
		result.setWorkspaceName(_ctx.stringValue("QueryDatasetInfoResponse.Result.WorkspaceName"));
		result.setOwnerId(_ctx.stringValue("QueryDatasetInfoResponse.Result.OwnerId"));
		result.setRowLevel(_ctx.booleanValue("QueryDatasetInfoResponse.Result.RowLevel"));
		result.setCustimzeSql(_ctx.booleanValue("QueryDatasetInfoResponse.Result.CustimzeSql"));
		result.setGmtCreate(_ctx.stringValue("QueryDatasetInfoResponse.Result.GmtCreate"));
		result.setGmtModify(_ctx.stringValue("QueryDatasetInfoResponse.Result.GmtModify"));
		result.setDsType(_ctx.stringValue("QueryDatasetInfoResponse.Result.DsType"));
		result.setWorkspaceId(_ctx.stringValue("QueryDatasetInfoResponse.Result.WorkspaceId"));
		result.setDsName(_ctx.stringValue("QueryDatasetInfoResponse.Result.DsName"));
		result.setDsId(_ctx.stringValue("QueryDatasetInfoResponse.Result.DsId"));

		Directory directory = new Directory();
		directory.setId(_ctx.stringValue("QueryDatasetInfoResponse.Result.Directory.Id"));
		directory.setName(_ctx.stringValue("QueryDatasetInfoResponse.Result.Directory.Name"));
		directory.setPathId(_ctx.stringValue("QueryDatasetInfoResponse.Result.Directory.PathId"));
		directory.setPathName(_ctx.stringValue("QueryDatasetInfoResponse.Result.Directory.PathName"));
		result.setDirectory(directory);

		List<CubeTableListItem> cubeTableList = new ArrayList<CubeTableListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDatasetInfoResponse.Result.CubeTableList.Length"); i++) {
			CubeTableListItem cubeTableListItem = new CubeTableListItem();
			cubeTableListItem.setTableName(_ctx.stringValue("QueryDatasetInfoResponse.Result.CubeTableList["+ i +"].TableName"));
			cubeTableListItem.setDsType(_ctx.stringValue("QueryDatasetInfoResponse.Result.CubeTableList["+ i +"].DsType"));
			cubeTableListItem.setFactTable(_ctx.booleanValue("QueryDatasetInfoResponse.Result.CubeTableList["+ i +"].FactTable"));
			cubeTableListItem.setDatasourceId(_ctx.stringValue("QueryDatasetInfoResponse.Result.CubeTableList["+ i +"].DatasourceId"));
			cubeTableListItem.setCaption(_ctx.stringValue("QueryDatasetInfoResponse.Result.CubeTableList["+ i +"].Caption"));
			cubeTableListItem.setUniqueId(_ctx.stringValue("QueryDatasetInfoResponse.Result.CubeTableList["+ i +"].UniqueId"));

			cubeTableList.add(cubeTableListItem);
		}
		result.setCubeTableList(cubeTableList);

		List<DimensionListItem> dimensionList = new ArrayList<DimensionListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDatasetInfoResponse.Result.DimensionList.Length"); i++) {
			DimensionListItem dimensionListItem = new DimensionListItem();
			dimensionListItem.setTableUniqueId(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].TableUniqueId"));
			dimensionListItem.setFactColumn(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].FactColumn"));
			dimensionListItem.setGranularity(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].Granularity"));
			dimensionListItem.setRefUid(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].RefUid"));
			dimensionListItem.setExpression(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].Expression"));
			dimensionListItem.setDimensionType(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].DimensionType"));
			dimensionListItem.setUid(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].Uid"));
			dimensionListItem.setCaption(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].Caption"));
			dimensionListItem.setDataType(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].DataType"));

			dimensionList.add(dimensionListItem);
		}
		result.setDimensionList(dimensionList);

		List<MeasureListItem> measureList = new ArrayList<MeasureListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDatasetInfoResponse.Result.MeasureList.Length"); i++) {
			MeasureListItem measureListItem = new MeasureListItem();
			measureListItem.setTableUniqueId(_ctx.stringValue("QueryDatasetInfoResponse.Result.MeasureList["+ i +"].TableUniqueId"));
			measureListItem.setFactColumn(_ctx.stringValue("QueryDatasetInfoResponse.Result.MeasureList["+ i +"].FactColumn"));
			measureListItem.setMeasureType(_ctx.stringValue("QueryDatasetInfoResponse.Result.MeasureList["+ i +"].MeasureType"));
			measureListItem.setExpression(_ctx.stringValue("QueryDatasetInfoResponse.Result.MeasureList["+ i +"].Expression"));
			measureListItem.setUid(_ctx.stringValue("QueryDatasetInfoResponse.Result.MeasureList["+ i +"].Uid"));
			measureListItem.setCaption(_ctx.stringValue("QueryDatasetInfoResponse.Result.MeasureList["+ i +"].Caption"));
			measureListItem.setDataType(_ctx.stringValue("QueryDatasetInfoResponse.Result.MeasureList["+ i +"].DataType"));

			measureList.add(measureListItem);
		}
		result.setMeasureList(measureList);
		queryDatasetInfoResponse.setResult(result);
	 
	 	return queryDatasetInfoResponse;
	}
}