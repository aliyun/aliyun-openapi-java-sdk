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

package com.aliyuncs.uisplus.model.v20200707;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.uisplus.transform.v20200707.CreateUisResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateUisResponse extends AcsResponse {

	private String uisId;

	private String requestId;

	private List<String> uisNodes;

	public String getUisId() {
		return this.uisId;
	}

	public void setUisId(String uisId) {
		this.uisId = uisId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getUisNodes() {
		return this.uisNodes;
	}

	public void setUisNodes(List<String> uisNodes) {
		this.uisNodes = uisNodes;
	}

	@Override
	public CreateUisResponse getInstance(UnmarshallerContext context) {
		return	CreateUisResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
