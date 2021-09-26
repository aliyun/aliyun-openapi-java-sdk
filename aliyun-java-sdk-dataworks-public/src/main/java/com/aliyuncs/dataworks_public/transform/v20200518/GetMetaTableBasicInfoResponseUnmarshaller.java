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

import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableBasicInfoResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableBasicInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetaTableBasicInfoResponseUnmarshaller {

	public static GetMetaTableBasicInfoResponse unmarshall(GetMetaTableBasicInfoResponse getMetaTableBasicInfoResponse, UnmarshallerContext _ctx) {
		
		getMetaTableBasicInfoResponse.setRequestId(_ctx.stringValue("GetMetaTableBasicInfoResponse.RequestId"));
		getMetaTableBasicInfoResponse.setHttpStatusCode(_ctx.integerValue("GetMetaTableBasicInfoResponse.HttpStatusCode"));
		getMetaTableBasicInfoResponse.setErrorMessage(_ctx.stringValue("GetMetaTableBasicInfoResponse.ErrorMessage"));
		getMetaTableBasicInfoResponse.setSuccess(_ctx.booleanValue("GetMetaTableBasicInfoResponse.Success"));
		getMetaTableBasicInfoResponse.setErrorCode(_ctx.stringValue("GetMetaTableBasicInfoResponse.ErrorCode"));

		Data data = new Data();
		data.setTableName(_ctx.stringValue("GetMetaTableBasicInfoResponse.Data.TableName"));
		data.setFavoriteCount(_ctx.longValue("GetMetaTableBasicInfoResponse.Data.FavoriteCount"));
		data.setComment(_ctx.stringValue("GetMetaTableBasicInfoResponse.Data.Comment"));
		data.setColumnCount(_ctx.integerValue("GetMetaTableBasicInfoResponse.Data.ColumnCount"));
		data.setCreateTime(_ctx.longValue("GetMetaTableBasicInfoResponse.Data.CreateTime"));
		data.setProjectId(_ctx.longValue("GetMetaTableBasicInfoResponse.Data.ProjectId"));
		data.setOwnerId(_ctx.stringValue("GetMetaTableBasicInfoResponse.Data.OwnerId"));
		data.setEnvType(_ctx.integerValue("GetMetaTableBasicInfoResponse.Data.EnvType"));
		data.setDatabaseName(_ctx.stringValue("GetMetaTableBasicInfoResponse.Data.DatabaseName"));
		data.setIsVisible(_ctx.integerValue("GetMetaTableBasicInfoResponse.Data.IsVisible"));
		data.setTableGuid(_ctx.stringValue("GetMetaTableBasicInfoResponse.Data.TableGuid"));
		data.setReadCount(_ctx.longValue("GetMetaTableBasicInfoResponse.Data.ReadCount"));
		data.setClusterId(_ctx.stringValue("GetMetaTableBasicInfoResponse.Data.ClusterId"));
		data.setIsPartitionTable(_ctx.booleanValue("GetMetaTableBasicInfoResponse.Data.IsPartitionTable"));
		data.setIsView(_ctx.booleanValue("GetMetaTableBasicInfoResponse.Data.IsView"));
		data.setLifeCycle(_ctx.integerValue("GetMetaTableBasicInfoResponse.Data.LifeCycle"));
		data.setProjectName(_ctx.stringValue("GetMetaTableBasicInfoResponse.Data.ProjectName"));
		data.setViewCount(_ctx.longValue("GetMetaTableBasicInfoResponse.Data.ViewCount"));
		data.setLastAccessTime(_ctx.longValue("GetMetaTableBasicInfoResponse.Data.LastAccessTime"));
		data.setDataSize(_ctx.longValue("GetMetaTableBasicInfoResponse.Data.DataSize"));
		data.setLastModifyTime(_ctx.longValue("GetMetaTableBasicInfoResponse.Data.LastModifyTime"));
		data.setLastDdlTime(_ctx.longValue("GetMetaTableBasicInfoResponse.Data.LastDdlTime"));
		data.setPartitionKeys(_ctx.stringValue("GetMetaTableBasicInfoResponse.Data.PartitionKeys"));
		data.setLocation(_ctx.stringValue("GetMetaTableBasicInfoResponse.Data.Location"));
		data.setCaption(_ctx.stringValue("GetMetaTableBasicInfoResponse.Data.Caption"));
		data.setTenantId(_ctx.longValue("GetMetaTableBasicInfoResponse.Data.TenantId"));
		getMetaTableBasicInfoResponse.setData(data);
	 
	 	return getMetaTableBasicInfoResponse;
	}
}