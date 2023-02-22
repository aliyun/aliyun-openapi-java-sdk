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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeCycleTaskListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeCycleTaskListResponse.CycleScheduleResponse;
import com.aliyuncs.sas.model.v20181203.DescribeCycleTaskListResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCycleTaskListResponseUnmarshaller {

	public static DescribeCycleTaskListResponse unmarshall(DescribeCycleTaskListResponse describeCycleTaskListResponse, UnmarshallerContext _ctx) {
		
		describeCycleTaskListResponse.setRequestId(_ctx.stringValue("DescribeCycleTaskListResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeCycleTaskListResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeCycleTaskListResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeCycleTaskListResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeCycleTaskListResponse.PageInfo.Count"));
		describeCycleTaskListResponse.setPageInfo(pageInfo);

		List<CycleScheduleResponse> cycleScheduleResponseList = new ArrayList<CycleScheduleResponse>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCycleTaskListResponse.CycleScheduleResponseList.Length"); i++) {
			CycleScheduleResponse cycleScheduleResponse = new CycleScheduleResponse();
			cycleScheduleResponse.setLastTaskId(_ctx.stringValue("DescribeCycleTaskListResponse.CycleScheduleResponseList["+ i +"].LastTaskId"));
			cycleScheduleResponse.setConfigId(_ctx.stringValue("DescribeCycleTaskListResponse.CycleScheduleResponseList["+ i +"].ConfigId"));
			cycleScheduleResponse.setTargetEndTime(_ctx.integerValue("DescribeCycleTaskListResponse.CycleScheduleResponseList["+ i +"].TargetEndTime"));
			cycleScheduleResponse.setNextStartTimeStr(_ctx.longValue("DescribeCycleTaskListResponse.CycleScheduleResponseList["+ i +"].NextStartTimeStr"));
			cycleScheduleResponse.setTaskName(_ctx.stringValue("DescribeCycleTaskListResponse.CycleScheduleResponseList["+ i +"].TaskName"));
			cycleScheduleResponse.setTaskType(_ctx.stringValue("DescribeCycleTaskListResponse.CycleScheduleResponseList["+ i +"].TaskType"));
			cycleScheduleResponse.setIntervalPeriod(_ctx.integerValue("DescribeCycleTaskListResponse.CycleScheduleResponseList["+ i +"].IntervalPeriod"));
			cycleScheduleResponse.setFirstDateStr(_ctx.longValue("DescribeCycleTaskListResponse.CycleScheduleResponseList["+ i +"].FirstDateStr"));
			cycleScheduleResponse.setParam(_ctx.stringValue("DescribeCycleTaskListResponse.CycleScheduleResponseList["+ i +"].Param"));
			cycleScheduleResponse.setPeriodUnit(_ctx.stringValue("DescribeCycleTaskListResponse.CycleScheduleResponseList["+ i +"].PeriodUnit"));
			cycleScheduleResponse.setTargetStartTime(_ctx.integerValue("DescribeCycleTaskListResponse.CycleScheduleResponseList["+ i +"].TargetStartTime"));
			cycleScheduleResponse.setEnable(_ctx.integerValue("DescribeCycleTaskListResponse.CycleScheduleResponseList["+ i +"].Enable"));

			cycleScheduleResponseList.add(cycleScheduleResponse);
		}
		describeCycleTaskListResponse.setCycleScheduleResponseList(cycleScheduleResponseList);
	 
	 	return describeCycleTaskListResponse;
	}
}