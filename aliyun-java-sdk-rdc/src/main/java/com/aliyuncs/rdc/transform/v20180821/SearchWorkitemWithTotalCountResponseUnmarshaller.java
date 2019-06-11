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

	public static SearchWorkitemWithTotalCountResponse unmarshall(SearchWorkitemWithTotalCountResponse searchWorkitemWithTotalCountResponse, UnmarshallerContext context) {
		
		searchWorkitemWithTotalCountResponse.setRequestId(context.stringValue("SearchWorkitemWithTotalCountResponse.RequestId"));
		searchWorkitemWithTotalCountResponse.setCode(context.integerValue("SearchWorkitemWithTotalCountResponse.Code"));
		searchWorkitemWithTotalCountResponse.setSuccess(context.booleanValue("SearchWorkitemWithTotalCountResponse.Success"));
		searchWorkitemWithTotalCountResponse.setTotalCount(context.integerValue("SearchWorkitemWithTotalCountResponse.TotalCount"));
		searchWorkitemWithTotalCountResponse.setTotalPages(context.integerValue("SearchWorkitemWithTotalCountResponse.TotalPages"));
		searchWorkitemWithTotalCountResponse.setToPage(context.integerValue("SearchWorkitemWithTotalCountResponse.ToPage"));
		searchWorkitemWithTotalCountResponse.setPageSize(context.integerValue("SearchWorkitemWithTotalCountResponse.PageSize"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < context.lengthValue("SearchWorkitemWithTotalCountResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSourceId(context.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].SourceId"));
			dataItem.setTrackers(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].Trackers"));
			dataItem.setClosedDuration(context.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].ClosedDuration"));
			dataItem.setSendWangwang(context.booleanValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].SendWangwang"));
			dataItem.setVerifierId(context.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].VerifierId"));
			dataItem.setIssueRelations(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].IssueRelations"));
			dataItem.setModuleUpdated(context.booleanValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].ModuleUpdated"));
			dataItem.setSeriousLevel(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].SeriousLevel"));
			dataItem.setSubject(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].Subject"));
			dataItem.setAttachmented(context.booleanValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].Attachmented"));
			dataItem.setSource(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].Source"));
			dataItem.setAkPaths(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].AkPaths"));
			dataItem.setTemplateId(context.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].TemplateId"));
			dataItem.setPriorityId(context.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].PriorityId"));
			dataItem.setCreatedAt(context.longValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].CreatedAt"));
			dataItem.setTestsuiteId(context.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].TestsuiteId"));
			dataItem.setSolution(context.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].Solution"));
			dataItem.setStatusStage(context.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].StatusStage"));
			dataItem.setRespondDuration(context.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].RespondDuration"));
			dataItem.setWatcherIdList(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].WatcherIdList"));
			dataItem.setTrackerIds(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].TrackerIds"));
			dataItem.setSeriousLevelId(context.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].SeriousLevelId"));
			dataItem.setVersionList(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].VersionList"));
			dataItem.setId(context.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].Id"));
			dataItem.setVerifierStaffId(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].VerifierStaffId"));
			dataItem.setUpdatedAt(context.longValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].UpdatedAt"));
			dataItem.setRelatedAKProjectGuids(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].RelatedAKProjectGuids"));
			dataItem.setScopeUserIds(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].ScopeUserIds"));
			dataItem.setPriority(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].Priority"));
			dataItem.setRelatedAKProjectIds(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].RelatedAKProjectIds"));
			dataItem.setCommitDate(context.longValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].CommitDate"));
			dataItem.setDevDuration(context.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].DevDuration"));
			dataItem.setFixedDuration(context.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].FixedDuration"));
			dataItem.setBlackListNotice(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].BlackListNotice"));
			dataItem.setSprintId(context.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].SprintId"));
			dataItem.setVersionId(context.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].VersionId"));
			dataItem.setWatched(context.booleanValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].Watched"));
			dataItem.setIdPath(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].IdPath"));
			dataItem.setModuleList(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].ModuleList"));
			dataItem.setStatusId(context.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].StatusId"));
			dataItem.setAssignedToIdList(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].AssignedToIdList"));
			dataItem.setUserStaffId(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].UserStaffId"));
			dataItem.setAttachmentIds(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].AttachmentIds"));
			dataItem.setRecordChangeLog(context.booleanValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].RecordChangeLog"));
			dataItem.setRegion(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].Region"));
			dataItem.setProjectId(context.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].ProjectId"));
			dataItem.setSkipCollab(context.booleanValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].SkipCollab"));
			dataItem.setTagIdList(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].TagIdList"));
			dataItem.setStatus(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].Status"));
			dataItem.setAssignedToId(context.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].AssignedToId"));
			dataItem.setCommentList(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].CommentList"));
			dataItem.setVersionIds(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].VersionIds"));
			dataItem.setStamp(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].Stamp"));
			dataItem.setAkVersionIds(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].AkVersionIds"));
			dataItem.setProjectIds(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].ProjectIds"));
			dataItem.setChangeLogList(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].ChangeLogList"));
			dataItem.setAssignedTo(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].AssignedTo"));
			dataItem.setIgnoreIntegrate(context.booleanValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].IgnoreIntegrate"));
			dataItem.setModuleIds(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].ModuleIds"));
			dataItem.setIssueTypeId(context.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].IssueTypeId"));
			dataItem.setAttachmentList(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].AttachmentList"));
			dataItem.setLogicalStatus(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].LogicalStatus"));
			dataItem.setScope(context.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].Scope"));
			dataItem.setAssignedToIds(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].AssignedToIds"));
			dataItem.setAssignedToStaffId(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].AssignedToStaffId"));
			dataItem.setUserId(context.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].UserId"));
			dataItem.setLinePath(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].LinePath"));
			dataItem.setParentId(context.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].ParentId"));
			dataItem.setFixedUserId(context.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].FixedUserId"));
			dataItem.setIgnoreCheck(context.booleanValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].IgnoreCheck"));
			dataItem.setVerifier(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].Verifier"));
			dataItem.setAkProjectId(context.integerValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].AkProjectId"));
			dataItem.setRelatedUserIds(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].RelatedUserIds"));
			dataItem.setUser(context.stringValue("SearchWorkitemWithTotalCountResponse.Data["+ i +"].User"));

			data.add(dataItem);
		}
		searchWorkitemWithTotalCountResponse.setData(data);
	 
	 	return searchWorkitemWithTotalCountResponse;
	}
}