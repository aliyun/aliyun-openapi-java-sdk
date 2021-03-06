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

package com.aliyuncs.dbs.transform.v20190306;

import com.aliyuncs.dbs.model.v20190306.DescribeSandboxFromRDSResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSandboxFromRDSResponseUnmarshaller {

	public static DescribeSandboxFromRDSResponse unmarshall(DescribeSandboxFromRDSResponse describeSandboxFromRDSResponse, UnmarshallerContext _ctx) {
		
		describeSandboxFromRDSResponse.setRequestId(_ctx.stringValue("DescribeSandboxFromRDSResponse.RequestId"));
		describeSandboxFromRDSResponse.setSuccess(_ctx.booleanValue("DescribeSandboxFromRDSResponse.Success"));
		describeSandboxFromRDSResponse.setErrCode(_ctx.stringValue("DescribeSandboxFromRDSResponse.ErrCode"));
		describeSandboxFromRDSResponse.setErrMessage(_ctx.stringValue("DescribeSandboxFromRDSResponse.ErrMessage"));
		describeSandboxFromRDSResponse.setHttpStatusCode(_ctx.integerValue("DescribeSandboxFromRDSResponse.HttpStatusCode"));
		describeSandboxFromRDSResponse.setSourceId(_ctx.stringValue("DescribeSandboxFromRDSResponse.SourceId"));
		describeSandboxFromRDSResponse.setBackupPlanName(_ctx.stringValue("DescribeSandboxFromRDSResponse.BackupPlanName"));
		describeSandboxFromRDSResponse.setBackupLog(_ctx.stringValue("DescribeSandboxFromRDSResponse.BackupLog"));
		describeSandboxFromRDSResponse.setDbsInstanceId(_ctx.stringValue("DescribeSandboxFromRDSResponse.DbsInstanceId"));
		describeSandboxFromRDSResponse.setSupportSandbox(_ctx.booleanValue("DescribeSandboxFromRDSResponse.SupportSandbox"));
		describeSandboxFromRDSResponse.setSandboxInstanceCount(_ctx.integerValue("DescribeSandboxFromRDSResponse.SandboxInstanceCount"));
		describeSandboxFromRDSResponse.setSandboxRecoverStartTime(_ctx.longValue("DescribeSandboxFromRDSResponse.SandboxRecoverStartTime"));
		describeSandboxFromRDSResponse.setSandboxRecoverEndTime(_ctx.longValue("DescribeSandboxFromRDSResponse.SandboxRecoverEndTime"));
		describeSandboxFromRDSResponse.setEnabledSandbox(_ctx.booleanValue("DescribeSandboxFromRDSResponse.EnabledSandbox"));
	 
	 	return describeSandboxFromRDSResponse;
	}
}