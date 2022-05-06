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

package com.aliyuncs.educloud.transform.v20220202;

import com.aliyuncs.educloud.model.v20220202.DescribeLabTokenResponse;
import com.aliyuncs.educloud.model.v20220202.DescribeLabTokenResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLabTokenResponseUnmarshaller {

	public static DescribeLabTokenResponse unmarshall(DescribeLabTokenResponse describeLabTokenResponse, UnmarshallerContext _ctx) {
		
		describeLabTokenResponse.setRequestId(_ctx.stringValue("DescribeLabTokenResponse.RequestId"));
		describeLabTokenResponse.setSuccess(_ctx.booleanValue("DescribeLabTokenResponse.Success"));
		describeLabTokenResponse.setCode(_ctx.longValue("DescribeLabTokenResponse.Code"));
		describeLabTokenResponse.setMessage(_ctx.stringValue("DescribeLabTokenResponse.Message"));

		Data data = new Data();
		data.setLabId(_ctx.stringValue("DescribeLabTokenResponse.Data.LabId"));
		data.setOrderId(_ctx.stringValue("DescribeLabTokenResponse.Data.OrderId"));
		data.setUrl(_ctx.stringValue("DescribeLabTokenResponse.Data.Url"));
		data.setCreateTime(_ctx.stringValue("DescribeLabTokenResponse.Data.CreateTime"));
		data.setFinishStatus(_ctx.longValue("DescribeLabTokenResponse.Data.FinishStatus"));
		data.setResourceStatus(_ctx.longValue("DescribeLabTokenResponse.Data.ResourceStatus"));
		data.setResourceActualReleaseTime(_ctx.stringValue("DescribeLabTokenResponse.Data.ResourceActualReleaseTime"));
		data.setResourcePlanedReleaseTime(_ctx.stringValue("DescribeLabTokenResponse.Data.ResourcePlanedReleaseTime"));
		describeLabTokenResponse.setData(data);
	 
	 	return describeLabTokenResponse;
	}
}