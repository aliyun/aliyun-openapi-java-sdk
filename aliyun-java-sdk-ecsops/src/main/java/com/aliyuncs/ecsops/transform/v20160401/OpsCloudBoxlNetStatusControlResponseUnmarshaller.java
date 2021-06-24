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

import com.aliyuncs.ecsops.model.v20160401.OpsCloudBoxlNetStatusControlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsCloudBoxlNetStatusControlResponseUnmarshaller {

	public static OpsCloudBoxlNetStatusControlResponse unmarshall(OpsCloudBoxlNetStatusControlResponse opsCloudBoxlNetStatusControlResponse, UnmarshallerContext _ctx) {
		
		opsCloudBoxlNetStatusControlResponse.setRequestId(_ctx.stringValue("OpsCloudBoxlNetStatusControlResponse.RequestId"));
		opsCloudBoxlNetStatusControlResponse.setCode(_ctx.stringValue("OpsCloudBoxlNetStatusControlResponse.Code"));
		opsCloudBoxlNetStatusControlResponse.setMessage(_ctx.stringValue("OpsCloudBoxlNetStatusControlResponse.Message"));
		opsCloudBoxlNetStatusControlResponse.setSuccess(_ctx.booleanValue("OpsCloudBoxlNetStatusControlResponse.Success"));
		opsCloudBoxlNetStatusControlResponse.setExtendedCode(_ctx.stringValue("OpsCloudBoxlNetStatusControlResponse.ExtendedCode"));
	 
	 	return opsCloudBoxlNetStatusControlResponse;
	}
}