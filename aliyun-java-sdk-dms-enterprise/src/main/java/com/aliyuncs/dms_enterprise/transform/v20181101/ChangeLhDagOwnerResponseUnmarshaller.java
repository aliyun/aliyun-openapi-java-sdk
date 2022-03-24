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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.ChangeLhDagOwnerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChangeLhDagOwnerResponseUnmarshaller {

	public static ChangeLhDagOwnerResponse unmarshall(ChangeLhDagOwnerResponse changeLhDagOwnerResponse, UnmarshallerContext _ctx) {
		
		changeLhDagOwnerResponse.setRequestId(_ctx.stringValue("ChangeLhDagOwnerResponse.RequestId"));
		changeLhDagOwnerResponse.setErrorCode(_ctx.stringValue("ChangeLhDagOwnerResponse.ErrorCode"));
		changeLhDagOwnerResponse.setErrorMessage(_ctx.stringValue("ChangeLhDagOwnerResponse.ErrorMessage"));
		changeLhDagOwnerResponse.setSuccess(_ctx.booleanValue("ChangeLhDagOwnerResponse.Success"));
	 
	 	return changeLhDagOwnerResponse;
	}
}