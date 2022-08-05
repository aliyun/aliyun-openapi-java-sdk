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

package com.aliyuncs.viapi_regen.transform.v20211119;

import com.aliyuncs.viapi_regen.model.v20211119.GetDatasetResponse;
import com.aliyuncs.viapi_regen.model.v20211119.GetDatasetResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDatasetResponseUnmarshaller {

	public static GetDatasetResponse unmarshall(GetDatasetResponse getDatasetResponse, UnmarshallerContext _ctx) {
		
		getDatasetResponse.setRequestId(_ctx.stringValue("GetDatasetResponse.RequestId"));
		getDatasetResponse.setMessage(_ctx.stringValue("GetDatasetResponse.Message"));
		getDatasetResponse.setCode(_ctx.stringValue("GetDatasetResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.longValue("GetDatasetResponse.Data.Id"));
		data.setOwnerType(_ctx.stringValue("GetDatasetResponse.Data.OwnerType"));
		data.setOssUrl(_ctx.stringValue("GetDatasetResponse.Data.OssUrl"));
		data.setGmtCreate(_ctx.longValue("GetDatasetResponse.Data.GmtCreate"));
		data.setName(_ctx.stringValue("GetDatasetResponse.Data.Name"));
		data.setDescription(_ctx.stringValue("GetDatasetResponse.Data.Description"));
		data.setTotal(_ctx.longValue("GetDatasetResponse.Data.Total"));
		getDatasetResponse.setData(data);
	 
	 	return getDatasetResponse;
	}
}