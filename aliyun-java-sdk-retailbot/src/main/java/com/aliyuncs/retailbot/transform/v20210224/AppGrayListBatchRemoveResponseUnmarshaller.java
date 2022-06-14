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

package com.aliyuncs.retailbot.transform.v20210224;

import com.aliyuncs.retailbot.model.v20210224.AppGrayListBatchRemoveResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AppGrayListBatchRemoveResponseUnmarshaller {

	public static AppGrayListBatchRemoveResponse unmarshall(AppGrayListBatchRemoveResponse appGrayListBatchRemoveResponse, UnmarshallerContext _ctx) {
		
		appGrayListBatchRemoveResponse.setRequestId(_ctx.stringValue("AppGrayListBatchRemoveResponse.RequestId"));
		appGrayListBatchRemoveResponse.setSuccess(_ctx.stringValue("AppGrayListBatchRemoveResponse.Success"));
		appGrayListBatchRemoveResponse.setCode(_ctx.stringValue("AppGrayListBatchRemoveResponse.Code"));
		appGrayListBatchRemoveResponse.setMessage(_ctx.stringValue("AppGrayListBatchRemoveResponse.Message"));
		appGrayListBatchRemoveResponse.setData(_ctx.stringValue("AppGrayListBatchRemoveResponse.Data"));
	 
	 	return appGrayListBatchRemoveResponse;
	}
}