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

package com.aliyuncs.lto.model.v20210707;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.lto.transform.v20210707.ListBaaSFabricConsortiumResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBaaSFabricConsortiumResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Boolean success;

	private List<BaaSFabricConsortiumInfo> data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public List<BaaSFabricConsortiumInfo> getData() {
		return this.data;
	}

	public void setData(List<BaaSFabricConsortiumInfo> data) {
		this.data = data;
	}

	public static class BaaSFabricConsortiumInfo {

		private String baaSFabricConsortiumId;

		private String baaSFabricConsortiumName;

		public String getBaaSFabricConsortiumId() {
			return this.baaSFabricConsortiumId;
		}

		public void setBaaSFabricConsortiumId(String baaSFabricConsortiumId) {
			this.baaSFabricConsortiumId = baaSFabricConsortiumId;
		}

		public String getBaaSFabricConsortiumName() {
			return this.baaSFabricConsortiumName;
		}

		public void setBaaSFabricConsortiumName(String baaSFabricConsortiumName) {
			this.baaSFabricConsortiumName = baaSFabricConsortiumName;
		}
	}

	@Override
	public ListBaaSFabricConsortiumResponse getInstance(UnmarshallerContext context) {
		return	ListBaaSFabricConsortiumResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
