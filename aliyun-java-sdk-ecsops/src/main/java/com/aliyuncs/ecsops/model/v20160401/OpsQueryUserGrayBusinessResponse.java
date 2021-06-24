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
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryUserGrayBusinessResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryUserGrayBusinessResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private String success;

	private List<UserGrayBusinessDO> userGrayBusinessDOs;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public List<UserGrayBusinessDO> getUserGrayBusinessDOs() {
		return this.userGrayBusinessDOs;
	}

	public void setUserGrayBusinessDOs(List<UserGrayBusinessDO> userGrayBusinessDOs) {
		this.userGrayBusinessDOs = userGrayBusinessDOs;
	}

	public static class UserGrayBusinessDO {

		private Integer status;

		private Integer maxVms;

		private Integer grayStrictMode;

		private String grayBizType;

		private String regionNo;

		private String userLevels;

		private String gmtCreate;

		private Long aliUid;

		private String gmtModified;

		private Long id;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getMaxVms() {
			return this.maxVms;
		}

		public void setMaxVms(Integer maxVms) {
			this.maxVms = maxVms;
		}

		public Integer getGrayStrictMode() {
			return this.grayStrictMode;
		}

		public void setGrayStrictMode(Integer grayStrictMode) {
			this.grayStrictMode = grayStrictMode;
		}

		public String getGrayBizType() {
			return this.grayBizType;
		}

		public void setGrayBizType(String grayBizType) {
			this.grayBizType = grayBizType;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public String getUserLevels() {
			return this.userLevels;
		}

		public void setUserLevels(String userLevels) {
			this.userLevels = userLevels;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	}

	@Override
	public OpsQueryUserGrayBusinessResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryUserGrayBusinessResponseUnmarshaller.unmarshall(this, context);
	}
}
