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

package com.aliyuncs.cs.model.v20151215;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cs.transform.v20151215.DescribeUserQuotaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserQuotaResponse extends AcsResponse {

	private Long cluster_nodepool_quota;

	private Long amk_cluster_quota;

	private Long cluster_quota;

	private Long node_quota;

	private Long ask_cluster_quota;

	public Long getCluster_nodepool_quota() {
		return this.cluster_nodepool_quota;
	}

	public void setCluster_nodepool_quota(Long cluster_nodepool_quota) {
		this.cluster_nodepool_quota = cluster_nodepool_quota;
	}

	public Long getAmk_cluster_quota() {
		return this.amk_cluster_quota;
	}

	public void setAmk_cluster_quota(Long amk_cluster_quota) {
		this.amk_cluster_quota = amk_cluster_quota;
	}

	public Long getCluster_quota() {
		return this.cluster_quota;
	}

	public void setCluster_quota(Long cluster_quota) {
		this.cluster_quota = cluster_quota;
	}

	public Long getNode_quota() {
		return this.node_quota;
	}

	public void setNode_quota(Long node_quota) {
		this.node_quota = node_quota;
	}

	public Long getAsk_cluster_quota() {
		return this.ask_cluster_quota;
	}

	public void setAsk_cluster_quota(Long ask_cluster_quota) {
		this.ask_cluster_quota = ask_cluster_quota;
	}

	@Override
	public DescribeUserQuotaResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserQuotaResponseUnmarshaller.unmarshall(this, context);
	}
}
