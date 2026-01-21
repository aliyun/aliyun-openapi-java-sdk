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

package com.aliyuncs.bsn.transform.v20150512;

import com.aliyuncs.bsn.model.v20150512.GrantBsnCodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GrantBsnCodeResponseUnmarshaller {

	public static GrantBsnCodeResponse unmarshall(GrantBsnCodeResponse grantBsnCodeResponse, UnmarshallerContext _ctx) {
		
		grantBsnCodeResponse.setRequestId(_ctx.stringValue("GrantBsnCodeResponse.RequestId"));
		grantBsnCodeResponse.setSn(_ctx.stringValue("GrantBsnCodeResponse.Sn"));
		grantBsnCodeResponse.setAliUid(_ctx.longValue("GrantBsnCodeResponse.AliUid"));
		grantBsnCodeResponse.setGrantToAliuid(_ctx.longValue("GrantBsnCodeResponse.GrantToAliuid"));
		grantBsnCodeResponse.setNotes(_ctx.stringValue("GrantBsnCodeResponse.Notes"));
		grantBsnCodeResponse.setSuccess(_ctx.booleanValue("GrantBsnCodeResponse.Success"));
	 
	 	return grantBsnCodeResponse;
	}
}