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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.GetImageResponse;
import com.aliyuncs.mse.model.v20190531.GetImageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetImageResponseUnmarshaller {

	public static GetImageResponse unmarshall(GetImageResponse getImageResponse, UnmarshallerContext _ctx) {
		
		getImageResponse.setRequestId(_ctx.stringValue("GetImageResponse.RequestId"));
		getImageResponse.setMessage(_ctx.stringValue("GetImageResponse.Message"));
		getImageResponse.setErrorCode(_ctx.stringValue("GetImageResponse.ErrorCode"));
		getImageResponse.setSuccess(_ctx.booleanValue("GetImageResponse.Success"));
		getImageResponse.setHttpCode(_ctx.stringValue("GetImageResponse.HttpCode"));

		Data data = new Data();
		data.setCurrentVersionFullShowName(_ctx.stringValue("GetImageResponse.Data.CurrentVersionFullShowName"));
		data.setMaxVersionCode(_ctx.stringValue("GetImageResponse.Data.MaxVersionCode"));
		data.setMaxVersionFullShowName(_ctx.stringValue("GetImageResponse.Data.MaxVersionFullShowName"));
		data.setMaxVersionChangelogUrl(_ctx.stringValue("GetImageResponse.Data.MaxVersionChangelogUrl"));
		getImageResponse.setData(data);
	 
	 	return getImageResponse;
	}
}