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

package com.aliyuncs.uisplus.transform.v20200707;

import com.aliyuncs.uisplus.model.v20200707.DescribeVnetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVnetResponseUnmarshaller {

	public static DescribeVnetResponse unmarshall(DescribeVnetResponse describeVnetResponse, UnmarshallerContext _ctx) {
		
		describeVnetResponse.setRequestId(_ctx.stringValue("DescribeVnetResponse.RequestId"));
		describeVnetResponse.setUisId(_ctx.stringValue("DescribeVnetResponse.UisId"));
		describeVnetResponse.setKppsQuota(_ctx.stringValue("DescribeVnetResponse.KppsQuota"));
		describeVnetResponse.setWildcardDomainState(_ctx.stringValue("DescribeVnetResponse.WildcardDomainState"));
		describeVnetResponse.setCidrs(_ctx.stringValue("DescribeVnetResponse.Cidrs"));
		describeVnetResponse.setFlowQuota(_ctx.stringValue("DescribeVnetResponse.FlowQuota"));
		describeVnetResponse.setMbpsQuota(_ctx.stringValue("DescribeVnetResponse.MbpsQuota"));
		describeVnetResponse.setState(_ctx.stringValue("DescribeVnetResponse.State"));
		describeVnetResponse.setVnetId(_ctx.stringValue("DescribeVnetResponse.VnetId"));
		describeVnetResponse.setName(_ctx.stringValue("DescribeVnetResponse.Name"));
	 
	 	return describeVnetResponse;
	}
}