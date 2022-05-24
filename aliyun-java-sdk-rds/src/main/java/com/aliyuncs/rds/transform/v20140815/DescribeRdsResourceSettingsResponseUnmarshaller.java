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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeRdsResourceSettingsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRdsResourceSettingsResponse.RdsInstanceResourceSetting;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRdsResourceSettingsResponseUnmarshaller {

	public static DescribeRdsResourceSettingsResponse unmarshall(DescribeRdsResourceSettingsResponse describeRdsResourceSettingsResponse, UnmarshallerContext _ctx) {
		
		describeRdsResourceSettingsResponse.setRequestId(_ctx.stringValue("DescribeRdsResourceSettingsResponse.RequestId"));

		List<RdsInstanceResourceSetting> rdsInstanceResourceSettings = new ArrayList<RdsInstanceResourceSetting>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRdsResourceSettingsResponse.RdsInstanceResourceSettings.Length"); i++) {
			RdsInstanceResourceSetting rdsInstanceResourceSetting = new RdsInstanceResourceSetting();
			rdsInstanceResourceSetting.setPoppedUpButtonType(_ctx.stringValue("DescribeRdsResourceSettingsResponse.RdsInstanceResourceSettings["+ i +"].PoppedUpButtonType"));
			rdsInstanceResourceSetting.setNoticeBarContent(_ctx.stringValue("DescribeRdsResourceSettingsResponse.RdsInstanceResourceSettings["+ i +"].NoticeBarContent"));
			rdsInstanceResourceSetting.setEndDate(_ctx.stringValue("DescribeRdsResourceSettingsResponse.RdsInstanceResourceSettings["+ i +"].EndDate"));
			rdsInstanceResourceSetting.setPoppedUpContent(_ctx.stringValue("DescribeRdsResourceSettingsResponse.RdsInstanceResourceSettings["+ i +"].PoppedUpContent"));
			rdsInstanceResourceSetting.setStartDate(_ctx.stringValue("DescribeRdsResourceSettingsResponse.RdsInstanceResourceSettings["+ i +"].StartDate"));
			rdsInstanceResourceSetting.setPoppedUpButtonText(_ctx.stringValue("DescribeRdsResourceSettingsResponse.RdsInstanceResourceSettings["+ i +"].PoppedUpButtonText"));
			rdsInstanceResourceSetting.setIsTop(_ctx.stringValue("DescribeRdsResourceSettingsResponse.RdsInstanceResourceSettings["+ i +"].IsTop"));
			rdsInstanceResourceSetting.setResourceNiche(_ctx.stringValue("DescribeRdsResourceSettingsResponse.RdsInstanceResourceSettings["+ i +"].ResourceNiche"));
			rdsInstanceResourceSetting.setPoppedUpButtonUrl(_ctx.stringValue("DescribeRdsResourceSettingsResponse.RdsInstanceResourceSettings["+ i +"].PoppedUpButtonUrl"));

			rdsInstanceResourceSettings.add(rdsInstanceResourceSetting);
		}
		describeRdsResourceSettingsResponse.setRdsInstanceResourceSettings(rdsInstanceResourceSettings);
	 
	 	return describeRdsResourceSettingsResponse;
	}
}