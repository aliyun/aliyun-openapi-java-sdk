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

import com.aliyuncs.rdc.model.v20180821.GetIssueByIdResponse;
import com.aliyuncs.rdc.model.v20180821.GetIssueByIdResponse.Data;
import com.aliyuncs.rdc.model.v20180821.GetIssueByIdResponse.Data.CfsListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIssueByIdResponseUnmarshaller {

	public static GetIssueByIdResponse unmarshall(GetIssueByIdResponse getIssueByIdResponse, UnmarshallerContext context) {
		
		getIssueByIdResponse.setRequestId(context.stringValue("GetIssueByIdResponse.RequestId"));
		getIssueByIdResponse.setCode(context.integerValue("GetIssueByIdResponse.Code"));
		getIssueByIdResponse.setSuccess(context.stringValue("GetIssueByIdResponse.Success"));

		Data data = new Data();
		data.setAkProjectId(context.integerValue("GetIssueByIdResponse.Data.AkProjectId"));
		data.setAssignedTo(context.stringValue("GetIssueByIdResponse.Data.AssignedTo"));
		data.setAssignedToId(context.integerValue("GetIssueByIdResponse.Data.AssignedToId"));
		data.setAssignedToIdList(context.stringValue("GetIssueByIdResponse.Data.AssignedToIdList"));
		data.setAssignedToIds(context.stringValue("GetIssueByIdResponse.Data.AssignedToIds"));
		data.setAssignedToMaps(context.stringValue("GetIssueByIdResponse.Data.AssignedToMaps"));
		data.setAssignedToStaffId(context.stringValue("GetIssueByIdResponse.Data.AssignedToStaffId"));
		data.setAttachmentIds(context.stringValue("GetIssueByIdResponse.Data.AttachmentIds"));
		data.setAttachmentList(context.stringValue("GetIssueByIdResponse.Data.AttachmentList"));
		data.setAttachmented(context.booleanValue("GetIssueByIdResponse.Data.Attachmented"));
		data.setBlackListNotice(context.stringValue("GetIssueByIdResponse.Data.BlackListNotice"));
		data.setChangeLogList(context.stringValue("GetIssueByIdResponse.Data.ChangeLogList"));
		data.setCommentList(context.stringValue("GetIssueByIdResponse.Data.CommentList"));
		data.setCommitDate(context.longValue("GetIssueByIdResponse.Data.CommitDate"));
		data.setCreatedAt(context.longValue("GetIssueByIdResponse.Data.CreatedAt"));
		data.setDescription(context.stringValue("GetIssueByIdResponse.Data.Description"));
		data.setGuid(context.stringValue("GetIssueByIdResponse.Data.Guid"));
		data.setId(context.integerValue("GetIssueByIdResponse.Data.Id"));
		data.setIdPath(context.stringValue("GetIssueByIdResponse.Data.IdPath"));
		data.setIgnoreCheck(context.booleanValue("GetIssueByIdResponse.Data.IgnoreCheck"));
		data.setIgnoreIntegrate(context.booleanValue("GetIssueByIdResponse.Data.IgnoreIntegrate"));
		data.setIssueTypeId(context.integerValue("GetIssueByIdResponse.Data.IssueTypeId"));
		data.setLogicalStatus(context.stringValue("GetIssueByIdResponse.Data.LogicalStatus"));
		data.setModuleIds(context.stringValue("GetIssueByIdResponse.Data.ModuleIds"));
		data.setModuleList(context.stringValue("GetIssueByIdResponse.Data.ModuleList"));
		data.setModuleUpdated(context.booleanValue("GetIssueByIdResponse.Data.ModuleUpdated"));
		data.setParentId(context.integerValue("GetIssueByIdResponse.Data.ParentId"));
		data.setPriority(context.stringValue("GetIssueByIdResponse.Data.Priority"));
		data.setPriorityId(context.integerValue("GetIssueByIdResponse.Data.PriorityId"));
		data.setProjectIds(context.stringValue("GetIssueByIdResponse.Data.ProjectIds"));
		data.setRecordChangeLog(context.booleanValue("GetIssueByIdResponse.Data.RecordChangeLog"));
		data.setRegionId(context.integerValue("GetIssueByIdResponse.Data.RegionId"));
		data.setRelatedAKProjectGuids(context.stringValue("GetIssueByIdResponse.Data.RelatedAKProjectGuids"));
		data.setRelatedAKProjectIds(context.stringValue("GetIssueByIdResponse.Data.RelatedAKProjectIds"));
		data.setRelatedUserIds(context.stringValue("GetIssueByIdResponse.Data.RelatedUserIds"));
		data.setSendWangwang(context.booleanValue("GetIssueByIdResponse.Data.SendWangwang"));
		data.setSeriousLevel(context.stringValue("GetIssueByIdResponse.Data.SeriousLevel"));
		data.setSeriousLevelId(context.integerValue("GetIssueByIdResponse.Data.SeriousLevelId"));
		data.setSkipCollab(context.booleanValue("GetIssueByIdResponse.Data.SkipCollab"));
		data.setStamp(context.stringValue("GetIssueByIdResponse.Data.Stamp"));
		data.setStatus(context.stringValue("GetIssueByIdResponse.Data.Status"));
		data.setStatusId(context.integerValue("GetIssueByIdResponse.Data.StatusId"));
		data.setStatusStage(context.integerValue("GetIssueByIdResponse.Data.StatusStage"));
		data.setSubject(context.stringValue("GetIssueByIdResponse.Data.Subject"));
		data.setTagIdList(context.stringValue("GetIssueByIdResponse.Data.TagIdList"));
		data.setTemplateId(context.integerValue("GetIssueByIdResponse.Data.TemplateId"));
		data.setTrackerIds(context.stringValue("GetIssueByIdResponse.Data.TrackerIds"));
		data.setTrackers(context.stringValue("GetIssueByIdResponse.Data.Trackers"));
		data.setUpdateStatusAt(context.longValue("GetIssueByIdResponse.Data.UpdateStatusAt"));
		data.setUpdatedAt(context.longValue("GetIssueByIdResponse.Data.UpdatedAt"));
		data.setUser(context.stringValue("GetIssueByIdResponse.Data.User"));
		data.setUserId(context.integerValue("GetIssueByIdResponse.Data.UserId"));
		data.setUserStaffId(context.stringValue("GetIssueByIdResponse.Data.UserStaffId"));
		data.setVerifier(context.stringValue("GetIssueByIdResponse.Data.Verifier"));
		data.setVerifierId(context.integerValue("GetIssueByIdResponse.Data.VerifierId"));
		data.setVerifierStaffId(context.stringValue("GetIssueByIdResponse.Data.VerifierStaffId"));
		data.setVersionIds(context.stringValue("GetIssueByIdResponse.Data.VersionIds"));
		data.setVersionList(context.stringValue("GetIssueByIdResponse.Data.VersionList"));
		data.setWatched(context.booleanValue("GetIssueByIdResponse.Data.Watched"));

		List<CfsListItem> cfsList = new ArrayList<CfsListItem>();
		for (int i = 0; i < context.lengthValue("GetIssueByIdResponse.Data.CfsList.Length"); i++) {
			CfsListItem cfsListItem = new CfsListItem();
			cfsListItem.setId(context.stringValue("GetIssueByIdResponse.Data.CfsList["+ i +"].Id"));
			cfsListItem.setName(context.stringValue("GetIssueByIdResponse.Data.CfsList["+ i +"].Name"));
			cfsListItem.setType(context.stringValue("GetIssueByIdResponse.Data.CfsList["+ i +"].Type"));
			cfsListItem.setValue(context.stringValue("GetIssueByIdResponse.Data.CfsList["+ i +"].Value"));

			cfsList.add(cfsListItem);
		}
		data.setCfsList(cfsList);
		getIssueByIdResponse.setData(data);
	 
	 	return getIssueByIdResponse;
	}
}