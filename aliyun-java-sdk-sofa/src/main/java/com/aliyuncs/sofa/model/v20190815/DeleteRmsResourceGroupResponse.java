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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.DeleteRmsResourceGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DeleteRmsResourceGroupResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Response response;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Response getResponse() {
		return this.response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	public static class Response {

		private String layer;

		private Entity entity;

		public String getLayer() {
			return this.layer;
		}

		public void setLayer(String layer) {
			this.layer = layer;
		}

		public Entity getEntity() {
			return this.entity;
		}

		public void setEntity(Entity entity) {
			this.entity = entity;
		}

		public static class Entity {

			private String errCode;

			private String errMsg;

			private String errResolution;

			private String message;

			private Boolean module;

			private Boolean success;

			public String getErrCode() {
				return this.errCode;
			}

			public void setErrCode(String errCode) {
				this.errCode = errCode;
			}

			public String getErrMsg() {
				return this.errMsg;
			}

			public void setErrMsg(String errMsg) {
				this.errMsg = errMsg;
			}

			public String getErrResolution() {
				return this.errResolution;
			}

			public void setErrResolution(String errResolution) {
				this.errResolution = errResolution;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public Boolean getModule() {
				return this.module;
			}

			public void setModule(Boolean module) {
				this.module = module;
			}

			public Boolean getSuccess() {
				return this.success;
			}

			public void setSuccess(Boolean success) {
				this.success = success;
			}
		}
	}

	@Override
	public DeleteRmsResourceGroupResponse getInstance(UnmarshallerContext context) {
		return	DeleteRmsResourceGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
