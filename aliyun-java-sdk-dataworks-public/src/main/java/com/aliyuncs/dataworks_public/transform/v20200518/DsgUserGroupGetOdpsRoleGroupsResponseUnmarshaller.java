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

import com.aliyuncs.dataworks_public.model.v20200518.DsgUserGroupGetOdpsRoleGroupsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DsgUserGroupGetOdpsRoleGroupsResponseUnmarshaller {

	public static DsgUserGroupGetOdpsRoleGroupsResponse unmarshall(DsgUserGroupGetOdpsRoleGroupsResponse dsgUserGroupGetOdpsRoleGroupsResponse, UnmarshallerContext _ctx) {
		
		dsgUserGroupGetOdpsRoleGroupsResponse.setRequestId(_ctx.stringValue("DsgUserGroupGetOdpsRoleGroupsResponse.RequestId"));
		dsgUserGroupGetOdpsRoleGroupsResponse.setSuccess(_ctx.booleanValue("DsgUserGroupGetOdpsRoleGroupsResponse.Success"));
		dsgUserGroupGetOdpsRoleGroupsResponse.setErrorCode(_ctx.stringValue("DsgUserGroupGetOdpsRoleGroupsResponse.ErrorCode"));
		dsgUserGroupGetOdpsRoleGroupsResponse.setErrorMessage(_ctx.stringValue("DsgUserGroupGetOdpsRoleGroupsResponse.ErrorMessage"));
		dsgUserGroupGetOdpsRoleGroupsResponse.setHttpStatusCode(_ctx.integerValue("DsgUserGroupGetOdpsRoleGroupsResponse.HttpStatusCode"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DsgUserGroupGetOdpsRoleGroupsResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("DsgUserGroupGetOdpsRoleGroupsResponse.Data["+ i +"]"));
		}
		dsgUserGroupGetOdpsRoleGroupsResponse.setData(data);
	 
	 	return dsgUserGroupGetOdpsRoleGroupsResponse;
	}
}