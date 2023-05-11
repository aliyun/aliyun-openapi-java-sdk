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

import com.aliyuncs.iot.model.v20180120.GetThingModelTslPublishedResponse;
import com.aliyuncs.iot.model.v20180120.GetThingModelTslPublishedResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetThingModelTslPublishedResponseUnmarshaller {

	public static GetThingModelTslPublishedResponse unmarshall(GetThingModelTslPublishedResponse getThingModelTslPublishedResponse, UnmarshallerContext _ctx) {
		
		getThingModelTslPublishedResponse.setRequestId(_ctx.stringValue("GetThingModelTslPublishedResponse.RequestId"));
		getThingModelTslPublishedResponse.setSuccess(_ctx.booleanValue("GetThingModelTslPublishedResponse.Success"));
		getThingModelTslPublishedResponse.setCode(_ctx.stringValue("GetThingModelTslPublishedResponse.Code"));
		getThingModelTslPublishedResponse.setErrorMessage(_ctx.stringValue("GetThingModelTslPublishedResponse.ErrorMessage"));

		Data data = new Data();
		data.setTslStr(_ctx.stringValue("GetThingModelTslPublishedResponse.Data.TslStr"));
		data.setTslUri(_ctx.stringValue("GetThingModelTslPublishedResponse.Data.TslUri"));
		getThingModelTslPublishedResponse.setData(data);
	 
	 	return getThingModelTslPublishedResponse;
	}
}