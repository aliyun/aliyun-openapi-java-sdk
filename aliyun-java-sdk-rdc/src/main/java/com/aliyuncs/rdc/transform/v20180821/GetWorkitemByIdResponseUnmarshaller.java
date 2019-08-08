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

	public static GetWorkitemByIdResponse unmarshall(GetWorkitemByIdResponse getWorkitemByIdResponse, UnmarshallerContext _ctx) {
		
		getWorkitemByIdResponse.setRequestId(_ctx.stringValue("GetWorkitemByIdResponse.RequestId"));
		getWorkitemByIdResponse.setCode(_ctx.integerValue("GetWorkitemByIdResponse.Code"));
		getWorkitemByIdResponse.setSuccess(_ctx.stringValue("GetWorkitemByIdResponse.Success"));

		Data data = new Data();
		data.setAkProjectId(_ctx.integerValue("GetWorkitemByIdResponse.Data.AkProjectId"));
		data.setAssignedTo(_ctx.stringValue("GetWorkitemByIdResponse.Data.AssignedTo"));
		data.setAssignedToId(_ctx.integerValue("GetWorkitemByIdResponse.Data.AssignedToId"));
		data.setAssignedToIdList(_ctx.stringValue("GetWorkitemByIdResponse.Data.AssignedToIdList"));
		data.setAssignedToIds(_ctx.stringValue("GetWorkitemByIdResponse.Data.AssignedToIds"));
		data.setAssignedToMaps(_ctx.stringValue("GetWorkitemByIdResponse.Data.AssignedToMaps"));
		data.setAssignedToStaffId(_ctx.stringValue("GetWorkitemByIdResponse.Data.AssignedToStaffId"));
		data.setAttachmentIds(_ctx.stringValue("GetWorkitemByIdResponse.Data.AttachmentIds"));
		data.setAttachmentList(_ctx.stringValue("GetWorkitemByIdResponse.Data.AttachmentList"));
		data.setAttachmented(_ctx.booleanValue("GetWorkitemByIdResponse.Data.Attachmented"));
		data.setBlackListNotice(_ctx.stringValue("GetWorkitemByIdResponse.Data.BlackListNotice"));
		data.setChangeLogList(_ctx.stringValue("GetWorkitemByIdResponse.Data.ChangeLogList"));
		data.setCommentList(_ctx.stringValue("GetWorkitemByIdResponse.Data.CommentList"));
		data.setCommitDate(_ctx.longValue("GetWorkitemByIdResponse.Data.CommitDate"));
		data.setCreatedAt(_ctx.longValue("GetWorkitemByIdResponse.Data.CreatedAt"));
		data.setDescription(_ctx.stringValue("GetWorkitemByIdResponse.Data.Description"));
		data.setGuid(_ctx.stringValue("GetWorkitemByIdResponse.Data.Guid"));
		data.setId(_ctx.integerValue("GetWorkitemByIdResponse.Data.Id"));
		data.setIdPath(_ctx.stringValue("GetWorkitemByIdResponse.Data.IdPath"));
		data.setIgnoreCheck(_ctx.booleanValue("GetWorkitemByIdResponse.Data.IgnoreCheck"));
		data.setIgnoreIntegrate(_ctx.booleanValue("GetWorkitemByIdResponse.Data.IgnoreIntegrate"));
		data.setIssueTypeId(_ctx.integerValue("GetWorkitemByIdResponse.Data.IssueTypeId"));
		data.setLogicalStatus(_ctx.stringValue("GetWorkitemByIdResponse.Data.LogicalStatus"));
		data.setModuleIds(_ctx.stringValue("GetWorkitemByIdResponse.Data.ModuleIds"));
		data.setModuleList(_ctx.stringValue("GetWorkitemByIdResponse.Data.ModuleList"));
		data.setModuleUpdated(_ctx.booleanValue("GetWorkitemByIdResponse.Data.ModuleUpdated"));
		data.setParentId(_ctx.integerValue("GetWorkitemByIdResponse.Data.ParentId"));
		data.setPriority(_ctx.stringValue("GetWorkitemByIdResponse.Data.Priority"));
		data.setPriorityId(_ctx.integerValue("GetWorkitemByIdResponse.Data.PriorityId"));
		data.setProjectIds(_ctx.stringValue("GetWorkitemByIdResponse.Data.ProjectIds"));
		data.setRecordChangeLog(_ctx.booleanValue("GetWorkitemByIdResponse.Data.RecordChangeLog"));
		data.setRegionId(_ctx.integerValue("GetWorkitemByIdResponse.Data.RegionId"));
		data.setRelatedAKProjectGuids(_ctx.stringValue("GetWorkitemByIdResponse.Data.RelatedAKProjectGuids"));
		data.setRelatedAKProjectIds(_ctx.stringValue("GetWorkitemByIdResponse.Data.RelatedAKProjectIds"));
		data.setRelatedUserIds(_ctx.stringValue("GetWorkitemByIdResponse.Data.RelatedUserIds"));
		data.setSendWangwang(_ctx.booleanValue("GetWorkitemByIdResponse.Data.SendWangwang"));
		data.setSeriousLevel(_ctx.stringValue("GetWorkitemByIdResponse.Data.SeriousLevel"));
		data.setSeriousLevelId(_ctx.integerValue("GetWorkitemByIdResponse.Data.SeriousLevelId"));
		data.setSkipCollab(_ctx.booleanValue("GetWorkitemByIdResponse.Data.SkipCollab"));
		data.setStamp(_ctx.stringValue("GetWorkitemByIdResponse.Data.Stamp"));
		data.setStatus(_ctx.stringValue("GetWorkitemByIdResponse.Data.Status"));
		data.setStatusId(_ctx.integerValue("GetWorkitemByIdResponse.Data.StatusId"));
		data.setStatusStage(_ctx.integerValue("GetWorkitemByIdResponse.Data.StatusStage"));
		data.setSubject(_ctx.stringValue("GetWorkitemByIdResponse.Data.Subject"));
		data.setTagIdList(_ctx.stringValue("GetWorkitemByIdResponse.Data.TagIdList"));
		data.setTemplateId(_ctx.integerValue("GetWorkitemByIdResponse.Data.TemplateId"));
		data.setTrackerIds(_ctx.stringValue("GetWorkitemByIdResponse.Data.TrackerIds"));
		data.setTrackers(_ctx.stringValue("GetWorkitemByIdResponse.Data.Trackers"));
		data.setUpdateStatusAt(_ctx.longValue("GetWorkitemByIdResponse.Data.UpdateStatusAt"));
		data.setUpdatedAt(_ctx.longValue("GetWorkitemByIdResponse.Data.UpdatedAt"));
		data.setUser(_ctx.stringValue("GetWorkitemByIdResponse.Data.User"));
		data.setUserId(_ctx.integerValue("GetWorkitemByIdResponse.Data.UserId"));
		data.setUserStaffId(_ctx.stringValue("GetWorkitemByIdResponse.Data.UserStaffId"));
		data.setVerifier(_ctx.stringValue("GetWorkitemByIdResponse.Data.Verifier"));
		data.setVerifierId(_ctx.integerValue("GetWorkitemByIdResponse.Data.VerifierId"));
		data.setVerifierStaffId(_ctx.stringValue("GetWorkitemByIdResponse.Data.VerifierStaffId"));
		data.setVersionIds(_ctx.stringValue("GetWorkitemByIdResponse.Data.VersionIds"));
		data.setVersionList(_ctx.stringValue("GetWorkitemByIdResponse.Data.VersionList"));
		data.setWatched(_ctx.booleanValue("GetWorkitemByIdResponse.Data.Watched"));

		List<CfsListItem> cfsList = new ArrayList<CfsListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetWorkitemByIdResponse.Data.CfsList.Length"); i++) {
			CfsListItem cfsListItem = new CfsListItem();
			cfsListItem.setId(_ctx.stringValue("GetWorkitemByIdResponse.Data.CfsList["+ i +"].Id"));
			cfsListItem.setName(_ctx.stringValue("GetWorkitemByIdResponse.Data.CfsList["+ i +"].Name"));
			cfsListItem.setType(_ctx.stringValue("GetWorkitemByIdResponse.Data.CfsList["+ i +"].Type"));
			cfsListItem.setValue(_ctx.stringValue("GetWorkitemByIdResponse.Data.CfsList["+ i +"].Value"));

			cfsList.add(cfsListItem);
		}
		data.setCfsList(cfsList);
		getWorkitemByIdResponse.setData(data);
	 
	 	return getWorkitemByIdResponse;
	}
}