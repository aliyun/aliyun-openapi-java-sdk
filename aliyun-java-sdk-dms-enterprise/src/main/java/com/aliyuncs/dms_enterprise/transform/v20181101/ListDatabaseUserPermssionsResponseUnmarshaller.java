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

import com.aliyuncs.dms_enterprise.model.v20181101.ListDatabaseUserPermssionsResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListDatabaseUserPermssionsResponse.UserPermission;
import com.aliyuncs.dms_enterprise.model.v20181101.ListDatabaseUserPermssionsResponse.UserPermission.PermDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDatabaseUserPermssionsResponseUnmarshaller {

	public static ListDatabaseUserPermssionsResponse unmarshall(ListDatabaseUserPermssionsResponse listDatabaseUserPermssionsResponse, UnmarshallerContext _ctx) {
		
		listDatabaseUserPermssionsResponse.setRequestId(_ctx.stringValue("ListDatabaseUserPermssionsResponse.RequestId"));
		listDatabaseUserPermssionsResponse.setSuccess(_ctx.booleanValue("ListDatabaseUserPermssionsResponse.Success"));
		listDatabaseUserPermssionsResponse.setErrorMessage(_ctx.stringValue("ListDatabaseUserPermssionsResponse.ErrorMessage"));
		listDatabaseUserPermssionsResponse.setErrorCode(_ctx.stringValue("ListDatabaseUserPermssionsResponse.ErrorCode"));
		listDatabaseUserPermssionsResponse.setTotalCount(_ctx.longValue("ListDatabaseUserPermssionsResponse.TotalCount"));

		List<UserPermission> userPermissions = new ArrayList<UserPermission>();
		for (int i = 0; i < _ctx.lengthValue("ListDatabaseUserPermssionsResponse.UserPermissions.Length"); i++) {
			UserPermission userPermission = new UserPermission();
			userPermission.setUserId(_ctx.stringValue("ListDatabaseUserPermssionsResponse.UserPermissions["+ i +"].UserId"));
			userPermission.setUserNickName(_ctx.stringValue("ListDatabaseUserPermssionsResponse.UserPermissions["+ i +"].UserNickName"));
			userPermission.setDsType(_ctx.stringValue("ListDatabaseUserPermssionsResponse.UserPermissions["+ i +"].DsType"));
			userPermission.setDbId(_ctx.stringValue("ListDatabaseUserPermssionsResponse.UserPermissions["+ i +"].DbId"));
			userPermission.setLogic(_ctx.booleanValue("ListDatabaseUserPermssionsResponse.UserPermissions["+ i +"].Logic"));
			userPermission.setSchemaName(_ctx.stringValue("ListDatabaseUserPermssionsResponse.UserPermissions["+ i +"].SchemaName"));
			userPermission.setSearchName(_ctx.stringValue("ListDatabaseUserPermssionsResponse.UserPermissions["+ i +"].SearchName"));
			userPermission.setInstanceId(_ctx.stringValue("ListDatabaseUserPermssionsResponse.UserPermissions["+ i +"].InstanceId"));
			userPermission.setEnvType(_ctx.stringValue("ListDatabaseUserPermssionsResponse.UserPermissions["+ i +"].EnvType"));
			userPermission.setAlias(_ctx.stringValue("ListDatabaseUserPermssionsResponse.UserPermissions["+ i +"].Alias"));
			userPermission.setDbType(_ctx.stringValue("ListDatabaseUserPermssionsResponse.UserPermissions["+ i +"].DbType"));
			userPermission.setTableName(_ctx.stringValue("ListDatabaseUserPermssionsResponse.UserPermissions["+ i +"].TableName"));
			userPermission.setTableId(_ctx.stringValue("ListDatabaseUserPermssionsResponse.UserPermissions["+ i +"].TableId"));
			userPermission.setColumnName(_ctx.stringValue("ListDatabaseUserPermssionsResponse.UserPermissions["+ i +"].ColumnName"));

			List<PermDetail> permDetails = new ArrayList<PermDetail>();
			for (int j = 0; j < _ctx.lengthValue("ListDatabaseUserPermssionsResponse.UserPermissions["+ i +"].PermDetails.Length"); j++) {
				PermDetail permDetail = new PermDetail();
				permDetail.setPermType(_ctx.stringValue("ListDatabaseUserPermssionsResponse.UserPermissions["+ i +"].PermDetails["+ j +"].PermType"));
				permDetail.setExpireDate(_ctx.stringValue("ListDatabaseUserPermssionsResponse.UserPermissions["+ i +"].PermDetails["+ j +"].ExpireDate"));
				permDetail.setCreateDate(_ctx.stringValue("ListDatabaseUserPermssionsResponse.UserPermissions["+ i +"].PermDetails["+ j +"].CreateDate"));
				permDetail.setOriginFrom(_ctx.stringValue("ListDatabaseUserPermssionsResponse.UserPermissions["+ i +"].PermDetails["+ j +"].OriginFrom"));
				permDetail.setUserAccessId(_ctx.stringValue("ListDatabaseUserPermssionsResponse.UserPermissions["+ i +"].PermDetails["+ j +"].UserAccessId"));
				permDetail.setExtraData(_ctx.stringValue("ListDatabaseUserPermssionsResponse.UserPermissions["+ i +"].PermDetails["+ j +"].ExtraData"));

				permDetails.add(permDetail);
			}
			userPermission.setPermDetails(permDetails);

			userPermissions.add(userPermission);
		}
		listDatabaseUserPermssionsResponse.setUserPermissions(userPermissions);
	 
	 	return listDatabaseUserPermssionsResponse;
	}
}