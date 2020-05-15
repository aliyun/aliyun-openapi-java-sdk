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

package com.aliyuncs.retailcloud.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailcloud.model.v20180313.DescribeAppDetailResponse;
import com.aliyuncs.retailcloud.model.v20180313.DescribeAppDetailResponse.Result;
import com.aliyuncs.retailcloud.model.v20180313.DescribeAppDetailResponse.Result.MiddleWareInfo;
import com.aliyuncs.retailcloud.model.v20180313.DescribeAppDetailResponse.Result.UserRole;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppDetailResponseUnmarshaller {

	public static DescribeAppDetailResponse unmarshall(DescribeAppDetailResponse describeAppDetailResponse, UnmarshallerContext _ctx) {
		
		describeAppDetailResponse.setRequestId(_ctx.stringValue("DescribeAppDetailResponse.RequestId"));
		describeAppDetailResponse.setCode(_ctx.longValue("DescribeAppDetailResponse.Code"));
		describeAppDetailResponse.setErrMessage(_ctx.stringValue("DescribeAppDetailResponse.ErrMessage"));

		Result result = new Result();
		result.setServiceType(_ctx.stringValue("DescribeAppDetailResponse.Result.ServiceType"));
		result.setBizTitle(_ctx.stringValue("DescribeAppDetailResponse.Result.BizTitle"));
		result.setBizName(_ctx.stringValue("DescribeAppDetailResponse.Result.BizName"));
		result.setAppId(_ctx.longValue("DescribeAppDetailResponse.Result.AppId"));
		result.setLanguage(_ctx.stringValue("DescribeAppDetailResponse.Result.Language"));
		result.setTitle(_ctx.stringValue("DescribeAppDetailResponse.Result.Title"));
		result.setOperatingSystem(_ctx.stringValue("DescribeAppDetailResponse.Result.OperatingSystem"));
		result.setDeployType(_ctx.stringValue("DescribeAppDetailResponse.Result.DeployType"));
		result.setDescription(_ctx.stringValue("DescribeAppDetailResponse.Result.Description"));
		result.setAppStateType(_ctx.stringValue("DescribeAppDetailResponse.Result.AppStateType"));

		List<UserRole> userRoles = new ArrayList<UserRole>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppDetailResponse.Result.UserRoles.Length"); i++) {
			UserRole userRole = new UserRole();
			userRole.setUserId(_ctx.stringValue("DescribeAppDetailResponse.Result.UserRoles["+ i +"].UserId"));
			userRole.setUserType(_ctx.stringValue("DescribeAppDetailResponse.Result.UserRoles["+ i +"].UserType"));
			userRole.setRealName(_ctx.stringValue("DescribeAppDetailResponse.Result.UserRoles["+ i +"].RealName"));
			userRole.setRoleName(_ctx.stringValue("DescribeAppDetailResponse.Result.UserRoles["+ i +"].RoleName"));

			userRoles.add(userRole);
		}
		result.setUserRoles(userRoles);

		List<MiddleWareInfo> middleWareInfoList = new ArrayList<MiddleWareInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppDetailResponse.Result.MiddleWareInfoList.Length"); i++) {
			MiddleWareInfo middleWareInfo = new MiddleWareInfo();
			middleWareInfo.setAppId(_ctx.longValue("DescribeAppDetailResponse.Result.MiddleWareInfoList["+ i +"].AppId"));
			middleWareInfo.setCode(_ctx.integerValue("DescribeAppDetailResponse.Result.MiddleWareInfoList["+ i +"].Code"));
			middleWareInfo.setName(_ctx.stringValue("DescribeAppDetailResponse.Result.MiddleWareInfoList["+ i +"].Name"));

			middleWareInfoList.add(middleWareInfo);
		}
		result.setMiddleWareInfoList(middleWareInfoList);
		describeAppDetailResponse.setResult(result);
	 
	 	return describeAppDetailResponse;
	}
}