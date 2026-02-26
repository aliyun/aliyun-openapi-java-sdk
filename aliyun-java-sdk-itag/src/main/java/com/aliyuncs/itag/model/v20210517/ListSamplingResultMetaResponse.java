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

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.itag.transform.v20210517.ListSamplingResultMetaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSamplingResultMetaResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String errInfo;

	private String msg;

	private Boolean succ;

	private String errorCode;

	private Result result;

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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private ITagSamplingStatsDTO iTagSamplingStatsDTO;

		public ITagSamplingStatsDTO getITagSamplingStatsDTO() {
			return this.iTagSamplingStatsDTO;
		}

		public void setITagSamplingStatsDTO(ITagSamplingStatsDTO iTagSamplingStatsDTO) {
			this.iTagSamplingStatsDTO = iTagSamplingStatsDTO;
		}

		public static class ITagSamplingStatsDTO {

			private Integer hasNonCompleteTask;

			private String subUserTaskId;

			private Map<Object,Object> workUserMap;

			private Map<Object,Object> markResultKVMap;

			private String totalSubTaskCount;

			private String totalMarkItemCount;

			private Map<Object,Object> subTaskAndMarkItemMap;

			public Integer getHasNonCompleteTask() {
				return this.hasNonCompleteTask;
			}

			public void setHasNonCompleteTask(Integer hasNonCompleteTask) {
				this.hasNonCompleteTask = hasNonCompleteTask;
			}

			public String getSubUserTaskId() {
				return this.subUserTaskId;
			}

			public void setSubUserTaskId(String subUserTaskId) {
				this.subUserTaskId = subUserTaskId;
			}

			public Map<Object,Object> getWorkUserMap() {
				return this.workUserMap;
			}

			public void setWorkUserMap(Map<Object,Object> workUserMap) {
				this.workUserMap = workUserMap;
			}

			public Map<Object,Object> getMarkResultKVMap() {
				return this.markResultKVMap;
			}

			public void setMarkResultKVMap(Map<Object,Object> markResultKVMap) {
				this.markResultKVMap = markResultKVMap;
			}

			public String getTotalSubTaskCount() {
				return this.totalSubTaskCount;
			}

			public void setTotalSubTaskCount(String totalSubTaskCount) {
				this.totalSubTaskCount = totalSubTaskCount;
			}

			public String getTotalMarkItemCount() {
				return this.totalMarkItemCount;
			}

			public void setTotalMarkItemCount(String totalMarkItemCount) {
				this.totalMarkItemCount = totalMarkItemCount;
			}

			public Map<Object,Object> getSubTaskAndMarkItemMap() {
				return this.subTaskAndMarkItemMap;
			}

			public void setSubTaskAndMarkItemMap(Map<Object,Object> subTaskAndMarkItemMap) {
				this.subTaskAndMarkItemMap = subTaskAndMarkItemMap;
			}
		}
	}

	@Override
	public ListSamplingResultMetaResponse getInstance(UnmarshallerContext context) {
		return	ListSamplingResultMetaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
