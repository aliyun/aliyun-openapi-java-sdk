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

package com.aliyuncs.workbench_ide.transform.v20200814;

import com.aliyuncs.workbench_ide.model.v20200814.GetAppInfoResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppInfoResponseUnmarshaller {

	public static GetAppInfoResponse unmarshall(GetAppInfoResponse getAppInfoResponse, UnmarshallerContext _ctx) {
		
		getAppInfoResponse.setRequestId(_ctx.stringValue("GetAppInfoResponse.RequestId"));
		getAppInfoResponse.setResultMessage(_ctx.stringValue("GetAppInfoResponse.ResultMessage"));
		getAppInfoResponse.setResultNo(_ctx.integerValue("GetAppInfoResponse.ResultNo"));
		getAppInfoResponse.setData(_ctx.mapValue("GetAppInfoResponse.Data"));
	 
	 	return getAppInfoResponse;
	}
}