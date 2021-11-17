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

import com.aliyuncs.mindlive_biz.model.v20210214.RequestLiveBackgroundResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.RequestLiveBackgroundResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestLiveBackgroundResponseUnmarshaller {

	public static RequestLiveBackgroundResponse unmarshall(RequestLiveBackgroundResponse requestLiveBackgroundResponse, UnmarshallerContext _ctx) {
		
		requestLiveBackgroundResponse.setRequestId(_ctx.stringValue("RequestLiveBackgroundResponse.RequestId"));
		requestLiveBackgroundResponse.setErrorMessage(_ctx.stringValue("RequestLiveBackgroundResponse.ErrorMessage"));
		requestLiveBackgroundResponse.setSuccess(_ctx.booleanValue("RequestLiveBackgroundResponse.Success"));
		requestLiveBackgroundResponse.setErrorCode(_ctx.stringValue("RequestLiveBackgroundResponse.ErrorCode"));

		Data data = new Data();
		data.setBgConfig(_ctx.mapValue("RequestLiveBackgroundResponse.Data.BgConfig"));
		data.setDownloadUrl(_ctx.stringValue("RequestLiveBackgroundResponse.Data.DownloadUrl"));
		data.setFileType(_ctx.stringValue("RequestLiveBackgroundResponse.Data.FileType"));
		data.setOpen(_ctx.booleanValue("RequestLiveBackgroundResponse.Data.Open"));
		data.setMode(_ctx.stringValue("RequestLiveBackgroundResponse.Data.Mode"));
		data.setResourceUuid(_ctx.stringValue("RequestLiveBackgroundResponse.Data.ResourceUuid"));
		requestLiveBackgroundResponse.setData(data);
	 
	 	return requestLiveBackgroundResponse;
	}
}