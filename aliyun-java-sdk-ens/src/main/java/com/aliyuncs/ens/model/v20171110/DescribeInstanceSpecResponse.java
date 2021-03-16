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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeInstanceSpecResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceSpecResponse extends AcsResponse {

	private Integer dataDiskMinSize;

	private String requestId;

	private Integer systemDiskMaxSize;

	private Integer dataDiskMaxSize;

	private Integer code;

	private Integer bandwidthLimit;

	private List<InstanceSpec> instanceSpecs;

	public Integer getDataDiskMinSize() {
		return this.dataDiskMinSize;
	}

	public void setDataDiskMinSize(Integer dataDiskMinSize) {
		this.dataDiskMinSize = dataDiskMinSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getSystemDiskMaxSize() {
		return this.systemDiskMaxSize;
	}

	public void setSystemDiskMaxSize(Integer systemDiskMaxSize) {
		this.systemDiskMaxSize = systemDiskMaxSize;
	}

	public Integer getDataDiskMaxSize() {
		return this.dataDiskMaxSize;
	}

	public void setDataDiskMaxSize(Integer dataDiskMaxSize) {
		this.dataDiskMaxSize = dataDiskMaxSize;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getBandwidthLimit() {
		return this.bandwidthLimit;
	}

	public void setBandwidthLimit(Integer bandwidthLimit) {
		this.bandwidthLimit = bandwidthLimit;
	}

	public List<InstanceSpec> getInstanceSpecs() {
		return this.instanceSpecs;
	}

	public void setInstanceSpecs(List<InstanceSpec> instanceSpecs) {
		this.instanceSpecs = instanceSpecs;
	}

	public static class InstanceSpec {

		private String memory;

		private String displayName;

		private String instanceType;

		private String core;

		public String getMemory() {
			return this.memory;
		}

		public void setMemory(String memory) {
			this.memory = memory;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getCore() {
			return this.core;
		}

		public void setCore(String core) {
			this.core = core;
		}
	}

	@Override
	public DescribeInstanceSpecResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceSpecResponseUnmarshaller.unmarshall(this, context);
	}
}
