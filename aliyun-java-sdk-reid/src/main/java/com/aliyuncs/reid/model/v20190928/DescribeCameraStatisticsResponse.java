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

package com.aliyuncs.reid.model.v20190928;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.reid.transform.v20190928.DescribeCameraStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCameraStatisticsResponse extends AcsResponse {

	private String errorCode;

	private String errorMessage;

	private String message;

	private String code;

	private String dynamicCode;

	private String requestId;

	private Boolean success;

	private String dynamicMessage;

	private List<PvStatisticResult> pvStatisticResults;

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
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

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public List<PvStatisticResult> getPvStatisticResults() {
		return this.pvStatisticResults;
	}

	public void setPvStatisticResults(List<PvStatisticResult> pvStatisticResults) {
		this.pvStatisticResults = pvStatisticResults;
	}

	public static class PvStatisticResult {

		private Long processCursor;

		private Long ipcId;

		private Long pvCount;

		private Long locationId;

		private List<Rect> pvRects;

		public Long getProcessCursor() {
			return this.processCursor;
		}

		public void setProcessCursor(Long processCursor) {
			this.processCursor = processCursor;
		}

		public Long getIpcId() {
			return this.ipcId;
		}

		public void setIpcId(Long ipcId) {
			this.ipcId = ipcId;
		}

		public Long getPvCount() {
			return this.pvCount;
		}

		public void setPvCount(Long pvCount) {
			this.pvCount = pvCount;
		}

		public Long getLocationId() {
			return this.locationId;
		}

		public void setLocationId(Long locationId) {
			this.locationId = locationId;
		}

		public List<Rect> getPvRects() {
			return this.pvRects;
		}

		public void setPvRects(List<Rect> pvRects) {
			this.pvRects = pvRects;
		}

		public static class Rect {

			private Float right;

			private Float left;

			private Float top;

			private Float bottom;

			public Float getRight() {
				return this.right;
			}

			public void setRight(Float right) {
				this.right = right;
			}

			public Float getLeft() {
				return this.left;
			}

			public void setLeft(Float left) {
				this.left = left;
			}

			public Float getTop() {
				return this.top;
			}

			public void setTop(Float top) {
				this.top = top;
			}

			public Float getBottom() {
				return this.bottom;
			}

			public void setBottom(Float bottom) {
				this.bottom = bottom;
			}
		}
	}

	@Override
	public DescribeCameraStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCameraStatisticsResponseUnmarshaller.unmarshall(this, context);
	}
}
