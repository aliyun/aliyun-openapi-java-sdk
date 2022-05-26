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

package com.aliyuncs.account_crm.transform.v20160606;

import com.aliyuncs.account_crm.model.v20160606.MapPkFromHidResponse;
import com.aliyuncs.account_crm.model.v20160606.MapPkFromHidResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class MapPkFromHidResponseUnmarshaller {

	public static MapPkFromHidResponse unmarshall(MapPkFromHidResponse mapPkFromHidResponse, UnmarshallerContext _ctx) {
		
		mapPkFromHidResponse.setRequestId(_ctx.stringValue("MapPkFromHidResponse.RequestId"));
		mapPkFromHidResponse.setCode(_ctx.stringValue("MapPkFromHidResponse.Code"));
		mapPkFromHidResponse.setMessage(_ctx.stringValue("MapPkFromHidResponse.Message"));
		mapPkFromHidResponse.setHttpCode(_ctx.stringValue("MapPkFromHidResponse.HttpCode"));
		mapPkFromHidResponse.setSuccess(_ctx.booleanValue("MapPkFromHidResponse.Success"));

		Data data = new Data();
		data.setPk(_ctx.stringValue("MapPkFromHidResponse.Data.Pk"));
		data.setMappingSrc(_ctx.stringValue("MapPkFromHidResponse.Data.MappingSrc"));
		data.setHid(_ctx.stringValue("MapPkFromHidResponse.Data.Hid"));
		mapPkFromHidResponse.setData(data);
	 
	 	return mapPkFromHidResponse;
	}
}