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
		getPermApplyOrderDetailResponse.setSuccess(_ctx.booleanValue("GetPermApplyOrderDetailResponse.Success"));
		getPermApplyOrderDetailResponse.setErrorMessage(_ctx.stringValue("GetPermApplyOrderDetailResponse.ErrorMessage"));
		getPermApplyOrderDetailResponse.setErrorCode(_ctx.stringValue("GetPermApplyOrderDetailResponse.ErrorCode"));

		PermApplyOrderDetail permApplyOrderDetail = new PermApplyOrderDetail();
		permApplyOrderDetail.setPermType(_ctx.longValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.PermType"));
		permApplyOrderDetail.setSeconds(_ctx.longValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Seconds"));
		permApplyOrderDetail.setApplyType(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.ApplyType"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources.Length"); i++) {
			Resource resource = new Resource();

			DatabaseInfo databaseInfo = new DatabaseInfo();
			databaseInfo.setDbId(_ctx.longValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].DatabaseInfo.DbId"));
			databaseInfo.setLogic(_ctx.booleanValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].DatabaseInfo.Logic"));
			databaseInfo.setDbType(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].DatabaseInfo.DbType"));
			databaseInfo.setSearchName(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].DatabaseInfo.SearchName"));
			databaseInfo.setEnvType(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].DatabaseInfo.EnvType"));

			List<Long> ownerIds = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].DatabaseInfo.OwnerIds.Length"); j++) {
				ownerIds.add(_ctx.longValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].DatabaseInfo.OwnerIds["+ j +"]"));
			}
			databaseInfo.setOwnerIds(ownerIds);

			List<String> ownerNickNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].DatabaseInfo.OwnerNickNames.Length"); j++) {
				ownerNickNames.add(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].DatabaseInfo.OwnerNickNames["+ j +"]"));
			}
			databaseInfo.setOwnerNickNames(ownerNickNames);
			resource.setDatabaseInfo(databaseInfo);

			TableInfo tableInfo = new TableInfo();
			tableInfo.setTableName(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].TableInfo.TableName"));
			resource.setTableInfo(tableInfo);

			ColumnInfo columnInfo = new ColumnInfo();
			columnInfo.setTableName(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].ColumnInfo.TableName"));
			columnInfo.setColumnName(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].ColumnInfo.ColumnName"));
			resource.setColumnInfo(columnInfo);

			InstanceInfo instanceInfo = new InstanceInfo();
			instanceInfo.setInstanceId(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].InstanceInfo.InstanceId"));
			instanceInfo.setSearchName(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].InstanceInfo.SearchName"));
			instanceInfo.setDbType(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].InstanceInfo.DbType"));
			instanceInfo.setEnvType(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].InstanceInfo.EnvType"));
			instanceInfo.setHost(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].InstanceInfo.Host"));
			instanceInfo.setPort(_ctx.longValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].InstanceInfo.Port"));
			instanceInfo.setDbaId(_ctx.longValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].InstanceInfo.DbaId"));
			instanceInfo.setDbaNickName(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].InstanceInfo.DbaNickName"));

			List<Long> ownerIds1 = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].InstanceInfo.OwnerIds.Length"); j++) {
				ownerIds1.add(_ctx.longValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].InstanceInfo.OwnerIds["+ j +"]"));
			}
			instanceInfo.setOwnerIds1(ownerIds1);

			List<String> ownerNickName = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].InstanceInfo.OwnerNickName.Length"); j++) {
				ownerNickName.add(_ctx.stringValue("GetPermApplyOrderDetailResponse.PermApplyOrderDetail.Resources["+ i +"].InstanceInfo.OwnerNickName["+ j +"]"));
			}
			instanceInfo.setOwnerNickName(ownerNickName);
			resource.setInstanceInfo(instanceInfo);

			resources.add(resource);
		}
		permApplyOrderDetail.setResources(resources);
		getPermApplyOrderDetailResponse.setPermApplyOrderDetail(permApplyOrderDetail);
	 
	 	return getPermApplyOrderDetailResponse;
	}
}