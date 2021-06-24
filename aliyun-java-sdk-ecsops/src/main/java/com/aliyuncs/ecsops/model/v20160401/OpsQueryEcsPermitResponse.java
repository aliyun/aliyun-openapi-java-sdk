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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryEcsPermitResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryEcsPermitResponse extends AcsResponse {

	private String requestId;

	private List<Permition> permitions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Permition> getPermitions() {
		return this.permitions;
	}

	public void setPermitions(List<Permition> permitions) {
		this.permitions = permitions;
	}

	public static class Permition {

		private String permitValue;

		private String permitKey;

		public String getPermitValue() {
			return this.permitValue;
		}

		public void setPermitValue(String permitValue) {
			this.permitValue = permitValue;
		}

		public String getPermitKey() {
			return this.permitKey;
		}

		public void setPermitKey(String permitKey) {
			this.permitKey = permitKey;
		}
	}

	@Override
	public OpsQueryEcsPermitResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryEcsPermitResponseUnmarshaller.unmarshall(this, context);
	}
}
