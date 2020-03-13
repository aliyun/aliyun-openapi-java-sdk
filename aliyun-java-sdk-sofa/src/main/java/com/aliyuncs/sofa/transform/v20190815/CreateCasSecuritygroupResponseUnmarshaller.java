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

import com.aliyuncs.sofa.model.v20190815.CreateCasSecuritygroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCasSecuritygroupResponseUnmarshaller {

	public static CreateCasSecuritygroupResponse unmarshall(CreateCasSecuritygroupResponse createCasSecuritygroupResponse, UnmarshallerContext _ctx) {
		
		createCasSecuritygroupResponse.setRequestId(_ctx.stringValue("CreateCasSecuritygroupResponse.RequestId"));
		createCasSecuritygroupResponse.setResultCode(_ctx.stringValue("CreateCasSecuritygroupResponse.ResultCode"));
		createCasSecuritygroupResponse.setResultMessage(_ctx.stringValue("CreateCasSecuritygroupResponse.ResultMessage"));
		createCasSecuritygroupResponse.setSecurityGroupSequence(_ctx.stringValue("CreateCasSecuritygroupResponse.SecurityGroupSequence"));
	 
	 	return createCasSecuritygroupResponse;
	}
}