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

import com.aliyuncs.ccc.model.v20200701.GetAccessChannelOfStagingResponse;
import com.aliyuncs.ccc.model.v20200701.GetAccessChannelOfStagingResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccessChannelOfStagingResponseUnmarshaller {

	public static GetAccessChannelOfStagingResponse unmarshall(GetAccessChannelOfStagingResponse getAccessChannelOfStagingResponse, UnmarshallerContext _ctx) {
		
		getAccessChannelOfStagingResponse.setRequestId(_ctx.stringValue("GetAccessChannelOfStagingResponse.RequestId"));
		getAccessChannelOfStagingResponse.setCode(_ctx.stringValue("GetAccessChannelOfStagingResponse.Code"));
		getAccessChannelOfStagingResponse.setMessage(_ctx.stringValue("GetAccessChannelOfStagingResponse.Message"));
		getAccessChannelOfStagingResponse.setHttpStatusCode(_ctx.integerValue("GetAccessChannelOfStagingResponse.HttpStatusCode"));

		Data data = new Data();
		data.setToken(_ctx.stringValue("GetAccessChannelOfStagingResponse.Data.Token"));
		getAccessChannelOfStagingResponse.setData(data);
	 
	 	return getAccessChannelOfStagingResponse;
	}
}