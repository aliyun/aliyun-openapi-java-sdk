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
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryRateLimitActionRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryRateLimitActionRulesResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<DataItem> data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String action;

		private String name;

		private String desc;

		private Integer limitNum;

		private Long timeWindow;

		private Boolean enable;

		private Boolean alwaysExec;

		private List<String> exclusions;

		private List<String> dimensions;

		private List<String> postActions;

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public Integer getLimitNum() {
			return this.limitNum;
		}

		public void setLimitNum(Integer limitNum) {
			this.limitNum = limitNum;
		}

		public Long getTimeWindow() {
			return this.timeWindow;
		}

		public void setTimeWindow(Long timeWindow) {
			this.timeWindow = timeWindow;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public Boolean getAlwaysExec() {
			return this.alwaysExec;
		}

		public void setAlwaysExec(Boolean alwaysExec) {
			this.alwaysExec = alwaysExec;
		}

		public List<String> getExclusions() {
			return this.exclusions;
		}

		public void setExclusions(List<String> exclusions) {
			this.exclusions = exclusions;
		}

		public List<String> getDimensions() {
			return this.dimensions;
		}

		public void setDimensions(List<String> dimensions) {
			this.dimensions = dimensions;
		}

		public List<String> getPostActions() {
			return this.postActions;
		}

		public void setPostActions(List<String> postActions) {
			this.postActions = postActions;
		}
	}

	@Override
	public OpsQueryRateLimitActionRulesResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryRateLimitActionRulesResponseUnmarshaller.unmarshall(this, context);
	}
}
