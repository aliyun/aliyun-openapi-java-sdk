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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.UpdateInstanceInternetProtocolResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateInstanceInternetProtocolResponseUnmarshaller {

	public static UpdateInstanceInternetProtocolResponse unmarshall(UpdateInstanceInternetProtocolResponse updateInstanceInternetProtocolResponse, UnmarshallerContext _ctx) {
		
		updateInstanceInternetProtocolResponse.setRequestId(_ctx.stringValue("UpdateInstanceInternetProtocolResponse.RequestId"));
		updateInstanceInternetProtocolResponse.setCode(_ctx.stringValue("UpdateInstanceInternetProtocolResponse.Code"));
		updateInstanceInternetProtocolResponse.setData(_ctx.mapValue("UpdateInstanceInternetProtocolResponse.Data"));
		updateInstanceInternetProtocolResponse.setErrorMessage(_ctx.stringValue("UpdateInstanceInternetProtocolResponse.ErrorMessage"));
		updateInstanceInternetProtocolResponse.setSuccess(_ctx.booleanValue("UpdateInstanceInternetProtocolResponse.Success"));
	 
	 	return updateInstanceInternetProtocolResponse;
	}
}