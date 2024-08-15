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
import com.aliyuncs.ecd.transform.v20200930.DescribeDesktopGroupSessionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDesktopGroupSessionsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private String nextToken;

	private List<Session> sessions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<Session> getSessions() {
		return this.sessions;
	}

	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}

	public static class Session {

		private String endUserId;

		private String desktopGroupId;

		private String desktopGroupName;

		private String officeSiteId;

		private String officeSiteName;

		private Integer ownType;

		private String sessionStatus;

		private String desktopId;

		private String clientOS;

		private String clientVersion;

		private String clientIp;

		private Long latestConnectionTime;

		private Long totalConnectionDuration;

		private Long sessionIdleTime;

		private String protocolType;

		private String lastSessionStartTime;

		private String lastSessionEndTime;

		private String osType;

		private Long endUserApplyCoordinateTime;

		public String getEndUserId() {
			return this.endUserId;
		}

		public void setEndUserId(String endUserId) {
			this.endUserId = endUserId;
		}

		public String getDesktopGroupId() {
			return this.desktopGroupId;
		}

		public void setDesktopGroupId(String desktopGroupId) {
			this.desktopGroupId = desktopGroupId;
		}

		public String getDesktopGroupName() {
			return this.desktopGroupName;
		}

		public void setDesktopGroupName(String desktopGroupName) {
			this.desktopGroupName = desktopGroupName;
		}

		public String getOfficeSiteId() {
			return this.officeSiteId;
		}

		public void setOfficeSiteId(String officeSiteId) {
			this.officeSiteId = officeSiteId;
		}

		public String getOfficeSiteName() {
			return this.officeSiteName;
		}

		public void setOfficeSiteName(String officeSiteName) {
			this.officeSiteName = officeSiteName;
		}

		public Integer getOwnType() {
			return this.ownType;
		}

		public void setOwnType(Integer ownType) {
			this.ownType = ownType;
		}

		public String getSessionStatus() {
			return this.sessionStatus;
		}

		public void setSessionStatus(String sessionStatus) {
			this.sessionStatus = sessionStatus;
		}

		public String getDesktopId() {
			return this.desktopId;
		}

		public void setDesktopId(String desktopId) {
			this.desktopId = desktopId;
		}

		public String getClientOS() {
			return this.clientOS;
		}

		public void setClientOS(String clientOS) {
			this.clientOS = clientOS;
		}

		public String getClientVersion() {
			return this.clientVersion;
		}

		public void setClientVersion(String clientVersion) {
			this.clientVersion = clientVersion;
		}

		public String getClientIp() {
			return this.clientIp;
		}

		public void setClientIp(String clientIp) {
			this.clientIp = clientIp;
		}

		public Long getLatestConnectionTime() {
			return this.latestConnectionTime;
		}

		public void setLatestConnectionTime(Long latestConnectionTime) {
			this.latestConnectionTime = latestConnectionTime;
		}

		public Long getTotalConnectionDuration() {
			return this.totalConnectionDuration;
		}

		public void setTotalConnectionDuration(Long totalConnectionDuration) {
			this.totalConnectionDuration = totalConnectionDuration;
		}

		public Long getSessionIdleTime() {
			return this.sessionIdleTime;
		}

		public void setSessionIdleTime(Long sessionIdleTime) {
			this.sessionIdleTime = sessionIdleTime;
		}

		public String getProtocolType() {
			return this.protocolType;
		}

		public void setProtocolType(String protocolType) {
			this.protocolType = protocolType;
		}

		public String getLastSessionStartTime() {
			return this.lastSessionStartTime;
		}

		public void setLastSessionStartTime(String lastSessionStartTime) {
			this.lastSessionStartTime = lastSessionStartTime;
		}

		public String getLastSessionEndTime() {
			return this.lastSessionEndTime;
		}

		public void setLastSessionEndTime(String lastSessionEndTime) {
			this.lastSessionEndTime = lastSessionEndTime;
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
	}

	@Override
	public DescribeDesktopGroupSessionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDesktopGroupSessionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
