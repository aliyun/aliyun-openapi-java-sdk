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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.QueryCrackEventResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCrackEventResponse extends AcsResponse {

	private String requestId;

	private String code;

	private Boolean success;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<Entity> list;

		private PageInfo pageInfo;

		public List<Entity> getList() {
			return this.list;
		}

		public void setList(List<Entity> list) {
			this.list = list;
		}

		public PageInfo getPageInfo() {
			return this.pageInfo;
		}

		public void setPageInfo(PageInfo pageInfo) {
			this.pageInfo = pageInfo;
		}

		public static class Entity {

			private String uuid;

			private String attackTime;

			private Integer attackType;

			private String attackTypeName;

			private String buyVersion;

			private String crackSourceIp;

			private Integer crackTimes;

			private Integer groupId;

			private String instanceName;

			private String instanceId;

			private String ip;

			private String region;

			private Integer status;

			private String statusName;

			private String location;

			private Integer inWhite;

			private String userName;

			public String getUuid() {
				return this.uuid;
			}

			public void setUuid(String uuid) {
				this.uuid = uuid;
			}

			public String getAttackTime() {
				return this.attackTime;
			}

			public void setAttackTime(String attackTime) {
				this.attackTime = attackTime;
			}

			public Integer getAttackType() {
				return this.attackType;
			}

			public void setAttackType(Integer attackType) {
				this.attackType = attackType;
			}

			public String getAttackTypeName() {
				return this.attackTypeName;
			}

			public void setAttackTypeName(String attackTypeName) {
				this.attackTypeName = attackTypeName;
			}

			public String getBuyVersion() {
				return this.buyVersion;
			}

			public void setBuyVersion(String buyVersion) {
				this.buyVersion = buyVersion;
			}

			public String getCrackSourceIp() {
				return this.crackSourceIp;
			}

			public void setCrackSourceIp(String crackSourceIp) {
				this.crackSourceIp = crackSourceIp;
			}

			public Integer getCrackTimes() {
				return this.crackTimes;
			}

			public void setCrackTimes(Integer crackTimes) {
				this.crackTimes = crackTimes;
			}

			public Integer getGroupId() {
				return this.groupId;
			}

			public void setGroupId(Integer groupId) {
				this.groupId = groupId;
			}

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getStatusName() {
				return this.statusName;
			}

			public void setStatusName(String statusName) {
				this.statusName = statusName;
			}

			public String getLocation() {
				return this.location;
			}

			public void setLocation(String location) {
				this.location = location;
			}

			public Integer getInWhite() {
				return this.inWhite;
			}

			public void setInWhite(Integer inWhite) {
				this.inWhite = inWhite;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}
		}

		public static class PageInfo {

			private Integer currentPage;

			private Integer pageSize;

			private Integer totalCount;

			private Integer count;

			public Integer getCurrentPage() {
				return this.currentPage;
			}

			public void setCurrentPage(Integer currentPage) {
				this.currentPage = currentPage;
			}

			public Integer getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Integer pageSize) {
				this.pageSize = pageSize;
			}

			public Integer getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Integer totalCount) {
				this.totalCount = totalCount;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}
		}
	}

	@Override
	public QueryCrackEventResponse getInstance(UnmarshallerContext context) {
		return	QueryCrackEventResponseUnmarshaller.unmarshall(this, context);
	}
}
