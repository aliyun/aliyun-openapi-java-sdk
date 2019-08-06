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

package com.aliyuncs.drds.transform.v20190123;

import com.aliyuncs.drds.model.v20190123.PreCheckSqlFlashbackTaskResponse;
import com.aliyuncs.drds.model.v20190123.PreCheckSqlFlashbackTaskResponse.CheckResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class PreCheckSqlFlashbackTaskResponseUnmarshaller {

	public static PreCheckSqlFlashbackTaskResponse unmarshall(PreCheckSqlFlashbackTaskResponse preCheckSqlFlashbackTaskResponse, UnmarshallerContext _ctx) {
		
		preCheckSqlFlashbackTaskResponse.setRequestId(_ctx.stringValue("PreCheckSqlFlashbackTaskResponse.RequestId"));
		preCheckSqlFlashbackTaskResponse.setSuccess(_ctx.booleanValue("PreCheckSqlFlashbackTaskResponse.Success"));

		CheckResult checkResult = new CheckResult();
		checkResult.setBinlogExists(_ctx.booleanValue("PreCheckSqlFlashbackTaskResponse.CheckResult.BinlogExists"));
		checkResult.setSupportBinlogRowQueryEvents(_ctx.booleanValue("PreCheckSqlFlashbackTaskResponse.CheckResult.SupportBinlogRowQueryEvents"));
		checkResult.setBinlogRowQueryEventEnabled(_ctx.booleanValue("PreCheckSqlFlashbackTaskResponse.CheckResult.BinlogRowQueryEventEnabled"));
		checkResult.setCanUpgradeSupportBinlogRowQueryEvents(_ctx.booleanValue("PreCheckSqlFlashbackTaskResponse.CheckResult.CanUpgradeSupportBinlogRowQueryEvents"));
		preCheckSqlFlashbackTaskResponse.setCheckResult(checkResult);
	 
	 	return preCheckSqlFlashbackTaskResponse;
	}
}