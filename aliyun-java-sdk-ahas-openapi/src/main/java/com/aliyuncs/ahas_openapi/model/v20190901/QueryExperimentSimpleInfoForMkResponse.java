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

package com.aliyuncs.ahas_openapi.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ahas_openapi.transform.v20190901.QueryExperimentSimpleInfoForMkResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryExperimentSimpleInfoForMkResponse extends AcsResponse {

	private String message;

	private Integer httpStatusCode;

	private String requestId;

	private Boolean success;

	private String code;

	private List<AttackItem> attack;

	private List<PrepareItem> prepare;

	private List<CheckItem> check;

	private List<RecoverItem> recover;

	private BasicInfo basicInfo;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<AttackItem> getAttack() {
		return this.attack;
	}

	public void setAttack(List<AttackItem> attack) {
		this.attack = attack;
	}

	public List<PrepareItem> getPrepare() {
		return this.prepare;
	}

	public void setPrepare(List<PrepareItem> prepare) {
		this.prepare = prepare;
	}

	public List<CheckItem> getCheck() {
		return this.check;
	}

	public void setCheck(List<CheckItem> check) {
		this.check = check;
	}

	public List<RecoverItem> getRecover() {
		return this.recover;
	}

	public void setRecover(List<RecoverItem> recover) {
		this.recover = recover;
	}

	public BasicInfo getBasicInfo() {
		return this.basicInfo;
	}

	public void setBasicInfo(BasicInfo basicInfo) {
		this.basicInfo = basicInfo;
	}

	public static class AttackItem {

		private String name;

		private String appCode;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAppCode() {
			return this.appCode;
		}

		public void setAppCode(String appCode) {
			this.appCode = appCode;
		}
	}

	public static class PrepareItem {

		private String name;

		private String appCode;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAppCode() {
			return this.appCode;
		}

		public void setAppCode(String appCode) {
			this.appCode = appCode;
		}
	}

	public static class CheckItem {

		private String name;

		private String appCode;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAppCode() {
			return this.appCode;
		}

		public void setAppCode(String appCode) {
			this.appCode = appCode;
		}
	}

	public static class RecoverItem {

		private String name;

		private String appCode;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAppCode() {
			return this.appCode;
		}

		public void setAppCode(String appCode) {
			this.appCode = appCode;
		}
	}

	public static class BasicInfo {

		private String experimentId;

		private String name;

		private String description;

		private String namespace;

		private String regionId;

		private String state;

		private List<String> tags;

		public String getExperimentId() {
			return this.experimentId;
		}

		public void setExperimentId(String experimentId) {
			this.experimentId = experimentId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public List<String> getTags() {
			return this.tags;
		}

		public void setTags(List<String> tags) {
			this.tags = tags;
		}
	}

	@Override
	public QueryExperimentSimpleInfoForMkResponse getInstance(UnmarshallerContext context) {
		return	QueryExperimentSimpleInfoForMkResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
