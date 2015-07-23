/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.yundun.model.v20150416;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SetDdosQpsRequest extends RpcAcsRequest<SetDdosQpsResponse> {
	
	public SetDdosQpsRequest() {
		super("Yundun", "2015-04-16", "SetDdosQps");
	}

	private String instanceId;

	private String instanceType;

	private Integer qpsPosition;

	private Integer level;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		putQueryParameter("InstanceId", instanceId);
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		putQueryParameter("InstanceType", instanceType);
	}

	public Integer getQpsPosition() {
		return this.qpsPosition;
	}

	public void setQpsPosition(Integer qpsPosition) {
		this.qpsPosition = qpsPosition;
		putQueryParameter("QpsPosition", String.valueOf(qpsPosition));
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
		putQueryParameter("Level", String.valueOf(level));
	}

	@Override
	public Class<SetDdosQpsResponse> getResponseClass() {
		return SetDdosQpsResponse.class;
	}

}
