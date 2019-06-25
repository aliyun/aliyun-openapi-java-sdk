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

import com.aliyuncs.market.model.v20151101.DescribeRateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRateResponseUnmarshaller {

	public static DescribeRateResponse unmarshall(DescribeRateResponse describeRateResponse, UnmarshallerContext context) {
		
		describeRateResponse.setRequestId(context.stringValue("DescribeRateResponse.RequestId"));
		describeRateResponse.setId(context.longValue("DescribeRateResponse.Id"));
		describeRateResponse.setOrderId(context.stringValue("DescribeRateResponse.OrderId"));
		describeRateResponse.setInstanceId(context.stringValue("DescribeRateResponse.InstanceId"));
		describeRateResponse.setAliUid(context.longValue("DescribeRateResponse.AliUid"));
		describeRateResponse.setProductId(context.stringValue("DescribeRateResponse.ProductId"));
		describeRateResponse.setScore(context.stringValue("DescribeRateResponse.Score"));
		describeRateResponse.setContent(context.stringValue("DescribeRateResponse.Content"));
		describeRateResponse.setGmtCreated(context.longValue("DescribeRateResponse.GmtCreated"));
		describeRateResponse.setExplaintion(context.stringValue("DescribeRateResponse.Explaintion"));
		describeRateResponse.setGmtExplaintion(context.longValue("DescribeRateResponse.GmtExplaintion"));
		describeRateResponse.setAdditionalContent(context.stringValue("DescribeRateResponse.AdditionalContent"));
		describeRateResponse.setGmtAdditional(context.longValue("DescribeRateResponse.GmtAdditional"));
		describeRateResponse.setAdditionalExplaintion(context.stringValue("DescribeRateResponse.AdditionalExplaintion"));
		describeRateResponse.setGmtAdditionalExplaintion(context.longValue("DescribeRateResponse.GmtAdditionalExplaintion"));
		describeRateResponse.setType(context.stringValue("DescribeRateResponse.Type"));
	 
	 	return describeRateResponse;
	}
}