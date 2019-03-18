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

package com.aliyuncs.ccs.transform.v20171001;

import com.aliyuncs.ccs.model.v20171001.GetHotlineRecordResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHotlineRecordResponseUnmarshaller {

	public static GetHotlineRecordResponse unmarshall(GetHotlineRecordResponse getHotlineRecordResponse, UnmarshallerContext context) {
		
		getHotlineRecordResponse.setRequestId(context.stringValue("GetHotlineRecordResponse.RequestId"));
		getHotlineRecordResponse.setId(context.stringValue("GetHotlineRecordResponse.Id"));
		getHotlineRecordResponse.setCallType(context.stringValue("GetHotlineRecordResponse.CallType"));
		getHotlineRecordResponse.setVisitorId(context.stringValue("GetHotlineRecordResponse.VisitorId"));
		getHotlineRecordResponse.setVisitorPhone(context.stringValue("GetHotlineRecordResponse.VisitorPhone"));
		getHotlineRecordResponse.setVisitorProvince(context.stringValue("GetHotlineRecordResponse.VisitorProvince"));
		getHotlineRecordResponse.setSceneId(context.stringValue("GetHotlineRecordResponse.SceneId"));
		getHotlineRecordResponse.setAgentId(context.stringValue("GetHotlineRecordResponse.AgentId"));
		getHotlineRecordResponse.setAgentName(context.stringValue("GetHotlineRecordResponse.AgentName"));
		getHotlineRecordResponse.setCreateTime(context.stringValue("GetHotlineRecordResponse.CreateTime"));
		getHotlineRecordResponse.setFinishTime(context.stringValue("GetHotlineRecordResponse.FinishTime"));
		getHotlineRecordResponse.setStatus(context.stringValue("GetHotlineRecordResponse.Status"));
		getHotlineRecordResponse.setMemo(context.stringValue("GetHotlineRecordResponse.Memo"));
		getHotlineRecordResponse.setHangupType(context.stringValue("GetHotlineRecordResponse.HangupType"));
		getHotlineRecordResponse.setSatisfaction(context.stringValue("GetHotlineRecordResponse.Satisfaction"));
		getHotlineRecordResponse.setOutboundTaskId(context.stringValue("GetHotlineRecordResponse.OutboundTaskId"));
		getHotlineRecordResponse.setCategories(context.stringValue("GetHotlineRecordResponse.Categories"));
		getHotlineRecordResponse.setCcsInstanceId(context.stringValue("GetHotlineRecordResponse.CcsInstanceId"));
		getHotlineRecordResponse.setTalkDuration(context.longValue("GetHotlineRecordResponse.TalkDuration"));
		getHotlineRecordResponse.setGroupId(context.stringValue("GetHotlineRecordResponse.GroupId"));
		getHotlineRecordResponse.setGroupName(context.stringValue("GetHotlineRecordResponse.GroupName"));
	 
	 	return getHotlineRecordResponse;
	}
}