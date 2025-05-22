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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.SwitchDBInstanceNetTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SwitchDBInstanceNetTypeResponse extends AcsResponse {

	private String newConnectionString;

	private String oldConnectionString;

	private String requestId;

	public String getNewConnectionString() {
		return this.newConnectionString;
	}

	public void setNewConnectionString(String newConnectionString) {
		this.newConnectionString = newConnectionString;
	}

	public String getOldConnectionString() {
		return this.oldConnectionString;
	}

	public void setOldConnectionString(String oldConnectionString) {
		this.oldConnectionString = oldConnectionString;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public SwitchDBInstanceNetTypeResponse getInstance(UnmarshallerContext context) {
		return	SwitchDBInstanceNetTypeResponseUnmarshaller.unmarshall(this, context);
	}
}
