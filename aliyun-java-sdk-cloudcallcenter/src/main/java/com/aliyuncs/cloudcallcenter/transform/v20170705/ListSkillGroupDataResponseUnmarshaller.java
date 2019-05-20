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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ListSkillGroupDataResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListSkillGroupDataResponse.DataList;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListSkillGroupDataResponse.DataList.SkillGroupData;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSkillGroupDataResponseUnmarshaller {

	public static ListSkillGroupDataResponse unmarshall(ListSkillGroupDataResponse listSkillGroupDataResponse, UnmarshallerContext context) {
		
		listSkillGroupDataResponse.setRequestId(context.stringValue("ListSkillGroupDataResponse.RequestId"));
		listSkillGroupDataResponse.setSuccess(context.booleanValue("ListSkillGroupDataResponse.Success"));
		listSkillGroupDataResponse.setCode(context.stringValue("ListSkillGroupDataResponse.Code"));
		listSkillGroupDataResponse.setMessage(context.stringValue("ListSkillGroupDataResponse.Message"));
		listSkillGroupDataResponse.setHttpStatusCode(context.integerValue("ListSkillGroupDataResponse.HttpStatusCode"));

		DataList dataList = new DataList();
		dataList.setTotalCount(context.integerValue("ListSkillGroupDataResponse.DataList.TotalCount"));
		dataList.setPageNumber(context.integerValue("ListSkillGroupDataResponse.DataList.PageNumber"));
		dataList.setPageSize(context.integerValue("ListSkillGroupDataResponse.DataList.PageSize"));

		List<SkillGroupData> list = new ArrayList<SkillGroupData>();
		for (int i = 0; i < context.lengthValue("ListSkillGroupDataResponse.DataList.List.Length"); i++) {
			SkillGroupData skillGroupData = new SkillGroupData();
			skillGroupData.setSkillGroupId(context.stringValue("ListSkillGroupDataResponse.DataList.List["+ i +"].SkillGroupId"));
			skillGroupData.setSkillGroupName(context.stringValue("ListSkillGroupDataResponse.DataList.List["+ i +"].SkillGroupName"));
			skillGroupData.setInstanceId(context.stringValue("ListSkillGroupDataResponse.DataList.List["+ i +"].InstanceId"));
			skillGroupData.setRecordDate(context.stringValue("ListSkillGroupDataResponse.DataList.List["+ i +"].RecordDate"));
			skillGroupData.setAgentNumber(context.stringValue("ListSkillGroupDataResponse.DataList.List["+ i +"].AgentNumber"));
			skillGroupData.setLoggedInAgentNumber(context.stringValue("ListSkillGroupDataResponse.DataList.List["+ i +"].LoggedInAgentNumber"));
			skillGroupData.setTalkAgentNumber(context.stringValue("ListSkillGroupDataResponse.DataList.List["+ i +"].TalkAgentNumber"));
			skillGroupData.setReadyAgentNumber(context.stringValue("ListSkillGroupDataResponse.DataList.List["+ i +"].ReadyAgentNumber"));
			skillGroupData.setNotReadyAgentNumber(context.stringValue("ListSkillGroupDataResponse.DataList.List["+ i +"].NotReadyAgentNumber"));
			skillGroupData.setCallWaitNumber(context.stringValue("ListSkillGroupDataResponse.DataList.List["+ i +"].CallWaitNumber"));
			skillGroupData.setInboundCallNumber(context.stringValue("ListSkillGroupDataResponse.DataList.List["+ i +"].InboundCallNumber"));
			skillGroupData.setOutboundCallNumber(context.stringValue("ListSkillGroupDataResponse.DataList.List["+ i +"].OutboundCallNumber"));
			skillGroupData.setAverageAgentTalkTime(context.stringValue("ListSkillGroupDataResponse.DataList.List["+ i +"].AverageAgentTalkTime"));
			skillGroupData.setMaxCallWaitTime(context.stringValue("ListSkillGroupDataResponse.DataList.List["+ i +"].MaxCallWaitTime"));
			skillGroupData.setAnsweredIntr20Percentage(context.stringValue("ListSkillGroupDataResponse.DataList.List["+ i +"].AnsweredIntr20Percentage"));
			skillGroupData.setAverageLoginTime(context.stringValue("ListSkillGroupDataResponse.DataList.List["+ i +"].AverageLoginTime"));
			skillGroupData.setAverageTalkTime(context.stringValue("ListSkillGroupDataResponse.DataList.List["+ i +"].AverageTalkTime"));
			skillGroupData.setAverageTalkPercentage(context.stringValue("ListSkillGroupDataResponse.DataList.List["+ i +"].AverageTalkPercentage"));
			skillGroupData.setInboundAppraisePercentage(context.stringValue("ListSkillGroupDataResponse.DataList.List["+ i +"].InboundAppraisePercentage"));
			skillGroupData.setOutboundAppraisePercentage(context.stringValue("ListSkillGroupDataResponse.DataList.List["+ i +"].OutboundAppraisePercentage"));
			skillGroupData.setAppraisePercentage(context.stringValue("ListSkillGroupDataResponse.DataList.List["+ i +"].AppraisePercentage"));

			list.add(skillGroupData);
		}
		dataList.setList(list);
		listSkillGroupDataResponse.setDataList(dataList);
	 
	 	return listSkillGroupDataResponse;
	}
}