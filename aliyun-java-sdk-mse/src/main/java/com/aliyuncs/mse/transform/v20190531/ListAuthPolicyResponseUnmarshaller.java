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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListAuthPolicyResponse;
import com.aliyuncs.mse.model.v20190531.ListAuthPolicyResponse.Data;
import com.aliyuncs.mse.model.v20190531.ListAuthPolicyResponse.Data.Policy;
import com.aliyuncs.mse.model.v20190531.ListAuthPolicyResponse.Data.Policy.AuthRuleItem;
import com.aliyuncs.mse.model.v20190531.ListAuthPolicyResponse.Data.Policy.AuthRuleItem.Method;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAuthPolicyResponseUnmarshaller {

	public static ListAuthPolicyResponse unmarshall(ListAuthPolicyResponse listAuthPolicyResponse, UnmarshallerContext _ctx) {
		
		listAuthPolicyResponse.setRequestId(_ctx.stringValue("ListAuthPolicyResponse.RequestId"));
		listAuthPolicyResponse.setHttpStatusCode(_ctx.integerValue("ListAuthPolicyResponse.HttpStatusCode"));
		listAuthPolicyResponse.setMessage(_ctx.stringValue("ListAuthPolicyResponse.Message"));
		listAuthPolicyResponse.setCode(_ctx.integerValue("ListAuthPolicyResponse.Code"));
		listAuthPolicyResponse.setSuccess(_ctx.booleanValue("ListAuthPolicyResponse.Success"));

		Data data = new Data();
		data.setTotalSize(_ctx.integerValue("ListAuthPolicyResponse.Data.TotalSize"));
		data.setPageNumber(_ctx.integerValue("ListAuthPolicyResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListAuthPolicyResponse.Data.PageSize"));

		List<Policy> result = new ArrayList<Policy>();
		for (int i = 0; i < _ctx.lengthValue("ListAuthPolicyResponse.Data.Result.Length"); i++) {
			Policy policy = new Policy();
			policy.setStatus(_ctx.integerValue("ListAuthPolicyResponse.Data.Result["+ i +"].Status"));
			policy.setNamespaceId(_ctx.stringValue("ListAuthPolicyResponse.Data.Result["+ i +"].NamespaceId"));
			policy.setBizProtocol(_ctx.stringValue("ListAuthPolicyResponse.Data.Result["+ i +"].Protocol"));
			policy.setAccountId(_ctx.stringValue("ListAuthPolicyResponse.Data.Result["+ i +"].AccountId"));
			policy.setSource(_ctx.stringValue("ListAuthPolicyResponse.Data.Result["+ i +"].Source"));
			policy.setRegionId(_ctx.stringValue("ListAuthPolicyResponse.Data.Result["+ i +"].RegionId"));
			policy.setAppName(_ctx.stringValue("ListAuthPolicyResponse.Data.Result["+ i +"].AppName"));
			policy.setAppId(_ctx.stringValue("ListAuthPolicyResponse.Data.Result["+ i +"].AppId"));
			policy.setName(_ctx.stringValue("ListAuthPolicyResponse.Data.Result["+ i +"].Name"));
			policy.setId(_ctx.integerValue("ListAuthPolicyResponse.Data.Result["+ i +"].Id"));
			policy.setEnable(_ctx.booleanValue("ListAuthPolicyResponse.Data.Result["+ i +"].Enable"));
			policy.setAuthType(_ctx.integerValue("ListAuthPolicyResponse.Data.Result["+ i +"].AuthType"));
			policy.setK8sNamespace(_ctx.stringValue("ListAuthPolicyResponse.Data.Result["+ i +"].K8sNamespace"));

			List<AuthRuleItem> authRule = new ArrayList<AuthRuleItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAuthPolicyResponse.Data.Result["+ i +"].AuthRule.Length"); j++) {
				AuthRuleItem authRuleItem = new AuthRuleItem();
				authRuleItem.setBlack(_ctx.booleanValue("ListAuthPolicyResponse.Data.Result["+ i +"].AuthRule["+ j +"].Black"));
				authRuleItem.setPath(_ctx.stringValue("ListAuthPolicyResponse.Data.Result["+ i +"].AuthRule["+ j +"].Path"));
				authRuleItem.setAuthType(_ctx.integerValue("ListAuthPolicyResponse.Data.Result["+ i +"].AuthRule["+ j +"].AuthType"));

				List<String> appIds = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListAuthPolicyResponse.Data.Result["+ i +"].AuthRule["+ j +"].AppIds.Length"); k++) {
					appIds.add(_ctx.stringValue("ListAuthPolicyResponse.Data.Result["+ i +"].AuthRule["+ j +"].AppIds["+ k +"]"));
				}
				authRuleItem.setAppIds(appIds);

				List<String> k8sNamespaces = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListAuthPolicyResponse.Data.Result["+ i +"].AuthRule["+ j +"].K8sNamespaces.Length"); k++) {
					k8sNamespaces.add(_ctx.stringValue("ListAuthPolicyResponse.Data.Result["+ i +"].AuthRule["+ j +"].K8sNamespaces["+ k +"]"));
				}
				authRuleItem.setK8sNamespaces(k8sNamespaces);

				Method method = new Method();
				method.setVersion(_ctx.stringValue("ListAuthPolicyResponse.Data.Result["+ i +"].AuthRule["+ j +"].Method.Version"));
				method.setServiceName(_ctx.stringValue("ListAuthPolicyResponse.Data.Result["+ i +"].AuthRule["+ j +"].Method.ServiceName"));
				method.setName(_ctx.stringValue("ListAuthPolicyResponse.Data.Result["+ i +"].AuthRule["+ j +"].Method.Name"));
				method.setGroup(_ctx.stringValue("ListAuthPolicyResponse.Data.Result["+ i +"].AuthRule["+ j +"].Method.Group"));
				method.setReturnType(_ctx.stringValue("ListAuthPolicyResponse.Data.Result["+ i +"].AuthRule["+ j +"].Method.ReturnType"));

				List<String> parameterTypes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListAuthPolicyResponse.Data.Result["+ i +"].AuthRule["+ j +"].Method.ParameterTypes.Length"); k++) {
					parameterTypes.add(_ctx.stringValue("ListAuthPolicyResponse.Data.Result["+ i +"].AuthRule["+ j +"].Method.ParameterTypes["+ k +"]"));
				}
				method.setParameterTypes(parameterTypes);
				authRuleItem.setBizMethod(method);

				authRule.add(authRuleItem);
			}
			policy.setAuthRule(authRule);

			result.add(policy);
		}
		data.setResult(result);
		listAuthPolicyResponse.setData(data);
	 
	 	return listAuthPolicyResponse;
	}
}