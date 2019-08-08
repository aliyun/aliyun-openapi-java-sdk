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

import com.aliyuncs.rdc.model.v20180821.SearchWorkitemResponse;
import com.aliyuncs.rdc.model.v20180821.SearchWorkitemResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchWorkitemResponseUnmarshaller {

	public static SearchWorkitemResponse unmarshall(SearchWorkitemResponse searchWorkitemResponse, UnmarshallerContext _ctx) {
		
		searchWorkitemResponse.setRequestId(_ctx.stringValue("SearchWorkitemResponse.RequestId"));
		searchWorkitemResponse.setCode(_ctx.integerValue("SearchWorkitemResponse.Code"));
		searchWorkitemResponse.setSuccess(_ctx.booleanValue("SearchWorkitemResponse.Success"));
		searchWorkitemResponse.setTotalCount(_ctx.integerValue("SearchWorkitemResponse.TotalCount"));
		searchWorkitemResponse.setTotalPages(_ctx.integerValue("SearchWorkitemResponse.TotalPages"));
		searchWorkitemResponse.setToPage(_ctx.integerValue("SearchWorkitemResponse.ToPage"));
		searchWorkitemResponse.setPageSize(_ctx.integerValue("SearchWorkitemResponse.PageSize"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchWorkitemResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSourceId(_ctx.integerValue("SearchWorkitemResponse.Data["+ i +"].SourceId"));
			dataItem.setTrackers(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].Trackers"));
			dataItem.setClosedDuration(_ctx.integerValue("SearchWorkitemResponse.Data["+ i +"].ClosedDuration"));
			dataItem.setSendWangwang(_ctx.booleanValue("SearchWorkitemResponse.Data["+ i +"].SendWangwang"));
			dataItem.setVerifierId(_ctx.integerValue("SearchWorkitemResponse.Data["+ i +"].VerifierId"));
			dataItem.setIssueRelations(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].IssueRelations"));
			dataItem.setModuleUpdated(_ctx.booleanValue("SearchWorkitemResponse.Data["+ i +"].ModuleUpdated"));
			dataItem.setSeriousLevel(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].SeriousLevel"));
			dataItem.setSubject(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].Subject"));
			dataItem.setAttachmented(_ctx.booleanValue("SearchWorkitemResponse.Data["+ i +"].Attachmented"));
			dataItem.setSource(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].Source"));
			dataItem.setAkPaths(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].AkPaths"));
			dataItem.setTemplateId(_ctx.integerValue("SearchWorkitemResponse.Data["+ i +"].TemplateId"));
			dataItem.setPriorityId(_ctx.integerValue("SearchWorkitemResponse.Data["+ i +"].PriorityId"));
			dataItem.setCreatedAt(_ctx.longValue("SearchWorkitemResponse.Data["+ i +"].CreatedAt"));
			dataItem.setTestsuiteId(_ctx.integerValue("SearchWorkitemResponse.Data["+ i +"].TestsuiteId"));
			dataItem.setSolution(_ctx.integerValue("SearchWorkitemResponse.Data["+ i +"].Solution"));
			dataItem.setStatusStage(_ctx.integerValue("SearchWorkitemResponse.Data["+ i +"].StatusStage"));
			dataItem.setRespondDuration(_ctx.integerValue("SearchWorkitemResponse.Data["+ i +"].RespondDuration"));
			dataItem.setWatcherIdList(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].WatcherIdList"));
			dataItem.setTrackerIds(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].TrackerIds"));
			dataItem.setSeriousLevelId(_ctx.integerValue("SearchWorkitemResponse.Data["+ i +"].SeriousLevelId"));
			dataItem.setVersionList(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].VersionList"));
			dataItem.setId(_ctx.integerValue("SearchWorkitemResponse.Data["+ i +"].Id"));
			dataItem.setVerifierStaffId(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].VerifierStaffId"));
			dataItem.setUpdatedAt(_ctx.longValue("SearchWorkitemResponse.Data["+ i +"].UpdatedAt"));
			dataItem.setRelatedAKProjectGuids(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].RelatedAKProjectGuids"));
			dataItem.setScopeUserIds(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].ScopeUserIds"));
			dataItem.setPriority(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].Priority"));
			dataItem.setRelatedAKProjectIds(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].RelatedAKProjectIds"));
			dataItem.setCommitDate(_ctx.longValue("SearchWorkitemResponse.Data["+ i +"].CommitDate"));
			dataItem.setDevDuration(_ctx.integerValue("SearchWorkitemResponse.Data["+ i +"].DevDuration"));
			dataItem.setFixedDuration(_ctx.integerValue("SearchWorkitemResponse.Data["+ i +"].FixedDuration"));
			dataItem.setBlackListNotice(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].BlackListNotice"));
			dataItem.setSprintId(_ctx.integerValue("SearchWorkitemResponse.Data["+ i +"].SprintId"));
			dataItem.setVersionId(_ctx.integerValue("SearchWorkitemResponse.Data["+ i +"].VersionId"));
			dataItem.setWatched(_ctx.booleanValue("SearchWorkitemResponse.Data["+ i +"].Watched"));
			dataItem.setIdPath(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].IdPath"));
			dataItem.setModuleList(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].ModuleList"));
			dataItem.setStatusId(_ctx.integerValue("SearchWorkitemResponse.Data["+ i +"].StatusId"));
			dataItem.setAssignedToIdList(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].AssignedToIdList"));
			dataItem.setUserStaffId(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].UserStaffId"));
			dataItem.setAttachmentIds(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].AttachmentIds"));
			dataItem.setRecordChangeLog(_ctx.booleanValue("SearchWorkitemResponse.Data["+ i +"].RecordChangeLog"));
			dataItem.setRegion(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].Region"));
			dataItem.setProjectId(_ctx.integerValue("SearchWorkitemResponse.Data["+ i +"].ProjectId"));
			dataItem.setSkipCollab(_ctx.booleanValue("SearchWorkitemResponse.Data["+ i +"].SkipCollab"));
			dataItem.setTagIdList(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].TagIdList"));
			dataItem.setStatus(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].Status"));
			dataItem.setAssignedToId(_ctx.integerValue("SearchWorkitemResponse.Data["+ i +"].AssignedToId"));
			dataItem.setCommentList(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].CommentList"));
			dataItem.setVersionIds(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].VersionIds"));
			dataItem.setStamp(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].Stamp"));
			dataItem.setAkVersionIds(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].AkVersionIds"));
			dataItem.setProjectIds(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].ProjectIds"));
			dataItem.setChangeLogList(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].ChangeLogList"));
			dataItem.setAssignedTo(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].AssignedTo"));
			dataItem.setIgnoreIntegrate(_ctx.booleanValue("SearchWorkitemResponse.Data["+ i +"].IgnoreIntegrate"));
			dataItem.setModuleIds(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].ModuleIds"));
			dataItem.setIssueTypeId(_ctx.integerValue("SearchWorkitemResponse.Data["+ i +"].IssueTypeId"));
			dataItem.setAttachmentList(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].AttachmentList"));
			dataItem.setLogicalStatus(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].LogicalStatus"));
			dataItem.setScope(_ctx.integerValue("SearchWorkitemResponse.Data["+ i +"].Scope"));
			dataItem.setAssignedToIds(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].AssignedToIds"));
			dataItem.setAssignedToStaffId(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].AssignedToStaffId"));
			dataItem.setUserId(_ctx.integerValue("SearchWorkitemResponse.Data["+ i +"].UserId"));
			dataItem.setLinePath(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].LinePath"));
			dataItem.setParentId(_ctx.integerValue("SearchWorkitemResponse.Data["+ i +"].ParentId"));
			dataItem.setFixedUserId(_ctx.integerValue("SearchWorkitemResponse.Data["+ i +"].FixedUserId"));
			dataItem.setIgnoreCheck(_ctx.booleanValue("SearchWorkitemResponse.Data["+ i +"].IgnoreCheck"));
			dataItem.setVerifier(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].Verifier"));
			dataItem.setAkProjectId(_ctx.integerValue("SearchWorkitemResponse.Data["+ i +"].AkProjectId"));
			dataItem.setRelatedUserIds(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].RelatedUserIds"));
			dataItem.setUser(_ctx.stringValue("SearchWorkitemResponse.Data["+ i +"].User"));

			data.add(dataItem);
		}
		searchWorkitemResponse.setData(data);
	 
	 	return searchWorkitemResponse;
	}
}