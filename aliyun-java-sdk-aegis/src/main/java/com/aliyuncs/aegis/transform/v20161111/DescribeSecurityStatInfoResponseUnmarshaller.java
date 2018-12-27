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

import com.aliyuncs.aegis.model.v20161111.DescribeSecurityStatInfoResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeSecurityStatInfoResponse.AttackEvent;
import com.aliyuncs.aegis.model.v20161111.DescribeSecurityStatInfoResponse.HealthCheck;
import com.aliyuncs.aegis.model.v20161111.DescribeSecurityStatInfoResponse.SecurityEvent;
import com.aliyuncs.aegis.model.v20161111.DescribeSecurityStatInfoResponse.Vulnerability;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecurityStatInfoResponseUnmarshaller {

	public static DescribeSecurityStatInfoResponse unmarshall(DescribeSecurityStatInfoResponse describeSecurityStatInfoResponse, UnmarshallerContext context) {
		
		describeSecurityStatInfoResponse.setRequestId(context.stringValue("DescribeSecurityStatInfoResponse.RequestId"));
		describeSecurityStatInfoResponse.setSuccess(context.booleanValue("DescribeSecurityStatInfoResponse.Success"));

		SecurityEvent securityEvent = new SecurityEvent();
		securityEvent.setSeriousCount(context.integerValue("DescribeSecurityStatInfoResponse.SecurityEvent.SeriousCount"));
		securityEvent.setSuspiciousCount(context.integerValue("DescribeSecurityStatInfoResponse.SecurityEvent.SuspiciousCount"));
		securityEvent.setRemindCount(context.integerValue("DescribeSecurityStatInfoResponse.SecurityEvent.RemindCount"));
		securityEvent.setTotalCount(context.integerValue("DescribeSecurityStatInfoResponse.SecurityEvent.TotalCount"));

		List<String> dateArray = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeSecurityStatInfoResponse.SecurityEvent.DateArray.Length"); i++) {
			dateArray.add(context.stringValue("DescribeSecurityStatInfoResponse.SecurityEvent.DateArray["+ i +"]"));
		}
		securityEvent.setDateArray(dateArray);

		List<String> valueArray = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeSecurityStatInfoResponse.SecurityEvent.ValueArray.Length"); i++) {
			valueArray.add(context.stringValue("DescribeSecurityStatInfoResponse.SecurityEvent.ValueArray["+ i +"]"));
		}
		securityEvent.setValueArray(valueArray);

		List<String> levelsOn = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeSecurityStatInfoResponse.SecurityEvent.LevelsOn.Length"); i++) {
			levelsOn.add(context.stringValue("DescribeSecurityStatInfoResponse.SecurityEvent.LevelsOn["+ i +"]"));
		}
		securityEvent.setLevelsOn(levelsOn);
		describeSecurityStatInfoResponse.setSecurityEvent(securityEvent);

		AttackEvent attackEvent = new AttackEvent();
		attackEvent.setTotalCount(context.integerValue("DescribeSecurityStatInfoResponse.AttackEvent.TotalCount"));

		List<String> dateArray1 = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeSecurityStatInfoResponse.AttackEvent.DateArray.Length"); i++) {
			dateArray1.add(context.stringValue("DescribeSecurityStatInfoResponse.AttackEvent.DateArray["+ i +"]"));
		}
		attackEvent.setDateArray1(dateArray1);

		List<String> valueArray2 = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeSecurityStatInfoResponse.AttackEvent.ValueArray.Length"); i++) {
			valueArray2.add(context.stringValue("DescribeSecurityStatInfoResponse.AttackEvent.ValueArray["+ i +"]"));
		}
		attackEvent.setValueArray2(valueArray2);
		describeSecurityStatInfoResponse.setAttackEvent(attackEvent);

		HealthCheck healthCheck = new HealthCheck();
		healthCheck.setMediumCount(context.integerValue("DescribeSecurityStatInfoResponse.HealthCheck.MediumCount"));
		healthCheck.setHighCount(context.integerValue("DescribeSecurityStatInfoResponse.HealthCheck.HighCount"));
		healthCheck.setLowCount(context.integerValue("DescribeSecurityStatInfoResponse.HealthCheck.LowCount"));
		healthCheck.setTotalCount(context.integerValue("DescribeSecurityStatInfoResponse.HealthCheck.TotalCount"));

		List<String> dateArray3 = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeSecurityStatInfoResponse.HealthCheck.DateArray.Length"); i++) {
			dateArray3.add(context.stringValue("DescribeSecurityStatInfoResponse.HealthCheck.DateArray["+ i +"]"));
		}
		healthCheck.setDateArray3(dateArray3);

		List<String> valueArray4 = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeSecurityStatInfoResponse.HealthCheck.ValueArray.Length"); i++) {
			valueArray4.add(context.stringValue("DescribeSecurityStatInfoResponse.HealthCheck.ValueArray["+ i +"]"));
		}
		healthCheck.setValueArray4(valueArray4);

		List<String> levelsOn5 = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeSecurityStatInfoResponse.HealthCheck.LevelsOn.Length"); i++) {
			levelsOn5.add(context.stringValue("DescribeSecurityStatInfoResponse.HealthCheck.LevelsOn["+ i +"]"));
		}
		healthCheck.setLevelsOn5(levelsOn5);
		describeSecurityStatInfoResponse.setHealthCheck(healthCheck);

		Vulnerability vulnerability = new Vulnerability();
		vulnerability.setNntfCount(context.integerValue("DescribeSecurityStatInfoResponse.Vulnerability.NntfCount"));
		vulnerability.setLaterCount(context.integerValue("DescribeSecurityStatInfoResponse.Vulnerability.LaterCount"));
		vulnerability.setAsapCount(context.integerValue("DescribeSecurityStatInfoResponse.Vulnerability.AsapCount"));
		vulnerability.setTotalCount(context.integerValue("DescribeSecurityStatInfoResponse.Vulnerability.TotalCount"));

		List<String> dateArray6 = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeSecurityStatInfoResponse.Vulnerability.DateArray.Length"); i++) {
			dateArray6.add(context.stringValue("DescribeSecurityStatInfoResponse.Vulnerability.DateArray["+ i +"]"));
		}
		vulnerability.setDateArray6(dateArray6);

		List<String> valueArray7 = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeSecurityStatInfoResponse.Vulnerability.ValueArray.Length"); i++) {
			valueArray7.add(context.stringValue("DescribeSecurityStatInfoResponse.Vulnerability.ValueArray["+ i +"]"));
		}
		vulnerability.setValueArray7(valueArray7);

		List<String> levelsOn8 = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeSecurityStatInfoResponse.Vulnerability.LevelsOn.Length"); i++) {
			levelsOn8.add(context.stringValue("DescribeSecurityStatInfoResponse.Vulnerability.LevelsOn["+ i +"]"));
		}
		vulnerability.setLevelsOn8(levelsOn8);
		describeSecurityStatInfoResponse.setVulnerability(vulnerability);
	 
	 	return describeSecurityStatInfoResponse;
	}
}