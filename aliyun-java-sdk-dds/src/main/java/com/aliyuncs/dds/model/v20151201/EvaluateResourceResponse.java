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

package com.aliyuncs.dds.model.v20151201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.EvaluateResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class EvaluateResourceResponse extends AcsResponse {

	private String requestId;

	private String engine;

	private String engineVersion;

	private String dBInstanceAvailable;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getEngineVersion() {
		return this.engineVersion;
	}

	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
	}

	public String getDBInstanceAvailable() {
		return this.dBInstanceAvailable;
	}

	public void setDBInstanceAvailable(String dBInstanceAvailable) {
		this.dBInstanceAvailable = dBInstanceAvailable;
	}

	@Override
	public EvaluateResourceResponse getInstance(UnmarshallerContext context) {
		return	EvaluateResourceResponseUnmarshaller.unmarshall(this, context);
	}
}
