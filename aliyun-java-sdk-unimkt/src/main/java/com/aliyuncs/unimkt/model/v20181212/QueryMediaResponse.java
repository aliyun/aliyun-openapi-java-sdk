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

package com.aliyuncs.unimkt.model.v20181212;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.unimkt.transform.v20181212.QueryMediaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMediaResponse extends AcsResponse {

	private String code;

	private Boolean success;

	private String message;

	private String requestId;

	private Model model;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Model getModel() {
		return this.model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public static class Model {

		private Long createTime;

		private Long modifyTime;

		private String tenantId;

		private String mediaName;

		private String mediaId;

		private String mediaType;

		private String firstScene;

		private String secondScene;

		private String mediaStatus;

		private String accessStatus;

		private String os;

		private String config;

		private String keyWords;

		private String accessWay;

		private String extInfo;

		private Long version;

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(Long modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getMediaName() {
			return this.mediaName;
		}

		public void setMediaName(String mediaName) {
			this.mediaName = mediaName;
		}

		public String getMediaId() {
			return this.mediaId;
		}

		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}

		public String getMediaType() {
			return this.mediaType;
		}

		public void setMediaType(String mediaType) {
			this.mediaType = mediaType;
		}

		public String getFirstScene() {
			return this.firstScene;
		}

		public void setFirstScene(String firstScene) {
			this.firstScene = firstScene;
		}

		public String getSecondScene() {
			return this.secondScene;
		}

		public void setSecondScene(String secondScene) {
			this.secondScene = secondScene;
		}

		public String getMediaStatus() {
			return this.mediaStatus;
		}

		public void setMediaStatus(String mediaStatus) {
			this.mediaStatus = mediaStatus;
		}

		public String getAccessStatus() {
			return this.accessStatus;
		}

		public void setAccessStatus(String accessStatus) {
			this.accessStatus = accessStatus;
		}

		public String getOs() {
			return this.os;
		}

		public void setOs(String os) {
			this.os = os;
		}

		public String getConfig() {
			return this.config;
		}

		public void setConfig(String config) {
			this.config = config;
		}

		public String getKeyWords() {
			return this.keyWords;
		}

		public void setKeyWords(String keyWords) {
			this.keyWords = keyWords;
		}

		public String getAccessWay() {
			return this.accessWay;
		}

		public void setAccessWay(String accessWay) {
			this.accessWay = accessWay;
		}

		public String getExtInfo() {
			return this.extInfo;
		}

		public void setExtInfo(String extInfo) {
			this.extInfo = extInfo;
		}

		public Long getVersion() {
			return this.version;
		}

		public void setVersion(Long version) {
			this.version = version;
		}
	}

	@Override
	public QueryMediaResponse getInstance(UnmarshallerContext context) {
		return	QueryMediaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
