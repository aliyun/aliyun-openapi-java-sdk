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

package com.aliyuncs.cams.transform.v20200606;

import com.aliyuncs.cams.model.v20200606.GetCommerceSettingResponse;
import com.aliyuncs.cams.model.v20200606.GetCommerceSettingResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCommerceSettingResponseUnmarshaller {

	public static GetCommerceSettingResponse unmarshall(GetCommerceSettingResponse getCommerceSettingResponse, UnmarshallerContext _ctx) {
		
		getCommerceSettingResponse.setRequestId(_ctx.stringValue("GetCommerceSettingResponse.RequestId"));
		getCommerceSettingResponse.setAccessDeniedDetail(_ctx.stringValue("GetCommerceSettingResponse.AccessDeniedDetail"));
		getCommerceSettingResponse.setMessage(_ctx.stringValue("GetCommerceSettingResponse.Message"));
		getCommerceSettingResponse.setCode(_ctx.stringValue("GetCommerceSettingResponse.Code"));
		getCommerceSettingResponse.setSuccess(_ctx.booleanValue("GetCommerceSettingResponse.Success"));

		Data data = new Data();
		data.setCartEnable(_ctx.booleanValue("GetCommerceSettingResponse.Data.CartEnable"));
		data.setCatalogVisible(_ctx.booleanValue("GetCommerceSettingResponse.Data.CatalogVisible"));
		getCommerceSettingResponse.setData(data);
	 
	 	return getCommerceSettingResponse;
	}
}