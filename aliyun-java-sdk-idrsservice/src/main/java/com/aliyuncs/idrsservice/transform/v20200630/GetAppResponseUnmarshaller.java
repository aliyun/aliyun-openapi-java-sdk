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

package com.aliyuncs.idrsservice.transform.v20200630;

import com.aliyuncs.idrsservice.model.v20200630.GetAppResponse;
import com.aliyuncs.idrsservice.model.v20200630.GetAppResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppResponseUnmarshaller {

	public static GetAppResponse unmarshall(GetAppResponse getAppResponse, UnmarshallerContext _ctx) {
		
		getAppResponse.setRequestId(_ctx.stringValue("GetAppResponse.RequestId"));
		getAppResponse.setCode(_ctx.stringValue("GetAppResponse.Code"));
		getAppResponse.setMessage(_ctx.stringValue("GetAppResponse.Message"));

		Data data = new Data();
		data.setCreatedAt(_ctx.integerValue("GetAppResponse.Data.CreatedAt"));
		data.setDisabled(_ctx.stringValue("GetAppResponse.Data.Disabled"));
		data.setName(_ctx.stringValue("GetAppResponse.Data.Name"));
		getAppResponse.setData(data);
	 
	 	return getAppResponse;
	}
}