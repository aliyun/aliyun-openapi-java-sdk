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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import com.aliyuncs.miniapplcdp.model.v20200113.GetEnvironmentResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.GetEnvironmentResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEnvironmentResponseUnmarshaller {

	public static GetEnvironmentResponse unmarshall(GetEnvironmentResponse getEnvironmentResponse, UnmarshallerContext _ctx) {
		
		getEnvironmentResponse.setRequestId(_ctx.stringValue("GetEnvironmentResponse.RequestId"));

		Data data = new Data();
		data.setCurrentPublishId(_ctx.stringValue("GetEnvironmentResponse.Data.CurrentPublishId"));
		data.setModifiedTime(_ctx.stringValue("GetEnvironmentResponse.Data.ModifiedTime"));
		data.setAppId(_ctx.stringValue("GetEnvironmentResponse.Data.AppId"));
		data.setCreateTime(_ctx.stringValue("GetEnvironmentResponse.Data.CreateTime"));
		data.setEndpoint(_ctx.stringValue("GetEnvironmentResponse.Data.Endpoint"));
		data.setEnvId(_ctx.stringValue("GetEnvironmentResponse.Data.EnvId"));
		data.setEnvType(_ctx.stringValue("GetEnvironmentResponse.Data.EnvType"));
		data.setPublishingId(_ctx.stringValue("GetEnvironmentResponse.Data.PublishingId"));
		getEnvironmentResponse.setData(data);
	 
	 	return getEnvironmentResponse;
	}
}