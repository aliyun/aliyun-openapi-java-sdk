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

package com.aliyuncs.cams.transform.v20200606;

import com.aliyuncs.cams.model.v20200606.GetFlowPreviewUrlResponse;
import com.aliyuncs.cams.model.v20200606.GetFlowPreviewUrlResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFlowPreviewUrlResponseUnmarshaller {

	public static GetFlowPreviewUrlResponse unmarshall(GetFlowPreviewUrlResponse getFlowPreviewUrlResponse, UnmarshallerContext _ctx) {
		
		getFlowPreviewUrlResponse.setRequestId(_ctx.stringValue("GetFlowPreviewUrlResponse.RequestId"));
		getFlowPreviewUrlResponse.setCode(_ctx.stringValue("GetFlowPreviewUrlResponse.Code"));
		getFlowPreviewUrlResponse.setMessage(_ctx.stringValue("GetFlowPreviewUrlResponse.Message"));

		Data data = new Data();
		data.setFlowId(_ctx.stringValue("GetFlowPreviewUrlResponse.Data.FlowId"));
		data.setPreviewUrl(_ctx.stringValue("GetFlowPreviewUrlResponse.Data.PreviewUrl"));
		data.setPreviewUrlExpires(_ctx.longValue("GetFlowPreviewUrlResponse.Data.PreviewUrlExpires"));
		getFlowPreviewUrlResponse.setData(data);
	 
	 	return getFlowPreviewUrlResponse;
	}
}