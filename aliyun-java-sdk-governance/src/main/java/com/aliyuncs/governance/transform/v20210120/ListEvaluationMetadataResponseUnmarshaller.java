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

package com.aliyuncs.governance.transform.v20210120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.governance.model.v20210120.ListEvaluationMetadataResponse;
import com.aliyuncs.governance.model.v20210120.ListEvaluationMetadataResponse.EvaluationMetadataItem;
import com.aliyuncs.governance.model.v20210120.ListEvaluationMetadataResponse.EvaluationMetadataItem.MetadataItem;
import com.aliyuncs.governance.model.v20210120.ListEvaluationMetadataResponse.EvaluationMetadataItem.MetadataItem.RemediationMetadata;
import com.aliyuncs.governance.model.v20210120.ListEvaluationMetadataResponse.EvaluationMetadataItem.MetadataItem.RemediationMetadata.RemediationItem;
import com.aliyuncs.governance.model.v20210120.ListEvaluationMetadataResponse.EvaluationMetadataItem.MetadataItem.RemediationMetadata.RemediationItem.Action;
import com.aliyuncs.governance.model.v20210120.ListEvaluationMetadataResponse.EvaluationMetadataItem.MetadataItem.RemediationMetadata.RemediationItem.Action.GuidanceItem;
import com.aliyuncs.governance.model.v20210120.ListEvaluationMetadataResponse.EvaluationMetadataItem.MetadataItem.ResourceMetadata;
import com.aliyuncs.governance.model.v20210120.ListEvaluationMetadataResponse.EvaluationMetadataItem.MetadataItem.ResourceMetadata.ResourcePropertyMetadataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEvaluationMetadataResponseUnmarshaller {

	public static ListEvaluationMetadataResponse unmarshall(ListEvaluationMetadataResponse listEvaluationMetadataResponse, UnmarshallerContext _ctx) {
		
		listEvaluationMetadataResponse.setRequestId(_ctx.stringValue("ListEvaluationMetadataResponse.RequestId"));

		List<EvaluationMetadataItem> evaluationMetadata = new ArrayList<EvaluationMetadataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEvaluationMetadataResponse.EvaluationMetadata.Length"); i++) {
			EvaluationMetadataItem evaluationMetadataItem = new EvaluationMetadataItem();
			evaluationMetadataItem.setType(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Type"));

			List<MetadataItem> metadata = new ArrayList<MetadataItem>();
			for (int j = 0; j < _ctx.lengthValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata.Length"); j++) {
				MetadataItem metadataItem = new MetadataItem();
				metadataItem.setCategory(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].Category"));
				metadataItem.setDescription(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].Description"));
				metadataItem.setDisplayName(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].DisplayName"));
				metadataItem.setId(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].Id"));
				metadataItem.setNoRiskDisplayName(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].NoRiskDisplayName"));
				metadataItem.setParentId(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].ParentId"));
				metadataItem.setRecommendationLevel(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].RecommendationLevel"));
				metadataItem.setScope(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].Scope"));
				metadataItem.setStage(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].Stage"));

				RemediationMetadata remediationMetadata = new RemediationMetadata();

				List<RemediationItem> remediation = new ArrayList<RemediationItem>();
				for (int k = 0; k < _ctx.lengthValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].RemediationMetadata.Remediation.Length"); k++) {
					RemediationItem remediationItem = new RemediationItem();
					remediationItem.setAnalysisDefinition(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].RemediationMetadata.Remediation["+ k +"].AnalysisDefinition"));
					remediationItem.setRemediationParameters(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].RemediationMetadata.Remediation["+ k +"].RemediationParameters"));
					remediationItem.setRemediationTarget(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].RemediationMetadata.Remediation["+ k +"].RemediationTarget"));
					remediationItem.setRemediationType(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].RemediationMetadata.Remediation["+ k +"].RemediationType"));

					List<Action> actions = new ArrayList<Action>();
					for (int l = 0; l < _ctx.lengthValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].RemediationMetadata.Remediation["+ k +"].Actions.Length"); l++) {
						Action action = new Action();
						action.setClassification(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].RemediationMetadata.Remediation["+ k +"].Actions["+ l +"].Classification"));
						action.setCostDescription(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].RemediationMetadata.Remediation["+ k +"].Actions["+ l +"].CostDescription"));
						action.setDescription(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].RemediationMetadata.Remediation["+ k +"].Actions["+ l +"].Description"));
						action.setNotice(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].RemediationMetadata.Remediation["+ k +"].Actions["+ l +"].Notice"));
						action.setSuggestion(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].RemediationMetadata.Remediation["+ k +"].Actions["+ l +"].Suggestion"));

						List<GuidanceItem> guidance = new ArrayList<GuidanceItem>();
						for (int m = 0; m < _ctx.lengthValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].RemediationMetadata.Remediation["+ k +"].Actions["+ l +"].Guidance.Length"); m++) {
							GuidanceItem guidanceItem = new GuidanceItem();
							guidanceItem.setButtonName(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].RemediationMetadata.Remediation["+ k +"].Actions["+ l +"].Guidance["+ m +"].ButtonName"));
							guidanceItem.setButtonRef(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].RemediationMetadata.Remediation["+ k +"].Actions["+ l +"].Guidance["+ m +"].ButtonRef"));
							guidanceItem.setContent(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].RemediationMetadata.Remediation["+ k +"].Actions["+ l +"].Guidance["+ m +"].Content"));
							guidanceItem.setTitle(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].RemediationMetadata.Remediation["+ k +"].Actions["+ l +"].Guidance["+ m +"].Title"));

							guidance.add(guidanceItem);
						}
						action.setGuidance(guidance);

						actions.add(action);
					}
					remediationItem.setActions(actions);

					remediation.add(remediationItem);
				}
				remediationMetadata.setRemediation(remediation);
				metadataItem.setRemediationMetadata(remediationMetadata);

				ResourceMetadata resourceMetadata = new ResourceMetadata();

				List<ResourcePropertyMetadataItem> resourcePropertyMetadata = new ArrayList<ResourcePropertyMetadataItem>();
				for (int k = 0; k < _ctx.lengthValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].ResourceMetadata.ResourcePropertyMetadata.Length"); k++) {
					ResourcePropertyMetadataItem resourcePropertyMetadataItem = new ResourcePropertyMetadataItem();
					resourcePropertyMetadataItem.setDisplayName(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].ResourceMetadata.ResourcePropertyMetadata["+ k +"].DisplayName"));
					resourcePropertyMetadataItem.setPropertyName(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].ResourceMetadata.ResourcePropertyMetadata["+ k +"].PropertyName"));
					resourcePropertyMetadataItem.setPropertyReference(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].ResourceMetadata.ResourcePropertyMetadata["+ k +"].PropertyReference"));
					resourcePropertyMetadataItem.setPropertyType(_ctx.stringValue("ListEvaluationMetadataResponse.EvaluationMetadata["+ i +"].Metadata["+ j +"].ResourceMetadata.ResourcePropertyMetadata["+ k +"].PropertyType"));

					resourcePropertyMetadata.add(resourcePropertyMetadataItem);
				}
				resourceMetadata.setResourcePropertyMetadata(resourcePropertyMetadata);
				metadataItem.setResourceMetadata(resourceMetadata);

				metadata.add(metadataItem);
			}
			evaluationMetadataItem.setMetadata(metadata);

			evaluationMetadata.add(evaluationMetadataItem);
		}
		listEvaluationMetadataResponse.setEvaluationMetadata(evaluationMetadata);
	 
	 	return listEvaluationMetadataResponse;
	}
}