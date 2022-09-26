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

package com.aliyuncs.gpdb.transform.v20160503;

import com.aliyuncs.gpdb.model.v20160503.DescribeDiagnosisSQLInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiagnosisSQLInfoResponseUnmarshaller {

	public static DescribeDiagnosisSQLInfoResponse unmarshall(DescribeDiagnosisSQLInfoResponse describeDiagnosisSQLInfoResponse, UnmarshallerContext _ctx) {
		
		describeDiagnosisSQLInfoResponse.setRequestId(_ctx.stringValue("DescribeDiagnosisSQLInfoResponse.RequestId"));
		describeDiagnosisSQLInfoResponse.setQueryID(_ctx.stringValue("DescribeDiagnosisSQLInfoResponse.QueryID"));
		describeDiagnosisSQLInfoResponse.setSessionID(_ctx.stringValue("DescribeDiagnosisSQLInfoResponse.SessionID"));
		describeDiagnosisSQLInfoResponse.setStartTime(_ctx.longValue("DescribeDiagnosisSQLInfoResponse.StartTime"));
		describeDiagnosisSQLInfoResponse.setDuration(_ctx.integerValue("DescribeDiagnosisSQLInfoResponse.Duration"));
		describeDiagnosisSQLInfoResponse.setSQLStmt(_ctx.stringValue("DescribeDiagnosisSQLInfoResponse.SQLStmt"));
		describeDiagnosisSQLInfoResponse.setUser(_ctx.stringValue("DescribeDiagnosisSQLInfoResponse.User"));
		describeDiagnosisSQLInfoResponse.setDatabase(_ctx.stringValue("DescribeDiagnosisSQLInfoResponse.Database"));
		describeDiagnosisSQLInfoResponse.setStatus(_ctx.stringValue("DescribeDiagnosisSQLInfoResponse.Status"));
		describeDiagnosisSQLInfoResponse.setQueryPlan(_ctx.stringValue("DescribeDiagnosisSQLInfoResponse.QueryPlan"));
		describeDiagnosisSQLInfoResponse.setTextPlan(_ctx.stringValue("DescribeDiagnosisSQLInfoResponse.TextPlan"));
		describeDiagnosisSQLInfoResponse.setSortedMetrics(_ctx.stringValue("DescribeDiagnosisSQLInfoResponse.SortedMetrics"));
		describeDiagnosisSQLInfoResponse.setMaxOutputRows(_ctx.stringValue("DescribeDiagnosisSQLInfoResponse.MaxOutputRows"));
	 
	 	return describeDiagnosisSQLInfoResponse;
	}
}