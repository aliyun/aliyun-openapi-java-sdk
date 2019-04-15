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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeScreenSecurityStatInfoResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeScreenSecurityStatInfoResponse.AttackEvent;
import com.aliyuncs.aegis.model.v20161111.DescribeScreenSecurityStatInfoResponse.HealthCheck;
import com.aliyuncs.aegis.model.v20161111.DescribeScreenSecurityStatInfoResponse.SecurityEvent;
import com.aliyuncs.aegis.model.v20161111.DescribeScreenSecurityStatInfoResponse.Vulnerability;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScreenSecurityStatInfoResponseUnmarshaller {

	public static DescribeScreenSecurityStatInfoResponse unmarshall(DescribeScreenSecurityStatInfoResponse describeScreenSecurityStatInfoResponse, UnmarshallerContext context) {
		
		describeScreenSecurityStatInfoResponse.setRequestId(context.stringValue("DescribeScreenSecurityStatInfoResponse.RequestId"));
		describeScreenSecurityStatInfoResponse.setSuccess(context.booleanValue("DescribeScreenSecurityStatInfoResponse.Success"));

		SecurityEvent securityEvent = new SecurityEvent();
		securityEvent.setSeriousCount(context.integerValue("DescribeScreenSecurityStatInfoResponse.SecurityEvent.SeriousCount"));
		securityEvent.setSuspiciousCount(context.integerValue("DescribeScreenSecurityStatInfoResponse.SecurityEvent.SuspiciousCount"));
		securityEvent.setRemindCount(context.integerValue("DescribeScreenSecurityStatInfoResponse.SecurityEvent.RemindCount"));
		securityEvent.setTotalCount(context.integerValue("DescribeScreenSecurityStatInfoResponse.SecurityEvent.TotalCount"));

		List<String> dateArray = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenSecurityStatInfoResponse.SecurityEvent.DateArray.Length"); i++) {
			dateArray.add(context.stringValue("DescribeScreenSecurityStatInfoResponse.SecurityEvent.DateArray["+ i +"]"));
		}
		securityEvent.setDateArray(dateArray);

		List<String> valueArray = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenSecurityStatInfoResponse.SecurityEvent.ValueArray.Length"); i++) {
			valueArray.add(context.stringValue("DescribeScreenSecurityStatInfoResponse.SecurityEvent.ValueArray["+ i +"]"));
		}
		securityEvent.setValueArray(valueArray);

		List<String> levelsOn = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenSecurityStatInfoResponse.SecurityEvent.LevelsOn.Length"); i++) {
			levelsOn.add(context.stringValue("DescribeScreenSecurityStatInfoResponse.SecurityEvent.LevelsOn["+ i +"]"));
		}
		securityEvent.setLevelsOn(levelsOn);

		List<String> seriousList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenSecurityStatInfoResponse.SecurityEvent.SeriousList.Length"); i++) {
			seriousList.add(context.stringValue("DescribeScreenSecurityStatInfoResponse.SecurityEvent.SeriousList["+ i +"]"));
		}
		securityEvent.setSeriousList(seriousList);

		List<String> suspiciousList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenSecurityStatInfoResponse.SecurityEvent.SuspiciousList.Length"); i++) {
			suspiciousList.add(context.stringValue("DescribeScreenSecurityStatInfoResponse.SecurityEvent.SuspiciousList["+ i +"]"));
		}
		securityEvent.setSuspiciousList(suspiciousList);

		List<String> remindList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenSecurityStatInfoResponse.SecurityEvent.RemindList.Length"); i++) {
			remindList.add(context.stringValue("DescribeScreenSecurityStatInfoResponse.SecurityEvent.RemindList["+ i +"]"));
		}
		securityEvent.setRemindList(remindList);
		describeScreenSecurityStatInfoResponse.setSecurityEvent(securityEvent);

		AttackEvent attackEvent = new AttackEvent();
		attackEvent.setTotalCount(context.integerValue("DescribeScreenSecurityStatInfoResponse.AttackEvent.TotalCount"));

		List<String> dateArray1 = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenSecurityStatInfoResponse.AttackEvent.DateArray.Length"); i++) {
			dateArray1.add(context.stringValue("DescribeScreenSecurityStatInfoResponse.AttackEvent.DateArray["+ i +"]"));
		}
		attackEvent.setDateArray1(dateArray1);

		List<String> valueArray2 = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenSecurityStatInfoResponse.AttackEvent.ValueArray.Length"); i++) {
			valueArray2.add(context.stringValue("DescribeScreenSecurityStatInfoResponse.AttackEvent.ValueArray["+ i +"]"));
		}
		attackEvent.setValueArray2(valueArray2);
		describeScreenSecurityStatInfoResponse.setAttackEvent(attackEvent);

		HealthCheck healthCheck = new HealthCheck();
		healthCheck.setMediumCount(context.integerValue("DescribeScreenSecurityStatInfoResponse.HealthCheck.MediumCount"));
		healthCheck.setHighCount(context.integerValue("DescribeScreenSecurityStatInfoResponse.HealthCheck.HighCount"));
		healthCheck.setLowCount(context.integerValue("DescribeScreenSecurityStatInfoResponse.HealthCheck.LowCount"));
		healthCheck.setTotalCount(context.integerValue("DescribeScreenSecurityStatInfoResponse.HealthCheck.TotalCount"));

		List<String> dateArray3 = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenSecurityStatInfoResponse.HealthCheck.DateArray.Length"); i++) {
			dateArray3.add(context.stringValue("DescribeScreenSecurityStatInfoResponse.HealthCheck.DateArray["+ i +"]"));
		}
		healthCheck.setDateArray3(dateArray3);

		List<String> valueArray4 = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenSecurityStatInfoResponse.HealthCheck.ValueArray.Length"); i++) {
			valueArray4.add(context.stringValue("DescribeScreenSecurityStatInfoResponse.HealthCheck.ValueArray["+ i +"]"));
		}
		healthCheck.setValueArray4(valueArray4);

		List<String> levelsOn5 = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenSecurityStatInfoResponse.HealthCheck.LevelsOn.Length"); i++) {
			levelsOn5.add(context.stringValue("DescribeScreenSecurityStatInfoResponse.HealthCheck.LevelsOn["+ i +"]"));
		}
		healthCheck.setLevelsOn5(levelsOn5);

		List<String> highList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenSecurityStatInfoResponse.HealthCheck.HighList.Length"); i++) {
			highList.add(context.stringValue("DescribeScreenSecurityStatInfoResponse.HealthCheck.HighList["+ i +"]"));
		}
		healthCheck.setHighList(highList);

		List<String> mediumList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenSecurityStatInfoResponse.HealthCheck.MediumList.Length"); i++) {
			mediumList.add(context.stringValue("DescribeScreenSecurityStatInfoResponse.HealthCheck.MediumList["+ i +"]"));
		}
		healthCheck.setMediumList(mediumList);

		List<String> lowList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenSecurityStatInfoResponse.HealthCheck.LowList.Length"); i++) {
			lowList.add(context.stringValue("DescribeScreenSecurityStatInfoResponse.HealthCheck.LowList["+ i +"]"));
		}
		healthCheck.setLowList(lowList);
		describeScreenSecurityStatInfoResponse.setHealthCheck(healthCheck);

		Vulnerability vulnerability = new Vulnerability();
		vulnerability.setNntfCount(context.integerValue("DescribeScreenSecurityStatInfoResponse.Vulnerability.NntfCount"));
		vulnerability.setLaterCount(context.integerValue("DescribeScreenSecurityStatInfoResponse.Vulnerability.LaterCount"));
		vulnerability.setAsapCount(context.integerValue("DescribeScreenSecurityStatInfoResponse.Vulnerability.AsapCount"));
		vulnerability.setTotalCount(context.integerValue("DescribeScreenSecurityStatInfoResponse.Vulnerability.TotalCount"));

		List<String> dateArray6 = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenSecurityStatInfoResponse.Vulnerability.DateArray.Length"); i++) {
			dateArray6.add(context.stringValue("DescribeScreenSecurityStatInfoResponse.Vulnerability.DateArray["+ i +"]"));
		}
		vulnerability.setDateArray6(dateArray6);

		List<String> valueArray7 = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenSecurityStatInfoResponse.Vulnerability.ValueArray.Length"); i++) {
			valueArray7.add(context.stringValue("DescribeScreenSecurityStatInfoResponse.Vulnerability.ValueArray["+ i +"]"));
		}
		vulnerability.setValueArray7(valueArray7);

		List<String> levelsOn8 = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenSecurityStatInfoResponse.Vulnerability.LevelsOn.Length"); i++) {
			levelsOn8.add(context.stringValue("DescribeScreenSecurityStatInfoResponse.Vulnerability.LevelsOn["+ i +"]"));
		}
		vulnerability.setLevelsOn8(levelsOn8);

		List<String> nntfList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenSecurityStatInfoResponse.Vulnerability.NntfList.Length"); i++) {
			nntfList.add(context.stringValue("DescribeScreenSecurityStatInfoResponse.Vulnerability.NntfList["+ i +"]"));
		}
		vulnerability.setNntfList(nntfList);

		List<String> asapList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenSecurityStatInfoResponse.Vulnerability.AsapList.Length"); i++) {
			asapList.add(context.stringValue("DescribeScreenSecurityStatInfoResponse.Vulnerability.AsapList["+ i +"]"));
		}
		vulnerability.setAsapList(asapList);

		List<String> laterList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenSecurityStatInfoResponse.Vulnerability.LaterList.Length"); i++) {
			laterList.add(context.stringValue("DescribeScreenSecurityStatInfoResponse.Vulnerability.LaterList["+ i +"]"));
		}
		vulnerability.setLaterList(laterList);
		describeScreenSecurityStatInfoResponse.setVulnerability(vulnerability);
	 
	 	return describeScreenSecurityStatInfoResponse;
	}
}