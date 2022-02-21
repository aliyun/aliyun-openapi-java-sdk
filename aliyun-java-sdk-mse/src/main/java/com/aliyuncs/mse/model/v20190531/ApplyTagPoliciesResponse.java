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

package com.aliyuncs.mse.model.v20190531;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.ApplyTagPoliciesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ApplyTagPoliciesResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Integer code;

	private Boolean success;

	private List<RouteRuleVO> data;

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

	public List<RouteRuleVO> getData() {
		return this.data;
	}

	public void setData(List<RouteRuleVO> data) {
		this.data = data;
	}

	public static class RouteRuleVO {

		private Integer status;

		private Integer instanceNum;

		private Boolean remove;

		private Boolean carryData;

		private String tag;

		private String name;

		private String rules;

		private Long id;

		private Integer rate;

		private Boolean enable;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getInstanceNum() {
			return this.instanceNum;
		}

		public void setInstanceNum(Integer instanceNum) {
			this.instanceNum = instanceNum;
		}

		public Boolean getRemove() {
			return this.remove;
		}

		public void setRemove(Boolean remove) {
			this.remove = remove;
		}

		public Boolean getCarryData() {
			return this.carryData;
		}

		public void setCarryData(Boolean carryData) {
			this.carryData = carryData;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRules() {
			return this.rules;
		}

		public void setRules(String rules) {
			this.rules = rules;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Integer getRate() {
			return this.rate;
		}

		public void setRate(Integer rate) {
			this.rate = rate;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}
	}

	@Override
	public ApplyTagPoliciesResponse getInstance(UnmarshallerContext context) {
		return	ApplyTagPoliciesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
