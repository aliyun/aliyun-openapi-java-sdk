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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.RenewClientTokenResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RenewClientTokenResponseUnmarshaller {

	public static RenewClientTokenResponse unmarshall(RenewClientTokenResponse renewClientTokenResponse, UnmarshallerContext _ctx) {
		
		renewClientTokenResponse.setRequestId(_ctx.stringValue("RenewClientTokenResponse.RequestId"));
		renewClientTokenResponse.setSuccess(_ctx.booleanValue("RenewClientTokenResponse.Success"));
		renewClientTokenResponse.setCode(_ctx.stringValue("RenewClientTokenResponse.Code"));
		renewClientTokenResponse.setMessage(_ctx.stringValue("RenewClientTokenResponse.Message"));
		renewClientTokenResponse.setToken(_ctx.stringValue("RenewClientTokenResponse.Token"));
		renewClientTokenResponse.setClusterId(_ctx.stringValue("RenewClientTokenResponse.ClusterId"));

		List<String> sourceTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RenewClientTokenResponse.SourceTypes.Length"); i++) {
			sourceTypes.add(_ctx.stringValue("RenewClientTokenResponse.SourceTypes["+ i +"]"));
		}
		renewClientTokenResponse.setSourceTypes(sourceTypes);
	 
	 	return renewClientTokenResponse;
	}
}