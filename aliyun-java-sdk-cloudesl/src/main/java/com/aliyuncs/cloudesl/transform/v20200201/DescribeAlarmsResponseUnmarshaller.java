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

package com.aliyuncs.cloudesl.transform.v20200201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20200201.DescribeAlarmsResponse;
import com.aliyuncs.cloudesl.model.v20200201.DescribeAlarmsResponse.AlarmInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlarmsResponseUnmarshaller {

	public static DescribeAlarmsResponse unmarshall(DescribeAlarmsResponse describeAlarmsResponse, UnmarshallerContext _ctx) {
		
		describeAlarmsResponse.setRequestId(_ctx.stringValue("DescribeAlarmsResponse.RequestId"));
		describeAlarmsResponse.setErrorMessage(_ctx.stringValue("DescribeAlarmsResponse.ErrorMessage"));
		describeAlarmsResponse.setErrorCode(_ctx.stringValue("DescribeAlarmsResponse.ErrorCode"));
		describeAlarmsResponse.setPageSize(_ctx.integerValue("DescribeAlarmsResponse.PageSize"));
		describeAlarmsResponse.setMessage(_ctx.stringValue("DescribeAlarmsResponse.Message"));
		describeAlarmsResponse.setTotalCount(_ctx.integerValue("DescribeAlarmsResponse.TotalCount"));
		describeAlarmsResponse.setPageNumber(_ctx.integerValue("DescribeAlarmsResponse.PageNumber"));
		describeAlarmsResponse.setDynamicCode(_ctx.stringValue("DescribeAlarmsResponse.DynamicCode"));
		describeAlarmsResponse.setCode(_ctx.stringValue("DescribeAlarmsResponse.Code"));
		describeAlarmsResponse.setDynamicMessage(_ctx.stringValue("DescribeAlarmsResponse.DynamicMessage"));
		describeAlarmsResponse.setSuccess(_ctx.booleanValue("DescribeAlarmsResponse.Success"));

		List<AlarmInfo> alarms = new ArrayList<AlarmInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAlarmsResponse.Alarms.Length"); i++) {
			AlarmInfo alarmInfo = new AlarmInfo();
			alarmInfo.setRemark(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].Remark"));
			alarmInfo.setStoreId(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].StoreId"));
			alarmInfo.setDeviceBarCode(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].DeviceBarCode"));
			alarmInfo.setDealUserId(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].DealUserId"));
			alarmInfo.setDeviceType(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].DeviceType"));
			alarmInfo.setItemTitle(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].ItemTitle"));
			alarmInfo.setAlarmTime(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].AlarmTime"));
			alarmInfo.setErrorType(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].ErrorType"));
			alarmInfo.setDeviceMac(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].DeviceMac"));
			alarmInfo.setAlarmId(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].AlarmId"));
			alarmInfo.setRetryGmtCreate(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].RetryGmtCreate"));
			alarmInfo.setRetryGmtModified(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].RetryGmtModified"));
			alarmInfo.setItemBarCode(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].ItemBarCode"));
			alarmInfo.setRetryTimes(_ctx.longValue("DescribeAlarmsResponse.Alarms["+ i +"].RetryTimes"));
			alarmInfo.setDealTime(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].DealTime"));
			alarmInfo.setAlarmType(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].AlarmType"));
			alarmInfo.setAlarmStatus(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].AlarmStatus"));

			alarms.add(alarmInfo);
		}
		describeAlarmsResponse.setAlarms(alarms);
	 
	 	return describeAlarmsResponse;
	}
}