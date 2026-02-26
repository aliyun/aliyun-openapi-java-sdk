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

import com.aliyuncs.dms_enterprise.model.v20181101.ListAuthorizedInstancesForUserResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListAuthorizedInstancesForUserResponse.InstancesItem;
import com.aliyuncs.dms_enterprise.model.v20181101.ListAuthorizedInstancesForUserResponse.InstancesItem.PermissionDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAuthorizedInstancesForUserResponseUnmarshaller {

	public static ListAuthorizedInstancesForUserResponse unmarshall(ListAuthorizedInstancesForUserResponse listAuthorizedInstancesForUserResponse, UnmarshallerContext _ctx) {
		
		listAuthorizedInstancesForUserResponse.setRequestId(_ctx.stringValue("ListAuthorizedInstancesForUserResponse.RequestId"));

		List<InstancesItem> instances = new ArrayList<InstancesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAuthorizedInstancesForUserResponse.Instances.Length"); i++) {
			InstancesItem instancesItem = new InstancesItem();
			instancesItem.setInstanceId(_ctx.stringValue("ListAuthorizedInstancesForUserResponse.Instances["+ i +"].InstanceId"));
			instancesItem.setHost(_ctx.stringValue("ListAuthorizedInstancesForUserResponse.Instances["+ i +"].Host"));
			instancesItem.setPort(_ctx.stringValue("ListAuthorizedInstancesForUserResponse.Instances["+ i +"].Port"));
			instancesItem.setDbType(_ctx.stringValue("ListAuthorizedInstancesForUserResponse.Instances["+ i +"].DbType"));
			instancesItem.setUserId(_ctx.stringValue("ListAuthorizedInstancesForUserResponse.Instances["+ i +"].UserId"));
			instancesItem.setUserName(_ctx.stringValue("ListAuthorizedInstancesForUserResponse.Instances["+ i +"].UserName"));
			instancesItem.setInstanceAlias(_ctx.stringValue("ListAuthorizedInstancesForUserResponse.Instances["+ i +"].InstanceAlias"));
			instancesItem.setEnvType(_ctx.stringValue("ListAuthorizedInstancesForUserResponse.Instances["+ i +"].EnvType"));

			PermissionDetail permissionDetail = new PermissionDetail();
			permissionDetail.setDsType(_ctx.stringValue("ListAuthorizedInstancesForUserResponse.Instances["+ i +"].PermissionDetail.DsType"));
			permissionDetail.setPermType(_ctx.stringValue("ListAuthorizedInstancesForUserResponse.Instances["+ i +"].PermissionDetail.PermType"));
			permissionDetail.setExpireDate(_ctx.stringValue("ListAuthorizedInstancesForUserResponse.Instances["+ i +"].PermissionDetail.ExpireDate"));
			permissionDetail.setMessage(_ctx.stringValue("ListAuthorizedInstancesForUserResponse.Instances["+ i +"].PermissionDetail.Message"));
			instancesItem.setPermissionDetail(permissionDetail);

			instances.add(instancesItem);
		}
		listAuthorizedInstancesForUserResponse.setInstances(instances);
	 
	 	return listAuthorizedInstancesForUserResponse;
	}
}