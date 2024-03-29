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
public class ResizeDiskRequest extends RpcAcsRequest<ResizeDiskResponse> {
	   

	private String diskId;

	private String newSize;
	public ResizeDiskRequest() {
		super("Ens", "2017-11-10", "ResizeDisk", "ens");
		setMethod(MethodType.POST);
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

	public String getNewSize() {
		return this.newSize;
	}

	public void setNewSize(String newSize) {
		this.newSize = newSize;
		if(newSize != null){
			putQueryParameter("NewSize", newSize);
		}
	}

	@Override
	public Class<ResizeDiskResponse> getResponseClass() {
		return ResizeDiskResponse.class;
	}

}
