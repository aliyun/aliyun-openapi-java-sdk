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
public class DescribeSnapshotsRequest extends RpcAcsRequest<DescribeSnapshotsResponse> {
	   

	private String ensRegionId;

	private String instanceId;

	private String snapshotId;

	private String snapshotName;

	private Integer pageNumber;

	private Integer pageSize;

	private String diskId;

	private String ensRegionIds;
	public DescribeSnapshotsRequest() {
		super("Ens", "2017-11-10", "DescribeSnapshots", "ens");
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getSnapshotId() {
		return this.snapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
		if(snapshotId != null){
			putQueryParameter("SnapshotId", snapshotId);
		}
	}

	public String getSnapshotName() {
		return this.snapshotName;
	}

	public void setSnapshotName(String snapshotName) {
		this.snapshotName = snapshotName;
		if(snapshotName != null){
			putQueryParameter("SnapshotName", snapshotName);
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

	@Override
	public Class<DescribeSnapshotsResponse> getResponseClass() {
		return DescribeSnapshotsResponse.class;
	}

}
