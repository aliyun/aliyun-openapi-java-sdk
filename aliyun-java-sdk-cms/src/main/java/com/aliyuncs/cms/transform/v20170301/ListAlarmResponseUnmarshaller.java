/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cms.transform.v20170301;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20170301.ListAlarmResponse;
import com.aliyuncs.cms.model.v20170301.ListAlarmResponse.Alarm;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAlarmResponseUnmarshaller {

	public static ListAlarmResponse unmarshall(ListAlarmResponse listAlarmResponse, UnmarshallerContext context) {
		
		listAlarmResponse.setRequestId(context.stringValue("ListAlarmResponse.RequestId"));
		listAlarmResponse.setSuccess(context.booleanValue("ListAlarmResponse.Success"));
		listAlarmResponse.setCode(context.stringValue("ListAlarmResponse.Code"));
		listAlarmResponse.setMessage(context.stringValue("ListAlarmResponse.Message"));
		listAlarmResponse.setNextToken(context.integerValue("ListAlarmResponse.NextToken"));
		listAlarmResponse.setTotal(context.integerValue("ListAlarmResponse.Total"));

		List<Alarm> alarmList = new ArrayList<Alarm>();
		for (int i = 0; i < context.lengthValue("ListAlarmResponse.AlarmList.Length"); i++) {
			Alarm alarm = new Alarm();
			alarm.setId(context.stringValue("ListAlarmResponse.AlarmList["+ i +"].Id"));
			alarm.setName(context.stringValue("ListAlarmResponse.AlarmList["+ i +"].Name"));
			alarm.setNamespace(context.stringValue("ListAlarmResponse.AlarmList["+ i +"].Namespace"));
			alarm.setMetricName(context.stringValue("ListAlarmResponse.AlarmList["+ i +"].MetricName"));
			alarm.setDimensions(context.stringValue("ListAlarmResponse.AlarmList["+ i +"].Dimensions"));
			alarm.setPeriod(context.integerValue("ListAlarmResponse.AlarmList["+ i +"].Period"));
			alarm.setStatistics(context.stringValue("ListAlarmResponse.AlarmList["+ i +"].Statistics"));
			alarm.setComparisonOperator(context.stringValue("ListAlarmResponse.AlarmList["+ i +"].ComparisonOperator"));
			alarm.setThreshold(context.stringValue("ListAlarmResponse.AlarmList["+ i +"].Threshold"));
			alarm.setEvaluationCount(context.integerValue("ListAlarmResponse.AlarmList["+ i +"].EvaluationCount"));
			alarm.setStartTime(context.integerValue("ListAlarmResponse.AlarmList["+ i +"].StartTime"));
			alarm.setEndTime(context.integerValue("ListAlarmResponse.AlarmList["+ i +"].EndTime"));
			alarm.setSilenceTime(context.integerValue("ListAlarmResponse.AlarmList["+ i +"].SilenceTime"));
			alarm.setNotifyType(context.integerValue("ListAlarmResponse.AlarmList["+ i +"].NotifyType"));
			alarm.setEnable(context.booleanValue("ListAlarmResponse.AlarmList["+ i +"].Enable"));
			alarm.setState(context.stringValue("ListAlarmResponse.AlarmList["+ i +"].State"));

			List<String> contactGroups = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListAlarmResponse.AlarmList["+ i +"].ContactGroups.Length"); j++) {
				contactGroups.add(context.stringValue("ListAlarmResponse.AlarmList["+ i +"].ContactGroups["+ j +"]"));
			}
			alarm.setContactGroups(contactGroups);

			alarmList.add(alarm);
		}
		listAlarmResponse.setAlarmList(alarmList);
	 
	 	return listAlarmResponse;
	}
}