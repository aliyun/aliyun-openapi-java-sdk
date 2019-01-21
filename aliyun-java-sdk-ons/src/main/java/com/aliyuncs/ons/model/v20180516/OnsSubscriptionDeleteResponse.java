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

package com.aliyuncs.ons.model.v20180516;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ons.transform.v20180516.OnsSubscriptionDeleteResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OnsSubscriptionDeleteResponse extends AcsResponse {

	private String requestId;

	private String helpUrl;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getHelpUrl() {
		return this.helpUrl;
	}

	public void setHelpUrl(String helpUrl) {
		this.helpUrl = helpUrl;
	}

	@Override
	public OnsSubscriptionDeleteResponse getInstance(UnmarshallerContext context) {
		return	OnsSubscriptionDeleteResponseUnmarshaller.unmarshall(this, context);
	}
}
