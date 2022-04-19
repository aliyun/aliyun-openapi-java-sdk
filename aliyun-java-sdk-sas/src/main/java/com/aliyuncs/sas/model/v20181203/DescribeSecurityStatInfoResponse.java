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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeSecurityStatInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSecurityStatInfoResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private SecurityEvent securityEvent;

	private AttackEvent attackEvent;

	private HealthCheck healthCheck;

	private Vulnerability vulnerability;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public SecurityEvent getSecurityEvent() {
		return this.securityEvent;
	}

	public void setSecurityEvent(SecurityEvent securityEvent) {
		this.securityEvent = securityEvent;
	}

	public AttackEvent getAttackEvent() {
		return this.attackEvent;
	}

	public void setAttackEvent(AttackEvent attackEvent) {
		this.attackEvent = attackEvent;
	}

	public HealthCheck getHealthCheck() {
		return this.healthCheck;
	}

	public void setHealthCheck(HealthCheck healthCheck) {
		this.healthCheck = healthCheck;
	}

	public Vulnerability getVulnerability() {
		return this.vulnerability;
	}

	public void setVulnerability(Vulnerability vulnerability) {
		this.vulnerability = vulnerability;
	}

	public static class SecurityEvent {

		private Integer suspiciousCount;

		private Integer seriousCount;

		private Integer remindCount;

		private Integer totalCount;

		private List<String> valueArray;

		private List<String> timeArray;

		private List<String> remindList;

		private List<String> levelsOn;

		private List<String> dateArray;

		private List<String> suspiciousList;

		private List<String> seriousList;

		public Integer getSuspiciousCount() {
			return this.suspiciousCount;
		}

		public void setSuspiciousCount(Integer suspiciousCount) {
			this.suspiciousCount = suspiciousCount;
		}

		public Integer getSeriousCount() {
			return this.seriousCount;
		}

		public void setSeriousCount(Integer seriousCount) {
			this.seriousCount = seriousCount;
		}

		public Integer getRemindCount() {
			return this.remindCount;
		}

		public void setRemindCount(Integer remindCount) {
			this.remindCount = remindCount;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<String> getValueArray() {
			return this.valueArray;
		}

		public void setValueArray(List<String> valueArray) {
			this.valueArray = valueArray;
		}

		public List<String> getTimeArray() {
			return this.timeArray;
		}

		public void setTimeArray(List<String> timeArray) {
			this.timeArray = timeArray;
		}

		public List<String> getRemindList() {
			return this.remindList;
		}

		public void setRemindList(List<String> remindList) {
			this.remindList = remindList;
		}

		public List<String> getLevelsOn() {
			return this.levelsOn;
		}

		public void setLevelsOn(List<String> levelsOn) {
			this.levelsOn = levelsOn;
		}

		public List<String> getDateArray() {
			return this.dateArray;
		}

		public void setDateArray(List<String> dateArray) {
			this.dateArray = dateArray;
		}

		public List<String> getSuspiciousList() {
			return this.suspiciousList;
		}

		public void setSuspiciousList(List<String> suspiciousList) {
			this.suspiciousList = suspiciousList;
		}

		public List<String> getSeriousList() {
			return this.seriousList;
		}

		public void setSeriousList(List<String> seriousList) {
			this.seriousList = seriousList;
		}
	}

	public static class AttackEvent {

		private Integer totalCount;

		private List<String> dateArray1;

		private List<String> valueArray2;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<String> getDateArray1() {
			return this.dateArray1;
		}

		public void setDateArray1(List<String> dateArray1) {
			this.dateArray1 = dateArray1;
		}

		public List<String> getValueArray2() {
			return this.valueArray2;
		}

		public void setValueArray2(List<String> valueArray2) {
			this.valueArray2 = valueArray2;
		}
	}

	public static class HealthCheck {

		private Integer highCount;

		private Integer lowCount;

		private Integer totalCount;

		private Integer mediumCount;

		private List<String> valueArray3;

		private List<String> timeArray4;

		private List<String> levelsOn5;

		private List<String> lowList;

		private List<String> mediumList;

		private List<String> dateArray6;

		private List<String> highList;

		public Integer getHighCount() {
			return this.highCount;
		}

		public void setHighCount(Integer highCount) {
			this.highCount = highCount;
		}

		public Integer getLowCount() {
			return this.lowCount;
		}

		public void setLowCount(Integer lowCount) {
			this.lowCount = lowCount;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getMediumCount() {
			return this.mediumCount;
		}

		public void setMediumCount(Integer mediumCount) {
			this.mediumCount = mediumCount;
		}

		public List<String> getValueArray3() {
			return this.valueArray3;
		}

		public void setValueArray3(List<String> valueArray3) {
			this.valueArray3 = valueArray3;
		}

		public List<String> getTimeArray4() {
			return this.timeArray4;
		}

		public void setTimeArray4(List<String> timeArray4) {
			this.timeArray4 = timeArray4;
		}

		public List<String> getLevelsOn5() {
			return this.levelsOn5;
		}

		public void setLevelsOn5(List<String> levelsOn5) {
			this.levelsOn5 = levelsOn5;
		}

		public List<String> getLowList() {
			return this.lowList;
		}

		public void setLowList(List<String> lowList) {
			this.lowList = lowList;
		}

		public List<String> getMediumList() {
			return this.mediumList;
		}

		public void setMediumList(List<String> mediumList) {
			this.mediumList = mediumList;
		}

		public List<String> getDateArray6() {
			return this.dateArray6;
		}

		public void setDateArray6(List<String> dateArray6) {
			this.dateArray6 = dateArray6;
		}

		public List<String> getHighList() {
			return this.highList;
		}

		public void setHighList(List<String> highList) {
			this.highList = highList;
		}
	}

	public static class Vulnerability {

		private Integer nntfCount;

		private Integer laterCount;

		private Integer totalCount;

		private Integer asapCount;

		private List<String> nntfList;

		private List<String> asapList;

		private List<String> valueArray7;

		private List<String> timeArray8;

		private List<String> levelsOn9;

		private List<String> laterList;

		private List<String> dateArray10;

		public Integer getNntfCount() {
			return this.nntfCount;
		}

		public void setNntfCount(Integer nntfCount) {
			this.nntfCount = nntfCount;
		}

		public Integer getLaterCount() {
			return this.laterCount;
		}

		public void setLaterCount(Integer laterCount) {
			this.laterCount = laterCount;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getAsapCount() {
			return this.asapCount;
		}

		public void setAsapCount(Integer asapCount) {
			this.asapCount = asapCount;
		}

		public List<String> getNntfList() {
			return this.nntfList;
		}

		public void setNntfList(List<String> nntfList) {
			this.nntfList = nntfList;
		}

		public List<String> getAsapList() {
			return this.asapList;
		}

		public void setAsapList(List<String> asapList) {
			this.asapList = asapList;
		}

		public List<String> getValueArray7() {
			return this.valueArray7;
		}

		public void setValueArray7(List<String> valueArray7) {
			this.valueArray7 = valueArray7;
		}

		public List<String> getTimeArray8() {
			return this.timeArray8;
		}

		public void setTimeArray8(List<String> timeArray8) {
			this.timeArray8 = timeArray8;
		}

		public List<String> getLevelsOn9() {
			return this.levelsOn9;
		}

		public void setLevelsOn9(List<String> levelsOn9) {
			this.levelsOn9 = levelsOn9;
		}

		public List<String> getLaterList() {
			return this.laterList;
		}

		public void setLaterList(List<String> laterList) {
			this.laterList = laterList;
		}

		public List<String> getDateArray10() {
			return this.dateArray10;
		}

		public void setDateArray10(List<String> dateArray10) {
			this.dateArray10 = dateArray10;
		}
	}

	@Override
	public DescribeSecurityStatInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeSecurityStatInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
