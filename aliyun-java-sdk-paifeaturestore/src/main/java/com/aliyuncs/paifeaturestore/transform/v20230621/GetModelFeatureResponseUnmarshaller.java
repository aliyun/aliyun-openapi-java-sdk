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

package com.aliyuncs.paifeaturestore.transform.v20230621;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paifeaturestore.model.v20230621.GetModelFeatureResponse;
import com.aliyuncs.paifeaturestore.model.v20230621.GetModelFeatureResponse.FeaturesItem;
import com.aliyuncs.paifeaturestore.model.v20230621.GetModelFeatureResponse.Relations;
import com.aliyuncs.paifeaturestore.model.v20230621.GetModelFeatureResponse.Relations.DomainsItem;
import com.aliyuncs.paifeaturestore.model.v20230621.GetModelFeatureResponse.Relations.LinksItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetModelFeatureResponseUnmarshaller {

	public static GetModelFeatureResponse unmarshall(GetModelFeatureResponse getModelFeatureResponse, UnmarshallerContext _ctx) {
		
		getModelFeatureResponse.setRequestId(_ctx.stringValue("GetModelFeatureResponse.RequestId"));
		getModelFeatureResponse.setProjectId(_ctx.stringValue("GetModelFeatureResponse.ProjectId"));
		getModelFeatureResponse.setProjectName(_ctx.stringValue("GetModelFeatureResponse.ProjectName"));
		getModelFeatureResponse.setName(_ctx.stringValue("GetModelFeatureResponse.Name"));
		getModelFeatureResponse.setOwner(_ctx.stringValue("GetModelFeatureResponse.Owner"));
		getModelFeatureResponse.setGmtCreateTime(_ctx.stringValue("GetModelFeatureResponse.GmtCreateTime"));
		getModelFeatureResponse.setGmtModifiedTime(_ctx.stringValue("GetModelFeatureResponse.GmtModifiedTime"));
		getModelFeatureResponse.setLabelTableId(_ctx.stringValue("GetModelFeatureResponse.LabelTableId"));
		getModelFeatureResponse.setLabelTableName(_ctx.stringValue("GetModelFeatureResponse.LabelTableName"));
		getModelFeatureResponse.setTrainingSetTable(_ctx.stringValue("GetModelFeatureResponse.TrainingSetTable"));
		getModelFeatureResponse.setTrainingSetFGTable(_ctx.stringValue("GetModelFeatureResponse.TrainingSetFGTable"));
		getModelFeatureResponse.setExportTrainingSetTableScript(_ctx.stringValue("GetModelFeatureResponse.ExportTrainingSetTableScript"));
		getModelFeatureResponse.setLabelPriorityLevel(_ctx.longValue("GetModelFeatureResponse.LabelPriorityLevel"));

		Relations relations = new Relations();

		List<DomainsItem> domains = new ArrayList<DomainsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetModelFeatureResponse.Relations.Domains.Length"); i++) {
			DomainsItem domainsItem = new DomainsItem();
			domainsItem.setId(_ctx.stringValue("GetModelFeatureResponse.Relations.Domains["+ i +"].Id"));
			domainsItem.setName(_ctx.stringValue("GetModelFeatureResponse.Relations.Domains["+ i +"].Name"));
			domainsItem.setDomainType(_ctx.stringValue("GetModelFeatureResponse.Relations.Domains["+ i +"].DomainType"));

			domains.add(domainsItem);
		}
		relations.setDomains(domains);

		List<LinksItem> links = new ArrayList<LinksItem>();
		for (int i = 0; i < _ctx.lengthValue("GetModelFeatureResponse.Relations.Links.Length"); i++) {
			LinksItem linksItem = new LinksItem();
			linksItem.setFrom(_ctx.stringValue("GetModelFeatureResponse.Relations.Links["+ i +"].From"));
			linksItem.setTo(_ctx.stringValue("GetModelFeatureResponse.Relations.Links["+ i +"].To"));
			linksItem.setLink(_ctx.stringValue("GetModelFeatureResponse.Relations.Links["+ i +"].Link"));

			links.add(linksItem);
		}
		relations.setLinks(links);
		getModelFeatureResponse.setRelations(relations);

		List<FeaturesItem> features = new ArrayList<FeaturesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetModelFeatureResponse.Features.Length"); i++) {
			FeaturesItem featuresItem = new FeaturesItem();
			featuresItem.setFeatureViewId(_ctx.stringValue("GetModelFeatureResponse.Features["+ i +"].FeatureViewId"));
			featuresItem.setFeatureViewName(_ctx.stringValue("GetModelFeatureResponse.Features["+ i +"].FeatureViewName"));
			featuresItem.setName(_ctx.stringValue("GetModelFeatureResponse.Features["+ i +"].Name"));
			featuresItem.setType(_ctx.stringValue("GetModelFeatureResponse.Features["+ i +"].Type"));
			featuresItem.setAliasName(_ctx.stringValue("GetModelFeatureResponse.Features["+ i +"].AliasName"));

			features.add(featuresItem);
		}
		getModelFeatureResponse.setFeatures(features);
	 
	 	return getModelFeatureResponse;
	}
}