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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListK8sSecretsResponse;
import com.aliyuncs.edas.model.v20170801.ListK8sSecretsResponse.Result;
import com.aliyuncs.edas.model.v20170801.ListK8sSecretsResponse.Result.SecretsItem;
import com.aliyuncs.edas.model.v20170801.ListK8sSecretsResponse.Result.SecretsItem.CertDetail;
import com.aliyuncs.edas.model.v20170801.ListK8sSecretsResponse.Result.SecretsItem.DataItem;
import com.aliyuncs.edas.model.v20170801.ListK8sSecretsResponse.Result.SecretsItem.RelatedAppsItem2;
import com.aliyuncs.edas.model.v20170801.ListK8sSecretsResponse.Result.SecretsItem.RelatedIngressRulesItem;
import com.aliyuncs.edas.model.v20170801.ListK8sSecretsResponse.Result.SecretsItem.RelatedIngressRulesItem.RelatedAppsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListK8sSecretsResponseUnmarshaller {

	public static ListK8sSecretsResponse unmarshall(ListK8sSecretsResponse listK8sSecretsResponse, UnmarshallerContext _ctx) {
		
		listK8sSecretsResponse.setRequestId(_ctx.stringValue("ListK8sSecretsResponse.RequestId"));
		listK8sSecretsResponse.setCode(_ctx.integerValue("ListK8sSecretsResponse.Code"));
		listK8sSecretsResponse.setMessage(_ctx.stringValue("ListK8sSecretsResponse.Message"));

		Result result = new Result();
		result.setTotal(_ctx.integerValue("ListK8sSecretsResponse.Result.Total"));

		List<SecretsItem> secrets = new ArrayList<SecretsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListK8sSecretsResponse.Result.Secrets.Length"); i++) {
			SecretsItem secretsItem = new SecretsItem();
			secretsItem.setType(_ctx.stringValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].Type"));
			secretsItem.setCreationTime(_ctx.stringValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].CreationTime"));
			secretsItem.setClusterName(_ctx.stringValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].ClusterName"));
			secretsItem.setNamespace(_ctx.stringValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].Namespace"));
			secretsItem.setBase64Encoded(_ctx.booleanValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].Base64Encoded"));
			secretsItem.setCertRegionId(_ctx.stringValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].CertRegionId"));
			secretsItem.setCertId(_ctx.stringValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].CertId"));
			secretsItem.setName(_ctx.stringValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].Name"));
			secretsItem.setClusterId(_ctx.stringValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].ClusterId"));

			CertDetail certDetail = new CertDetail();
			certDetail.setEndTime(_ctx.stringValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].CertDetail.EndTime"));
			certDetail.setStatus(_ctx.stringValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].CertDetail.Status"));
			certDetail.setStartTime(_ctx.stringValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].CertDetail.StartTime"));
			certDetail.setIssuer(_ctx.stringValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].CertDetail.Issuer"));

			List<String> domainNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].CertDetail.DomainNames.Length"); j++) {
				domainNames.add(_ctx.stringValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].CertDetail.DomainNames["+ j +"]"));
			}
			certDetail.setDomainNames(domainNames);
			secretsItem.setCertDetail(certDetail);

			List<RelatedIngressRulesItem> relatedIngressRules = new ArrayList<RelatedIngressRulesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].RelatedIngressRules.Length"); j++) {
				RelatedIngressRulesItem relatedIngressRulesItem = new RelatedIngressRulesItem();
				relatedIngressRulesItem.setName(_ctx.stringValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].RelatedIngressRules["+ j +"].Name"));
				relatedIngressRulesItem.setNamespace(_ctx.stringValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].RelatedIngressRules["+ j +"].Namespace"));

				List<RelatedAppsItem> relatedApps1 = new ArrayList<RelatedAppsItem>();
				for (int k = 0; k < _ctx.lengthValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].RelatedIngressRules["+ j +"].RelatedApps.Length"); k++) {
					RelatedAppsItem relatedAppsItem = new RelatedAppsItem();
					relatedAppsItem.setAppName(_ctx.stringValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].RelatedIngressRules["+ j +"].RelatedApps["+ k +"].AppName"));
					relatedAppsItem.setAppId(_ctx.stringValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].RelatedIngressRules["+ j +"].RelatedApps["+ k +"].AppId"));

					relatedApps1.add(relatedAppsItem);
				}
				relatedIngressRulesItem.setRelatedApps1(relatedApps1);

				relatedIngressRules.add(relatedIngressRulesItem);
			}
			secretsItem.setRelatedIngressRules(relatedIngressRules);

			List<DataItem> data = new ArrayList<DataItem>();
			for (int j = 0; j < _ctx.lengthValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].Data.Length"); j++) {
				DataItem dataItem = new DataItem();
				dataItem.setKey(_ctx.stringValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].Data["+ j +"].Key"));
				dataItem.setValue(_ctx.stringValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].Data["+ j +"].Value"));

				data.add(dataItem);
			}
			secretsItem.setData(data);

			List<RelatedAppsItem2> relatedApps = new ArrayList<RelatedAppsItem2>();
			for (int j = 0; j < _ctx.lengthValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].RelatedApps.Length"); j++) {
				RelatedAppsItem2 relatedAppsItem2 = new RelatedAppsItem2();
				relatedAppsItem2.setAppName(_ctx.stringValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].RelatedApps["+ j +"].AppName"));
				relatedAppsItem2.setAppId(_ctx.stringValue("ListK8sSecretsResponse.Result.Secrets["+ i +"].RelatedApps["+ j +"].AppId"));

				relatedApps.add(relatedAppsItem2);
			}
			secretsItem.setRelatedApps(relatedApps);

			secrets.add(secretsItem);
		}
		result.setSecrets(secrets);
		listK8sSecretsResponse.setResult(result);
	 
	 	return listK8sSecretsResponse;
	}
}