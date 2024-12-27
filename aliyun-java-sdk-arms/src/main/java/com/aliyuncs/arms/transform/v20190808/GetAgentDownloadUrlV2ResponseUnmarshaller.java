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

package com.aliyuncs.arms.transform.v20190808;

import com.aliyuncs.arms.model.v20190808.GetAgentDownloadUrlV2Response;
import com.aliyuncs.arms.model.v20190808.GetAgentDownloadUrlV2Response.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAgentDownloadUrlV2ResponseUnmarshaller {

	public static GetAgentDownloadUrlV2Response unmarshall(GetAgentDownloadUrlV2Response getAgentDownloadUrlV2Response, UnmarshallerContext _ctx) {
		
		getAgentDownloadUrlV2Response.setRequestId(_ctx.stringValue("GetAgentDownloadUrlV2Response.RequestId"));
		getAgentDownloadUrlV2Response.setMessage(_ctx.stringValue("GetAgentDownloadUrlV2Response.Message"));
		getAgentDownloadUrlV2Response.setCode(_ctx.longValue("GetAgentDownloadUrlV2Response.Code"));
		getAgentDownloadUrlV2Response.setSuccess(_ctx.booleanValue("GetAgentDownloadUrlV2Response.Success"));

		Data data = new Data();
		data.setVersion(_ctx.stringValue("GetAgentDownloadUrlV2Response.Data.Version"));
		data.setUrl(_ctx.stringValue("GetAgentDownloadUrlV2Response.Data.Url"));
		getAgentDownloadUrlV2Response.setData(data);
	 
	 	return getAgentDownloadUrlV2Response;
	}
}