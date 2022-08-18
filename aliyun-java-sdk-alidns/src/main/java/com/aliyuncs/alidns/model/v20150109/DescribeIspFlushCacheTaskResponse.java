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

package com.aliyuncs.alidns.model.v20150109;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeIspFlushCacheTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeIspFlushCacheTaskResponse extends AcsResponse {

	private String requestId;

	private String taskId;

	private String domainName;

	private String instanceId;

	private String instanceName;

	private String isp;

	private String taskStatus;

	private String createTime;

	private Long createTimestamp;

	private List<FlushCacheResult> flushCacheResults;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	public String getIsp() {
		return this.isp;
	}

	public void setIsp(String isp) {
		this.isp = isp;
	}

	public String getTaskStatus() {
		return this.taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Long getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Long createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public List<FlushCacheResult> getFlushCacheResults() {
		return this.flushCacheResults;
	}

	public void setFlushCacheResults(List<FlushCacheResult> flushCacheResults) {
		this.flushCacheResults = flushCacheResults;
	}

	public static class FlushCacheResult {

		private String province;

		private List<DnsNode> dnsNodes;

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public List<DnsNode> getDnsNodes() {
			return this.dnsNodes;
		}

		public void setDnsNodes(List<DnsNode> dnsNodes) {
			this.dnsNodes = dnsNodes;
		}

		public static class DnsNode {

			private String nodeIp;

			private String spName;

			private String status;

			private List<Answer> answers;

			public String getNodeIp() {
				return this.nodeIp;
			}

			public void setNodeIp(String nodeIp) {
				this.nodeIp = nodeIp;
			}

			public String getSpName() {
				return this.spName;
			}

			public void setSpName(String spName) {
				this.spName = spName;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public List<Answer> getAnswers() {
				return this.answers;
			}

			public void setAnswers(List<Answer> answers) {
				this.answers = answers;
			}

			public static class Answer {

				private String name;

				private String type;

				private String record;

				private Long ttl;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getRecord() {
					return this.record;
				}

				public void setRecord(String record) {
					this.record = record;
				}

				public Long getTtl() {
					return this.ttl;
				}

				public void setTtl(Long ttl) {
					this.ttl = ttl;
				}
			}
		}
	}

	@Override
	public DescribeIspFlushCacheTaskResponse getInstance(UnmarshallerContext context) {
		return	DescribeIspFlushCacheTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
