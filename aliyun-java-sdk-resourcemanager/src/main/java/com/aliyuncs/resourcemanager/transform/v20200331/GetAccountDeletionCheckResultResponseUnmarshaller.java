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

package com.aliyuncs.resourcemanager.transform.v20200331;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcemanager.model.v20200331.GetAccountDeletionCheckResultResponse;
import com.aliyuncs.resourcemanager.model.v20200331.GetAccountDeletionCheckResultResponse.AccountDeletionCheckResultInfo;
import com.aliyuncs.resourcemanager.model.v20200331.GetAccountDeletionCheckResultResponse.AccountDeletionCheckResultInfo.Check;
import com.aliyuncs.resourcemanager.model.v20200331.GetAccountDeletionCheckResultResponse.AccountDeletionCheckResultInfo.Reason;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccountDeletionCheckResultResponseUnmarshaller {

	public static GetAccountDeletionCheckResultResponse unmarshall(GetAccountDeletionCheckResultResponse getAccountDeletionCheckResultResponse, UnmarshallerContext _ctx) {
		
		getAccountDeletionCheckResultResponse.setRequestId(_ctx.stringValue("GetAccountDeletionCheckResultResponse.RequestId"));

		AccountDeletionCheckResultInfo accountDeletionCheckResultInfo = new AccountDeletionCheckResultInfo();
		accountDeletionCheckResultInfo.setStatus(_ctx.stringValue("GetAccountDeletionCheckResultResponse.AccountDeletionCheckResultInfo.Status"));
		accountDeletionCheckResultInfo.setAllowDelete(_ctx.stringValue("GetAccountDeletionCheckResultResponse.AccountDeletionCheckResultInfo.AllowDelete"));

		List<Reason> notAllowReason = new ArrayList<Reason>();
		for (int i = 0; i < _ctx.lengthValue("GetAccountDeletionCheckResultResponse.AccountDeletionCheckResultInfo.NotAllowReason.Length"); i++) {
			Reason reason = new Reason();
			reason.setDescription(_ctx.stringValue("GetAccountDeletionCheckResultResponse.AccountDeletionCheckResultInfo.NotAllowReason["+ i +"].Description"));
			reason.setCheckId(_ctx.stringValue("GetAccountDeletionCheckResultResponse.AccountDeletionCheckResultInfo.NotAllowReason["+ i +"].CheckId"));
			reason.setCheckName(_ctx.stringValue("GetAccountDeletionCheckResultResponse.AccountDeletionCheckResultInfo.NotAllowReason["+ i +"].CheckName"));

			notAllowReason.add(reason);
		}
		accountDeletionCheckResultInfo.setNotAllowReason(notAllowReason);

		List<Check> abandonableChecks = new ArrayList<Check>();
		for (int i = 0; i < _ctx.lengthValue("GetAccountDeletionCheckResultResponse.AccountDeletionCheckResultInfo.AbandonableChecks.Length"); i++) {
			Check check = new Check();
			check.setDescription(_ctx.stringValue("GetAccountDeletionCheckResultResponse.AccountDeletionCheckResultInfo.AbandonableChecks["+ i +"].Description"));
			check.setCheckId(_ctx.stringValue("GetAccountDeletionCheckResultResponse.AccountDeletionCheckResultInfo.AbandonableChecks["+ i +"].CheckId"));
			check.setCheckName(_ctx.stringValue("GetAccountDeletionCheckResultResponse.AccountDeletionCheckResultInfo.AbandonableChecks["+ i +"].CheckName"));

			abandonableChecks.add(check);
		}
		accountDeletionCheckResultInfo.setAbandonableChecks(abandonableChecks);
		getAccountDeletionCheckResultResponse.setAccountDeletionCheckResultInfo(accountDeletionCheckResultInfo);
	 
	 	return getAccountDeletionCheckResultResponse;
	}
}