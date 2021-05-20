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

package com.aliyuncs.linkvisual.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkvisual.transform.v20180120.QueryDevicePictureByListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDevicePictureByListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private List<PicData> data;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<PicData> getData() {
		return this.data;
	}

	public void setData(List<PicData> data) {
		this.data = data;
	}

	public static class PicData {

		private String iotId;

		private Long picCreateTime;

		private String picId;

		private String picUrl;

		private String thumbUrl;

		public String getIotId() {
			return this.iotId;
		}

		public void setIotId(String iotId) {
			this.iotId = iotId;
		}

		public Long getPicCreateTime() {
			return this.picCreateTime;
		}

		public void setPicCreateTime(Long picCreateTime) {
			this.picCreateTime = picCreateTime;
		}

		public String getPicId() {
			return this.picId;
		}

		public void setPicId(String picId) {
			this.picId = picId;
		}

		public String getPicUrl() {
			return this.picUrl;
		}

		public void setPicUrl(String picUrl) {
			this.picUrl = picUrl;
		}

		public String getThumbUrl() {
			return this.thumbUrl;
		}

		public void setThumbUrl(String thumbUrl) {
			this.thumbUrl = thumbUrl;
		}
	}

	@Override
	public QueryDevicePictureByListResponse getInstance(UnmarshallerContext context) {
		return	QueryDevicePictureByListResponseUnmarshaller.unmarshall(this, context);
	}
}
