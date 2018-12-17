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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlarmsResponseUnmarshaller {

	public static DescribeAlarmsResponse unmarshall(DescribeAlarmsResponse describeAlarmsResponse, UnmarshallerContext context) {
		
		describeAlarmsResponse.setRequestId(context.stringValue("DescribeAlarmsResponse.RequestId"));
		describeAlarmsResponse.setSuccess(context.booleanValue("DescribeAlarmsResponse.Success"));
		describeAlarmsResponse.setMessage(context.stringValue("DescribeAlarmsResponse.Message"));
		describeAlarmsResponse.setErrorCode(context.stringValue("DescribeAlarmsResponse.ErrorCode"));
		describeAlarmsResponse.setTotalCount(context.integerValue("DescribeAlarmsResponse.TotalCount"));
		describeAlarmsResponse.setPageNumber(context.integerValue("DescribeAlarmsResponse.PageNumber"));
		describeAlarmsResponse.setPageSize(context.integerValue("DescribeAlarmsResponse.PageSize"));

		List<AlarmInfo> alarms = new ArrayList<AlarmInfo>();
		for (int i = 0; i < context.lengthValue("DescribeAlarmsResponse.Alarms.Length"); i++) {
			AlarmInfo alarmInfo = new AlarmInfo();
			alarmInfo.setAlarmId(context.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].AlarmId"));
			alarmInfo.setAlarmType(context.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].AlarmType"));
			alarmInfo.setDeviceType(context.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].DeviceType"));
			alarmInfo.setDeviceBarCode(context.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].DeviceBarCode"));
			alarmInfo.setDeviceMac(context.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].DeviceMac"));
			alarmInfo.setErrorType(context.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].ErrorType"));
			alarmInfo.setItemBarCode(context.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].ItemBarCode"));
			alarmInfo.setItemTitle(context.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].ItemTitle"));
			alarmInfo.setCompanyId(context.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].CompanyId"));
			alarmInfo.setStoreId(context.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].StoreId"));
			alarmInfo.setAlarmTime(context.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].AlarmTime"));
			alarmInfo.setAlarmStatus(context.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].AlarmStatus"));
			alarmInfo.setDealUserId(context.longValue("DescribeAlarmsResponse.Alarms["+ i +"].DealUserId"));
			alarmInfo.setDealTime(context.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].DealTime"));
			alarmInfo.setVendor(context.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].Vendor"));
			alarmInfo.setModel(context.stringValue("DescribeAlarmsResponse.Alarms["+ i +"].Model"));

			alarms.add(alarmInfo);
		}
		describeAlarmsResponse.setAlarms(alarms);
	 
	 	return describeAlarmsResponse;
	}
}