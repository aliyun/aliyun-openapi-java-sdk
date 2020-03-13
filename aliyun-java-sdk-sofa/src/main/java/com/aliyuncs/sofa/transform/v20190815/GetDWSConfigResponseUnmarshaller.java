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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.GetDWSConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDWSConfigResponseUnmarshaller {

	public static GetDWSConfigResponse unmarshall(GetDWSConfigResponse getDWSConfigResponse, UnmarshallerContext _ctx) {
		
		getDWSConfigResponse.setRequestId(_ctx.stringValue("GetDWSConfigResponse.RequestId"));
		getDWSConfigResponse.setResultCode(_ctx.stringValue("GetDWSConfigResponse.ResultCode"));
		getDWSConfigResponse.setResultMessage(_ctx.stringValue("GetDWSConfigResponse.ResultMessage"));
		getDWSConfigResponse.setData(_ctx.stringValue("GetDWSConfigResponse.Data"));
	 
	 	return getDWSConfigResponse;
	}
}