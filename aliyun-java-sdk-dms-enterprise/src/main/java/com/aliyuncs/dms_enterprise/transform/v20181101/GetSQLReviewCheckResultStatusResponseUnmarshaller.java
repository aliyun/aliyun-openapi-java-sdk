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

import com.aliyuncs.dms_enterprise.model.v20181101.GetSQLReviewCheckResultStatusResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetSQLReviewCheckResultStatusResponse.CheckResultStatus;
import com.aliyuncs.dms_enterprise.model.v20181101.GetSQLReviewCheckResultStatusResponse.CheckResultStatus.CheckStatusResult;
import com.aliyuncs.dms_enterprise.model.v20181101.GetSQLReviewCheckResultStatusResponse.CheckResultStatus.SQLReviewResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSQLReviewCheckResultStatusResponseUnmarshaller {

	public static GetSQLReviewCheckResultStatusResponse unmarshall(GetSQLReviewCheckResultStatusResponse getSQLReviewCheckResultStatusResponse, UnmarshallerContext _ctx) {
		
		getSQLReviewCheckResultStatusResponse.setRequestId(_ctx.stringValue("GetSQLReviewCheckResultStatusResponse.RequestId"));
		getSQLReviewCheckResultStatusResponse.setErrorCode(_ctx.stringValue("GetSQLReviewCheckResultStatusResponse.ErrorCode"));
		getSQLReviewCheckResultStatusResponse.setErrorMessage(_ctx.stringValue("GetSQLReviewCheckResultStatusResponse.ErrorMessage"));
		getSQLReviewCheckResultStatusResponse.setSuccess(_ctx.booleanValue("GetSQLReviewCheckResultStatusResponse.Success"));

		CheckResultStatus checkResultStatus = new CheckResultStatus();
		checkResultStatus.setTotalSQLCount(_ctx.longValue("GetSQLReviewCheckResultStatusResponse.CheckResultStatus.TotalSQLCount"));
		checkResultStatus.setCheckedCount(_ctx.longValue("GetSQLReviewCheckResultStatusResponse.CheckResultStatus.CheckedCount"));

		CheckStatusResult checkStatusResult = new CheckStatusResult();
		checkStatusResult.set_New(_ctx.longValue("GetSQLReviewCheckResultStatusResponse.CheckResultStatus.CheckStatusResult.New"));
		checkStatusResult.setUnknown(_ctx.longValue("GetSQLReviewCheckResultStatusResponse.CheckResultStatus.CheckStatusResult.Unknown"));
		checkStatusResult.setCheckNotPass(_ctx.longValue("GetSQLReviewCheckResultStatusResponse.CheckResultStatus.CheckStatusResult.CheckNotPass"));
		checkStatusResult.setCheckPass(_ctx.longValue("GetSQLReviewCheckResultStatusResponse.CheckResultStatus.CheckStatusResult.CheckPass"));
		checkStatusResult.setForcePass(_ctx.longValue("GetSQLReviewCheckResultStatusResponse.CheckResultStatus.CheckStatusResult.ForcePass"));
		checkStatusResult.setForceNotPass(_ctx.longValue("GetSQLReviewCheckResultStatusResponse.CheckResultStatus.CheckStatusResult.ForceNotPass"));
		checkResultStatus.setCheckStatusResult(checkStatusResult);

		SQLReviewResult sQLReviewResult = new SQLReviewResult();
		sQLReviewResult.setMustImprove(_ctx.longValue("GetSQLReviewCheckResultStatusResponse.CheckResultStatus.SQLReviewResult.MustImprove"));
		sQLReviewResult.setPotentialIssue(_ctx.longValue("GetSQLReviewCheckResultStatusResponse.CheckResultStatus.SQLReviewResult.PotentialIssue"));
		sQLReviewResult.setSuggestImprove(_ctx.longValue("GetSQLReviewCheckResultStatusResponse.CheckResultStatus.SQLReviewResult.SuggestImprove"));
		sQLReviewResult.setUseDmsToolkit(_ctx.longValue("GetSQLReviewCheckResultStatusResponse.CheckResultStatus.SQLReviewResult.UseDmsToolkit"));
		sQLReviewResult.setUseDmsDmlUnlock(_ctx.longValue("GetSQLReviewCheckResultStatusResponse.CheckResultStatus.SQLReviewResult.UseDmsDmlUnlock"));
		sQLReviewResult.setTableIndexSuggest(_ctx.longValue("GetSQLReviewCheckResultStatusResponse.CheckResultStatus.SQLReviewResult.TableIndexSuggest"));
		checkResultStatus.setSQLReviewResult(sQLReviewResult);
		getSQLReviewCheckResultStatusResponse.setCheckResultStatus(checkResultStatus);
	 
	 	return getSQLReviewCheckResultStatusResponse;
	}
}