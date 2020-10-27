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

package com.aliyuncs.cloudesl.transform.v20180801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20180801.DescribeAlarmsResponse;
import com.aliyuncs.cloudesl.model.v20180801.DescribeAlarmsResponse.AlarmInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlarmsResponseUnmarshaller {

	public static DescribeAlarmsResponse unmarshall(DescribeAlarmsResponse describeAlarmsResponse, UnmarshallerContext _ctx) {
		
		describeAlarmsResponse.setRequestId(_ctx.stringValue("DescribeAlarmsResponse.RequestId"));
		describeAlarmsResponse.setSuccess(_ctx.booleanValue("DescribeAlarmsResponse.Success"));
		describeAlarmsResponse.setMessage(_ctx.stringValue("DescribeAlarmsResponse.Message"));
		describeAlarmsResponse.setErrorCode(_ctx.stringValue("DescribeAlarmsResponse.ErrorCode"));
		describeAlarmsResponse.setTotalCount(_ctx.integerValue("DescribeAlarmsResponse.TotalCount"));
		describeAlarmsResponse.setPageNumber(_ctx.integerValue("DescribeAlarmsResponse.PageNumber"));
		describeAlarmsResponse.setPageSize(_ctx.integerValue("DescribeAlarmsResponse.PageSize"));

		List<AlarmInfo> alarms = new ArrayList<AlarmInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAlarmsResponse.Alarms.Length"); i++) {
			AlarmInfo alarmInfo = new AlarmInfo();
			alarmInfo.setAlarmId(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].AlarmId"));
			alarmInfo.setAlarmType(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].AlarmType"));
			alarmInfo.setDeviceType(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].DeviceType"));
			alarmInfo.setDeviceBarCode(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].DeviceBarCode"));
			alarmInfo.setDeviceMac(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].DeviceMac"));
			alarmInfo.setErrorType(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].ErrorType"));
			alarmInfo.setItemBarCode(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].ItemBarCode"));
			alarmInfo.setItemTitle(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].ItemTitle"));
			alarmInfo.setCompanyId(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].CompanyId"));
			alarmInfo.setStoreId(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].StoreId"));
			alarmInfo.setAlarmTime(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].AlarmTime"));
			alarmInfo.setAlarmStatus(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].AlarmStatus"));
			alarmInfo.setDealUserId(_ctx.longValue("DescribeAlarmsResponse.Alarms["+ i +"].DealUserId"));
			alarmInfo.setDealTime(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].DealTime"));
			alarmInfo.setVendor(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].Vendor"));
			alarmInfo.setModel(_ctx.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].Model"));

			alarms.add(alarmInfo);
		}
		describeAlarmsResponse.setAlarms(alarms);
	 
	 	return describeAlarmsResponse;
	}
}