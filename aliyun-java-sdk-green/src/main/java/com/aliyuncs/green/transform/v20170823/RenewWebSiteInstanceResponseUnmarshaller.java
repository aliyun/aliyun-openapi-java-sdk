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

package com.aliyuncs.green.transform.v20170823;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20170823.RenewWebSiteInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RenewWebSiteInstanceResponseUnmarshaller {

	public static RenewWebSiteInstanceResponse unmarshall(RenewWebSiteInstanceResponse renewWebSiteInstanceResponse, UnmarshallerContext _ctx) {
		
		renewWebSiteInstanceResponse.setRequestId(_ctx.stringValue("RenewWebSiteInstanceResponse.RequestId"));
		renewWebSiteInstanceResponse.setCode(_ctx.stringValue("RenewWebSiteInstanceResponse.Code"));
		renewWebSiteInstanceResponse.setMessage(_ctx.stringValue("RenewWebSiteInstanceResponse.Message"));
		renewWebSiteInstanceResponse.setOrderId(_ctx.stringValue("RenewWebSiteInstanceResponse.OrderId"));
		renewWebSiteInstanceResponse.setInstanceId(_ctx.stringValue("RenewWebSiteInstanceResponse.InstanceId"));

		List<String> instanceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RenewWebSiteInstanceResponse.InstanceIds.Length"); i++) {
			instanceIds.add(_ctx.stringValue("RenewWebSiteInstanceResponse.InstanceIds["+ i +"]"));
		}
		renewWebSiteInstanceResponse.setInstanceIds(instanceIds);
	 
	 	return renewWebSiteInstanceResponse;
	}
}