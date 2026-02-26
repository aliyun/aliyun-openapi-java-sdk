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

package com.aliyuncs.vod.transform.v20170321;

import com.aliyuncs.vod.model.v20170321.GetAppPlayKeyResponse;
import com.aliyuncs.vod.model.v20170321.GetAppPlayKeyResponse.AppPlayKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppPlayKeyResponseUnmarshaller {

	public static GetAppPlayKeyResponse unmarshall(GetAppPlayKeyResponse getAppPlayKeyResponse, UnmarshallerContext _ctx) {
		
		getAppPlayKeyResponse.setRequestId(_ctx.stringValue("GetAppPlayKeyResponse.RequestId"));

		AppPlayKey appPlayKey = new AppPlayKey();
		appPlayKey.setAppId(_ctx.stringValue("GetAppPlayKeyResponse.AppPlayKey.AppId"));
		appPlayKey.setPlayKey(_ctx.stringValue("GetAppPlayKeyResponse.AppPlayKey.PlayKey"));
		appPlayKey.setCreationTime(_ctx.stringValue("GetAppPlayKeyResponse.AppPlayKey.CreationTime"));
		appPlayKey.setModificationTime(_ctx.stringValue("GetAppPlayKeyResponse.AppPlayKey.ModificationTime"));
		getAppPlayKeyResponse.setAppPlayKey(appPlayKey);
	 
	 	return getAppPlayKeyResponse;
	}
}