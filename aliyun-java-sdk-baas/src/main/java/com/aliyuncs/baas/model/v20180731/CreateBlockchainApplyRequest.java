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

package com.aliyuncs.baas.model.v20180731;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateBlockchainApplyRequest extends RpcAcsRequest<CreateBlockchainApplyResponse> {
	
	public CreateBlockchainApplyRequest() {
		super("Baas", "2018-07-31", "CreateBlockchainApply");
	}

	private Integer size;

	private Integer machineNum;

	private Integer liveTime;

	private String bizid;

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
		if(size != null){
			putBodyParameter("Size", size.toString());
		}
	}

	public Integer getMachineNum() {
		return this.machineNum;
	}

	public void setMachineNum(Integer machineNum) {
		this.machineNum = machineNum;
		if(machineNum != null){
			putBodyParameter("MachineNum", machineNum.toString());
		}
	}

	public Integer getLiveTime() {
		return this.liveTime;
	}

	public void setLiveTime(Integer liveTime) {
		this.liveTime = liveTime;
		if(liveTime != null){
			putBodyParameter("LiveTime", liveTime.toString());
		}
	}

	public String getBizid() {
		return this.bizid;
	}

	public void setBizid(String bizid) {
		this.bizid = bizid;
		if(bizid != null){
			putBodyParameter("Bizid", bizid);
		}
	}

	@Override
	public Class<CreateBlockchainApplyResponse> getResponseClass() {
		return CreateBlockchainApplyResponse.class;
	}

}
