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

package com.aliyuncs.aliyuncvc.model.v20190919;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aliyuncvc.transform.v20190919.ListDevicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDevicesResponse extends AcsResponse {

	private Integer errorCode;

	private String message;

	private Boolean success;

	private String requestId;

	private Data data;

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer total;

		private Integer pageSize;

		private Integer pageNumber;

		private List<Device> devices;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public List<Device> getDevices() {
			return this.devices;
		}

		public void setDevices(List<Device> devices) {
			this.devices = devices;
		}

		public static class Device {

			private String activationCode;

			private String conferenceCode;

			private String conferenceName;

			private String createTime;

			private String pictureUrl;

			private String sN;

			private String status;

			private String castScreenCode;

			public String getActivationCode() {
				return this.activationCode;
			}

			public void setActivationCode(String activationCode) {
				this.activationCode = activationCode;
			}

			public String getConferenceCode() {
				return this.conferenceCode;
			}

			public void setConferenceCode(String conferenceCode) {
				this.conferenceCode = conferenceCode;
			}

			public String getConferenceName() {
				return this.conferenceName;
			}

			public void setConferenceName(String conferenceName) {
				this.conferenceName = conferenceName;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getPictureUrl() {
				return this.pictureUrl;
			}

			public void setPictureUrl(String pictureUrl) {
				this.pictureUrl = pictureUrl;
			}

			public String getSN() {
				return this.sN;
			}

			public void setSN(String sN) {
				this.sN = sN;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getCastScreenCode() {
				return this.castScreenCode;
			}

			public void setCastScreenCode(String castScreenCode) {
				this.castScreenCode = castScreenCode;
			}
		}
	}

	@Override
	public ListDevicesResponse getInstance(UnmarshallerContext context) {
		return	ListDevicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
