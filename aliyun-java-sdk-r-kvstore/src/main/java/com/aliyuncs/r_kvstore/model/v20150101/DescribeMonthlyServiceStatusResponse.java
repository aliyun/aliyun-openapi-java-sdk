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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeMonthlyServiceStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMonthlyServiceStatusResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private List<InstanceSLAInfo> instanceSLAInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<InstanceSLAInfo> getInstanceSLAInfos() {
		return this.instanceSLAInfos;
	}

	public void setInstanceSLAInfos(List<InstanceSLAInfo> instanceSLAInfos) {
		this.instanceSLAInfos = instanceSLAInfos;
	}

	public static class InstanceSLAInfo {

		private String instanceId;

		private Float uptimePct;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Float getUptimePct() {
			return this.uptimePct;
		}

		public void setUptimePct(Float uptimePct) {
			this.uptimePct = uptimePct;
		}
	}

	@Override
	public DescribeMonthlyServiceStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeMonthlyServiceStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
