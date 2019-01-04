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
public class ModifyTieringPolicyRequest extends RpcAcsRequest<ModifyTieringPolicyResponse> {
	
	public ModifyTieringPolicyRequest() {
		super("NAS", "2017-06-26", "ModifyTieringPolicy", "nas");
	}

	private Long atime;

	private String fileName;

	private Long size;

	private Long recallTime;

	private String name;

	private String description;

	private Long ctime;

	private Long mtime;

	public Long getAtime() {
		return this.atime;
	}

	public void setAtime(Long atime) {
		this.atime = atime;
		if(atime != null){
			putQueryParameter("Atime", atime.toString());
		}
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		if(fileName != null){
			putQueryParameter("FileName", fileName);
		}
	}

	public Long getSize() {
		return this.size;
	}

	public void setSize(Long size) {
		this.size = size;
		if(size != null){
			putQueryParameter("Size", size.toString());
		}
	}

	public Long getRecallTime() {
		return this.recallTime;
	}

	public void setRecallTime(Long recallTime) {
		this.recallTime = recallTime;
		if(recallTime != null){
			putQueryParameter("RecallTime", recallTime.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Long getCtime() {
		return this.ctime;
	}

	public void setCtime(Long ctime) {
		this.ctime = ctime;
		if(ctime != null){
			putQueryParameter("Ctime", ctime.toString());
		}
	}

	public Long getMtime() {
		return this.mtime;
	}

	public void setMtime(Long mtime) {
		this.mtime = mtime;
		if(mtime != null){
			putQueryParameter("Mtime", mtime.toString());
		}
	}

	@Override
	public Class<ModifyTieringPolicyResponse> getResponseClass() {
		return ModifyTieringPolicyResponse.class;
	}

}
