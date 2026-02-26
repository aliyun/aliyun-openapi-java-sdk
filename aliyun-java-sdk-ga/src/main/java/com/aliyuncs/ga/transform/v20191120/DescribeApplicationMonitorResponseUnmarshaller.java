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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.DescribeApplicationMonitorResponse;
import com.aliyuncs.ga.model.v20191120.DescribeApplicationMonitorResponse.探测点列表;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApplicationMonitorResponseUnmarshaller {

	public static DescribeApplicationMonitorResponse unmarshall(DescribeApplicationMonitorResponse describeApplicationMonitorResponse, UnmarshallerContext _ctx) {
		
		describeApplicationMonitorResponse.setRequestId(_ctx.stringValue("DescribeApplicationMonitorResponse.RequestId"));
		describeApplicationMonitorResponse.setAcceleratorId(_ctx.stringValue("DescribeApplicationMonitorResponse.AcceleratorId"));
		describeApplicationMonitorResponse.setListenerId(_ctx.stringValue("DescribeApplicationMonitorResponse.ListenerId"));
		describeApplicationMonitorResponse.setTaskId(_ctx.stringValue("DescribeApplicationMonitorResponse.TaskId"));
		describeApplicationMonitorResponse.setTaskName(_ctx.stringValue("DescribeApplicationMonitorResponse.TaskName"));
		describeApplicationMonitorResponse.setAddress(_ctx.stringValue("DescribeApplicationMonitorResponse.Address"));
		describeApplicationMonitorResponse.setOptionsJson(_ctx.stringValue("DescribeApplicationMonitorResponse.OptionsJson"));
		describeApplicationMonitorResponse.setDetectEnable(_ctx.booleanValue("DescribeApplicationMonitorResponse.DetectEnable"));
		describeApplicationMonitorResponse.setDetectThreshold(_ctx.integerValue("DescribeApplicationMonitorResponse.DetectThreshold"));
		describeApplicationMonitorResponse.setDetectTimes(_ctx.integerValue("DescribeApplicationMonitorResponse.DetectTimes"));
		describeApplicationMonitorResponse.setSilenceTime(_ctx.integerValue("DescribeApplicationMonitorResponse.SilenceTime"));
		describeApplicationMonitorResponse.setRegionId(_ctx.stringValue("DescribeApplicationMonitorResponse.RegionId"));

		List<探测点列表> ispCityList = new ArrayList<探测点列表>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationMonitorResponse.IspCityList.Length"); i++) {
			探测点列表 探测点列表 = new 探测点列表();
			探测点列表.setIsp(_ctx.stringValue("DescribeApplicationMonitorResponse.IspCityList["+ i +"].Isp"));
			探测点列表.setIspName(_ctx.stringValue("DescribeApplicationMonitorResponse.IspCityList["+ i +"].IspName"));
			探测点列表.setCity(_ctx.stringValue("DescribeApplicationMonitorResponse.IspCityList["+ i +"].City"));
			探测点列表.setCityName(_ctx.stringValue("DescribeApplicationMonitorResponse.IspCityList["+ i +"].CityName"));

			ispCityList.add(探测点列表);
		}
		describeApplicationMonitorResponse.setIspCityList(ispCityList);
	 
	 	return describeApplicationMonitorResponse;
	}
}