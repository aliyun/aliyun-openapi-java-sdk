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

import com.aliyuncs.dataphin_public.model.v20230630.GetDataAssetsGovernObjectResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataAssetsGovernObjectResponse.GovernObjectInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataAssetsGovernObjectResponse.GovernObjectInfo.Owner;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataAssetsGovernObjectResponse.GovernObjectInfo.Problem;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataAssetsGovernObjectResponse.GovernObjectInfo.RelatedKnowledgeItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataAssetsGovernObjectResponseUnmarshaller {

	public static GetDataAssetsGovernObjectResponse unmarshall(GetDataAssetsGovernObjectResponse getDataAssetsGovernObjectResponse, UnmarshallerContext _ctx) {
		
		getDataAssetsGovernObjectResponse.setRequestId(_ctx.stringValue("GetDataAssetsGovernObjectResponse.RequestId"));
		getDataAssetsGovernObjectResponse.setMessage(_ctx.stringValue("GetDataAssetsGovernObjectResponse.Message"));
		getDataAssetsGovernObjectResponse.setHttpStatusCode(_ctx.integerValue("GetDataAssetsGovernObjectResponse.HttpStatusCode"));
		getDataAssetsGovernObjectResponse.setCode(_ctx.stringValue("GetDataAssetsGovernObjectResponse.Code"));
		getDataAssetsGovernObjectResponse.setSuccess(_ctx.booleanValue("GetDataAssetsGovernObjectResponse.Success"));

		GovernObjectInfo governObjectInfo = new GovernObjectInfo();
		governObjectInfo.setStatus(_ctx.stringValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.Status"));
		governObjectInfo.setIsRectify(_ctx.booleanValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.IsRectify"));
		governObjectInfo.setRectifyId(_ctx.longValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.RectifyId"));
		governObjectInfo.setGovernObjectId(_ctx.longValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.GovernObjectId"));
		governObjectInfo.setRectifyName(_ctx.stringValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.RectifyName"));
		governObjectInfo.setCommitTime(_ctx.stringValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.CommitTime"));
		governObjectInfo.setRectifyUser(_ctx.stringValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.RectifyUser"));
		governObjectInfo.setProperties(_ctx.mapValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.Properties"));
		governObjectInfo.setTenantId(_ctx.longValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.TenantId"));
		governObjectInfo.setSubmitType(_ctx.stringValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.SubmitType"));
		governObjectInfo.setGovernItemId(_ctx.longValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.GovernItemId"));
		governObjectInfo.setRectifyStatus(_ctx.stringValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.RectifyStatus"));
		governObjectInfo.setRectifyUserName(_ctx.stringValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.RectifyUserName"));

		Problem problem = new Problem();
		problem.setProblemContactPhone(_ctx.stringValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.Problem.ProblemContactPhone"));
		problem.setProblemSubmitter(_ctx.stringValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.Problem.ProblemSubmitter"));
		problem.setObjectId(_ctx.stringValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.Problem.ObjectId"));
		problem.setProblemDesc(_ctx.stringValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.Problem.ProblemDesc"));
		problem.setProblemSubmitType(_ctx.stringValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.Problem.ProblemSubmitType"));
		problem.setProblemSubmitterUserName(_ctx.stringValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.Problem.ProblemSubmitterUserName"));
		problem.setProblemContactOther(_ctx.stringValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.Problem.ProblemContactOther"));
		problem.setProblemContactMail(_ctx.stringValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.Problem.ProblemContactMail"));
		problem.setParentObjectId(_ctx.stringValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.Problem.ParentObjectId"));

		List<String> problemTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.Problem.ProblemTypes.Length"); i++) {
			problemTypes.add(_ctx.stringValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.Problem.ProblemTypes["+ i +"]"));
		}
		problem.setProblemTypes(problemTypes);
		governObjectInfo.setProblem(problem);

		List<RelatedKnowledgeItem> relatedKnowledge = new ArrayList<RelatedKnowledgeItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.RelatedKnowledge.Length"); i++) {
			RelatedKnowledgeItem relatedKnowledgeItem = new RelatedKnowledgeItem();
			relatedKnowledgeItem.setDesc(_ctx.stringValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.RelatedKnowledge["+ i +"].Desc"));
			relatedKnowledgeItem.setOwner(_ctx.stringValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.RelatedKnowledge["+ i +"].Owner"));
			relatedKnowledgeItem.setOwnerName(_ctx.stringValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.RelatedKnowledge["+ i +"].OwnerName"));
			relatedKnowledgeItem.setCause(_ctx.stringValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.RelatedKnowledge["+ i +"].Cause"));
			relatedKnowledgeItem.setTitle(_ctx.stringValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.RelatedKnowledge["+ i +"].Title"));
			relatedKnowledgeItem.setKnowledgeId(_ctx.longValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.RelatedKnowledge["+ i +"].KnowledgeId"));
			relatedKnowledgeItem.setSolution(_ctx.stringValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.RelatedKnowledge["+ i +"].Solution"));

			relatedKnowledge.add(relatedKnowledgeItem);
		}
		governObjectInfo.setRelatedKnowledge(relatedKnowledge);

		List<Owner> owners = new ArrayList<Owner>();
		for (int i = 0; i < _ctx.lengthValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.Owners.Length"); i++) {
			Owner owner = new Owner();
			owner.setUserId(_ctx.stringValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.Owners["+ i +"].UserId"));
			owner.setDisplayName(_ctx.stringValue("GetDataAssetsGovernObjectResponse.GovernObjectInfo.Owners["+ i +"].DisplayName"));

			owners.add(owner);
		}
		governObjectInfo.setOwners(owners);
		getDataAssetsGovernObjectResponse.setGovernObjectInfo(governObjectInfo);
	 
	 	return getDataAssetsGovernObjectResponse;
	}
}