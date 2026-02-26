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

package com.aliyuncs.csas.transform.v20230120;

import com.aliyuncs.csas.model.v20230120.GetActiveIdpConfigResponse;
import com.aliyuncs.csas.model.v20230120.GetActiveIdpConfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetActiveIdpConfigResponseUnmarshaller {

	public static GetActiveIdpConfigResponse unmarshall(GetActiveIdpConfigResponse getActiveIdpConfigResponse, UnmarshallerContext _ctx) {
		
		getActiveIdpConfigResponse.setRequestId(_ctx.stringValue("GetActiveIdpConfigResponse.RequestId"));

		Data data = new Data();
		data.setId(_ctx.stringValue("GetActiveIdpConfigResponse.Data.Id"));
		data.setName(_ctx.stringValue("GetActiveIdpConfigResponse.Data.Name"));
		data.setType(_ctx.stringValue("GetActiveIdpConfigResponse.Data.Type"));
		data.setDescription(_ctx.stringValue("GetActiveIdpConfigResponse.Data.Description"));
		getActiveIdpConfigResponse.setData(data);
	 
	 	return getActiveIdpConfigResponse;
	}
}