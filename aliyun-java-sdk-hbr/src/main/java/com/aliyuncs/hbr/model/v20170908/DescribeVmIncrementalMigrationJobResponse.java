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

package com.aliyuncs.hbr.model.v20170908;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbr.transform.v20170908.DescribeVmIncrementalMigrationJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVmIncrementalMigrationJobResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private String vmSnapshotId;

	private String metaRestoreHash;

	private Boolean needStartRestore;

	private String syncId;

	private List<String> diskRestoreList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getVmSnapshotId() {
		return this.vmSnapshotId;
	}

	public void setVmSnapshotId(String vmSnapshotId) {
		this.vmSnapshotId = vmSnapshotId;
	}

	public String getMetaRestoreHash() {
		return this.metaRestoreHash;
	}

	public void setMetaRestoreHash(String metaRestoreHash) {
		this.metaRestoreHash = metaRestoreHash;
	}

	public Boolean getNeedStartRestore() {
		return this.needStartRestore;
	}

	public void setNeedStartRestore(Boolean needStartRestore) {
		this.needStartRestore = needStartRestore;
	}

	public String getSyncId() {
		return this.syncId;
	}

	public void setSyncId(String syncId) {
		this.syncId = syncId;
	}

	public List<String> getDiskRestoreList() {
		return this.diskRestoreList;
	}

	public void setDiskRestoreList(List<String> diskRestoreList) {
		this.diskRestoreList = diskRestoreList;
	}

	@Override
	public DescribeVmIncrementalMigrationJobResponse getInstance(UnmarshallerContext context) {
		return	DescribeVmIncrementalMigrationJobResponseUnmarshaller.unmarshall(this, context);
	}
}
