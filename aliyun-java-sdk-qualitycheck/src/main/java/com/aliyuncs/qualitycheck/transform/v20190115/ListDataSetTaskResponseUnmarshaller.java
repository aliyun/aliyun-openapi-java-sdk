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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.ListDataSetTaskResponse;
import com.aliyuncs.qualitycheck.model.v20190115.ListDataSetTaskResponse.PageTaskInfo;
import com.aliyuncs.qualitycheck.model.v20190115.ListDataSetTaskResponse.PageTaskInfo.RuleNameInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataSetTaskResponseUnmarshaller {

	public static ListDataSetTaskResponse unmarshall(ListDataSetTaskResponse listDataSetTaskResponse, UnmarshallerContext _ctx) {
		
		listDataSetTaskResponse.setRequestId(_ctx.stringValue("ListDataSetTaskResponse.RequestId"));
		listDataSetTaskResponse.setCurrentPage(_ctx.integerValue("ListDataSetTaskResponse.CurrentPage"));
		listDataSetTaskResponse.setDataSize(_ctx.integerValue("ListDataSetTaskResponse.DataSize"));
		listDataSetTaskResponse.setSuccess(_ctx.booleanValue("ListDataSetTaskResponse.Success"));
		listDataSetTaskResponse.setCode(_ctx.stringValue("ListDataSetTaskResponse.Code"));
		listDataSetTaskResponse.setIsAllcomplete(_ctx.integerValue("ListDataSetTaskResponse.IsAllcomplete"));
		listDataSetTaskResponse.setMessage(_ctx.stringValue("ListDataSetTaskResponse.Message"));
		listDataSetTaskResponse.setPageSize(_ctx.integerValue("ListDataSetTaskResponse.PageSize"));
		listDataSetTaskResponse.setTotalCount(_ctx.integerValue("ListDataSetTaskResponse.TotalCount"));

		List<PageTaskInfo> data = new ArrayList<PageTaskInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListDataSetTaskResponse.Data.Length"); i++) {
			PageTaskInfo pageTaskInfo = new PageTaskInfo();
			pageTaskInfo.setStatus(_ctx.integerValue("ListDataSetTaskResponse.Data["+ i +"].Status"));
			pageTaskInfo.setIsTaskComplete(_ctx.booleanValue("ListDataSetTaskResponse.Data["+ i +"].IsTaskComplete"));
			pageTaskInfo.setScheduleRatio(_ctx.floatValue("ListDataSetTaskResponse.Data["+ i +"].ScheduleRatio"));
			pageTaskInfo.setTaskComplete(_ctx.booleanValue("ListDataSetTaskResponse.Data["+ i +"].TaskComplete"));
			pageTaskInfo.setDataSetSize(_ctx.integerValue("ListDataSetTaskResponse.Data["+ i +"].DataSetSize"));
			pageTaskInfo.setRuleSize(_ctx.integerValue("ListDataSetTaskResponse.Data["+ i +"].RuleSize"));
			pageTaskInfo.setJobName(_ctx.stringValue("ListDataSetTaskResponse.Data["+ i +"].JobName"));
			pageTaskInfo.setTaskId(_ctx.stringValue("ListDataSetTaskResponse.Data["+ i +"].TaskId"));

			List<String> dataSets = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListDataSetTaskResponse.Data["+ i +"].DataSets.Length"); j++) {
				dataSets.add(_ctx.stringValue("ListDataSetTaskResponse.Data["+ i +"].DataSets["+ j +"]"));
			}
			pageTaskInfo.setDataSets(dataSets);

			List<RuleNameInfo> ruleNameInfoList = new ArrayList<RuleNameInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListDataSetTaskResponse.Data["+ i +"].RuleNameInfoList.Length"); j++) {
				RuleNameInfo ruleNameInfo = new RuleNameInfo();
				ruleNameInfo.setRuleName(_ctx.stringValue("ListDataSetTaskResponse.Data["+ i +"].RuleNameInfoList["+ j +"].RuleName"));
				ruleNameInfo.setRid(_ctx.integerValue("ListDataSetTaskResponse.Data["+ i +"].RuleNameInfoList["+ j +"].Rid"));

				ruleNameInfoList.add(ruleNameInfo);
			}
			pageTaskInfo.setRuleNameInfoList(ruleNameInfoList);

			data.add(pageTaskInfo);
		}
		listDataSetTaskResponse.setData(data);
	 
	 	return listDataSetTaskResponse;
	}
}