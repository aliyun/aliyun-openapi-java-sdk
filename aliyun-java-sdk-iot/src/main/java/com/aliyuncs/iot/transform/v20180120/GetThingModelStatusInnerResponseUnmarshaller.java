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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.GetThingModelStatusInnerResponse;
import com.aliyuncs.iot.model.v20180120.GetThingModelStatusInnerResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetThingModelStatusInnerResponseUnmarshaller {

	public static GetThingModelStatusInnerResponse unmarshall(GetThingModelStatusInnerResponse getThingModelStatusInnerResponse, UnmarshallerContext _ctx) {
		
		getThingModelStatusInnerResponse.setRequestId(_ctx.stringValue("GetThingModelStatusInnerResponse.RequestId"));
		getThingModelStatusInnerResponse.setMessage(_ctx.stringValue("GetThingModelStatusInnerResponse.Message"));
		getThingModelStatusInnerResponse.setCode(_ctx.integerValue("GetThingModelStatusInnerResponse.Code"));
		getThingModelStatusInnerResponse.setLocalizedMsg(_ctx.stringValue("GetThingModelStatusInnerResponse.LocalizedMsg"));

		Data data = new Data();
		data.setModifiedTime(_ctx.longValue("GetThingModelStatusInnerResponse.Data.ModifiedTime"));
		data.setProductKey(_ctx.stringValue("GetThingModelStatusInnerResponse.Data.ProductKey"));
		data.setInstanceId(_ctx.stringValue("GetThingModelStatusInnerResponse.Data.InstanceId"));
		data.setRbacTenantId(_ctx.stringValue("GetThingModelStatusInnerResponse.Data.RbacTenantId"));
		data.setStatus(_ctx.integerValue("GetThingModelStatusInnerResponse.Data.Status"));
		data.setInfo(_ctx.stringValue("GetThingModelStatusInnerResponse.Data.Info"));
		data.setOutTime(_ctx.longValue("GetThingModelStatusInnerResponse.Data.OutTime"));
		getThingModelStatusInnerResponse.setData(data);
	 
	 	return getThingModelStatusInnerResponse;
	}
}