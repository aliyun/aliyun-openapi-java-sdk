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

package com.aliyuncs.brain_industrial.transform.v20200920;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.brain_industrial.model.v20200920.ListUserResourcesResponse;
import com.aliyuncs.brain_industrial.model.v20200920.ListUserResourcesResponse.UserResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserResourcesResponseUnmarshaller {

	public static ListUserResourcesResponse unmarshall(ListUserResourcesResponse listUserResourcesResponse, UnmarshallerContext _ctx) {
		
		listUserResourcesResponse.setRequestId(_ctx.stringValue("ListUserResourcesResponse.RequestId"));
		listUserResourcesResponse.setSuccess(_ctx.stringValue("ListUserResourcesResponse.Success"));
		listUserResourcesResponse.setCode(_ctx.stringValue("ListUserResourcesResponse.Code"));
		listUserResourcesResponse.setMessage(_ctx.stringValue("ListUserResourcesResponse.Message"));
		listUserResourcesResponse.setHttpStatusCode(_ctx.integerValue("ListUserResourcesResponse.HttpStatusCode"));
		listUserResourcesResponse.setAccessDeniedDetail(_ctx.stringValue("ListUserResourcesResponse.AccessDeniedDetail"));

		List<UserResource> data = new ArrayList<UserResource>();
		for (int i = 0; i < _ctx.lengthValue("ListUserResourcesResponse.Data.Length"); i++) {
			UserResource userResource = new UserResource();
			userResource.setStartDate(_ctx.stringValue("ListUserResourcesResponse.Data["+ i +"].startDate"));
			userResource.setEndDate(_ctx.stringValue("ListUserResourcesResponse.Data["+ i +"].endDate"));
			userResource.setRegion(_ctx.stringValue("ListUserResourcesResponse.Data["+ i +"].region"));
			userResource.setStatus(_ctx.stringValue("ListUserResourcesResponse.Data["+ i +"].status"));
			userResource.setInstanceId(_ctx.stringValue("ListUserResourcesResponse.Data["+ i +"].instanceId"));
			userResource.setChargeType(_ctx.stringValue("ListUserResourcesResponse.Data["+ i +"].chargeType"));
			userResource.setCommodityCode(_ctx.stringValue("ListUserResourcesResponse.Data["+ i +"].commodityCode"));
			userResource.setStatusMsg(_ctx.stringValue("ListUserResourcesResponse.Data["+ i +"].statusMsg"));

			data.add(userResource);
		}
		listUserResourcesResponse.setData(data);
	 
	 	return listUserResourcesResponse;
	}
}