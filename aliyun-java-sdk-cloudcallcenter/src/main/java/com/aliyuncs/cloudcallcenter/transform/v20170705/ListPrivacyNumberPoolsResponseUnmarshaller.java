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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ListPrivacyNumberPoolsResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListPrivacyNumberPoolsResponse.PrivacyNumberPool;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPrivacyNumberPoolsResponseUnmarshaller {

	public static ListPrivacyNumberPoolsResponse unmarshall(ListPrivacyNumberPoolsResponse listPrivacyNumberPoolsResponse, UnmarshallerContext context) {
		
		listPrivacyNumberPoolsResponse.setRequestId(context.stringValue("ListPrivacyNumberPoolsResponse.RequestId"));
		listPrivacyNumberPoolsResponse.setSuccess(context.booleanValue("ListPrivacyNumberPoolsResponse.Success"));
		listPrivacyNumberPoolsResponse.setCode(context.stringValue("ListPrivacyNumberPoolsResponse.Code"));
		listPrivacyNumberPoolsResponse.setMessage(context.stringValue("ListPrivacyNumberPoolsResponse.Message"));
		listPrivacyNumberPoolsResponse.setHttpStatusCode(context.integerValue("ListPrivacyNumberPoolsResponse.HttpStatusCode"));

		List<PrivacyNumberPool> privacyNumberPools = new ArrayList<PrivacyNumberPool>();
		for (int i = 0; i < context.lengthValue("ListPrivacyNumberPoolsResponse.PrivacyNumberPools.Length"); i++) {
			PrivacyNumberPool privacyNumberPool = new PrivacyNumberPool();
			privacyNumberPool.setPoolId(context.stringValue("ListPrivacyNumberPoolsResponse.PrivacyNumberPools["+ i +"].PoolId"));
			privacyNumberPool.setProviderId(context.stringValue("ListPrivacyNumberPoolsResponse.PrivacyNumberPools["+ i +"].ProviderId"));
			privacyNumberPool.setProviderName(context.stringValue("ListPrivacyNumberPoolsResponse.PrivacyNumberPools["+ i +"].ProviderName"));
			privacyNumberPool.setPrefix(context.stringValue("ListPrivacyNumberPoolsResponse.PrivacyNumberPools["+ i +"].Prefix"));
			privacyNumberPool.setType(context.stringValue("ListPrivacyNumberPoolsResponse.PrivacyNumberPools["+ i +"].Type"));
			privacyNumberPool.setName(context.stringValue("ListPrivacyNumberPoolsResponse.PrivacyNumberPools["+ i +"].Name"));
			privacyNumberPool.setAliYunUid(context.longValue("ListPrivacyNumberPoolsResponse.PrivacyNumberPools["+ i +"].AliYunUid"));
			privacyNumberPool.setBizId(context.stringValue("ListPrivacyNumberPoolsResponse.PrivacyNumberPools["+ i +"].BizId"));

			privacyNumberPools.add(privacyNumberPool);
		}
		listPrivacyNumberPoolsResponse.setPrivacyNumberPools(privacyNumberPools);
	 
	 	return listPrivacyNumberPoolsResponse;
	}
}