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

package com.aliyuncs.baas.transform.v20180731;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20180731.DescribeOrganizationPeersResponse;
import com.aliyuncs.baas.model.v20180731.DescribeOrganizationPeersResponse.ResultItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOrganizationPeersResponseUnmarshaller {

	public static DescribeOrganizationPeersResponse unmarshall(DescribeOrganizationPeersResponse describeOrganizationPeersResponse, UnmarshallerContext context) {
		
		describeOrganizationPeersResponse.setRequestId(context.stringValue("DescribeOrganizationPeersResponse.RequestId"));
		describeOrganizationPeersResponse.setSuccess(context.booleanValue("DescribeOrganizationPeersResponse.Success"));
		describeOrganizationPeersResponse.setErrorCode(context.integerValue("DescribeOrganizationPeersResponse.ErrorCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < context.lengthValue("DescribeOrganizationPeersResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setName(context.stringValue("DescribeOrganizationPeersResponse.Result["+ i +"].Name"));
			resultItem.setIsAnchor(context.booleanValue("DescribeOrganizationPeersResponse.Result["+ i +"].IsAnchor"));
			resultItem.setIntranetIp(context.stringValue("DescribeOrganizationPeersResponse.Result["+ i +"].IntranetIp"));
			resultItem.setInternetIp(context.stringValue("DescribeOrganizationPeersResponse.Result["+ i +"].InternetIp"));
			resultItem.setDomain(context.stringValue("DescribeOrganizationPeersResponse.Result["+ i +"].Domain"));
			resultItem.setPort(context.integerValue("DescribeOrganizationPeersResponse.Result["+ i +"].Port"));
			resultItem.setInstanceType(context.stringValue("DescribeOrganizationPeersResponse.Result["+ i +"].InstanceType"));
			resultItem.setCreateTime(context.stringValue("DescribeOrganizationPeersResponse.Result["+ i +"].CreateTime"));
			resultItem.setUpdateTime(context.stringValue("DescribeOrganizationPeersResponse.Result["+ i +"].UpdateTime"));

			result.add(resultItem);
		}
		describeOrganizationPeersResponse.setResult(result);
	 
	 	return describeOrganizationPeersResponse;
	}
}