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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ListGovernObjectsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListGovernObjectsResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListGovernObjectsResponse.PageResult.DataItem;
import com.aliyuncs.dataphin_public.model.v20230630.ListGovernObjectsResponse.PageResult.DataItem.Owner;
import com.aliyuncs.dataphin_public.model.v20230630.ListGovernObjectsResponse.PageResult.DataItem.Problem;
import com.aliyuncs.dataphin_public.model.v20230630.ListGovernObjectsResponse.PageResult.DataItem.RelatedKnowledgeItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGovernObjectsResponseUnmarshaller {

	public static ListGovernObjectsResponse unmarshall(ListGovernObjectsResponse listGovernObjectsResponse, UnmarshallerContext _ctx) {
		
		listGovernObjectsResponse.setRequestId(_ctx.stringValue("ListGovernObjectsResponse.RequestId"));
		listGovernObjectsResponse.setMessage(_ctx.stringValue("ListGovernObjectsResponse.Message"));
		listGovernObjectsResponse.setHttpStatusCode(_ctx.integerValue("ListGovernObjectsResponse.HttpStatusCode"));
		listGovernObjectsResponse.setCode(_ctx.stringValue("ListGovernObjectsResponse.Code"));
		listGovernObjectsResponse.setSuccess(_ctx.booleanValue("ListGovernObjectsResponse.Success"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.longValue("ListGovernObjectsResponse.PageResult.TotalCount"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListGovernObjectsResponse.PageResult.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setStatus(_ctx.stringValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].Status"));
			dataItem.setIsRectify(_ctx.booleanValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].IsRectify"));
			dataItem.setRectifyId(_ctx.longValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].RectifyId"));
			dataItem.setGovernObjectId(_ctx.longValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].GovernObjectId"));
			dataItem.setRectifyName(_ctx.stringValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].RectifyName"));
			dataItem.setCommitTime(_ctx.stringValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].CommitTime"));
			dataItem.setProperties(_ctx.mapValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].Properties"));
			dataItem.setGovernItemId(_ctx.longValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].GovernItemId"));
			dataItem.setRectifyStatus(_ctx.stringValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].RectifyStatus"));

			Problem problem = new Problem();
			problem.setProblemContactPhone(_ctx.stringValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].Problem.ProblemContactPhone"));
			problem.setProblemSubmitter(_ctx.stringValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].Problem.ProblemSubmitter"));
			problem.setObjectId(_ctx.stringValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].Problem.ObjectId"));
			problem.setProblemDesc(_ctx.stringValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].Problem.ProblemDesc"));
			problem.setProblemSubmitType(_ctx.stringValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].Problem.ProblemSubmitType"));
			problem.setProblemSubmitterUserName(_ctx.stringValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].Problem.ProblemSubmitterUserName"));
			problem.setProblemContactOther(_ctx.stringValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].Problem.ProblemContactOther"));
			problem.setProblemContactMail(_ctx.stringValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].Problem.ProblemContactMail"));
			problem.setParentObjectId(_ctx.stringValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].Problem.ParentObjectId"));

			List<String> problemTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].Problem.ProblemTypes.Length"); j++) {
				problemTypes.add(_ctx.stringValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].Problem.ProblemTypes["+ j +"]"));
			}
			problem.setProblemTypes(problemTypes);
			dataItem.setProblem(problem);

			List<RelatedKnowledgeItem> relatedKnowledge = new ArrayList<RelatedKnowledgeItem>();
			for (int j = 0; j < _ctx.lengthValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].RelatedKnowledge.Length"); j++) {
				RelatedKnowledgeItem relatedKnowledgeItem = new RelatedKnowledgeItem();
				relatedKnowledgeItem.setDesc(_ctx.stringValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].RelatedKnowledge["+ j +"].Desc"));
				relatedKnowledgeItem.setOwner(_ctx.stringValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].RelatedKnowledge["+ j +"].Owner"));
				relatedKnowledgeItem.setOwnerName(_ctx.stringValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].RelatedKnowledge["+ j +"].OwnerName"));
				relatedKnowledgeItem.setCause(_ctx.stringValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].RelatedKnowledge["+ j +"].Cause"));
				relatedKnowledgeItem.setTitle(_ctx.stringValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].RelatedKnowledge["+ j +"].Title"));
				relatedKnowledgeItem.setKnowledgeId(_ctx.longValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].RelatedKnowledge["+ j +"].KnowledgeId"));
				relatedKnowledgeItem.setSolution(_ctx.stringValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].RelatedKnowledge["+ j +"].Solution"));

				relatedKnowledge.add(relatedKnowledgeItem);
			}
			dataItem.setRelatedKnowledge(relatedKnowledge);

			List<Owner> owners = new ArrayList<Owner>();
			for (int j = 0; j < _ctx.lengthValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].Owners.Length"); j++) {
				Owner owner = new Owner();
				owner.setUserId(_ctx.stringValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].Owners["+ j +"].UserId"));
				owner.setDisplayName(_ctx.stringValue("ListGovernObjectsResponse.PageResult.Data["+ i +"].Owners["+ j +"].DisplayName"));

				owners.add(owner);
			}
			dataItem.setOwners(owners);

			data.add(dataItem);
		}
		pageResult.setData(data);
		listGovernObjectsResponse.setPageResult(pageResult);
	 
	 	return listGovernObjectsResponse;
	}
}