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

package com.aliyuncs.amptest.model.v20201230;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.amptest.transform.v20201230.HuichengetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class HuichengetResponse extends AcsResponse {

	private String requestId;

	private String instanceId4;

	private String message;

	private String code;

	private String age;

	private String apple;

	private String five;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId4() {
		return this.instanceId4;
	}

	public void setInstanceId4(String instanceId4) {
		this.instanceId4 = instanceId4;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getApple() {
		return this.apple;
	}

	public void setApple(String apple) {
		this.apple = apple;
	}

	public String getFive() {
		return this.five;
	}

	public void setFive(String five) {
		this.five = five;
	}

	@Override
	public HuichengetResponse getInstance(UnmarshallerContext context) {
		return	HuichengetResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
