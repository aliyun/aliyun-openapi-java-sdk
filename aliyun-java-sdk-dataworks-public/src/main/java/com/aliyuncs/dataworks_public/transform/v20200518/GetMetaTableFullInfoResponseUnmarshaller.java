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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableFullInfoResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableFullInfoResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableFullInfoResponse.Data.ColumnListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetaTableFullInfoResponseUnmarshaller {

	public static GetMetaTableFullInfoResponse unmarshall(GetMetaTableFullInfoResponse getMetaTableFullInfoResponse, UnmarshallerContext _ctx) {
		
		getMetaTableFullInfoResponse.setRequestId(_ctx.stringValue("GetMetaTableFullInfoResponse.RequestId"));
		getMetaTableFullInfoResponse.setHttpStatusCode(_ctx.integerValue("GetMetaTableFullInfoResponse.HttpStatusCode"));
		getMetaTableFullInfoResponse.setErrorMessage(_ctx.stringValue("GetMetaTableFullInfoResponse.ErrorMessage"));
		getMetaTableFullInfoResponse.setSuccess(_ctx.booleanValue("GetMetaTableFullInfoResponse.Success"));
		getMetaTableFullInfoResponse.setErrorCode(_ctx.stringValue("GetMetaTableFullInfoResponse.ErrorCode"));

		Data data = new Data();
		data.setTableName(_ctx.stringValue("GetMetaTableFullInfoResponse.Data.TableName"));
		data.setComment(_ctx.stringValue("GetMetaTableFullInfoResponse.Data.Comment"));
		data.setLifeCycle(_ctx.integerValue("GetMetaTableFullInfoResponse.Data.LifeCycle"));
		data.setCreateTime(_ctx.longValue("GetMetaTableFullInfoResponse.Data.CreateTime"));
		data.setProjectName(_ctx.stringValue("GetMetaTableFullInfoResponse.Data.ProjectName"));
		data.setProjectId(_ctx.longValue("GetMetaTableFullInfoResponse.Data.ProjectId"));
		data.setOwnerId(_ctx.stringValue("GetMetaTableFullInfoResponse.Data.OwnerId"));
		data.setEnvType(_ctx.integerValue("GetMetaTableFullInfoResponse.Data.EnvType"));
		data.setLastAccessTime(_ctx.longValue("GetMetaTableFullInfoResponse.Data.LastAccessTime"));
		data.setDataSize(_ctx.longValue("GetMetaTableFullInfoResponse.Data.DataSize"));
		data.setLastModifyTime(_ctx.longValue("GetMetaTableFullInfoResponse.Data.LastModifyTime"));
		data.setDatabaseName(_ctx.stringValue("GetMetaTableFullInfoResponse.Data.DatabaseName"));
		data.setIsVisible(_ctx.integerValue("GetMetaTableFullInfoResponse.Data.IsVisible"));
		data.setTotalColumnCount(_ctx.longValue("GetMetaTableFullInfoResponse.Data.TotalColumnCount"));
		data.setTableGuid(_ctx.stringValue("GetMetaTableFullInfoResponse.Data.TableGuid"));
		data.setPartitionKeys(_ctx.stringValue("GetMetaTableFullInfoResponse.Data.PartitionKeys"));
		data.setLastDdlTime(_ctx.longValue("GetMetaTableFullInfoResponse.Data.LastDdlTime"));
		data.setLocation(_ctx.stringValue("GetMetaTableFullInfoResponse.Data.Location"));
		data.setClusterId(_ctx.stringValue("GetMetaTableFullInfoResponse.Data.ClusterId"));
		data.setTenantId(_ctx.longValue("GetMetaTableFullInfoResponse.Data.TenantId"));

		List<ColumnListItem> columnList = new ArrayList<ColumnListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMetaTableFullInfoResponse.Data.ColumnList.Length"); i++) {
			ColumnListItem columnListItem = new ColumnListItem();
			columnListItem.setColumnName(_ctx.stringValue("GetMetaTableFullInfoResponse.Data.ColumnList["+ i +"].ColumnName"));
			columnListItem.setColumnGuid(_ctx.stringValue("GetMetaTableFullInfoResponse.Data.ColumnList["+ i +"].ColumnGuid"));
			columnListItem.setIsPartitionColumn(_ctx.booleanValue("GetMetaTableFullInfoResponse.Data.ColumnList["+ i +"].IsPartitionColumn"));
			columnListItem.setComment(_ctx.stringValue("GetMetaTableFullInfoResponse.Data.ColumnList["+ i +"].Comment"));
			columnListItem.setColumnType(_ctx.stringValue("GetMetaTableFullInfoResponse.Data.ColumnList["+ i +"].ColumnType"));
			columnListItem.setIsPrimaryKey(_ctx.booleanValue("GetMetaTableFullInfoResponse.Data.ColumnList["+ i +"].IsPrimaryKey"));
			columnListItem.setPosition(_ctx.integerValue("GetMetaTableFullInfoResponse.Data.ColumnList["+ i +"].Position"));
			columnListItem.setCaption(_ctx.stringValue("GetMetaTableFullInfoResponse.Data.ColumnList["+ i +"].Caption"));
			columnListItem.setIsForeignKey(_ctx.booleanValue("GetMetaTableFullInfoResponse.Data.ColumnList["+ i +"].IsForeignKey"));

			columnList.add(columnListItem);
		}
		data.setColumnList(columnList);
		getMetaTableFullInfoResponse.setData(data);
	 
	 	return getMetaTableFullInfoResponse;
	}
}