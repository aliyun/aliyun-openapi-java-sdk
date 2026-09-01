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

package com.aliyuncs.quickbi_public.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.QueryDatasetInfoResponse;
import com.aliyuncs.quickbi_public.model.v20220101.QueryDatasetInfoResponse.Result;
import com.aliyuncs.quickbi_public.model.v20220101.QueryDatasetInfoResponse.Result.CubeTableListItem;
import com.aliyuncs.quickbi_public.model.v20220101.QueryDatasetInfoResponse.Result.DimensionListItem;
import com.aliyuncs.quickbi_public.model.v20220101.QueryDatasetInfoResponse.Result.Directory;
import com.aliyuncs.quickbi_public.model.v20220101.QueryDatasetInfoResponse.Result.MeasureListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDatasetInfoResponseUnmarshaller {

	public static QueryDatasetInfoResponse unmarshall(QueryDatasetInfoResponse queryDatasetInfoResponse, UnmarshallerContext _ctx) {
		
		queryDatasetInfoResponse.setRequestId(_ctx.stringValue("QueryDatasetInfoResponse.RequestId"));
		queryDatasetInfoResponse.setSuccess(_ctx.booleanValue("QueryDatasetInfoResponse.Success"));

		Result result = new Result();
		result.setOpenOfflineAcceleration(_ctx.booleanValue("QueryDatasetInfoResponse.Result.OpenOfflineAcceleration"));
		result.setOwnerName(_ctx.stringValue("QueryDatasetInfoResponse.Result.OwnerName"));
		result.setWorkspaceId(_ctx.stringValue("QueryDatasetInfoResponse.Result.WorkspaceId"));
		result.setRowLevel(_ctx.booleanValue("QueryDatasetInfoResponse.Result.RowLevel"));
		result.setCustimzeSql(_ctx.booleanValue("QueryDatasetInfoResponse.Result.CustimzeSql"));
		result.setDsId(_ctx.stringValue("QueryDatasetInfoResponse.Result.DsId"));
		result.setDatasetId(_ctx.stringValue("QueryDatasetInfoResponse.Result.DatasetId"));
		result.setDsType(_ctx.stringValue("QueryDatasetInfoResponse.Result.DsType"));
		result.setGmtCreate(_ctx.stringValue("QueryDatasetInfoResponse.Result.GmtCreate"));
		result.setOwnerId(_ctx.stringValue("QueryDatasetInfoResponse.Result.OwnerId"));
		result.setDatasetName(_ctx.stringValue("QueryDatasetInfoResponse.Result.DatasetName"));
		result.setGmtModify(_ctx.stringValue("QueryDatasetInfoResponse.Result.GmtModify"));
		result.setDsName(_ctx.stringValue("QueryDatasetInfoResponse.Result.DsName"));
		result.setWorkspaceName(_ctx.stringValue("QueryDatasetInfoResponse.Result.WorkspaceName"));

		Directory directory = new Directory();
		directory.setPathId(_ctx.stringValue("QueryDatasetInfoResponse.Result.Directory.PathId"));
		directory.setId(_ctx.stringValue("QueryDatasetInfoResponse.Result.Directory.Id"));
		directory.setPathName(_ctx.stringValue("QueryDatasetInfoResponse.Result.Directory.PathName"));
		directory.setName(_ctx.stringValue("QueryDatasetInfoResponse.Result.Directory.Name"));
		result.setDirectory(directory);

		List<MeasureListItem> measureList = new ArrayList<MeasureListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDatasetInfoResponse.Result.MeasureList.Length"); i++) {
			MeasureListItem measureListItem = new MeasureListItem();
			measureListItem.setUid(_ctx.stringValue("QueryDatasetInfoResponse.Result.MeasureList["+ i +"].Uid"));
			measureListItem.setExpression(_ctx.stringValue("QueryDatasetInfoResponse.Result.MeasureList["+ i +"].Expression"));
			measureListItem.setExpressionV2(_ctx.stringValue("QueryDatasetInfoResponse.Result.MeasureList["+ i +"].ExpressionV2"));
			measureListItem.setDataType(_ctx.stringValue("QueryDatasetInfoResponse.Result.MeasureList["+ i +"].DataType"));
			measureListItem.setMeasureType(_ctx.stringValue("QueryDatasetInfoResponse.Result.MeasureList["+ i +"].MeasureType"));
			measureListItem.setTableUniqueId(_ctx.stringValue("QueryDatasetInfoResponse.Result.MeasureList["+ i +"].TableUniqueId"));
			measureListItem.setCaption(_ctx.stringValue("QueryDatasetInfoResponse.Result.MeasureList["+ i +"].Caption"));
			measureListItem.setFieldDescription(_ctx.stringValue("QueryDatasetInfoResponse.Result.MeasureList["+ i +"].FieldDescription"));
			measureListItem.setFactColumn(_ctx.stringValue("QueryDatasetInfoResponse.Result.MeasureList["+ i +"].FactColumn"));

			measureList.add(measureListItem);
		}
		result.setMeasureList(measureList);

		List<DimensionListItem> dimensionList = new ArrayList<DimensionListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDatasetInfoResponse.Result.DimensionList.Length"); i++) {
			DimensionListItem dimensionListItem = new DimensionListItem();
			dimensionListItem.setDimensionType(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].DimensionType"));
			dimensionListItem.setRefUid(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].RefUid"));
			dimensionListItem.setUid(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].Uid"));
			dimensionListItem.setExpression(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].Expression"));
			dimensionListItem.setExpressionV2(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].ExpressionV2"));
			dimensionListItem.setDataType(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].DataType"));
			dimensionListItem.setTableUniqueId(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].TableUniqueId"));
			dimensionListItem.setGranularity(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].Granularity"));
			dimensionListItem.setCaption(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].Caption"));
			dimensionListItem.setFieldDescription(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].FieldDescription"));
			dimensionListItem.setFactColumn(_ctx.stringValue("QueryDatasetInfoResponse.Result.DimensionList["+ i +"].FactColumn"));

			dimensionList.add(dimensionListItem);
		}
		result.setDimensionList(dimensionList);

		List<CubeTableListItem> cubeTableList = new ArrayList<CubeTableListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDatasetInfoResponse.Result.CubeTableList.Length"); i++) {
			CubeTableListItem cubeTableListItem = new CubeTableListItem();
			cubeTableListItem.setTableName(_ctx.stringValue("QueryDatasetInfoResponse.Result.CubeTableList["+ i +"].TableName"));
			cubeTableListItem.setUniqueId(_ctx.stringValue("QueryDatasetInfoResponse.Result.CubeTableList["+ i +"].UniqueId"));
			cubeTableListItem.setFactTable(_ctx.booleanValue("QueryDatasetInfoResponse.Result.CubeTableList["+ i +"].FactTable"));
			cubeTableListItem.setDatasourceId(_ctx.stringValue("QueryDatasetInfoResponse.Result.CubeTableList["+ i +"].DatasourceId"));
			cubeTableListItem.setCustomsql(_ctx.booleanValue("QueryDatasetInfoResponse.Result.CubeTableList["+ i +"].Customsql"));
			cubeTableListItem.setCaption(_ctx.stringValue("QueryDatasetInfoResponse.Result.CubeTableList["+ i +"].Caption"));
			cubeTableListItem.setDsType(_ctx.stringValue("QueryDatasetInfoResponse.Result.CubeTableList["+ i +"].DsType"));
			cubeTableListItem.setSql(_ctx.stringValue("QueryDatasetInfoResponse.Result.CubeTableList["+ i +"].Sql"));

			cubeTableList.add(cubeTableListItem);
		}
		result.setCubeTableList(cubeTableList);
		queryDatasetInfoResponse.setResult(result);
	 
	 	return queryDatasetInfoResponse;
	}
}