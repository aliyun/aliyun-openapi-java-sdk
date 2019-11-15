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

package com.aliyuncs.openanalytics_open.transform.v20180619;

import com.aliyuncs.openanalytics_open.model.v20180619.QueryTaskSumResponse;
import com.aliyuncs.openanalytics_open.model.v20180619.QueryTaskSumResponse.QueryTaskSumInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTaskSumResponseUnmarshaller {

	public static QueryTaskSumResponse unmarshall(QueryTaskSumResponse queryTaskSumResponse, UnmarshallerContext _ctx) {
		
		queryTaskSumResponse.setRequestId(_ctx.stringValue("QueryTaskSumResponse.RequestId"));
		queryTaskSumResponse.setRegionId(_ctx.stringValue("QueryTaskSumResponse.RegionId"));

		QueryTaskSumInfo queryTaskSumInfo = new QueryTaskSumInfo();
		queryTaskSumInfo.setUid(_ctx.stringValue("QueryTaskSumResponse.QueryTaskSumInfo.Uid"));
		queryTaskSumInfo.setScannedDataBytesGbToday(_ctx.stringValue("QueryTaskSumResponse.QueryTaskSumInfo.ScannedDataBytesGbToday"));
		queryTaskSumInfo.setTotalStmtCountToday(_ctx.stringValue("QueryTaskSumResponse.QueryTaskSumInfo.TotalStmtCountToday"));
		queryTaskSumInfo.setTotalChargedStmtCountToday(_ctx.stringValue("QueryTaskSumResponse.QueryTaskSumInfo.TotalChargedStmtCountToday"));
		queryTaskSumInfo.setScannedDataBytesTodayIncr(_ctx.stringValue("QueryTaskSumResponse.QueryTaskSumInfo.ScannedDataBytesTodayIncr"));
		queryTaskSumInfo.setTotalStmtCountTodayIncr(_ctx.stringValue("QueryTaskSumResponse.QueryTaskSumInfo.TotalStmtCountTodayIncr"));
		queryTaskSumInfo.setTotalChargedStmtCountTodayIncr(_ctx.stringValue("QueryTaskSumResponse.QueryTaskSumInfo.TotalChargedStmtCountTodayIncr"));
		queryTaskSumInfo.setScannedDataBytesGbYesterday(_ctx.stringValue("QueryTaskSumResponse.QueryTaskSumInfo.ScannedDataBytesGbYesterday"));
		queryTaskSumInfo.setTotalStmtCountYesterday(_ctx.stringValue("QueryTaskSumResponse.QueryTaskSumInfo.TotalStmtCountYesterday"));
		queryTaskSumInfo.setTotalChargedStmtCountYesterday(_ctx.stringValue("QueryTaskSumResponse.QueryTaskSumInfo.TotalChargedStmtCountYesterday"));
		queryTaskSumInfo.setScannedDataBytesYesterdayIncr(_ctx.stringValue("QueryTaskSumResponse.QueryTaskSumInfo.ScannedDataBytesYesterdayIncr"));
		queryTaskSumInfo.setTotalStmtCountYesterdayIncr(_ctx.stringValue("QueryTaskSumResponse.QueryTaskSumInfo.TotalStmtCountYesterdayIncr"));
		queryTaskSumInfo.setTotalChargedStmtCountYesterdayIncr(_ctx.stringValue("QueryTaskSumResponse.QueryTaskSumInfo.TotalChargedStmtCountYesterdayIncr"));
		queryTaskSumResponse.setQueryTaskSumInfo(queryTaskSumInfo);
	 
	 	return queryTaskSumResponse;
	}
}