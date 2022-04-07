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

import com.aliyuncs.mse.model.v20190531.ListSecurityGroupResponse;
import com.aliyuncs.mse.model.v20190531.ListSecurityGroupResponse.Sgs;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSecurityGroupResponseUnmarshaller {

	public static ListSecurityGroupResponse unmarshall(ListSecurityGroupResponse listSecurityGroupResponse, UnmarshallerContext _ctx) {
		
		listSecurityGroupResponse.setRequestId(_ctx.stringValue("ListSecurityGroupResponse.RequestId"));
		listSecurityGroupResponse.setHttpStatusCode(_ctx.integerValue("ListSecurityGroupResponse.HttpStatusCode"));
		listSecurityGroupResponse.setMessage(_ctx.stringValue("ListSecurityGroupResponse.Message"));
		listSecurityGroupResponse.setCode(_ctx.integerValue("ListSecurityGroupResponse.Code"));
		listSecurityGroupResponse.setSuccess(_ctx.booleanValue("ListSecurityGroupResponse.Success"));

		List<Sgs> data = new ArrayList<Sgs>();
		for (int i = 0; i < _ctx.lengthValue("ListSecurityGroupResponse.Data.Length"); i++) {
			Sgs sgs = new Sgs();
			sgs.setSecurityGroupId(_ctx.stringValue("ListSecurityGroupResponse.Data["+ i +"].SecurityGroupId"));
			sgs.setSecurityGroupName(_ctx.stringValue("ListSecurityGroupResponse.Data["+ i +"].SecurityGroupName"));
			sgs.setVpcId(_ctx.stringValue("ListSecurityGroupResponse.Data["+ i +"].VpcId"));
			sgs.setSecurityGroupType(_ctx.stringValue("ListSecurityGroupResponse.Data["+ i +"].SecurityGroupType"));

			data.add(sgs);
		}
		listSecurityGroupResponse.setData(data);
	 
	 	return listSecurityGroupResponse;
	}
}