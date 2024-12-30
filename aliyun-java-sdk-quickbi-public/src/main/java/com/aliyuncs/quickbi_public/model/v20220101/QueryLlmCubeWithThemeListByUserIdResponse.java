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

package com.aliyuncs.quickbi_public.model.v20220101;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20220101.QueryLlmCubeWithThemeListByUserIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLlmCubeWithThemeListByUserIdResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Result result;

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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Map<Object,Object> cubeIds;

		private Map<Object,Object> themeIds;

		public Map<Object,Object> getCubeIds() {
			return this.cubeIds;
		}

		public void setCubeIds(Map<Object,Object> cubeIds) {
			this.cubeIds = cubeIds;
		}

		public Map<Object,Object> getThemeIds() {
			return this.themeIds;
		}

		public void setThemeIds(Map<Object,Object> themeIds) {
			this.themeIds = themeIds;
		}
	}

	@Override
	public QueryLlmCubeWithThemeListByUserIdResponse getInstance(UnmarshallerContext context) {
		return	QueryLlmCubeWithThemeListByUserIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
