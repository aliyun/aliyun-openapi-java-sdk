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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeUserRegionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeUserRegionResponse extends AcsResponse {

	private Integer totalCount;

	private String message;

	private String requestId;

	private String code;

	private String success;

	private List<UserRegionModel> userRegionModels;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public List<UserRegionModel> getUserRegionModels() {
		return this.userRegionModels;
	}

	public void setUserRegionModels(List<UserRegionModel> userRegionModels) {
		this.userRegionModels = userRegionModels;
	}

	public static class UserRegionModel {

		private String zoneGroupNo;

		private String zoneNos;

		private String bflag;

		private String regionNo;

		private String zoneGroupState;

		private String izState;

		private String izNo;

		private String parentBflag;

		public String getZoneGroupNo() {
			return this.zoneGroupNo;
		}

		public void setZoneGroupNo(String zoneGroupNo) {
			this.zoneGroupNo = zoneGroupNo;
		}

		public String getZoneNos() {
			return this.zoneNos;
		}

		public void setZoneNos(String zoneNos) {
			this.zoneNos = zoneNos;
		}

		public String getBflag() {
			return this.bflag;
		}

		public void setBflag(String bflag) {
			this.bflag = bflag;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public String getZoneGroupState() {
			return this.zoneGroupState;
		}

		public void setZoneGroupState(String zoneGroupState) {
			this.zoneGroupState = zoneGroupState;
		}

		public String getIzState() {
			return this.izState;
		}

		public void setIzState(String izState) {
			this.izState = izState;
		}

		public String getIzNo() {
			return this.izNo;
		}

		public void setIzNo(String izNo) {
			this.izNo = izNo;
		}

		public String getParentBflag() {
			return this.parentBflag;
		}

		public void setParentBflag(String parentBflag) {
			this.parentBflag = parentBflag;
		}
	}

	@Override
	public OpsDescribeUserRegionResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeUserRegionResponseUnmarshaller.unmarshall(this, context);
	}
}
