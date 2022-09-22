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

package com.aliyuncs.ga.model.v20191120;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ga.transform.v20191120.AttachDdosToAcceleratorResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AttachDdosToAcceleratorResponse extends AcsResponse {

	private String ddosId;

	private String requestId;

	private String gaId;

	public String getDdosId() {
		return this.ddosId;
	}

	public void setDdosId(String ddosId) {
		this.ddosId = ddosId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getGaId() {
		return this.gaId;
	}

	public void setGaId(String gaId) {
		this.gaId = gaId;
	}

	@Override
	public AttachDdosToAcceleratorResponse getInstance(UnmarshallerContext context) {
		return	AttachDdosToAcceleratorResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
