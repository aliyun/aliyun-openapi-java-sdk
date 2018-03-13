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
package com.aliyuncs.hpc.model.v20160603;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class StartJumpserverRequest extends RpcAcsRequest<StartJumpserverResponse> {
	
	public StartJumpserverRequest() {
		super("HPC", "2016-06-03", "StartJumpserver");
		setMethod(MethodType.POST);
	}

	private String tOKEN;

	private String instanceId;

	private Integer force;

	public String getTOKEN() {
		return this.tOKEN;
	}

	public void setTOKEN(String tOKEN) {
		this.tOKEN = tOKEN;
		putQueryParameter("TOKEN", tOKEN);
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		putQueryParameter("InstanceId", instanceId);
	}

	public Integer getForce() {
		return this.force;
	}

	public void setForce(Integer force) {
		this.force = force;
		putQueryParameter("Force", force);
	}

	@Override
	public Class<StartJumpserverResponse> getResponseClass() {
		return StartJumpserverResponse.class;
	}

}
