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

package com.aliyuncs.nas.model.v20170626;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CPFSModifyFileSystemRequest extends RpcAcsRequest<CPFSModifyFileSystemResponse> {
	
	public CPFSModifyFileSystemRequest() {
		super("NAS", "2017-06-26", "CPFSModifyFileSystem", "nas");
	}

	private Long bandwidth;

	private String fsId;

	private String fsDesc;

	private Long capacity;

	public Long getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Long bandwidth) {
		this.bandwidth = bandwidth;
		if(bandwidth != null){
			putQueryParameter("Bandwidth", bandwidth.toString());
		}
	}

	public String getFsId() {
		return this.fsId;
	}

	public void setFsId(String fsId) {
		this.fsId = fsId;
		if(fsId != null){
			putQueryParameter("FsId", fsId);
		}
	}

	public String getFsDesc() {
		return this.fsDesc;
	}

	public void setFsDesc(String fsDesc) {
		this.fsDesc = fsDesc;
		if(fsDesc != null){
			putQueryParameter("FsDesc", fsDesc);
		}
	}

	public Long getCapacity() {
		return this.capacity;
	}

	public void setCapacity(Long capacity) {
		this.capacity = capacity;
		if(capacity != null){
			putQueryParameter("Capacity", capacity.toString());
		}
	}

	@Override
	public Class<CPFSModifyFileSystemResponse> getResponseClass() {
		return CPFSModifyFileSystemResponse.class;
	}

}
