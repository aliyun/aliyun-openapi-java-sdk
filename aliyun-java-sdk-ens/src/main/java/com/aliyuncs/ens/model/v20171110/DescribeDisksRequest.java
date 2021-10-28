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
public class DescribeDisksRequest extends RpcAcsRequest<DescribeDisksResponse> {
	   

	private String type;

	private String orderByParams;

	private String diskName;

	private String diskChargeType;

	private String ensRegionId;

	private String status;

	private String pageNumber;

	private String pageSize;

	private String diskIds;

	private String diskId;

	private String ensRegionIds;

	private String diskType;

	private String category;
	public DescribeDisksRequest() {
		super("Ens", "2017-11-10", "DescribeDisks", "ens");
		setMethod(MethodType.POST);
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getOrderByParams() {
		return this.orderByParams;
	}

	public void setOrderByParams(String orderByParams) {
		this.orderByParams = orderByParams;
		if(orderByParams != null){
			putQueryParameter("OrderByParams", orderByParams);
		}
	}

	public String getDiskName() {
		return this.diskName;
	}

	public void setDiskName(String diskName) {
		this.diskName = diskName;
		if(diskName != null){
			putQueryParameter("DiskName", diskName);
		}
	}

	public String getDiskChargeType() {
		return this.diskChargeType;
	}

	public void setDiskChargeType(String diskChargeType) {
		this.diskChargeType = diskChargeType;
		if(diskChargeType != null){
			putQueryParameter("DiskChargeType", diskChargeType);
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize);
		}
	}

	public String getDiskIds() {
		return this.diskIds;
	}

	public void setDiskIds(String diskIds) {
		this.diskIds = diskIds;
		if(diskIds != null){
			putQueryParameter("DiskIds", diskIds);
		}
	}

	public String getDiskId() {
		return this.diskId;
	}

	public void setDiskId(String diskId) {
		this.diskId = diskId;
		if(diskId != null){
			putQueryParameter("DiskId", diskId);
		}
	}

	public String getEnsRegionIds() {
		return this.ensRegionIds;
	}

	public void setEnsRegionIds(String ensRegionIds) {
		this.ensRegionIds = ensRegionIds;
		if(ensRegionIds != null){
			putQueryParameter("EnsRegionIds", ensRegionIds);
		}
	}

	public String getDiskType() {
		return this.diskType;
	}

	public void setDiskType(String diskType) {
		this.diskType = diskType;
		if(diskType != null){
			putQueryParameter("DiskType", diskType);
		}
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putQueryParameter("Category", category);
		}
	}

	@Override
	public Class<DescribeDisksResponse> getResponseClass() {
		return DescribeDisksResponse.class;
	}

}
