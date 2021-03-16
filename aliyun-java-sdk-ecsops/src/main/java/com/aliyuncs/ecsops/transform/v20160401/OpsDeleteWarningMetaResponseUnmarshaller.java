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

package com.aliyuncs.ecsops.transform.v20160401;

import com.aliyuncs.ecsops.model.v20160401.OpsDeleteWarningMetaResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDeleteWarningMetaResponseUnmarshaller {

	public static OpsDeleteWarningMetaResponse unmarshall(OpsDeleteWarningMetaResponse opsDeleteWarningMetaResponse, UnmarshallerContext _ctx) {
		
		opsDeleteWarningMetaResponse.setRequestId(_ctx.stringValue("OpsDeleteWarningMetaResponse.RequestId"));
		opsDeleteWarningMetaResponse.setCode(_ctx.stringValue("OpsDeleteWarningMetaResponse.Code"));
		opsDeleteWarningMetaResponse.setMessage(_ctx.stringValue("OpsDeleteWarningMetaResponse.Message"));
		opsDeleteWarningMetaResponse.setSuccess(_ctx.stringValue("OpsDeleteWarningMetaResponse.Success"));
	 
	 	return opsDeleteWarningMetaResponse;
	}
}