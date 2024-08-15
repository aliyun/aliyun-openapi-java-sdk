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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeDesktopSessionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDesktopSessionsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<Session> sessions;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Session> getSessions() {
		return this.sessions;
	}

	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}

	public static class Session {

		private String sessionStatus;

		private String endUserId;

		private String officeSiteId;

		private String clientIp;

		private String clientOS;

		private String desktopId;

		private String desktopName;

		private String officeSiteName;

		private String clientVersion;

		private String protocolType;

		private Long latestConnectionTime;

		private Long totalConnectionTime;

		private String sessionStartTime;

		private String sessionEndTime;

		private Long sessionIdleTime;

		private String osType;

		private Long endUserApplyCoordinateTime;

		private String subPayType;

		private String osSessionStatus;

		public String getSessionStatus() {
			return this.sessionStatus;
		}

		public void setSessionStatus(String sessionStatus) {
			this.sessionStatus = sessionStatus;
		}

		public String getEndUserId() {
			return this.endUserId;
		}

		public void setEndUserId(String endUserId) {
			this.endUserId = endUserId;
		}

		public String getOfficeSiteId() {
			return this.officeSiteId;
		}

		public void setOfficeSiteId(String officeSiteId) {
			this.officeSiteId = officeSiteId;
		}

		public String getClientIp() {
			return this.clientIp;
		}

		public void setClientIp(String clientIp) {
			this.clientIp = clientIp;
		}

		public String getClientOS() {
			return this.clientOS;
		}

		public void setClientOS(String clientOS) {
			this.clientOS = clientOS;
		}

		public String getDesktopId() {
			return this.desktopId;
		}

		public void setDesktopId(String desktopId) {
			this.desktopId = desktopId;
		}

		public String getDesktopName() {
			return this.desktopName;
		}

		public void setDesktopName(String desktopName) {
			this.desktopName = desktopName;
		}

		public String getOfficeSiteName() {
			return this.officeSiteName;
		}

		public void setOfficeSiteName(String officeSiteName) {
			this.officeSiteName = officeSiteName;
		}

		public String getClientVersion() {
			return this.clientVersion;
		}

		public void setClientVersion(String clientVersion) {
			this.clientVersion = clientVersion;
		}

		public String getProtocolType() {
			return this.protocolType;
		}

		public void setProtocolType(String protocolType) {
			this.protocolType = protocolType;
		}

		public Long getLatestConnectionTime() {
			return this.latestConnectionTime;
		}

		public void setLatestConnectionTime(Long latestConnectionTime) {
			this.latestConnectionTime = latestConnectionTime;
		}

		public Long getTotalConnectionTime() {
			return this.totalConnectionTime;
		}

		public void setTotalConnectionTime(Long totalConnectionTime) {
			this.totalConnectionTime = totalConnectionTime;
		}

		public String getSessionStartTime() {
			return this.sessionStartTime;
		}

		public void setSessionStartTime(String sessionStartTime) {
			this.sessionStartTime = sessionStartTime;
		}

		public String getSessionEndTime() {
			return this.sessionEndTime;
		}

		public void setSessionEndTime(String sessionEndTime) {
			this.sessionEndTime = sessionEndTime;
		}

		public Long getSessionIdleTime() {
			return this.sessionIdleTime;
		}

		public void setSessionIdleTime(Long sessionIdleTime) {
			this.sessionIdleTime = sessionIdleTime;
		}

		public String getOsType() {
			return this.osType;
		}

		public void setOsType(String osType) {
			this.osType = osType;
		}

		public Long getEndUserApplyCoordinateTime() {
			return this.endUserApplyCoordinateTime;
		}

		public void setEndUserApplyCoordinateTime(Long endUserApplyCoordinateTime) {
			this.endUserApplyCoordinateTime = endUserApplyCoordinateTime;
		}

		public String getSubPayType() {
			return this.subPayType;
		}

		public void setSubPayType(String subPayType) {
			this.subPayType = subPayType;
		}

		public String getOsSessionStatus() {
			return this.osSessionStatus;
		}

		public void setOsSessionStatus(String osSessionStatus) {
			this.osSessionStatus = osSessionStatus;
		}
	}

	@Override
	public DescribeDesktopSessionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDesktopSessionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
