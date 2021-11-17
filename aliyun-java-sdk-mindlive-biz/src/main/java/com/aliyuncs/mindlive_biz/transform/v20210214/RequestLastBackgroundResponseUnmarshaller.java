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

package com.aliyuncs.mindlive_biz.transform.v20210214;

import com.aliyuncs.mindlive_biz.model.v20210214.RequestLastBackgroundResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.RequestLastBackgroundResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestLastBackgroundResponseUnmarshaller {

	public static RequestLastBackgroundResponse unmarshall(RequestLastBackgroundResponse requestLastBackgroundResponse, UnmarshallerContext _ctx) {
		
		requestLastBackgroundResponse.setRequestId(_ctx.stringValue("RequestLastBackgroundResponse.RequestId"));
		requestLastBackgroundResponse.setErrorMessage(_ctx.stringValue("RequestLastBackgroundResponse.ErrorMessage"));
		requestLastBackgroundResponse.setSuccess(_ctx.booleanValue("RequestLastBackgroundResponse.Success"));
		requestLastBackgroundResponse.setErrorCode(_ctx.stringValue("RequestLastBackgroundResponse.ErrorCode"));

		Data data = new Data();
		data.setMode(_ctx.stringValue("RequestLastBackgroundResponse.Data.Mode"));
		data.setBgConfig(_ctx.mapValue("RequestLastBackgroundResponse.Data.BgConfig"));
		data.setResourceUuid(_ctx.stringValue("RequestLastBackgroundResponse.Data.ResourceUuid"));
		requestLastBackgroundResponse.setData(data);
	 
	 	return requestLastBackgroundResponse;
	}
}