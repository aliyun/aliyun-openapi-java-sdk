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
public class DescribeStorageVolumeRequest extends RpcAcsRequest<DescribeStorageVolumeResponse> {
	   

	private String ensRegionId;

	private String gatewayId;

	private String volumeId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer isEnable;

	private String storageId;
	public DescribeStorageVolumeRequest() {
		super("Ens", "2017-11-10", "DescribeStorageVolume", "ens");
		setMethod(MethodType.POST);
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

	public String getGatewayId() {
		return this.gatewayId;
	}

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
		if(gatewayId != null){
			putQueryParameter("GatewayId", gatewayId);
		}
	}

	public String getVolumeId() {
		return this.volumeId;
	}

	public void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
		if(volumeId != null){
			putQueryParameter("VolumeId", volumeId);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Integer getIsEnable() {
		return this.isEnable;
	}

	public void setIsEnable(Integer isEnable) {
		this.isEnable = isEnable;
		if(isEnable != null){
			putQueryParameter("IsEnable", isEnable.toString());
		}
	}

	public String getStorageId() {
		return this.storageId;
	}

	public void setStorageId(String storageId) {
		this.storageId = storageId;
		if(storageId != null){
			putQueryParameter("StorageId", storageId);
		}
	}

	@Override
	public Class<DescribeStorageVolumeResponse> getResponseClass() {
		return DescribeStorageVolumeResponse.class;
	}

}
