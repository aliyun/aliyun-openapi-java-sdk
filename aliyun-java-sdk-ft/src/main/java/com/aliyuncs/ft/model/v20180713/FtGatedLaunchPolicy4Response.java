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

package com.aliyuncs.ft.model.v20180713;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ft.transform.v20180713.FtGatedLaunchPolicy4ResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FtGatedLaunchPolicy4Response extends AcsResponse {

	private String requestId;

	private String isGatedLaunch;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getIsGatedLaunch() {
		return this.isGatedLaunch;
	}

	public void setIsGatedLaunch(String isGatedLaunch) {
		this.isGatedLaunch = isGatedLaunch;
	}

	@Override
	public FtGatedLaunchPolicy4Response getInstance(UnmarshallerContext context) {
		return	FtGatedLaunchPolicy4ResponseUnmarshaller.unmarshall(this, context);
	}
}
