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

	public static DescribeRateResponse unmarshall(DescribeRateResponse describeRateResponse, UnmarshallerContext _ctx) {
		
		describeRateResponse.setRequestId(_ctx.stringValue("DescribeRateResponse.RequestId"));
		describeRateResponse.setId(_ctx.longValue("DescribeRateResponse.Id"));
		describeRateResponse.setOrderId(_ctx.stringValue("DescribeRateResponse.OrderId"));
		describeRateResponse.setInstanceId(_ctx.stringValue("DescribeRateResponse.InstanceId"));
		describeRateResponse.setAliUid(_ctx.longValue("DescribeRateResponse.AliUid"));
		describeRateResponse.setProductId(_ctx.stringValue("DescribeRateResponse.ProductId"));
		describeRateResponse.setScore(_ctx.stringValue("DescribeRateResponse.Score"));
		describeRateResponse.setContent(_ctx.stringValue("DescribeRateResponse.Content"));
		describeRateResponse.setGmtCreated(_ctx.longValue("DescribeRateResponse.GmtCreated"));
		describeRateResponse.setExplaintion(_ctx.stringValue("DescribeRateResponse.Explaintion"));
		describeRateResponse.setGmtExplaintion(_ctx.longValue("DescribeRateResponse.GmtExplaintion"));
		describeRateResponse.setAdditionalContent(_ctx.stringValue("DescribeRateResponse.AdditionalContent"));
		describeRateResponse.setGmtAdditional(_ctx.longValue("DescribeRateResponse.GmtAdditional"));
		describeRateResponse.setAdditionalExplaintion(_ctx.stringValue("DescribeRateResponse.AdditionalExplaintion"));
		describeRateResponse.setGmtAdditionalExplaintion(_ctx.longValue("DescribeRateResponse.GmtAdditionalExplaintion"));
		describeRateResponse.setType(_ctx.stringValue("DescribeRateResponse.Type"));
	 
	 	return describeRateResponse;
	}
}