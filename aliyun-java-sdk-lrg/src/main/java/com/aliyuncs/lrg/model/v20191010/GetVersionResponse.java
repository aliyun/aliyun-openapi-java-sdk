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

package com.aliyuncs.lrg.model.v20191010;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.lrg.transform.v20191010.GetVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVersionResponse extends AcsResponse {

	private Integer code;

	private Boolean success;

	private String message;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Map<Object,Object> moduleMap;

		private Map<Object,Object> nonModule;

		public Map<Object,Object> getModuleMap() {
			return this.moduleMap;
		}

		public void setModuleMap(Map<Object,Object> moduleMap) {
			this.moduleMap = moduleMap;
		}

		public Map<Object,Object> getNonModule() {
			return this.nonModule;
		}

		public void setNonModule(Map<Object,Object> nonModule) {
			this.nonModule = nonModule;
		}
	}

	@Override
	public GetVersionResponse getInstance(UnmarshallerContext context) {
		return	GetVersionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
