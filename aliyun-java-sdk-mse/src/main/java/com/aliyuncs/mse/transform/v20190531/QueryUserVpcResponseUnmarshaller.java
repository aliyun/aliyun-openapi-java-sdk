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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.QueryUserVpcResponse;
import com.aliyuncs.mse.model.v20190531.QueryUserVpcResponse.Vpcs;
import com.aliyuncs.mse.model.v20190531.QueryUserVpcResponse.Vpcs.VSwitchListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUserVpcResponseUnmarshaller {

	public static QueryUserVpcResponse unmarshall(QueryUserVpcResponse queryUserVpcResponse, UnmarshallerContext _ctx) {
		
		queryUserVpcResponse.setRequestId(_ctx.stringValue("QueryUserVpcResponse.RequestId"));
		queryUserVpcResponse.setHttpStatusCode(_ctx.integerValue("QueryUserVpcResponse.HttpStatusCode"));
		queryUserVpcResponse.setMessage(_ctx.stringValue("QueryUserVpcResponse.Message"));
		queryUserVpcResponse.setCode(_ctx.integerValue("QueryUserVpcResponse.Code"));
		queryUserVpcResponse.setSuccess(_ctx.booleanValue("QueryUserVpcResponse.Success"));

		List<Vpcs> data = new ArrayList<Vpcs>();
		for (int i = 0; i < _ctx.lengthValue("QueryUserVpcResponse.Data.Length"); i++) {
			Vpcs vpcs = new Vpcs();
			vpcs.setVpcId(_ctx.stringValue("QueryUserVpcResponse.Data["+ i +"].VpcId"));
			vpcs.setVpcName(_ctx.stringValue("QueryUserVpcResponse.Data["+ i +"].VpcName"));

			List<VSwitchListItem> vSwitchList = new ArrayList<VSwitchListItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryUserVpcResponse.Data["+ i +"].VSwitchList.Length"); j++) {
				VSwitchListItem vSwitchListItem = new VSwitchListItem();
				vSwitchListItem.setVswitchId(_ctx.stringValue("QueryUserVpcResponse.Data["+ i +"].VSwitchList["+ j +"].VswitchId"));
				vSwitchListItem.setVswitchName(_ctx.stringValue("QueryUserVpcResponse.Data["+ i +"].VSwitchList["+ j +"].VswitchName"));
				vSwitchListItem.setZoneId(_ctx.stringValue("QueryUserVpcResponse.Data["+ i +"].VSwitchList["+ j +"].ZoneId"));

				vSwitchList.add(vSwitchListItem);
			}
			vpcs.setVSwitchList(vSwitchList);

			data.add(vpcs);
		}
		queryUserVpcResponse.setData(data);
	 
	 	return queryUserVpcResponse;
	}
}