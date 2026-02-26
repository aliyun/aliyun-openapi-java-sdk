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

package com.aliyuncs.wyota.transform.v20210420;

import com.aliyuncs.wyota.model.v20210420.ModifySecureNetworkTypeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifySecureNetworkTypeResponseUnmarshaller {

	public static ModifySecureNetworkTypeResponse unmarshall(ModifySecureNetworkTypeResponse modifySecureNetworkTypeResponse, UnmarshallerContext _ctx) {
		
		modifySecureNetworkTypeResponse.setRequestId(_ctx.stringValue("ModifySecureNetworkTypeResponse.RequestId"));
		modifySecureNetworkTypeResponse.setCode(_ctx.stringValue("ModifySecureNetworkTypeResponse.Code"));
		modifySecureNetworkTypeResponse.setMessage(_ctx.stringValue("ModifySecureNetworkTypeResponse.Message"));
	 
	 	return modifySecureNetworkTypeResponse;
	}
}