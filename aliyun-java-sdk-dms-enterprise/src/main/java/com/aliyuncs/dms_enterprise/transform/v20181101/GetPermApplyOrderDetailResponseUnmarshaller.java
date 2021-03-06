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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.GetPermApplyOrderDetailResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetPermApplyOrderDetailResponse.PermApplyOrderDetail;
import com.aliyuncs.dms_enterprise.model.v20181101.GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resource;
import com.aliyuncs.dms_enterprise.model.v20181101.GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resource.ColumnInfo;
import com.aliyuncs.dms_enterprise.model.v20181101.GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resource.DatabaseInfo;
import com.aliyuncs.dms_enterprise.model.v20181101.GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resource.InstanceInfo;
import com.aliyuncs.dms_enterprise.model.v20181101.GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resource.TableInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPermApplyOrderDetailResponseUnmarshaller {

	public static GetPermApplyOrderDetailResponse unmarshall(GetPermApplyOrderDetailResponse getPermApplyOrderDetailResponse, UnmarshallerContext _ctx) {
		
		getPermApplyOrderDetailResponse.setRequestId(_ctx.stringValue("GetPermApplyOrderDetailResponse.RequestId"));
		getPermApplyOrderDetailResponse.setErrorCode(_ctx.stringValue("GetPermApplyOrderDetailResponse.ErrorCode"));
		getPermApplyOrderDetailResponse.setErrorMessage(_ctx.stringValue("GetPermApplyOrderDetailResponse.ErrorMessage"));
		getPermApplyOrderDetailResponse.setSuccess(_ctx.booleanValue("GetPermApplyOrderDetailResponse.Success"));

		PermApplyOrderDetail permApplyOrderDetail = new PermApplyOrderDetail();
		permApplyOrderDetail.setApplyType(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.ApplyType"));
		permApplyOrderDetail.setPermType(_ctx.longValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.PermType"));
		permApplyOrderDetail.setSeconds(_ctx.longValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Seconds"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources.Length"); i++) {
			Resource resource = new Resource();

			DatabaseInfo databaseInfo = new DatabaseInfo();
			databaseInfo.setSearchName(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].DatabaseInfo.SearchName"));
			databaseInfo.setDbId(_ctx.longValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].DatabaseInfo.DbId"));
			databaseInfo.setLogic(_ctx.booleanValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].DatabaseInfo.Logic"));
			databaseInfo.setEnvType(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].DatabaseInfo.EnvType"));
			databaseInfo.setDbType(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].DatabaseInfo.DbType"));

			List<String> ownerNickNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].DatabaseInfo.OwnerNickNames.Length"); j++) {
				ownerNickNames.add(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].DatabaseInfo.OwnerNickNames["+ j +"]"));
			}
			databaseInfo.setOwnerNickNames(ownerNickNames);

			List<Long> ownerIds = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].DatabaseInfo.OwnerIds.Length"); j++) {
				ownerIds.add(_ctx.longValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].DatabaseInfo.OwnerIds["+ j +"]"));
			}
			databaseInfo.setOwnerIds(ownerIds);
			resource.setDatabaseInfo(databaseInfo);

			ColumnInfo columnInfo = new ColumnInfo();
			columnInfo.setColumnName(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].ColumnInfo.ColumnName"));
			columnInfo.setTableName(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].ColumnInfo.TableName"));
			resource.setColumnInfo(columnInfo);

			TableInfo tableInfo = new TableInfo();
			tableInfo.setTableName(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].TableInfo.TableName"));
			resource.setTableInfo(tableInfo);

			InstanceInfo instanceInfo = new InstanceInfo();
			instanceInfo.setDbaId(_ctx.longValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].InstanceInfo.DbaId"));
			instanceInfo.setSearchName(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].InstanceInfo.SearchName"));
			instanceInfo.setInstanceId(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].InstanceInfo.InstanceId"));
			instanceInfo.setPort(_ctx.longValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].InstanceInfo.Port"));
			instanceInfo.setHost(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].InstanceInfo.Host"));
			instanceInfo.setDbaNickName(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].InstanceInfo.DbaNickName"));
			instanceInfo.setEnvType(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].InstanceInfo.EnvType"));
			instanceInfo.setDbType(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].InstanceInfo.DbType"));

			List<String> ownerNickName = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].InstanceInfo.OwnerNickName.Length"); j++) {
				ownerNickName.add(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].InstanceInfo.OwnerNickName["+ j +"]"));
			}
			instanceInfo.setOwnerNickName(ownerNickName);

			List<Long> ownerIds1 = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].InstanceInfo.OwnerIds.Length"); j++) {
				ownerIds1.add(_ctx.longValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].InstanceInfo.OwnerIds["+ j +"]"));
			}
			instanceInfo.setOwnerIds1(ownerIds1);
			resource.setInstanceInfo(instanceInfo);

			resources.add(resource);
		}
		permApplyOrderDetail.setResources(resources);
		getPermApplyOrderDetailResponse.setPermApplyOrderDetail(permApplyOrderDetail);
	 
	 	return getPermApplyOrderDetailResponse;
	}
}