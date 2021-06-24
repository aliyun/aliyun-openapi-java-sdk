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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsUpdateAlarmConfigFileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsUpdateAlarmConfigFileResponseUnmarshaller {

	public static OpsUpdateAlarmConfigFileResponse unmarshall(OpsUpdateAlarmConfigFileResponse opsUpdateAlarmConfigFileResponse, UnmarshallerContext _ctx) {
		
		opsUpdateAlarmConfigFileResponse.setRequestId(_ctx.stringValue("OpsUpdateAlarmConfigFileResponse.RequestId"));
		opsUpdateAlarmConfigFileResponse.setStatus(_ctx.stringValue("OpsUpdateAlarmConfigFileResponse.Status"));
		opsUpdateAlarmConfigFileResponse.setFinished(_ctx.booleanValue("OpsUpdateAlarmConfigFileResponse.Finished"));
		opsUpdateAlarmConfigFileResponse.setErrorInfo(_ctx.stringValue("OpsUpdateAlarmConfigFileResponse.ErrorInfo"));
		opsUpdateAlarmConfigFileResponse.setToken(_ctx.stringValue("OpsUpdateAlarmConfigFileResponse.Token"));
		opsUpdateAlarmConfigFileResponse.setIterationQuery(_ctx.booleanValue("OpsUpdateAlarmConfigFileResponse.IterationQuery"));
		opsUpdateAlarmConfigFileResponse.setApprovalUrl(_ctx.stringValue("OpsUpdateAlarmConfigFileResponse.ApprovalUrl"));

		List<String> iterationTokens = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsUpdateAlarmConfigFileResponse.IterationTokens.Length"); i++) {
			iterationTokens.add(_ctx.stringValue("OpsUpdateAlarmConfigFileResponse.IterationTokens["+ i +"]"));
		}
		opsUpdateAlarmConfigFileResponse.setIterationTokens(iterationTokens);
	 
	 	return opsUpdateAlarmConfigFileResponse;
	}
}