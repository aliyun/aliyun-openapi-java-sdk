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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktStatisticsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktStatisticsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktStatisticsResponseUnmarshaller {

	public static QueryLinkeLinktStatisticsResponse unmarshall(QueryLinkeLinktStatisticsResponse queryLinkeLinktStatisticsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktStatisticsResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktStatisticsResponse.RequestId"));
		queryLinkeLinktStatisticsResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktStatisticsResponse.ResultCode"));
		queryLinkeLinktStatisticsResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktStatisticsResponse.ResultMessage"));
		queryLinkeLinktStatisticsResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktStatisticsResponse.ErrorCode"));
		queryLinkeLinktStatisticsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktStatisticsResponse.ErrorMessage"));
		queryLinkeLinktStatisticsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktStatisticsResponse.ResponseStatusCode"));
		queryLinkeLinktStatisticsResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktStatisticsResponse.Success"));

		Data data = new Data();
		data.setFrom(_ctx.longValue("QueryLinkeLinktStatisticsResponse.Data.From"));
		data.setTo(_ctx.longValue("QueryLinkeLinktStatisticsResponse.Data.To"));

		List<String> statisticsUnitList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktStatisticsResponse.Data.StatisticsUnitList.Length"); i++) {
			statisticsUnitList.add(_ctx.stringValue("QueryLinkeLinktStatisticsResponse.Data.StatisticsUnitList["+ i +"]"));
		}
		data.setStatisticsUnitList(statisticsUnitList);
		queryLinkeLinktStatisticsResponse.setData(data);
	 
	 	return queryLinkeLinktStatisticsResponse;
	}
}