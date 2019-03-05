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

package com.aliyuncs.rdc.transform.v20180821;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rdc.model.v20180821.GetWorkitemByIdResponse;
import com.aliyuncs.rdc.model.v20180821.GetWorkitemByIdResponse.Data;
import com.aliyuncs.rdc.model.v20180821.GetWorkitemByIdResponse.Data.CfsListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWorkitemByIdResponseUnmarshaller {

	public static GetWorkitemByIdResponse unmarshall(GetWorkitemByIdResponse getWorkitemByIdResponse, UnmarshallerContext context) {
		
		getWorkitemByIdResponse.setRequestId(context.stringValue("GetWorkitemByIdResponse.RequestId"));
		getWorkitemByIdResponse.setCode(context.integerValue("GetWorkitemByIdResponse.Code"));
		getWorkitemByIdResponse.setSuccess(context.stringValue("GetWorkitemByIdResponse.Success"));

		Data data = new Data();
		data.setAkProjectId(context.integerValue("GetWorkitemByIdResponse.Data.AkProjectId"));
		data.setAssignedTo(context.stringValue("GetWorkitemByIdResponse.Data.AssignedTo"));
		data.setAssignedToId(context.integerValue("GetWorkitemByIdResponse.Data.AssignedToId"));
		data.setAssignedToIdList(context.stringValue("GetWorkitemByIdResponse.Data.AssignedToIdList"));
		data.setAssignedToIds(context.stringValue("GetWorkitemByIdResponse.Data.AssignedToIds"));
		data.setAssignedToMaps(context.stringValue("GetWorkitemByIdResponse.Data.AssignedToMaps"));
		data.setAssignedToStaffId(context.stringValue("GetWorkitemByIdResponse.Data.AssignedToStaffId"));
		data.setAttachmentIds(context.stringValue("GetWorkitemByIdResponse.Data.AttachmentIds"));
		data.setAttachmentList(context.stringValue("GetWorkitemByIdResponse.Data.AttachmentList"));
		data.setAttachmented(context.booleanValue("GetWorkitemByIdResponse.Data.Attachmented"));
		data.setBlackListNotice(context.stringValue("GetWorkitemByIdResponse.Data.BlackListNotice"));
		data.setChangeLogList(context.stringValue("GetWorkitemByIdResponse.Data.ChangeLogList"));
		data.setCommentList(context.stringValue("GetWorkitemByIdResponse.Data.CommentList"));
		data.setCommitDate(context.longValue("GetWorkitemByIdResponse.Data.CommitDate"));
		data.setCreatedAt(context.longValue("GetWorkitemByIdResponse.Data.CreatedAt"));
		data.setDescription(context.stringValue("GetWorkitemByIdResponse.Data.Description"));
		data.setGuid(context.stringValue("GetWorkitemByIdResponse.Data.Guid"));
		data.setId(context.integerValue("GetWorkitemByIdResponse.Data.Id"));
		data.setIdPath(context.stringValue("GetWorkitemByIdResponse.Data.IdPath"));
		data.setIgnoreCheck(context.booleanValue("GetWorkitemByIdResponse.Data.IgnoreCheck"));
		data.setIgnoreIntegrate(context.booleanValue("GetWorkitemByIdResponse.Data.IgnoreIntegrate"));
		data.setIssueTypeId(context.integerValue("GetWorkitemByIdResponse.Data.IssueTypeId"));
		data.setLogicalStatus(context.stringValue("GetWorkitemByIdResponse.Data.LogicalStatus"));
		data.setModuleIds(context.stringValue("GetWorkitemByIdResponse.Data.ModuleIds"));
		data.setModuleList(context.stringValue("GetWorkitemByIdResponse.Data.ModuleList"));
		data.setModuleUpdated(context.booleanValue("GetWorkitemByIdResponse.Data.ModuleUpdated"));
		data.setParentId(context.integerValue("GetWorkitemByIdResponse.Data.ParentId"));
		data.setPriority(context.stringValue("GetWorkitemByIdResponse.Data.Priority"));
		data.setPriorityId(context.integerValue("GetWorkitemByIdResponse.Data.PriorityId"));
		data.setProjectIds(context.stringValue("GetWorkitemByIdResponse.Data.ProjectIds"));
		data.setRecordChangeLog(context.booleanValue("GetWorkitemByIdResponse.Data.RecordChangeLog"));
		data.setRegionId(context.integerValue("GetWorkitemByIdResponse.Data.RegionId"));
		data.setRelatedAKProjectGuids(context.stringValue("GetWorkitemByIdResponse.Data.RelatedAKProjectGuids"));
		data.setRelatedAKProjectIds(context.stringValue("GetWorkitemByIdResponse.Data.RelatedAKProjectIds"));
		data.setRelatedUserIds(context.stringValue("GetWorkitemByIdResponse.Data.RelatedUserIds"));
		data.setSendWangwang(context.booleanValue("GetWorkitemByIdResponse.Data.SendWangwang"));
		data.setSeriousLevel(context.stringValue("GetWorkitemByIdResponse.Data.SeriousLevel"));
		data.setSeriousLevelId(context.integerValue("GetWorkitemByIdResponse.Data.SeriousLevelId"));
		data.setSkipCollab(context.booleanValue("GetWorkitemByIdResponse.Data.SkipCollab"));
		data.setStamp(context.stringValue("GetWorkitemByIdResponse.Data.Stamp"));
		data.setStatus(context.stringValue("GetWorkitemByIdResponse.Data.Status"));
		data.setStatusId(context.integerValue("GetWorkitemByIdResponse.Data.StatusId"));
		data.setStatusStage(context.integerValue("GetWorkitemByIdResponse.Data.StatusStage"));
		data.setSubject(context.stringValue("GetWorkitemByIdResponse.Data.Subject"));
		data.setTagIdList(context.stringValue("GetWorkitemByIdResponse.Data.TagIdList"));
		data.setTemplateId(context.integerValue("GetWorkitemByIdResponse.Data.TemplateId"));
		data.setTrackerIds(context.stringValue("GetWorkitemByIdResponse.Data.TrackerIds"));
		data.setTrackers(context.stringValue("GetWorkitemByIdResponse.Data.Trackers"));
		data.setUpdateStatusAt(context.longValue("GetWorkitemByIdResponse.Data.UpdateStatusAt"));
		data.setUpdatedAt(context.longValue("GetWorkitemByIdResponse.Data.UpdatedAt"));
		data.setUser(context.stringValue("GetWorkitemByIdResponse.Data.User"));
		data.setUserId(context.integerValue("GetWorkitemByIdResponse.Data.UserId"));
		data.setUserStaffId(context.stringValue("GetWorkitemByIdResponse.Data.UserStaffId"));
		data.setVerifier(context.stringValue("GetWorkitemByIdResponse.Data.Verifier"));
		data.setVerifierId(context.integerValue("GetWorkitemByIdResponse.Data.VerifierId"));
		data.setVerifierStaffId(context.stringValue("GetWorkitemByIdResponse.Data.VerifierStaffId"));
		data.setVersionIds(context.stringValue("GetWorkitemByIdResponse.Data.VersionIds"));
		data.setVersionList(context.stringValue("GetWorkitemByIdResponse.Data.VersionList"));
		data.setWatched(context.booleanValue("GetWorkitemByIdResponse.Data.Watched"));

		List<CfsListItem> cfsList = new ArrayList<CfsListItem>();
		for (int i = 0; i < context.lengthValue("GetWorkitemByIdResponse.Data.CfsList.Length"); i++) {
			CfsListItem cfsListItem = new CfsListItem();
			cfsListItem.setId(context.stringValue("GetWorkitemByIdResponse.Data.CfsList["+ i +"].Id"));
			cfsListItem.setName(context.stringValue("GetWorkitemByIdResponse.Data.CfsList["+ i +"].Name"));
			cfsListItem.setType(context.stringValue("GetWorkitemByIdResponse.Data.CfsList["+ i +"].Type"));
			cfsListItem.setValue(context.stringValue("GetWorkitemByIdResponse.Data.CfsList["+ i +"].Value"));

			cfsList.add(cfsListItem);
		}
		data.setCfsList(cfsList);
		getWorkitemByIdResponse.setData(data);
	 
	 	return getWorkitemByIdResponse;
	}
}