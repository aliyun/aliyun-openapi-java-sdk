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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.GetDataSourceMetaResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataSourceMetaResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataSourceMetaResponseUnmarshaller {

	public static GetDataSourceMetaResponse unmarshall(GetDataSourceMetaResponse getDataSourceMetaResponse, UnmarshallerContext _ctx) {
		
		getDataSourceMetaResponse.setRequestId(_ctx.stringValue("GetDataSourceMetaResponse.RequestId"));
		getDataSourceMetaResponse.setSuccess(_ctx.booleanValue("GetDataSourceMetaResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetDataSourceMetaResponse.Data.Status"));
		data.setMessage(_ctx.stringValue("GetDataSourceMetaResponse.Data.Message"));
		data.setMeta(_ctx.stringValue("GetDataSourceMetaResponse.Data.Meta"));
		getDataSourceMetaResponse.setData(data);
	 
	 	return getDataSourceMetaResponse;
	}
}