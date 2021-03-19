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

package com.aliyuncs.mindlive.transform.v20210301;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mindlive.model.v20210301.RequestPasterResponse;
import com.aliyuncs.mindlive.model.v20210301.RequestPasterResponse.PasterConfig;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestPasterResponseUnmarshaller {

	public static RequestPasterResponse unmarshall(RequestPasterResponse requestPasterResponse, UnmarshallerContext _ctx) {
		
		requestPasterResponse.setRequestId(_ctx.stringValue("RequestPasterResponse.RequestId"));
		requestPasterResponse.setSuccess(_ctx.booleanValue("RequestPasterResponse.Success"));
		requestPasterResponse.setErrorCode(_ctx.stringValue("RequestPasterResponse.ErrorCode"));
		requestPasterResponse.setErrorMessage(_ctx.stringValue("RequestPasterResponse.ErrorMessage"));

		List<PasterConfig> data = new ArrayList<PasterConfig>();
		for (int i = 0; i < _ctx.lengthValue("RequestPasterResponse.Data.Length"); i++) {
			PasterConfig pasterConfig = new PasterConfig();
			pasterConfig.setResourceUuid(_ctx.stringValue("RequestPasterResponse.Data["+ i +"].ResourceUuid"));
			pasterConfig.setDownloadUrl(_ctx.stringValue("RequestPasterResponse.Data["+ i +"].DownloadUrl"));
			pasterConfig.setConfig(_ctx.mapValue("RequestPasterResponse.Data["+ i +"].Config"));

			data.add(pasterConfig);
		}
		requestPasterResponse.setData(data);
	 
	 	return requestPasterResponse;
	}
}