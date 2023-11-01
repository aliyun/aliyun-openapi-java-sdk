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

package com.aliyuncs.cloud_siem.transform.v20220616;

import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertsCountResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertsCountResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlertsCountResponseUnmarshaller {

	public static DescribeAlertsCountResponse unmarshall(DescribeAlertsCountResponse describeAlertsCountResponse, UnmarshallerContext _ctx) {
		
		describeAlertsCountResponse.setRequestId(_ctx.stringValue("DescribeAlertsCountResponse.RequestId"));
		describeAlertsCountResponse.setSuccess(_ctx.booleanValue("DescribeAlertsCountResponse.Success"));
		describeAlertsCountResponse.setCode(_ctx.integerValue("DescribeAlertsCountResponse.Code"));
		describeAlertsCountResponse.setMessage(_ctx.stringValue("DescribeAlertsCountResponse.Message"));

		Data data = new Data();
		data.setHigh(_ctx.longValue("DescribeAlertsCountResponse.Data.High"));
		data.setMedium(_ctx.longValue("DescribeAlertsCountResponse.Data.Medium"));
		data.setLow(_ctx.longValue("DescribeAlertsCountResponse.Data.Low"));
		data.setAll(_ctx.longValue("DescribeAlertsCountResponse.Data.All"));
		data.setProductNum(_ctx.integerValue("DescribeAlertsCountResponse.Data.ProductNum"));
		describeAlertsCountResponse.setData(data);
	 
	 	return describeAlertsCountResponse;
	}
}