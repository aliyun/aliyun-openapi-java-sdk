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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.ListCorpGroupMetricsResponse;
import com.aliyuncs.vcs.model.v20200515.ListCorpGroupMetricsResponse.Day;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCorpGroupMetricsResponseUnmarshaller {

	public static ListCorpGroupMetricsResponse unmarshall(ListCorpGroupMetricsResponse listCorpGroupMetricsResponse, UnmarshallerContext _ctx) {
		
		listCorpGroupMetricsResponse.setRequestId(_ctx.stringValue("ListCorpGroupMetricsResponse.RequestId"));
		listCorpGroupMetricsResponse.setCode(_ctx.stringValue("ListCorpGroupMetricsResponse.Code"));
		listCorpGroupMetricsResponse.setMessage(_ctx.stringValue("ListCorpGroupMetricsResponse.Message"));
		listCorpGroupMetricsResponse.setPageNumber(_ctx.integerValue("ListCorpGroupMetricsResponse.PageNumber"));
		listCorpGroupMetricsResponse.setPageSize(_ctx.integerValue("ListCorpGroupMetricsResponse.PageSize"));
		listCorpGroupMetricsResponse.setTotalCount(_ctx.integerValue("ListCorpGroupMetricsResponse.TotalCount"));
		listCorpGroupMetricsResponse.setSuccess(_ctx.stringValue("ListCorpGroupMetricsResponse.Success"));

		List<Day> data = new ArrayList<Day>();
		for (int i = 0; i < _ctx.lengthValue("ListCorpGroupMetricsResponse.Data.Length"); i++) {
			Day day = new Day();
			day.setCheckedTime(_ctx.stringValue("ListCorpGroupMetricsResponse.Data["+ i +"].CheckedTime"));
			day.setTagMetrics(_ctx.stringValue("ListCorpGroupMetricsResponse.Data["+ i +"].TagMetrics"));
			day.setTagCode(_ctx.stringValue("ListCorpGroupMetricsResponse.Data["+ i +"].TagCode"));
			day.setTagValue(_ctx.stringValue("ListCorpGroupMetricsResponse.Data["+ i +"].TagValue"));
			day.setGroupId(_ctx.stringValue("ListCorpGroupMetricsResponse.Data["+ i +"].GroupId"));

			data.add(day);
		}
		listCorpGroupMetricsResponse.setData(data);
	 
	 	return listCorpGroupMetricsResponse;
	}
}