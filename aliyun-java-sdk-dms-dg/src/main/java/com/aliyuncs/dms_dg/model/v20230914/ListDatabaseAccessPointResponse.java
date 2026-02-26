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

package com.aliyuncs.dms_dg.model.v20230914;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_dg.transform.v20230914.ListDatabaseAccessPointResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDatabaseAccessPointResponse extends AcsResponse {

	private String requestId;

	private String success;

	private String code;

	private String errorMsg;

	private Integer count;

	private List<DbInstanceAccessPoint> dbInstanceAccessPointList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<DbInstanceAccessPoint> getDbInstanceAccessPointList() {
		return this.dbInstanceAccessPointList;
	}

	public void setDbInstanceAccessPointList(List<DbInstanceAccessPoint> dbInstanceAccessPointList) {
		this.dbInstanceAccessPointList = dbInstanceAccessPointList;
	}

	public static class DbInstanceAccessPoint {

		private String accessAddr;

		private Integer accessPort;

		private String dbInstanceId;

		private Long gmtCreate;

		private Long gmtModified;

		private String routerId;

		private String vpcAzoneId;

		private String vpcId;

		private String vswitchId;

		public String getAccessAddr() {
			return this.accessAddr;
		}

		public void setAccessAddr(String accessAddr) {
			this.accessAddr = accessAddr;
		}

		public Integer getAccessPort() {
			return this.accessPort;
		}

		public void setAccessPort(Integer accessPort) {
			this.accessPort = accessPort;
		}

		public String getDbInstanceId() {
			return this.dbInstanceId;
		}

		public void setDbInstanceId(String dbInstanceId) {
			this.dbInstanceId = dbInstanceId;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getRouterId() {
			return this.routerId;
		}

		public void setRouterId(String routerId) {
			this.routerId = routerId;
		}

		public String getVpcAzoneId() {
			return this.vpcAzoneId;
		}

		public void setVpcAzoneId(String vpcAzoneId) {
			this.vpcAzoneId = vpcAzoneId;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVswitchId() {
			return this.vswitchId;
		}

		public void setVswitchId(String vswitchId) {
			this.vswitchId = vswitchId;
		}
	}

	@Override
	public ListDatabaseAccessPointResponse getInstance(UnmarshallerContext context) {
		return	ListDatabaseAccessPointResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
