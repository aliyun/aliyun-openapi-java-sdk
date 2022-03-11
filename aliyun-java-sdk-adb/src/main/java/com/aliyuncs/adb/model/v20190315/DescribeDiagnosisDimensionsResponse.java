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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeDiagnosisDimensionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDiagnosisDimensionsResponse extends AcsResponse {

	private String requestId;

	private List<String> clientIps;

	private List<String> resourceGroups;

	private List<String> userNames;

	private List<String> databases;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getClientIps() {
		return this.clientIps;
	}

	public void setClientIps(List<String> clientIps) {
		this.clientIps = clientIps;
	}

	public List<String> getResourceGroups() {
		return this.resourceGroups;
	}

	public void setResourceGroups(List<String> resourceGroups) {
		this.resourceGroups = resourceGroups;
	}

	public List<String> getUserNames() {
		return this.userNames;
	}

	public void setUserNames(List<String> userNames) {
		this.userNames = userNames;
	}

	public List<String> getDatabases() {
		return this.databases;
	}

	public void setDatabases(List<String> databases) {
		this.databases = databases;
	}

	@Override
	public DescribeDiagnosisDimensionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDiagnosisDimensionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
