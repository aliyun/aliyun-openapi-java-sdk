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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsUpdateUserGrayBusinessResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsUpdateUserGrayBusinessResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String success;

	private UserGrayBusinessDO userGrayBusinessDO;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public UserGrayBusinessDO getUserGrayBusinessDO() {
		return this.userGrayBusinessDO;
	}

	public void setUserGrayBusinessDO(UserGrayBusinessDO userGrayBusinessDO) {
		this.userGrayBusinessDO = userGrayBusinessDO;
	}

	public static class UserGrayBusinessDO {

		private Long id;

		private String grayBizType;

		private Integer grayStrictMode;

		private String userLevels;

		private Integer maxVms;

		private Integer status;

		private String gmtCreate;

		private String gmtModified;

		private Long aliUid;

		private String regionNo;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getGrayBizType() {
			return this.grayBizType;
		}

		public void setGrayBizType(String grayBizType) {
			this.grayBizType = grayBizType;
		}

		public Integer getGrayStrictMode() {
			return this.grayStrictMode;
		}

		public void setGrayStrictMode(Integer grayStrictMode) {
			this.grayStrictMode = grayStrictMode;
		}

		public String getUserLevels() {
			return this.userLevels;
		}

		public void setUserLevels(String userLevels) {
			this.userLevels = userLevels;
		}

		public Integer getMaxVms() {
			return this.maxVms;
		}

		public void setMaxVms(Integer maxVms) {
			this.maxVms = maxVms;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}
	}

	@Override
	public OpsUpdateUserGrayBusinessResponse getInstance(UnmarshallerContext context) {
		return	OpsUpdateUserGrayBusinessResponseUnmarshaller.unmarshall(this, context);
	}
}
