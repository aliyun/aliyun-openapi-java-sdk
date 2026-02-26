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

package com.aliyuncs.market.transform.v20151101;

import com.aliyuncs.market.model.v20151101.DescribeInstanceForIsvResponse;
import com.aliyuncs.market.model.v20151101.DescribeInstanceForIsvResponse.RelationalData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceForIsvResponseUnmarshaller {

	public static DescribeInstanceForIsvResponse unmarshall(DescribeInstanceForIsvResponse describeInstanceForIsvResponse, UnmarshallerContext _ctx) {
		
		describeInstanceForIsvResponse.setRequestId(_ctx.stringValue("DescribeInstanceForIsvResponse.RequestId"));
		describeInstanceForIsvResponse.setStatus(_ctx.stringValue("DescribeInstanceForIsvResponse.Status"));
		describeInstanceForIsvResponse.setProductName(_ctx.stringValue("DescribeInstanceForIsvResponse.ProductName"));
		describeInstanceForIsvResponse.setInstanceId(_ctx.longValue("DescribeInstanceForIsvResponse.InstanceId"));
		describeInstanceForIsvResponse.setExtendJson(_ctx.stringValue("DescribeInstanceForIsvResponse.ExtendJson"));
		describeInstanceForIsvResponse.setIsTrial(_ctx.booleanValue("DescribeInstanceForIsvResponse.IsTrial"));
		describeInstanceForIsvResponse.setBeganOn(_ctx.longValue("DescribeInstanceForIsvResponse.BeganOn"));
		describeInstanceForIsvResponse.setComponentJson(_ctx.stringValue("DescribeInstanceForIsvResponse.ComponentJson"));
		describeInstanceForIsvResponse.setProductType(_ctx.stringValue("DescribeInstanceForIsvResponse.ProductType"));
		describeInstanceForIsvResponse.setProductSkuCode(_ctx.stringValue("DescribeInstanceForIsvResponse.ProductSkuCode"));
		describeInstanceForIsvResponse.setCreatedOn(_ctx.longValue("DescribeInstanceForIsvResponse.CreatedOn"));
		describeInstanceForIsvResponse.setEndOn(_ctx.longValue("DescribeInstanceForIsvResponse.EndOn"));
		describeInstanceForIsvResponse.setOrderId(_ctx.longValue("DescribeInstanceForIsvResponse.OrderId"));
		describeInstanceForIsvResponse.setProductCode(_ctx.stringValue("DescribeInstanceForIsvResponse.ProductCode"));
		describeInstanceForIsvResponse.setSupplierName(_ctx.stringValue("DescribeInstanceForIsvResponse.SupplierName"));

		RelationalData relationalData = new RelationalData();
		relationalData.setServiceStatus(_ctx.stringValue("DescribeInstanceForIsvResponse.RelationalData.ServiceStatus"));
		describeInstanceForIsvResponse.setRelationalData(relationalData);
	 
	 	return describeInstanceForIsvResponse;
	}
}