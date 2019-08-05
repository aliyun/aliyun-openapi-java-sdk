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

package com.aliyuncs.slb.transform.v20140515;

import com.aliyuncs.slb.model.v20140515.SetAccessControlListAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetAccessControlListAttributeResponseUnmarshaller {

	public static SetAccessControlListAttributeResponse unmarshall(SetAccessControlListAttributeResponse setAccessControlListAttributeResponse, UnmarshallerContext _ctx) {
		
		setAccessControlListAttributeResponse.setRequestId(_ctx.stringValue("SetAccessControlListAttributeResponse.RequestId"));
		setAccessControlListAttributeResponse.setAclId(_ctx.stringValue("SetAccessControlListAttributeResponse.AclId"));
	 
	 	return setAccessControlListAttributeResponse;
	}
}