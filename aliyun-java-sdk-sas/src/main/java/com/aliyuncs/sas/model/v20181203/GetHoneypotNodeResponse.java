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
import com.aliyuncs.sas.transform.v20181203.GetHoneypotNodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetHoneypotNodeResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private Integer httpStatusCode;

	private HoneypotNode honeypotNode;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public HoneypotNode getHoneypotNode() {
		return this.honeypotNode;
	}

	public void setHoneypotNode(HoneypotNode honeypotNode) {
		this.honeypotNode = honeypotNode;
	}

	public static class HoneypotNode {

		private String nodeId;

		private String nodeName;

		private Integer honeypotTotalCount;

		private Integer honeypotUsedCount;

		private Integer probeTotalCount;

		private Integer probeUsedCount;

		private Integer totalStatus;

		private String ecsInstanceId;

		private String createTime;

		private Boolean allowHoneypotAccessInternet;

		private String ip;

		private List<String> securityGroupProbeIpList;

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public String getNodeName() {
			return this.nodeName;
		}

		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}

		public Integer getHoneypotTotalCount() {
			return this.honeypotTotalCount;
		}

		public void setHoneypotTotalCount(Integer honeypotTotalCount) {
			this.honeypotTotalCount = honeypotTotalCount;
		}

		public Integer getHoneypotUsedCount() {
			return this.honeypotUsedCount;
		}

		public void setHoneypotUsedCount(Integer honeypotUsedCount) {
			this.honeypotUsedCount = honeypotUsedCount;
		}

		public Integer getProbeTotalCount() {
			return this.probeTotalCount;
		}

		public void setProbeTotalCount(Integer probeTotalCount) {
			this.probeTotalCount = probeTotalCount;
		}

		public Integer getProbeUsedCount() {
			return this.probeUsedCount;
		}

		public void setProbeUsedCount(Integer probeUsedCount) {
			this.probeUsedCount = probeUsedCount;
		}

		public Integer getTotalStatus() {
			return this.totalStatus;
		}

		public void setTotalStatus(Integer totalStatus) {
			this.totalStatus = totalStatus;
		}

		public String getEcsInstanceId() {
			return this.ecsInstanceId;
		}

		public void setEcsInstanceId(String ecsInstanceId) {
			this.ecsInstanceId = ecsInstanceId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Boolean getAllowHoneypotAccessInternet() {
			return this.allowHoneypotAccessInternet;
		}

		public void setAllowHoneypotAccessInternet(Boolean allowHoneypotAccessInternet) {
			this.allowHoneypotAccessInternet = allowHoneypotAccessInternet;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public List<String> getSecurityGroupProbeIpList() {
			return this.securityGroupProbeIpList;
		}

		public void setSecurityGroupProbeIpList(List<String> securityGroupProbeIpList) {
			this.securityGroupProbeIpList = securityGroupProbeIpList;
		}
	}

	@Override
	public GetHoneypotNodeResponse getInstance(UnmarshallerContext context) {
		return	GetHoneypotNodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
