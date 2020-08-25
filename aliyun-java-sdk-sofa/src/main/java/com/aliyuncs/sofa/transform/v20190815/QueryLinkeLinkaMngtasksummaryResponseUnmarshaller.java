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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaMngtasksummaryResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaMngtasksummaryResponse.SubCoveragesItem;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaMngtasksummaryResponse.Summary;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinkaMngtasksummaryResponseUnmarshaller {

	public static QueryLinkeLinkaMngtasksummaryResponse unmarshall(QueryLinkeLinkaMngtasksummaryResponse queryLinkeLinkaMngtasksummaryResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinkaMngtasksummaryResponse.setRequestId(_ctx.stringValue("QueryLinkeLinkaMngtasksummaryResponse.RequestId"));
		queryLinkeLinkaMngtasksummaryResponse.setResultCode(_ctx.stringValue("QueryLinkeLinkaMngtasksummaryResponse.ResultCode"));
		queryLinkeLinkaMngtasksummaryResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinkaMngtasksummaryResponse.ResultMessage"));
		queryLinkeLinkaMngtasksummaryResponse.setClassesFileId(_ctx.stringValue("QueryLinkeLinkaMngtasksummaryResponse.ClassesFileId"));
		queryLinkeLinkaMngtasksummaryResponse.setCoverageFileId(_ctx.stringValue("QueryLinkeLinkaMngtasksummaryResponse.CoverageFileId"));
		queryLinkeLinkaMngtasksummaryResponse.setCreatedAt(_ctx.longValue("QueryLinkeLinkaMngtasksummaryResponse.CreatedAt"));
		queryLinkeLinkaMngtasksummaryResponse.setDeleted(_ctx.booleanValue("QueryLinkeLinkaMngtasksummaryResponse.Deleted"));
		queryLinkeLinkaMngtasksummaryResponse.setGroup(_ctx.stringValue("QueryLinkeLinkaMngtasksummaryResponse.Group"));
		queryLinkeLinkaMngtasksummaryResponse.setId(_ctx.stringValue("QueryLinkeLinkaMngtasksummaryResponse.Id"));
		queryLinkeLinkaMngtasksummaryResponse.setOnlySummary(_ctx.booleanValue("QueryLinkeLinkaMngtasksummaryResponse.OnlySummary"));
		queryLinkeLinkaMngtasksummaryResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinkaMngtasksummaryResponse.ResponseStatusCode"));
		queryLinkeLinkaMngtasksummaryResponse.setTaskId(_ctx.stringValue("QueryLinkeLinkaMngtasksummaryResponse.TaskId"));
		queryLinkeLinkaMngtasksummaryResponse.setUpdatedAt(_ctx.longValue("QueryLinkeLinkaMngtasksummaryResponse.UpdatedAt"));

		Summary summary = new Summary();
		summary.setBranchCovered(_ctx.longValue("QueryLinkeLinkaMngtasksummaryResponse.Summary.BranchCovered"));
		summary.setBranchTotal(_ctx.longValue("QueryLinkeLinkaMngtasksummaryResponse.Summary.BranchTotal"));
		summary.setClassCovered(_ctx.longValue("QueryLinkeLinkaMngtasksummaryResponse.Summary.ClassCovered"));
		summary.setClassTotal(_ctx.longValue("QueryLinkeLinkaMngtasksummaryResponse.Summary.ClassTotal"));
		summary.setCoverageId(_ctx.stringValue("QueryLinkeLinkaMngtasksummaryResponse.Summary.CoverageId"));
		summary.setCxtyCovered(_ctx.longValue("QueryLinkeLinkaMngtasksummaryResponse.Summary.CxtyCovered"));
		summary.setCxtyTotal(_ctx.longValue("QueryLinkeLinkaMngtasksummaryResponse.Summary.CxtyTotal"));
		summary.setFullname(_ctx.stringValue("QueryLinkeLinkaMngtasksummaryResponse.Summary.Fullname"));
		summary.setId(_ctx.stringValue("QueryLinkeLinkaMngtasksummaryResponse.Summary.Id"));
		summary.setInstrCovered(_ctx.longValue("QueryLinkeLinkaMngtasksummaryResponse.Summary.InstrCovered"));
		summary.setInstrTotal(_ctx.longValue("QueryLinkeLinkaMngtasksummaryResponse.Summary.InstrTotal"));
		summary.setLineCovered(_ctx.longValue("QueryLinkeLinkaMngtasksummaryResponse.Summary.LineCovered"));
		summary.setLineTotal(_ctx.longValue("QueryLinkeLinkaMngtasksummaryResponse.Summary.LineTotal"));
		summary.setMethodCovered(_ctx.longValue("QueryLinkeLinkaMngtasksummaryResponse.Summary.MethodCovered"));
		summary.setMethodTotal(_ctx.longValue("QueryLinkeLinkaMngtasksummaryResponse.Summary.MethodTotal"));
		summary.setName(_ctx.stringValue("QueryLinkeLinkaMngtasksummaryResponse.Summary.Name"));
		summary.setOrgId(_ctx.stringValue("QueryLinkeLinkaMngtasksummaryResponse.Summary.OrgId"));
		summary.setParentId(_ctx.stringValue("QueryLinkeLinkaMngtasksummaryResponse.Summary.ParentId"));
		summary.setType(_ctx.stringValue("QueryLinkeLinkaMngtasksummaryResponse.Summary.Type"));
		queryLinkeLinkaMngtasksummaryResponse.setSummary(summary);

		List<SubCoveragesItem> subCoverages = new ArrayList<SubCoveragesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinkaMngtasksummaryResponse.SubCoverages.Length"); i++) {
			SubCoveragesItem subCoveragesItem = new SubCoveragesItem();
			subCoveragesItem.setClassesFileId(_ctx.stringValue("QueryLinkeLinkaMngtasksummaryResponse.SubCoverages["+ i +"].ClassesFileId"));
			subCoveragesItem.setCoverageFileId(_ctx.stringValue("QueryLinkeLinkaMngtasksummaryResponse.SubCoverages["+ i +"].CoverageFileId"));
			subCoveragesItem.setCreatedAt(_ctx.longValue("QueryLinkeLinkaMngtasksummaryResponse.SubCoverages["+ i +"].CreatedAt"));
			subCoveragesItem.setDeleted(_ctx.booleanValue("QueryLinkeLinkaMngtasksummaryResponse.SubCoverages["+ i +"].Deleted"));
			subCoveragesItem.setGroup(_ctx.stringValue("QueryLinkeLinkaMngtasksummaryResponse.SubCoverages["+ i +"].Group"));
			subCoveragesItem.setId(_ctx.stringValue("QueryLinkeLinkaMngtasksummaryResponse.SubCoverages["+ i +"].Id"));
			subCoveragesItem.setOnlySummary(_ctx.booleanValue("QueryLinkeLinkaMngtasksummaryResponse.SubCoverages["+ i +"].OnlySummary"));
			subCoveragesItem.setReset(_ctx.booleanValue("QueryLinkeLinkaMngtasksummaryResponse.SubCoverages["+ i +"].Reset"));
			subCoveragesItem.setSource(_ctx.stringValue("QueryLinkeLinkaMngtasksummaryResponse.SubCoverages["+ i +"].Source"));
			subCoveragesItem.setSourceKind(_ctx.stringValue("QueryLinkeLinkaMngtasksummaryResponse.SubCoverages["+ i +"].SourceKind"));
			subCoveragesItem.setSummary(_ctx.stringValue("QueryLinkeLinkaMngtasksummaryResponse.SubCoverages["+ i +"].Summary"));
			subCoveragesItem.setTaskId(_ctx.stringValue("QueryLinkeLinkaMngtasksummaryResponse.SubCoverages["+ i +"].TaskId"));
			subCoveragesItem.setUpdatedAt(_ctx.longValue("QueryLinkeLinkaMngtasksummaryResponse.SubCoverages["+ i +"].UpdatedAt"));

			subCoverages.add(subCoveragesItem);
		}
		queryLinkeLinkaMngtasksummaryResponse.setSubCoverages(subCoverages);
	 
	 	return queryLinkeLinkaMngtasksummaryResponse;
	}
}