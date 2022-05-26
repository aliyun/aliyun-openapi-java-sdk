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

import com.aliyuncs.account_crm.model.v20160606.MapPkToHidResponse;
import com.aliyuncs.account_crm.model.v20160606.MapPkToHidResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class MapPkToHidResponseUnmarshaller {

	public static MapPkToHidResponse unmarshall(MapPkToHidResponse mapPkToHidResponse, UnmarshallerContext _ctx) {
		
		mapPkToHidResponse.setRequestId(_ctx.stringValue("MapPkToHidResponse.RequestId"));
		mapPkToHidResponse.setCode(_ctx.stringValue("MapPkToHidResponse.Code"));
		mapPkToHidResponse.setMessage(_ctx.stringValue("MapPkToHidResponse.Message"));
		mapPkToHidResponse.setHttpCode(_ctx.stringValue("MapPkToHidResponse.HttpCode"));
		mapPkToHidResponse.setSuccess(_ctx.booleanValue("MapPkToHidResponse.Success"));

		Data data = new Data();
		data.setPk(_ctx.stringValue("MapPkToHidResponse.Data.Pk"));
		data.setMappingSrc(_ctx.stringValue("MapPkToHidResponse.Data.MappingSrc"));
		data.setHid(_ctx.stringValue("MapPkToHidResponse.Data.Hid"));
		mapPkToHidResponse.setData(data);
	 
	 	return mapPkToHidResponse;
	}
}