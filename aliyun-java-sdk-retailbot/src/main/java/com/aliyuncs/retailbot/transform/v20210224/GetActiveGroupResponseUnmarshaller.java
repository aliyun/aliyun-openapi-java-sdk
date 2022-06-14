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

package com.aliyuncs.retailbot.transform.v20210224;

import com.aliyuncs.retailbot.model.v20210224.GetActiveGroupResponse;
import com.aliyuncs.retailbot.model.v20210224.GetActiveGroupResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetActiveGroupResponseUnmarshaller {

	public static GetActiveGroupResponse unmarshall(GetActiveGroupResponse getActiveGroupResponse, UnmarshallerContext _ctx) {
		
		getActiveGroupResponse.setRequestId(_ctx.stringValue("GetActiveGroupResponse.RequestId"));
		getActiveGroupResponse.setCode(_ctx.stringValue("GetActiveGroupResponse.Code"));
		getActiveGroupResponse.setSuccess(_ctx.booleanValue("GetActiveGroupResponse.Success"));
		getActiveGroupResponse.setMessage(_ctx.stringValue("GetActiveGroupResponse.Message"));

		Data data = new Data();
		data.setGmtCreate(_ctx.longValue("GetActiveGroupResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.longValue("GetActiveGroupResponse.Data.GmtModified"));
		data.setInstanceId(_ctx.stringValue("GetActiveGroupResponse.Data.InstanceId"));
		data.setAppCode(_ctx.stringValue("GetActiveGroupResponse.Data.AppCode"));
		data.setShopId(_ctx.stringValue("GetActiveGroupResponse.Data.ShopId"));
		data.setAppVersion(_ctx.stringValue("GetActiveGroupResponse.Data.AppVersion"));
		data.setName(_ctx.stringValue("GetActiveGroupResponse.Data.Name"));
		data.setDescription(_ctx.stringValue("GetActiveGroupResponse.Data.Description"));
		data.setModifier(_ctx.stringValue("GetActiveGroupResponse.Data.Modifier"));
		data.setConfig(_ctx.stringValue("GetActiveGroupResponse.Data.Config"));
		getActiveGroupResponse.setData(data);
	 
	 	return getActiveGroupResponse;
	}
}