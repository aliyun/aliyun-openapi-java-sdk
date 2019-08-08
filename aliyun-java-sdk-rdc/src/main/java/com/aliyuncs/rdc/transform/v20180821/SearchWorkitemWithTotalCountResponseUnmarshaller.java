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

import com.aliyuncs.rdc.model.v20180821.SearchWorkitemWithTotalCountResponse;
import com.aliyuncs.rdc.model.v20180821.SearchWorkitemWithTotalCountResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchWorkitemWithTotalCountResponseUnmarshaller {

	public static SearchWorkitemWithTotalCountResponse unmarshall(SearchWorkitemWithTotalCountResponse searchWorkitemWithTotalCountResponse, UnmarshallerContext _ctx) {
		
		searchWorkitemWithTotalCountResponse.setRequestId(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.RequestId"));
		searchWorkitemWithTotalCountResponse.setCode(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.Code"));
		searchWorkitemWithTotalCountResponse.setSuccess(_ctx.booleanValue("SearchWorkitemWithTotalCountResponse.Success"));
		searchWorkitemWithTotalCountResponse.setTotalCount(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.TotalCount"));
		searchWorkitemWithTotalCountResponse.setTotalPages(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.TotalPages"));
		searchWorkitemWithTotalCountResponse.setToPage(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.ToPage"));
		searchWorkitemWithTotalCountResponse.setPageSize(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.PageSize"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchWorkitemWithTotalCountResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSourceId(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].SourceId"));
			dataItem.setTrackers(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].Trackers"));
			dataItem.setClosedDuration(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].ClosedDuration"));
			dataItem.setSendWangwang(_ctx.booleanValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].SendWangwang"));
			dataItem.setVerifierId(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].VerifierId"));
			dataItem.setIssueRelations(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].IssueRelations"));
			dataItem.setModuleUpdated(_ctx.booleanValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].ModuleUpdated"));
			dataItem.setSeriousLevel(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].SeriousLevel"));
			dataItem.setSubject(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].Subject"));
			dataItem.setAttachmented(_ctx.booleanValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].Attachmented"));
			dataItem.setSource(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].Source"));
			dataItem.setAkPaths(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].AkPaths"));
			dataItem.setTemplateId(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].TemplateId"));
			dataItem.setPriorityId(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].PriorityId"));
			dataItem.setCreatedAt(_ctx.longValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].CreatedAt"));
			dataItem.setTestsuiteId(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].TestsuiteId"));
			dataItem.setSolution(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].Solution"));
			dataItem.setStatusStage(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].StatusStage"));
			dataItem.setRespondDuration(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].RespondDuration"));
			dataItem.setWatcherIdList(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].WatcherIdList"));
			dataItem.setTrackerIds(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].TrackerIds"));
			dataItem.setSeriousLevelId(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].SeriousLevelId"));
			dataItem.setVersionList(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].VersionList"));
			dataItem.setId(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].Id"));
			dataItem.setVerifierStaffId(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].VerifierStaffId"));
			dataItem.setUpdatedAt(_ctx.longValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].UpdatedAt"));
			dataItem.setRelatedAKProjectGuids(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].RelatedAKProjectGuids"));
			dataItem.setScopeUserIds(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].ScopeUserIds"));
			dataItem.setPriority(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].Priority"));
			dataItem.setRelatedAKProjectIds(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].RelatedAKProjectIds"));
			dataItem.setCommitDate(_ctx.longValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].CommitDate"));
			dataItem.setDevDuration(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].DevDuration"));
			dataItem.setFixedDuration(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].FixedDuration"));
			dataItem.setBlackListNotice(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].BlackListNotice"));
			dataItem.setSprintId(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].SprintId"));
			dataItem.setVersionId(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].VersionId"));
			dataItem.setWatched(_ctx.booleanValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].Watched"));
			dataItem.setIdPath(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].IdPath"));
			dataItem.setModuleList(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].ModuleList"));
			dataItem.setStatusId(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].StatusId"));
			dataItem.setAssignedToIdList(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].AssignedToIdList"));
			dataItem.setUserStaffId(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].UserStaffId"));
			dataItem.setAttachmentIds(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].AttachmentIds"));
			dataItem.setRecordChangeLog(_ctx.booleanValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].RecordChangeLog"));
			dataItem.setRegion(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].Region"));
			dataItem.setProjectId(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].ProjectId"));
			dataItem.setSkipCollab(_ctx.booleanValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].SkipCollab"));
			dataItem.setTagIdList(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].TagIdList"));
			dataItem.setStatus(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].Status"));
			dataItem.setAssignedToId(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].AssignedToId"));
			dataItem.setCommentList(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].CommentList"));
			dataItem.setVersionIds(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].VersionIds"));
			dataItem.setStamp(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].Stamp"));
			dataItem.setAkVersionIds(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].AkVersionIds"));
			dataItem.setProjectIds(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].ProjectIds"));
			dataItem.setChangeLogList(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].ChangeLogList"));
			dataItem.setAssignedTo(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].AssignedTo"));
			dataItem.setIgnoreIntegrate(_ctx.booleanValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].IgnoreIntegrate"));
			dataItem.setModuleIds(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].ModuleIds"));
			dataItem.setIssueTypeId(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].IssueTypeId"));
			dataItem.setAttachmentList(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].AttachmentList"));
			dataItem.setLogicalStatus(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].LogicalStatus"));
			dataItem.setScope(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].Scope"));
			dataItem.setAssignedToIds(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].AssignedToIds"));
			dataItem.setAssignedToStaffId(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].AssignedToStaffId"));
			dataItem.setUserId(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].UserId"));
			dataItem.setLinePath(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].LinePath"));
			dataItem.setParentId(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].ParentId"));
			dataItem.setFixedUserId(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].FixedUserId"));
			dataItem.setIgnoreCheck(_ctx.booleanValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].IgnoreCheck"));
			dataItem.setVerifier(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].Verifier"));
			dataItem.setAkProjectId(_ctx.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].AkProjectId"));
			dataItem.setRelatedUserIds(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].RelatedUserIds"));
			dataItem.setUser(_ctx.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].User"));

			data.add(dataItem);
		}
		searchWorkitemWithTotalCountResponse.setData(data);
	 
	 	return searchWorkitemWithTotalCountResponse;
	}
}