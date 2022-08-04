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

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.QueryOrderLogisticsListResponse;
import com.aliyuncs.trademark.model.v20180724.QueryOrderLogisticsListResponse.LogisticsRecords;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOrderLogisticsListResponseUnmarshaller {

	public static QueryOrderLogisticsListResponse unmarshall(QueryOrderLogisticsListResponse queryOrderLogisticsListResponse, UnmarshallerContext _ctx) {
		
		queryOrderLogisticsListResponse.setRequestId(_ctx.stringValue("QueryOrderLogisticsListResponse.RequestId"));
		queryOrderLogisticsListResponse.setCurrentPageNum(_ctx.integerValue("QueryOrderLogisticsListResponse.CurrentPageNum"));
		queryOrderLogisticsListResponse.setTotalPageNum(_ctx.integerValue("QueryOrderLogisticsListResponse.TotalPageNum"));
		queryOrderLogisticsListResponse.setPageSize(_ctx.integerValue("QueryOrderLogisticsListResponse.PageSize"));
		queryOrderLogisticsListResponse.setTotalItemNum(_ctx.integerValue("QueryOrderLogisticsListResponse.TotalItemNum"));

		List<LogisticsRecords> data = new ArrayList<LogisticsRecords>();
		for (int i = 0; i < _ctx.lengthValue("QueryOrderLogisticsListResponse.Data.Length"); i++) {
			LogisticsRecords logisticsRecords = new LogisticsRecords();
			logisticsRecords.setFileType(_ctx.stringValue("QueryOrderLogisticsListResponse.Data["+ i +"].FileType"));
			logisticsRecords.setFileIdentifier(_ctx.stringValue("QueryOrderLogisticsListResponse.Data["+ i +"].FileIdentifier"));
			logisticsRecords.setProduceOrderId(_ctx.stringValue("QueryOrderLogisticsListResponse.Data["+ i +"].ProduceOrderId"));
			logisticsRecords.setBizId(_ctx.stringValue("QueryOrderLogisticsListResponse.Data["+ i +"].BizId"));
			logisticsRecords.setTmIcon(_ctx.stringValue("QueryOrderLogisticsListResponse.Data["+ i +"].TmIcon"));
			logisticsRecords.setTmName(_ctx.stringValue("QueryOrderLogisticsListResponse.Data["+ i +"].TmName"));
			logisticsRecords.setTmNumber(_ctx.stringValue("QueryOrderLogisticsListResponse.Data["+ i +"].TmNumber"));
			logisticsRecords.setLogisticsNo(_ctx.stringValue("QueryOrderLogisticsListResponse.Data["+ i +"].LogisticsNo"));

			data.add(logisticsRecords);
		}
		queryOrderLogisticsListResponse.setData(data);
	 
	 	return queryOrderLogisticsListResponse;
	}
}