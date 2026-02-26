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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeSecretsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeSecretsResponse.SecretsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecretsResponseUnmarshaller {

	public static DescribeSecretsResponse unmarshall(DescribeSecretsResponse describeSecretsResponse, UnmarshallerContext _ctx) {
		
		describeSecretsResponse.setRequestId(_ctx.stringValue("DescribeSecretsResponse.RequestId"));
		describeSecretsResponse.setPageNumber(_ctx.longValue("DescribeSecretsResponse.PageNumber"));
		describeSecretsResponse.setPageSize(_ctx.longValue("DescribeSecretsResponse.PageSize"));

		List<SecretsItem> secrets = new ArrayList<SecretsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecretsResponse.Secrets.Length"); i++) {
			SecretsItem secretsItem = new SecretsItem();
			secretsItem.setAccountId(_ctx.stringValue("DescribeSecretsResponse.Secrets["+ i +"].AccountId"));
			secretsItem.setDescription(_ctx.stringValue("DescribeSecretsResponse.Secrets["+ i +"].Description"));
			secretsItem.setRegionId(_ctx.stringValue("DescribeSecretsResponse.Secrets["+ i +"].RegionId"));
			secretsItem.setSecretArn(_ctx.stringValue("DescribeSecretsResponse.Secrets["+ i +"].SecretArn"));
			secretsItem.setSecretName(_ctx.stringValue("DescribeSecretsResponse.Secrets["+ i +"].SecretName"));
			secretsItem.setUsername(_ctx.stringValue("DescribeSecretsResponse.Secrets["+ i +"].Username"));

			secrets.add(secretsItem);
		}
		describeSecretsResponse.setSecrets(secrets);
	 
	 	return describeSecretsResponse;
	}
}