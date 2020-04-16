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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeSecurityStatInfoResponse;
import com.aliyuncs.sas.model.v20181203.DescribeSecurityStatInfoResponse.AttackEvent;
import com.aliyuncs.sas.model.v20181203.DescribeSecurityStatInfoResponse.HealthCheck;
import com.aliyuncs.sas.model.v20181203.DescribeSecurityStatInfoResponse.SecurityEvent;
import com.aliyuncs.sas.model.v20181203.DescribeSecurityStatInfoResponse.Vulnerability;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecurityStatInfoResponseUnmarshaller {

	public static DescribeSecurityStatInfoResponse unmarshall(DescribeSecurityStatInfoResponse describeSecurityStatInfoResponse, UnmarshallerContext _ctx) {
		
		describeSecurityStatInfoResponse.setRequestId(_ctx.stringValue("DescribeSecurityStatInfoResponse.RequestId"));
		describeSecurityStatInfoResponse.setSuccess(_ctx.booleanValue("DescribeSecurityStatInfoResponse.Success"));

		SecurityEvent securityEvent = new SecurityEvent();
		securityEvent.setSeriousCount(_ctx.integerValue("DescribeSecurityStatInfoResponse.SecurityEvent.SeriousCount"));
		securityEvent.setSuspiciousCount(_ctx.integerValue("DescribeSecurityStatInfoResponse.SecurityEvent.SuspiciousCount"));
		securityEvent.setRemindCount(_ctx.integerValue("DescribeSecurityStatInfoResponse.SecurityEvent.RemindCount"));
		securityEvent.setTotalCount(_ctx.integerValue("DescribeSecurityStatInfoResponse.SecurityEvent.TotalCount"));

		List<String> dateArray = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.SecurityEvent.DateArray.Length"); i++) {
			dateArray.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.SecurityEvent.DateArray["+ i +"]"));
		}
		securityEvent.setDateArray(dateArray);

		List<String> valueArray = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.SecurityEvent.ValueArray.Length"); i++) {
			valueArray.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.SecurityEvent.ValueArray["+ i +"]"));
		}
		securityEvent.setValueArray(valueArray);

		List<String> levelsOn = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.SecurityEvent.LevelsOn.Length"); i++) {
			levelsOn.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.SecurityEvent.LevelsOn["+ i +"]"));
		}
		securityEvent.setLevelsOn(levelsOn);

		List<String> seriousList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.SecurityEvent.SeriousList.Length"); i++) {
			seriousList.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.SecurityEvent.SeriousList["+ i +"]"));
		}
		securityEvent.setSeriousList(seriousList);

		List<String> suspiciousList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.SecurityEvent.SuspiciousList.Length"); i++) {
			suspiciousList.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.SecurityEvent.SuspiciousList["+ i +"]"));
		}
		securityEvent.setSuspiciousList(suspiciousList);

		List<String> remindList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.SecurityEvent.RemindList.Length"); i++) {
			remindList.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.SecurityEvent.RemindList["+ i +"]"));
		}
		securityEvent.setRemindList(remindList);
		describeSecurityStatInfoResponse.setSecurityEvent(securityEvent);

		AttackEvent attackEvent = new AttackEvent();
		attackEvent.setTotalCount(_ctx.integerValue("DescribeSecurityStatInfoResponse.AttackEvent.TotalCount"));

		List<String> dateArray1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.AttackEvent.DateArray.Length"); i++) {
			dateArray1.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.AttackEvent.DateArray["+ i +"]"));
		}
		attackEvent.setDateArray1(dateArray1);

		List<String> valueArray2 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.AttackEvent.ValueArray.Length"); i++) {
			valueArray2.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.AttackEvent.ValueArray["+ i +"]"));
		}
		attackEvent.setValueArray2(valueArray2);
		describeSecurityStatInfoResponse.setAttackEvent(attackEvent);

		HealthCheck healthCheck = new HealthCheck();
		healthCheck.setMediumCount(_ctx.integerValue("DescribeSecurityStatInfoResponse.HealthCheck.MediumCount"));
		healthCheck.setHighCount(_ctx.integerValue("DescribeSecurityStatInfoResponse.HealthCheck.HighCount"));
		healthCheck.setLowCount(_ctx.integerValue("DescribeSecurityStatInfoResponse.HealthCheck.LowCount"));
		healthCheck.setTotalCount(_ctx.integerValue("DescribeSecurityStatInfoResponse.HealthCheck.TotalCount"));

		List<String> dateArray3 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.HealthCheck.DateArray.Length"); i++) {
			dateArray3.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.HealthCheck.DateArray["+ i +"]"));
		}
		healthCheck.setDateArray3(dateArray3);

		List<String> valueArray4 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.HealthCheck.ValueArray.Length"); i++) {
			valueArray4.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.HealthCheck.ValueArray["+ i +"]"));
		}
		healthCheck.setValueArray4(valueArray4);

		List<String> levelsOn5 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.HealthCheck.LevelsOn.Length"); i++) {
			levelsOn5.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.HealthCheck.LevelsOn["+ i +"]"));
		}
		healthCheck.setLevelsOn5(levelsOn5);

		List<String> highList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.HealthCheck.HighList.Length"); i++) {
			highList.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.HealthCheck.HighList["+ i +"]"));
		}
		healthCheck.setHighList(highList);

		List<String> mediumList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.HealthCheck.MediumList.Length"); i++) {
			mediumList.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.HealthCheck.MediumList["+ i +"]"));
		}
		healthCheck.setMediumList(mediumList);

		List<String> lowList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.HealthCheck.LowList.Length"); i++) {
			lowList.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.HealthCheck.LowList["+ i +"]"));
		}
		healthCheck.setLowList(lowList);
		describeSecurityStatInfoResponse.setHealthCheck(healthCheck);

		Vulnerability vulnerability = new Vulnerability();
		vulnerability.setNntfCount(_ctx.integerValue("DescribeSecurityStatInfoResponse.Vulnerability.NntfCount"));
		vulnerability.setLaterCount(_ctx.integerValue("DescribeSecurityStatInfoResponse.Vulnerability.LaterCount"));
		vulnerability.setAsapCount(_ctx.integerValue("DescribeSecurityStatInfoResponse.Vulnerability.AsapCount"));
		vulnerability.setTotalCount(_ctx.integerValue("DescribeSecurityStatInfoResponse.Vulnerability.TotalCount"));

		List<String> dateArray6 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.Vulnerability.DateArray.Length"); i++) {
			dateArray6.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.Vulnerability.DateArray["+ i +"]"));
		}
		vulnerability.setDateArray6(dateArray6);

		List<String> valueArray7 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.Vulnerability.ValueArray.Length"); i++) {
			valueArray7.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.Vulnerability.ValueArray["+ i +"]"));
		}
		vulnerability.setValueArray7(valueArray7);

		List<String> levelsOn8 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.Vulnerability.LevelsOn.Length"); i++) {
			levelsOn8.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.Vulnerability.LevelsOn["+ i +"]"));
		}
		vulnerability.setLevelsOn8(levelsOn8);

		List<String> nntfList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.Vulnerability.NntfList.Length"); i++) {
			nntfList.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.Vulnerability.NntfList["+ i +"]"));
		}
		vulnerability.setNntfList(nntfList);

		List<String> asapList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.Vulnerability.AsapList.Length"); i++) {
			asapList.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.Vulnerability.AsapList["+ i +"]"));
		}
		vulnerability.setAsapList(asapList);

		List<String> laterList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.Vulnerability.LaterList.Length"); i++) {
			laterList.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.Vulnerability.LaterList["+ i +"]"));
		}
		vulnerability.setLaterList(laterList);
		describeSecurityStatInfoResponse.setVulnerability(vulnerability);
	 
	 	return describeSecurityStatInfoResponse;
	}
}