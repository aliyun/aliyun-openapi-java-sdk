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

package com.aliyuncs.cas.transform.v20180813;

import com.aliyuncs.cas.model.v20180813.DescribeOrderDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOrderDetailResponseUnmarshaller {

	public static DescribeOrderDetailResponse unmarshall(DescribeOrderDetailResponse describeOrderDetailResponse, UnmarshallerContext context) {
		
		describeOrderDetailResponse.setRequestId(context.stringValue("DescribeOrderDetailResponse.RequestId"));
		describeOrderDetailResponse.setId(context.integerValue("DescribeOrderDetailResponse.Id"));
		describeOrderDetailResponse.setSourceType(context.stringValue("DescribeOrderDetailResponse.SourceType"));
		describeOrderDetailResponse.setInstanceId(context.stringValue("DescribeOrderDetailResponse.InstanceId"));
		describeOrderDetailResponse.setOrderId(context.longValue("DescribeOrderDetailResponse.OrderId"));
		describeOrderDetailResponse.setYear(context.integerValue("DescribeOrderDetailResponse.Year"));
		describeOrderDetailResponse.setBuyDate(context.integerValue("DescribeOrderDetailResponse.BuyDate"));
		describeOrderDetailResponse.setDomain(context.stringValue("DescribeOrderDetailResponse.Domain"));
		describeOrderDetailResponse.setStatusCode(context.integerValue("DescribeOrderDetailResponse.StatusCode"));
		describeOrderDetailResponse.setBrandName(context.stringValue("DescribeOrderDetailResponse.BrandName"));
		describeOrderDetailResponse.setProductAliasName(context.stringValue("DescribeOrderDetailResponse.ProductAliasName"));
		describeOrderDetailResponse.setCertType(context.stringValue("DescribeOrderDetailResponse.CertType"));
	 
	 	return describeOrderDetailResponse;
	}
}