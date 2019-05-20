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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListDetailOfSkillGroupResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListDetailOfSkillGroupResponse.DataList;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListDetailOfSkillGroupResponse.DataList.SkillGroupData;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDetailOfSkillGroupResponseUnmarshaller {

	public static ListDetailOfSkillGroupResponse unmarshall(ListDetailOfSkillGroupResponse listDetailOfSkillGroupResponse, UnmarshallerContext context) {
		
		listDetailOfSkillGroupResponse.setRequestId(context.stringValue("ListDetailOfSkillGroupResponse.RequestId"));
		listDetailOfSkillGroupResponse.setSuccess(context.booleanValue("ListDetailOfSkillGroupResponse.Success"));
		listDetailOfSkillGroupResponse.setCode(context.stringValue("ListDetailOfSkillGroupResponse.Code"));
		listDetailOfSkillGroupResponse.setMessage(context.stringValue("ListDetailOfSkillGroupResponse.Message"));
		listDetailOfSkillGroupResponse.setHttpStatusCode(context.integerValue("ListDetailOfSkillGroupResponse.HttpStatusCode"));

		DataList dataList = new DataList();
		dataList.setTotalCount(context.integerValue("ListDetailOfSkillGroupResponse.DataList.TotalCount"));
		dataList.setPageNumber(context.integerValue("ListDetailOfSkillGroupResponse.DataList.PageNumber"));
		dataList.setPageSize(context.integerValue("ListDetailOfSkillGroupResponse.DataList.PageSize"));

		List<SkillGroupData> list = new ArrayList<SkillGroupData>();
		for (int i = 0; i < context.lengthValue("ListDetailOfSkillGroupResponse.DataList.List.Length"); i++) {
			SkillGroupData skillGroupData = new SkillGroupData();
			skillGroupData.setSkillGroupId(context.stringValue("ListDetailOfSkillGroupResponse.DataList.List["+ i +"].SkillGroupId"));
			skillGroupData.setInstanceId(context.stringValue("ListDetailOfSkillGroupResponse.DataList.List["+ i +"].InstanceId"));
			skillGroupData.setRecordDate(context.stringValue("ListDetailOfSkillGroupResponse.DataList.List["+ i +"].RecordDate"));
			skillGroupData.setAgentNumber(context.stringValue("ListDetailOfSkillGroupResponse.DataList.List["+ i +"].AgentNumber"));
			skillGroupData.setLoggedInAgentNumber(context.stringValue("ListDetailOfSkillGroupResponse.DataList.List["+ i +"].LoggedInAgentNumber"));
			skillGroupData.setTalkAgentNumber(context.stringValue("ListDetailOfSkillGroupResponse.DataList.List["+ i +"].TalkAgentNumber"));
			skillGroupData.setReadyAgentNumber(context.stringValue("ListDetailOfSkillGroupResponse.DataList.List["+ i +"].ReadyAgentNumber"));
			skillGroupData.setNotReadyAgentNumber(context.stringValue("ListDetailOfSkillGroupResponse.DataList.List["+ i +"].NotReadyAgentNumber"));
			skillGroupData.setCallWaitNumber(context.stringValue("ListDetailOfSkillGroupResponse.DataList.List["+ i +"].CallWaitNumber"));
			skillGroupData.setInboundCallNumber(context.stringValue("ListDetailOfSkillGroupResponse.DataList.List["+ i +"].InboundCallNumber"));
			skillGroupData.setOutboundCallNumber(context.stringValue("ListDetailOfSkillGroupResponse.DataList.List["+ i +"].OutboundCallNumber"));
			skillGroupData.setAverageAgentTalkTime(context.stringValue("ListDetailOfSkillGroupResponse.DataList.List["+ i +"].AverageAgentTalkTime"));
			skillGroupData.setMaxCallWaitTime(context.stringValue("ListDetailOfSkillGroupResponse.DataList.List["+ i +"].MaxCallWaitTime"));
			skillGroupData.setAnsweredIntr20Percentage(context.stringValue("ListDetailOfSkillGroupResponse.DataList.List["+ i +"].AnsweredIntr20Percentage"));
			skillGroupData.setAverageLoginTime(context.stringValue("ListDetailOfSkillGroupResponse.DataList.List["+ i +"].AverageLoginTime"));
			skillGroupData.setAverageTalkTime(context.stringValue("ListDetailOfSkillGroupResponse.DataList.List["+ i +"].AverageTalkTime"));
			skillGroupData.setAverageTalkPercentage(context.stringValue("ListDetailOfSkillGroupResponse.DataList.List["+ i +"].AverageTalkPercentage"));
			skillGroupData.setInboundAppraisePercentage(context.stringValue("ListDetailOfSkillGroupResponse.DataList.List["+ i +"].InboundAppraisePercentage"));
			skillGroupData.setOutboundAppraisePercentage(context.stringValue("ListDetailOfSkillGroupResponse.DataList.List["+ i +"].OutboundAppraisePercentage"));
			skillGroupData.setAppraisePercentage(context.stringValue("ListDetailOfSkillGroupResponse.DataList.List["+ i +"].AppraisePercentage"));

			list.add(skillGroupData);
		}
		dataList.setList(list);
		listDetailOfSkillGroupResponse.setDataList(dataList);
	 
	 	return listDetailOfSkillGroupResponse;
	}
}