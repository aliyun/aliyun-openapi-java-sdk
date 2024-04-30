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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeHostGroupElasticStrategyParametersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHostGroupElasticStrategyParametersResponse extends AcsResponse {

	private String requestId;

	private Integer cpuShar;

	private Integer iopsZoom;

	private Integer maxConnZoom;

	private Integer cpuZoom;

	private Integer memoryZoom;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCpuShar() {
		return this.cpuShar;
	}

	public void setCpuShar(Integer cpuShar) {
		this.cpuShar = cpuShar;
	}

	public Integer getIopsZoom() {
		return this.iopsZoom;
	}

	public void setIopsZoom(Integer iopsZoom) {
		this.iopsZoom = iopsZoom;
	}

	public Integer getMaxConnZoom() {
		return this.maxConnZoom;
	}

	public void setMaxConnZoom(Integer maxConnZoom) {
		this.maxConnZoom = maxConnZoom;
	}

	public Integer getCpuZoom() {
		return this.cpuZoom;
	}

	public void setCpuZoom(Integer cpuZoom) {
		this.cpuZoom = cpuZoom;
	}

	public Integer getMemoryZoom() {
		return this.memoryZoom;
	}

	public void setMemoryZoom(Integer memoryZoom) {
		this.memoryZoom = memoryZoom;
	}

	@Override
	public DescribeHostGroupElasticStrategyParametersResponse getInstance(UnmarshallerContext context) {
		return	DescribeHostGroupElasticStrategyParametersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
