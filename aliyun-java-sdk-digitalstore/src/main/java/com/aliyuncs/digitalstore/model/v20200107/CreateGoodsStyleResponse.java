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

package com.aliyuncs.digitalstore.model.v20200107;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.digitalstore.transform.v20200107.CreateGoodsStyleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateGoodsStyleResponse extends AcsResponse {

	private String styleId;

	private String requestId;

	private Boolean success;

	public String getStyleId() {
		return this.styleId;
	}

	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	@Override
	public CreateGoodsStyleResponse getInstance(UnmarshallerContext context) {
		return	CreateGoodsStyleResponseUnmarshaller.unmarshall(this, context);
	}
}
