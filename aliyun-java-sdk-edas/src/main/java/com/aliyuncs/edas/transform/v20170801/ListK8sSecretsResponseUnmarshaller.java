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
import com.aliyuncs.edas.model.v20170801.ListK8sSecretsResponse.ResultItem;
import com.aliyuncs.edas.model.v20170801.ListK8sSecretsResponse.ResultItem.SecretsItem;
import com.aliyuncs.edas.model.v20170801.ListK8sSecretsResponse.ResultItem.SecretsItem.CertDetail;
import com.aliyuncs.edas.model.v20170801.ListK8sSecretsResponse.ResultItem.SecretsItem.DataItem;
import com.aliyuncs.edas.model.v20170801.ListK8sSecretsResponse.ResultItem.SecretsItem.RelatedAppsItem2;
import com.aliyuncs.edas.model.v20170801.ListK8sSecretsResponse.ResultItem.SecretsItem.RelatedIngressRulesItem;
import com.aliyuncs.edas.model.v20170801.ListK8sSecretsResponse.ResultItem.SecretsItem.RelatedIngressRulesItem.RelatedAppsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListK8sSecretsResponseUnmarshaller {

	public static ListK8sSecretsResponse unmarshall(ListK8sSecretsResponse listK8sSecretsResponse, UnmarshallerContext _ctx) {
		
		listK8sSecretsResponse.setRequestId(_ctx.stringValue("ListK8sSecretsResponse.RequestId"));
		listK8sSecretsResponse.setCode(_ctx.integerValue("ListK8sSecretsResponse.Code"));
		listK8sSecretsResponse.setMessage(_ctx.stringValue("ListK8sSecretsResponse.Message"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListK8sSecretsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setTotal(_ctx.integerValue("ListK8sSecretsResponse.Result["+ i +"].Total"));

			List<SecretsItem> secrets = new ArrayList<SecretsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListK8sSecretsResponse.Result["+ i +"].Secrets.Length"); j++) {
				SecretsItem secretsItem = new SecretsItem();
				secretsItem.setType(_ctx.stringValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].Type"));
				secretsItem.setCreationTime(_ctx.stringValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].CreationTime"));
				secretsItem.setClusterName(_ctx.stringValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].ClusterName"));
				secretsItem.setNamespace(_ctx.stringValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].Namespace"));
				secretsItem.setBase64Encoded(_ctx.booleanValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].Base64Encoded"));
				secretsItem.setCertRegionId(_ctx.stringValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].CertRegionId"));
				secretsItem.setCertId(_ctx.stringValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].CertId"));
				secretsItem.setName(_ctx.stringValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].Name"));
				secretsItem.setClusterId(_ctx.stringValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].ClusterId"));

				CertDetail certDetail = new CertDetail();
				certDetail.setEndTime(_ctx.stringValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].CertDetail.EndTime"));
				certDetail.setStatus(_ctx.stringValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].CertDetail.Status"));
				certDetail.setStartTime(_ctx.stringValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].CertDetail.StartTime"));
				certDetail.setIssuer(_ctx.stringValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].CertDetail.Issuer"));

				List<String> domainNames = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].CertDetail.DomainNames.Length"); k++) {
					domainNames.add(_ctx.stringValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].CertDetail.DomainNames["+ k +"]"));
				}
				certDetail.setDomainNames(domainNames);
				secretsItem.setCertDetail(certDetail);

				List<RelatedIngressRulesItem> relatedIngressRules = new ArrayList<RelatedIngressRulesItem>();
				for (int k = 0; k < _ctx.lengthValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].RelatedIngressRules.Length"); k++) {
					RelatedIngressRulesItem relatedIngressRulesItem = new RelatedIngressRulesItem();
					relatedIngressRulesItem.setName(_ctx.stringValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].RelatedIngressRules["+ k +"].Name"));
					relatedIngressRulesItem.setNamespace(_ctx.stringValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].RelatedIngressRules["+ k +"].Namespace"));

					List<RelatedAppsItem> relatedApps1 = new ArrayList<RelatedAppsItem>();
					for (int l = 0; l < _ctx.lengthValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].RelatedIngressRules["+ k +"].RelatedApps.Length"); l++) {
						RelatedAppsItem relatedAppsItem = new RelatedAppsItem();
						relatedAppsItem.setAppName(_ctx.stringValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].RelatedIngressRules["+ k +"].RelatedApps["+ l +"].AppName"));
						relatedAppsItem.setAppId(_ctx.stringValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].RelatedIngressRules["+ k +"].RelatedApps["+ l +"].AppId"));

						relatedApps1.add(relatedAppsItem);
					}
					relatedIngressRulesItem.setRelatedApps1(relatedApps1);

					relatedIngressRules.add(relatedIngressRulesItem);
				}
				secretsItem.setRelatedIngressRules(relatedIngressRules);

				List<DataItem> data = new ArrayList<DataItem>();
				for (int k = 0; k < _ctx.lengthValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].Data.Length"); k++) {
					DataItem dataItem = new DataItem();
					dataItem.setKey(_ctx.stringValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].Data["+ k +"].Key"));
					dataItem.setValue(_ctx.stringValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].Data["+ k +"].Value"));

					data.add(dataItem);
				}
				secretsItem.setData(data);

				List<RelatedAppsItem2> relatedApps = new ArrayList<RelatedAppsItem2>();
				for (int k = 0; k < _ctx.lengthValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].RelatedApps.Length"); k++) {
					RelatedAppsItem2 relatedAppsItem2 = new RelatedAppsItem2();
					relatedAppsItem2.setAppName(_ctx.stringValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].RelatedApps["+ k +"].AppName"));
					relatedAppsItem2.setAppId(_ctx.stringValue("ListK8sSecretsResponse.Result["+ i +"].Secrets["+ j +"].RelatedApps["+ k +"].AppId"));

					relatedApps.add(relatedAppsItem2);
				}
				secretsItem.setRelatedApps(relatedApps);

				secrets.add(secretsItem);
			}
			resultItem.setSecrets(secrets);

			result.add(resultItem);
		}
		listK8sSecretsResponse.setResult(result);
	 
	 	return listK8sSecretsResponse;
	}
}