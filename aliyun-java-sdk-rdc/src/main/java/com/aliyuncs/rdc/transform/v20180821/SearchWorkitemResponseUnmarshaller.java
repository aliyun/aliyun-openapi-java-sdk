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

	public static SearchWorkitemResponse unmarshall(SearchWorkitemResponse searchWorkitemResponse, UnmarshallerContext context) {
		
		searchWorkitemResponse.setRequestId(context.stringValue("SearchWorkitemResponse.RequestId"));
		searchWorkitemResponse.setCode(context.integerValue("SearchWorkitemResponse.Code"));
		searchWorkitemResponse.setSuccess(context.booleanValue("SearchWorkitemResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < context.lengthValue("SearchWorkitemResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSourceId(context.integerValue("SearchWorkitemResponse.Data["+ i +"].SourceId"));
			dataItem.setTrackers(context.stringValue("SearchWorkitemResponse.Data["+ i +"].Trackers"));
			dataItem.setClosedDuration(context.integerValue("SearchWorkitemResponse.Data["+ i +"].ClosedDuration"));
			dataItem.setSendWangwang(context.booleanValue("SearchWorkitemResponse.Data["+ i +"].SendWangwang"));
			dataItem.setVerifierId(context.integerValue("SearchWorkitemResponse.Data["+ i +"].VerifierId"));
			dataItem.setIssueRelations(context.stringValue("SearchWorkitemResponse.Data["+ i +"].IssueRelations"));
			dataItem.setModuleUpdated(context.booleanValue("SearchWorkitemResponse.Data["+ i +"].ModuleUpdated"));
			dataItem.setSeriousLevel(context.stringValue("SearchWorkitemResponse.Data["+ i +"].SeriousLevel"));
			dataItem.setSubject(context.stringValue("SearchWorkitemResponse.Data["+ i +"].Subject"));
			dataItem.setAttachmented(context.booleanValue("SearchWorkitemResponse.Data["+ i +"].Attachmented"));
			dataItem.setSource(context.stringValue("SearchWorkitemResponse.Data["+ i +"].Source"));
			dataItem.setAkPaths(context.stringValue("SearchWorkitemResponse.Data["+ i +"].AkPaths"));
			dataItem.setTemplateId(context.integerValue("SearchWorkitemResponse.Data["+ i +"].TemplateId"));
			dataItem.setPriorityId(context.integerValue("SearchWorkitemResponse.Data["+ i +"].PriorityId"));
			dataItem.setCreatedAt(context.longValue("SearchWorkitemResponse.Data["+ i +"].CreatedAt"));
			dataItem.setTestsuiteId(context.integerValue("SearchWorkitemResponse.Data["+ i +"].TestsuiteId"));
			dataItem.setSolution(context.integerValue("SearchWorkitemResponse.Data["+ i +"].Solution"));
			dataItem.setStatusStage(context.integerValue("SearchWorkitemResponse.Data["+ i +"].StatusStage"));
			dataItem.setRespondDuration(context.integerValue("SearchWorkitemResponse.Data["+ i +"].RespondDuration"));
			dataItem.setWatcherIdList(context.stringValue("SearchWorkitemResponse.Data["+ i +"].WatcherIdList"));
			dataItem.setTrackerIds(context.stringValue("SearchWorkitemResponse.Data["+ i +"].TrackerIds"));
			dataItem.setSeriousLevelId(context.integerValue("SearchWorkitemResponse.Data["+ i +"].SeriousLevelId"));
			dataItem.setVersionList(context.stringValue("SearchWorkitemResponse.Data["+ i +"].VersionList"));
			dataItem.setId(context.integerValue("SearchWorkitemResponse.Data["+ i +"].Id"));
			dataItem.setVerifierStaffId(context.stringValue("SearchWorkitemResponse.Data["+ i +"].VerifierStaffId"));
			dataItem.setUpdatedAt(context.longValue("SearchWorkitemResponse.Data["+ i +"].UpdatedAt"));
			dataItem.setRelatedAKProjectGuids(context.stringValue("SearchWorkitemResponse.Data["+ i +"].RelatedAKProjectGuids"));
			dataItem.setScopeUserIds(context.stringValue("SearchWorkitemResponse.Data["+ i +"].ScopeUserIds"));
			dataItem.setPriority(context.stringValue("SearchWorkitemResponse.Data["+ i +"].Priority"));
			dataItem.setRelatedAKProjectIds(context.stringValue("SearchWorkitemResponse.Data["+ i +"].RelatedAKProjectIds"));
			dataItem.setCommitDate(context.longValue("SearchWorkitemResponse.Data["+ i +"].CommitDate"));
			dataItem.setDevDuration(context.integerValue("SearchWorkitemResponse.Data["+ i +"].DevDuration"));
			dataItem.setFixedDuration(context.integerValue("SearchWorkitemResponse.Data["+ i +"].FixedDuration"));
			dataItem.setBlackListNotice(context.stringValue("SearchWorkitemResponse.Data["+ i +"].BlackListNotice"));
			dataItem.setSprintId(context.integerValue("SearchWorkitemResponse.Data["+ i +"].SprintId"));
			dataItem.setVersionId(context.integerValue("SearchWorkitemResponse.Data["+ i +"].VersionId"));
			dataItem.setWatched(context.booleanValue("SearchWorkitemResponse.Data["+ i +"].Watched"));
			dataItem.setIdPath(context.stringValue("SearchWorkitemResponse.Data["+ i +"].IdPath"));
			dataItem.setModuleList(context.stringValue("SearchWorkitemResponse.Data["+ i +"].ModuleList"));
			dataItem.setStatusId(context.integerValue("SearchWorkitemResponse.Data["+ i +"].StatusId"));
			dataItem.setAssignedToIdList(context.stringValue("SearchWorkitemResponse.Data["+ i +"].AssignedToIdList"));
			dataItem.setUserStaffId(context.stringValue("SearchWorkitemResponse.Data["+ i +"].UserStaffId"));
			dataItem.setAttachmentIds(context.stringValue("SearchWorkitemResponse.Data["+ i +"].AttachmentIds"));
			dataItem.setRecordChangeLog(context.booleanValue("SearchWorkitemResponse.Data["+ i +"].RecordChangeLog"));
			dataItem.setRegion(context.stringValue("SearchWorkitemResponse.Data["+ i +"].Region"));
			dataItem.setProjectId(context.integerValue("SearchWorkitemResponse.Data["+ i +"].ProjectId"));
			dataItem.setSkipCollab(context.booleanValue("SearchWorkitemResponse.Data["+ i +"].SkipCollab"));
			dataItem.setTagIdList(context.stringValue("SearchWorkitemResponse.Data["+ i +"].TagIdList"));
			dataItem.setStatus(context.stringValue("SearchWorkitemResponse.Data["+ i +"].Status"));
			dataItem.setAssignedToId(context.integerValue("SearchWorkitemResponse.Data["+ i +"].AssignedToId"));
			dataItem.setCommentList(context.stringValue("SearchWorkitemResponse.Data["+ i +"].CommentList"));
			dataItem.setVersionIds(context.stringValue("SearchWorkitemResponse.Data["+ i +"].VersionIds"));
			dataItem.setStamp(context.stringValue("SearchWorkitemResponse.Data["+ i +"].Stamp"));
			dataItem.setAkVersionIds(context.stringValue("SearchWorkitemResponse.Data["+ i +"].AkVersionIds"));
			dataItem.setProjectIds(context.stringValue("SearchWorkitemResponse.Data["+ i +"].ProjectIds"));
			dataItem.setChangeLogList(context.stringValue("SearchWorkitemResponse.Data["+ i +"].ChangeLogList"));
			dataItem.setAssignedTo(context.stringValue("SearchWorkitemResponse.Data["+ i +"].AssignedTo"));
			dataItem.setIgnoreIntegrate(context.booleanValue("SearchWorkitemResponse.Data["+ i +"].IgnoreIntegrate"));
			dataItem.setModuleIds(context.stringValue("SearchWorkitemResponse.Data["+ i +"].ModuleIds"));
			dataItem.setIssueTypeId(context.integerValue("SearchWorkitemResponse.Data["+ i +"].IssueTypeId"));
			dataItem.setAttachmentList(context.stringValue("SearchWorkitemResponse.Data["+ i +"].AttachmentList"));
			dataItem.setLogicalStatus(context.stringValue("SearchWorkitemResponse.Data["+ i +"].LogicalStatus"));
			dataItem.setScope(context.integerValue("SearchWorkitemResponse.Data["+ i +"].Scope"));
			dataItem.setAssignedToIds(context.stringValue("SearchWorkitemResponse.Data["+ i +"].AssignedToIds"));
			dataItem.setAssignedToStaffId(context.stringValue("SearchWorkitemResponse.Data["+ i +"].AssignedToStaffId"));
			dataItem.setUserId(context.integerValue("SearchWorkitemResponse.Data["+ i +"].UserId"));
			dataItem.setLinePath(context.stringValue("SearchWorkitemResponse.Data["+ i +"].LinePath"));
			dataItem.setParentId(context.integerValue("SearchWorkitemResponse.Data["+ i +"].ParentId"));
			dataItem.setFixedUserId(context.integerValue("SearchWorkitemResponse.Data["+ i +"].FixedUserId"));
			dataItem.setIgnoreCheck(context.booleanValue("SearchWorkitemResponse.Data["+ i +"].IgnoreCheck"));
			dataItem.setVerifier(context.stringValue("SearchWorkitemResponse.Data["+ i +"].Verifier"));
			dataItem.setAkProjectId(context.integerValue("SearchWorkitemResponse.Data["+ i +"].AkProjectId"));
			dataItem.setRelatedUserIds(context.stringValue("SearchWorkitemResponse.Data["+ i +"].RelatedUserIds"));
			dataItem.setUser(context.stringValue("SearchWorkitemResponse.Data["+ i +"].User"));

			data.add(dataItem);
		}
		searchWorkitemResponse.setData(data);
	 
	 	return searchWorkitemResponse;
	}
}