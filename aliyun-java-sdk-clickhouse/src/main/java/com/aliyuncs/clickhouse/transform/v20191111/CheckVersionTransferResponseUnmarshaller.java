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

package com.aliyuncs.clickhouse.transform.v20191111;

import com.aliyuncs.clickhouse.model.v20191111.CheckVersionTransferResponse;
import com.aliyuncs.clickhouse.model.v20191111.CheckVersionTransferResponse.CheckAccess;
import com.aliyuncs.clickhouse.model.v20191111.CheckVersionTransferResponse.CheckCode;
import com.aliyuncs.clickhouse.model.v20191111.CheckVersionTransferResponse.CheckStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckVersionTransferResponseUnmarshaller {

	public static CheckVersionTransferResponse unmarshall(CheckVersionTransferResponse checkVersionTransferResponse, UnmarshallerContext _ctx) {
		
		checkVersionTransferResponse.setRequestId(_ctx.stringValue("CheckVersionTransferResponse.RequestId"));
		checkVersionTransferResponse.setTotalCount(_ctx.integerValue("CheckVersionTransferResponse.TotalCount"));
		checkVersionTransferResponse.setCheckCategory(_ctx.booleanValue("CheckVersionTransferResponse.CheckCategory"));
		checkVersionTransferResponse.setCheckConnection(_ctx.booleanValue("CheckVersionTransferResponse.CheckConnection"));
		checkVersionTransferResponse.setCheckStorage(_ctx.booleanValue("CheckVersionTransferResponse.CheckStorage"));
		checkVersionTransferResponse.setTimeDuration(_ctx.stringValue("CheckVersionTransferResponse.TimeDuration"));

		CheckAccess checkAccess = new CheckAccess();
		checkAccess.setErrCode(_ctx.longValue("CheckVersionTransferResponse.CheckAccess.ErrCode"));
		checkAccess.setErrMessage(_ctx.stringValue("CheckVersionTransferResponse.CheckAccess.ErrMessage"));
		checkVersionTransferResponse.setCheckAccess(checkAccess);

		CheckStatus checkStatus = new CheckStatus();
		checkStatus.setErrCode(_ctx.longValue("CheckVersionTransferResponse.CheckStatus.ErrCode"));
		checkStatus.setErrMessage(_ctx.stringValue("CheckVersionTransferResponse.CheckStatus.ErrMessage"));
		checkVersionTransferResponse.setCheckStatus(checkStatus);

		CheckCode checkCode = new CheckCode();
		checkCode.setErrCode(_ctx.longValue("CheckVersionTransferResponse.CheckCode.ErrCode"));
		checkCode.setErrMessage(_ctx.stringValue("CheckVersionTransferResponse.CheckCode.ErrMessage"));
		checkVersionTransferResponse.setCheckCode(checkCode);
	 
	 	return checkVersionTransferResponse;
	}
}