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

package com.aliyuncs.advisor_share.transform.v20180608;

import com.aliyuncs.advisor_share.model.v20180608.DescribeAdvisorUserResponse;
import com.aliyuncs.advisor_share.model.v20180608.DescribeAdvisorUserResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAdvisorUserResponseUnmarshaller {

	public static DescribeAdvisorUserResponse unmarshall(DescribeAdvisorUserResponse describeAdvisorUserResponse, UnmarshallerContext _ctx) {
		
		describeAdvisorUserResponse.setRequestId(_ctx.stringValue("DescribeAdvisorUserResponse.RequestId"));

		Data data = new Data();
		data.setShowTam(_ctx.booleanValue("DescribeAdvisorUserResponse.Data.ShowTam"));
		data.setAdviceStatus(_ctx.stringValue("DescribeAdvisorUserResponse.Data.AdviceStatus"));
		data.setAuthorized(_ctx.booleanValue("DescribeAdvisorUserResponse.Data.Authorized"));
		data.setTamAuthorized(_ctx.booleanValue("DescribeAdvisorUserResponse.Data.TamAuthorized"));
		data.setAliyunId(_ctx.longValue("DescribeAdvisorUserResponse.Data.AliyunId"));
		data.setProductStatus(_ctx.stringValue("DescribeAdvisorUserResponse.Data.ProductStatus"));
		data.setResourceStatus(_ctx.stringValue("DescribeAdvisorUserResponse.Data.ResourceStatus"));
		data.setCostAuthorized(_ctx.booleanValue("DescribeAdvisorUserResponse.Data.CostAuthorized"));
		describeAdvisorUserResponse.setData(data);
	 
	 	return describeAdvisorUserResponse;
	}
}