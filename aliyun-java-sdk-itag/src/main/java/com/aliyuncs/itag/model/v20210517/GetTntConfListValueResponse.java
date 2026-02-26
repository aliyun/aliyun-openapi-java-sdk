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

package com.aliyuncs.itag.model.v20210517;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.itag.transform.v20210517.GetTntConfListValueResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTntConfListValueResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String errInfo;

	private String msg;

	private Boolean succ;

	private String errorCode;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrInfo() {
		return this.errInfo;
	}

	public void setErrInfo(String errInfo) {
		this.errInfo = errInfo;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Boolean getSucc() {
		return this.succ;
	}

	public void setSucc(Boolean succ) {
		this.succ = succ;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String propKey;

		private String tntInstId;

		private String propValue;

		private List<String> propListValue;

		public String getPropKey() {
			return this.propKey;
		}

		public void setPropKey(String propKey) {
			this.propKey = propKey;
		}

		public String getTntInstId() {
			return this.tntInstId;
		}

		public void setTntInstId(String tntInstId) {
			this.tntInstId = tntInstId;
		}

		public String getPropValue() {
			return this.propValue;
		}

		public void setPropValue(String propValue) {
			this.propValue = propValue;
		}

		public List<String> getPropListValue() {
			return this.propListValue;
		}

		public void setPropListValue(List<String> propListValue) {
			this.propListValue = propListValue;
		}
	}

	@Override
	public GetTntConfListValueResponse getInstance(UnmarshallerContext context) {
		return	GetTntConfListValueResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
