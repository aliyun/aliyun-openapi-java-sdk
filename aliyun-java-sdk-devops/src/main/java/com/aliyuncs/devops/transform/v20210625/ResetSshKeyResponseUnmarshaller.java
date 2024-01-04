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

package com.aliyuncs.devops.transform.v20210625;

import com.aliyuncs.devops.model.v20210625.ResetSshKeyResponse;
import com.aliyuncs.devops.model.v20210625.ResetSshKeyResponse.SshKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResetSshKeyResponseUnmarshaller {

	public static ResetSshKeyResponse unmarshall(ResetSshKeyResponse resetSshKeyResponse, UnmarshallerContext _ctx) {
		
		resetSshKeyResponse.setRequestId(_ctx.stringValue("ResetSshKeyResponse.requestId"));
		resetSshKeyResponse.setErrorMessage(_ctx.stringValue("ResetSshKeyResponse.errorMessage"));
		resetSshKeyResponse.setErrorCode(_ctx.stringValue("ResetSshKeyResponse.errorCode"));
		resetSshKeyResponse.setSuccess(_ctx.booleanValue("ResetSshKeyResponse.success"));

		SshKey sshKey = new SshKey();
		sshKey.setPublicKey(_ctx.stringValue("ResetSshKeyResponse.sshKey.publicKey"));
		sshKey.setId(_ctx.longValue("ResetSshKeyResponse.sshKey.id"));
		resetSshKeyResponse.setSshKey(sshKey);
	 
	 	return resetSshKeyResponse;
	}
}