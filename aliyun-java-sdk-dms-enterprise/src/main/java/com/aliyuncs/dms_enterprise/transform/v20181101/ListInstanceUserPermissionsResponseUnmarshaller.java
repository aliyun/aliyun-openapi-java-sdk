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

import com.aliyuncs.dms_enterprise.model.v20181101.ListInstanceUserPermissionsResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListInstanceUserPermissionsResponse.UserPermission;
import com.aliyuncs.dms_enterprise.model.v20181101.ListInstanceUserPermissionsResponse.UserPermission.PermDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceUserPermissionsResponseUnmarshaller {

	public static ListInstanceUserPermissionsResponse unmarshall(ListInstanceUserPermissionsResponse listInstanceUserPermissionsResponse, UnmarshallerContext _ctx) {
		
		listInstanceUserPermissionsResponse.setRequestId(_ctx.stringValue("ListInstanceUserPermissionsResponse.RequestId"));
		listInstanceUserPermissionsResponse.setTotalCount(_ctx.longValue("ListInstanceUserPermissionsResponse.TotalCount"));
		listInstanceUserPermissionsResponse.setErrorCode(_ctx.stringValue("ListInstanceUserPermissionsResponse.ErrorCode"));
		listInstanceUserPermissionsResponse.setErrorMessage(_ctx.stringValue("ListInstanceUserPermissionsResponse.ErrorMessage"));
		listInstanceUserPermissionsResponse.setSuccess(_ctx.booleanValue("ListInstanceUserPermissionsResponse.Success"));

		List<UserPermission> userPermissions = new ArrayList<UserPermission>();
		for (int i = 0; i < _ctx.lengthValue("ListInstanceUserPermissionsResponse.UserPermissions.Length"); i++) {
			UserPermission userPermission = new UserPermission();
			userPermission.setUserId(_ctx.stringValue("ListInstanceUserPermissionsResponse.UserPermissions["+ i +"].UserId"));
			userPermission.setUserNickName(_ctx.stringValue("ListInstanceUserPermissionsResponse.UserPermissions["+ i +"].UserNickName"));
			userPermission.setInstanceId(_ctx.stringValue("ListInstanceUserPermissionsResponse.UserPermissions["+ i +"].InstanceId"));

			List<PermDetail> permDetails = new ArrayList<PermDetail>();
			for (int j = 0; j < _ctx.lengthValue("ListInstanceUserPermissionsResponse.UserPermissions["+ i +"].PermDetails.Length"); j++) {
				PermDetail permDetail = new PermDetail();
				permDetail.setOriginFrom(_ctx.stringValue("ListInstanceUserPermissionsResponse.UserPermissions["+ i +"].PermDetails["+ j +"].OriginFrom"));
				permDetail.setPermType(_ctx.stringValue("ListInstanceUserPermissionsResponse.UserPermissions["+ i +"].PermDetails["+ j +"].PermType"));
				permDetail.setExpireDate(_ctx.stringValue("ListInstanceUserPermissionsResponse.UserPermissions["+ i +"].PermDetails["+ j +"].ExpireDate"));
				permDetail.setCreateDate(_ctx.stringValue("ListInstanceUserPermissionsResponse.UserPermissions["+ i +"].PermDetails["+ j +"].CreateDate"));
				permDetail.setUserAccessId(_ctx.stringValue("ListInstanceUserPermissionsResponse.UserPermissions["+ i +"].PermDetails["+ j +"].UserAccessId"));
				permDetail.setExtraData(_ctx.stringValue("ListInstanceUserPermissionsResponse.UserPermissions["+ i +"].PermDetails["+ j +"].ExtraData"));

				permDetails.add(permDetail);
			}
			userPermission.setPermDetails(permDetails);

			userPermissions.add(userPermission);
		}
		listInstanceUserPermissionsResponse.setUserPermissions(userPermissions);
	 
	 	return listInstanceUserPermissionsResponse;
	}
}