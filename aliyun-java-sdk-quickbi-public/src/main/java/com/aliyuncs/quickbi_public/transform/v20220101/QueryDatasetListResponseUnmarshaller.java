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

import com.aliyuncs.quickbi_public.model.v20220101.QueryDatasetListResponse;
import com.aliyuncs.quickbi_public.model.v20220101.QueryDatasetListResponse.Result;
import com.aliyuncs.quickbi_public.model.v20220101.QueryDatasetListResponse.Result.DataItem;
import com.aliyuncs.quickbi_public.model.v20220101.QueryDatasetListResponse.Result.DataItem.DataSource;
import com.aliyuncs.quickbi_public.model.v20220101.QueryDatasetListResponse.Result.DataItem.Directory;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDatasetListResponseUnmarshaller {

	public static QueryDatasetListResponse unmarshall(QueryDatasetListResponse queryDatasetListResponse, UnmarshallerContext _ctx) {
		
		queryDatasetListResponse.setRequestId(_ctx.stringValue("QueryDatasetListResponse.RequestId"));
		queryDatasetListResponse.setSuccess(_ctx.booleanValue("QueryDatasetListResponse.Success"));

		Result result = new Result();
		result.setTotalPages(_ctx.integerValue("QueryDatasetListResponse.Result.TotalPages"));
		result.setPageNum(_ctx.integerValue("QueryDatasetListResponse.Result.PageNum"));
		result.setPageSize(_ctx.integerValue("QueryDatasetListResponse.Result.PageSize"));
		result.setTotalNum(_ctx.integerValue("QueryDatasetListResponse.Result.TotalNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDatasetListResponse.Result.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRowLevel(_ctx.booleanValue("QueryDatasetListResponse.Result.Data["+ i +"].RowLevel"));
			dataItem.setWorkspaceId(_ctx.stringValue("QueryDatasetListResponse.Result.Data["+ i +"].WorkspaceId"));
			dataItem.setDescription(_ctx.stringValue("QueryDatasetListResponse.Result.Data["+ i +"].Description"));
			dataItem.setCreateTime(_ctx.stringValue("QueryDatasetListResponse.Result.Data["+ i +"].CreateTime"));
			dataItem.setOwnerName(_ctx.stringValue("QueryDatasetListResponse.Result.Data["+ i +"].OwnerName"));
			dataItem.setWorkspaceName(_ctx.stringValue("QueryDatasetListResponse.Result.Data["+ i +"].WorkspaceName"));
			dataItem.setOwnerId(_ctx.stringValue("QueryDatasetListResponse.Result.Data["+ i +"].OwnerId"));
			dataItem.setModifyTime(_ctx.stringValue("QueryDatasetListResponse.Result.Data["+ i +"].ModifyTime"));
			dataItem.setDatasetName(_ctx.stringValue("QueryDatasetListResponse.Result.Data["+ i +"].DatasetName"));
			dataItem.setDatasetId(_ctx.stringValue("QueryDatasetListResponse.Result.Data["+ i +"].DatasetId"));
			dataItem.setOpenOfflineAcceleration(_ctx.booleanValue("QueryDatasetListResponse.Result.Data["+ i +"].OpenOfflineAcceleration"));

			DataSource dataSource = new DataSource();
			dataSource.setDsType(_ctx.stringValue("QueryDatasetListResponse.Result.Data["+ i +"].DataSource.DsType"));
			dataSource.setDsName(_ctx.stringValue("QueryDatasetListResponse.Result.Data["+ i +"].DataSource.DsName"));
			dataSource.setDsId(_ctx.stringValue("QueryDatasetListResponse.Result.Data["+ i +"].DataSource.DsId"));
			dataItem.setDataSource(dataSource);

			Directory directory = new Directory();
			directory.setPathId(_ctx.stringValue("QueryDatasetListResponse.Result.Data["+ i +"].Directory.PathId"));
			directory.setPathName(_ctx.stringValue("QueryDatasetListResponse.Result.Data["+ i +"].Directory.PathName"));
			directory.setName(_ctx.stringValue("QueryDatasetListResponse.Result.Data["+ i +"].Directory.Name"));
			directory.setId(_ctx.stringValue("QueryDatasetListResponse.Result.Data["+ i +"].Directory.Id"));
			dataItem.setDirectory(directory);

			data.add(dataItem);
		}
		result.setData(data);
		queryDatasetListResponse.setResult(result);
	 
	 	return queryDatasetListResponse;
	}
}