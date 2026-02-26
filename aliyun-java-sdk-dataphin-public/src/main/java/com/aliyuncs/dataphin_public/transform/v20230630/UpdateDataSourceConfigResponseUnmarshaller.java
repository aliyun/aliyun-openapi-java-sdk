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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.UpdateDataSourceConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateDataSourceConfigResponseUnmarshaller {

	public static UpdateDataSourceConfigResponse unmarshall(UpdateDataSourceConfigResponse updateDataSourceConfigResponse, UnmarshallerContext _ctx) {
		
		updateDataSourceConfigResponse.setRequestId(_ctx.stringValue("UpdateDataSourceConfigResponse.RequestId"));
		updateDataSourceConfigResponse.setSuccess(_ctx.booleanValue("UpdateDataSourceConfigResponse.Success"));
		updateDataSourceConfigResponse.setHttpStatusCode(_ctx.integerValue("UpdateDataSourceConfigResponse.HttpStatusCode"));
		updateDataSourceConfigResponse.setCode(_ctx.stringValue("UpdateDataSourceConfigResponse.Code"));
		updateDataSourceConfigResponse.setMessage(_ctx.stringValue("UpdateDataSourceConfigResponse.Message"));
		updateDataSourceConfigResponse.setData(_ctx.booleanValue("UpdateDataSourceConfigResponse.Data"));
	 
	 	return updateDataSourceConfigResponse;
	}
}