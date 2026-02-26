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

package com.aliyuncs.pts.transform.v20201020;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20201020.GetUserVpcsResponse;
import com.aliyuncs.pts.model.v20201020.GetUserVpcsResponse.Vpc;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserVpcsResponseUnmarshaller {

	public static GetUserVpcsResponse unmarshall(GetUserVpcsResponse getUserVpcsResponse, UnmarshallerContext _ctx) {
		
		getUserVpcsResponse.setRequestId(_ctx.stringValue("GetUserVpcsResponse.RequestId"));
		getUserVpcsResponse.setTotalCount(_ctx.longValue("GetUserVpcsResponse.TotalCount"));
		getUserVpcsResponse.setMessage(_ctx.stringValue("GetUserVpcsResponse.Message"));
		getUserVpcsResponse.setPageSize(_ctx.integerValue("GetUserVpcsResponse.PageSize"));
		getUserVpcsResponse.setPageNumber(_ctx.integerValue("GetUserVpcsResponse.PageNumber"));
		getUserVpcsResponse.setHttpStatusCode(_ctx.integerValue("GetUserVpcsResponse.HttpStatusCode"));
		getUserVpcsResponse.setCode(_ctx.stringValue("GetUserVpcsResponse.Code"));
		getUserVpcsResponse.setSuccess(_ctx.booleanValue("GetUserVpcsResponse.Success"));

		List<Vpc> vpcs = new ArrayList<Vpc>();
		for (int i = 0; i < _ctx.lengthValue("GetUserVpcsResponse.Vpcs.Length"); i++) {
			Vpc vpc = new Vpc();
			vpc.setVpcId(_ctx.stringValue("GetUserVpcsResponse.Vpcs["+ i +"].VpcId"));
			vpc.setRegionId(_ctx.stringValue("GetUserVpcsResponse.Vpcs["+ i +"].RegionId"));
			vpc.setVpcName(_ctx.stringValue("GetUserVpcsResponse.Vpcs["+ i +"].VpcName"));
			vpc.setCidrBlock(_ctx.stringValue("GetUserVpcsResponse.Vpcs["+ i +"].CidrBlock"));
			vpc.setDescription(_ctx.stringValue("GetUserVpcsResponse.Vpcs["+ i +"].Description"));
			vpc.setResourceGroupId(_ctx.stringValue("GetUserVpcsResponse.Vpcs["+ i +"].ResourceGroupId"));

			List<String> vSwitchIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetUserVpcsResponse.Vpcs["+ i +"].VSwitchIds.Length"); j++) {
				vSwitchIds.add(_ctx.stringValue("GetUserVpcsResponse.Vpcs["+ i +"].VSwitchIds["+ j +"]"));
			}
			vpc.setVSwitchIds(vSwitchIds);

			List<String> routerTableIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetUserVpcsResponse.Vpcs["+ i +"].RouterTableIds.Length"); j++) {
				routerTableIds.add(_ctx.stringValue("GetUserVpcsResponse.Vpcs["+ i +"].RouterTableIds["+ j +"]"));
			}
			vpc.setRouterTableIds(routerTableIds);

			vpcs.add(vpc);
		}
		getUserVpcsResponse.setVpcs(vpcs);
	 
	 	return getUserVpcsResponse;
	}
}