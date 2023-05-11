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

import com.aliyuncs.iot.model.v20180120.GetThingModelTslResponse;
import com.aliyuncs.iot.model.v20180120.GetThingModelTslResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetThingModelTslResponseUnmarshaller {

	public static GetThingModelTslResponse unmarshall(GetThingModelTslResponse getThingModelTslResponse, UnmarshallerContext _ctx) {
		
		getThingModelTslResponse.setRequestId(_ctx.stringValue("GetThingModelTslResponse.RequestId"));
		getThingModelTslResponse.setSuccess(_ctx.booleanValue("GetThingModelTslResponse.Success"));
		getThingModelTslResponse.setCode(_ctx.stringValue("GetThingModelTslResponse.Code"));
		getThingModelTslResponse.setErrorMessage(_ctx.stringValue("GetThingModelTslResponse.ErrorMessage"));

		Data data = new Data();
		data.setTslStr(_ctx.stringValue("GetThingModelTslResponse.Data.TslStr"));
		data.setTslUri(_ctx.stringValue("GetThingModelTslResponse.Data.TslUri"));
		getThingModelTslResponse.setData(data);
	 
	 	return getThingModelTslResponse;
	}
}