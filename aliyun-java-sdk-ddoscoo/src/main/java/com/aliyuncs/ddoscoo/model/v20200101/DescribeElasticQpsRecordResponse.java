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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeElasticQpsRecordResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeElasticQpsRecordResponse extends AcsResponse {

	private String requestId;

	private List<ElasticQpsListItem> elasticQpsList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ElasticQpsListItem> getElasticQpsList() {
		return this.elasticQpsList;
	}

	public void setElasticQpsList(List<ElasticQpsListItem> elasticQpsList) {
		this.elasticQpsList = elasticQpsList;
	}

	public static class ElasticQpsListItem {

		private Long opsElasticQps;

		private String ip;

		private Long originQps;

		private Long date;

		private String instanceId;

		private Long qps;

		private Long qpsPeak;

		private Long status;

		private Long opsQps;

		public Long getOpsElasticQps() {
			return this.opsElasticQps;
		}

		public void setOpsElasticQps(Long opsElasticQps) {
			this.opsElasticQps = opsElasticQps;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public Long getOriginQps() {
			return this.originQps;
		}

		public void setOriginQps(Long originQps) {
			this.originQps = originQps;
		}

		public Long getDate() {
			return this.date;
		}

		public void setDate(Long date) {
			this.date = date;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getQps() {
			return this.qps;
		}

		public void setQps(Long qps) {
			this.qps = qps;
		}

		public Long getQpsPeak() {
			return this.qpsPeak;
		}

		public void setQpsPeak(Long qpsPeak) {
			this.qpsPeak = qpsPeak;
		}

		public Long getStatus() {
			return this.status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}

		public Long getOpsQps() {
			return this.opsQps;
		}

		public void setOpsQps(Long opsQps) {
			this.opsQps = opsQps;
		}
	}

	@Override
	public DescribeElasticQpsRecordResponse getInstance(UnmarshallerContext context) {
		return	DescribeElasticQpsRecordResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
