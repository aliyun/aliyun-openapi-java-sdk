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

package com.aliyuncs.cloud_siem.transform.v20220616;

import com.aliyuncs.cloud_siem.model.v20220616.AddUserSourceLogConfigResponse;
import com.aliyuncs.cloud_siem.model.v20220616.AddUserSourceLogConfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddUserSourceLogConfigResponseUnmarshaller {

	public static AddUserSourceLogConfigResponse unmarshall(AddUserSourceLogConfigResponse addUserSourceLogConfigResponse, UnmarshallerContext _ctx) {
		
		addUserSourceLogConfigResponse.setRequestId(_ctx.stringValue("AddUserSourceLogConfigResponse.RequestId"));

		Data data = new Data();
		data.setDiplayLine(_ctx.stringValue("AddUserSourceLogConfigResponse.Data.DiplayLine"));
		data.setSourceProdCode(_ctx.stringValue("AddUserSourceLogConfigResponse.Data.SourceProdCode"));
		data.setSourceLogCode(_ctx.stringValue("AddUserSourceLogConfigResponse.Data.SourceLogCode"));
		data.setDisplayed(_ctx.booleanValue("AddUserSourceLogConfigResponse.Data.Displayed"));
		data.setImported(_ctx.booleanValue("AddUserSourceLogConfigResponse.Data.Imported"));
		data.setMainUserId(_ctx.longValue("AddUserSourceLogConfigResponse.Data.MainUserId"));
		data.setSubUserId(_ctx.longValue("AddUserSourceLogConfigResponse.Data.SubUserId"));
		data.setSubUserName(_ctx.stringValue("AddUserSourceLogConfigResponse.Data.SubUserName"));
		addUserSourceLogConfigResponse.setData(data);
	 
	 	return addUserSourceLogConfigResponse;
	}
}