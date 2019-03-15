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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.QueryFpImportResultResponse;
import com.aliyuncs.mts.model.v20140618.QueryFpImportResultResponse.FpResultLogInfo;
import com.aliyuncs.mts.model.v20140618.QueryFpImportResultResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFpImportResultResponseUnmarshaller {

	public static QueryFpImportResultResponse unmarshall(QueryFpImportResultResponse queryFpImportResultResponse, UnmarshallerContext context) {
		
		queryFpImportResultResponse.setRequestId(context.stringValue("QueryFpImportResultResponse.RequestId"));
		queryFpImportResultResponse.setLogCount(context.longValue("QueryFpImportResultResponse.LogCount"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setPageIndex(context.longValue("QueryFpImportResultResponse.PageInfo.PageIndex"));
		pageInfo.setPageSize(context.longValue("QueryFpImportResultResponse.PageInfo.PageSize"));
		pageInfo.setTotal(context.longValue("QueryFpImportResultResponse.PageInfo.Total"));
		queryFpImportResultResponse.setPageInfo(pageInfo);

		List<FpResultLogInfo> fpResultLogInfoList = new ArrayList<FpResultLogInfo>();
		for (int i = 0; i < context.lengthValue("QueryFpImportResultResponse.FpResultLogInfoList.Length"); i++) {
			FpResultLogInfo fpResultLogInfo = new FpResultLogInfo();
			fpResultLogInfo.setLogPath(context.stringValue("QueryFpImportResultResponse.FpResultLogInfoList["+ i +"].LogPath"));
			fpResultLogInfo.setLogName(context.stringValue("QueryFpImportResultResponse.FpResultLogInfoList["+ i +"].LogName"));
			fpResultLogInfo.setLogStartTime(context.longValue("QueryFpImportResultResponse.FpResultLogInfoList["+ i +"].LogStartTime"));
			fpResultLogInfo.setLogEndTime(context.longValue("QueryFpImportResultResponse.FpResultLogInfoList["+ i +"].LogEndTime"));
			fpResultLogInfo.setLogSize(context.longValue("QueryFpImportResultResponse.FpResultLogInfoList["+ i +"].LogSize"));
			fpResultLogInfo.setCreateTime(context.longValue("QueryFpImportResultResponse.FpResultLogInfoList["+ i +"].CreateTime"));

			fpResultLogInfoList.add(fpResultLogInfo);
		}
		queryFpImportResultResponse.setFpResultLogInfoList(fpResultLogInfoList);
	 
	 	return queryFpImportResultResponse;
	}
}