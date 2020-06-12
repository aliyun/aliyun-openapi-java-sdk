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

	public static GetIssueByIdResponse unmarshall(GetIssueByIdResponse getIssueByIdResponse, UnmarshallerContext _ctx) {
		
		getIssueByIdResponse.setRequestId(_ctx.stringValue("GetIssueByIdResponse.RequestId"));
		getIssueByIdResponse.setCode(_ctx.integerValue("GetIssueByIdResponse.Code"));
		getIssueByIdResponse.setSuccess(_ctx.stringValue("GetIssueByIdResponse.Success"));

		Data data = new Data();
		data.setAkProjectId(_ctx.integerValue("GetIssueByIdResponse.Data.AkProjectId"));
		data.setAssignedTo(_ctx.stringValue("GetIssueByIdResponse.Data.AssignedTo"));
		data.setAssignedToId(_ctx.integerValue("GetIssueByIdResponse.Data.AssignedToId"));
		data.setAssignedToIdList(_ctx.stringValue("GetIssueByIdResponse.Data.AssignedToIdList"));
		data.setAssignedToIds(_ctx.stringValue("GetIssueByIdResponse.Data.AssignedToIds"));
		data.setAssignedToMaps(_ctx.stringValue("GetIssueByIdResponse.Data.AssignedToMaps"));
		data.setAssignedToStaffId(_ctx.stringValue("GetIssueByIdResponse.Data.AssignedToStaffId"));
		data.setAttachmentIds(_ctx.stringValue("GetIssueByIdResponse.Data.AttachmentIds"));
		data.setAttachmentList(_ctx.stringValue("GetIssueByIdResponse.Data.AttachmentList"));
		data.setAttachmented(_ctx.booleanValue("GetIssueByIdResponse.Data.Attachmented"));
		data.setBlackListNotice(_ctx.stringValue("GetIssueByIdResponse.Data.BlackListNotice"));
		data.setChangeLogList(_ctx.stringValue("GetIssueByIdResponse.Data.ChangeLogList"));
		data.setCommentList(_ctx.stringValue("GetIssueByIdResponse.Data.CommentList"));
		data.setCommitDate(_ctx.longValue("GetIssueByIdResponse.Data.CommitDate"));
		data.setCreatedAt(_ctx.longValue("GetIssueByIdResponse.Data.CreatedAt"));
		data.setDescription(_ctx.stringValue("GetIssueByIdResponse.Data.Description"));
		data.setGuid(_ctx.stringValue("GetIssueByIdResponse.Data.Guid"));
		data.setId(_ctx.integerValue("GetIssueByIdResponse.Data.Id"));
		data.setIdPath(_ctx.stringValue("GetIssueByIdResponse.Data.IdPath"));
		data.setIgnoreCheck(_ctx.booleanValue("GetIssueByIdResponse.Data.IgnoreCheck"));
		data.setIgnoreIntegrate(_ctx.booleanValue("GetIssueByIdResponse.Data.IgnoreIntegrate"));
		data.setIssueTypeId(_ctx.integerValue("GetIssueByIdResponse.Data.IssueTypeId"));
		data.setLogicalStatus(_ctx.stringValue("GetIssueByIdResponse.Data.LogicalStatus"));
		data.setModuleIds(_ctx.stringValue("GetIssueByIdResponse.Data.ModuleIds"));
		data.setModuleList(_ctx.stringValue("GetIssueByIdResponse.Data.ModuleList"));
		data.setModuleUpdated(_ctx.booleanValue("GetIssueByIdResponse.Data.ModuleUpdated"));
		data.setParentId(_ctx.integerValue("GetIssueByIdResponse.Data.ParentId"));
		data.setPriority(_ctx.stringValue("GetIssueByIdResponse.Data.Priority"));
		data.setPriorityId(_ctx.integerValue("GetIssueByIdResponse.Data.PriorityId"));
		data.setProjectIds(_ctx.stringValue("GetIssueByIdResponse.Data.ProjectIds"));
		data.setRecordChangeLog(_ctx.booleanValue("GetIssueByIdResponse.Data.RecordChangeLog"));
		data.setRegionId(_ctx.integerValue("GetIssueByIdResponse.Data.RegionId"));
		data.setRelatedAKProjectGuids(_ctx.stringValue("GetIssueByIdResponse.Data.RelatedAKProjectGuids"));
		data.setRelatedAKProjectIds(_ctx.stringValue("GetIssueByIdResponse.Data.RelatedAKProjectIds"));
		data.setRelatedUserIds(_ctx.stringValue("GetIssueByIdResponse.Data.RelatedUserIds"));
		data.setSendWangwang(_ctx.booleanValue("GetIssueByIdResponse.Data.SendWangwang"));
		data.setSeriousLevel(_ctx.stringValue("GetIssueByIdResponse.Data.SeriousLevel"));
		data.setSeriousLevelId(_ctx.integerValue("GetIssueByIdResponse.Data.SeriousLevelId"));
		data.setSkipCollab(_ctx.booleanValue("GetIssueByIdResponse.Data.SkipCollab"));
		data.setStamp(_ctx.stringValue("GetIssueByIdResponse.Data.Stamp"));
		data.setStatus(_ctx.stringValue("GetIssueByIdResponse.Data.Status"));
		data.setStatusId(_ctx.integerValue("GetIssueByIdResponse.Data.StatusId"));
		data.setStatusStage(_ctx.integerValue("GetIssueByIdResponse.Data.StatusStage"));
		data.setSubject(_ctx.stringValue("GetIssueByIdResponse.Data.Subject"));
		data.setTagIdList(_ctx.stringValue("GetIssueByIdResponse.Data.TagIdList"));
		data.setTemplateId(_ctx.integerValue("GetIssueByIdResponse.Data.TemplateId"));
		data.setTrackerIds(_ctx.stringValue("GetIssueByIdResponse.Data.TrackerIds"));
		data.setTrackers(_ctx.stringValue("GetIssueByIdResponse.Data.Trackers"));
		data.setUpdateStatusAt(_ctx.longValue("GetIssueByIdResponse.Data.UpdateStatusAt"));
		data.setUpdatedAt(_ctx.longValue("GetIssueByIdResponse.Data.UpdatedAt"));
		data.setUser(_ctx.stringValue("GetIssueByIdResponse.Data.User"));
		data.setUserId(_ctx.integerValue("GetIssueByIdResponse.Data.UserId"));
		data.setUserStaffId(_ctx.stringValue("GetIssueByIdResponse.Data.UserStaffId"));
		data.setVerifier(_ctx.stringValue("GetIssueByIdResponse.Data.Verifier"));
		data.setVerifierId(_ctx.integerValue("GetIssueByIdResponse.Data.VerifierId"));
		data.setVerifierStaffId(_ctx.stringValue("GetIssueByIdResponse.Data.VerifierStaffId"));
		data.setVersionIds(_ctx.stringValue("GetIssueByIdResponse.Data.VersionIds"));
		data.setVersionList(_ctx.stringValue("GetIssueByIdResponse.Data.VersionList"));
		data.setWatched(_ctx.booleanValue("GetIssueByIdResponse.Data.Watched"));

		List<CfsListItem> cfsList = new ArrayList<CfsListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetIssueByIdResponse.Data.CfsList.Length"); i++) {
			CfsListItem cfsListItem = new CfsListItem();
			cfsListItem.setId(_ctx.stringValue("GetIssueByIdResponse.Data.CfsList["+ i +"].Id"));
			cfsListItem.setName(_ctx.stringValue("GetIssueByIdResponse.Data.CfsList["+ i +"].Name"));
			cfsListItem.setType(_ctx.stringValue("GetIssueByIdResponse.Data.CfsList["+ i +"].Type"));
			cfsListItem.setValue(_ctx.stringValue("GetIssueByIdResponse.Data.CfsList["+ i +"].Value"));

			cfsList.add(cfsListItem);
		}
		data.setCfsList(cfsList);
		getIssueByIdResponse.setData(data);
	 
	 	return getIssueByIdResponse;
	}
}