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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribePrePaidInstanceStockResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePrePaidInstanceStockResponse extends AcsResponse {

	private String requestId;

	private Integer dataDiskSize;

	private String ensRegionId;

	private Integer cores;

	private Integer memory;

	private Integer avaliableCount;

	private String instanceSpec;

	private Integer systemDiskSize;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getDataDiskSize() {
		return this.dataDiskSize;
	}

	public void setDataDiskSize(Integer dataDiskSize) {
		this.dataDiskSize = dataDiskSize;
	}

	public String getEnsRegionId() {
		return this.ensRegionId;
	}

	public void setEnsRegionId(String ensRegionId) {
		this.ensRegionId = ensRegionId;
	}

	public Integer getCores() {
		return this.cores;
	}

	public void setCores(Integer cores) {
		this.cores = cores;
	}

	public Integer getMemory() {
		return this.memory;
	}

	public void setMemory(Integer memory) {
		this.memory = memory;
	}

	public Integer getAvaliableCount() {
		return this.avaliableCount;
	}

	public void setAvaliableCount(Integer avaliableCount) {
		this.avaliableCount = avaliableCount;
	}

	public String getInstanceSpec() {
		return this.instanceSpec;
	}

	public void setInstanceSpec(String instanceSpec) {
		this.instanceSpec = instanceSpec;
	}

	public Integer getSystemDiskSize() {
		return this.systemDiskSize;
	}

	public void setSystemDiskSize(Integer systemDiskSize) {
		this.systemDiskSize = systemDiskSize;
	}

	@Override
	public DescribePrePaidInstanceStockResponse getInstance(UnmarshallerContext context) {
		return	DescribePrePaidInstanceStockResponseUnmarshaller.unmarshall(this, context);
	}
}
