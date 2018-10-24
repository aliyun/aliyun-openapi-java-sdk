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

package com.aliyuncs.crm.model.v20150408;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.crm.transform.v20150408.GetAliyunPkByAliyunIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAliyunPkByAliyunIdResponse extends AcsResponse {

	private String requestId;

	private String aliyunPk;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAliyunPk() {
		return this.aliyunPk;
	}

	public void setAliyunPk(String aliyunPk) {
		this.aliyunPk = aliyunPk;
	}

	@Override
	public GetAliyunPkByAliyunIdResponse getInstance(UnmarshallerContext context) {
		return	GetAliyunPkByAliyunIdResponseUnmarshaller.unmarshall(this, context);
	}
}
