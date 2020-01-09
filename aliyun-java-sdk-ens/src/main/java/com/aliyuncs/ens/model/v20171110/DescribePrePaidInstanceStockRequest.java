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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribePrePaidInstanceStockRequest extends RpcAcsRequest<DescribePrePaidInstanceStockResponse> {
	   

	private String instanceSpec;

	private String ensRegionId;

	private Integer systemDiskSize;

	private String version;

	private Integer dataDiskSize;
	public DescribePrePaidInstanceStockRequest() {
		super("Ens", "2017-11-10", "DescribePrePaidInstanceStock", "ens");
		setMethod(MethodType.POST);
	}

	public String getInstanceSpec() {
		return this.instanceSpec;
	}

	public void setInstanceSpec(String instanceSpec) {
		this.instanceSpec = instanceSpec;
		if(instanceSpec != null){
			putQueryParameter("InstanceSpec", instanceSpec);
		}
	}

	public String getEnsRegionId() {
		return this.ensRegionId;
	}

	public void setEnsRegionId(String ensRegionId) {
		this.ensRegionId = ensRegionId;
		if(ensRegionId != null){
			putQueryParameter("EnsRegionId", ensRegionId);
		}
	}

	public Integer getSystemDiskSize() {
		return this.systemDiskSize;
	}

	public void setSystemDiskSize(Integer systemDiskSize) {
		this.systemDiskSize = systemDiskSize;
		if(systemDiskSize != null){
			putQueryParameter("SystemDiskSize", systemDiskSize.toString());
		}
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
		if(version != null){
			putQueryParameter("Version", version);
		}
	}

	public Integer getDataDiskSize() {
		return this.dataDiskSize;
	}

	public void setDataDiskSize(Integer dataDiskSize) {
		this.dataDiskSize = dataDiskSize;
		if(dataDiskSize != null){
			putQueryParameter("DataDiskSize", dataDiskSize.toString());
		}
	}

	@Override
	public Class<DescribePrePaidInstanceStockResponse> getResponseClass() {
		return DescribePrePaidInstanceStockResponse.class;
	}

}
