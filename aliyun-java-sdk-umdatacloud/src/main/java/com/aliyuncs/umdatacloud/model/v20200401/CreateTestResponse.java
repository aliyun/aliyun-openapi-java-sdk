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

package com.aliyuncs.umdatacloud.model.v20200401;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.umdatacloud.transform.v20200401.CreateTestResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateTestResponse extends AcsResponse {

	private String requestId;

	private String outOne;

	private String outTwo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getOutOne() {
		return this.outOne;
	}

	public void setOutOne(String outOne) {
		this.outOne = outOne;
	}

	public String getOutTwo() {
		return this.outTwo;
	}

	public void setOutTwo(String outTwo) {
		this.outTwo = outTwo;
	}

	@Override
	public CreateTestResponse getInstance(UnmarshallerContext context) {
		return	CreateTestResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
