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
package com.aliyuncs.push.model.v20150827;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class TestRequest extends RpcAcsRequest<TestResponse> {
	
	public TestRequest() {
		super("Push", "2015-08-27", "Test");
	}

	private Long appKey;

	private String target;

	private String targetValue;

	private String my_name;

	private Long my_age;

	public Long getAppKey() {
		return this.appKey;
	}

	public void setAppKey(Long appKey) {
		this.appKey = appKey;
		putQueryParameter("AppKey", appKey);
	}

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
		putQueryParameter("Target", target);
	}

	public String getTargetValue() {
		return this.targetValue;
	}

	public void setTargetValue(String targetValue) {
		this.targetValue = targetValue;
		putQueryParameter("TargetValue", targetValue);
	}

	public String getmy_name() {
		return this.my_name;
	}

	public void setmy_name(String my_name) {
		this.my_name = my_name;
		putQueryParameter("my_name", my_name);
	}

	public Long getmy_age() {
		return this.my_age;
	}

	public void setmy_age(Long my_age) {
		this.my_age = my_age;
		putQueryParameter("my_age", my_age);
	}

	@Override
	public Class<TestResponse> getResponseClass() {
		return TestResponse.class;
	}

}
