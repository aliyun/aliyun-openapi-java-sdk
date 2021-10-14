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

package com.aliyuncs.ccc.transform.v20200701;

import com.aliyuncs.ccc.model.v20200701.GetNumberLocationResponse;
import com.aliyuncs.ccc.model.v20200701.GetNumberLocationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNumberLocationResponseUnmarshaller {

	public static GetNumberLocationResponse unmarshall(GetNumberLocationResponse getNumberLocationResponse, UnmarshallerContext _ctx) {
		
		getNumberLocationResponse.setRequestId(_ctx.stringValue("GetNumberLocationResponse.RequestId"));
		getNumberLocationResponse.setCode(_ctx.stringValue("GetNumberLocationResponse.Code"));
		getNumberLocationResponse.setHttpStatusCode(_ctx.integerValue("GetNumberLocationResponse.HttpStatusCode"));
		getNumberLocationResponse.setMessage(_ctx.stringValue("GetNumberLocationResponse.Message"));

		Data data = new Data();
		data.setCity(_ctx.stringValue("GetNumberLocationResponse.Data.City"));
		data.setNumber(_ctx.stringValue("GetNumberLocationResponse.Data.Number"));
		data.setProvince(_ctx.stringValue("GetNumberLocationResponse.Data.Province"));
		getNumberLocationResponse.setData(data);
	 
	 	return getNumberLocationResponse;
	}
}