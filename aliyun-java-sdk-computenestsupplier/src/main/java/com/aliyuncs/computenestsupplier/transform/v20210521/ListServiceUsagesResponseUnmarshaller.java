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

package com.aliyuncs.computenestsupplier.transform.v20210521;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.computenestsupplier.model.v20210521.ListServiceUsagesResponse;
import com.aliyuncs.computenestsupplier.model.v20210521.ListServiceUsagesResponse.Policy;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServiceUsagesResponseUnmarshaller {

	public static ListServiceUsagesResponse unmarshall(ListServiceUsagesResponse listServiceUsagesResponse, UnmarshallerContext _ctx) {
		
		listServiceUsagesResponse.setRequestId(_ctx.stringValue("ListServiceUsagesResponse.RequestId"));
		listServiceUsagesResponse.setNextToken(_ctx.stringValue("ListServiceUsagesResponse.NextToken"));
		listServiceUsagesResponse.setMaxResults(_ctx.integerValue("ListServiceUsagesResponse.MaxResults"));
		listServiceUsagesResponse.setTotalCount(_ctx.integerValue("ListServiceUsagesResponse.TotalCount"));

		List<Policy> serviceUsages = new ArrayList<Policy>();
		for (int i = 0; i < _ctx.lengthValue("ListServiceUsagesResponse.ServiceUsages.Length"); i++) {
			Policy policy = new Policy();
			policy.setUserAliUid(_ctx.longValue("ListServiceUsagesResponse.ServiceUsages["+ i +"].UserAliUid"));
			policy.setServiceId(_ctx.stringValue("ListServiceUsagesResponse.ServiceUsages["+ i +"].ServiceId"));
			policy.setServiceName(_ctx.stringValue("ListServiceUsagesResponse.ServiceUsages["+ i +"].ServiceName"));
			policy.setSupplierName(_ctx.stringValue("ListServiceUsagesResponse.ServiceUsages["+ i +"].SupplierName"));
			policy.setStatus(_ctx.stringValue("ListServiceUsagesResponse.ServiceUsages["+ i +"].Status"));
			policy.setComments(_ctx.stringValue("ListServiceUsagesResponse.ServiceUsages["+ i +"].Comments"));
			policy.setCreateTime(_ctx.stringValue("ListServiceUsagesResponse.ServiceUsages["+ i +"].CreateTime"));
			policy.setUpdateTime(_ctx.stringValue("ListServiceUsagesResponse.ServiceUsages["+ i +"].UpdateTime"));
			policy.setUserInformation(_ctx.mapValue("ListServiceUsagesResponse.ServiceUsages["+ i +"].UserInformation"));

			serviceUsages.add(policy);
		}
		listServiceUsagesResponse.setServiceUsages(serviceUsages);
	 
	 	return listServiceUsagesResponse;
	}
}