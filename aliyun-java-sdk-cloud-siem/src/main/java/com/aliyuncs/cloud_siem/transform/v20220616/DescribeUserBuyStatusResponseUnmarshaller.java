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

import com.aliyuncs.cloud_siem.model.v20220616.DescribeUserBuyStatusResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeUserBuyStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserBuyStatusResponseUnmarshaller {

	public static DescribeUserBuyStatusResponse unmarshall(DescribeUserBuyStatusResponse describeUserBuyStatusResponse, UnmarshallerContext _ctx) {
		
		describeUserBuyStatusResponse.setRequestId(_ctx.stringValue("DescribeUserBuyStatusResponse.RequestId"));

		Data data = new Data();
		data.setMasterUserId(_ctx.longValue("DescribeUserBuyStatusResponse.Data.MasterUserId"));
		data.setMasterUserName(_ctx.stringValue("DescribeUserBuyStatusResponse.Data.MasterUserName"));
		data.setMainUserId(_ctx.longValue("DescribeUserBuyStatusResponse.Data.MainUserId"));
		data.setMainUserName(_ctx.stringValue("DescribeUserBuyStatusResponse.Data.MainUserName"));
		data.setSubUserId(_ctx.longValue("DescribeUserBuyStatusResponse.Data.SubUserId"));
		data.setSubUserName(_ctx.stringValue("DescribeUserBuyStatusResponse.Data.SubUserName"));
		data.setCapacity(_ctx.integerValue("DescribeUserBuyStatusResponse.Data.Capacity"));
		data.setSasInstanceId(_ctx.stringValue("DescribeUserBuyStatusResponse.Data.SasInstanceId"));
		data.setCanBuy(_ctx.booleanValue("DescribeUserBuyStatusResponse.Data.CanBuy"));
		data.setEndTime(_ctx.longValue("DescribeUserBuyStatusResponse.Data.EndTime"));
		data.setDurationDays(_ctx.longValue("DescribeUserBuyStatusResponse.Data.DurationDays"));
		describeUserBuyStatusResponse.setData(data);
	 
	 	return describeUserBuyStatusResponse;
	}
}