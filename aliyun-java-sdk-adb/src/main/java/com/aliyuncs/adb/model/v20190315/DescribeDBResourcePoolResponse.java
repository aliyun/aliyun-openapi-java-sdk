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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeDBResourcePoolResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBResourcePoolResponse extends AcsResponse {

	private String requestId;

	private String dBClusterId;

	private List<PoolInfo> poolsInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public List<PoolInfo> getPoolsInfo() {
		return this.poolsInfo;
	}

	public void setPoolsInfo(List<PoolInfo> poolsInfo) {
		this.poolsInfo = poolsInfo;
	}

	public static class PoolInfo {

		private String queryType;

		private String updateTime;

		private String poolName;

		private String createTime;

		private String poolUsers;

		private Integer nodeNum;

		public String getQueryType() {
			return this.queryType;
		}

		public void setQueryType(String queryType) {
			this.queryType = queryType;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getPoolName() {
			return this.poolName;
		}

		public void setPoolName(String poolName) {
			this.poolName = poolName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getPoolUsers() {
			return this.poolUsers;
		}

		public void setPoolUsers(String poolUsers) {
			this.poolUsers = poolUsers;
		}

		public Integer getNodeNum() {
			return this.nodeNum;
		}

		public void setNodeNum(Integer nodeNum) {
			this.nodeNum = nodeNum;
		}
	}

	@Override
	public DescribeDBResourcePoolResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBResourcePoolResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
